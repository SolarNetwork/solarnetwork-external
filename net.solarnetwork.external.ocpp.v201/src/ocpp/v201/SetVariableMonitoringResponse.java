
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
    "setMonitoringResult"
})
public class SetVariableMonitoringResponse implements Serializable
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
    @JsonProperty("setMonitoringResult")
    private List<SetMonitoringResult> setMonitoringResult;
    private final static long serialVersionUID = -5366980697514800839L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public SetVariableMonitoringResponse() {
    }

    /**
     * 
     * @param setMonitoringResult
     */
    public SetVariableMonitoringResponse(List<SetMonitoringResult> setMonitoringResult) {
        super();
        this.setMonitoringResult = setMonitoringResult;
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

    public SetVariableMonitoringResponse withCustomData(CustomData customData) {
        this.customData = customData;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("setMonitoringResult")
    public List<SetMonitoringResult> getSetMonitoringResult() {
        return setMonitoringResult;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("setMonitoringResult")
    public void setSetMonitoringResult(List<SetMonitoringResult> setMonitoringResult) {
        this.setMonitoringResult = setMonitoringResult;
    }

    public SetVariableMonitoringResponse withSetMonitoringResult(List<SetMonitoringResult> setMonitoringResult) {
        this.setMonitoringResult = setMonitoringResult;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SetVariableMonitoringResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("customData");
        sb.append('=');
        sb.append(((this.customData == null)?"<null>":this.customData));
        sb.append(',');
        sb.append("setMonitoringResult");
        sb.append('=');
        sb.append(((this.setMonitoringResult == null)?"<null>":this.setMonitoringResult));
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
        result = ((result* 31)+((this.setMonitoringResult == null)? 0 :this.setMonitoringResult.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SetVariableMonitoringResponse) == false) {
            return false;
        }
        SetVariableMonitoringResponse rhs = ((SetVariableMonitoringResponse) other);
        return (((this.customData == rhs.customData)||((this.customData!= null)&&this.customData.equals(rhs.customData)))&&((this.setMonitoringResult == rhs.setMonitoringResult)||((this.setMonitoringResult!= null)&&this.setMonitoringResult.equals(rhs.setMonitoringResult))));
    }

}
