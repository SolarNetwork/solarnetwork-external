
package ocpp.v20;

import java.io.Serializable;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "customData",
    "clearMonitoringResult"
})
public class ClearVariableMonitoringResponse implements Serializable
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
    @JsonProperty("clearMonitoringResult")
    private List<ClearMonitoringResult> clearMonitoringResult;
    private final static long serialVersionUID = 7667751524536296991L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ClearVariableMonitoringResponse() {
    }

    /**
     * 
     * @param clearMonitoringResult
     */
    public ClearVariableMonitoringResponse(List<ClearMonitoringResult> clearMonitoringResult) {
        super();
        this.clearMonitoringResult = clearMonitoringResult;
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

    public ClearVariableMonitoringResponse withCustomData(CustomData customData) {
        this.customData = customData;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("clearMonitoringResult")
    public List<ClearMonitoringResult> getClearMonitoringResult() {
        return clearMonitoringResult;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("clearMonitoringResult")
    public void setClearMonitoringResult(List<ClearMonitoringResult> clearMonitoringResult) {
        this.clearMonitoringResult = clearMonitoringResult;
    }

    public ClearVariableMonitoringResponse withClearMonitoringResult(List<ClearMonitoringResult> clearMonitoringResult) {
        this.clearMonitoringResult = clearMonitoringResult;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ClearVariableMonitoringResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("customData");
        sb.append('=');
        sb.append(((this.customData == null)?"<null>":this.customData));
        sb.append(',');
        sb.append("clearMonitoringResult");
        sb.append('=');
        sb.append(((this.clearMonitoringResult == null)?"<null>":this.clearMonitoringResult));
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
        result = ((result* 31)+((this.clearMonitoringResult == null)? 0 :this.clearMonitoringResult.hashCode()));
        result = ((result* 31)+((this.customData == null)? 0 :this.customData.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ClearVariableMonitoringResponse) == false) {
            return false;
        }
        ClearVariableMonitoringResponse rhs = ((ClearVariableMonitoringResponse) other);
        return (((this.clearMonitoringResult == rhs.clearMonitoringResult)||((this.clearMonitoringResult!= null)&&this.clearMonitoringResult.equals(rhs.clearMonitoringResult)))&&((this.customData == rhs.customData)||((this.customData!= null)&&this.customData.equals(rhs.customData))));
    }

}
