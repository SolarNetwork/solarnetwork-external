
package ocpp.v20;

import java.io.Serializable;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "customData",
    "localAuthorizationList",
    "versionNumber",
    "updateType"
})
public class SendLocalListRequest implements Serializable
{

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     * 
     */
    @JsonProperty("customData")
    @JsonPropertyDescription("This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.")
    private CustomData customData;
    @JsonProperty("localAuthorizationList")
    private List<AuthorizationData> localAuthorizationList;
    /**
     * In case of a full update this is the version number of the full list. In case of a differential update it is the version number of the list after the update has been applied.
     * 
     * (Required)
     * 
     */
    @JsonProperty("versionNumber")
    @JsonPropertyDescription("In case of a full update this is the version number of the full list. In case of a differential update it is the version number of the list after the update has been applied.\r\n")
    private Integer versionNumber;
    /**
     * This contains the type of update (full or differential) of this request.
     * 
     * (Required)
     * 
     */
    @JsonProperty("updateType")
    @JsonPropertyDescription("This contains the type of update (full or differential) of this request.\r\n")
    private UpdateEnum updateType;
    private final static long serialVersionUID = -3717024586532799137L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public SendLocalListRequest() {
    }

    /**
     * 
     * @param versionNumber
     * @param updateType
     */
    public SendLocalListRequest(Integer versionNumber, UpdateEnum updateType) {
        super();
        this.versionNumber = versionNumber;
        this.updateType = updateType;
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

    public SendLocalListRequest withCustomData(CustomData customData) {
        this.customData = customData;
        return this;
    }

    @JsonProperty("localAuthorizationList")
    public List<AuthorizationData> getLocalAuthorizationList() {
        return localAuthorizationList;
    }

    @JsonProperty("localAuthorizationList")
    public void setLocalAuthorizationList(List<AuthorizationData> localAuthorizationList) {
        this.localAuthorizationList = localAuthorizationList;
    }

    public SendLocalListRequest withLocalAuthorizationList(List<AuthorizationData> localAuthorizationList) {
        this.localAuthorizationList = localAuthorizationList;
        return this;
    }

    /**
     * In case of a full update this is the version number of the full list. In case of a differential update it is the version number of the list after the update has been applied.
     * 
     * (Required)
     * 
     */
    @JsonProperty("versionNumber")
    public Integer getVersionNumber() {
        return versionNumber;
    }

    /**
     * In case of a full update this is the version number of the full list. In case of a differential update it is the version number of the list after the update has been applied.
     * 
     * (Required)
     * 
     */
    @JsonProperty("versionNumber")
    public void setVersionNumber(Integer versionNumber) {
        this.versionNumber = versionNumber;
    }

    public SendLocalListRequest withVersionNumber(Integer versionNumber) {
        this.versionNumber = versionNumber;
        return this;
    }

    /**
     * This contains the type of update (full or differential) of this request.
     * 
     * (Required)
     * 
     */
    @JsonProperty("updateType")
    public UpdateEnum getUpdateType() {
        return updateType;
    }

    /**
     * This contains the type of update (full or differential) of this request.
     * 
     * (Required)
     * 
     */
    @JsonProperty("updateType")
    public void setUpdateType(UpdateEnum updateType) {
        this.updateType = updateType;
    }

    public SendLocalListRequest withUpdateType(UpdateEnum updateType) {
        this.updateType = updateType;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SendLocalListRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("customData");
        sb.append('=');
        sb.append(((this.customData == null)?"<null>":this.customData));
        sb.append(',');
        sb.append("localAuthorizationList");
        sb.append('=');
        sb.append(((this.localAuthorizationList == null)?"<null>":this.localAuthorizationList));
        sb.append(',');
        sb.append("versionNumber");
        sb.append('=');
        sb.append(((this.versionNumber == null)?"<null>":this.versionNumber));
        sb.append(',');
        sb.append("updateType");
        sb.append('=');
        sb.append(((this.updateType == null)?"<null>":this.updateType));
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
        result = ((result* 31)+((this.localAuthorizationList == null)? 0 :this.localAuthorizationList.hashCode()));
        result = ((result* 31)+((this.versionNumber == null)? 0 :this.versionNumber.hashCode()));
        result = ((result* 31)+((this.updateType == null)? 0 :this.updateType.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SendLocalListRequest) == false) {
            return false;
        }
        SendLocalListRequest rhs = ((SendLocalListRequest) other);
        return (((((this.customData == rhs.customData)||((this.customData!= null)&&this.customData.equals(rhs.customData)))&&((this.localAuthorizationList == rhs.localAuthorizationList)||((this.localAuthorizationList!= null)&&this.localAuthorizationList.equals(rhs.localAuthorizationList))))&&((this.versionNumber == rhs.versionNumber)||((this.versionNumber!= null)&&this.versionNumber.equals(rhs.versionNumber))))&&((this.updateType == rhs.updateType)||((this.updateType!= null)&&this.updateType.equals(rhs.updateType))));
    }

}
