
package ocpp.v20;

import java.io.Serializable;
import java.time.Instant;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Charging_ Needs
 * urn:x-oca:ocpp:uid:2:233249
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "customData",
    "acChargingParameters",
    "dcChargingParameters",
    "requestedEnergyTransfer",
    "departureTime"
})
public class ChargingNeeds implements Serializable
{

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     * 
     */
    @JsonProperty("customData")
    @JsonPropertyDescription("This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.")
    private CustomData customData;
    /**
     * AC_ Charging_ Parameters
     * urn:x-oca:ocpp:uid:2:233250
     * EV AC charging parameters.
     * 
     * 
     * 
     */
    @JsonProperty("acChargingParameters")
    @JsonPropertyDescription("AC_ Charging_ Parameters\r\nurn:x-oca:ocpp:uid:2:233250\r\nEV AC charging parameters.\r\n\r\n")
    private ACChargingParameters acChargingParameters;
    /**
     * DC_ Charging_ Parameters
     * urn:x-oca:ocpp:uid:2:233251
     * EV DC charging parameters
     * 
     * 
     * 
     * 
     */
    @JsonProperty("dcChargingParameters")
    @JsonPropertyDescription("DC_ Charging_ Parameters\r\nurn:x-oca:ocpp:uid:2:233251\r\nEV DC charging parameters\r\n\r\n\r\n")
    private DCChargingParameters dcChargingParameters;
    /**
     * Charging_ Needs. Requested. Energy_ Transfer_ Mode_ Code
     * urn:x-oca:ocpp:uid:1:569209
     * Mode of energy transfer requested by the EV.
     * 
     * (Required)
     * 
     */
    @JsonProperty("requestedEnergyTransfer")
    @JsonPropertyDescription("Charging_ Needs. Requested. Energy_ Transfer_ Mode_ Code\r\nurn:x-oca:ocpp:uid:1:569209\r\nMode of energy transfer requested by the EV.\r\n")
    private EnergyTransferModeEnum requestedEnergyTransfer;
    /**
     * Charging_ Needs. Departure_ Time. Date_ Time
     * urn:x-oca:ocpp:uid:1:569223
     * Estimated departure time of the EV.
     * 
     * 
     */
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss[.SSS]XXX", timezone = "UTC")
    @JsonProperty("departureTime")
    @JsonPropertyDescription("Charging_ Needs. Departure_ Time. Date_ Time\r\nurn:x-oca:ocpp:uid:1:569223\r\nEstimated departure time of the EV.\r\n")
    private Instant departureTime;
    private final static long serialVersionUID = -5525794205649520239L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ChargingNeeds() {
    }

    /**
     * 
     * @param requestedEnergyTransfer
     */
    public ChargingNeeds(EnergyTransferModeEnum requestedEnergyTransfer) {
        super();
        this.requestedEnergyTransfer = requestedEnergyTransfer;
    }

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     * 
     */
    @JsonProperty("customData")
    public CustomData getCustomData() {
        return customData;
    }

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     * 
     */
    @JsonProperty("customData")
    public void setCustomData(CustomData customData) {
        this.customData = customData;
    }

    public ChargingNeeds withCustomData(CustomData customData) {
        this.customData = customData;
        return this;
    }

    /**
     * AC_ Charging_ Parameters
     * urn:x-oca:ocpp:uid:2:233250
     * EV AC charging parameters.
     * 
     * 
     * 
     */
    @JsonProperty("acChargingParameters")
    public ACChargingParameters getAcChargingParameters() {
        return acChargingParameters;
    }

    /**
     * AC_ Charging_ Parameters
     * urn:x-oca:ocpp:uid:2:233250
     * EV AC charging parameters.
     * 
     * 
     * 
     */
    @JsonProperty("acChargingParameters")
    public void setAcChargingParameters(ACChargingParameters acChargingParameters) {
        this.acChargingParameters = acChargingParameters;
    }

    public ChargingNeeds withAcChargingParameters(ACChargingParameters acChargingParameters) {
        this.acChargingParameters = acChargingParameters;
        return this;
    }

    /**
     * DC_ Charging_ Parameters
     * urn:x-oca:ocpp:uid:2:233251
     * EV DC charging parameters
     * 
     * 
     * 
     * 
     */
    @JsonProperty("dcChargingParameters")
    public DCChargingParameters getDcChargingParameters() {
        return dcChargingParameters;
    }

    /**
     * DC_ Charging_ Parameters
     * urn:x-oca:ocpp:uid:2:233251
     * EV DC charging parameters
     * 
     * 
     * 
     * 
     */
    @JsonProperty("dcChargingParameters")
    public void setDcChargingParameters(DCChargingParameters dcChargingParameters) {
        this.dcChargingParameters = dcChargingParameters;
    }

    public ChargingNeeds withDcChargingParameters(DCChargingParameters dcChargingParameters) {
        this.dcChargingParameters = dcChargingParameters;
        return this;
    }

    /**
     * Charging_ Needs. Requested. Energy_ Transfer_ Mode_ Code
     * urn:x-oca:ocpp:uid:1:569209
     * Mode of energy transfer requested by the EV.
     * 
     * (Required)
     * 
     */
    @JsonProperty("requestedEnergyTransfer")
    public EnergyTransferModeEnum getRequestedEnergyTransfer() {
        return requestedEnergyTransfer;
    }

    /**
     * Charging_ Needs. Requested. Energy_ Transfer_ Mode_ Code
     * urn:x-oca:ocpp:uid:1:569209
     * Mode of energy transfer requested by the EV.
     * 
     * (Required)
     * 
     */
    @JsonProperty("requestedEnergyTransfer")
    public void setRequestedEnergyTransfer(EnergyTransferModeEnum requestedEnergyTransfer) {
        this.requestedEnergyTransfer = requestedEnergyTransfer;
    }

    public ChargingNeeds withRequestedEnergyTransfer(EnergyTransferModeEnum requestedEnergyTransfer) {
        this.requestedEnergyTransfer = requestedEnergyTransfer;
        return this;
    }

    /**
     * Charging_ Needs. Departure_ Time. Date_ Time
     * urn:x-oca:ocpp:uid:1:569223
     * Estimated departure time of the EV.
     * 
     * 
     */
    @JsonProperty("departureTime")
    public Instant getDepartureTime() {
        return departureTime;
    }

    /**
     * Charging_ Needs. Departure_ Time. Date_ Time
     * urn:x-oca:ocpp:uid:1:569223
     * Estimated departure time of the EV.
     * 
     * 
     */
    @JsonProperty("departureTime")
    public void setDepartureTime(Instant departureTime) {
        this.departureTime = departureTime;
    }

    public ChargingNeeds withDepartureTime(Instant departureTime) {
        this.departureTime = departureTime;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ChargingNeeds.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("customData");
        sb.append('=');
        sb.append(((this.customData == null)?"<null>":this.customData));
        sb.append(',');
        sb.append("acChargingParameters");
        sb.append('=');
        sb.append(((this.acChargingParameters == null)?"<null>":this.acChargingParameters));
        sb.append(',');
        sb.append("dcChargingParameters");
        sb.append('=');
        sb.append(((this.dcChargingParameters == null)?"<null>":this.dcChargingParameters));
        sb.append(',');
        sb.append("requestedEnergyTransfer");
        sb.append('=');
        sb.append(((this.requestedEnergyTransfer == null)?"<null>":this.requestedEnergyTransfer));
        sb.append(',');
        sb.append("departureTime");
        sb.append('=');
        sb.append(((this.departureTime == null)?"<null>":this.departureTime));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.acChargingParameters == null)? 0 :this.acChargingParameters.hashCode()));
        result = ((result* 31)+((this.dcChargingParameters == null)? 0 :this.dcChargingParameters.hashCode()));
        result = ((result* 31)+((this.departureTime == null)? 0 :this.departureTime.hashCode()));
        result = ((result* 31)+((this.customData == null)? 0 :this.customData.hashCode()));
        result = ((result* 31)+((this.requestedEnergyTransfer == null)? 0 :this.requestedEnergyTransfer.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ChargingNeeds) == false) {
            return false;
        }
        ChargingNeeds rhs = ((ChargingNeeds) other);
        return ((((((this.acChargingParameters == rhs.acChargingParameters)||((this.acChargingParameters!= null)&&this.acChargingParameters.equals(rhs.acChargingParameters)))&&((this.dcChargingParameters == rhs.dcChargingParameters)||((this.dcChargingParameters!= null)&&this.dcChargingParameters.equals(rhs.dcChargingParameters))))&&((this.departureTime == rhs.departureTime)||((this.departureTime!= null)&&this.departureTime.equals(rhs.departureTime))))&&((this.customData == rhs.customData)||((this.customData!= null)&&this.customData.equals(rhs.customData))))&&((this.requestedEnergyTransfer == rhs.requestedEnergyTransfer)||((this.requestedEnergyTransfer!= null)&&this.requestedEnergyTransfer.equals(rhs.requestedEnergyTransfer))));
    }

}
