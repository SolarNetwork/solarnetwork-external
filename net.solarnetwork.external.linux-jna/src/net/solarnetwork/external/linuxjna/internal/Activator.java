/* ==================================================================
 * Activator.java - 10 Sept 2026 7:40:29 pm
 *
 * Copyright 2026 SolarNetwork.net Dev Team
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

package net.solarnetwork.external.linuxjna.internal;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import com.sun.jna.Native;
import io.dvlopt.linux.NativeMemory;
import io.dvlopt.linux.epoll.Epoll;
import io.dvlopt.linux.io.LinuxIO;

/**
 * Bundle activator for the JNA cleanup.
 *
 * @author matt
 * @version 1.0
 * @since 1.2
 */
public class Activator implements BundleActivator {

	/**
	 * Constructor.
	 */
	public Activator() {
		super();
	}

	@Override
	public void start(BundleContext bundleContext) throws Exception {
		// nadda
	}

	@Override
	public void stop(BundleContext bundleContext) throws Exception {
		Native.unregister(Epoll.class);
		Native.unregister(NativeMemory.class);
		Native.unregister(LinuxIO.class);
	}

}
