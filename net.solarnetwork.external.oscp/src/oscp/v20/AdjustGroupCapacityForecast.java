
package oscp.v20;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * AdjustGroupCapacityForecast
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "group_id",
    "type",
    "forecasted_blocks"
})
public class AdjustGroupCapacityForecast implements Serializable
{

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("group_id")
    @NotNull
    private String groupId;
    /**
     * CapacityForecastType
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("type")
    @NotNull
    private AdjustGroupCapacityForecast.CapacityForecastType type;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("forecasted_blocks")
    @Size(min = 1)
    @Valid
    @NotNull
    private List<ForecastedBlock> forecastedBlocks = null;
    private final static long serialVersionUID = 7346313973919082924L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public AdjustGroupCapacityForecast() {
    }

    /**
     * 
     * @param groupId
     * @param type
     * @param forecastedBlocks
     */
    public AdjustGroupCapacityForecast(String groupId, AdjustGroupCapacityForecast.CapacityForecastType type, List<ForecastedBlock> forecastedBlocks) {
        super();
        this.groupId = groupId;
        this.type = type;
        this.forecastedBlocks = forecastedBlocks;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("group_id")
    public String getGroupId() {
        return groupId;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("group_id")
    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public AdjustGroupCapacityForecast withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * CapacityForecastType
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("type")
    public AdjustGroupCapacityForecast.CapacityForecastType getType() {
        return type;
    }

    /**
     * CapacityForecastType
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("type")
    public void setType(AdjustGroupCapacityForecast.CapacityForecastType type) {
        this.type = type;
    }

    public AdjustGroupCapacityForecast withType(AdjustGroupCapacityForecast.CapacityForecastType type) {
        this.type = type;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("forecasted_blocks")
    public List<ForecastedBlock> getForecastedBlocks() {
        return forecastedBlocks;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("forecasted_blocks")
    public void setForecastedBlocks(List<ForecastedBlock> forecastedBlocks) {
        this.forecastedBlocks = forecastedBlocks;
    }

    public AdjustGroupCapacityForecast withForecastedBlocks(List<ForecastedBlock> forecastedBlocks) {
        this.forecastedBlocks = forecastedBlocks;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AdjustGroupCapacityForecast.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("groupId");
        sb.append('=');
        sb.append(((this.groupId == null)?"<null>":this.groupId));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("forecastedBlocks");
        sb.append('=');
        sb.append(((this.forecastedBlocks == null)?"<null>":this.forecastedBlocks));
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
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.forecastedBlocks == null)? 0 :this.forecastedBlocks.hashCode()));
        result = ((result* 31)+((this.groupId == null)? 0 :this.groupId.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AdjustGroupCapacityForecast) == false) {
            return false;
        }
        AdjustGroupCapacityForecast rhs = ((AdjustGroupCapacityForecast) other);
        return ((((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type)))&&((this.forecastedBlocks == rhs.forecastedBlocks)||((this.forecastedBlocks!= null)&&this.forecastedBlocks.equals(rhs.forecastedBlocks))))&&((this.groupId == rhs.groupId)||((this.groupId!= null)&&this.groupId.equals(rhs.groupId))));
    }


    /**
     * CapacityForecastType
     * <p>
     * 
     * 
     */
    public enum CapacityForecastType {

        CONSUMPTION("CONSUMPTION"),
        GENERATION("GENERATION"),
        FALLBACK_CONSUMPTION("FALLBACK_CONSUMPTION"),
        FALLBACK_GENERATION("FALLBACK_GENERATION"),
        OPTIMUM("OPTIMUM");
        private final String value;
        private final static Map<String, AdjustGroupCapacityForecast.CapacityForecastType> CONSTANTS = new HashMap<String, AdjustGroupCapacityForecast.CapacityForecastType>();

        static {
            for (AdjustGroupCapacityForecast.CapacityForecastType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        CapacityForecastType(String value) {
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
        public static AdjustGroupCapacityForecast.CapacityForecastType fromValue(String value) {
            AdjustGroupCapacityForecast.CapacityForecastType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
