package com.serotonin.bacnet4j.obj;

import java.util.Objects;

import com.serotonin.bacnet4j.LocalDevice;
import com.serotonin.bacnet4j.exception.BACnetServiceException;
import com.serotonin.bacnet4j.obj.mixin.ActiveTimeMixin;
import com.serotonin.bacnet4j.obj.mixin.HasStatusFlagsMixin;
import com.serotonin.bacnet4j.obj.mixin.ReadOnlyPropertyMixin;
import com.serotonin.bacnet4j.obj.mixin.StateChangeMixin;
import com.serotonin.bacnet4j.obj.mixin.WritablePropertyOutOfServiceMixin;
import com.serotonin.bacnet4j.obj.mixin.event.IntrinsicReportingMixin;
import com.serotonin.bacnet4j.obj.mixin.event.eventAlgo.ChangeOfStateAlgo;
import com.serotonin.bacnet4j.type.constructed.EventTransitionBits;
import com.serotonin.bacnet4j.type.constructed.OptionalBinaryPV;
import com.serotonin.bacnet4j.type.constructed.StatusFlags;
import com.serotonin.bacnet4j.type.enumerated.BinaryPV;
import com.serotonin.bacnet4j.type.enumerated.EventState;
import com.serotonin.bacnet4j.type.enumerated.NotifyType;
import com.serotonin.bacnet4j.type.enumerated.ObjectType;
import com.serotonin.bacnet4j.type.enumerated.Polarity;
import com.serotonin.bacnet4j.type.enumerated.PropertyIdentifier;
import com.serotonin.bacnet4j.type.enumerated.Reliability;
import com.serotonin.bacnet4j.type.primitive.Boolean;
import com.serotonin.bacnet4j.type.primitive.CharacterString;
import com.serotonin.bacnet4j.type.primitive.UnsignedInteger;

public class BinaryInputObject extends BACnetObject {
    public BinaryInputObject(final LocalDevice localDevice, final int instanceNumber, final String name,
            final BinaryPV presentValue, final boolean outOfService, final Polarity polarity)
            throws BACnetServiceException {
        super(localDevice, ObjectType.binaryInput, instanceNumber, name);

        Objects.requireNonNull(presentValue);
        Objects.requireNonNull(polarity);

        writePropertyInternal(PropertyIdentifier.eventState, EventState.normal);
        writePropertyInternal(PropertyIdentifier.outOfService, Boolean.valueOf(outOfService));
        writePropertyInternal(PropertyIdentifier.statusFlags, new StatusFlags(false, false, false, outOfService));

        // Mixins
        addMixin(new HasStatusFlagsMixin(this));
        addMixin(new WritablePropertyOutOfServiceMixin(this, PropertyIdentifier.presentValue,
                PropertyIdentifier.reliability));
        addMixin(
                new ReadOnlyPropertyMixin(this, PropertyIdentifier.ackedTransitions, PropertyIdentifier.eventTimeStamps,
                        PropertyIdentifier.eventMessageTexts, PropertyIdentifier.interfaceValue));

        writePropertyInternal(PropertyIdentifier.presentValue, presentValue);
        writePropertyInternal(PropertyIdentifier.polarity, polarity);
        writePropertyInternal(PropertyIdentifier.reliability, Reliability.noFaultDetected);
        writePropertyInternal(PropertyIdentifier.interfaceValue, new OptionalBinaryPV());

        addMixin(new StateChangeMixin(this));

        localDevice.addObject(this);
    }

    public BinaryInputObject supportStateText(final String inactive, final String active) {
        writePropertyInternal(PropertyIdentifier.inactiveText, new CharacterString(inactive));
        writePropertyInternal(PropertyIdentifier.activeText, new CharacterString(active));
        return this;
    }

    public BinaryInputObject supportCovReporting() {
        _supportCovReporting(null, null);
        return this;
    }

    public BinaryInputObject supportActiveTime() {
        addMixin(new ActiveTimeMixin(this, false));
        return this;
    }

    public BinaryInputObject supportIntrinsicReporting(final int timeDelay, final int notificationClass,
            final BinaryPV alarmValue, final EventTransitionBits eventEnable, final NotifyType notifyType,
            final int timeDelayNormal) {
        writePropertyInternal(PropertyIdentifier.timeDelay, new UnsignedInteger(timeDelay));
        writePropertyInternal(PropertyIdentifier.notificationClass, new UnsignedInteger(notificationClass));
        writePropertyInternal(PropertyIdentifier.alarmValue, alarmValue);
        writePropertyInternal(PropertyIdentifier.eventEnable, eventEnable);
        writePropertyInternal(PropertyIdentifier.notifyType, notifyType);
        writePropertyInternal(PropertyIdentifier.timeDelayNormal, new UnsignedInteger(timeDelayNormal));
        writePropertyInternal(PropertyIdentifier.eventDetectionEnable, Boolean.TRUE);

        final ChangeOfStateAlgo eventAlgo = new ChangeOfStateAlgo(PropertyIdentifier.presentValue,
                PropertyIdentifier.alarmValue);
        addMixin(new IntrinsicReportingMixin(this, eventAlgo, null, PropertyIdentifier.presentValue,
                new PropertyIdentifier[] { PropertyIdentifier.presentValue, PropertyIdentifier.alarmValue }));

        return this;
    }

    public BinaryPV getPhysicalState() {
        final BinaryPV presentValue = get(PropertyIdentifier.presentValue);

        final Boolean outOfService = get(PropertyIdentifier.outOfService);
        if (outOfService.booleanValue())
            return presentValue;

        final Polarity polarity = get(PropertyIdentifier.polarity);
        if (polarity.equals(Polarity.normal))
            return presentValue;
        if (presentValue.equals(BinaryPV.active))
            return BinaryPV.inactive;
        return BinaryPV.active;
    }
}
