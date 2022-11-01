/*
 * ============================================================================
 * GNU General Public License
 * ============================================================================
 *
 * Copyright (C) 2015 Infinite Automation Software. All rights reserved.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 * When signing a commercial license with Infinite Automation Software,
 * the following extension to GPL is made. A special exception to the GPL is
 * included to allow you to distribute a combined work that includes BAcnet4J
 * without being obliged to provide the source code for any proprietary components.
 *
 * See www.infiniteautomation.com for commercial license options.
 *
 * @author Matthew Lohbihler
 */
package com.serotonin.bacnet4j.type.constructed;

import com.serotonin.bacnet4j.exception.BACnetException;
import com.serotonin.bacnet4j.type.enumerated.SecurityPolicy;
import com.serotonin.bacnet4j.type.primitive.Unsigned8;
import com.serotonin.bacnet4j.util.sero.ByteQueue;

public class NetworkSecurityPolicy extends BaseType {
    private final Unsigned8 portId;
    private final SecurityPolicy securityLevel;

    public NetworkSecurityPolicy(final Unsigned8 portId, final SecurityPolicy securityLevel) {
        this.portId = portId;
        this.securityLevel = securityLevel;
    }

    @Override
    public void write(final ByteQueue queue) {
        write(queue, portId, 0);
        write(queue, securityLevel, 1);
    }

    public NetworkSecurityPolicy(final ByteQueue queue) throws BACnetException {
        portId = read(queue, Unsigned8.class, 0);
        securityLevel = read(queue, SecurityPolicy.class, 1);
    }

    public Unsigned8 getPortId() {
        return portId;
    }

    public SecurityPolicy getSecurityLevel() {
        return securityLevel;
    }

    @Override
    public String toString() {
        return "NetworkSecurityPolicy [portId=" + portId + ", securityLevel=" + securityLevel + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (portId == null ? 0 : portId.hashCode());
        result = prime * result + (securityLevel == null ? 0 : securityLevel.hashCode());
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
        final NetworkSecurityPolicy other = (NetworkSecurityPolicy) obj;
        if (portId == null) {
            if (other.portId != null)
                return false;
        } else if (!portId.equals(other.portId))
            return false;
        if (securityLevel == null) {
            if (other.securityLevel != null)
                return false;
        } else if (!securityLevel.equals(other.securityLevel))
            return false;
        return true;
    }
}
