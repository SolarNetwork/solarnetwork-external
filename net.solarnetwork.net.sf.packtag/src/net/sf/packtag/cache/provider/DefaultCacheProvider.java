/**
 * Project pack:tag >> http://packtag.sf.net
 *
 * This software is published under the terms of the LGPL
 * License version 2.1, a copy of which has been included with this
 * distribution in the 'lgpl.txt' file.
 * 
 * Creation date: 13.11.2008 - 23:32:33
 * Last author:   $Author: danielgalan $
 * Last modified: $Date:$
 * Revision:      $Revision:$
 * 
 * $Log:$
 */

package net.sf.packtag.cache.provider;

import java.util.Hashtable;
import java.util.Set;
import net.sf.packtag.cache.Resource;

/**
 * The default CacheProvider, which is derived from the static cache in version
 * 3.4.
 * 
 * @author Daniel Galán y Martins
 * @version $Revision:$
 */
public class DefaultCacheProvider extends AbstractCacheProvider {

	private final Hashtable resourcesAbsolutePath = new Hashtable();
	private final Hashtable resourcesMappedPath = new Hashtable();

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
	public Resource getResourceByAbsolutePath(final String absolutePath) {
		return (Resource) resourcesAbsolutePath.get(pathSansInfo(absolutePath));
	}

	@Override
	public Resource getResourceByMappedPath(final String mappedPath) {
		return (Resource) resourcesMappedPath.get(pathSansInfo(mappedPath));
	}

	@Override
	public boolean existResource(final String absolutePath) {
		return resourcesAbsolutePath.containsKey(pathSansInfo(absolutePath));
	}

	@Override
	public void store(final Resource resource, final boolean clearDependingCombinedResources) {
		resourcesAbsolutePath.put(resource.getAbsolutePath(), resource);
		resourcesMappedPath.put(resource.getMappedPath(), resource);

		if ( clearDependingCombinedResources ) {
			clearDependingCombinedResources(resource);
		}
	}

	@Override
	public void clearCache() {
		resourcesAbsolutePath.clear();
		resourcesMappedPath.clear();
	}

	@Override
	public Set getAbsolutePathKeys() {
		return resourcesAbsolutePath.keySet();
	}

	@Override
	public Set getMappedPathKeys() {
		return resourcesMappedPath.keySet();
	}

	@Override
	public void removeAbsolutePath(final String absolutePath) {
		resourcesAbsolutePath.remove(pathSansInfo(absolutePath));
	}

	@Override
	public void removeMappedPath(final String mappedPath) {
		resourcesMappedPath.remove(pathSansInfo(mappedPath));
	}

}
