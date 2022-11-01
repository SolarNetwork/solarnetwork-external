package com.serotonin.bacnet4j.obj.mixin;

import com.serotonin.bacnet4j.RemoteDevice;
import com.serotonin.bacnet4j.exception.BACnetServiceException;
import com.serotonin.bacnet4j.obj.AbstractMixin;
import com.serotonin.bacnet4j.obj.BACnetObject;
import com.serotonin.bacnet4j.type.Encodable;
import com.serotonin.bacnet4j.type.constructed.PropertyValue;
import com.serotonin.bacnet4j.type.constructed.ValueSource;
import com.serotonin.bacnet4j.type.enumerated.ErrorClass;
import com.serotonin.bacnet4j.type.enumerated.ErrorCode;
import com.serotonin.bacnet4j.type.enumerated.ObjectType;
import com.serotonin.bacnet4j.type.enumerated.PropertyIdentifier;
import com.serotonin.bacnet4j.type.primitive.CharacterString;
import com.serotonin.bacnet4j.type.primitive.ObjectIdentifier;

public class ObjectIdAndNameMixin extends AbstractMixin {
    public ObjectIdAndNameMixin(final BACnetObject owner) {
        super(owner);
    }

    @Override
    protected boolean validateProperty(final ValueSource valueSource, final PropertyValue value)
            throws BACnetServiceException {
        if (value.getPropertyIdentifier().equals(PropertyIdentifier.objectIdentifier)) {
            final ObjectIdentifier objectIdentifier = value.getValue();

            // Only validate if the id is changing.
            if (!objectIdentifier.equals(getId())) {
                // The object type of the identifier cannot change.
                if (!objectIdentifier.getObjectType().equals(getId().getObjectType())) {
                    throw new BACnetServiceException(ErrorClass.property, ErrorCode.invalidValueInThisState);
                }

                // The instance number must be unique among objects of the same type.
                if (getLocalDevice().getObject(objectIdentifier) != null) {
                    throw new BACnetServiceException(ErrorClass.property, ErrorCode.duplicateObjectId);
                }
            }
        } else if (value.getPropertyIdentifier().equals(PropertyIdentifier.objectName)) {
            final CharacterString objectName = value.getValue();

            // Only validate if the name is changing.
            if (!objectName.equals(get(PropertyIdentifier.objectName))) {
                if (getId().getObjectType().equals(ObjectType.device)) {
                    // Devices are supposed to have names that are unique across the network. Without going out in
                    // search of the name, the best we can do is to look at the remote devices we know about.
                    for (final RemoteDevice d : getLocalDevice().getRemoteDevices()) {
                        if (objectName.getValue().equals(d.getName())) {
                            throw new BACnetServiceException(ErrorClass.property, ErrorCode.duplicateName);
                        }
                    }
                } else {
                    // The instance name must be unique among objects of the same type.
                    if (getLocalDevice().getObject(objectName.getValue()) != null) {
                        throw new BACnetServiceException(ErrorClass.property, ErrorCode.duplicateName);
                    }
                }
            }
        }
        return false;
    }

    @Override
    protected void afterWriteProperty(final PropertyIdentifier pid, final Encodable oldValue,
            final Encodable newValue) {
        if (pid.isOneOf(PropertyIdentifier.objectIdentifier, PropertyIdentifier.objectName)) {
            getLocalDevice().incrementDatabaseRevision();
        }
    }
}
