
package ocpp.v201;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "customData",
    "status",
    "statusInfo",
    "ocspResult"
})
public class GetCertificateStatusResponse implements Serializable
{

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     * 
     */
    @JsonProperty("customData")
    @JsonPropertyDescription("This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.")
    private CustomData customData;
    /**
     * This indicates whether the charging station was able to retrieve the OCSP certificate status.
     * 
     * (Required)
     * 
     */
    @JsonProperty("status")
    @JsonPropertyDescription("This indicates whether the charging station was able to retrieve the OCSP certificate status.\r\n")
    private GetCertificateStatusEnum status;
    /**
     * Element providing more information about the status.
     * 
     * 
     */
    @JsonProperty("statusInfo")
    @JsonPropertyDescription("Element providing more information about the status.\r\n")
    private StatusInfo statusInfo;
    /**
     * OCSPResponse class as defined in &lt;&lt;ref-ocpp_security_24, IETF RFC 6960&gt;&gt;. DER encoded (as defined in &lt;&lt;ref-ocpp_security_24, IETF RFC 6960&gt;&gt;), and then base64 encoded. MAY only be omitted when status is not Accepted.
     * 
     * 
     */
    @JsonProperty("ocspResult")
    @JsonPropertyDescription("OCSPResponse class as defined in &lt;&lt;ref-ocpp_security_24, IETF RFC 6960&gt;&gt;. DER encoded (as defined in &lt;&lt;ref-ocpp_security_24, IETF RFC 6960&gt;&gt;), and then base64 encoded. MAY only be omitted when status is not Accepted.\r\n")
    private String ocspResult;
    private final static long serialVersionUID = -5345818844532356253L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public GetCertificateStatusResponse() {
    }

    /**
     * 
     * @param status
     */
    public GetCertificateStatusResponse(GetCertificateStatusEnum status) {
        super();
        this.status = status;
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

    public GetCertificateStatusResponse withCustomData(CustomData customData) {
        this.customData = customData;
        return this;
    }

    /**
     * This indicates whether the charging station was able to retrieve the OCSP certificate status.
     * 
     * (Required)
     * 
     */
    @JsonProperty("status")
    public GetCertificateStatusEnum getStatus() {
        return status;
    }

    /**
     * This indicates whether the charging station was able to retrieve the OCSP certificate status.
     * 
     * (Required)
     * 
     */
    @JsonProperty("status")
    public void setStatus(GetCertificateStatusEnum status) {
        this.status = status;
    }

    public GetCertificateStatusResponse withStatus(GetCertificateStatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * Element providing more information about the status.
     * 
     * 
     */
    @JsonProperty("statusInfo")
    public StatusInfo getStatusInfo() {
        return statusInfo;
    }

    /**
     * Element providing more information about the status.
     * 
     * 
     */
    @JsonProperty("statusInfo")
    public void setStatusInfo(StatusInfo statusInfo) {
        this.statusInfo = statusInfo;
    }

    public GetCertificateStatusResponse withStatusInfo(StatusInfo statusInfo) {
        this.statusInfo = statusInfo;
        return this;
    }

    /**
     * OCSPResponse class as defined in &lt;&lt;ref-ocpp_security_24, IETF RFC 6960&gt;&gt;. DER encoded (as defined in &lt;&lt;ref-ocpp_security_24, IETF RFC 6960&gt;&gt;), and then base64 encoded. MAY only be omitted when status is not Accepted.
     * 
     * 
     */
    @JsonProperty("ocspResult")
    public String getOcspResult() {
        return ocspResult;
    }

    /**
     * OCSPResponse class as defined in &lt;&lt;ref-ocpp_security_24, IETF RFC 6960&gt;&gt;. DER encoded (as defined in &lt;&lt;ref-ocpp_security_24, IETF RFC 6960&gt;&gt;), and then base64 encoded. MAY only be omitted when status is not Accepted.
     * 
     * 
     */
    @JsonProperty("ocspResult")
    public void setOcspResult(String ocspResult) {
        this.ocspResult = ocspResult;
    }

    public GetCertificateStatusResponse withOcspResult(String ocspResult) {
        this.ocspResult = ocspResult;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(GetCertificateStatusResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("customData");
        sb.append('=');
        sb.append(((this.customData == null)?"<null>":this.customData));
        sb.append(',');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
        sb.append(',');
        sb.append("statusInfo");
        sb.append('=');
        sb.append(((this.statusInfo == null)?"<null>":this.statusInfo));
        sb.append(',');
        sb.append("ocspResult");
        sb.append('=');
        sb.append(((this.ocspResult == null)?"<null>":this.ocspResult));
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
        result = ((result* 31)+((this.customData == null)? 0 :this.customData.hashCode()));
        result = ((result* 31)+((this.statusInfo == null)? 0 :this.statusInfo.hashCode()));
        result = ((result* 31)+((this.ocspResult == null)? 0 :this.ocspResult.hashCode()));
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GetCertificateStatusResponse) == false) {
            return false;
        }
        GetCertificateStatusResponse rhs = ((GetCertificateStatusResponse) other);
        return (((((this.customData == rhs.customData)||((this.customData!= null)&&this.customData.equals(rhs.customData)))&&((this.statusInfo == rhs.statusInfo)||((this.statusInfo!= null)&&this.statusInfo.equals(rhs.statusInfo))))&&((this.ocspResult == rhs.ocspResult)||((this.ocspResult!= null)&&this.ocspResult.equals(rhs.ocspResult))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))));
    }

}
