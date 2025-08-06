
package oscp.v20;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import jakarta.validation.Valid;


/**
 * HandshakeAcknowledge
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "required_behaviour"
})
public class HandshakeAcknowledge implements Serializable
{

    /**
     * RequiredBehaviour
     * <p>
     * 
     * 
     */
    @JsonProperty("required_behaviour")
    @Valid
    private RequiredBehaviour requiredBehaviour;
    private final static long serialVersionUID = 6726145068763819222L;

    /**
     * RequiredBehaviour
     * <p>
     * 
     * 
     */
    @JsonProperty("required_behaviour")
    public RequiredBehaviour getRequiredBehaviour() {
        return requiredBehaviour;
    }

    /**
     * RequiredBehaviour
     * <p>
     * 
     * 
     */
    @JsonProperty("required_behaviour")
    public void setRequiredBehaviour(RequiredBehaviour requiredBehaviour) {
        this.requiredBehaviour = requiredBehaviour;
    }

    public HandshakeAcknowledge withRequiredBehaviour(RequiredBehaviour requiredBehaviour) {
        this.requiredBehaviour = requiredBehaviour;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(HandshakeAcknowledge.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("requiredBehaviour");
        sb.append('=');
        sb.append(((this.requiredBehaviour == null)?"<null>":this.requiredBehaviour));
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
        result = ((result* 31)+((this.requiredBehaviour == null)? 0 :this.requiredBehaviour.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof HandshakeAcknowledge) == false) {
            return false;
        }
        HandshakeAcknowledge rhs = ((HandshakeAcknowledge) other);
        return ((this.requiredBehaviour == rhs.requiredBehaviour)||((this.requiredBehaviour!= null)&&this.requiredBehaviour.equals(rhs.requiredBehaviour)));
    }

}
