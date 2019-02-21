/* ==================================================================
 * Slf4jChannelListener.java - 21/02/2019 4:07:58 pm
 * 
 * Copyright 2019 SolarNetwork.net Dev Team
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

package net.solarnetwork.dnp3.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.automatak.dnp3.ChannelListener;
import com.automatak.dnp3.enums.ChannelState;

/**
 * A {@link ChannelListener} that logs events using Slf4j.
 * 
 * @author matt
 * @version 1.0
 */
public class Slf4jChannelListener implements ChannelListener {

	/** The default identifier. */
	public static final String DEFAULT_IDENTIFIER = "default";

	/** The default identifier. */
	public static final String DEFAULT_MESSAGE_PATTERN = "Channel [{}] state changed to {}";

	private final Logger log;
	private final String identifier;
	private final String messagePattern;

	/**
	 * Default constructor.
	 */
	public Slf4jChannelListener() {
		this(Slf4jLogHandler.DEFAULT_LOG_NAME, DEFAULT_IDENTIFIER, DEFAULT_MESSAGE_PATTERN);
	}

	/**
	 * Constructor.
	 * 
	 * @param identifier
	 *        the identifier to use
	 */
	public Slf4jChannelListener(String identifier) {
		this(Slf4jLogHandler.DEFAULT_LOG_NAME, identifier, DEFAULT_MESSAGE_PATTERN);
	}

	/**
	 * Constructor.
	 * 
	 * @param logName
	 *        the log name to use
	 * @param identifier
	 *        the identifier to use
	 */
	public Slf4jChannelListener(String logName, String identifier) {
		this(logName, identifier, DEFAULT_MESSAGE_PATTERN);
	}

	/**
	 * Constructor.
	 * 
	 * @param logName
	 *        the log name to use
	 * @param identifier
	 *        the identifier to use
	 * @param messagePattern
	 *        the log message pattern to use; will be passed {@code identifier}
	 *        and a {@link ChannelState} arguments
	 */
	public Slf4jChannelListener(String logName, String identifier, String messagePattern) {
		super();
		this.log = LoggerFactory.getLogger(logName);
		this.identifier = identifier;
		this.messagePattern = messagePattern;
	}

	@Override
	public void onStateChange(ChannelState state) {
		log.info(messagePattern, identifier, state);
	}

}
