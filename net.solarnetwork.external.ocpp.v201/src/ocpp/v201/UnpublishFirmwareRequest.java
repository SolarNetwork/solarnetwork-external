
package ocpp.v201;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "customData",
    "checksum"
})
public class UnpublishFirmwareRequest implements Serializable
{

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     * 
     */
    @JsonProperty("customData")
    @JsonPropertyDescription("This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.")
    private CustomData customData;
    /**
     * The MD5 checksum over the entire firmware file as a hexadecimal string of length 32. 
     * 
     * (Required)
     * 
     */
    @JsonProperty("checksum")
    @JsonPropertyDescription("The MD5 checksum over the entire firmware file as a hexadecimal string of length 32. \r\n")
    private String checksum;
    private final static long serialVersionUID = -8492382615467742871L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public UnpublishFirmwareRequest() {
    }

    /**
     * 
     * @param checksum
     */
    public UnpublishFirmwareRequest(String checksum) {
        super();
        this.checksum = checksum;
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

    public UnpublishFirmwareRequest withCustomData(CustomData customData) {
        this.customData = customData;
        return this;
    }

    /**
     * The MD5 checksum over the entire firmware file as a hexadecimal string of length 32. 
     * 
     * (Required)
     * 
     */
    @JsonProperty("checksum")
    public String getChecksum() {
        return checksum;
    }

    /**
     * The MD5 checksum over the entire firmware file as a hexadecimal string of length 32. 
     * 
     * (Required)
     * 
     */
    @JsonProperty("checksum")
    public void setChecksum(String checksum) {
        this.checksum = checksum;
    }

    public UnpublishFirmwareRequest withChecksum(String checksum) {
        this.checksum = checksum;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(UnpublishFirmwareRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("customData");
        sb.append('=');
        sb.append(((this.customData == null)?"<null>":this.customData));
        sb.append(',');
        sb.append("checksum");
        sb.append('=');
        sb.append(((this.checksum == null)?"<null>":this.checksum));
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
        result = ((result* 31)+((this.checksum == null)? 0 :this.checksum.hashCode()));
        result = ((result* 31)+((this.customData == null)? 0 :this.customData.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof UnpublishFirmwareRequest) == false) {
            return false;
        }
        UnpublishFirmwareRequest rhs = ((UnpublishFirmwareRequest) other);
        return (((this.checksum == rhs.checksum)||((this.checksum!= null)&&this.checksum.equals(rhs.checksum)))&&((this.customData == rhs.customData)||((this.customData!= null)&&this.customData.equals(rhs.customData))));
    }

}
