package com.serotonin.bacnet4j.persistence;

import java.io.File;

import com.serotonin.bacnet4j.exception.BACnetException;
import com.serotonin.bacnet4j.exception.BACnetRuntimeException;
import com.serotonin.bacnet4j.type.Encodable;
import com.serotonin.bacnet4j.type.constructed.SequenceOf;
import com.serotonin.bacnet4j.util.sero.ByteQueue;

public interface IPersistence {
    void save(String key, String value);

    default void saveEncodable(final String key, final Encodable value) {
        final ByteQueue queue = new ByteQueue();
        value.write(queue);
        save(key, queue.toHexString());
    }

    String load(String key);

    default <T extends Encodable> T loadEncodable(final String key, final Class<T> clazz) {
        final String value = load(key);
        if (value == null)
            return null;
        final ByteQueue queue = new ByteQueue(value);
        try {
            return Encodable.read(queue, clazz);
        } catch (final BACnetException e) {
            throw new BACnetRuntimeException(e);
        }
    }

    default <T extends Encodable> SequenceOf<T> loadSequenceOf(final String key, final Class<T> clazz) {
        final String value = load(key);
        if (value == null)
            return null;
        final ByteQueue queue = new ByteQueue(value);
        try {
            return Encodable.readSequenceOf(queue, clazz);
        } catch (final BACnetException e) {
            throw new BACnetRuntimeException(e);
        }
    }

    void remove(String key);

    /**
     * Provide the list of persistence files, if any, for backups.
     *
     * @return list of file, or null.
     */
    default File[] getFiles() {
        return null;
    }
}
