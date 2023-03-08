
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
    "getVariableResult"
})
public class GetVariablesResponse implements Serializable
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
    @JsonProperty("getVariableResult")
    private List<GetVariableResult> getVariableResult;
    private final static long serialVersionUID = -6513213728784368164L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public GetVariablesResponse() {
    }

    /**
     * 
     * @param getVariableResult
     */
    public GetVariablesResponse(List<GetVariableResult> getVariableResult) {
        super();
        this.getVariableResult = getVariableResult;
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

    public GetVariablesResponse withCustomData(CustomData customData) {
        this.customData = customData;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("getVariableResult")
    public List<GetVariableResult> getGetVariableResult() {
        return getVariableResult;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("getVariableResult")
    public void setGetVariableResult(List<GetVariableResult> getVariableResult) {
        this.getVariableResult = getVariableResult;
    }

    public GetVariablesResponse withGetVariableResult(List<GetVariableResult> getVariableResult) {
        this.getVariableResult = getVariableResult;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(GetVariablesResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("customData");
        sb.append('=');
        sb.append(((this.customData == null)?"<null>":this.customData));
        sb.append(',');
        sb.append("getVariableResult");
        sb.append('=');
        sb.append(((this.getVariableResult == null)?"<null>":this.getVariableResult));
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
        result = ((result* 31)+((this.getVariableResult == null)? 0 :this.getVariableResult.hashCode()));
        result = ((result* 31)+((this.customData == null)? 0 :this.customData.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GetVariablesResponse) == false) {
            return false;
        }
        GetVariablesResponse rhs = ((GetVariablesResponse) other);
        return (((this.getVariableResult == rhs.getVariableResult)||((this.getVariableResult!= null)&&this.getVariableResult.equals(rhs.getVariableResult)))&&((this.customData == rhs.customData)||((this.customData!= null)&&this.customData.equals(rhs.customData))));
    }

}
