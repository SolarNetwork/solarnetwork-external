/* ==================================================================
 * DelegateMeasurementServiceProvider.java - 14/09/2019 9:04:04 pm
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
import javax.measure.spi.FormatService;
import javax.measure.spi.QuantityFactory;
import javax.measure.spi.ServiceProvider;
import javax.measure.spi.SystemOfUnitsService;
import javax.measure.spi.UnitFormatService;

/**
 * Implementation of {@link MeasurementServiceProvider} that delgates to a
 * {@link ServiceProvider}.
 * 
 * @author matt
 * @version 1.0
 */
public abstract class DelegateMeasurementServiceProvider implements MeasurementServiceProvider {

	private final ServiceProvider delegate;

	/**
	 * Constructor.
	 * 
	 * @param delegate
	 *        the delegate
	 * @throws IllegalArgumentException
	 *         if {@code delegate} is {@literal null}
	 */
	public DelegateMeasurementServiceProvider(ServiceProvider delegate) {
		super();
		if ( delegate == null ) {
			throw new IllegalArgumentException("ServiceProvider must not be null.");
		}
		this.delegate = delegate;
	}

	@Override
	public SystemOfUnitsService getSystemOfUnitsService() {
		return delegate.getSystemOfUnitsService();
	}

	@Override
	public FormatService getFormatService() {
		return delegate.getFormatService();
	}

	@SuppressWarnings("deprecation")
	@Override
	public UnitFormatService getUnitFormatService() {
		return delegate.getUnitFormatService();
	}

	@Override
	public <Q extends Quantity<Q>> QuantityFactory<Q> getQuantityFactory(Class<Q> quantity) {
		return delegate.getQuantityFactory(quantity);
	}

}
