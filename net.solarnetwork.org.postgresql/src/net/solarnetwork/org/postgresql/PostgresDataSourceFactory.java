/* ==================================================================
 * PostgresDataSourceFactory.java - May 30, 2011 3:22:07 PM
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

import java.lang.reflect.Method;
import java.net.URI;
import java.net.URISyntaxException;
import java.sql.Driver;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Properties;

import javax.sql.ConnectionPoolDataSource;
import javax.sql.DataSource;
import javax.sql.XADataSource;

import org.osgi.service.jdbc.DataSourceFactory;
import org.postgresql.ds.PGConnectionPoolDataSource;
import org.postgresql.ds.PGSimpleDataSource;
import org.postgresql.xa.PGXADataSource;

/**
 * PostgreSQL implementation of {@link DataSourceFactory}.
 * 
 * <p>Adapted from sample code at https://bugs.eclipse.org/bugs/show_bug.cgi?id=328310</p>
 * 
 * @author matt
 * @version $Revision$
 */
public class PostgresDataSourceFactory implements DataSourceFactory {

	@Override
	public DataSource createDataSource(Properties props) throws SQLException {
		DataSource dataSource = new PGSimpleDataSource();
		configureDataSourceProperties(dataSource, props);
		return dataSource;
	}

	@Override
	public ConnectionPoolDataSource createConnectionPoolDataSource(
			Properties props) throws SQLException {
		ConnectionPoolDataSource dataSource = new PGConnectionPoolDataSource();
		configureDataSourceProperties(dataSource, props);
		return dataSource;
	}

	@Override
	public XADataSource createXADataSource(Properties props)
			throws SQLException {
		XADataSource dataSource = new PGXADataSource();
		configureDataSourceProperties(dataSource, props);
		return dataSource;
	}

	@Override
	public Driver createDriver(Properties props) throws SQLException {
		Driver driver = new org.postgresql.Driver();
		configureDataSourceProperties(driver, props);
		return driver;
	}

	// adapted from Derby driver
	
	private void configureDataSourceProperties(Object object, Properties props)
	throws SQLException {
	    if (props == null) {
	    	return;
	    }
	    
		Enumeration<?> enumeration = props.keys();
		while (enumeration.hasMoreElements()) {
			String name = (String) enumeration.nextElement();
			
			// special support for "url"
			if ( "url".equals(name) ) {
				String jdbcUrl = props.getProperty(name);
				if ( !jdbcUrl.startsWith("jdbc:") ) {
					throw new SQLException("URL does not start with 'jdbc:'");
				}
				jdbcUrl = jdbcUrl.substring(5);
				try {
					URI uri = new URI(jdbcUrl);
					setProperty(object, "serverName", uri.getHost());
					if ( uri.getPort() > 0 ) {
						setProperty(object, "portNumber", String.valueOf(uri.getPort()));
					}
					String databaseName = uri.getPath();
					if ( databaseName == null ) {
						throw new SQLException("URL does not contain database name in path");
					}
					if ( databaseName.startsWith("/") ) {
						databaseName = databaseName.substring(1);
					}
					setProperty(object, "databaseName", databaseName);
				} catch (URISyntaxException e) {
					throw new SQLException("Unparsable 'url' property", e);
				}
			} else {
				setProperty(object, name, props.getProperty(name));
			}
		}
	}

	protected void throwSQLException(Exception cause, String theType, String value)
			throws SQLException {
		SQLException sqlException = new SQLException("Invalid " + theType
				+ " value: " + value);
		sqlException.initCause(cause);
		throw sqlException;
	}

	protected Object toBasicType(String value, String type) throws SQLException {
		if (value == null) {
			return null;
		}
		else
			if (type == null || type.equals(String.class.getName())) {
				return value;
			}
			else
				if (type.equals(Integer.class.getName())
						|| type.equals(int.class.getName())) {
					try {
						return Integer.valueOf(value);
					}
					catch (NumberFormatException e) {
						throwSQLException(e, "Integer", value);
					}
				}
				else
					if (type.equals(Float.class.getName())
							|| type.equals(float.class.getName())) {
						try {
							return Float.valueOf(value);
						}
						catch (NumberFormatException e) {
							throwSQLException(e, "Float", value);
						}
					}
					else
						if (type.equals(Long.class.getName())
								|| type.equals(long.class.getName())) {
							try {
								return Long.valueOf(value);
							}
							catch (NumberFormatException e) {
								throwSQLException(e, "Long", value);
							}
						}
						else
							if (type.equals(Double.class.getName())
									|| type.equals(double.class.getName())) {
								try {
									return Double.valueOf(value);
								}
								catch (NumberFormatException e) {
									throwSQLException(e, "Double", value);
								}
							}
							else
								if (type.equals(Character.class.getName())
										|| type.equals(char.class.getName())) {
									if (value.length() != 1) {
										throw new SQLException(
												"Invalid Character value: "
														+ value);
									}

									return new Character(value.charAt(0));
								}
								else
									if (type.equals(Byte.class.getName())
											|| type
													.equals(byte.class
															.getName())) {
										try {
											return Byte.valueOf(value);
										}
										catch (NumberFormatException e) {
											throwSQLException(e, "Byte", value);
										}
									}
									else
										if (type.equals(Short.class.getName())
												|| type.equals(short.class
														.getName())) {
											try {
												return Short.valueOf(value);
											}
											catch (NumberFormatException e) {
												throwSQLException(e, "Short",
														value);
											}
										}
										else
											if (type.equals(Boolean.class
													.getName())
													|| type
															.equals(boolean.class
																	.getName())) {
												try {
													return Boolean
															.valueOf(value);
												}
												catch (NumberFormatException e) {
													throwSQLException(e,
															"Boolean", value);
												}
											}
											else {
												throw new SQLException(
														"Invalid property type: "
																+ type);
											}
		return null;
	}

	protected void setProperty(Object object, String name, String value)
			throws SQLException {
		Class<?> type = object.getClass();

		java.beans.PropertyDescriptor[] descriptors;
		try {
			descriptors = java.beans.Introspector.getBeanInfo(type)
					.getPropertyDescriptors();
		}
		catch (Exception exc) {
			SQLException sqlException = new SQLException();
			sqlException.initCause(exc);
			throw sqlException;
		}
		List<String> names = new ArrayList<String>();

		for (int i = 0; i < descriptors.length; i++) {
			if (descriptors[i].getWriteMethod() == null) {
				continue;
			}

			if (descriptors[i].getName().equals(name)) {
				Method method = descriptors[i].getWriteMethod();
				Class<?> paramType = method.getParameterTypes()[0];
				Object param = toBasicType(value, paramType.getName());

				try {
					method.invoke(object, new Object[] {param});
				}
				catch (Exception exc) {
					SQLException sqlException = new SQLException();
					sqlException.initCause(exc);
					throw sqlException;
				}
				return;
			}

			names.add(descriptors[i].getName());
		}
		throw new SQLException("No such property: " + name
				+ ", exists.  Writable properties are: " + names);
	}

}
