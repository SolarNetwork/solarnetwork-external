/* ==================================================================
 * NonValidatingOsgiApplicationContextCreator.java - Nov 30, 2011 8:22:45 PM
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

package net.solarnetwork.spring.osgi;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.gemini.blueprint.context.DelegatedExecutionOsgiBundleApplicationContext;
import org.eclipse.gemini.blueprint.context.support.OsgiBundleXmlApplicationContext;
import org.eclipse.gemini.blueprint.extender.support.ApplicationContextConfiguration;
import org.eclipse.gemini.blueprint.extender.support.DefaultOsgiApplicationContextCreator;
import org.eclipse.gemini.blueprint.extender.support.scanning.ConfigurationScanner;
import org.eclipse.gemini.blueprint.extender.support.scanning.DefaultConfigurationScanner;
import org.eclipse.gemini.blueprint.util.OsgiStringUtils;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.util.ObjectUtils;

/**
 * Replacement of {@link DefaultOsgiApplicationContextCreator} that disables XML
 * validation on Spring configuration files.
 * 
 * <p>
 * This can greatly increase application startup time on low-powered devices.
 * </p>
 * 
 * @author matt
 * @version 1.1
 */
public class NonValidatingOsgiApplicationContextCreator
		implements org.eclipse.gemini.blueprint.extender.OsgiApplicationContextCreator {

	private static final Log log = LogFactory.getLog(DefaultOsgiApplicationContextCreator.class);

	private final ConfigurationScanner configurationScanner = new DefaultConfigurationScanner();

	@Override
	public DelegatedExecutionOsgiBundleApplicationContext createApplicationContext(
			BundleContext bundleContext) throws Exception {
		if ( bundleContext == null ) {
			log.info("Cannot create ApplicationContext for null BundleContext");
			return null;
		}
		Bundle bundle = bundleContext.getBundle();
		ApplicationContextConfiguration config = new ApplicationContextConfiguration(bundle,
				configurationScanner);
		if ( log.isTraceEnabled() ) {
			log.trace("Created configuration " + config + " for bundle "
					+ OsgiStringUtils.nullSafeNameAndSymName(bundle));
		}
		if ( !config.isSpringPoweredBundle() ) {
			return null;
		}
		log.info("Discovered configurations "
				+ ObjectUtils.nullSafeToString(config.getConfigurationLocations()) + " in bundle ["
				+ OsgiStringUtils.nullSafeNameAndSymName(bundle) + "]");
		DelegatedExecutionOsgiBundleApplicationContext sdoac = new NonValidatingOsgiBundleXmlApplicationContext(
				config.getConfigurationLocations());
		sdoac.setBundleContext(bundleContext);
		sdoac.setPublishContextAsService(config.isPublishContextAsService());
		return sdoac;
	}

	private static class NonValidatingOsgiBundleXmlApplicationContext
			extends OsgiBundleXmlApplicationContext {

		public NonValidatingOsgiBundleXmlApplicationContext(String[] configLocations) {
			super(configLocations);
		}

		@Override
		protected void initBeanDefinitionReader(XmlBeanDefinitionReader beanDefinitionReader) {
			super.initBeanDefinitionReader(beanDefinitionReader);
			beanDefinitionReader.setValidating(false);
		}

	}

}
