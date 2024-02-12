
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
    "setVariableData"
})
public class SetVariablesRequest implements Serializable
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
    @JsonProperty("setVariableData")
    private List<SetVariableData> setVariableData;
    private final static long serialVersionUID = -5631942669699115336L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public SetVariablesRequest() {
    }

    /**
     * 
     * @param setVariableData
     */
    public SetVariablesRequest(List<SetVariableData> setVariableData) {
        super();
        this.setVariableData = setVariableData;
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

    public SetVariablesRequest withCustomData(CustomData customData) {
        this.customData = customData;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("setVariableData")
    public List<SetVariableData> getSetVariableData() {
        return setVariableData;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("setVariableData")
    public void setSetVariableData(List<SetVariableData> setVariableData) {
        this.setVariableData = setVariableData;
    }

    public SetVariablesRequest withSetVariableData(List<SetVariableData> setVariableData) {
        this.setVariableData = setVariableData;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SetVariablesRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("customData");
        sb.append('=');
        sb.append(((this.customData == null)?"<null>":this.customData));
        sb.append(',');
        sb.append("setVariableData");
        sb.append('=');
        sb.append(((this.setVariableData == null)?"<null>":this.setVariableData));
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
        result = ((result* 31)+((this.setVariableData == null)? 0 :this.setVariableData.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SetVariablesRequest) == false) {
            return false;
        }
        SetVariablesRequest rhs = ((SetVariablesRequest) other);
        return (((this.customData == rhs.customData)||((this.customData!= null)&&this.customData.equals(rhs.customData)))&&((this.setVariableData == rhs.setVariableData)||((this.setVariableData!= null)&&this.setVariableData.equals(rhs.setVariableData))));
    }

}
