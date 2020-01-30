/* ==================================================================
 * AbstractSOAPTestHandler.java - 4/06/2015 7:20:04 am
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

package ocpp.v15.test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import net.solarnetwork.support.XmlSupport;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 * Abstract HTTP handler for test SOAP messages.
 * 
 * @author matt
 * @version 1.0
 */
public abstract class AbstractSOAPTestHandler extends AbstractTestHandler {

	protected final XmlSupport xmlSupport;

	protected AbstractSOAPTestHandler(XmlSupport xmlSupport) {
		super();
		this.xmlSupport = xmlSupport;
	}

	@Override
	protected final boolean handleInternal(String target, HttpServletRequest request,
			HttpServletResponse response, int dispatch) throws Exception {
		assertTrue("Content-Type matches", request.getContentType().startsWith("application/soap+xml"));
		Document dom = xmlSupport.getDocBuilderFactory().newDocumentBuilder()
				.parse(request.getInputStream());
		assertNotNull("SOAP request", dom);

		XPathExpression xpath = xmlSupport.getXPathExpression("/S:Envelope/S:Header/*");
		NodeList soapHeaders = (NodeList) xpath.evaluate(dom.getDocumentElement(),
				XPathConstants.NODESET);

		xpath = xmlSupport.getXPathExpression("/S:Envelope/S:Body/*[1]");
		Node body = (Node) xpath.evaluate(dom.getDocumentElement(), XPathConstants.NODE);
		assertNotNull("SOAP request body available", body);
		return handleSOAP(target, request, response, dispatch, dom, soapHeaders, body);
	}

	/**
	 * Handle the SOAP request, with the SOAP message parsed into a Document
	 * already.
	 * 
	 * @param target
	 * @param request
	 * @param response
	 * @param dispatch
	 * @param soap
	 *        The entire SOAP message, as a {@link Document}.
	 * @param headers
	 *        Any SOAP header nodes.
	 * @param body
	 *        The SOAP body content.
	 * @return <em>true</em> if the request was handled successfully, and as
	 *         expected.
	 * @throws Exception
	 *         If any problem occurs.
	 */
	protected abstract boolean handleSOAP(String target, HttpServletRequest request,
			HttpServletResponse response, int dispatch, Document soap, NodeList headers, Node body)
			throws Exception;

}
