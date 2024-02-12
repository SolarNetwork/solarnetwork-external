
package ocpp.v201;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "customData",
    "requestId",
    "evseId",
    "chargingProfile"
})
public class GetChargingProfilesRequest implements Serializable
{

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     * 
     */
    @JsonProperty("customData")
    @JsonPropertyDescription("This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.")
    private CustomData customData;
    /**
     * Reference identification that is to be used by the Charging Station in the &lt;&lt;reportchargingprofilesrequest, ReportChargingProfilesRequest&gt;&gt; when provided.
     * 
     * (Required)
     * 
     */
    @JsonProperty("requestId")
    @JsonPropertyDescription("Reference identification that is to be used by the Charging Station in the &lt;&lt;reportchargingprofilesrequest, ReportChargingProfilesRequest&gt;&gt; when provided.\r\n")
    private Integer requestId;
    /**
     * For which EVSE installed charging profiles SHALL be reported. If 0, only charging profiles installed on the Charging Station itself (the grid connection) SHALL be reported. If omitted, all installed charging profiles SHALL be reported.
     * 
     * 
     */
    @JsonProperty("evseId")
    @JsonPropertyDescription("For which EVSE installed charging profiles SHALL be reported. If 0, only charging profiles installed on the Charging Station itself (the grid connection) SHALL be reported. If omitted, all installed charging profiles SHALL be reported.\r\n")
    private Integer evseId;
    /**
     * Charging_ Profile
     * urn:x-oca:ocpp:uid:2:233255
     * A ChargingProfile consists of ChargingSchedule, describing the amount of power or current that can be delivered per time interval.
     * 
     * (Required)
     * 
     */
    @JsonProperty("chargingProfile")
    @JsonPropertyDescription("Charging_ Profile\r\nurn:x-oca:ocpp:uid:2:233255\r\nA ChargingProfile consists of ChargingSchedule, describing the amount of power or current that can be delivered per time interval.\r\n")
    private ChargingProfileCriterion chargingProfile;
    private final static long serialVersionUID = -1269481933705418467L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public GetChargingProfilesRequest() {
    }

    /**
     * 
     * @param requestId
     * @param chargingProfile
     */
    public GetChargingProfilesRequest(Integer requestId, ChargingProfileCriterion chargingProfile) {
        super();
        this.requestId = requestId;
        this.chargingProfile = chargingProfile;
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

    public GetChargingProfilesRequest withCustomData(CustomData customData) {
        this.customData = customData;
        return this;
    }

    /**
     * Reference identification that is to be used by the Charging Station in the &lt;&lt;reportchargingprofilesrequest, ReportChargingProfilesRequest&gt;&gt; when provided.
     * 
     * (Required)
     * 
     */
    @JsonProperty("requestId")
    public Integer getRequestId() {
        return requestId;
    }

    /**
     * Reference identification that is to be used by the Charging Station in the &lt;&lt;reportchargingprofilesrequest, ReportChargingProfilesRequest&gt;&gt; when provided.
     * 
     * (Required)
     * 
     */
    @JsonProperty("requestId")
    public void setRequestId(Integer requestId) {
        this.requestId = requestId;
    }

    public GetChargingProfilesRequest withRequestId(Integer requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * For which EVSE installed charging profiles SHALL be reported. If 0, only charging profiles installed on the Charging Station itself (the grid connection) SHALL be reported. If omitted, all installed charging profiles SHALL be reported.
     * 
     * 
     */
    @JsonProperty("evseId")
    public Integer getEvseId() {
        return evseId;
    }

    /**
     * For which EVSE installed charging profiles SHALL be reported. If 0, only charging profiles installed on the Charging Station itself (the grid connection) SHALL be reported. If omitted, all installed charging profiles SHALL be reported.
     * 
     * 
     */
    @JsonProperty("evseId")
    public void setEvseId(Integer evseId) {
        this.evseId = evseId;
    }

    public GetChargingProfilesRequest withEvseId(Integer evseId) {
        this.evseId = evseId;
        return this;
    }

    /**
     * Charging_ Profile
     * urn:x-oca:ocpp:uid:2:233255
     * A ChargingProfile consists of ChargingSchedule, describing the amount of power or current that can be delivered per time interval.
     * 
     * (Required)
     * 
     */
    @JsonProperty("chargingProfile")
    public ChargingProfileCriterion getChargingProfile() {
        return chargingProfile;
    }

    /**
     * Charging_ Profile
     * urn:x-oca:ocpp:uid:2:233255
     * A ChargingProfile consists of ChargingSchedule, describing the amount of power or current that can be delivered per time interval.
     * 
     * (Required)
     * 
     */
    @JsonProperty("chargingProfile")
    public void setChargingProfile(ChargingProfileCriterion chargingProfile) {
        this.chargingProfile = chargingProfile;
    }

    public GetChargingProfilesRequest withChargingProfile(ChargingProfileCriterion chargingProfile) {
        this.chargingProfile = chargingProfile;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(GetChargingProfilesRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("customData");
        sb.append('=');
        sb.append(((this.customData == null)?"<null>":this.customData));
        sb.append(',');
        sb.append("requestId");
        sb.append('=');
        sb.append(((this.requestId == null)?"<null>":this.requestId));
        sb.append(',');
        sb.append("evseId");
        sb.append('=');
        sb.append(((this.evseId == null)?"<null>":this.evseId));
        sb.append(',');
        sb.append("chargingProfile");
        sb.append('=');
        sb.append(((this.chargingProfile == null)?"<null>":this.chargingProfile));
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
        result = ((result* 31)+((this.evseId == null)? 0 :this.evseId.hashCode()));
        result = ((result* 31)+((this.chargingProfile == null)? 0 :this.chargingProfile.hashCode()));
        result = ((result* 31)+((this.customData == null)? 0 :this.customData.hashCode()));
        result = ((result* 31)+((this.requestId == null)? 0 :this.requestId.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GetChargingProfilesRequest) == false) {
            return false;
        }
        GetChargingProfilesRequest rhs = ((GetChargingProfilesRequest) other);
        return (((((this.evseId == rhs.evseId)||((this.evseId!= null)&&this.evseId.equals(rhs.evseId)))&&((this.chargingProfile == rhs.chargingProfile)||((this.chargingProfile!= null)&&this.chargingProfile.equals(rhs.chargingProfile))))&&((this.customData == rhs.customData)||((this.customData!= null)&&this.customData.equals(rhs.customData))))&&((this.requestId == rhs.requestId)||((this.requestId!= null)&&this.requestId.equals(rhs.requestId))));
    }

}
