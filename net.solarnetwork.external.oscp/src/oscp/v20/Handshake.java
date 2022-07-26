
package oscp.v20;

import java.io.Serializable;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Handshake
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "required_behaviour"
})
public class Handshake implements Serializable
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
    private final static long serialVersionUID = 7155808513762110968L;

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

    public Handshake withRequiredBehaviour(RequiredBehaviour requiredBehaviour) {
        this.requiredBehaviour = requiredBehaviour;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Handshake.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        if ((other instanceof Handshake) == false) {
            return false;
        }
        Handshake rhs = ((Handshake) other);
        return ((this.requiredBehaviour == rhs.requiredBehaviour)||((this.requiredBehaviour!= null)&&this.requiredBehaviour.equals(rhs.requiredBehaviour)));
    }

}
