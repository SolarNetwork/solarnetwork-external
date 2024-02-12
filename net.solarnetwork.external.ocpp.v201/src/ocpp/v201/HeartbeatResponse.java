
package ocpp.v201;

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
    "currentTime"
})
public class HeartbeatResponse implements Serializable
{

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     * 
     */
    @JsonProperty("customData")
    @JsonPropertyDescription("This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.")
    private CustomData customData;
    /**
     * Contains the current time of the CSMS.
     * 
     * (Required)
     * 
     */
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss[.SSS]XXX", timezone = "UTC")
    @JsonProperty("currentTime")
    @JsonPropertyDescription("Contains the current time of the CSMS.\r\n")
    private Instant currentTime;
    private final static long serialVersionUID = 8000307332408245541L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public HeartbeatResponse() {
    }

    /**
     * 
     * @param currentTime
     */
    public HeartbeatResponse(Instant currentTime) {
        super();
        this.currentTime = currentTime;
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

    public HeartbeatResponse withCustomData(CustomData customData) {
        this.customData = customData;
        return this;
    }

    /**
     * Contains the current time of the CSMS.
     * 
     * (Required)
     * 
     */
    @JsonProperty("currentTime")
    public Instant getCurrentTime() {
        return currentTime;
    }

    /**
     * Contains the current time of the CSMS.
     * 
     * (Required)
     * 
     */
    @JsonProperty("currentTime")
    public void setCurrentTime(Instant currentTime) {
        this.currentTime = currentTime;
    }

    public HeartbeatResponse withCurrentTime(Instant currentTime) {
        this.currentTime = currentTime;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(HeartbeatResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("customData");
        sb.append('=');
        sb.append(((this.customData == null)?"<null>":this.customData));
        sb.append(',');
        sb.append("currentTime");
        sb.append('=');
        sb.append(((this.currentTime == null)?"<null>":this.currentTime));
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
        result = ((result* 31)+((this.currentTime == null)? 0 :this.currentTime.hashCode()));
        result = ((result* 31)+((this.customData == null)? 0 :this.customData.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof HeartbeatResponse) == false) {
            return false;
        }
        HeartbeatResponse rhs = ((HeartbeatResponse) other);
        return (((this.currentTime == rhs.currentTime)||((this.currentTime!= null)&&this.currentTime.equals(rhs.currentTime)))&&((this.customData == rhs.customData)||((this.customData!= null)&&this.customData.equals(rhs.customData))));
    }

}
