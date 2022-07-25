
package oscp.v20;

import java.io.Serializable;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * VersionUrl
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "version",
    "base_url"
})
public class VersionUrl implements Serializable
{

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("version")
    @NotNull
    private String version;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("base_url")
    @NotNull
    private String baseUrl;
    private final static long serialVersionUID = -265209414826877202L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public VersionUrl() {
    }

    /**
     * 
     * @param baseUrl
     * @param version
     */
    public VersionUrl(String version, String baseUrl) {
        super();
        this.version = version;
        this.baseUrl = baseUrl;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("version")
    public String getVersion() {
        return version;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("version")
    public void setVersion(String version) {
        this.version = version;
    }

    public VersionUrl withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("base_url")
    public String getBaseUrl() {
        return baseUrl;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("base_url")
    public void setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    public VersionUrl withBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(VersionUrl.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("version");
        sb.append('=');
        sb.append(((this.version == null)?"<null>":this.version));
        sb.append(',');
        sb.append("baseUrl");
        sb.append('=');
        sb.append(((this.baseUrl == null)?"<null>":this.baseUrl));
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
        result = ((result* 31)+((this.version == null)? 0 :this.version.hashCode()));
        result = ((result* 31)+((this.baseUrl == null)? 0 :this.baseUrl.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof VersionUrl) == false) {
            return false;
        }
        VersionUrl rhs = ((VersionUrl) other);
        return (((this.version == rhs.version)||((this.version!= null)&&this.version.equals(rhs.version)))&&((this.baseUrl == rhs.baseUrl)||((this.baseUrl!= null)&&this.baseUrl.equals(rhs.baseUrl))));
    }

}
