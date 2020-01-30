/* ==================================================================
 * ConfigurationKey.java - 25/03/2017 11:29:31 AM
 * 
 * Copyright 2007-2017 SolarNetwork.net Dev Team
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

package ocpp.v15;

import static ocpp.domain.ConfigurationType.CSL;
import static ocpp.domain.ConfigurationType.Integer;
import static ocpp.domain.ConfigurationType.String;
import ocpp.domain.ConfigurationType;

/**
 * Enumeration of the OCPP 1.5 standard configuration key values.
 * 
 * @author matt
 * @version 1.0
 */
public enum ConfigurationKey implements ocpp.domain.ConfigurationKey {

	/**
	 * Interval (in seconds) of inactivity (no OCPP exchanges) with central
	 * system after which the charge point should send a {@literal Heartbeat}
	 * message.
	 */
	HeartBeatInterval(Integer),

	/**
	 * Interval (in seconds, from successful authorization) until incipient
	 * charging session is automatically cancelled due to failure of EV user to
	 * (correctly) insert the charging cable connector(s) into the appropriate
	 * socket(s).
	 */
	ConnectionTimeOut(Integer),

	/** Number of times to retry an unsuccessful reset of the charge point. */
	ResetRetries(Integer),

	/** Number of times to blink charge point lighting when signaling. */
	BlinkRepeat(Integer),

	/**
	 * Percentage from 0-100 of maximum intensity at which to illuminate Charge
	 * Point lighting.
	 */
	LightIntensity(Integer),

	/**
	 * Interval (in seconds) between sampling of metering (or other) data,
	 * intended to be transmitted by "MeterValues" PDUs. For charging session
	 * data (ConnectorID<>0), samples are acquired and transmitted periodically
	 * at this interval from the start of the charging transaction. A value of
	 * "0" (numeric zero), by convention, is to be interpreted to mean that no
	 * sampled data should be transmitted.
	 */
	MeterValueSampleInterval(Integer),

	/**
	 * Size (in seconds) of the clock-aligned data interval. This is the size
	 * (in seconds) of the set of evenly spaced aggregation intervals per day,
	 * starting at 00:00:00 (midnight). For example, a value of 900 (15 minutes)
	 * indicates that every day should be broken into 96 15-minute intervals.
	 */
	ClockAlignedDataInterval(Integer),

	/**
	 * Sampled {@link ocpp.v15.cs.Measurand} values to be included in a
	 * {@literal MeterValues} message, every {@link #MeterValueSampleInterval}
	 * seconds. Default: {@literal Energy.Active.Import.Register}.
	 */
	MeterValuesSampledData(CSL),

	/**
	 * Clock-aligned {@link ocpp.v15.cs.Measurand} values to be included in a
	 * {@literal MeterValues} message, every {@link #ClockAlignedDataInterval}
	 * seconds.
	 */
	MeterValuesAlignedData(CSL),

	/**
	 * Sampled {@link ocpp.v15.cs.Measurand} values to be included in the
	 * {@literal TransactionData} element of {@literal StopTransaction} message,
	 * every {@link #MeterValueSampleInterval} seconds from the start of the
	 * charging session.
	 */
	StopTxnSampledData(CSL),

	/**
	 * Clock-aligned periodic {@link ocpp.v15.cs.Measurand} values to be
	 * included in the {@literal TransactionData} element of
	 * {@literal StopTransaction} {@literal MeterValues} messages for every
	 * {@link #ClockAlignedDataInterval} of the charging session.
	 */
	StopTxnAlignedData(CSL),

	// the following are deprecated in OCPP 1.5

	ProximityLockRetries(Integer),

	ProximityContactRetries(Integer),

	ChargePointId(String);

	private final ConfigurationType type;

	private ConfigurationKey(ConfigurationType type) {
		this.type = type;
	}

	@Override
	public ConfigurationType getType() {
		return type;
	}

	@Override
	public String getName() {
		return name();
	}

}
