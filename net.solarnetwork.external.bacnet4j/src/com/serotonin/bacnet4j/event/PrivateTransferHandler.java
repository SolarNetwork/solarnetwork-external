package com.serotonin.bacnet4j.event;

import com.serotonin.bacnet4j.LocalDevice;
import com.serotonin.bacnet4j.exception.BACnetErrorException;
import com.serotonin.bacnet4j.type.Encodable;
import com.serotonin.bacnet4j.type.EncodedValue;
import com.serotonin.bacnet4j.type.constructed.Address;
import com.serotonin.bacnet4j.type.primitive.UnsignedInteger;

public interface PrivateTransferHandler {
    Encodable handle(final LocalDevice localDevice, final Address from, final UnsignedInteger vendorId,
            final UnsignedInteger serviceNumber, final EncodedValue serviceParameters, boolean confirmed)
            throws BACnetErrorException;
}
