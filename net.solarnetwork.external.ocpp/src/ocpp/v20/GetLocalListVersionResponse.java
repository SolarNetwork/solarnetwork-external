
package ocpp.v20;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "customData",
    "versionNumber"
})
public class GetLocalListVersionResponse implements Serializable
{

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     * 
     */
    @JsonProperty("customData")
    @JsonPropertyDescription("This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.")
    private CustomData customData;
    /**
     * This contains the current version number of the local authorization list in the Charging Station.
     * 
     * (Required)
     * 
     */
    @JsonProperty("versionNumber")
    @JsonPropertyDescription("This contains the current version number of the local authorization list in the Charging Station.\r\n")
    private Integer versionNumber;
    private final static long serialVersionUID = 7901868943778635419L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public GetLocalListVersionResponse() {
    }

    /**
     * 
     * @param versionNumber
     */
    public GetLocalListVersionResponse(Integer versionNumber) {
        super();
        this.versionNumber = versionNumber;
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

    public GetLocalListVersionResponse withCustomData(CustomData customData) {
        this.customData = customData;
        return this;
    }

    /**
     * This contains the current version number of the local authorization list in the Charging Station.
     * 
     * (Required)
     * 
     */
    @JsonProperty("versionNumber")
    public Integer getVersionNumber() {
        return versionNumber;
    }

    /**
     * This contains the current version number of the local authorization list in the Charging Station.
     * 
     * (Required)
     * 
     */
    @JsonProperty("versionNumber")
    public void setVersionNumber(Integer versionNumber) {
        this.versionNumber = versionNumber;
    }

    public GetLocalListVersionResponse withVersionNumber(Integer versionNumber) {
        this.versionNumber = versionNumber;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(GetLocalListVersionResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("customData");
        sb.append('=');
        sb.append(((this.customData == null)?"<null>":this.customData));
        sb.append(',');
        sb.append("versionNumber");
        sb.append('=');
        sb.append(((this.versionNumber == null)?"<null>":this.versionNumber));
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
        result = ((result* 31)+((this.versionNumber == null)? 0 :this.versionNumber.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GetLocalListVersionResponse) == false) {
            return false;
        }
        GetLocalListVersionResponse rhs = ((GetLocalListVersionResponse) other);
        return (((this.customData == rhs.customData)||((this.customData!= null)&&this.customData.equals(rhs.customData)))&&((this.versionNumber == rhs.versionNumber)||((this.versionNumber!= null)&&this.versionNumber.equals(rhs.versionNumber))));
    }

}
