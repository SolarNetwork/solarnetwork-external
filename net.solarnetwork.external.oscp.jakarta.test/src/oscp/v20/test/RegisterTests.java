/* ==================================================================
 * RegisterTests.java - 26/07/2022 9:50:39 am
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

import static java.lang.String.format;
import static java.util.Arrays.asList;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import java.io.IOException;
import org.junit.Before;
import org.junit.Test;
import com.fasterxml.jackson.databind.ObjectMapper;
import oscp.v20.Register;
import oscp.v20.VersionUrl;

/**
 * Test cases for the {@link Register} class.
 * 
 * @author matt
 * @version 1.0
 */
public class RegisterTests {

	private ObjectMapper mapper;

	@Before
	public void setup() {
		mapper = new ObjectMapper();
	}

	@Test
	public void toJson() throws IOException {
		// GIVEN
		VersionUrl vurl = new VersionUrl("2.0", "https://oscp.example.com/cp/2.0");
		Register r = new Register("abc123", asList(vurl));

		// WHEN
		String json = mapper.writeValueAsString(r);

		// THEN
		assertThat("JSON created", json,
				is(equalTo(format(
						"{\"token\":\"%s\",\"version_url\":[{\"version\":\"%s\",\"base_url\":\"%s\"}]}",
						r.getToken(), vurl.getVersion(), vurl.getBaseUrl()))));
	}

}
