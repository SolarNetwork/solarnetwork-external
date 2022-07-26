
package oscp.v20;

import java.io.Serializable;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * UpdateGroupMeasurements
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "group_id",
    "measurements"
})
public class UpdateGroupMeasurements implements Serializable
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
     * 
     * (Required)
     * 
     */
    @JsonProperty("measurements")
    @Size(min = 1)
    @Valid
    @NotNull
    private List<EnergyMeasurement> measurements = null;
    private final static long serialVersionUID = 4329526292399582528L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public UpdateGroupMeasurements() {
    }

    /**
     * 
     * @param groupId
     * @param measurements
     */
    public UpdateGroupMeasurements(String groupId, List<EnergyMeasurement> measurements) {
        super();
        this.groupId = groupId;
        this.measurements = measurements;
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

    public UpdateGroupMeasurements withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("measurements")
    public List<EnergyMeasurement> getMeasurements() {
        return measurements;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("measurements")
    public void setMeasurements(List<EnergyMeasurement> measurements) {
        this.measurements = measurements;
    }

    public UpdateGroupMeasurements withMeasurements(List<EnergyMeasurement> measurements) {
        this.measurements = measurements;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(UpdateGroupMeasurements.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("groupId");
        sb.append('=');
        sb.append(((this.groupId == null)?"<null>":this.groupId));
        sb.append(',');
        sb.append("measurements");
        sb.append('=');
        sb.append(((this.measurements == null)?"<null>":this.measurements));
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
        result = ((result* 31)+((this.groupId == null)? 0 :this.groupId.hashCode()));
        result = ((result* 31)+((this.measurements == null)? 0 :this.measurements.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof UpdateGroupMeasurements) == false) {
            return false;
        }
        UpdateGroupMeasurements rhs = ((UpdateGroupMeasurements) other);
        return (((this.groupId == rhs.groupId)||((this.groupId!= null)&&this.groupId.equals(rhs.groupId)))&&((this.measurements == rhs.measurements)||((this.measurements!= null)&&this.measurements.equals(rhs.measurements))));
    }

}
