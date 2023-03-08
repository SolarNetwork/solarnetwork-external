package com.serotonin.bacnet4j.obj;

import java.util.Objects;

import com.serotonin.bacnet4j.LocalDevice;
import com.serotonin.bacnet4j.exception.BACnetServiceException;
import com.serotonin.bacnet4j.obj.mixin.HasStatusFlagsMixin;
import com.serotonin.bacnet4j.obj.mixin.LifeSafetyMixin;
import com.serotonin.bacnet4j.obj.mixin.ReadOnlyPropertyMixin;
import com.serotonin.bacnet4j.obj.mixin.event.IntrinsicReportingMixin;
import com.serotonin.bacnet4j.obj.mixin.event.eventAlgo.ChangeOfLifeSafetyAlgo;
import com.serotonin.bacnet4j.obj.mixin.event.faultAlgo.FaultLifeSafetyAlgo;
import com.serotonin.bacnet4j.type.constructed.BACnetArray;
import com.serotonin.bacnet4j.type.constructed.DeviceObjectReference;
import com.serotonin.bacnet4j.type.constructed.EventTransitionBits;
import com.serotonin.bacnet4j.type.constructed.SequenceOf;
import com.serotonin.bacnet4j.type.constructed.StatusFlags;
import com.serotonin.bacnet4j.type.constructed.ValueSource;
import com.serotonin.bacnet4j.type.enumerated.EngineeringUnits;
import com.serotonin.bacnet4j.type.enumerated.EventState;
import com.serotonin.bacnet4j.type.enumerated.LifeSafetyMode;
import com.serotonin.bacnet4j.type.enumerated.LifeSafetyOperation;
import com.serotonin.bacnet4j.type.enumerated.LifeSafetyState;
import com.serotonin.bacnet4j.type.enumerated.NotifyType;
import com.serotonin.bacnet4j.type.enumerated.ObjectType;
import com.serotonin.bacnet4j.type.enumerated.PropertyIdentifier;
import com.serotonin.bacnet4j.type.enumerated.Reliability;
import com.serotonin.bacnet4j.type.enumerated.SilencedState;
import com.serotonin.bacnet4j.type.primitive.Boolean;
import com.serotonin.bacnet4j.type.primitive.Real;
import com.serotonin.bacnet4j.type.primitive.UnsignedInteger;

public class LifeSafetyPointObject extends BACnetObject implements LifeSafety {
    public LifeSafetyPointObject(final LocalDevice localDevice, final int instanceNumber, final String name,
            final LifeSafetyState presentValue, final LifeSafetyMode mode, final boolean outOfService,
            final SequenceOf<LifeSafetyMode> acceptedModes, final LifeSafetyOperation operationExpected,
            final SilencedState silenced) throws BACnetServiceException {
        super(localDevice, ObjectType.lifeSafetyPoint, instanceNumber, name);

        Objects.requireNonNull(presentValue);
        Objects.requireNonNull(mode);
        Objects.requireNonNull(acceptedModes);
        Objects.requireNonNull(operationExpected);
        Objects.requireNonNull(silenced);

        final ValueSource valueSource = new ValueSource(new DeviceObjectReference(localDevice.getId(), getId()));

        writePropertyInternal(PropertyIdentifier.eventState, EventState.normal);
        writePropertyInternal(PropertyIdentifier.presentValue, presentValue);
        writePropertyInternal(PropertyIdentifier.trackingValue, presentValue);
        writePropertyInternal(PropertyIdentifier.outOfService, Boolean.valueOf(outOfService));
        writePropertyInternal(PropertyIdentifier.statusFlags, new StatusFlags(false, false, false, outOfService));
        writePropertyInternal(PropertyIdentifier.reliability, Reliability.noFaultDetected);
        writePropertyInternal(PropertyIdentifier.acceptedModes, acceptedModes);
        writeProperty(valueSource, PropertyIdentifier.mode, mode);
        writePropertyInternal(PropertyIdentifier.operationExpected, operationExpected);
        writePropertyInternal(PropertyIdentifier.silenced, silenced);

        // Mixins
        addMixin(new HasStatusFlagsMixin(this));
        addMixin(new LifeSafetyMixin(this));
        addMixin(new ReadOnlyPropertyMixin(this, PropertyIdentifier.acceptedModes, PropertyIdentifier.ackedTransitions,
                PropertyIdentifier.eventTimeStamps, PropertyIdentifier.eventMessageTexts));

        localDevice.addObject(this);
    }

    public LifeSafetyPointObject supportIntrinsicReporting(final int timeDelay, final int notificationClass,
            final BACnetArray<LifeSafetyState> lifeSafetyAlarmValues, final BACnetArray<LifeSafetyState> alarmValues,
            final BACnetArray<LifeSafetyState> faultValues, final EventTransitionBits eventEnable,
            final NotifyType notifyType, final UnsignedInteger timeDelayNormal) {
        Objects.requireNonNull(lifeSafetyAlarmValues);
        Objects.requireNonNull(alarmValues);
        Objects.requireNonNull(eventEnable);
        Objects.requireNonNull(notifyType);

        writePropertyInternal(PropertyIdentifier.timeDelay, new UnsignedInteger(timeDelay));
        writePropertyInternal(PropertyIdentifier.notificationClass, new UnsignedInteger(notificationClass));
        writePropertyInternal(PropertyIdentifier.lifeSafetyAlarmValues, lifeSafetyAlarmValues);
        writePropertyInternal(PropertyIdentifier.alarmValues, alarmValues);
        if (faultValues != null) {
            writePropertyInternal(PropertyIdentifier.faultValues, faultValues);
        }
        writePropertyInternal(PropertyIdentifier.eventEnable, eventEnable);
        writePropertyInternal(PropertyIdentifier.notifyType, notifyType);
        if (timeDelayNormal != null) {
            writePropertyInternal(PropertyIdentifier.timeDelayNormal, timeDelayNormal);
        }
        writePropertyInternal(PropertyIdentifier.eventDetectionEnable, Boolean.TRUE);

        // Now add the mixin.
        FaultLifeSafetyAlgo faultAlgo = null;
        if (faultValues != null) {
            faultAlgo = new FaultLifeSafetyAlgo();
        }
        addMixin(new IntrinsicReportingMixin(this, new ChangeOfLifeSafetyAlgo(), faultAlgo,
                PropertyIdentifier.presentValue,
                new PropertyIdentifier[] { PropertyIdentifier.presentValue, PropertyIdentifier.mode,
                        PropertyIdentifier.lifeSafetyAlarmValues, PropertyIdentifier.alarmValues }));

        return this;
    }

    public LifeSafetyPointObject supportCovReporting() {
        _supportCovReporting(null, null);
        return this;
    }

    public LifeSafetyPointObject supportDirectReading(final Real directReading, final EngineeringUnits units) {
        Objects.requireNonNull(directReading);
        Objects.requireNonNull(units);

        writePropertyInternal(PropertyIdentifier.directReading, directReading);
        writePropertyInternal(PropertyIdentifier.units, units);

        return this;
    }
}
