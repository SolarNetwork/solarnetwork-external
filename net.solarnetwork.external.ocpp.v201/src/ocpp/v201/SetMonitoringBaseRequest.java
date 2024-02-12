
package ocpp.v201;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "customData",
    "monitoringBase"
})
public class SetMonitoringBaseRequest implements Serializable
{

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     * 
     */
    @JsonProperty("customData")
    @JsonPropertyDescription("This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.")
    private CustomData customData;
    /**
     * Specify which monitoring base will be set
     * 
     * (Required)
     * 
     */
    @JsonProperty("monitoringBase")
    @JsonPropertyDescription("Specify which monitoring base will be set\r\n")
    private MonitoringBaseEnum monitoringBase;
    private final static long serialVersionUID = 6687520889730508843L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public SetMonitoringBaseRequest() {
    }

    /**
     * 
     * @param monitoringBase
     */
    public SetMonitoringBaseRequest(MonitoringBaseEnum monitoringBase) {
        super();
        this.monitoringBase = monitoringBase;
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

    public SetMonitoringBaseRequest withCustomData(CustomData customData) {
        this.customData = customData;
        return this;
    }

    /**
     * Specify which monitoring base will be set
     * 
     * (Required)
     * 
     */
    @JsonProperty("monitoringBase")
    public MonitoringBaseEnum getMonitoringBase() {
        return monitoringBase;
    }

    /**
     * Specify which monitoring base will be set
     * 
     * (Required)
     * 
     */
    @JsonProperty("monitoringBase")
    public void setMonitoringBase(MonitoringBaseEnum monitoringBase) {
        this.monitoringBase = monitoringBase;
    }

    public SetMonitoringBaseRequest withMonitoringBase(MonitoringBaseEnum monitoringBase) {
        this.monitoringBase = monitoringBase;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SetMonitoringBaseRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("customData");
        sb.append('=');
        sb.append(((this.customData == null)?"<null>":this.customData));
        sb.append(',');
        sb.append("monitoringBase");
        sb.append('=');
        sb.append(((this.monitoringBase == null)?"<null>":this.monitoringBase));
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
        result = ((result* 31)+((this.monitoringBase == null)? 0 :this.monitoringBase.hashCode()));
        result = ((result* 31)+((this.customData == null)? 0 :this.customData.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SetMonitoringBaseRequest) == false) {
            return false;
        }
        SetMonitoringBaseRequest rhs = ((SetMonitoringBaseRequest) other);
        return (((this.monitoringBase == rhs.monitoringBase)||((this.monitoringBase!= null)&&this.monitoringBase.equals(rhs.monitoringBase)))&&((this.customData == rhs.customData)||((this.customData!= null)&&this.customData.equals(rhs.customData))));
    }

}
