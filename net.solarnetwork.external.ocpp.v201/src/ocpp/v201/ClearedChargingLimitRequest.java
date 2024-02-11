
package ocpp.v201;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "customData",
    "chargingLimitSource",
    "evseId"
})
public class ClearedChargingLimitRequest implements Serializable
{

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     * 
     */
    @JsonProperty("customData")
    @JsonPropertyDescription("This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.")
    private CustomData customData;
    /**
     * Source of the charging limit.
     * 
     * (Required)
     * 
     */
    @JsonProperty("chargingLimitSource")
    @JsonPropertyDescription("Source of the charging limit.\r\n")
    private ChargingLimitSourceEnum chargingLimitSource;
    /**
     * EVSE Identifier.
     * 
     * 
     */
    @JsonProperty("evseId")
    @JsonPropertyDescription("EVSE Identifier.\r\n")
    private Integer evseId;
    private final static long serialVersionUID = 3595590478831973217L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ClearedChargingLimitRequest() {
    }

    /**
     * 
     * @param chargingLimitSource
     */
    public ClearedChargingLimitRequest(ChargingLimitSourceEnum chargingLimitSource) {
        super();
        this.chargingLimitSource = chargingLimitSource;
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

    public ClearedChargingLimitRequest withCustomData(CustomData customData) {
        this.customData = customData;
        return this;
    }

    /**
     * Source of the charging limit.
     * 
     * (Required)
     * 
     */
    @JsonProperty("chargingLimitSource")
    public ChargingLimitSourceEnum getChargingLimitSource() {
        return chargingLimitSource;
    }

    /**
     * Source of the charging limit.
     * 
     * (Required)
     * 
     */
    @JsonProperty("chargingLimitSource")
    public void setChargingLimitSource(ChargingLimitSourceEnum chargingLimitSource) {
        this.chargingLimitSource = chargingLimitSource;
    }

    public ClearedChargingLimitRequest withChargingLimitSource(ChargingLimitSourceEnum chargingLimitSource) {
        this.chargingLimitSource = chargingLimitSource;
        return this;
    }

    /**
     * EVSE Identifier.
     * 
     * 
     */
    @JsonProperty("evseId")
    public Integer getEvseId() {
        return evseId;
    }

    /**
     * EVSE Identifier.
     * 
     * 
     */
    @JsonProperty("evseId")
    public void setEvseId(Integer evseId) {
        this.evseId = evseId;
    }

    public ClearedChargingLimitRequest withEvseId(Integer evseId) {
        this.evseId = evseId;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ClearedChargingLimitRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("customData");
        sb.append('=');
        sb.append(((this.customData == null)?"<null>":this.customData));
        sb.append(',');
        sb.append("chargingLimitSource");
        sb.append('=');
        sb.append(((this.chargingLimitSource == null)?"<null>":this.chargingLimitSource));
        sb.append(',');
        sb.append("evseId");
        sb.append('=');
        sb.append(((this.evseId == null)?"<null>":this.evseId));
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
        result = ((result* 31)+((this.evseId == null)? 0 :this.evseId.hashCode()));
        result = ((result* 31)+((this.customData == null)? 0 :this.customData.hashCode()));
        result = ((result* 31)+((this.chargingLimitSource == null)? 0 :this.chargingLimitSource.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ClearedChargingLimitRequest) == false) {
            return false;
        }
        ClearedChargingLimitRequest rhs = ((ClearedChargingLimitRequest) other);
        return ((((this.evseId == rhs.evseId)||((this.evseId!= null)&&this.evseId.equals(rhs.evseId)))&&((this.customData == rhs.customData)||((this.customData!= null)&&this.customData.equals(rhs.customData))))&&((this.chargingLimitSource == rhs.chargingLimitSource)||((this.chargingLimitSource!= null)&&this.chargingLimitSource.equals(rhs.chargingLimitSource))));
    }

}
