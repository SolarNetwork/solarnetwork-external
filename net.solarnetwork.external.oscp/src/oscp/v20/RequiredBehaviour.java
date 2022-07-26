
package oscp.v20;

import java.io.Serializable;
import java.util.Set;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;


/**
 * RequiredBehaviour
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "heartbeat_interval",
    "measurement_configuration"
})
public class RequiredBehaviour implements Serializable
{

    @JsonProperty("heartbeat_interval")
    private Double heartbeatInterval;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("measurement_configuration")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @Valid
    @NotNull
    private Set<MeasurementConfiguration> measurementConfiguration = null;
    private final static long serialVersionUID = -2258017324424731500L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public RequiredBehaviour() {
    }

    /**
     * 
     * @param measurementConfiguration
     */
    public RequiredBehaviour(Set<MeasurementConfiguration> measurementConfiguration) {
        super();
        this.measurementConfiguration = measurementConfiguration;
    }

    @JsonProperty("heartbeat_interval")
    public Double getHeartbeatInterval() {
        return heartbeatInterval;
    }

    @JsonProperty("heartbeat_interval")
    public void setHeartbeatInterval(Double heartbeatInterval) {
        this.heartbeatInterval = heartbeatInterval;
    }

    public RequiredBehaviour withHeartbeatInterval(Double heartbeatInterval) {
        this.heartbeatInterval = heartbeatInterval;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("measurement_configuration")
    public Set<MeasurementConfiguration> getMeasurementConfiguration() {
        return measurementConfiguration;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("measurement_configuration")
    public void setMeasurementConfiguration(Set<MeasurementConfiguration> measurementConfiguration) {
        this.measurementConfiguration = measurementConfiguration;
    }

    public RequiredBehaviour withMeasurementConfiguration(Set<MeasurementConfiguration> measurementConfiguration) {
        this.measurementConfiguration = measurementConfiguration;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(RequiredBehaviour.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("heartbeatInterval");
        sb.append('=');
        sb.append(((this.heartbeatInterval == null)?"<null>":this.heartbeatInterval));
        sb.append(',');
        sb.append("measurementConfiguration");
        sb.append('=');
        sb.append(((this.measurementConfiguration == null)?"<null>":this.measurementConfiguration));
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
        result = ((result* 31)+((this.heartbeatInterval == null)? 0 :this.heartbeatInterval.hashCode()));
        result = ((result* 31)+((this.measurementConfiguration == null)? 0 :this.measurementConfiguration.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RequiredBehaviour) == false) {
            return false;
        }
        RequiredBehaviour rhs = ((RequiredBehaviour) other);
        return (((this.heartbeatInterval == rhs.heartbeatInterval)||((this.heartbeatInterval!= null)&&this.heartbeatInterval.equals(rhs.heartbeatInterval)))&&((this.measurementConfiguration == rhs.measurementConfiguration)||((this.measurementConfiguration!= null)&&this.measurementConfiguration.equals(rhs.measurementConfiguration))));
    }

}
