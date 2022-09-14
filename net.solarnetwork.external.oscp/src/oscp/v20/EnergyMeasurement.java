
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
 * EnergyMeasurement
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "value",
    "phase",
    "unit",
    "direction",
    "energy_type",
    "measure_time",
    "initial_measure_time"
})
public class EnergyMeasurement implements Serializable
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
     * EnergyMeasurementUnit
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("unit")
    @NotNull
    private EnergyMeasurement.EnergyMeasurementUnit unit;
    /**
     * EnergyFlowDirection
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("direction")
    @NotNull
    private EnergyMeasurement.EnergyFlowDirection direction;
    /**
     * EnergyType
     * <p>
     * 
     * 
     */
    @JsonProperty("energy_type")
    private EnergyMeasurement.EnergyType energyType;
    /**
     * 
     * (Required)
     * 
     */
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss[.SSS]XXX", timezone = "UTC")
    @JsonProperty("measure_time")
    @NotNull
    private Instant measureTime;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss[.SSS]XXX", timezone = "UTC")
    @JsonProperty("initial_measure_time")
    private Instant initialMeasureTime;
    private final static long serialVersionUID = 1914323984074794574L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public EnergyMeasurement() {
    }

    /**
     * 
     * @param phase
     * @param unit
     * @param measureTime
     * @param value
     * @param direction
     */
    public EnergyMeasurement(Double value, oscp.v20.ForecastedBlock.PhaseIndicator phase, EnergyMeasurement.EnergyMeasurementUnit unit, EnergyMeasurement.EnergyFlowDirection direction, Instant measureTime) {
        super();
        this.value = value;
        this.phase = phase;
        this.unit = unit;
        this.direction = direction;
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

    public EnergyMeasurement withValue(Double value) {
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

    public EnergyMeasurement withPhase(oscp.v20.ForecastedBlock.PhaseIndicator phase) {
        this.phase = phase;
        return this;
    }

    /**
     * EnergyMeasurementUnit
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("unit")
    public EnergyMeasurement.EnergyMeasurementUnit getUnit() {
        return unit;
    }

    /**
     * EnergyMeasurementUnit
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("unit")
    public void setUnit(EnergyMeasurement.EnergyMeasurementUnit unit) {
        this.unit = unit;
    }

    public EnergyMeasurement withUnit(EnergyMeasurement.EnergyMeasurementUnit unit) {
        this.unit = unit;
        return this;
    }

    /**
     * EnergyFlowDirection
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("direction")
    public EnergyMeasurement.EnergyFlowDirection getDirection() {
        return direction;
    }

    /**
     * EnergyFlowDirection
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("direction")
    public void setDirection(EnergyMeasurement.EnergyFlowDirection direction) {
        this.direction = direction;
    }

    public EnergyMeasurement withDirection(EnergyMeasurement.EnergyFlowDirection direction) {
        this.direction = direction;
        return this;
    }

    /**
     * EnergyType
     * <p>
     * 
     * 
     */
    @JsonProperty("energy_type")
    public EnergyMeasurement.EnergyType getEnergyType() {
        return energyType;
    }

    /**
     * EnergyType
     * <p>
     * 
     * 
     */
    @JsonProperty("energy_type")
    public void setEnergyType(EnergyMeasurement.EnergyType energyType) {
        this.energyType = energyType;
    }

    public EnergyMeasurement withEnergyType(EnergyMeasurement.EnergyType energyType) {
        this.energyType = energyType;
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

    public EnergyMeasurement withMeasureTime(Instant measureTime) {
        this.measureTime = measureTime;
        return this;
    }

    @JsonProperty("initial_measure_time")
    public Instant getInitialMeasureTime() {
        return initialMeasureTime;
    }

    @JsonProperty("initial_measure_time")
    public void setInitialMeasureTime(Instant initialMeasureTime) {
        this.initialMeasureTime = initialMeasureTime;
    }

    public EnergyMeasurement withInitialMeasureTime(Instant initialMeasureTime) {
        this.initialMeasureTime = initialMeasureTime;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(EnergyMeasurement.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("direction");
        sb.append('=');
        sb.append(((this.direction == null)?"<null>":this.direction));
        sb.append(',');
        sb.append("energyType");
        sb.append('=');
        sb.append(((this.energyType == null)?"<null>":this.energyType));
        sb.append(',');
        sb.append("measureTime");
        sb.append('=');
        sb.append(((this.measureTime == null)?"<null>":this.measureTime));
        sb.append(',');
        sb.append("initialMeasureTime");
        sb.append('=');
        sb.append(((this.initialMeasureTime == null)?"<null>":this.initialMeasureTime));
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
        result = ((result* 31)+((this.energyType == null)? 0 :this.energyType.hashCode()));
        result = ((result* 31)+((this.unit == null)? 0 :this.unit.hashCode()));
        result = ((result* 31)+((this.initialMeasureTime == null)? 0 :this.initialMeasureTime.hashCode()));
        result = ((result* 31)+((this.measureTime == null)? 0 :this.measureTime.hashCode()));
        result = ((result* 31)+((this.value == null)? 0 :this.value.hashCode()));
        result = ((result* 31)+((this.direction == null)? 0 :this.direction.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EnergyMeasurement) == false) {
            return false;
        }
        EnergyMeasurement rhs = ((EnergyMeasurement) other);
        return ((((((((this.phase == rhs.phase)||((this.phase!= null)&&this.phase.equals(rhs.phase)))&&((this.energyType == rhs.energyType)||((this.energyType!= null)&&this.energyType.equals(rhs.energyType))))&&((this.unit == rhs.unit)||((this.unit!= null)&&this.unit.equals(rhs.unit))))&&((this.initialMeasureTime == rhs.initialMeasureTime)||((this.initialMeasureTime!= null)&&this.initialMeasureTime.equals(rhs.initialMeasureTime))))&&((this.measureTime == rhs.measureTime)||((this.measureTime!= null)&&this.measureTime.equals(rhs.measureTime))))&&((this.value == rhs.value)||((this.value!= null)&&this.value.equals(rhs.value))))&&((this.direction == rhs.direction)||((this.direction!= null)&&this.direction.equals(rhs.direction))));
    }


    /**
     * EnergyFlowDirection
     * <p>
     * 
     * 
     */
    public enum EnergyFlowDirection {

        NET("NET"),
        IMPORT("IMPORT"),
        EXPORT("EXPORT");
        private final String value;
        private final static Map<String, EnergyMeasurement.EnergyFlowDirection> CONSTANTS = new HashMap<String, EnergyMeasurement.EnergyFlowDirection>();

        static {
            for (EnergyMeasurement.EnergyFlowDirection c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        EnergyFlowDirection(String value) {
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
        public static EnergyMeasurement.EnergyFlowDirection fromValue(String value) {
            EnergyMeasurement.EnergyFlowDirection constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }


    /**
     * EnergyMeasurementUnit
     * <p>
     * 
     * 
     */
    public enum EnergyMeasurementUnit {

        WH("WH"),
        KWH("KWH");
        private final String value;
        private final static Map<String, EnergyMeasurement.EnergyMeasurementUnit> CONSTANTS = new HashMap<String, EnergyMeasurement.EnergyMeasurementUnit>();

        static {
            for (EnergyMeasurement.EnergyMeasurementUnit c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        EnergyMeasurementUnit(String value) {
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
        public static EnergyMeasurement.EnergyMeasurementUnit fromValue(String value) {
            EnergyMeasurement.EnergyMeasurementUnit constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }


    /**
     * EnergyType
     * <p>
     * 
     * 
     */
    public enum EnergyType {

        FLEXIBLE("FLEXIBLE"),
        NONFLEXIBLE("NONFLEXIBLE"),
        TOTAL("TOTAL");
        private final String value;
        private final static Map<String, EnergyMeasurement.EnergyType> CONSTANTS = new HashMap<String, EnergyMeasurement.EnergyType>();

        static {
            for (EnergyMeasurement.EnergyType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        EnergyType(String value) {
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
        public static EnergyMeasurement.EnergyType fromValue(String value) {
            EnergyMeasurement.EnergyType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
