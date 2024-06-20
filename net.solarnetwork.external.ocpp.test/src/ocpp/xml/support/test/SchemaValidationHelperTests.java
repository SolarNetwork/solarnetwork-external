/* ==================================================================
 * SchemaValidationHelperTests.java - 3/02/2020 2:13:19 pm
 *
 * Copyright 2020 SolarNetwork.net Dev Team
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

package ocpp.xml.support.test;

import static org.hamcrest.Matchers.notNullValue;
import static org.junit.Assert.assertThat;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.validation.Schema;
import org.junit.Test;
import ocpp.domain.SchemaValidationException;
import ocpp.v15.cp.ChargePointService;
import ocpp.v15.cs.BootNotificationRequest;
import ocpp.v15.cs.CentralSystemService;
import ocpp.v15.cs.ObjectFactory;
import ocpp.xml.support.SchemaValidationHelper;

/**
 * Test cases for the {@link SchemaValidationHelper} class.
 *
 * @author matt
 * @version 2.0
 */
public class SchemaValidationHelperTests {

	@Test
	public void extractChargePointSchemaFromWsdl() {
		Schema s = SchemaValidationHelper.schemaFromWsdl(
				"ocpp/v15/cp/ocpp_chargepointservice_1.5_final.wsdl",
				ChargePointService.class.getClassLoader());
		assertThat("Schema extracted", s, notNullValue());
	}

	@Test
	public void validateJaxbObjectFromWsdlSchema() throws Exception {
		// given
		Schema s = SchemaValidationHelper.schemaFromWsdl(
				"ocpp/v15/cs/ocpp_centralsystemservice_1.5_final.wsdl",
				CentralSystemService.class.getClassLoader());
		SchemaValidationHelper helper = new SchemaValidationHelper(s);
		JAXBContext ctx = JAXBContext.newInstance("ocpp.v15.cs",
				CentralSystemService.class.getClassLoader());

		// when
		BootNotificationRequest req = new BootNotificationRequest();
		req.setChargePointVendor("SolarNetwork");
		req.setChargePointModel("SolarNode");
		req.setChargePointSerialNumber("123");

		// OCPP WSDL schema does not provide @XmlRootElement annotations to objects, so have to wrap
		JAXBElement<BootNotificationRequest> reqDoc = new ObjectFactory()
				.createBootNotificationRequest(req);

		helper.validate(ctx, reqDoc);
	}

	@Test(expected = SchemaValidationException.class)
	public void validateJaxbObjectFromWsdlSchema_invalid() throws Exception {
		// given
		Schema s = SchemaValidationHelper.schemaFromWsdl(
				"ocpp/v15/cs/ocpp_centralsystemservice_1.5_final.wsdl",
				CentralSystemService.class.getClassLoader());
		SchemaValidationHelper helper = new SchemaValidationHelper(s);
		JAXBContext ctx = JAXBContext.newInstance("ocpp.v15.cs",
				CentralSystemService.class.getClassLoader());

		// when
		BootNotificationRequest req = new BootNotificationRequest();
		req.setChargePointVendor("SolarNetwork");
		req.setChargePointModel("SolarNode Model With A Gloriously Too Long Name");
		req.setChargePointSerialNumber("123");

		// OCPP WSDL schema does not provide @XmlRootElement annotations to objects, so have to wrap
		JAXBElement<BootNotificationRequest> reqDoc = new ObjectFactory()
				.createBootNotificationRequest(req);

		helper.validate(ctx, reqDoc);
	}

}
