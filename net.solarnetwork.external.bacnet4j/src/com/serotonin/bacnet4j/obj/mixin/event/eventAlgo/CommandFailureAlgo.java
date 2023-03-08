package com.serotonin.bacnet4j.obj.mixin.event.eventAlgo;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.serotonin.bacnet4j.obj.BACnetObject;
import com.serotonin.bacnet4j.obj.mixin.event.StateTransition;
import com.serotonin.bacnet4j.type.Encodable;
import com.serotonin.bacnet4j.type.constructed.ObjectPropertyReference;
import com.serotonin.bacnet4j.type.constructed.StatusFlags;
import com.serotonin.bacnet4j.type.enumerated.EventState;
import com.serotonin.bacnet4j.type.enumerated.EventType;
import com.serotonin.bacnet4j.type.enumerated.PropertyIdentifier;
import com.serotonin.bacnet4j.type.eventParameter.AbstractEventParameter;
import com.serotonin.bacnet4j.type.eventParameter.CommandFailure;
import com.serotonin.bacnet4j.type.notificationParameters.CommandFailureNotif;
import com.serotonin.bacnet4j.type.notificationParameters.NotificationParameters;
import com.serotonin.bacnet4j.type.primitive.ObjectIdentifier;
import com.serotonin.bacnet4j.type.primitive.UnsignedInteger;

public class CommandFailureAlgo extends EventAlgorithm {
    static final Logger LOG = LoggerFactory.getLogger(CommandFailureAlgo.class);

    @Override
    public EventType getEventType() {
        return EventType.commandFailure;
    }

    @Override
    public PropertyIdentifier[] getAdditionalMonitoredProperties() {
        return new PropertyIdentifier[] { PropertyIdentifier.statusFlags };
    }

    @Override
    public StateTransition evaluateIntrinsicEventState(final BACnetObject bo) {
        return evaluateEventState( //
                bo.get(PropertyIdentifier.eventState), //
                bo.get(PropertyIdentifier.presentValue), //
                bo.get(PropertyIdentifier.feedbackValue), //
                bo.get(PropertyIdentifier.timeDelay), //
                bo.get(PropertyIdentifier.timeDelayNormal));
    }

    @Override
    public StateTransition evaluateAlgorithmicEventState(final BACnetObject ee, final Encodable monitoredValue,
            final ObjectIdentifier monitoredObjectReference,
            final Map<ObjectPropertyReference, Encodable> additionalValues, final AbstractEventParameter parameters) {
        final CommandFailure p = (CommandFailure) parameters;
        return evaluateEventState( //
                ee.get(PropertyIdentifier.eventState), //
                monitoredValue, //
                additionalValues.get(new ObjectPropertyReference( //
                        p.getFeedbackPropertyReference().getObjectIdentifier(), //
                        p.getFeedbackPropertyReference().getPropertyIdentifier(), //
                        p.getFeedbackPropertyReference().getPropertyArrayIndex())),
                p.getTimeDelay(), //
                ee.get(PropertyIdentifier.timeDelayNormal));
    }

    private static StateTransition evaluateEventState(final EventState currentState, final Encodable monitoredValue,
            final Encodable feedbackValue, final UnsignedInteger timeDelay, UnsignedInteger timeDelayNormal) {
        if (timeDelayNormal == null)
            timeDelayNormal = timeDelay;

        LOG.debug("Current state: {}, monitored value: {}, feedback values: {}", currentState, feedbackValue);

        if (currentState.equals(EventState.normal) && !monitoredValue.equals(feedbackValue))
            return new StateTransition(EventState.offnormal, timeDelay);

        if (currentState.equals(EventState.offnormal) && monitoredValue.equals(feedbackValue))
            return new StateTransition(EventState.normal, timeDelayNormal);

        return null;
    }

    @Override
    public NotificationParameters getIntrinsicNotificationParameters(final EventState fromState,
            final EventState toState, final BACnetObject bo) {
        return getNotificationParameters(bo.get(PropertyIdentifier.presentValue),
                bo.get(PropertyIdentifier.statusFlags), bo.get(PropertyIdentifier.feedbackValue));
    }

    @Override
    public NotificationParameters getAlgorithmicNotificationParameters(final BACnetObject ee,
            final EventState fromState, final EventState toState, final Encodable monitoredValue,
            final ObjectIdentifier monitoredObjectReference,
            final Map<ObjectPropertyReference, Encodable> additionalValues, final AbstractEventParameter parameters) {
        final CommandFailure p = (CommandFailure) parameters;
        return getNotificationParameters(monitoredValue,
                (StatusFlags) additionalValues
                        .get(new ObjectPropertyReference(monitoredObjectReference, PropertyIdentifier.statusFlags)),
                additionalValues.get(new ObjectPropertyReference( //
                        p.getFeedbackPropertyReference().getObjectIdentifier(), //
                        p.getFeedbackPropertyReference().getPropertyIdentifier(), //
                        p.getFeedbackPropertyReference().getPropertyArrayIndex())));
    }

    private static NotificationParameters getNotificationParameters(final Encodable commandValue,
            StatusFlags statusFlags, final Encodable feedbackValue) {
        if (statusFlags == null)
            statusFlags = new StatusFlags(false, false, false, false);

        return new NotificationParameters(new CommandFailureNotif(commandValue, statusFlags, feedbackValue));
    }
}
