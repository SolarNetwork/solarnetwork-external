package com.serotonin.bacnet4j.obj.mixin.event.faultAlgo;

import java.util.Map;
import java.util.Objects;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.serotonin.bacnet4j.obj.BACnetObject;
import com.serotonin.bacnet4j.type.Encodable;
import com.serotonin.bacnet4j.type.constructed.FaultParameter.AbstractFaultParameter;
import com.serotonin.bacnet4j.type.constructed.FaultParameter.FaultLifeSafety;
import com.serotonin.bacnet4j.type.constructed.ObjectPropertyReference;
import com.serotonin.bacnet4j.type.constructed.SequenceOf;
import com.serotonin.bacnet4j.type.enumerated.LifeSafetyMode;
import com.serotonin.bacnet4j.type.enumerated.LifeSafetyState;
import com.serotonin.bacnet4j.type.enumerated.PropertyIdentifier;
import com.serotonin.bacnet4j.type.enumerated.Reliability;
import com.serotonin.bacnet4j.type.primitive.ObjectIdentifier;

// 13.4.4
public class FaultLifeSafetyAlgo extends FaultAlgorithm {
    static final Logger LOG = LoggerFactory.getLogger(FaultLifeSafetyAlgo.class);

    private LifeSafetyState lastState;
    private LifeSafetyMode lastMode;

    @Override
    public Reliability evaluateIntrinsic(final Encodable oldMonitoredValue, final Encodable newMonitoredValue,
            final BACnetObject bo) {
        return evaluate( //
                bo.get(PropertyIdentifier.reliability), //
                (LifeSafetyState) newMonitoredValue, //
                bo.get(PropertyIdentifier.mode), //
                bo.get(PropertyIdentifier.faultValues));
    }

    @Override
    public Reliability evaluateAlgorithmic(final Encodable oldMonitoredValue, final Encodable newMonitoredValue,
            final Reliability currentReliability, final ObjectIdentifier monitoredObjectReference,
            final Map<ObjectPropertyReference, Encodable> additionalValues, final AbstractFaultParameter parameters) {
        final FaultLifeSafety p = (FaultLifeSafety) parameters;
        return evaluate( //
                currentReliability, //
                (LifeSafetyState) newMonitoredValue, //
                (LifeSafetyMode) additionalValues.get(new ObjectPropertyReference( //
                        p.getModePropertyReference().getObjectIdentifier(), //
                        p.getModePropertyReference().getPropertyIdentifier(), //
                        p.getModePropertyReference().getPropertyArrayIndex())), //
                p.getListOfFaultValues());
    }

    private Reliability evaluate(Reliability currentReliability, final LifeSafetyState monitoredValue,
            final LifeSafetyMode mode, final SequenceOf<LifeSafetyState> faultValues) {
        Objects.requireNonNull(monitoredValue);
        Objects.requireNonNull(mode);
        Objects.requireNonNull(faultValues);

        if (currentReliability == null)
            currentReliability = Reliability.noFaultDetected;

        Reliability newReliability = null;

        final boolean isFaultValue = faultValues.contains(monitoredValue);

        // (a)
        if (currentReliability.equals(Reliability.noFaultDetected) && isFaultValue) {
            newReliability = Reliability.multiStateFault;
            lastState = monitoredValue;
            lastMode = mode;
        }
        // (b)
        else if (currentReliability.equals(Reliability.multiStateFault) && !isFaultValue) {
            newReliability = Reliability.noFaultDetected;
            lastState = null;
            lastMode = null;
        }
        // (c)
        else if (currentReliability.equals(Reliability.multiStateFault) && isFaultValue && !mode.equals(lastMode)) {
            newReliability = Reliability.multiStateFault;
            lastState = monitoredValue;
            lastMode = mode;
        }
        // (d)
        else if (currentReliability.equals(Reliability.multiStateFault) && isFaultValue
                && !monitoredValue.equals(lastState)) {
            newReliability = Reliability.multiStateFault;
            lastState = monitoredValue;
            lastMode = mode;
        }

        if (newReliability != null)
            LOG.debug("FaultState evaluated new reliability: {}", newReliability);

        return newReliability;
    }
}
