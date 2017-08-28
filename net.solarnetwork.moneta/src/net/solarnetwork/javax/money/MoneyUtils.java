/* ==================================================================
 * MoneyUtils.java - 28/08/2017 5:27:14 PM
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

package net.solarnetwork.javax.money;

import java.math.BigDecimal;
import java.util.Locale;
import javax.money.Monetary;
import javax.money.MonetaryAmount;
import javax.money.MonetaryAmountFactory;
import javax.money.format.AmountFormatQuery;
import javax.money.format.MonetaryAmountFormat;
import javax.money.format.MonetaryFormats;
import javax.money.spi.Bootstrap;
import net.solarnetwork.javax.money.internal.ClassLoaderServiceProvider;
import net.solarnetwork.javax.money.internal.MonetaUtils;

/**
 * Utilities for helping with {@code javax.money}.
 * 
 * @author matt
 * @version 1.0
 */
public final class MoneyUtils {

	private MoneyUtils() {
		// don't construct me
	}

	/**
	 * Invoke the {@link Bootstrap#init(javax.money.spi.ServiceProvider)} method
	 * with the internal {@link ClassLoaderServiceProvider}.
	 * 
	 * <p>
	 * This is called automatically when deployed in an OSGi runtime. Outside
	 * OSGi this method can be called to ensure the {@code javax.money} runtime
	 * uses the same {@code ServiceProvider} as under OSGi.
	 * </p>
	 */
	public static void bootstrap() {
		Bootstrap.init(new ClassLoaderServiceProvider(MoneyUtils.class.getClassLoader()));
	}

	/**
	 * Get a monetary amount format that uses currency symbols.
	 * 
	 * @param locale
	 *        the desired locale of the format
	 * @return the format
	 */
	public static MonetaryAmountFormat moneyAmountFormatWithSymbolCurrencyStyle(Locale locale) {
		AmountFormatQuery afq = MonetaUtils.ofSymbolCurrencyStyle(locale).build();
		return MonetaryFormats.getAmountFormat(afq);
	}

	/**
	 * Format a value as a monetary amount, using a currency symbol style.
	 * 
	 * @param locale
	 *        the desired locale of the format
	 * @param currencyCode
	 *        the currency code
	 * @param value
	 *        the value to format
	 * @return the formatted value
	 */
	public static String formattedMoneyAmountFormatWithSymbolCurrencyStyle(Locale locale,
			String currencyCode, BigDecimal value) {
		MonetaryAmountFormat format = moneyAmountFormatWithSymbolCurrencyStyle(locale);
		MonetaryAmountFactory<?> f = Monetary.getDefaultAmountFactory();
		MonetaryAmount amount = f.setCurrency(currencyCode).setNumber(value).create();
		return format.format(amount);
	}

}
