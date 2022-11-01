package com.serotonin.bacnet4j.obj.logBuffer;

import java.util.LinkedList;

import com.serotonin.bacnet4j.exception.BACnetServiceException;

public class LinkedListLogBuffer<T extends ILogRecord> extends LogBuffer<T> {
    private final LinkedList<T> list = new LinkedList<>();

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public void clear() {
        list.clear();
    }

    @Override
    public void add(final T record) {
        list.add(record);
    }

    @Override
    public void remove() {
        list.removeFirst();
    }

    @Override
    public T get(final int index) {
        return list.get(index);
    }

    @Override
    public String toString() {
        return "LinkedListLogBuffer" + list;
    }

    @Override
    public void validate() throws BACnetServiceException {
        //Not written, validation not necessary
    }
}
