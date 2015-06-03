/* ==================================================================
 * AbstractClientEndpointTest.java - 3/06/2015 2:22:42 pm
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

import javax.xml.ws.BindingProvider;
import net.solarnetwork.support.XmlSupport;
import ocpp.v15.CentralSystemService;
import ocpp.v15.CentralSystemService_Service;
import org.junit.After;
import org.junit.Before;
import org.mortbay.jetty.Server;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.xml.SimpleNamespaceContext;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 * Abstract class for supporting client endpoint tests.
 * 
 * @author matt
 * @version 1.0
 */
public abstract class AbstractClientEndpointTest {

	public static final int HTTP_PORT = 8888;
	public static final String SOAP_ENV_NS_PREFIX = "S";
	public static final String SOAP_ENV_NS = "http://www.w3.org/2003/05/soap-envelope";
	public static final String OCPP_NS_PREFIX = "o";
	public static final String OCPP_NS = "urn://Ocpp/Cs/2012/06/";
	public static final String TEST_CHARGE_POINT_IDENTITY = "test.cp";

	private Server httpServer;
	private XmlSupport xmlSupport;
	private CentralSystemService centralSystem;

	protected final Logger log = LoggerFactory.getLogger(getClass());

	@Before
	public void setup() throws Exception {
		httpServer = new Server(HTTP_PORT);
		httpServer.start();

		xmlSupport = new XmlSupport();
		SimpleNamespaceContext nsContext = new SimpleNamespaceContext();
		//nsContext.bindDefaultNamespaceUri(OCPP_NS);
		nsContext.bindNamespaceUri(SOAP_ENV_NS_PREFIX, SOAP_ENV_NS);
		nsContext.bindNamespaceUri(OCPP_NS_PREFIX, OCPP_NS);
		xmlSupport.setNsContext(nsContext);

		CentralSystemService client = new CentralSystemService_Service().getCentralSystemServiceSoap12();
		String endpointURL = getHttpServerAbsoluteURLPath("/ocpp");
		((BindingProvider) client).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY,
				endpointURL);
		centralSystem = client;
	}

	@After
	public void teardown() throws Exception {
		httpServer.stop();
	}

	/**
	 * Get the first available {@code chargePointIdentity} value from a list of
	 * nodes.
	 * 
	 * @param soapHeaders
	 *        The node list to search (may be <em>null</em>).
	 * @return The first available {@code chargeBoxIdentity} element value, or
	 *         <em>null</em> if not found.
	 */
	protected String getChargeBoxIdentityHeader(NodeList soapHeaders) {
		if ( soapHeaders == null || soapHeaders.getLength() < 1 ) {
			return null;
		}
		for ( int i = 0; i < soapHeaders.getLength(); i++ ) {
			Node n = soapHeaders.item(i);
			if ( "chargeBoxIdentity".equals(n.getLocalName())
					&& (n.getNamespaceURI() == null || OCPP_NS.equals(n.getNamespaceURI())) ) {
				return n.getTextContent();
			}
		}
		return null;
	}

	/**
	 * Get the HTTP server.
	 * 
	 * @return The server.
	 */
	protected Server getHttpServer() {
		return httpServer;
	}

	/**
	 * Get the configured {@link CentralSystemService}.
	 * 
	 * @return The central system service.
	 */
	protected CentralSystemService getCentralSystem() {
		return centralSystem;
	}

	public void setCentralSystem(CentralSystemService centralSystem) {
		this.centralSystem = centralSystem;
	}

	protected String getHttpServerAbsoluteURLPath(String path) {
		return "http://localhost:" + HTTP_PORT + path;
	}

	public static int getHttpPort() {
		return HTTP_PORT;
	}

	public XmlSupport getXmlSupport() {
		return xmlSupport;
	}

}
