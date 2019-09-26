/* ==================================================================
 * IndriyaMeasurementServiceProvider.java - 26/09/2019 1:32:19 pm
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

package net.solarnetwork.external.indriya;

import javax.measure.Quantity;
import javax.measure.Unit;
import javax.measure.spi.ServiceProvider;
import net.solarnetwork.javax.measure.DelegateMeasurementServiceProvider;
import net.solarnetwork.javax.measure.MeasurementServiceProvider;
import tech.units.indriya.quantity.Quantities;

/**
 * Indriya implementation of {@link MeasurementServiceProvider}.
 * 
 * @author matt
 * @version 1.0
 */
public class IndriyaMeasurementServiceProvider extends DelegateMeasurementServiceProvider {

	/**
	 * Constructor.
	 * 
	 * @param delegate
	 *        the delgate
	 */
	public IndriyaMeasurementServiceProvider(ServiceProvider delegate) {
		super(delegate);
	}

	@Override
	public <Q extends Quantity<Q>> Quantity<Q> quantityForUnit(Number value, Unit<Q> unit) {
		return Quantities.getQuantity(value, unit);
	}

}
