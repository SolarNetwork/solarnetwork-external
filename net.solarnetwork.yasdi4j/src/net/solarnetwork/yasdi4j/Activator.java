/* ==================================================================
 * Activator.java - Mar 7, 2013 7:23:31 AM
 * 
 * Copyright 2007-2013 SolarNetwork.net Dev Team
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

package net.solarnetwork.yasdi4j;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

/**
 * Activator for yasdi4j.
 * 
 * @author matt
 * @version 1.0
 */
public class Activator implements BundleActivator {

	private static boolean loaded = false;

	@Override
	public void start(BundleContext bundleContext) throws Exception {
		if ( !loaded ) {
			synchronized ( this ) {
				System.loadLibrary("yasdi4j");
				loaded = true;
			}
		}
	}

	@Override
	public void stop(BundleContext bundleContext) throws Exception {
	}

}
