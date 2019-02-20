/* ==================================================================
 * Activator.java - 21/02/2019 11:13:03 AM
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

package net.solarnetwork.dnp3.osgi;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

/**
 * Activator for OpenDNP3 integration.
 * 
 * <p>
 * When this class is loaded, the {@literal com.automatak.dnp3.nostaticload}
 * will be set to an empty string, and then the {@literal opendnp3java} library
 * will be loaded.
 * </p>
 * 
 * @author matt
 * @version 1.0
 */
public class Activator implements BundleActivator {

	private static BundleContext context;

	static {
		try {
			System.setProperty("com.automatak.dnp3.nostaticload", "");
		} catch ( SecurityException e ) {
			// assume this is already set on the command line
		}
		System.loadLibrary("opendnp3java");
	}

	static BundleContext getContext() {
		return context;
	}

	@Override
	public void start(BundleContext bundleContext) throws Exception {
		Activator.context = bundleContext;
	}

	@Override
	public void stop(BundleContext bundleContext) throws Exception {
		Activator.context = null;
	}

}
