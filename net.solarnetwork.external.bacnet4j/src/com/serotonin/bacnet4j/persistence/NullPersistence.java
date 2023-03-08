package com.serotonin.bacnet4j.persistence;

/**
 * Implementation of {@link IPersistence} that does nothing. Allows the implementations to carry all of the required
 * method instead of having to have them all in LocalDevice by setting this instead of null.
 *
 * @author Matthew
 */
public class NullPersistence implements IPersistence {
    @Override
    public void save(final String key, final String value) {
        // no op
    }

    @Override
    public String load(final String key) {
        return null;
    }

    @Override
    public void remove(final String key) {
        // no op
    }
}
