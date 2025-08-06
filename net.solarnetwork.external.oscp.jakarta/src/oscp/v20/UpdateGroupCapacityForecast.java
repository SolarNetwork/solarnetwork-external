
package oscp.v20;

import java.io.Serializable;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;


/**
 * UpdateGroupCapacityForecast
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
public class UpdateGroupCapacityForecast implements Serializable
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
    private oscp.v20.AdjustGroupCapacityForecast.CapacityForecastType type;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("forecasted_blocks")
    @Size(min = 1)
    @Valid
    @NotNull
    private List<ForecastedBlock> forecastedBlocks;
    private final static long serialVersionUID = 5749926407378226220L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public UpdateGroupCapacityForecast() {
    }

    /**
     * 
     * @param groupId
     * @param type
     * @param forecastedBlocks
     */
    public UpdateGroupCapacityForecast(String groupId, oscp.v20.AdjustGroupCapacityForecast.CapacityForecastType type, List<ForecastedBlock> forecastedBlocks) {
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

    public UpdateGroupCapacityForecast withGroupId(String groupId) {
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
    public oscp.v20.AdjustGroupCapacityForecast.CapacityForecastType getType() {
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
    public void setType(oscp.v20.AdjustGroupCapacityForecast.CapacityForecastType type) {
        this.type = type;
    }

    public UpdateGroupCapacityForecast withType(oscp.v20.AdjustGroupCapacityForecast.CapacityForecastType type) {
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

    public UpdateGroupCapacityForecast withForecastedBlocks(List<ForecastedBlock> forecastedBlocks) {
        this.forecastedBlocks = forecastedBlocks;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(UpdateGroupCapacityForecast.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        if ((other instanceof UpdateGroupCapacityForecast) == false) {
            return false;
        }
        UpdateGroupCapacityForecast rhs = ((UpdateGroupCapacityForecast) other);
        return ((((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type)))&&((this.forecastedBlocks == rhs.forecastedBlocks)||((this.forecastedBlocks!= null)&&this.forecastedBlocks.equals(rhs.forecastedBlocks))))&&((this.groupId == rhs.groupId)||((this.groupId!= null)&&this.groupId.equals(rhs.groupId))));
    }

}
