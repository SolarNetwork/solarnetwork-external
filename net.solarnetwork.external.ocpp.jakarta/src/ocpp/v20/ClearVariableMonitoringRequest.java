
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
    "id"
})
public class ClearVariableMonitoringRequest implements Serializable
{

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     * 
     */
    @JsonProperty("customData")
    @JsonPropertyDescription("This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.")
    private CustomData customData;
    /**
     * List of the monitors to be cleared, identified by there Id.
     * 
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("List of the monitors to be cleared, identified by there Id.\r\n")
    private List<Integer> id;
    private final static long serialVersionUID = 5241224757412349034L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ClearVariableMonitoringRequest() {
    }

    /**
     * 
     * @param id
     */
    public ClearVariableMonitoringRequest(List<Integer> id) {
        super();
        this.id = id;
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

    public ClearVariableMonitoringRequest withCustomData(CustomData customData) {
        this.customData = customData;
        return this;
    }

    /**
     * List of the monitors to be cleared, identified by there Id.
     * 
     * (Required)
     * 
     */
    @JsonProperty("id")
    public List<Integer> getId() {
        return id;
    }

    /**
     * List of the monitors to be cleared, identified by there Id.
     * 
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(List<Integer> id) {
        this.id = id;
    }

    public ClearVariableMonitoringRequest withId(List<Integer> id) {
        this.id = id;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ClearVariableMonitoringRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("customData");
        sb.append('=');
        sb.append(((this.customData == null)?"<null>":this.customData));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
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
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ClearVariableMonitoringRequest) == false) {
            return false;
        }
        ClearVariableMonitoringRequest rhs = ((ClearVariableMonitoringRequest) other);
        return (((this.customData == rhs.customData)||((this.customData!= null)&&this.customData.equals(rhs.customData)))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))));
    }

}
