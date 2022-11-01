/**
 * Copyright (C) 2019  Infinite Automation Software. All rights reserved.
 */
package com.serotonin.bacnet4j.event;

import com.serotonin.bacnet4j.RemoteDevice;
import com.serotonin.bacnet4j.RemoteObject;
import com.serotonin.bacnet4j.obj.BACnetObject;
import com.serotonin.bacnet4j.service.Service;
import com.serotonin.bacnet4j.type.constructed.Address;
import com.serotonin.bacnet4j.type.constructed.Choice;
import com.serotonin.bacnet4j.type.constructed.DateTime;
import com.serotonin.bacnet4j.type.constructed.PropertyValue;
import com.serotonin.bacnet4j.type.constructed.SequenceOf;
import com.serotonin.bacnet4j.type.constructed.TimeStamp;
import com.serotonin.bacnet4j.type.enumerated.EventState;
import com.serotonin.bacnet4j.type.enumerated.EventType;
import com.serotonin.bacnet4j.type.enumerated.MessagePriority;
import com.serotonin.bacnet4j.type.enumerated.NotifyType;
import com.serotonin.bacnet4j.type.notificationParameters.NotificationParameters;
import com.serotonin.bacnet4j.type.primitive.Boolean;
import com.serotonin.bacnet4j.type.primitive.CharacterString;
import com.serotonin.bacnet4j.type.primitive.ObjectIdentifier;
import com.serotonin.bacnet4j.type.primitive.UnsignedInteger;

/**
 * Default implementation for all methods is to do nothing
 *   useful to create functional interfaces that extend this
 * 
 * @author Terry Packer
 *
 */
public interface DefaultDeviceEventListener extends DeviceEventListener {
    @Override
    default void listenerException(Throwable e) {}

    @Override
    default void iAmReceived(RemoteDevice d) {}

    @Override
    default boolean allowPropertyWrite(Address from, BACnetObject obj, PropertyValue pv) { return true; }

    @Override
    default void propertyWritten(Address from, BACnetObject obj, PropertyValue pv) {}

    @Override
    default void iHaveReceived(RemoteDevice d, RemoteObject o) {}

    @Override
    default void covNotificationReceived(UnsignedInteger subscriberProcessIdentifier,
            ObjectIdentifier initiatingDeviceIdentifier, ObjectIdentifier monitoredObjectIdentifier,
            UnsignedInteger timeRemaining, SequenceOf<PropertyValue> listOfValues) {}

    @Override
    default void eventNotificationReceived(UnsignedInteger processIdentifier, ObjectIdentifier initiatingDeviceIdentifier,
            ObjectIdentifier eventObjectIdentifier, TimeStamp timeStamp, UnsignedInteger notificationClass,
            UnsignedInteger priority, EventType eventType, CharacterString messageText, NotifyType notifyType,
            Boolean ackRequired, EventState fromState, EventState toState, NotificationParameters eventValues) {}

    @Override
    default void textMessageReceived(ObjectIdentifier textMessageSourceDevice, Choice messageClass,
            MessagePriority messagePriority, CharacterString message) {}

    @Override
    default void synchronizeTime(Address from, DateTime dateTime, boolean utc) {}

    @Override
    default void requestReceived(Address from, Service service) {}
}
