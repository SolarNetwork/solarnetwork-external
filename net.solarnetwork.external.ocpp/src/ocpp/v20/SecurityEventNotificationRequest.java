
package ocpp.v20;

import java.io.Serializable;
import java.time.Instant;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "customData",
    "type",
    "timestamp",
    "techInfo"
})
public class SecurityEventNotificationRequest implements Serializable
{

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     * 
     */
    @JsonProperty("customData")
    @JsonPropertyDescription("This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.")
    private CustomData customData;
    /**
     * Type of the security event. This value should be taken from the Security events list.
     * 
     * (Required)
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("Type of the security event. This value should be taken from the Security events list.\r\n")
    private String type;
    /**
     * Date and time at which the event occurred.
     * 
     * (Required)
     * 
     */
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss[.SSS]XXX", timezone = "UTC")
    @JsonProperty("timestamp")
    @JsonPropertyDescription("Date and time at which the event occurred.\r\n")
    private Instant timestamp;
    /**
     * Additional information about the occurred security event.
     * 
     * 
     */
    @JsonProperty("techInfo")
    @JsonPropertyDescription("Additional information about the occurred security event.\r\n")
    private String techInfo;
    private final static long serialVersionUID = -1493652008214814677L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public SecurityEventNotificationRequest() {
    }

    /**
     * 
     * @param type
     * @param timestamp
     */
    public SecurityEventNotificationRequest(String type, Instant timestamp) {
        super();
        this.type = type;
        this.timestamp = timestamp;
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

    public SecurityEventNotificationRequest withCustomData(CustomData customData) {
        this.customData = customData;
        return this;
    }

    /**
     * Type of the security event. This value should be taken from the Security events list.
     * 
     * (Required)
     * 
     */
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    /**
     * Type of the security event. This value should be taken from the Security events list.
     * 
     * (Required)
     * 
     */
    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    public SecurityEventNotificationRequest withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Date and time at which the event occurred.
     * 
     * (Required)
     * 
     */
    @JsonProperty("timestamp")
    public Instant getTimestamp() {
        return timestamp;
    }

    /**
     * Date and time at which the event occurred.
     * 
     * (Required)
     * 
     */
    @JsonProperty("timestamp")
    public void setTimestamp(Instant timestamp) {
        this.timestamp = timestamp;
    }

    public SecurityEventNotificationRequest withTimestamp(Instant timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
     * Additional information about the occurred security event.
     * 
     * 
     */
    @JsonProperty("techInfo")
    public String getTechInfo() {
        return techInfo;
    }

    /**
     * Additional information about the occurred security event.
     * 
     * 
     */
    @JsonProperty("techInfo")
    public void setTechInfo(String techInfo) {
        this.techInfo = techInfo;
    }

    public SecurityEventNotificationRequest withTechInfo(String techInfo) {
        this.techInfo = techInfo;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SecurityEventNotificationRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("customData");
        sb.append('=');
        sb.append(((this.customData == null)?"<null>":this.customData));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("timestamp");
        sb.append('=');
        sb.append(((this.timestamp == null)?"<null>":this.timestamp));
        sb.append(',');
        sb.append("techInfo");
        sb.append('=');
        sb.append(((this.techInfo == null)?"<null>":this.techInfo));
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
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.techInfo == null)? 0 :this.techInfo.hashCode()));
        result = ((result* 31)+((this.timestamp == null)? 0 :this.timestamp.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SecurityEventNotificationRequest) == false) {
            return false;
        }
        SecurityEventNotificationRequest rhs = ((SecurityEventNotificationRequest) other);
        return (((((this.customData == rhs.customData)||((this.customData!= null)&&this.customData.equals(rhs.customData)))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.techInfo == rhs.techInfo)||((this.techInfo!= null)&&this.techInfo.equals(rhs.techInfo))))&&((this.timestamp == rhs.timestamp)||((this.timestamp!= null)&&this.timestamp.equals(rhs.timestamp))));
    }

}
