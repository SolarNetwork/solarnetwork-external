
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
 * GroupCapacityComplianceError
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "message",
    "forecasted_blocks"
})
public class GroupCapacityComplianceError implements Serializable
{

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("message")
    @NotNull
    private String message;
    @JsonProperty("forecasted_blocks")
    @Size(min = 1)
    @Valid
    private List<ForecastedBlock> forecastedBlocks;
    private final static long serialVersionUID = -2528680950866056884L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public GroupCapacityComplianceError() {
    }

    /**
     * 
     * @param message
     */
    public GroupCapacityComplianceError(String message) {
        super();
        this.message = message;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("message")
    public String getMessage() {
        return message;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("message")
    public void setMessage(String message) {
        this.message = message;
    }

    public GroupCapacityComplianceError withMessage(String message) {
        this.message = message;
        return this;
    }

    @JsonProperty("forecasted_blocks")
    public List<ForecastedBlock> getForecastedBlocks() {
        return forecastedBlocks;
    }

    @JsonProperty("forecasted_blocks")
    public void setForecastedBlocks(List<ForecastedBlock> forecastedBlocks) {
        this.forecastedBlocks = forecastedBlocks;
    }

    public GroupCapacityComplianceError withForecastedBlocks(List<ForecastedBlock> forecastedBlocks) {
        this.forecastedBlocks = forecastedBlocks;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(GroupCapacityComplianceError.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("message");
        sb.append('=');
        sb.append(((this.message == null)?"<null>":this.message));
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
        result = ((result* 31)+((this.message == null)? 0 :this.message.hashCode()));
        result = ((result* 31)+((this.forecastedBlocks == null)? 0 :this.forecastedBlocks.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GroupCapacityComplianceError) == false) {
            return false;
        }
        GroupCapacityComplianceError rhs = ((GroupCapacityComplianceError) other);
        return (((this.message == rhs.message)||((this.message!= null)&&this.message.equals(rhs.message)))&&((this.forecastedBlocks == rhs.forecastedBlocks)||((this.forecastedBlocks!= null)&&this.forecastedBlocks.equals(rhs.forecastedBlocks))));
    }

}
