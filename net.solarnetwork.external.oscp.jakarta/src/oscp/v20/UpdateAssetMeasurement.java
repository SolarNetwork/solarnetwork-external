
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
 * UpdateAssetMeasurement
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "group_id",
    "measurements"
})
public class UpdateAssetMeasurement implements Serializable
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
    private List<AssetMeasurement> measurements;
    private final static long serialVersionUID = -5397680364364669077L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public UpdateAssetMeasurement() {
    }

    /**
     * 
     * @param groupId
     * @param measurements
     */
    public UpdateAssetMeasurement(String groupId, List<AssetMeasurement> measurements) {
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

    public UpdateAssetMeasurement withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("measurements")
    public List<AssetMeasurement> getMeasurements() {
        return measurements;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("measurements")
    public void setMeasurements(List<AssetMeasurement> measurements) {
        this.measurements = measurements;
    }

    public UpdateAssetMeasurement withMeasurements(List<AssetMeasurement> measurements) {
        this.measurements = measurements;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(UpdateAssetMeasurement.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        if ((other instanceof UpdateAssetMeasurement) == false) {
            return false;
        }
        UpdateAssetMeasurement rhs = ((UpdateAssetMeasurement) other);
        return (((this.groupId == rhs.groupId)||((this.groupId!= null)&&this.groupId.equals(rhs.groupId)))&&((this.measurements == rhs.measurements)||((this.measurements!= null)&&this.measurements.equals(rhs.measurements))));
    }

}
