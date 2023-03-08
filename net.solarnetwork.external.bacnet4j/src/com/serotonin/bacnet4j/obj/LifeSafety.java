package com.serotonin.bacnet4j.obj;

import com.serotonin.bacnet4j.type.Encodable;
import com.serotonin.bacnet4j.type.constructed.Address;
import com.serotonin.bacnet4j.type.enumerated.LifeSafetyOperation;
import com.serotonin.bacnet4j.type.enumerated.PropertyIdentifier;
import com.serotonin.bacnet4j.type.enumerated.SilencedState;
import com.serotonin.bacnet4j.type.primitive.CharacterString;
import com.serotonin.bacnet4j.type.primitive.UnsignedInteger;

public interface LifeSafety {
    /**
     * Override as required. Default implementation implements minimal behaviour.
     *
     * @param from
     * @param requestingProcessIdentifier
     * @param requestingSource
     * @param request
     */
    default void handleLifeSafetyOperation(final Address from, final UnsignedInteger requestingProcessIdentifier,
            final CharacterString requestingSource, final LifeSafetyOperation request) {
        if (request.equals(LifeSafetyOperation.silence)) {
            writePropertyInternal(PropertyIdentifier.silenced, SilencedState.allSilenced);
        } else if (request.equals(LifeSafetyOperation.silenceAudible)) {
            writePropertyInternal(PropertyIdentifier.silenced, SilencedState.audibleSilenced);
        } else if (request.equals(LifeSafetyOperation.silenceVisual)) {
            writePropertyInternal(PropertyIdentifier.silenced, SilencedState.visibleSilenced);
        } else if (request.isOneOf(LifeSafetyOperation.unsilence, LifeSafetyOperation.unsilenceAudible,
                LifeSafetyOperation.unsilenceVisual)) {
            writePropertyInternal(PropertyIdentifier.silenced, SilencedState.unsilenced);
        }
    }

    BACnetObject writePropertyInternal(final PropertyIdentifier pid, final Encodable value);
}
