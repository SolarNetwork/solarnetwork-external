package com.serotonin.bacnet4j.exception;

/**
 * Thrown when sending a confirmed request when communication has been disabled as the result of a
 * DeviceCommunicationControlRequest.
 */
public class CommunicationDisabledException extends BACnetException {
    private static final long serialVersionUID = 1L;
}
