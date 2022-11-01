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
import com.serotonin.bacnet4j.type.Encodable;
import com.serotonin.bacnet4j.type.primitive.BitString;
import com.serotonin.bacnet4j.type.primitive.Boolean;
import com.serotonin.bacnet4j.type.primitive.CharacterString;
import com.serotonin.bacnet4j.type.primitive.Date;
import com.serotonin.bacnet4j.type.primitive.Double;
import com.serotonin.bacnet4j.type.primitive.Enumerated;
import com.serotonin.bacnet4j.type.primitive.Null;
import com.serotonin.bacnet4j.type.primitive.ObjectIdentifier;
import com.serotonin.bacnet4j.type.primitive.OctetString;
import com.serotonin.bacnet4j.type.primitive.Real;
import com.serotonin.bacnet4j.type.primitive.SignedInteger;
import com.serotonin.bacnet4j.type.primitive.Time;
import com.serotonin.bacnet4j.type.primitive.UnsignedInteger;
import com.serotonin.bacnet4j.util.sero.ByteQueue;

public class ChannelValue extends BaseType {
    private static ChoiceOptions choiceOptions = new ChoiceOptions();
    static {
        choiceOptions.addPrimitive(Null.class);
        choiceOptions.addPrimitive(Real.class);
        choiceOptions.addPrimitive(Enumerated.class);
        choiceOptions.addPrimitive(UnsignedInteger.class);
        choiceOptions.addPrimitive(Boolean.class);
        choiceOptions.addPrimitive(SignedInteger.class);
        choiceOptions.addPrimitive(Double.class);
        choiceOptions.addPrimitive(Time.class);
        choiceOptions.addPrimitive(CharacterString.class);
        choiceOptions.addPrimitive(OctetString.class);
        choiceOptions.addPrimitive(BitString.class);
        choiceOptions.addPrimitive(Date.class);
        choiceOptions.addPrimitive(ObjectIdentifier.class);
        choiceOptions.addContextual(0, LightingCommand.class);
    }

    private final Choice choice;

    public ChannelValue(final Null nullValue) {
        this.choice = new Choice(nullValue, choiceOptions);
    }

    public ChannelValue(final Real realValue) {
        this.choice = new Choice(realValue, choiceOptions);
    }

    public ChannelValue(final Enumerated enumeratedValue) {
        this.choice = new Choice(enumeratedValue, choiceOptions);
    }

    public ChannelValue(final UnsignedInteger unsignedValue) {
        this.choice = new Choice(unsignedValue, choiceOptions);
    }

    public ChannelValue(final Boolean booleanValue) {
        this.choice = new Choice(booleanValue, choiceOptions);
    }

    public ChannelValue(final SignedInteger integerValue) {
        this.choice = new Choice(integerValue, choiceOptions);
    }

    public ChannelValue(final Double doubleValue) {
        this.choice = new Choice(doubleValue, choiceOptions);
    }

    public ChannelValue(final Time timeValue) {
        this.choice = new Choice(timeValue, choiceOptions);
    }

    public ChannelValue(final CharacterString characterStringValue) {
        this.choice = new Choice(characterStringValue, choiceOptions);
    }

    public ChannelValue(final OctetString octetStringValue) {
        this.choice = new Choice(octetStringValue, choiceOptions);
    }

    public ChannelValue(final BitString bitStringValue) {
        this.choice = new Choice(bitStringValue, choiceOptions);
    }

    public ChannelValue(final Date dateValue) {
        this.choice = new Choice(dateValue, choiceOptions);
    }

    public ChannelValue(final ObjectIdentifier objectIdentifierValue) {
        this.choice = new Choice(objectIdentifierValue, choiceOptions);
    }

    public ChannelValue(final LightingCommand lightingCommandValue) {
        this.choice = new Choice(0, lightingCommandValue, choiceOptions);
    }

    public Choice getChoice() {
        return choice;
    }

    public <T extends Encodable> T getValue() {
        return choice.getDatum();
    }

    @Override
    public void write(final ByteQueue queue) {
        write(queue, choice);
    }

    public ChannelValue(final ByteQueue queue) throws BACnetException {
        choice = readChoice(queue, choiceOptions);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (choice == null ? 0 : choice.hashCode());
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
        final ChannelValue other = (ChannelValue) obj;
        if (choice == null) {
            if (other.choice != null)
                return false;
        } else if (!choice.equals(other.choice))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "ChannelValue [choice=" + choice + ']';
    }   
}
