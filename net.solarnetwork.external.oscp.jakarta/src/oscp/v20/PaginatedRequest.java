
package oscp.v20;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import jakarta.validation.constraints.NotNull;


/**
 * PaginatedRequest
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "segment_index",
    "segment_count"
})
public class PaginatedRequest implements Serializable
{

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("segment_index")
    @NotNull
    private Integer segmentIndex;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("segment_count")
    @NotNull
    private Integer segmentCount;
    private final static long serialVersionUID = 8181989962409997931L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public PaginatedRequest() {
    }

    /**
     * 
     * @param segmentIndex
     * @param segmentCount
     */
    public PaginatedRequest(Integer segmentIndex, Integer segmentCount) {
        super();
        this.segmentIndex = segmentIndex;
        this.segmentCount = segmentCount;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("segment_index")
    public Integer getSegmentIndex() {
        return segmentIndex;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("segment_index")
    public void setSegmentIndex(Integer segmentIndex) {
        this.segmentIndex = segmentIndex;
    }

    public PaginatedRequest withSegmentIndex(Integer segmentIndex) {
        this.segmentIndex = segmentIndex;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("segment_count")
    public Integer getSegmentCount() {
        return segmentCount;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("segment_count")
    public void setSegmentCount(Integer segmentCount) {
        this.segmentCount = segmentCount;
    }

    public PaginatedRequest withSegmentCount(Integer segmentCount) {
        this.segmentCount = segmentCount;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PaginatedRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("segmentIndex");
        sb.append('=');
        sb.append(((this.segmentIndex == null)?"<null>":this.segmentIndex));
        sb.append(',');
        sb.append("segmentCount");
        sb.append('=');
        sb.append(((this.segmentCount == null)?"<null>":this.segmentCount));
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
        result = ((result* 31)+((this.segmentIndex == null)? 0 :this.segmentIndex.hashCode()));
        result = ((result* 31)+((this.segmentCount == null)? 0 :this.segmentCount.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PaginatedRequest) == false) {
            return false;
        }
        PaginatedRequest rhs = ((PaginatedRequest) other);
        return (((this.segmentIndex == rhs.segmentIndex)||((this.segmentIndex!= null)&&this.segmentIndex.equals(rhs.segmentIndex)))&&((this.segmentCount == rhs.segmentCount)||((this.segmentCount!= null)&&this.segmentCount.equals(rhs.segmentCount))));
    }

}
