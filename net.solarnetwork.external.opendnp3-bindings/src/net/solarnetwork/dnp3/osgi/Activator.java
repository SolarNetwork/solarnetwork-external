
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
