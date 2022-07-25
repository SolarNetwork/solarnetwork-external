
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
 * Register
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "token",
    "version_url"
})
public class Register implements Serializable
{

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("token")
    @NotNull
    private String token;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("version_url")
    @Size(min = 1)
    @Valid
    @NotNull
    private List<VersionUrl> versionUrl = null;
    private final static long serialVersionUID = 823342430122089681L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Register() {
    }

    /**
     * 
     * @param token
     * @param versionUrl
     */
    public Register(String token, List<VersionUrl> versionUrl) {
        super();
        this.token = token;
        this.versionUrl = versionUrl;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("token")
    public String getToken() {
        return token;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("token")
    public void setToken(String token) {
        this.token = token;
    }

    public Register withToken(String token) {
        this.token = token;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("version_url")
    public List<VersionUrl> getVersionUrl() {
        return versionUrl;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("version_url")
    public void setVersionUrl(List<VersionUrl> versionUrl) {
        this.versionUrl = versionUrl;
    }

    public Register withVersionUrl(List<VersionUrl> versionUrl) {
        this.versionUrl = versionUrl;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Register.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("token");
        sb.append('=');
        sb.append(((this.token == null)?"<null>":this.token));
        sb.append(',');
        sb.append("versionUrl");
        sb.append('=');
        sb.append(((this.versionUrl == null)?"<null>":this.versionUrl));
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
        result = ((result* 31)+((this.token == null)? 0 :this.token.hashCode()));
        result = ((result* 31)+((this.versionUrl == null)? 0 :this.versionUrl.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Register) == false) {
            return false;
        }
        Register rhs = ((Register) other);
        return (((this.token == rhs.token)||((this.token!= null)&&this.token.equals(rhs.token)))&&((this.versionUrl == rhs.versionUrl)||((this.versionUrl!= null)&&this.versionUrl.equals(rhs.versionUrl))));
    }

}
