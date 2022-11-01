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
package com.serotonin.bacnet4j.npdu.ipv6;

public class Ipv6NetworkBuilder {
    private final String multicastAddress;
    private int port = Ipv6Network.DEFAULT_PORT;
    private String localBindAddress = Ipv6Network.DEFAULT_BIND_ADDRESS;
    private int localNetworkNumber = 0;

    public Ipv6NetworkBuilder(String multicastAddress) {
        this.multicastAddress = multicastAddress;
    }

    public Ipv6NetworkBuilder port(int port) {
        this.port = port;
        return this;
    }

    public Ipv6NetworkBuilder localBindAddress(String localBindAddress) {
        this.localBindAddress = localBindAddress;
        return this;
    }

    public Ipv6NetworkBuilder localNetworkNumber(int localNetworkNumber) {
        this.localNetworkNumber = localNetworkNumber;
        return this;
    }

    public Ipv6Network build() {
        return new Ipv6Network(multicastAddress, port, localBindAddress, localNetworkNumber);
    }
}
