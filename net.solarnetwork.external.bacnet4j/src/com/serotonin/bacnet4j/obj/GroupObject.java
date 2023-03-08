package com.serotonin.bacnet4j.obj;

import java.util.Objects;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.serotonin.bacnet4j.LocalDevice;
import com.serotonin.bacnet4j.exception.BACnetServiceException;
import com.serotonin.bacnet4j.obj.mixin.ReadOnlyPropertyMixin;
import com.serotonin.bacnet4j.type.Encodable;
import com.serotonin.bacnet4j.type.constructed.PropertyReference;
import com.serotonin.bacnet4j.type.constructed.PropertyValue;
import com.serotonin.bacnet4j.type.constructed.ReadAccessResult;
import com.serotonin.bacnet4j.type.constructed.ReadAccessResult.Result;
import com.serotonin.bacnet4j.type.constructed.ReadAccessSpecification;
import com.serotonin.bacnet4j.type.constructed.SequenceOf;
import com.serotonin.bacnet4j.type.constructed.ValueSource;
import com.serotonin.bacnet4j.type.enumerated.ErrorClass;
import com.serotonin.bacnet4j.type.enumerated.ErrorCode;
import com.serotonin.bacnet4j.type.enumerated.ObjectType;
import com.serotonin.bacnet4j.type.enumerated.PropertyIdentifier;
import com.serotonin.bacnet4j.type.error.ErrorClassAndCode;
import com.serotonin.bacnet4j.type.primitive.ObjectIdentifier;

public class GroupObject extends BACnetObject {
    static final Logger LOG = LoggerFactory.getLogger(GroupObject.class);

    // CreateObject constructor
    public static GroupObject create(final LocalDevice localDevice, final int instanceNumber)
            throws BACnetServiceException {
        return new GroupObject(localDevice, instanceNumber, ObjectType.group.toString() + " " + instanceNumber,
                new SequenceOf<>());
    }

    public GroupObject(final LocalDevice localDevice, final int instanceNumber, final String name,
            final SequenceOf<ReadAccessSpecification> listOfGroupMembers) throws BACnetServiceException {
        super(localDevice, ObjectType.group, instanceNumber, name);

        Objects.requireNonNull(listOfGroupMembers);

        // Set up object properties.
        writePropertyInternal(PropertyIdentifier.listOfGroupMembers, listOfGroupMembers);

        addMixin(new ReadOnlyPropertyMixin(this, PropertyIdentifier.presentValue));

        localDevice.addObject(this);
    }

    @Override
    protected void beforeReadProperty(final PropertyIdentifier pid) {
        if (PropertyIdentifier.presentValue.equals(pid)) {
            // Construct the present value.
            final SequenceOf<ReadAccessResult> presentValue = new SequenceOf<>();
            final SequenceOf<ReadAccessSpecification> members = get(PropertyIdentifier.listOfGroupMembers);

            for (final ReadAccessSpecification ras : members) {
                final ObjectIdentifier oid = ras.getObjectIdentifier();
                final BACnetObject targetObject = getLocalDevice().getObject(oid);
                final SequenceOf<Result> results = new SequenceOf<>();
                for (final PropertyReference ref : ras.getListOfPropertyReferences()) {
                    if (targetObject == null) {
                        // Object not found. Write an error into the results.
                        results.add(new Result(ref.getPropertyIdentifier(), ref.getPropertyArrayIndex(),
                                new ErrorClassAndCode(ErrorClass.object, ErrorCode.unknownObject)));
                    } else {
                        Encodable value;
                        try {
                            value = targetObject.readPropertyRequired(ref.getPropertyIdentifier(),
                                    ref.getPropertyArrayIndex());
                        } catch (final BACnetServiceException e) {
                            // Property read error.
                            value = new ErrorClassAndCode(e);
                        }
                        results.add(new Result(ref.getPropertyIdentifier(), ref.getPropertyArrayIndex(), value));
                    }
                }

                presentValue.add(new ReadAccessResult(oid, results));
            }

            set(PropertyIdentifier.presentValue, presentValue);
        }
    }

    @Override
    protected boolean validateProperty(final ValueSource valueSource, final PropertyValue value)
            throws BACnetServiceException {
        if (PropertyIdentifier.listOfGroupMembers.equals(value.getPropertyIdentifier())) {
            final SequenceOf<ReadAccessSpecification> listOfGroupMembers = value.getValue();
            for (final ReadAccessSpecification ras : listOfGroupMembers) {
                // The group cannot refer to groups or global-groups.
                if (ras.getObjectIdentifier().getObjectType().isOneOf(ObjectType.group, ObjectType.globalGroup)) {
                    throw new BACnetServiceException(ErrorClass.object, ErrorCode.inconsistentObjectType);
                }
            }
        }
        return false;
    }
}
