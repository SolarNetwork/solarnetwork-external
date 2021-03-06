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

import java.util.ArrayList;
import java.util.Collection;
import java.util.Hashtable;
import java.util.Iterator;
import javax.measure.spi.ServiceProvider;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.Constants;
import org.osgi.framework.ServiceRegistration;
import net.solarnetwork.external.indriya.IndriyaMeasurementServiceProvider;
import net.solarnetwork.javax.measure.MeasurementServiceProvider;
import si.uom.SIServiceProvider;
import systems.uom.common.spi.CommonServiceProvider;
import systems.uom.ucum.spi.UCUMServiceProvider;
import systems.uom.unicode.spi.UnicodeServiceProvider;
import tech.units.indriya.spi.DefaultServiceProvider;

/**
 * OSGi bundle activator.
 * 
 * <p>
 * This activator will register multiple {@link MeasurementServiceProvider}
 * services started for the following providers, with ranking equal to each
 * providers's {@link ServiceProvider#getPriority()} value and a service
 * property {@literal service.name} set to the value as shown:
 * </p>
 * 
 * <ol>
 * <li>UCUM - {@link UCUMServiceProvider}</li>
 * <li>Common - {@link CommonServiceProvider}</li>
 * <li>SI - {@link SIServiceProvider}</li>
 * <li>Unicode - {@link UnicodeServiceProvider}</li>
 * <li>Default - {@link DefaultServiceProvider}</li>
 * </ol>
 * 
 * @author matt
 * @version 1.1
 */
public class Activator implements BundleActivator {

	private final Collection<ServiceRegistration<MeasurementServiceProvider>> registrations = new ArrayList<>(
			4);

	@Override
	public void start(BundleContext bundleContext) throws Exception {
		registerServiceProvider(bundleContext, new UCUMServiceProvider(), "UCUM");
		registerServiceProvider(bundleContext, new CommonServiceProvider(), "Common");
		registerServiceProvider(bundleContext, new SIServiceProvider(), "SI");
		registerServiceProvider(bundleContext, new UnicodeServiceProvider(), "Unicode");
		registerServiceProvider(bundleContext, new DefaultServiceProvider(), "Default");
	}

	private void registerServiceProvider(BundleContext bundleContext, ServiceProvider provider,
			String name) {
		setupServiceProvider(provider);
		Hashtable<String, Object> properties = new Hashtable<>();
		properties.put("service.name", name);
		properties.put(Constants.SERVICE_RANKING, provider.getPriority());
		properties.put(Constants.SERVICE_VENDOR, "Indriya");
		MeasurementServiceProvider s = new IndriyaMeasurementServiceProvider(provider);
		registrations
				.add(bundleContext.registerService(MeasurementServiceProvider.class, s, properties));
	}

	@SuppressWarnings("deprecation")
	private void setupServiceProvider(ServiceProvider provider) {
		// verify internal classes are loaded by _this_ bundle, as internally ThreadContextClassLoader is used
		// by ServiceLoader :-(
		provider.getFormatService();
		provider.getUnitFormatService();
		provider.getSystemOfUnitsService();
	}

	@Override
	public void stop(BundleContext bundleContext) throws Exception {
		for ( Iterator<ServiceRegistration<MeasurementServiceProvider>> itr = registrations
				.iterator(); itr.hasNext(); ) {
			ServiceRegistration<MeasurementServiceProvider> reg = itr.next();
			if ( reg != null ) {
				reg.unregister();
				itr.remove();
			}
		}
	}

}
