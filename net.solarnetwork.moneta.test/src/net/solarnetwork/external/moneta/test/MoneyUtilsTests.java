/* ==================================================================
 * MoneyUtilsTests.java - 28/08/2017 7:22:12 PM
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

package net.solarnetwork.external.moneta.test;

import static org.hamcrest.Matchers.anyOf;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;
import java.math.BigDecimal;
import java.util.Locale;
import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Test;
import net.solarnetwork.javax.money.MoneyUtils;

/**
 * Test cases for the {@link MoneyUtils} class.
 * 
 * @author matt
 * @version 1.0
 */
public class MoneyUtilsTests {

	@Before
	public void setup() {
		MoneyUtils.bootstrap();
	}

	@Test
	public void formatWithSymbolCurrencyNZ_NZD() {
		Locale locale = new Locale("en", "NZ");
		String result = MoneyUtils.formattedMoneyAmountFormatWithSymbolCurrencyStyle(locale, "NZD",
				new BigDecimal("1.99"));
		assertThat(result, Matchers.equalTo("$1.99"));
	}

	@Test
	public void formatWithSymbolCurrencyUS_NZD() {
		Locale locale = new Locale("en", "US");
		String result = MoneyUtils.formattedMoneyAmountFormatWithSymbolCurrencyStyle(locale, "NZD",
				new BigDecimal("1.99"));
		assertThat(result, anyOf(equalTo("NZD1.99"), equalTo("NZ$1.99")));
	}

	@Test
	public void formatWithSymbolCurrencyUS_USD() {
		Locale locale = new Locale("en", "US");
		String result = MoneyUtils.formattedMoneyAmountFormatWithSymbolCurrencyStyle(locale, "USD",
				new BigDecimal("1.99"));
		assertThat(result, equalTo("$1.99"));
	}

	@Test
	public void formatWithSymbolCurrencyDE_USD() {
		Locale locale = new Locale("de", "DE");
		String result = MoneyUtils.formattedMoneyAmountFormatWithSymbolCurrencyStyle(locale, "USD",
				new BigDecimal("1.99"));
		assertThat(result, anyOf(equalTo("1,99 USD"), equalTo("1,99 $")));
	}
}
