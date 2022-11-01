package com.serotonin.bacnet4j.obj.logBuffer;

import com.serotonin.bacnet4j.service.confirmed.ReadRangeRequest.RangeReadable;
import com.serotonin.bacnet4j.type.Encodable;
import com.serotonin.bacnet4j.util.sero.ByteQueue;

/**
 * Base class for all implementations of log buffers. The class extends Encodable so that it can be one of its host
 * object's properties, but the property is not network readable. It's elements, however, are network readable via the
 * ReadRange request.
 *
 * TODO a disk-based log buffer might be nice.
 *
 * @author Matthew
 */
abstract public class LogBuffer<E extends ILogRecord> extends Encodable implements RangeReadable<E> {
    @Override
    public void write(final ByteQueue queue) {
        throw new RuntimeException("not actually encodable");
    }

    @Override
    public void write(final ByteQueue queue, final int contextId) {
        throw new RuntimeException("not actually encodable");
    }

    /**
     * Returns the current size of the buffer.
     */
    @Override
    abstract public int size();

    /**
     * Clears the buffer of all of its records.
     */
    abstract public void clear();

    /**
     * Adds the given record to the buffer
     */
    abstract public void add(E record);

    /**
     * Removes the oldest record from the buffer, or does nothing if the buffer is empty.
     */
    abstract public void remove();

    /**
     * Returns the record at the given index where 0 is the oldest.
     */
    @Override
    abstract public E get(int index);
}
