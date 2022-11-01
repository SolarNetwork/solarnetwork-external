package com.serotonin.bacnet4j.obj.mixin;

import java.util.Objects;

import com.serotonin.bacnet4j.obj.AbstractMixin;
import com.serotonin.bacnet4j.obj.BACnetObject;
import com.serotonin.bacnet4j.type.Encodable;
import com.serotonin.bacnet4j.type.constructed.DateTime;
import com.serotonin.bacnet4j.type.enumerated.PropertyIdentifier;
import com.serotonin.bacnet4j.type.primitive.UnsignedInteger;

/**
 * Mixin that manages the following properties:
 * - change-of-state-time
 * - change-of-state-count
 * - time-of-state-count-reset
 *
 * @author Matthew
 */
public class StateChangeMixin extends AbstractMixin {
    public StateChangeMixin(final BACnetObject bo) {
        super(bo);

        // Default the values.
        writePropertyInternal(PropertyIdentifier.changeOfStateTime, DateTime.UNSPECIFIED);
        writePropertyInternal(PropertyIdentifier.changeOfStateCount, UnsignedInteger.ZERO);
        writePropertyInternal(PropertyIdentifier.timeOfStateCountReset, new DateTime(getLocalDevice()));
    }

    @Override
    protected void afterWriteProperty(final PropertyIdentifier pid, final Encodable oldValue,
            final Encodable newValue) {
        if (pid.equals(PropertyIdentifier.presentValue)) {
            if (!Objects.equals(oldValue, newValue)) {
                writePropertyInternal(PropertyIdentifier.changeOfStateTime, new DateTime(getLocalDevice()));
                final UnsignedInteger changeOfStateCount = get(PropertyIdentifier.changeOfStateCount);
                writePropertyInternal(PropertyIdentifier.changeOfStateCount, changeOfStateCount.increment16());
            }
        } else if (pid.equals(PropertyIdentifier.changeOfStateCount)) {
            final UnsignedInteger changeOfStateCount = (UnsignedInteger) newValue;
            if (changeOfStateCount.intValue() == 0) {
                writePropertyInternal(PropertyIdentifier.timeOfStateCountReset, new DateTime(getLocalDevice()));
            }
        }
    }
}
