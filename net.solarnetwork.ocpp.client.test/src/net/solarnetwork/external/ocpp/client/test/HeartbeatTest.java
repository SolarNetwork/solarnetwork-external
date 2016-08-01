/* ==================================================================
 * HeartbeatTest.java - 3/06/2015 2:17:43 pm
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
import java.io.PrintWriter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.datatype.XMLGregorianCalendar;
import ocpp.v15.cs.CentralSystemService;
import ocpp.v15.cs.HeartbeatRequest;
import ocpp.v15.cs.HeartbeatResponse;
import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 * Test the Heartbeat endpoint.
 * 
 * @author matt
 * @version 1.0
 */
public class HeartbeatTest extends AbstractClientEndpointTest {

	@Test
	public void callService() throws Exception {
		AbstractSOAPTestHandler handler = new AbstractSOAPTestHandler(getXmlSupport()) {

			@Override
			protected boolean handleSOAP(String target, HttpServletRequest request,
					HttpServletResponse response, int dispatch, Document soap, NodeList headers,
					Node body) throws Exception {
				assertEquals("POST", request.getMethod());
				assertEquals("Client ident", TEST_CHARGE_POINT_IDENTITY,
						getChargeBoxIdentityHeader(headers));
				assertEquals("Heartbeat request", "heartbeatRequest", body.getLocalName());

				response.setContentType("application/soap+xml");
				PrintWriter out = response.getWriter();
				respondWithSoapBody(
						out,
						"<heartbeatResponse xmlns=\"urn://Ocpp/Cs/2012/06/\"><currentTime>2015-06-03T15:00:00.000+00:12</currentTime></heartbeatResponse>");
				out.flush();
				response.flushBuffer();
				return true;
			}

		};
		getHttpServer().addHandler(handler);

		CentralSystemService client = getCentralSystem();

		HeartbeatRequest req = new HeartbeatRequest();
		HeartbeatResponse res = client.heartbeat(req, TEST_CHARGE_POINT_IDENTITY);
		assertNotNull("Response should not be null", res);

		XMLGregorianCalendar resultTimestamp = res.getCurrentTime();
		assertNotNull("Response date should be set", resultTimestamp);
		assertEquals("Response date", "2015-06-03T15:00:00.000+00:12", resultTimestamp.toXMLFormat());
	}

}
