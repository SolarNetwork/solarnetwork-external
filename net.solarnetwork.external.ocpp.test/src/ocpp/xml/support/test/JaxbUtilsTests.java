/* ==================================================================
 * JaxbUtilsTests.java - 4/02/2020 11:58:33 am
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

import static org.junit.Assert.assertThat;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import org.hamcrest.Matchers;
import org.junit.Test;
import ocpp.v16.cs.ObjectFactory;
import ocpp.xml.support.JaxbUtils;

/**
 * Test cases for the {@link JaxbUtils} class.
 * 
 * @author matt
 * @version 1.0
 */
public class JaxbUtilsTests {

	@Test
	public void jaxbContextForObjectFactory_v16_cs() throws JAXBException {
		JAXBContext ctx = JaxbUtils.jaxbContextForRegistry(ObjectFactory.class);
		assertThat("Context created", ctx, Matchers.notNullValue());
	}

}
