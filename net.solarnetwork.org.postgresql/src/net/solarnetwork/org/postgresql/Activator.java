/* ==================================================================
 * Activator.java - May 30, 2011 11:19:28 AM
 * 
 * Copyright 2007-2011 SolarNetwork.net Dev Team
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
 * $Id$
 * ==================================================================
 */

package net.solarnetwork.org.postgresql;

import java.util.Hashtable;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;
import org.osgi.service.jdbc.DataSourceFactory;

/**
 * Activator for PostgreSQL DataSourceFactory.
 * 
 * @author matt
 * @version $Id$
 */
public class Activator implements BundleActivator {

	private static final String DRIVER_CLASS = "org.postgresql.Driver";
	private static final String DRIVER_NAME = "PostgreSQL";
	private static final String DRIVER_VERSION = "3.0";
	private static final String PGSQL_VERSION = "8.4";

	public ServiceRegistration dsf = null;

	@Override
	public void start(BundleContext bundleContext) throws Exception {
		DataSourceFactory dataSourceFactory = new PostgresDataSourceFactory();

		Hashtable<String, Object> props = new Hashtable<String, Object>();
		props.put(DataSourceFactory.OSGI_JDBC_DRIVER_CLASS, DRIVER_CLASS);
		props.put(DataSourceFactory.OSGI_JDBC_DRIVER_NAME, DRIVER_NAME);
		props.put(DataSourceFactory.OSGI_JDBC_DRIVER_VERSION, PGSQL_VERSION 
				+ " JDBC " +DRIVER_VERSION);
		dsf = bundleContext.registerService(DataSourceFactory.class.getName(), 
				dataSourceFactory, props);
	}

	@Override
	public void stop(BundleContext bundleContext) throws Exception {
		if ( dsf != null ) {
			dsf.unregister();
			dsf = null;
		}
	}

}
