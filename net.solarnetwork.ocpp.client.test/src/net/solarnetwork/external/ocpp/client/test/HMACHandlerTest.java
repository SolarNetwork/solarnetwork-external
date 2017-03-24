/* ==================================================================
 * HMACHandlerTest.java - 25/03/2017 8:24:04 AM
 * 
 * Copyright 2007-2017 SolarNetwork.net Dev Team
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

package net.solarnetwork.external.ocpp.client.test;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.Map;
import java.util.TimeZone;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import javax.xml.soap.MessageFactory;
import javax.xml.soap.MimeHeaders;
import javax.xml.soap.SOAPConstants;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPMessage;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPMessageContext;
import org.apache.commons.codec.binary.Base64;
import org.easymock.EasyMock;
import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.FileCopyUtils;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import ocpp.v15.support.HMACHandler;

/**
 * Test cases for the {@link HMACHandler} class.
 * 
 * @author matt
 * @version 1.0
 */
public class HMACHandlerTest {

	private static final String TEST_SECRET = "foobar";

	private final Logger log = LoggerFactory.getLogger(getClass());

	private SOAPMessage getSOAPMessageForResource(String resource) throws SOAPException, IOException {
		MessageFactory factory = MessageFactory.newInstance(SOAPConstants.SOAP_1_2_PROTOCOL);
		InputStream in = getClass().getResourceAsStream(resource);
		return factory.createMessage(new MimeHeaders(), in);
	}

	private Mac createHMAC() {
		Mac m;
		try {
			m = Mac.getInstance("HmacSHA256");
			SecretKeySpec key = new SecretKeySpec(TEST_SECRET.getBytes(), "HmacSHA256");
			m.init(key);
		} catch ( NoSuchAlgorithmException e ) {
			throw new RuntimeException(e);
		} catch ( InvalidKeyException e ) {
			throw new RuntimeException(e);
		}
		return m;
	}

	private String hash(String data) {
		Mac mac = createHMAC();
		byte[] hash = mac.doFinal(data.getBytes());
		try {
			return new String(Base64.encodeBase64(hash, false), "US-ASCII");
		} catch ( UnsupportedEncodingException e ) {
			// should never get here
			throw new RuntimeException(e);
		}
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

	private String digestForResource(String resource, Map<String, String> props) throws IOException {
		String txt = FileCopyUtils
				.copyToString(new InputStreamReader(getClass().getResourceAsStream(resource), "UTF-8"));
		if ( props != null ) {
			for ( Map.Entry<String, String> me : props.entrySet() ) {
				txt = txt.replaceAll("\\$\\{" + me.getKey() + "\\}", me.getValue());
			}
		}
		log.debug("Test hash data: \n{}", txt);
		return hash(txt);
	}

	@Test
	public void generateHeader() throws Exception {
		SOAPMessage msg = getSOAPMessageForResource("soap-msg-01.xml");
		SOAPMessageContext ctx = EasyMock.createMock(SOAPMessageContext.class);
		EasyMock.expect(ctx.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY)).andReturn(Boolean.TRUE);
		EasyMock.expect(ctx.getMessage()).andReturn(msg).anyTimes();
		EasyMock.replay(ctx);

		HMACHandler handler = new HMACHandler();
		handler.setSecret(TEST_SECRET);

		boolean result = handler.handleMessage(ctx);
		Assert.assertTrue(result);

		NodeList list = msg.getSOAPHeader().getElementsByTagNameNS(
				HMACHandler.SN_WS_AUTH.getNamespaceURI(), HMACHandler.SN_WS_AUTH.getLocalPart());
		Assert.assertEquals("Should have generated the Authorization header", 1, list.getLength());
		Element authEl = (Element) list.item(0);
		String generatedTs = authEl.getAttribute("ts");
		String generatedDigest = authEl.getTextContent();
		String expectedDigest = digestForResource("soap-msg-01.auth.txt",
				Collections.singletonMap("date", generatedTs));
		Assert.assertEquals("Authorization digest", expectedDigest, generatedDigest);

		EasyMock.verify(ctx);
	}

}
