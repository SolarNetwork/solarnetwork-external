
package ocpp.v201;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "customData",
    "certificateType",
    "certificate"
})
public class InstallCertificateRequest implements Serializable
{

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     * 
     */
    @JsonProperty("customData")
    @JsonPropertyDescription("This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.")
    private CustomData customData;
    /**
     * Indicates the certificate type that is sent.
     * 
     * (Required)
     * 
     */
    @JsonProperty("certificateType")
    @JsonPropertyDescription("Indicates the certificate type that is sent.\r\n")
    private InstallCertificateUseEnum certificateType;
    /**
     * A PEM encoded X.509 certificate.
     * 
     * (Required)
     * 
     */
    @JsonProperty("certificate")
    @JsonPropertyDescription("A PEM encoded X.509 certificate.\r\n")
    private String certificate;
    private final static long serialVersionUID = 64441740250719139L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public InstallCertificateRequest() {
    }

    /**
     * 
     * @param certificate
     * @param certificateType
     */
    public InstallCertificateRequest(InstallCertificateUseEnum certificateType, String certificate) {
        super();
        this.certificateType = certificateType;
        this.certificate = certificate;
    }

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     * 
     */
    @JsonProperty("customData")
    public CustomData getCustomData() {
        return customData;
    }

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     * 
     */
    @JsonProperty("customData")
    public void setCustomData(CustomData customData) {
        this.customData = customData;
    }

    public InstallCertificateRequest withCustomData(CustomData customData) {
        this.customData = customData;
        return this;
    }

    /**
     * Indicates the certificate type that is sent.
     * 
     * (Required)
     * 
     */
    @JsonProperty("certificateType")
    public InstallCertificateUseEnum getCertificateType() {
        return certificateType;
    }

    /**
     * Indicates the certificate type that is sent.
     * 
     * (Required)
     * 
     */
    @JsonProperty("certificateType")
    public void setCertificateType(InstallCertificateUseEnum certificateType) {
        this.certificateType = certificateType;
    }

    public InstallCertificateRequest withCertificateType(InstallCertificateUseEnum certificateType) {
        this.certificateType = certificateType;
        return this;
    }

    /**
     * A PEM encoded X.509 certificate.
     * 
     * (Required)
     * 
     */
    @JsonProperty("certificate")
    public String getCertificate() {
        return certificate;
    }

    /**
     * A PEM encoded X.509 certificate.
     * 
     * (Required)
     * 
     */
    @JsonProperty("certificate")
    public void setCertificate(String certificate) {
        this.certificate = certificate;
    }

    public InstallCertificateRequest withCertificate(String certificate) {
        this.certificate = certificate;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(InstallCertificateRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("customData");
        sb.append('=');
        sb.append(((this.customData == null)?"<null>":this.customData));
        sb.append(',');
        sb.append("certificateType");
        sb.append('=');
        sb.append(((this.certificateType == null)?"<null>":this.certificateType));
        sb.append(',');
        sb.append("certificate");
        sb.append('=');
        sb.append(((this.certificate == null)?"<null>":this.certificate));
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
        result = ((result* 31)+((this.certificate == null)? 0 :this.certificate.hashCode()));
        result = ((result* 31)+((this.customData == null)? 0 :this.customData.hashCode()));
        result = ((result* 31)+((this.certificateType == null)? 0 :this.certificateType.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof InstallCertificateRequest) == false) {
            return false;
        }
        InstallCertificateRequest rhs = ((InstallCertificateRequest) other);
        return ((((this.certificate == rhs.certificate)||((this.certificate!= null)&&this.certificate.equals(rhs.certificate)))&&((this.customData == rhs.customData)||((this.customData!= null)&&this.customData.equals(rhs.customData))))&&((this.certificateType == rhs.certificateType)||((this.certificateType!= null)&&this.certificateType.equals(rhs.certificateType))));
    }

}
