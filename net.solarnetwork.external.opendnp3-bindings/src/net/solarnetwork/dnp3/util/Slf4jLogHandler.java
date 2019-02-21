/* ==================================================================
 * Slf4jLogHandler.java - 21/02/2019 11:13:03 AM
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
import com.automatak.dnp3.LogEntry;
import com.automatak.dnp3.LogHandler;
import com.automatak.dnp3.LogLevels;

/**
 * 
 * {@link LogHandler} that delegates to Slf4j.
 * 
 * <p>
 * The {@code logName} logger will emit error, warning, info, and debug log
 * event types. In addition, this handler adds several different log name
 * suffixes to the provided {@code logName} to distinguish different types of
 * messages:
 * </p>
 * 
 * <dl>
 * <dt><code>.EVENT</code></dt>
 * <dd>Event messages are logged at <b>info</b> level.</dd>
 * 
 * <dt><code>.LINK.RX</code></dt>
 * <dd><code>LINK_RX</code> receive messages are logged at <b>info</b> level,
 * and <code>LINK_RX_HEX</code> at <b>trace</b>.</dd>
 * 
 * <dt><code>.LINK.TX</code></dt>
 * <dd><code>LINK_TX</code> transmit messages are logged at <b>info</b> level,
 * and <code>LINK_TX_HEX</code> at <b>trace</b>.</dd>
 * 
 * <dt><code>.TRAN.RX</code></dt>
 * <dd><code>TRANSPORT_RX</code> receive messages are logged at <b>info</b>
 * level, and <code>TRANSPORT_RX_HEX</code> at <b>trace</b>.</dd>
 * 
 * <dt><code>.TRAN.TX</code></dt>
 * <dd><code>TRANSPORT_TX</code> transmit messages are logged at <b>info</b>
 * level, and <code>TRANSPORT_TX_HEX</code> at <b>trace</b>.</dd>
 * 
 * <dt><code>.APPL.RX</code></dt>
 * <dd><code>APP_RX</code> receive messages are logged at <b>info</b> level, and
 * <code>APP_RX_HEX</code> at <b>trace</b>.</dd>
 * 
 * <dt><code>.APPL.TX</code></dt>
 * <dd><code>APP_TX</code> transmit messages are logged at <b>info</b> level,
 * and <code>APP_TX_HEX</code> at <b>trace</b>.</dd>
 * </dl>
 * 
 * @author matt
 * @version 1.0
 */
public class Slf4jLogHandler implements LogHandler {

	/** The default log name. */
	public static final String DEFAULT_LOG_NAME = "com.automatak.dnp3";

	private final Logger log;
	private final Logger eventLog;
	private final Logger linkRxLog;
	private final Logger linkTxLog;
	private final Logger transportRxLog;
	private final Logger transportTxLog;
	private final Logger appRxLog;
	private final Logger appTxLog;

	public Slf4jLogHandler() {
		this("com.automatak.dnp3");
	}

	public Slf4jLogHandler(String logName) {
		super();
		this.log = LoggerFactory.getLogger(logName);
		this.eventLog = LoggerFactory.getLogger(logName + ".EVENT");
		this.linkRxLog = LoggerFactory.getLogger(logName + ".LINK.RX");
		this.linkTxLog = LoggerFactory.getLogger(logName + ".LINK.TX");
		this.transportRxLog = LoggerFactory.getLogger(logName + ".TRAN.RX");
		this.transportTxLog = LoggerFactory.getLogger(logName + ".TRAN.TX");
		this.appRxLog = LoggerFactory.getLogger(logName + ".APPL.RX");
		this.appTxLog = LoggerFactory.getLogger(logName + ".APPL.TX");
	}

	@Override
	public void log(LogEntry entry) {
		switch (entry.level) {
			case LogLevels.EVENT:
				eventLog.info("{}: {}", entry.id, entry.message);
				break;

			case LogLevels.ERROR:
				log.error("{}: {}", entry.id, entry.message);
				break;

			case LogLevels.WARNING:
				log.warn("{}: {}", entry.id, entry.message);
				break;

			case LogLevels.INFO:
				log.info("{}: {}", entry.id, entry.message);
				break;

			case LogLevels.DEBUG:
				log.debug("{}: {}", entry.id, entry.message);
				break;

			case (LogLevels.LINK_RX):
				linkRxLog.debug("{}: {}", entry.id, entry.message);
				break;

			case (LogLevels.LINK_RX_HEX):
				linkRxLog.trace("{}: {}", entry.id, entry.message);
				break;

			case (LogLevels.LINK_TX):
				linkTxLog.debug("{}: {}", entry.id, entry.message);
				break;

			case (LogLevels.LINK_TX_HEX):
				linkTxLog.trace("{}: {}", entry.id, entry.message);
				break;

			case (LogLevels.TRANSPORT_RX):
				transportRxLog.debug("{}: {}", entry.id, entry.message);
				break;

			case (LogLevels.TRANSPORT_TX):
				transportTxLog.debug("{}: {}", entry.id, entry.message);
				break;

			case (LogLevels.APP_HEADER_RX):
			case (LogLevels.APP_OBJECT_RX):
				appRxLog.debug("{}: {}", entry.id, entry.message);
				break;

			case (LogLevels.APP_HEX_RX):
				appRxLog.trace("{}: {}", entry.id, entry.message);
				break;

			case (LogLevels.APP_HEADER_TX):
			case (LogLevels.APP_OBJECT_TX):
				appTxLog.debug("{}: {}", entry.id, entry.message);
				break;

			case (LogLevels.APP_HEX_TX):
				appTxLog.trace("{}: {}", entry.id, entry.message);
				break;

			default:
				// nothing
		}
	}
}
