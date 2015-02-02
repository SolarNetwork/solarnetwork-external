/* ==================================================================
 * SimpleCacheProvider.java - Feb 3, 2015 7:07:06 AM
 * 
 * Copyright 2007-2015 SolarNetwork.net Dev Team
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

package net.sf.packtag.cache.provider;

import net.sf.packtag.cache.Resource;
import net.sf.packtag.cache.provider.DefaultCacheProvider;

/**
 * Extension of {@link net.sf.packtag.cache.provider.DefaultCacheProvider} that
 * removes any trailing path info from the passed in paths, e.g.
 * {@code ;JSESSIONID=X}.
 * 
 * @author matt
 * @version 1.0
 */
public class SimpleCacheProvider extends DefaultCacheProvider {

	private static String pathSansInfo(final String path) {
		if ( path == null ) {
			return path;
		}
		int index = path.lastIndexOf(';');
		if ( index < 0 ) {
			return path;
		}
		return path.substring(0, index);
	}

	@Override
	public Resource getResourceByAbsolutePath(String absolutePath) {
		return super.getResourceByAbsolutePath(pathSansInfo(absolutePath));
	}

	@Override
	public Resource getResourceByMappedPath(String mappedPath) {
		return super.getResourceByMappedPath(pathSansInfo(mappedPath));
	}

	@Override
	public boolean existResource(String absolutePath) {
		return super.existResource(pathSansInfo(absolutePath));
	}

	@Override
	public void removeAbsolutePath(String absolutePath) {
		super.removeAbsolutePath(pathSansInfo(absolutePath));
	}

	@Override
	public void removeMappedPath(String mappedPath) {
		super.removeMappedPath(pathSansInfo(mappedPath));
	}

}
