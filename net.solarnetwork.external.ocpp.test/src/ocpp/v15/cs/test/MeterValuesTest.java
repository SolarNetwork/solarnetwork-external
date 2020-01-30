/* ==================================================================
 * MeterValuesTest.java - 8/06/2017 10:43:50 AM
 * 
 * Copyright 2017 SolarNetwork.net Dev Team
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

package ocpp.v15.cs.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import org.junit.Before;
import org.junit.Test;
import org.springframework.util.FileCopyUtils;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import ocpp.v15.cs.CentralSystemService;
import ocpp.v15.cs.MeterValue;
import ocpp.v15.cs.MeterValue.Value;
import ocpp.v15.test.AbstractClientEndpointTest;
import ocpp.v15.test.AbstractSOAPTestHandler;
import ocpp.v15.cs.MeterValuesRequest;
import ocpp.v15.cs.MeterValuesResponse;
import ocpp.v15.cs.ReadingContext;
import ocpp.v15.cs.UnitOfMeasure;

/**
 * Test case for posting meter values.
 * 
 * @author matt
 * @version 1.0
 */
public class MeterValuesTest extends AbstractClientEndpointTest {

	private GregorianCalendar utcCalendar;
	private DatatypeFactory datatypeFactory;

	@Before
	public void setupCalendar() {
		utcCalendar = new GregorianCalendar(TimeZone.getTimeZone("UTC"));
		try {
			datatypeFactory = DatatypeFactory.newInstance();
		} catch ( DatatypeConfigurationException e ) {
			throw new RuntimeException(e);
		}
	}

	protected final XMLGregorianCalendar newXmlCalendar(long date) {
		GregorianCalendar now = (GregorianCalendar) utcCalendar.clone();
		now.setTimeInMillis(date);
		return datatypeFactory.newXMLGregorianCalendar(now);
	}

	@Test
	public void meterValues() {
		final long now = System.currentTimeMillis();

		AbstractSOAPTestHandler handler = new AbstractSOAPTestHandler(getXmlSupport()) {

			@Override
			protected boolean handleSOAP(String target, HttpServletRequest request,
					HttpServletResponse response, int dispatch, Document soap, NodeList headers,
					Node body) throws Exception {
				assertEquals("POST", request.getMethod());
				assertEquals("Client ident", TEST_CHARGE_POINT_IDENTITY,
						getChargeBoxIdentityHeader(headers));
				assertEquals("MeterValues request", "meterValuesRequest", body.getLocalName());

				NodeList list = body.getChildNodes();
				assertEquals("meterValuesRequest children", 3, list.getLength());

				Node node = list.item(2);
				assertEquals("values elemennt", "values", node.getLocalName());

				list = node.getChildNodes();
				assertEquals("values children", 2, list.getLength());

				node = list.item(0);
				assertEquals("timestamp elemennt", "timestamp", node.getLocalName());

				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
				sdf.setTimeZone(TimeZone.getTimeZone("UTC"));
				assertEquals("timestamp value", sdf.format(new Date(now)), node.getTextContent());

				response.setContentType("application/soap+xml");
				PrintWriter out = response.getWriter();
				String authorizeResponse = FileCopyUtils.copyToString(new InputStreamReader(
						getClass().getResourceAsStream("meter-values-res.xml"), "UTF-8"));
				respondWithSoapBody(out, authorizeResponse);
				out.flush();
				response.flushBuffer();
				return true;
			}

		};
		getHttpServer().addHandler(handler);

		CentralSystemService client = getCentralSystem();

		MeterValuesRequest req = new MeterValuesRequest();
		req.setConnectorId(1);
		req.setTransactionId(2);

		MeterValue meterValue = new MeterValue();
		req.getValues().add(meterValue);
		meterValue.setTimestamp(newXmlCalendar(now));

		Value value = new Value();
		value.setContext(ReadingContext.SAMPLE_PERIODIC);
		value.setUnit(UnitOfMeasure.K_WH);
		value.setValue("12345");
		meterValue.getValue().add(value);

		MeterValuesResponse res = client.meterValues(req, TEST_CHARGE_POINT_IDENTITY);
		assertNotNull("Response should not be null", res);
	}

}
