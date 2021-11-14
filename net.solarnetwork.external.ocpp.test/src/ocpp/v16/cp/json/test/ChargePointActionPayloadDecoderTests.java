/* ==================================================================
 * ChargePointActionPayloadDecoderTests.java - 3/02/2020 9:20:32 am
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

package ocpp.v16.cp.json.test;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.Assert.assertThat;
import java.io.IOException;
import org.junit.Before;
import org.junit.Test;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.util.StdDateFormat;
import com.fasterxml.jackson.module.jaxb.JaxbAnnotationModule;
import ocpp.domain.SchemaValidationException;
import ocpp.v16.ChargePointAction;
import ocpp.v16.cp.CancelReservationRequest;
import ocpp.v16.cp.CancelReservationResponse;
import ocpp.v16.cp.CancelReservationStatus;
import ocpp.v16.cp.json.ChargePointActionPayloadDecoder;

/**
 * Test cases for the {@link ChargePointActionPayloadDecoder} class.
 * 
 * @author matt
 * @version 1.0
 */
public class ChargePointActionPayloadDecoderTests {

	private ObjectMapper mapper;
	private ChargePointActionPayloadDecoder decoder;

	private ObjectMapper createObjectMapper() {
		ObjectMapper mapper = new ObjectMapper();
		mapper.registerModule(new JaxbAnnotationModule());
		mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
		mapper.setDateFormat(new StdDateFormat().withColonInTimeZone(true));
		return mapper;
	}

	private JsonNode treeForResource(String resource) {
		try {
			return mapper.readTree(getClass().getResourceAsStream(resource));
		} catch ( IOException e ) {
			throw new RuntimeException(e);
		}
	}

	@Before
	public void setup() {
		mapper = createObjectMapper();
		decoder = new ChargePointActionPayloadDecoder();
	}

	@Test
	public void decodeCancelReservationRequest() throws IOException {
		JsonNode json = treeForResource("cancelreservation-req-01.json");
		CancelReservationRequest result = decoder
				.decodeActionPayload(ChargePointAction.CancelReservation, false, json);
		assertThat("Result decoded", result, notNullValue());
		assertThat("IdTag", result.getReservationId(), equalTo(123456));
	}

	@Test(expected = SchemaValidationException.class)
	public void decodeCancelReservationRequest_invalid() throws IOException {
		JsonNode json = treeForResource("cancelreservation-req-02.json");
		decoder.decodeActionPayload(ChargePointAction.CancelReservation, false, json);
	}

	@Test
	public void decodeCancelReservationResponse() throws IOException {
		JsonNode json = treeForResource("cancelreservation-res-01.json");
		CancelReservationResponse result = decoder
				.decodeActionPayload(ChargePointAction.CancelReservation, true, json);
		assertThat("Result decoded", result, notNullValue());
		assertThat("Status", result.getStatus(), equalTo(CancelReservationStatus.ACCEPTED));
	}

	@Test(expected = SchemaValidationException.class)
	public void decodeCancelReservationResponse_invalid() throws IOException {
		JsonNode json = treeForResource("cancelreservation-res-02.json");
		decoder.decodeActionPayload(ChargePointAction.CancelReservation, true, json);
	}

	// TODO: other actions

}
