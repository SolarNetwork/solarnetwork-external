/* ==================================================================
 * Activator.java - 14/09/2019 3:38:13 PM
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

package net.solarnetwork.external.indriya.osgi;

import java.util.Hashtable;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.Constants;
import org.osgi.framework.ServiceRegistration;
import net.solarnetwork.javax.measure.DelegateMeasurementServiceProvider;
import net.solarnetwork.javax.measure.MeasurementServiceProvider;
import tech.units.indriya.spi.DefaultServiceProvider;

/**
 * OSGi bundle activator.
 * 
 * <p>
 * This activator will register a {@link MeasurementServiceProvider} when
 * started.
 * </p>
 * 
 * @author matt
 * @version 1.0
 */
public class Activator implements BundleActivator {

	private ServiceRegistration<MeasurementServiceProvider> serviceProviderReg = null;

	@Override
	public void start(BundleContext bundleContext) throws Exception {
		Hashtable<String, Object> properties = new Hashtable<>();
		properties.put(Constants.SERVICE_VENDOR, "Indriya");
		MeasurementServiceProvider s = new DelegateMeasurementServiceProvider(
				new DefaultServiceProvider());
		serviceProviderReg = bundleContext.registerService(MeasurementServiceProvider.class, s,
				properties);
	}

	@Override
	public void stop(BundleContext bundleContext) throws Exception {
		if ( serviceProviderReg != null ) {
			serviceProviderReg.unregister();
			serviceProviderReg = null;
		}
	}

}
