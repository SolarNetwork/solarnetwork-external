/* ==================================================================
 * MeasurementServiceProvider.java - 14/09/2019 8:57:58 pm
 * 
 * Copyright 2019 SolarNetwork.net Dev Team
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

package net.solarnetwork.javax.measure;

import javax.measure.Quantity;
import javax.measure.format.QuantityFormat;
import javax.measure.format.UnitFormat;
import javax.measure.spi.FormatService;
import javax.measure.spi.QuantityFactory;
import javax.measure.spi.SystemOfUnits;
import javax.measure.spi.SystemOfUnitsService;

/**
 * API for interacting with Units of Measurement services.
 * 
 * @author matt
 * @version 1.0
 */
public interface MeasurementServiceProvider {

	/**
	 * Returns the service to obtain a {@link SystemOfUnits}, or {@code null} if
	 * none.
	 *
	 * @return the service to obtain a {@link SystemOfUnits}, or {@code null}.
	 */
	SystemOfUnitsService getSystemOfUnitsService();

	/**
	 * Returns the service to obtain {@link UnitFormat} and
	 * {@link QuantityFormat} or {@code null} if none.
	 *
	 * @return the service to obtain a {@link UnitFormat} and
	 *         {@link QuantityFormat}, or {@code null}.
	 */
	FormatService getFormatService();

	/**
	 * Returns a factory for the given {@link Quantity} type.
	 *
	 * @param <Q>
	 *        the type of the {@link Quantity} instances created by the factory
	 * @param quantity
	 *        the quantity type
	 * @return the {@link QuantityFactory} for the given type
	 */
	<Q extends Quantity<Q>> QuantityFactory<Q> getQuantityFactory(Class<Q> quantity);

}
