package com.serotonin.bacnet4j.obj.mixin;

import java.util.List;
import java.util.Map;

import com.serotonin.bacnet4j.LocalDevice;
import com.serotonin.bacnet4j.exception.BACnetServiceException;
import com.serotonin.bacnet4j.obj.BACnetObject;
import com.serotonin.bacnet4j.type.Encodable;
import com.serotonin.bacnet4j.type.constructed.PropertyReference;
import com.serotonin.bacnet4j.type.enumerated.ErrorClass;
import com.serotonin.bacnet4j.type.enumerated.ErrorCode;
import com.serotonin.bacnet4j.type.error.ErrorClassAndCode;
import com.serotonin.bacnet4j.type.primitive.ObjectIdentifier;
import com.serotonin.bacnet4j.util.DeviceObjectPropertyReferences;
import com.serotonin.bacnet4j.util.DeviceObjectPropertyValues;
import com.serotonin.bacnet4j.util.PropertyReferences;
import com.serotonin.bacnet4j.util.PropertyUtils;

public class PollingDelegate {
    private final LocalDevice localDevice;
    private final PropertyReferences localReferences;
    private final DeviceObjectPropertyReferences remoteReferences;

    public PollingDelegate(final LocalDevice localDevice, final DeviceObjectPropertyReferences polledReferences) {
        this.localDevice = localDevice;

        // Split the given references into local and remote.
        localReferences = new PropertyReferences();
        remoteReferences = new DeviceObjectPropertyReferences();
        for (final Map.Entry<Integer, PropertyReferences> deviceRefs : polledReferences.getProperties().entrySet()) {
            if (deviceRefs.getKey() == localDevice.getInstanceNumber()) {
                // Local references
                localReferences.add(deviceRefs.getValue());
            } else {
                // Remote references
                remoteReferences.add(deviceRefs.getKey(), deviceRefs.getValue());
            }
        }
    }

    public DeviceObjectPropertyReferences getRemoteReferences() {
        return remoteReferences;
    }

    public DeviceObjectPropertyValues doPoll() {
        // Get the remote properties first. If there are no remote properties this will return an empty values object.
        final DeviceObjectPropertyValues result = PropertyUtils.readProperties(localDevice, remoteReferences, null);

        for (final Map.Entry<ObjectIdentifier, List<PropertyReference>> oidRefs : localReferences.getProperties()
                .entrySet()) {
            final BACnetObject localObject = localDevice.getObject(oidRefs.getKey());
            if (localObject == null) {
                // Add errors for each of the references
                final ErrorClassAndCode ecac = new ErrorClassAndCode(ErrorClass.object, ErrorCode.unknownObject);
                for (final PropertyReference ref : oidRefs.getValue()) {
                    result.add(localDevice.getInstanceNumber(), oidRefs.getKey(), ref.getPropertyIdentifier(),
                            ref.getPropertyArrayIndex(), ecac);
                }
            } else {
                for (final PropertyReference ref : oidRefs.getValue()) {
                    Encodable value;
                    try {
                        value = localObject.readProperty(ref.getPropertyIdentifier(), ref.getPropertyArrayIndex());
                    } catch (final BACnetServiceException e) {
                        value = new ErrorClassAndCode(e);
                    }
                    result.add(localDevice.getInstanceNumber(), oidRefs.getKey(), ref.getPropertyIdentifier(),
                            ref.getPropertyArrayIndex(), value);
                }
            }
        }

        return result;
    }
}
