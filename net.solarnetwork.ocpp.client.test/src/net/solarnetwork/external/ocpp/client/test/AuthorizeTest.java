/* ==================================================================
 * AuthorizeTest.java - 4/06/2015 7:07:33 am
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

package net.solarnetwork.external.ocpp.client.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import ocpp.v15.AuthorizationStatus;
import ocpp.v15.AuthorizeRequest;
import ocpp.v15.AuthorizeResponse;
import ocpp.v15.CentralSystemService;
import ocpp.v15.IdTagInfo;
import org.junit.Test;
import org.springframework.util.FileCopyUtils;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 * Test the Authorize endpoint.
 * 
 * @author matt
 * @version 1.0
 */
public class AuthorizeTest extends AbstractClientEndpointTest {

	@Test
	public void authorize() {
		AbstractSOAPTestHandler handler = new AbstractSOAPTestHandler(getXmlSupport()) {

			@Override
			protected boolean handleSOAP(String target, HttpServletRequest request,
					HttpServletResponse response, int dispatch, Document soap, NodeList headers,
					Node body) throws Exception {
				assertEquals("POST", request.getMethod());
				assertEquals("Client ident", TEST_CHARGE_POINT_IDENTITY,
						getChargeBoxIdentityHeader(headers));
				assertEquals("Authorize request", "authorizeRequest", body.getLocalName());

				response.setContentType("application/soap+xml");
				PrintWriter out = response.getWriter();
				String authorizeResponse = FileCopyUtils.copyToString(new InputStreamReader(getClass()
						.getResourceAsStream("authorize-req.xml"), "UTF-8"));
				respondWithSoapBody(out, authorizeResponse);
				out.flush();
				response.flushBuffer();
				return true;
			}

		};
		getHttpServer().addHandler(handler);

		CentralSystemService client = getCentralSystem();

		AuthorizeRequest req = new AuthorizeRequest();
		AuthorizeResponse res = client.authorize(req, TEST_CHARGE_POINT_IDENTITY);
		assertNotNull("Response should not be null", res);

		IdTagInfo idTag = res.getIdTagInfo();
		assertNotNull("IdTagInfo should be set", idTag);
		assertNotNull("Expiry date should be set", idTag.getExpiryDate());
		assertEquals("Response date", "2015-06-03T15:00:00.000+00:12", idTag.getExpiryDate()
				.toXMLFormat());
		assertEquals("Auth status", AuthorizationStatus.ACCEPTED, idTag.getStatus());
		assertEquals("Parent IdTag", "01234567890123456789", idTag.getParentIdTag());
	}

}
