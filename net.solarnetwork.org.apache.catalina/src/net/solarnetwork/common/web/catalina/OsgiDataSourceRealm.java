/* ==================================================================
 * OsgiDataSourceRealm.java - Jun 17, 2011 1:45:43 PM
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

package net.solarnetwork.common.web.catalina;

import java.sql.Connection;
import java.sql.SQLException;
import javax.sql.DataSource;
import org.apache.catalina.realm.DataSourceRealm;
import org.osgi.framework.BundleContext;
import org.osgi.framework.FrameworkUtil;
import org.osgi.framework.InvalidSyntaxException;
import org.osgi.framework.ServiceReference;

/**
 * Looks up a {@link DataSource} OSGi service.
 * 
 * <p>
 * This looks for a registered {@code javax.sql.DataSource} service, using the
 * configured {@code dataSourceName} value as the filter. For example:
 * </p>
 * 
 * <pre>
 * &lt;Realm className="net.solarnetwork.common.web.catalina.OsgiDataSourceRealm"
 * 					dataSourceName="(db=central)" 
 * 					digest="SHA-256"
 * 					userTable="solardras.dras_user" 
 * 					userNameCol="username"
 * 					userCredCol="passwd" 
 * 					userRoleTable="solardras.dras_auth_roles"
 * 					roleNameCol="rolename" /&gt;
 * </pre>
 * 
 * @author matt
 * @version 1.0
 */
public class OsgiDataSourceRealm extends DataSourceRealm {

	@Override
	protected Connection open() {
		BundleContext context = FrameworkUtil.getBundle(getClass()).getBundleContext();
		try {
			ServiceReference<?>[] service = context.getServiceReferences(DataSource.class.getName(),
					getDataSourceName());
			if ( service == null || service.length < 1 ) {
				throw new RuntimeException("No " + DataSource.class.getName() + " available");
			}
			DataSource dataSource = (DataSource) context.getService(service[0]);
			return dataSource.getConnection();
		} catch ( SQLException e ) {
			throw new RuntimeException("Error creating DataSource", e);
		} catch ( InvalidSyntaxException e ) {
			throw new RuntimeException("Error creating DataSource", e);
		}
	}

}
