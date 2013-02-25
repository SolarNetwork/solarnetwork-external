
package net.solarnetwork.org.apache.derby;

import java.util.Hashtable;
import org.apache.derby.jdbc.Driver30;
import org.apache.derby.jdbc.Driver40;
import org.apache.derby.jdbc.InternalDriver;
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

		InternalDriver driver = new Driver30();
		final int major = driver.getMajorVersion();
		final int minor = driver.getMinorVersion();
		boolean have40 = true;
		try {
			getClass().getClassLoader().loadClass(Driver40.class.getName());
		} catch ( Exception e ) {
			have40 = false;
		}

		Hashtable<String, Object> props = new Hashtable<String, Object>();
		props.put(DataSourceFactory.OSGI_JDBC_DRIVER_CLASS, DRIVER_CLASS);
		props.put(DataSourceFactory.OSGI_JDBC_DRIVER_NAME, DRIVER_NAME);
		props.put(DataSourceFactory.OSGI_JDBC_DRIVER_VERSION,
				String.valueOf(major) + '.' + String.valueOf(minor) + " JDBC "
						+ (have40 ? "4.0" : "3.0"));

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
