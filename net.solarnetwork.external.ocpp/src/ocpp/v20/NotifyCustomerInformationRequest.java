
package ocpp.v20;

import java.io.Serializable;
import java.time.Instant;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "customData",
    "data",
    "tbc",
    "seqNo",
    "generatedAt",
    "requestId"
})
public class NotifyCustomerInformationRequest implements Serializable
{

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     * 
     */
    @JsonProperty("customData")
    @JsonPropertyDescription("This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.")
    private CustomData customData;
    /**
     * (Part of) the requested data. No format specified in which the data is returned. Should be human readable.
     * 
     * (Required)
     * 
     */
    @JsonProperty("data")
    @JsonPropertyDescription("(Part of) the requested data. No format specified in which the data is returned. Should be human readable.\r\n")
    private String data;
    /**
     * “to be continued” indicator. Indicates whether another part of the monitoringData follows in an upcoming notifyMonitoringReportRequest message. Default value when omitted is false.
     * 
     * 
     */
    @JsonProperty("tbc")
    @JsonPropertyDescription("\u201cto be continued\u201d indicator. Indicates whether another part of the monitoringData follows in an upcoming notifyMonitoringReportRequest message. Default value when omitted is false.\r\n")
    private Boolean tbc = false;
    /**
     * Sequence number of this message. First message starts at 0.
     * 
     * (Required)
     * 
     */
    @JsonProperty("seqNo")
    @JsonPropertyDescription("Sequence number of this message. First message starts at 0.\r\n")
    private Integer seqNo;
    /**
     *  Timestamp of the moment this message was generated at the Charging Station.
     * 
     * (Required)
     * 
     */
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss[.SSS]XXX", timezone = "UTC")
    @JsonProperty("generatedAt")
    @JsonPropertyDescription(" Timestamp of the moment this message was generated at the Charging Station.\r\n")
    private Instant generatedAt;
    /**
     * The Id of the request.
     * 
     * 
     * (Required)
     * 
     */
    @JsonProperty("requestId")
    @JsonPropertyDescription("The Id of the request.\r\n\r\n")
    private Integer requestId;
    private final static long serialVersionUID = -954557914470337575L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public NotifyCustomerInformationRequest() {
    }

    /**
     * 
     * @param data
     * @param seqNo
     * @param requestId
     * @param generatedAt
     */
    public NotifyCustomerInformationRequest(String data, Integer seqNo, Instant generatedAt, Integer requestId) {
        super();
        this.data = data;
        this.seqNo = seqNo;
        this.generatedAt = generatedAt;
        this.requestId = requestId;
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

    public NotifyCustomerInformationRequest withCustomData(CustomData customData) {
        this.customData = customData;
        return this;
    }

    /**
     * (Part of) the requested data. No format specified in which the data is returned. Should be human readable.
     * 
     * (Required)
     * 
     */
    @JsonProperty("data")
    public String getData() {
        return data;
    }

    /**
     * (Part of) the requested data. No format specified in which the data is returned. Should be human readable.
     * 
     * (Required)
     * 
     */
    @JsonProperty("data")
    public void setData(String data) {
        this.data = data;
    }

    public NotifyCustomerInformationRequest withData(String data) {
        this.data = data;
        return this;
    }

    /**
     * “to be continued” indicator. Indicates whether another part of the monitoringData follows in an upcoming notifyMonitoringReportRequest message. Default value when omitted is false.
     * 
     * 
     */
    @JsonProperty("tbc")
    public Boolean getTbc() {
        return tbc;
    }

    /**
     * “to be continued” indicator. Indicates whether another part of the monitoringData follows in an upcoming notifyMonitoringReportRequest message. Default value when omitted is false.
     * 
     * 
     */
    @JsonProperty("tbc")
    public void setTbc(Boolean tbc) {
        this.tbc = tbc;
    }

    public NotifyCustomerInformationRequest withTbc(Boolean tbc) {
        this.tbc = tbc;
        return this;
    }

    /**
     * Sequence number of this message. First message starts at 0.
     * 
     * (Required)
     * 
     */
    @JsonProperty("seqNo")
    public Integer getSeqNo() {
        return seqNo;
    }

    /**
     * Sequence number of this message. First message starts at 0.
     * 
     * (Required)
     * 
     */
    @JsonProperty("seqNo")
    public void setSeqNo(Integer seqNo) {
        this.seqNo = seqNo;
    }

    public NotifyCustomerInformationRequest withSeqNo(Integer seqNo) {
        this.seqNo = seqNo;
        return this;
    }

    /**
     *  Timestamp of the moment this message was generated at the Charging Station.
     * 
     * (Required)
     * 
     */
    @JsonProperty("generatedAt")
    public Instant getGeneratedAt() {
        return generatedAt;
    }

    /**
     *  Timestamp of the moment this message was generated at the Charging Station.
     * 
     * (Required)
     * 
     */
    @JsonProperty("generatedAt")
    public void setGeneratedAt(Instant generatedAt) {
        this.generatedAt = generatedAt;
    }

    public NotifyCustomerInformationRequest withGeneratedAt(Instant generatedAt) {
        this.generatedAt = generatedAt;
        return this;
    }

    /**
     * The Id of the request.
     * 
     * 
     * (Required)
     * 
     */
    @JsonProperty("requestId")
    public Integer getRequestId() {
        return requestId;
    }

    /**
     * The Id of the request.
     * 
     * 
     * (Required)
     * 
     */
    @JsonProperty("requestId")
    public void setRequestId(Integer requestId) {
        this.requestId = requestId;
    }

    public NotifyCustomerInformationRequest withRequestId(Integer requestId) {
        this.requestId = requestId;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(NotifyCustomerInformationRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("customData");
        sb.append('=');
        sb.append(((this.customData == null)?"<null>":this.customData));
        sb.append(',');
        sb.append("data");
        sb.append('=');
        sb.append(((this.data == null)?"<null>":this.data));
        sb.append(',');
        sb.append("tbc");
        sb.append('=');
        sb.append(((this.tbc == null)?"<null>":this.tbc));
        sb.append(',');
        sb.append("seqNo");
        sb.append('=');
        sb.append(((this.seqNo == null)?"<null>":this.seqNo));
        sb.append(',');
        sb.append("generatedAt");
        sb.append('=');
        sb.append(((this.generatedAt == null)?"<null>":this.generatedAt));
        sb.append(',');
        sb.append("requestId");
        sb.append('=');
        sb.append(((this.requestId == null)?"<null>":this.requestId));
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
        result = ((result* 31)+((this.data == null)? 0 :this.data.hashCode()));
        result = ((result* 31)+((this.tbc == null)? 0 :this.tbc.hashCode()));
        result = ((result* 31)+((this.seqNo == null)? 0 :this.seqNo.hashCode()));
        result = ((result* 31)+((this.requestId == null)? 0 :this.requestId.hashCode()));
        result = ((result* 31)+((this.generatedAt == null)? 0 :this.generatedAt.hashCode()));
        result = ((result* 31)+((this.customData == null)? 0 :this.customData.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof NotifyCustomerInformationRequest) == false) {
            return false;
        }
        NotifyCustomerInformationRequest rhs = ((NotifyCustomerInformationRequest) other);
        return (((((((this.data == rhs.data)||((this.data!= null)&&this.data.equals(rhs.data)))&&((this.tbc == rhs.tbc)||((this.tbc!= null)&&this.tbc.equals(rhs.tbc))))&&((this.seqNo == rhs.seqNo)||((this.seqNo!= null)&&this.seqNo.equals(rhs.seqNo))))&&((this.requestId == rhs.requestId)||((this.requestId!= null)&&this.requestId.equals(rhs.requestId))))&&((this.generatedAt == rhs.generatedAt)||((this.generatedAt!= null)&&this.generatedAt.equals(rhs.generatedAt))))&&((this.customData == rhs.customData)||((this.customData!= null)&&this.customData.equals(rhs.customData))));
    }

}
