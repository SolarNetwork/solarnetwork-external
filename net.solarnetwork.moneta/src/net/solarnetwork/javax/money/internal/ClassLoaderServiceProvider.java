/* ==================================================================
 * ClassLoaderServiceProvider.java - 28/08/2017 3:38:13 PM
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

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ServiceLoader;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.money.spi.ServiceProvider;

/**
 * FIXME
 * 
 * <p>
 * TODO
 * </p>
 * 
 * @author matt
 * @version 1.0
 */
public class ClassLoaderServiceProvider implements ServiceProvider {

	/** List of services loaded, per class. */
	private final ConcurrentHashMap<Class<?>, List<Object>> servicesLoaded = new ConcurrentHashMap<>();

	private final ClassLoader classLoader;

	public ClassLoaderServiceProvider(ClassLoader classLoader) {
		super();
		this.classLoader = classLoader;
	}

	@Override
	public int getPriority() {
		return 0;
	}

	@Override
	public <T> List<T> getServices(final Class<T> serviceType) {
		@SuppressWarnings("unchecked")
		List<T> found = (List<T>) servicesLoaded.get(serviceType);
		if ( found != null ) {
			return found;
		}

		return loadServices(serviceType);
	}

	/**
	 * Loads and registers services.
	 *
	 * @param serviceType
	 *        The service type.
	 * @param <T>
	 *        the concrete type.
	 *
	 * @return the items found, never {@code null}.
	 */
	private <T> List<T> loadServices(final Class<T> serviceType) {
		List<T> services = new ArrayList<>();
		try {
			for ( T t : ServiceLoader.load(serviceType, this.classLoader) ) {
				services.add(t);
			}
			@SuppressWarnings("unchecked")
			final List<T> previousServices = (List<T>) servicesLoaded.putIfAbsent(serviceType,
					(List<Object>) services);
			return Collections.unmodifiableList(previousServices != null ? previousServices : services);
		} catch ( Exception e ) {
			Logger.getLogger(ClassLoaderServiceProvider.class.getName()).log(Level.WARNING,
					"Error loading services of type " + serviceType, e);
			return services;
		}
	}
}
