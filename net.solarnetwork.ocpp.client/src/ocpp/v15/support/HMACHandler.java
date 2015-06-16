/* ==================================================================
 * HMACHandler.java - 16/06/2015 9:33:08 am
 * 
 * Copyright 2007-2015 SolarNetwork.net Dev Team
 * 
 * This program is free software; you can redistribute it and/or 
 * modify it under the terms of the GNU General Public License as 
 * published by the Free Software Foundation; either version 2 of 
 * the License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful, 
 * but WITHOUT ANY WARRANTY; without even the implied warranty of 
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU 
 * General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License 
 * along with this program; if not, write to the Free Software 
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA 
 * 02111-1307 USA
 * ==================================================================
 */

package ocpp.v15.support;

import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.Set;
import java.util.TimeZone;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import javax.xml.namespace.QName;
import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPHeader;
import javax.xml.soap.SOAPHeaderElement;
import javax.xml.soap.SOAPMessage;
import javax.xml.soap.Text;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;
import org.apache.commons.codec.binary.Base64;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * {@link SOAPHandler} to generate a HMAC-SHA256 signature of a SOAP message.
 * 
 * <p>
 * This handler is designed to be integrated into both the client and server
 * side of an OCPP system. Both sides must be configured to use the same
 * {@code secret} value, which is the key used to generate a HMAC-SHA256 hash.
 * The Base64-encoded hash is added as the content of a new SOAP header element,
 * {@code Authentication}, and the system's reported current time is added as a
 * {@code ts} attribute to that element. For example:
 * </p>
 * 
 * <pre>
 * &lt;Authentication xmlns="urn://SolarNetwork/SolarNode/WS" ts="2015-01-01T12:00:00.000Z"&gt;doEIdjlsdkfjsopdifjso==&lt;/Authentication&gt;
 * </pre>
 * 
 * <p>
 * The encrypted HMAC message content is derived from the SOAP message itself,
 * and includes the following content, all delimited by a newline character (
 * {@code \n}):
 * </p>
 * 
 * <ol>
 * <li>The OCPP {@code chargePointIdentity} SOAP header value, or an empty
 * string if not available.</li>
 * <li>The current date, in ISO 8601 format in the UTC time zone.
 * <li>
 * <li>Top-level SOAP header elements, in DOM order.
 * <li>
 * <li>Recursive SOAP body elements, in DOM order, including the SOAP body
 * element itself.</li>
 * </ol>
 * 
 * <p>
 * The {@link #getMaximumTimeSkew()} value represents the maximum amount of time
 * difference allowed between the system's reported current time and the
 * 
 * @author matt
 * @version 1.0
 */
public class HMACHandler implements SOAPHandler<SOAPMessageContext> {

	public static final String SN_WS_NS = "urn://SolarNetwork/SolarNode/WS";
	public static final QName SN_WS_AUTH = new QName(SN_WS_NS, "Authentication");
	public static final String SN_WS_TIMESTAMP = "ts";
	public static final QName OCPP_CS_CHARGE_BOX_IDENTITY = new QName("urn://Ocpp/Cs/2012/06/",
			"chargeBoxIdentity");
	public static final QName OCPP_CP_CHARGE_BOX_IDENTITY = new QName("urn://Ocpp/Cp/2012/06/",
			"chargeBoxIdentity");

	public static final String DEFAULT_SECRET = "changeit";

	private String secret = DEFAULT_SECRET;
	private Mac hmac;
	private long maximumTimeSkew = 5 * 60 * 1000L; // 5 minutes

	private final Logger log = LoggerFactory.getLogger(getClass());

	@Override
	public boolean handleMessage(SOAPMessageContext context) {
		Boolean outboundProperty = (Boolean) context.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);
		if ( outboundProperty != null && outboundProperty.booleanValue() ) {
			try {
				addAuthenticationHeader(context);
			} catch ( SOAPException e ) {
				log.error("Error adding Authentication SOAP header", e);
			}
		} else {
			try {
				validateAuthenticationHeader(context);
			} catch ( SOAPException e ) {
				log.error("Error validating Authentication SOAP header", e);
			}
		}
		return true;
	}

	private Mac getHMAC() {
		Mac m = hmac;
		if ( m == null ) {
			try {
				m = Mac.getInstance("HmacSHA256");
				SecretKeySpec key = new SecretKeySpec(secret.getBytes(), "HmacSHA256");
				m.init(key);
				hmac = m;
			} catch ( NoSuchAlgorithmException e ) {
				throw new RuntimeException(e);
			} catch ( InvalidKeyException e ) {
				throw new RuntimeException(e);
			}
		}
		return m;
	}

	private DateFormat getTimestampDateFormat() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
		sdf.setTimeZone(TimeZone.getTimeZone("UTC"));
		return sdf;
	}

	private String getTimestampString(long time) {
		DateFormat sdf = getTimestampDateFormat();
		return sdf.format(new Date(time));
	}

	private void addAuthenticationHeader(SOAPMessageContext context) throws SOAPException {
		addAuthenticationHeader(context, System.currentTimeMillis());
	}

	private void addAuthenticationHeader(SOAPMessageContext context, final long date)
			throws SOAPException {
		SOAPMessage msg = context.getMessage();
		SOAPHeader head = msg.getSOAPHeader();

		SOAPElement auth = getAuthenticationHeader(head);
		String hashData = calculateHashData(context, date);
		String hash = hash(hashData);
		if ( auth == null ) {
			auth = head.addHeaderElement(SN_WS_AUTH);
		}
		auth.setTextContent(hash);
		if ( !auth.hasAttribute(SN_WS_TIMESTAMP) ) {
			auth.setAttribute(SN_WS_TIMESTAMP, getTimestampString(date));
		}
	}

	private String calculateHashData(final SOAPMessageContext context, final long date)
			throws SOAPException {
		SOAPMessage msg = context.getMessage();
		SOAPHeader head = msg.getSOAPHeader();
		SOAPBody body = msg.getSOAPBody();

		// our hash will be constructed out of the date, the headers, and the body
		final StringBuilder buf = new StringBuilder("\n"); // leading newline to handle chargeBoxIdentity value later

		final String ts = getTimestampString(date);
		buf.append(ts).append('\n');

		String cbIdent = null;

		for ( @SuppressWarnings("unchecked")
		Iterator<SOAPHeaderElement> itr = head.examineAllHeaderElements(); itr.hasNext(); ) {
			SOAPHeaderElement header = itr.next();
			QName headerName = header.getElementQName();
			String hashKey = headerName.toString(); // e.g. {nsURL}localName
			String hashValue = "";
			if ( WSAddressingFromHandler.WSA_NS.equals(headerName.getNamespaceURI()) ) {
				// if this element has a child Address element, use that content, otherwise this node's content
				SOAPElement addr = null;
				for ( @SuppressWarnings("unchecked")
				Iterator<SOAPElement> children = header
						.getChildElements(WSAddressingFromHandler.WSA_ADDRESS); children.hasNext(); ) {
					addr = children.next();
					break;
				}
				if ( addr != null ) {
					addr.normalize();
					hashValue = addr.getTextContent();
				} else {
					header.normalize();
					hashValue = header.getTextContent();
				}
			} else if ( SN_WS_AUTH.equals(headerName) ) {
				continue;
			} else {
				header.normalize();
				hashValue = header.getTextContent();
			}
			if ( cbIdent == null
					&& (OCPP_CS_CHARGE_BOX_IDENTITY.equals(headerName) || OCPP_CP_CHARGE_BOX_IDENTITY
							.equals(headerName)) ) {
				cbIdent = hashValue;
			}
			buf.append(hashKey).append('=').append(hashValue).append('\n');
		}
		appendHashData(body, buf);
		if ( cbIdent != null ) {
			buf.insert(0, cbIdent);
		}
		return buf.toString();
	}

	private SOAPElement getAuthenticationHeader(SOAPHeader head) throws SOAPException {
		SOAPElement auth = null;
		for ( Iterator<?> itr = head.getChildElements(SN_WS_AUTH); itr.hasNext(); ) {
			auth = (SOAPElement) itr.next();
			break;
		}
		return auth;
	}

	private void validateAuthenticationHeader(SOAPMessageContext context) throws SOAPException {
		SOAPMessage msg = context.getMessage();
		SOAPHeader head = msg.getSOAPHeader();

		SOAPElement auth = getAuthenticationHeader(head);
		if ( auth == null ) {
			// TODO: configurable property to 1) ignore or 2) throw exception. Now just ignore.
			return;
		}
		Date timestamp = null;
		try {
			timestamp = (Date) getTimestampDateFormat().parseObject(auth.getAttribute(SN_WS_TIMESTAMP));
		} catch ( ParseException e ) {
			throw new RuntimeException("Invalid date: " + e.getMessage());
		}
		final long skew = Math.abs(timestamp.getTime() - System.currentTimeMillis());
		if ( skew > maximumTimeSkew ) {
			throw new RuntimeException("Time skew too big: " + skew);
		}
		final String calculatedHashData = calculateHashData(context, timestamp.getTime());
		final String calculatedHash = hash(calculatedHashData);
		final String presentedHash = auth.getTextContent();
		if ( !calculatedHash.equals(presentedHash) ) {
			throw new RuntimeException("Invalid Authentication value");
		}
	}

	private String hash(String data) {
		log.debug("HMAC hash input:\n{}", data);
		Mac mac = getHMAC();
		byte[] hash;
		synchronized ( mac ) {
			mac.reset();
			hash = mac.doFinal(data.getBytes());
		}
		try {
			return new String(Base64.encodeBase64(hash, false), "US-ASCII");
		} catch ( UnsupportedEncodingException e ) {
			// should never get here
			throw new RuntimeException(e);
		}
	}

	private void appendHashData(SOAPElement root, StringBuilder buf) {
		QName name = root.getElementQName();
		for ( Iterator<?> itr = root.getChildElements(); itr.hasNext(); ) {
			Object o = itr.next();
			if ( o instanceof SOAPElement ) {
				buf.append(name.toString()).append('\n');
				appendHashData((SOAPElement) o, buf);
			} else if ( o instanceof Text ) {
				Text t = (Text) o;
				if ( t.isComment() ) {
					continue;
				}
				t.normalize();
				buf.append(name.toString()).append('=').append(t.getTextContent()).append('\n');
			}
		}
	}

	@Override
	public boolean handleFault(SOAPMessageContext context) {
		return true;
	}

	@Override
	public void close(MessageContext context) {
		// nadda
	}

	@Override
	public Set<QName> getHeaders() {
		return Collections.singleton(SN_WS_AUTH);
	}

	public void setSecret(String secret) {
		this.secret = secret;
		hmac = null;
	}

	public void setMaximumTimeSkew(long maximumTimeSkew) {
		this.maximumTimeSkew = maximumTimeSkew;
	}

	public long getMaximumTimeSkew() {
		return maximumTimeSkew;
	}

}
