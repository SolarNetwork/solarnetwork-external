package com.serotonin.bacnet4j.obj.mixin.event;

import com.serotonin.bacnet4j.obj.BACnetObject;
import com.serotonin.bacnet4j.obj.mixin.event.eventAlgo.EventAlgorithm;
import com.serotonin.bacnet4j.obj.mixin.event.faultAlgo.FaultAlgorithm;
import com.serotonin.bacnet4j.type.Encodable;
import com.serotonin.bacnet4j.type.constructed.PropertyValue;
import com.serotonin.bacnet4j.type.constructed.SequenceOf;
import com.serotonin.bacnet4j.type.enumerated.EventState;
import com.serotonin.bacnet4j.type.enumerated.EventType;
import com.serotonin.bacnet4j.type.enumerated.PropertyIdentifier;
import com.serotonin.bacnet4j.type.enumerated.Reliability;
import com.serotonin.bacnet4j.type.notificationParameters.ExtendedNotif;
import com.serotonin.bacnet4j.type.notificationParameters.ExtendedNotif.Parameter;
import com.serotonin.bacnet4j.type.notificationParameters.NotificationParameters;
import com.serotonin.bacnet4j.type.primitive.ObjectIdentifier;
import com.serotonin.bacnet4j.type.primitive.UnsignedInteger;

/**
 * Provides support for the AlertEnrollment object.
 *
 * @author Matthew
 */
public class AlertReportingMixin extends EventReportingMixin {
    private ObjectIdentifier alertSource;
    private UnsignedInteger vendorId;
    private UnsignedInteger extendedEventType;
    private Parameter[] parameters;

    public AlertReportingMixin(final BACnetObject bo) {
        super(bo, null, null);
    }

    public void issueAlert(final ObjectIdentifier alertSource, final UnsignedInteger vendorId,
            final UnsignedInteger extendedEventType, final Parameter[] parameters) {
        writePropertyInternal(PropertyIdentifier.presentValue, alertSource);

        this.alertSource = alertSource;
        this.vendorId = vendorId;
        this.extendedEventType = extendedEventType;
        this.parameters = parameters;

        doStateTransition(EventState.normal);
    }

    @Override
    protected StateTransition evaluateEventState(final BACnetObject bo, final EventAlgorithm eventAlgo) {
        return null;
    }

    @Override
    protected EventType getEventType(final EventAlgorithm eventAlgo) {
        return EventType.extended;
    }

    @Override
    protected boolean updateAckedTransitions() {
        return false;
    }

    @Override
    protected NotificationParameters getNotificationParameters(final EventState fromState, final EventState toState,
            final BACnetObject bo, final EventAlgorithm eventAlgo) {
        final SequenceOf<Parameter> params = new SequenceOf<>(new Parameter(alertSource));
        for (final Parameter p : parameters)
            params.add(p);
        return new NotificationParameters(new ExtendedNotif(vendorId, extendedEventType, params));
    }

    @Override
    protected Reliability evaluateFaultState(final Encodable oldMonitoredValue, final Encodable newMonitoredValue,
            final BACnetObject bo, final FaultAlgorithm faultAlgo) {
        return null;
    }

    @Override
    protected PropertyValue getEventEnrollmentMonitoredProperty(final PropertyIdentifier pid) {
        throw new RuntimeException("Should not be called because AlertEnrollment does not support intrinsic reporting");
    }
}
