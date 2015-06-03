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

import net.solarnetwork.support.XmlSupport;
import org.junit.After;
import org.junit.Before;
import org.mortbay.jetty.Server;
import org.springframework.util.xml.SimpleNamespaceContext;

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

	private Server httpServer;
	private XmlSupport xmlSupport;

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
	}

	@After
	public void teardown() throws Exception {
		httpServer.stop();
	}

	/**
	 * Get the HTTP server.
	 * 
	 * @return The server.
	 */
	public Server getHttpServer() {
		return httpServer;
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
