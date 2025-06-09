
package oscp.v20;

import java.io.Serializable;
import java.time.Instant;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import jakarta.validation.constraints.NotNull;


/**
 * Heartbeat
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "offline_mode_at"
})
public class Heartbeat implements Serializable
{

    /**
     * 
     * (Required)
     * 
     */
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss[.SSS]XXX", timezone = "UTC")
    @JsonProperty("offline_mode_at")
    @NotNull
    private Instant offlineModeAt;
    private final static long serialVersionUID = -4663734864697794508L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Heartbeat() {
    }

    /**
     * 
     * @param offlineModeAt
     */
    public Heartbeat(Instant offlineModeAt) {
        super();
        this.offlineModeAt = offlineModeAt;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("offline_mode_at")
    public Instant getOfflineModeAt() {
        return offlineModeAt;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("offline_mode_at")
    public void setOfflineModeAt(Instant offlineModeAt) {
        this.offlineModeAt = offlineModeAt;
    }

    public Heartbeat withOfflineModeAt(Instant offlineModeAt) {
        this.offlineModeAt = offlineModeAt;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Heartbeat.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("offlineModeAt");
        sb.append('=');
        sb.append(((this.offlineModeAt == null)?"<null>":this.offlineModeAt));
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
        result = ((result* 31)+((this.offlineModeAt == null)? 0 :this.offlineModeAt.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Heartbeat) == false) {
            return false;
        }
        Heartbeat rhs = ((Heartbeat) other);
        return ((this.offlineModeAt == rhs.offlineModeAt)||((this.offlineModeAt!= null)&&this.offlineModeAt.equals(rhs.offlineModeAt)));
    }

}
