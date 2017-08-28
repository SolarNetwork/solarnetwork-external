/* ==================================================================
 * MonetaUtils.java - 28/08/2017 5:28:15 PM
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

package net.solarnetwork.javax.money.internal;

import java.util.Locale;
import javax.money.format.AmountFormatQueryBuilder;
import org.javamoney.moneta.format.CurrencyStyle;

/**
 * Utilities specific to the Moneta implementation of {@code javax.money}.
 * 
 * @author matt
 * @version 1.0
 */
public final class MonetaUtils {

	private MonetaUtils() {
		// don't construct me
	}

	/**
	 * Get a amount format query builder that uses currency symbols.
	 * 
	 * <p>
	 * This method exists because Moneta requires an implementation-specific
	 * {@link CurrencySymbol} class to get the desired format.
	 * </p>
	 * 
	 * @param locale
	 *        the desired locale of the builder
	 * @return the builder
	 * @see https://github.com/JavaMoney/javamoney-examples/issues/25
	 */
	public static AmountFormatQueryBuilder ofSymbolCurrencyStyle(Locale locale) {
		return AmountFormatQueryBuilder.of(locale).set(CurrencyStyle.SYMBOL);
	}

}
