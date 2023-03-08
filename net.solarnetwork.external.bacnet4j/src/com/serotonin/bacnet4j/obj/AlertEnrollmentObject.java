package com.serotonin.bacnet4j.obj;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.serotonin.bacnet4j.LocalDevice;
import com.serotonin.bacnet4j.exception.BACnetServiceException;
import com.serotonin.bacnet4j.obj.mixin.ReadOnlyPropertyMixin;
import com.serotonin.bacnet4j.obj.mixin.event.AlertReportingMixin;
import com.serotonin.bacnet4j.type.constructed.EventTransitionBits;
import com.serotonin.bacnet4j.type.enumerated.EventState;
import com.serotonin.bacnet4j.type.enumerated.NotifyType;
import com.serotonin.bacnet4j.type.enumerated.ObjectType;
import com.serotonin.bacnet4j.type.enumerated.PropertyIdentifier;
import com.serotonin.bacnet4j.type.notificationParameters.ExtendedNotif.Parameter;
import com.serotonin.bacnet4j.type.primitive.Boolean;
import com.serotonin.bacnet4j.type.primitive.ObjectIdentifier;
import com.serotonin.bacnet4j.type.primitive.UnsignedInteger;

public class AlertEnrollmentObject extends BACnetObject {
    static final Logger LOG = LoggerFactory.getLogger(AlertEnrollmentObject.class);

    private final AlertReportingMixin alertReporting;
    private final UnsignedInteger defaultVendorId;

    public AlertEnrollmentObject(final LocalDevice localDevice, final int instanceNumber, final String name,
            final int notificationClass, final NotifyType notifyType) throws BACnetServiceException {
        super(localDevice, ObjectType.alertEnrollment, instanceNumber, name);

        defaultVendorId = localDevice.get(PropertyIdentifier.vendorIdentifier);

        writePropertyInternal(PropertyIdentifier.presentValue, localDevice.getId());
        writePropertyInternal(PropertyIdentifier.eventState, EventState.normal);
        writePropertyInternal(PropertyIdentifier.eventDetectionEnable, Boolean.FALSE);
        writePropertyInternal(PropertyIdentifier.notificationClass, new UnsignedInteger(notificationClass));
        writePropertyInternal(PropertyIdentifier.eventEnable, new EventTransitionBits(false, false, true));
        writePropertyInternal(PropertyIdentifier.notifyType, notifyType);

        // Mixins
        addMixin(new ReadOnlyPropertyMixin(this, PropertyIdentifier.presentValue));

        alertReporting = new AlertReportingMixin(this);
        addMixin(alertReporting);

        localDevice.addObject(this);
    }

    public void issueAlert(final ObjectIdentifier alertSource, final int extendedEventType,
            final Parameter... parameters) {
        issueAlert(alertSource, defaultVendorId, extendedEventType, parameters);
    }

    public void issueAlert(final ObjectIdentifier alertSource, final UnsignedInteger vendorId,
            final int extendedEventType, final Parameter... parameters) {
        // Delegate to the mixin
        alertReporting.issueAlert(alertSource, vendorId, new UnsignedInteger(extendedEventType), parameters);
    }
}
