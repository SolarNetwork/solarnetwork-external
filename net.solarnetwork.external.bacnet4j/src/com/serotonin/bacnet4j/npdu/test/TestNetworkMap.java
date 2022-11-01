package com.serotonin.bacnet4j.npdu.test;

import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import com.serotonin.bacnet4j.type.constructed.Address;

public class TestNetworkMap implements Iterable<TestNetwork> {
    private final Map<Address, TestNetwork> instances = new ConcurrentHashMap<>();

    public void add(final Address address, final TestNetwork network) {
        if (instances.containsKey(address))
            throw new IllegalStateException("Network map already contains key " + address);
        instances.put(address, network);
    }

    public void remove(final Address address) {
        if (!instances.containsKey(address))
            throw new IllegalStateException("Network map does not contain key " + address);
        instances.remove(address);
    }

    public TestNetwork get(final Address address) {
        return instances.get(address);
    }

    @Override
    public Iterator<TestNetwork> iterator() {
        return instances.values().iterator();
    }
}
