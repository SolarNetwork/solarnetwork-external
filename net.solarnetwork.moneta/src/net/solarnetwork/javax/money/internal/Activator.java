/* ==================================================================
 * Activator.java - 28/08/2017 3:38:13 PM
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

import javax.money.spi.Bootstrap;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

/**
 * Activator for the {@code javax.money} SPI using Moneta.
 * 
 * <p>
 * This will call {@code Bootstrap#init(javax.money.spi.ServiceProvider)},
 * passing in a {@link ClassLoaderServiceProvider} configured with this class'
 * {@code ClassLoader}.
 * </p>
 * 
 * @author matt
 * @version 1.0
 */
public class Activator implements BundleActivator {

	@Override
	public void start(BundleContext bundleContext) throws Exception {
		Bootstrap.init(new ClassLoaderServiceProvider(getClass().getClassLoader()));
	}

	@Override
	public void stop(BundleContext bundleContext) throws Exception {
		// nadda
	}

}
