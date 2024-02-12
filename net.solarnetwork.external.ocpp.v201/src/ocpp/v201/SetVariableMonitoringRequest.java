
package ocpp.v201;

import java.io.Serializable;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "customData",
    "setMonitoringData"
})
public class SetVariableMonitoringRequest implements Serializable
{

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     * 
     */
    @JsonProperty("customData")
    @JsonPropertyDescription("This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.")
    private CustomData customData;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("setMonitoringData")
    private List<SetMonitoringData> setMonitoringData;
    private final static long serialVersionUID = -1376633927742265881L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public SetVariableMonitoringRequest() {
    }

    /**
     * 
     * @param setMonitoringData
     */
    public SetVariableMonitoringRequest(List<SetMonitoringData> setMonitoringData) {
        super();
        this.setMonitoringData = setMonitoringData;
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

    public SetVariableMonitoringRequest withCustomData(CustomData customData) {
        this.customData = customData;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("setMonitoringData")
    public List<SetMonitoringData> getSetMonitoringData() {
        return setMonitoringData;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("setMonitoringData")
    public void setSetMonitoringData(List<SetMonitoringData> setMonitoringData) {
        this.setMonitoringData = setMonitoringData;
    }

    public SetVariableMonitoringRequest withSetMonitoringData(List<SetMonitoringData> setMonitoringData) {
        this.setMonitoringData = setMonitoringData;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SetVariableMonitoringRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("customData");
        sb.append('=');
        sb.append(((this.customData == null)?"<null>":this.customData));
        sb.append(',');
        sb.append("setMonitoringData");
        sb.append('=');
        sb.append(((this.setMonitoringData == null)?"<null>":this.setMonitoringData));
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
        result = ((result* 31)+((this.customData == null)? 0 :this.customData.hashCode()));
        result = ((result* 31)+((this.setMonitoringData == null)? 0 :this.setMonitoringData.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SetVariableMonitoringRequest) == false) {
            return false;
        }
        SetVariableMonitoringRequest rhs = ((SetVariableMonitoringRequest) other);
        return (((this.customData == rhs.customData)||((this.customData!= null)&&this.customData.equals(rhs.customData)))&&((this.setMonitoringData == rhs.setMonitoringData)||((this.setMonitoringData!= null)&&this.setMonitoringData.equals(rhs.setMonitoringData))));
    }

}
