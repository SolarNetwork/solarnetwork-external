package com.serotonin.bacnet4j.obj.mixin.event;

import com.serotonin.bacnet4j.type.enumerated.EventState;
import com.serotonin.bacnet4j.type.primitive.UnsignedInteger;

public class StateTransition {
    private final EventState toState;
    private final UnsignedInteger delay;

    public StateTransition(final EventState toState, final UnsignedInteger delay) {
        this.toState = toState;
        this.delay = delay;
    }

    public EventState getToState() {
        return toState;
    }

    public UnsignedInteger getDelay() {
        return delay;
    }

    @Override
    public String toString() {
        return "StateTransition [toState=" + toState + ", delay=" + delay + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (delay == null ? 0 : delay.hashCode());
        result = prime * result + (toState == null ? 0 : toState.hashCode());
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final StateTransition other = (StateTransition) obj;
        if (delay == null) {
            if (other.delay != null)
                return false;
        } else if (!delay.equals(other.delay))
            return false;
        if (toState == null) {
            if (other.toState != null)
                return false;
        } else if (!toState.equals(other.toState))
            return false;
        return true;
    }
}
