/**
 * Copyright (C) 2019  Infinite Automation Software. All rights reserved.
 */
package com.serotonin.bacnet4j.event;

import com.serotonin.bacnet4j.RemoteDevice;

/**
 * @author Terry Packer
 *
 */
@FunctionalInterface
public interface IAmListener extends DefaultDeviceEventListener {
    @Override
    void iAmReceived(RemoteDevice d);
}
