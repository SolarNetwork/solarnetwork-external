/* ==================================================================
 * Action.java - 31/01/2020 7:17:52 am
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

package ocpp.v16;

/**
 * OCPP v1.6 action enumeration.
 * 
 * @author matt
 * @version 1.0
 */
public enum Action implements ocpp.domain.Action {

	Authorize,

	BootNotification,

	CancelReservation,

	ChangeAvailability,

	ChangeConfiguration,

	ClearCache,

	ClearChargingProfile,

	DataTransfer,

	DiagnosticsStatusNotification,

	FirmwareStatusNotification,

	GetCompositeSchedule,

	GetConfiguration,

	GetDiagnostics,

	GetLocalListVersion,

	GetVariables,

	Heartbeat,

	MeterValues,

	RemoteStartTransaction,

	RemoteStopTransaction,

	ReserveNow,

	Reset,

	SendLocalList,

	SetChargingProfile,

	SetVariables,

	StartTransaction,

	StatusNotification,

	StopTransaction,

	TriggerMessage,

	UnlockConnector,

	UpdateFirmware;

	@Override
	public String getName() {
		return name();
	}

}
