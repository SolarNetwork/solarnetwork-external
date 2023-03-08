package com.serotonin.bacnet4j.obj.mixin;

import com.serotonin.bacnet4j.obj.AbstractMixin;
import com.serotonin.bacnet4j.obj.BACnetObject;
import com.serotonin.bacnet4j.type.Encodable;
import com.serotonin.bacnet4j.type.constructed.DateTime;
import com.serotonin.bacnet4j.type.enumerated.BinaryPV;
import com.serotonin.bacnet4j.type.enumerated.PropertyIdentifier;
import com.serotonin.bacnet4j.type.primitive.UnsignedInteger;

/**
 * Mixin that manages the following properties:
 * - elapsed-active-time
 * - time-of-active-time-reset
 *
 * @author Matthew
 */
public class ActiveTimeMixin extends AbstractMixin {
    private final PropertyIdentifier monitoredValue;
    private long accumulatedActiveTime;
    private long lastActiveTime;

    /**
     * @param bo
     *            the owning object
     * @param useFeedback
     *            whether to use present-value (false) or feedback-value (true) as the indicator for the calculations.
     */
    public ActiveTimeMixin(final BACnetObject bo, final boolean useFeedback) {
        super(bo);

        // Default the values.
        writePropertyInternal(PropertyIdentifier.elapsedActiveTime, UnsignedInteger.ZERO);
        writePropertyInternal(PropertyIdentifier.timeOfActiveTimeReset, new DateTime(getLocalDevice()));

        if (useFeedback) {
            monitoredValue = PropertyIdentifier.feedbackValue;
        } else {
            monitoredValue = PropertyIdentifier.presentValue;
        }

        resetLastActiveTime();
    }

    @Override
    protected void beforeReadProperty(final PropertyIdentifier pid) {
        if (pid.equals(PropertyIdentifier.elapsedActiveTime)) {
            synchronized (monitoredValue) {
                long elapsed = accumulatedActiveTime;
                if (lastActiveTime != -1) {
                    elapsed += getLocalDevice().getClock().millis() - lastActiveTime;
                }
                set(PropertyIdentifier.elapsedActiveTime, new UnsignedInteger(elapsed / 1000));
            }
        }
    }

    @Override
    protected void afterWriteProperty(final PropertyIdentifier pid, final Encodable oldValue,
            final Encodable newValue) {
        if (pid.equals(monitoredValue)) {
            synchronized (monitoredValue) {
                final BinaryPV presentValue = (BinaryPV) newValue;
                if (presentValue.equals(BinaryPV.active)) {
                    if (lastActiveTime == -1) {
                        lastActiveTime = getLocalDevice().getClock().millis();
                    }
                } else {
                    if (lastActiveTime != -1) {
                        accumulatedActiveTime += getLocalDevice().getClock().millis() - lastActiveTime;
                        lastActiveTime = -1;
                    }
                }
            }
        } else if (pid.equals(PropertyIdentifier.elapsedActiveTime)) {
            synchronized (monitoredValue) {
                final UnsignedInteger elapsedActiveTime = (UnsignedInteger) newValue;
                accumulatedActiveTime = elapsedActiveTime.longValue() * 1000;
                resetLastActiveTime();
                if (elapsedActiveTime.longValue() == 0) {
                    writePropertyInternal(PropertyIdentifier.timeOfActiveTimeReset, new DateTime(getLocalDevice()));
                }
            }
        }
    }

    private void resetLastActiveTime() {
        final BinaryPV presentValue = get(monitoredValue);
        if (presentValue.equals(BinaryPV.active)) {
            lastActiveTime = getLocalDevice().getClock().millis();
        } else {
            lastActiveTime = -1;
        }
    }
}
