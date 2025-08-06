/* ==================================================================
 * HeartbeatTests.java - 21/08/2022 1:32:13 pm
 * 
 * Copyright 2022 SolarNetwork.net Dev Team
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

package oscp.v20.test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import java.io.IOException;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import org.junit.Before;
import org.junit.Test;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import oscp.v20.Heartbeat;

/**
 * Test cases for the {@link Heartbeat} class.
 * 
 * @author matt
 * @version 1.0
 */
public class HeartbeatTests {

	private ObjectMapper mapper;

	@Before
	public void setup() {
		mapper = new ObjectMapper();
		mapper.registerModule(new JavaTimeModule());
	}

	@Test
	public void fromJson() throws IOException {
		// GIVEN
		String json = "{\"offline_mode_at\":\"2022-08-21T13:36:24.491Z\"}";

		// WHEN
		Heartbeat result = mapper.readValue(json, Heartbeat.class);

		// THEN
		Instant expected = LocalDateTime.of(2022, 8, 21, 13, 36, 24, 491000000)
				.toInstant(ZoneOffset.UTC);
		assertThat("Parsed offline mode", result.getOfflineModeAt(), is(equalTo(expected)));
	}

	@Test
	public void fromJson_noMilliseconds() throws IOException {
		// GIVEN
		String json = "{\"offline_mode_at\":\"2022-08-21T13:36:24Z\"}";

		// WHEN
		Heartbeat result = mapper.readValue(json, Heartbeat.class);

		// THEN
		Instant expected = LocalDateTime.of(2022, 8, 21, 13, 36, 24).toInstant(ZoneOffset.UTC);
		assertThat("Parsed offline mode without milliseconds", result.getOfflineModeAt(),
				is(equalTo(expected)));
	}

}
