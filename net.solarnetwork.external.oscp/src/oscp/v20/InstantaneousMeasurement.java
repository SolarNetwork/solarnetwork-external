
package oscp.v20;

import java.io.Serializable;
import java.time.Instant;
import java.util.HashMap;
import java.util.Map;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * InstantaneousMeasurement
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "value",
    "phase",
    "unit",
    "measure_time"
})
public class InstantaneousMeasurement implements Serializable
{

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("value")
    @NotNull
    private Double value;
    /**
     * PhaseIndicator
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("phase")
    @NotNull
    private oscp.v20.ForecastedBlock.PhaseIndicator phase;
    /**
     * InstantaneousMeasurementUnit
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("unit")
    @NotNull
    private InstantaneousMeasurement.InstantaneousMeasurementUnit unit;
    /**
     * 
     * (Required)
     * 
     */
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss[.SSS]XXX", timezone = "UTC")
    @JsonProperty("measure_time")
    @NotNull
    private Instant measureTime;
    private final static long serialVersionUID = 3448090245491727603L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public InstantaneousMeasurement() {
    }

    /**
     * 
     * @param phase
     * @param unit
     * @param measureTime
     * @param value
     */
    public InstantaneousMeasurement(Double value, oscp.v20.ForecastedBlock.PhaseIndicator phase, InstantaneousMeasurement.InstantaneousMeasurementUnit unit, Instant measureTime) {
        super();
        this.value = value;
        this.phase = phase;
        this.unit = unit;
        this.measureTime = measureTime;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("value")
    public Double getValue() {
        return value;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("value")
    public void setValue(Double value) {
        this.value = value;
    }

    public InstantaneousMeasurement withValue(Double value) {
        this.value = value;
        return this;
    }

    /**
     * PhaseIndicator
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("phase")
    public oscp.v20.ForecastedBlock.PhaseIndicator getPhase() {
        return phase;
    }

    /**
     * PhaseIndicator
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("phase")
    public void setPhase(oscp.v20.ForecastedBlock.PhaseIndicator phase) {
        this.phase = phase;
    }

    public InstantaneousMeasurement withPhase(oscp.v20.ForecastedBlock.PhaseIndicator phase) {
        this.phase = phase;
        return this;
    }

    /**
     * InstantaneousMeasurementUnit
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("unit")
    public InstantaneousMeasurement.InstantaneousMeasurementUnit getUnit() {
        return unit;
    }

    /**
     * InstantaneousMeasurementUnit
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("unit")
    public void setUnit(InstantaneousMeasurement.InstantaneousMeasurementUnit unit) {
        this.unit = unit;
    }

    public InstantaneousMeasurement withUnit(InstantaneousMeasurement.InstantaneousMeasurementUnit unit) {
        this.unit = unit;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("measure_time")
    public Instant getMeasureTime() {
        return measureTime;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("measure_time")
    public void setMeasureTime(Instant measureTime) {
        this.measureTime = measureTime;
    }

    public InstantaneousMeasurement withMeasureTime(Instant measureTime) {
        this.measureTime = measureTime;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(InstantaneousMeasurement.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("value");
        sb.append('=');
        sb.append(((this.value == null)?"<null>":this.value));
        sb.append(',');
        sb.append("phase");
        sb.append('=');
        sb.append(((this.phase == null)?"<null>":this.phase));
        sb.append(',');
        sb.append("unit");
        sb.append('=');
        sb.append(((this.unit == null)?"<null>":this.unit));
        sb.append(',');
        sb.append("measureTime");
        sb.append('=');
        sb.append(((this.measureTime == null)?"<null>":this.measureTime));
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
        result = ((result* 31)+((this.phase == null)? 0 :this.phase.hashCode()));
        result = ((result* 31)+((this.unit == null)? 0 :this.unit.hashCode()));
        result = ((result* 31)+((this.measureTime == null)? 0 :this.measureTime.hashCode()));
        result = ((result* 31)+((this.value == null)? 0 :this.value.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof InstantaneousMeasurement) == false) {
            return false;
        }
        InstantaneousMeasurement rhs = ((InstantaneousMeasurement) other);
        return (((((this.phase == rhs.phase)||((this.phase!= null)&&this.phase.equals(rhs.phase)))&&((this.unit == rhs.unit)||((this.unit!= null)&&this.unit.equals(rhs.unit))))&&((this.measureTime == rhs.measureTime)||((this.measureTime!= null)&&this.measureTime.equals(rhs.measureTime))))&&((this.value == rhs.value)||((this.value!= null)&&this.value.equals(rhs.value))));
    }


    /**
     * InstantaneousMeasurementUnit
     * <p>
     * 
     * 
     */
    public enum InstantaneousMeasurementUnit {

        A("A"),
        W("W"),
        KW("KW"),
        WH("WH"),
        KWH("KWH");
        private final String value;
        private final static Map<String, InstantaneousMeasurement.InstantaneousMeasurementUnit> CONSTANTS = new HashMap<String, InstantaneousMeasurement.InstantaneousMeasurementUnit>();

        static {
            for (InstantaneousMeasurement.InstantaneousMeasurementUnit c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        InstantaneousMeasurementUnit(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        @JsonValue
        public String value() {
            return this.value;
        }

        @JsonCreator
        public static InstantaneousMeasurement.InstantaneousMeasurementUnit fromValue(String value) {
            InstantaneousMeasurement.InstantaneousMeasurementUnit constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
