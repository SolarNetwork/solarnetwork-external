
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
 * ForecastedBlock
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "capacity",
    "phase",
    "unit",
    "start_time",
    "end_time"
})
public class ForecastedBlock implements Serializable
{

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("capacity")
    @NotNull
    private Double capacity;
    /**
     * PhaseIndicator
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("phase")
    @NotNull
    private ForecastedBlock.PhaseIndicator phase;
    /**
     * ForecastedBlockUnit
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("unit")
    @NotNull
    private ForecastedBlock.ForecastedBlockUnit unit;
    /**
     * 
     * (Required)
     * 
     */
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss[.SSS]XXX", timezone = "UTC")
    @JsonProperty("start_time")
    @NotNull
    private Instant startTime;
    /**
     * 
     * (Required)
     * 
     */
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss[.SSS]XXX", timezone = "UTC")
    @JsonProperty("end_time")
    @NotNull
    private Instant endTime;
    private final static long serialVersionUID = -757358111301611556L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ForecastedBlock() {
    }

    /**
     * 
     * @param phase
     * @param unit
     * @param startTime
     * @param endTime
     * @param capacity
     */
    public ForecastedBlock(Double capacity, ForecastedBlock.PhaseIndicator phase, ForecastedBlock.ForecastedBlockUnit unit, Instant startTime, Instant endTime) {
        super();
        this.capacity = capacity;
        this.phase = phase;
        this.unit = unit;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("capacity")
    public Double getCapacity() {
        return capacity;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("capacity")
    public void setCapacity(Double capacity) {
        this.capacity = capacity;
    }

    public ForecastedBlock withCapacity(Double capacity) {
        this.capacity = capacity;
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
    public ForecastedBlock.PhaseIndicator getPhase() {
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
    public void setPhase(ForecastedBlock.PhaseIndicator phase) {
        this.phase = phase;
    }

    public ForecastedBlock withPhase(ForecastedBlock.PhaseIndicator phase) {
        this.phase = phase;
        return this;
    }

    /**
     * ForecastedBlockUnit
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("unit")
    public ForecastedBlock.ForecastedBlockUnit getUnit() {
        return unit;
    }

    /**
     * ForecastedBlockUnit
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("unit")
    public void setUnit(ForecastedBlock.ForecastedBlockUnit unit) {
        this.unit = unit;
    }

    public ForecastedBlock withUnit(ForecastedBlock.ForecastedBlockUnit unit) {
        this.unit = unit;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("start_time")
    public Instant getStartTime() {
        return startTime;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("start_time")
    public void setStartTime(Instant startTime) {
        this.startTime = startTime;
    }

    public ForecastedBlock withStartTime(Instant startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("end_time")
    public Instant getEndTime() {
        return endTime;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("end_time")
    public void setEndTime(Instant endTime) {
        this.endTime = endTime;
    }

    public ForecastedBlock withEndTime(Instant endTime) {
        this.endTime = endTime;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ForecastedBlock.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("capacity");
        sb.append('=');
        sb.append(((this.capacity == null)?"<null>":this.capacity));
        sb.append(',');
        sb.append("phase");
        sb.append('=');
        sb.append(((this.phase == null)?"<null>":this.phase));
        sb.append(',');
        sb.append("unit");
        sb.append('=');
        sb.append(((this.unit == null)?"<null>":this.unit));
        sb.append(',');
        sb.append("startTime");
        sb.append('=');
        sb.append(((this.startTime == null)?"<null>":this.startTime));
        sb.append(',');
        sb.append("endTime");
        sb.append('=');
        sb.append(((this.endTime == null)?"<null>":this.endTime));
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
        result = ((result* 31)+((this.startTime == null)? 0 :this.startTime.hashCode()));
        result = ((result* 31)+((this.endTime == null)? 0 :this.endTime.hashCode()));
        result = ((result* 31)+((this.capacity == null)? 0 :this.capacity.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ForecastedBlock) == false) {
            return false;
        }
        ForecastedBlock rhs = ((ForecastedBlock) other);
        return ((((((this.phase == rhs.phase)||((this.phase!= null)&&this.phase.equals(rhs.phase)))&&((this.unit == rhs.unit)||((this.unit!= null)&&this.unit.equals(rhs.unit))))&&((this.startTime == rhs.startTime)||((this.startTime!= null)&&this.startTime.equals(rhs.startTime))))&&((this.endTime == rhs.endTime)||((this.endTime!= null)&&this.endTime.equals(rhs.endTime))))&&((this.capacity == rhs.capacity)||((this.capacity!= null)&&this.capacity.equals(rhs.capacity))));
    }


    /**
     * ForecastedBlockUnit
     * <p>
     * 
     * 
     */
    public enum ForecastedBlockUnit {

        A("A"),
        W("W"),
        KW("KW"),
        WH("WH"),
        KWH("KWH");
        private final String value;
        private final static Map<String, ForecastedBlock.ForecastedBlockUnit> CONSTANTS = new HashMap<String, ForecastedBlock.ForecastedBlockUnit>();

        static {
            for (ForecastedBlock.ForecastedBlockUnit c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        ForecastedBlockUnit(String value) {
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
        public static ForecastedBlock.ForecastedBlockUnit fromValue(String value) {
            ForecastedBlock.ForecastedBlockUnit constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }


    /**
     * PhaseIndicator
     * <p>
     * 
     * 
     */
    public enum PhaseIndicator {

        UNKNOWN("UNKNOWN"),
        ONE("ONE"),
        TWO("TWO"),
        THREE("THREE"),
        ALL("ALL");
        private final String value;
        private final static Map<String, ForecastedBlock.PhaseIndicator> CONSTANTS = new HashMap<String, ForecastedBlock.PhaseIndicator>();

        static {
            for (ForecastedBlock.PhaseIndicator c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        PhaseIndicator(String value) {
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
        public static ForecastedBlock.PhaseIndicator fromValue(String value) {
            ForecastedBlock.PhaseIndicator constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
