
package ocpp.v20;

import java.io.Serializable;
import java.time.Instant;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Meter_ Value
 * urn:x-oca:ocpp:uid:2:233265
 * Collection of one or more sampled values in MeterValuesRequest and TransactionEvent. All sampled values in a MeterValue are sampled at the same point in time.
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "customData",
    "sampledValue",
    "timestamp"
})
public class MeterValue implements Serializable
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
    @JsonProperty("sampledValue")
    private List<SampledValue> sampledValue;
    /**
     * Meter_ Value. Timestamp. Date_ Time
     * urn:x-oca:ocpp:uid:1:569259
     * Timestamp for measured value(s).
     * 
     * (Required)
     * 
     */
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss[.SSS]XXX", timezone = "UTC")
    @JsonProperty("timestamp")
    @JsonPropertyDescription("Meter_ Value. Timestamp. Date_ Time\r\nurn:x-oca:ocpp:uid:1:569259\r\nTimestamp for measured value(s).\r\n")
    private Instant timestamp;
    private final static long serialVersionUID = 4098645661969345848L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public MeterValue() {
    }

    /**
     * 
     * @param sampledValue
     * @param timestamp
     */
    public MeterValue(List<SampledValue> sampledValue, Instant timestamp) {
        super();
        this.sampledValue = sampledValue;
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

    public MeterValue withCustomData(CustomData customData) {
        this.customData = customData;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("sampledValue")
    public List<SampledValue> getSampledValue() {
        return sampledValue;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("sampledValue")
    public void setSampledValue(List<SampledValue> sampledValue) {
        this.sampledValue = sampledValue;
    }

    public MeterValue withSampledValue(List<SampledValue> sampledValue) {
        this.sampledValue = sampledValue;
        return this;
    }

    /**
     * Meter_ Value. Timestamp. Date_ Time
     * urn:x-oca:ocpp:uid:1:569259
     * Timestamp for measured value(s).
     * 
     * (Required)
     * 
     */
    @JsonProperty("timestamp")
    public Instant getTimestamp() {
        return timestamp;
    }

    /**
     * Meter_ Value. Timestamp. Date_ Time
     * urn:x-oca:ocpp:uid:1:569259
     * Timestamp for measured value(s).
     * 
     * (Required)
     * 
     */
    @JsonProperty("timestamp")
    public void setTimestamp(Instant timestamp) {
        this.timestamp = timestamp;
    }

    public MeterValue withTimestamp(Instant timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(MeterValue.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("customData");
        sb.append('=');
        sb.append(((this.customData == null)?"<null>":this.customData));
        sb.append(',');
        sb.append("sampledValue");
        sb.append('=');
        sb.append(((this.sampledValue == null)?"<null>":this.sampledValue));
        sb.append(',');
        sb.append("timestamp");
        sb.append('=');
        sb.append(((this.timestamp == null)?"<null>":this.timestamp));
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
        result = ((result* 31)+((this.sampledValue == null)? 0 :this.sampledValue.hashCode()));
        result = ((result* 31)+((this.timestamp == null)? 0 :this.timestamp.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MeterValue) == false) {
            return false;
        }
        MeterValue rhs = ((MeterValue) other);
        return ((((this.customData == rhs.customData)||((this.customData!= null)&&this.customData.equals(rhs.customData)))&&((this.sampledValue == rhs.sampledValue)||((this.sampledValue!= null)&&this.sampledValue.equals(rhs.sampledValue))))&&((this.timestamp == rhs.timestamp)||((this.timestamp!= null)&&this.timestamp.equals(rhs.timestamp))));
    }

}
