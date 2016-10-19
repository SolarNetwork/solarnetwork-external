
package net.solarnetwork.org.apache.derby;

import java.sql.Driver;
import java.util.Hashtable;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;
import org.osgi.service.jdbc.DataSourceFactory;

public class Activator implements BundleActivator {

	private static final String DRIVER_CLASS = "org.apache.derby.jdbc.EmbeddedDriver";
	private static final String DRIVER_NAME = "Derby Embedded";

	public ServiceRegistration<DataSourceFactory> dsf = null;

	@Override
	public void start(BundleContext bundleContext) throws Exception {
		DataSourceFactory dataSourceFactory = new DerbyDataSourceFactory();

		java.sql.Driver driver = (Driver) getClass().getClassLoader().loadClass(DRIVER_CLASS)
				.newInstance();
		final int major = driver.getMajorVersion();
		final int minor = driver.getMinorVersion();

		Hashtable<String, Object> props = new Hashtable<String, Object>();
		props.put(DataSourceFactory.OSGI_JDBC_DRIVER_CLASS, DRIVER_CLASS);
		props.put(DataSourceFactory.OSGI_JDBC_DRIVER_NAME, DRIVER_NAME);
		props.put(DataSourceFactory.OSGI_JDBC_DRIVER_VERSION,
				String.valueOf(major) + '.' + String.valueOf(minor) + " JDBC 4+");

		dsf = bundleContext.registerService(DataSourceFactory.class, dataSourceFactory, props);
	}

	@Override
	public void stop(BundleContext bundleContext) throws Exception {
		if ( dsf != null ) {
			dsf.unregister();
			dsf = null;
		}
	}

}
