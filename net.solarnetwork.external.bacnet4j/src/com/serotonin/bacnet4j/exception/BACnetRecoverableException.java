package com.serotonin.bacnet4j.exception;

public class BACnetRecoverableException extends BACnetException {
    private static final long serialVersionUID = 1L;

    public BACnetRecoverableException() {
        super();
    }

    public BACnetRecoverableException(final String message) {
        super(message);
    }
}
