package com.serotonin.bacnet4j.obj;

import java.util.Objects;

import com.serotonin.bacnet4j.LocalDevice;
import com.serotonin.bacnet4j.exception.BACnetServiceException;
import com.serotonin.bacnet4j.obj.mixin.HasStatusFlagsMixin;
import com.serotonin.bacnet4j.obj.mixin.MultistateMixin;
import com.serotonin.bacnet4j.obj.mixin.ReadOnlyPropertyMixin;
import com.serotonin.bacnet4j.obj.mixin.WritablePropertyOutOfServiceMixin;
import com.serotonin.bacnet4j.obj.mixin.event.IntrinsicReportingMixin;
import com.serotonin.bacnet4j.obj.mixin.event.eventAlgo.ChangeOfStateAlgo;
import com.serotonin.bacnet4j.obj.mixin.event.faultAlgo.FaultStateAlgo;
import com.serotonin.bacnet4j.type.constructed.BACnetArray;
import com.serotonin.bacnet4j.type.constructed.EventTransitionBits;
import com.serotonin.bacnet4j.type.constructed.OptionalUnsigned;
import com.serotonin.bacnet4j.type.constructed.StatusFlags;
import com.serotonin.bacnet4j.type.enumerated.EventState;
import com.serotonin.bacnet4j.type.enumerated.NotifyType;
import com.serotonin.bacnet4j.type.enumerated.ObjectType;
import com.serotonin.bacnet4j.type.enumerated.PropertyIdentifier;
import com.serotonin.bacnet4j.type.enumerated.Reliability;
import com.serotonin.bacnet4j.type.primitive.Boolean;
import com.serotonin.bacnet4j.type.primitive.CharacterString;
import com.serotonin.bacnet4j.type.primitive.UnsignedInteger;

public class MultistateInputObject extends BACnetObject {
    public MultistateInputObject(final LocalDevice localDevice, final int instanceNumber, final String name,
            final int numberOfStates, final BACnetArray<CharacterString> stateText, final int presentValueBase1,
            final boolean outOfService) throws BACnetServiceException {
        super(localDevice, ObjectType.multiStateInput, instanceNumber, name);

        if (numberOfStates < 1) {
            throw new IllegalArgumentException("numberOfStates cannot be less than 1");
        }

        writePropertyInternal(PropertyIdentifier.eventState, EventState.normal);
        writePropertyInternal(PropertyIdentifier.outOfService, Boolean.TRUE);
        writePropertyInternal(PropertyIdentifier.statusFlags, new StatusFlags(false, false, false, true));
        writePropertyInternal(PropertyIdentifier.reliability, Reliability.noFaultDetected);
        writePropertyInternal(PropertyIdentifier.interfaceValue, new OptionalUnsigned());

        // Mixins
        addMixin(new HasStatusFlagsMixin(this));
        addMixin(new MultistateMixin(this));

        writePropertyInternal(PropertyIdentifier.numberOfStates, new UnsignedInteger(numberOfStates));
        if (stateText != null) {
            if (numberOfStates != stateText.getCount()) {
                throw new IllegalArgumentException("numberOfStates does not match state text count");
            }
            writeProperty(null, PropertyIdentifier.stateText, stateText);
        }
        writePropertyInternal(PropertyIdentifier.presentValue, new UnsignedInteger(presentValueBase1));
        if (!outOfService) {
            writePropertyInternal(PropertyIdentifier.outOfService, Boolean.valueOf(outOfService));
        }

        addMixin(new WritablePropertyOutOfServiceMixin(this, PropertyIdentifier.presentValue,
                PropertyIdentifier.reliability));
        addMixin(
                new ReadOnlyPropertyMixin(this, PropertyIdentifier.ackedTransitions, PropertyIdentifier.eventTimeStamps,
                        PropertyIdentifier.eventMessageTexts, PropertyIdentifier.interfaceValue));

        localDevice.addObject(this);
    }

    public MultistateInputObject supportCovReporting() {
        _supportCovReporting(null, null);
        return this;
    }

    public MultistateInputObject supportIntrinsicReporting(final int timeDelay, final int notificationClass,
            final BACnetArray<UnsignedInteger> alarmValues, final BACnetArray<UnsignedInteger> faultValues,
            final EventTransitionBits eventEnable, final NotifyType notifyType, final UnsignedInteger timeDelayNormal) {
        Objects.requireNonNull(alarmValues);
        Objects.requireNonNull(eventEnable);
        Objects.requireNonNull(notifyType);

        writePropertyInternal(PropertyIdentifier.timeDelay, new UnsignedInteger(timeDelay));
        writePropertyInternal(PropertyIdentifier.notificationClass, new UnsignedInteger(notificationClass));
        writePropertyInternal(PropertyIdentifier.alarmValues, alarmValues);
        if (faultValues != null)
            writePropertyInternal(PropertyIdentifier.faultValues, faultValues);
        writePropertyInternal(PropertyIdentifier.eventEnable, eventEnable);
        writePropertyInternal(PropertyIdentifier.notifyType, notifyType);
        if (timeDelayNormal != null)
            writePropertyInternal(PropertyIdentifier.timeDelayNormal, timeDelayNormal);
        writePropertyInternal(PropertyIdentifier.eventDetectionEnable, Boolean.TRUE);

        // Now add the mixin.
        final ChangeOfStateAlgo eventAlgo = new ChangeOfStateAlgo(PropertyIdentifier.presentValue,
                PropertyIdentifier.alarmValues);
        FaultStateAlgo faultAlgo = null;
        if (faultValues != null) {
            faultAlgo = new FaultStateAlgo(PropertyIdentifier.reliability, PropertyIdentifier.faultValues);
        }
        addMixin(new IntrinsicReportingMixin(this, eventAlgo, faultAlgo, PropertyIdentifier.presentValue,
                new PropertyIdentifier[] { PropertyIdentifier.presentValue }));

        return this;
    }
}
