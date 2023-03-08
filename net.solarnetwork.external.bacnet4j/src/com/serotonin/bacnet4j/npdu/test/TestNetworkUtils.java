package com.serotonin.bacnet4j.npdu.test;

import com.serotonin.bacnet4j.type.constructed.Address;
import com.serotonin.bacnet4j.type.constructed.NetworkSourceAddress;

public class TestNetworkUtils {
    public static Address toAddress(final int id) {
        return new Address(new byte[] { (byte) id });
    }

    public static NetworkSourceAddress toSourceAddress(final int id) {
        return new NetworkSourceAddress(Address.LOCAL_NETWORK, new byte[] { (byte) id });
    }
}
