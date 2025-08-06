
package ocpp.v201;

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
    "id",
    "expiryDateTime",
    "connectorType",
    "idToken",
    "evseId",
    "groupIdToken"
})
public class ReserveNowRequest implements Serializable
{

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     * 
     */
    @JsonProperty("customData")
    @JsonPropertyDescription("This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.")
    private CustomData customData;
    /**
     * Id of reservation.
     * 
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("Id of reservation.\r\n")
    private Integer id;
    /**
     * Date and time at which the reservation expires.
     * 
     * (Required)
     * 
     */
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss[.SSS]XXX", timezone = "UTC")
    @JsonProperty("expiryDateTime")
    @JsonPropertyDescription("Date and time at which the reservation expires.\r\n")
    private Instant expiryDateTime;
    /**
     * This field specifies the connector type.
     * 
     * 
     */
    @JsonProperty("connectorType")
    @JsonPropertyDescription("This field specifies the connector type.\r\n")
    private ConnectorEnum connectorType;
    /**
     * Contains a case insensitive identifier to use for the authorization and the type of authorization to support multiple forms of identifiers.
     * 
     * (Required)
     * 
     */
    @JsonProperty("idToken")
    @JsonPropertyDescription("Contains a case insensitive identifier to use for the authorization and the type of authorization to support multiple forms of identifiers.\r\n")
    private IdToken idToken;
    /**
     * This contains ID of the evse to be reserved.
     * 
     * 
     */
    @JsonProperty("evseId")
    @JsonPropertyDescription("This contains ID of the evse to be reserved.\r\n")
    private Integer evseId;
    /**
     * Contains a case insensitive identifier to use for the authorization and the type of authorization to support multiple forms of identifiers.
     * 
     * 
     */
    @JsonProperty("groupIdToken")
    @JsonPropertyDescription("Contains a case insensitive identifier to use for the authorization and the type of authorization to support multiple forms of identifiers.\r\n")
    private IdToken groupIdToken;
    private final static long serialVersionUID = 3981278329784208638L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ReserveNowRequest() {
    }

    /**
     * 
     * @param idToken
     * @param id
     * @param expiryDateTime
     */
    public ReserveNowRequest(Integer id, Instant expiryDateTime, IdToken idToken) {
        super();
        this.id = id;
        this.expiryDateTime = expiryDateTime;
        this.idToken = idToken;
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

    public ReserveNowRequest withCustomData(CustomData customData) {
        this.customData = customData;
        return this;
    }

    /**
     * Id of reservation.
     * 
     * (Required)
     * 
     */
    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    /**
     * Id of reservation.
     * 
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    public ReserveNowRequest withId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * Date and time at which the reservation expires.
     * 
     * (Required)
     * 
     */
    @JsonProperty("expiryDateTime")
    public Instant getExpiryDateTime() {
        return expiryDateTime;
    }

    /**
     * Date and time at which the reservation expires.
     * 
     * (Required)
     * 
     */
    @JsonProperty("expiryDateTime")
    public void setExpiryDateTime(Instant expiryDateTime) {
        this.expiryDateTime = expiryDateTime;
    }

    public ReserveNowRequest withExpiryDateTime(Instant expiryDateTime) {
        this.expiryDateTime = expiryDateTime;
        return this;
    }

    /**
     * This field specifies the connector type.
     * 
     * 
     */
    @JsonProperty("connectorType")
    public ConnectorEnum getConnectorType() {
        return connectorType;
    }

    /**
     * This field specifies the connector type.
     * 
     * 
     */
    @JsonProperty("connectorType")
    public void setConnectorType(ConnectorEnum connectorType) {
        this.connectorType = connectorType;
    }

    public ReserveNowRequest withConnectorType(ConnectorEnum connectorType) {
        this.connectorType = connectorType;
        return this;
    }

    /**
     * Contains a case insensitive identifier to use for the authorization and the type of authorization to support multiple forms of identifiers.
     * 
     * (Required)
     * 
     */
    @JsonProperty("idToken")
    public IdToken getIdToken() {
        return idToken;
    }

    /**
     * Contains a case insensitive identifier to use for the authorization and the type of authorization to support multiple forms of identifiers.
     * 
     * (Required)
     * 
     */
    @JsonProperty("idToken")
    public void setIdToken(IdToken idToken) {
        this.idToken = idToken;
    }

    public ReserveNowRequest withIdToken(IdToken idToken) {
        this.idToken = idToken;
        return this;
    }

    /**
     * This contains ID of the evse to be reserved.
     * 
     * 
     */
    @JsonProperty("evseId")
    public Integer getEvseId() {
        return evseId;
    }

    /**
     * This contains ID of the evse to be reserved.
     * 
     * 
     */
    @JsonProperty("evseId")
    public void setEvseId(Integer evseId) {
        this.evseId = evseId;
    }

    public ReserveNowRequest withEvseId(Integer evseId) {
        this.evseId = evseId;
        return this;
    }

    /**
     * Contains a case insensitive identifier to use for the authorization and the type of authorization to support multiple forms of identifiers.
     * 
     * 
     */
    @JsonProperty("groupIdToken")
    public IdToken getGroupIdToken() {
        return groupIdToken;
    }

    /**
     * Contains a case insensitive identifier to use for the authorization and the type of authorization to support multiple forms of identifiers.
     * 
     * 
     */
    @JsonProperty("groupIdToken")
    public void setGroupIdToken(IdToken groupIdToken) {
        this.groupIdToken = groupIdToken;
    }

    public ReserveNowRequest withGroupIdToken(IdToken groupIdToken) {
        this.groupIdToken = groupIdToken;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ReserveNowRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("customData");
        sb.append('=');
        sb.append(((this.customData == null)?"<null>":this.customData));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("expiryDateTime");
        sb.append('=');
        sb.append(((this.expiryDateTime == null)?"<null>":this.expiryDateTime));
        sb.append(',');
        sb.append("connectorType");
        sb.append('=');
        sb.append(((this.connectorType == null)?"<null>":this.connectorType));
        sb.append(',');
        sb.append("idToken");
        sb.append('=');
        sb.append(((this.idToken == null)?"<null>":this.idToken));
        sb.append(',');
        sb.append("evseId");
        sb.append('=');
        sb.append(((this.evseId == null)?"<null>":this.evseId));
        sb.append(',');
        sb.append("groupIdToken");
        sb.append('=');
        sb.append(((this.groupIdToken == null)?"<null>":this.groupIdToken));
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
        result = ((result* 31)+((this.connectorType == null)? 0 :this.connectorType.hashCode()));
        result = ((result* 31)+((this.idToken == null)? 0 :this.idToken.hashCode()));
        result = ((result* 31)+((this.customData == null)? 0 :this.customData.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.expiryDateTime == null)? 0 :this.expiryDateTime.hashCode()));
        result = ((result* 31)+((this.groupIdToken == null)? 0 :this.groupIdToken.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ReserveNowRequest) == false) {
            return false;
        }
        ReserveNowRequest rhs = ((ReserveNowRequest) other);
        return ((((((((this.evseId == rhs.evseId)||((this.evseId!= null)&&this.evseId.equals(rhs.evseId)))&&((this.connectorType == rhs.connectorType)||((this.connectorType!= null)&&this.connectorType.equals(rhs.connectorType))))&&((this.idToken == rhs.idToken)||((this.idToken!= null)&&this.idToken.equals(rhs.idToken))))&&((this.customData == rhs.customData)||((this.customData!= null)&&this.customData.equals(rhs.customData))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.expiryDateTime == rhs.expiryDateTime)||((this.expiryDateTime!= null)&&this.expiryDateTime.equals(rhs.expiryDateTime))))&&((this.groupIdToken == rhs.groupIdToken)||((this.groupIdToken!= null)&&this.groupIdToken.equals(rhs.groupIdToken))));
    }

}
