/* ==================================================================
 * CallMessage.java - 31/01/2020 6:54:49 am
 * 
 * Copyright 2020 SolarNetwork.net Dev Team
 * 
 * This program is free software; you can redistribute it and/or 
 * modify it under the terms of the GNU General Public License as 
 * published by the Free Software Foundation; either version 2 of 
 * the License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful, 
 * but WITHOUT ANY WARRANTY; without even the implied warranty of 
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU 
 * General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License 
 * along with this program; if not, write to the Free Software 
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA 
 * 02111-1307 USA
 * ==================================================================
 */

package ocpp.json;

import ocpp.domain.Action;

/**
 * A call message.
 * 
 * <p>
 * This type of message represents a request initiated by a client, where a
 * result is expected in the form of a {@link CallResultMessage}.
 * </p>
 * 
 * @author matt
 * @version 1.0
 */
public interface CallMessage extends Message {

	@Override
	default MessageType getMessageType() {
		return MessageType.Call;
	}

	/**
	 * Get a unique ID for this message.
	 * 
	 * <p>
	 * This ID is expected to be unique between client and server for a given
	 * connection session. It has a maximum length of 36 characters, which
	 * allows for {@link java.util.UUID} values can be used. This same ID will
	 * be used in a future corresponding {@link CallResultMessage}.
	 * </p>
	 * 
	 * @return the unique ID, never {@literal null}
	 */
	String getMessageId();

	/**
	 * Get the message action (verb).
	 * 
	 * @return the message action, never {@literal null}
	 */
	Action getAction();

	/**
	 * Get the message content.
	 * 
	 * @return the message content, or {@literal null} if there isn't any
	 */
	Object getPayload();

}
