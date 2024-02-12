
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
    "getVariableData"
})
public class GetVariablesRequest implements Serializable
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
    @JsonProperty("getVariableData")
    private List<GetVariableData> getVariableData;
    private final static long serialVersionUID = -4783899723892234472L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public GetVariablesRequest() {
    }

    /**
     * 
     * @param getVariableData
     */
    public GetVariablesRequest(List<GetVariableData> getVariableData) {
        super();
        this.getVariableData = getVariableData;
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

    public GetVariablesRequest withCustomData(CustomData customData) {
        this.customData = customData;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("getVariableData")
    public List<GetVariableData> getGetVariableData() {
        return getVariableData;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("getVariableData")
    public void setGetVariableData(List<GetVariableData> getVariableData) {
        this.getVariableData = getVariableData;
    }

    public GetVariablesRequest withGetVariableData(List<GetVariableData> getVariableData) {
        this.getVariableData = getVariableData;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(GetVariablesRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("customData");
        sb.append('=');
        sb.append(((this.customData == null)?"<null>":this.customData));
        sb.append(',');
        sb.append("getVariableData");
        sb.append('=');
        sb.append(((this.getVariableData == null)?"<null>":this.getVariableData));
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
        result = ((result* 31)+((this.getVariableData == null)? 0 :this.getVariableData.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GetVariablesRequest) == false) {
            return false;
        }
        GetVariablesRequest rhs = ((GetVariablesRequest) other);
        return (((this.customData == rhs.customData)||((this.customData!= null)&&this.customData.equals(rhs.customData)))&&((this.getVariableData == rhs.getVariableData)||((this.getVariableData!= null)&&this.getVariableData.equals(rhs.getVariableData))));
    }

}
