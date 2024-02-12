
package ocpp.v201;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * A monitoring setting for a variable.
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "customData",
    "id",
    "transaction",
    "value",
    "type",
    "severity"
})
public class VariableMonitoring implements Serializable
{

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     * 
     */
    @JsonProperty("customData")
    @JsonPropertyDescription("This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.")
    private CustomData customData;
    /**
     * Identifies the monitor.
     * 
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("Identifies the monitor.\r\n")
    private Integer id;
    /**
     * Monitor only active when a transaction is ongoing on a component relevant to this transaction. 
     * 
     * (Required)
     * 
     */
    @JsonProperty("transaction")
    @JsonPropertyDescription("Monitor only active when a transaction is ongoing on a component relevant to this transaction. \r\n")
    private Boolean transaction;
    /**
     * Value for threshold or delta monitoring.
     * For Periodic or PeriodicClockAligned this is the interval in seconds.
     * 
     * (Required)
     * 
     */
    @JsonProperty("value")
    @JsonPropertyDescription("Value for threshold or delta monitoring.\r\nFor Periodic or PeriodicClockAligned this is the interval in seconds.\r\n")
    private Double value;
    /**
     * The type of this monitor, e.g. a threshold, delta or periodic monitor. 
     * 
     * (Required)
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("The type of this monitor, e.g. a threshold, delta or periodic monitor. \r\n")
    private MonitorEnum type;
    /**
     * The severity that will be assigned to an event that is triggered by this monitor. The severity range is 0-9, with 0 as the highest and 9 as the lowest severity level.
     * 
     * The severity levels have the following meaning: +
     * *0-Danger* +
     * Indicates lives are potentially in danger. Urgent attention is needed and action should be taken immediately. +
     * *1-Hardware Failure* +
     * Indicates that the Charging Station is unable to continue regular operations due to Hardware issues. Action is required. +
     * *2-System Failure* +
     * Indicates that the Charging Station is unable to continue regular operations due to software or minor hardware issues. Action is required. +
     * *3-Critical* +
     * Indicates a critical error. Action is required. +
     * *4-Error* +
     * Indicates a non-urgent error. Action is required. +
     * *5-Alert* +
     * Indicates an alert event. Default severity for any type of monitoring event.  +
     * *6-Warning* +
     * Indicates a warning event. Action may be required. +
     * *7-Notice* +
     * Indicates an unusual event. No immediate action is required. +
     * *8-Informational* +
     * Indicates a regular operational event. May be used for reporting, measuring throughput, etc. No action is required. +
     * *9-Debug* +
     * Indicates information useful to developers for debugging, not useful during operations.
     * 
     * (Required)
     * 
     */
    @JsonProperty("severity")
    @JsonPropertyDescription("The severity that will be assigned to an event that is triggered by this monitor. The severity range is 0-9, with 0 as the highest and 9 as the lowest severity level.\r\n\r\nThe severity levels have the following meaning: +\r\n*0-Danger* +\r\nIndicates lives are potentially in danger. Urgent attention is needed and action should be taken immediately. +\r\n*1-Hardware Failure* +\r\nIndicates that the Charging Station is unable to continue regular operations due to Hardware issues. Action is required. +\r\n*2-System Failure* +\r\nIndicates that the Charging Station is unable to continue regular operations due to software or minor hardware issues. Action is required. +\r\n*3-Critical* +\r\nIndicates a critical error. Action is required. +\r\n*4-Error* +\r\nIndicates a non-urgent error. Action is required. +\r\n*5-Alert* +\r\nIndicates an alert event. Default severity for any type of monitoring event.  +\r\n*6-Warning* +\r\nIndicates a warning event. Action may be required. +\r\n*7-Notice* +\r\nIndicates an unusual event. No immediate action is required. +\r\n*8-Informational* +\r\nIndicates a regular operational event. May be used for reporting, measuring throughput, etc. No action is required. +\r\n*9-Debug* +\r\nIndicates information useful to developers for debugging, not useful during operations.\r\n")
    private Integer severity;
    private final static long serialVersionUID = 5712739285062378501L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public VariableMonitoring() {
    }

    /**
     * 
     * @param severity
     * @param id
     * @param type
     * @param value
     * @param transaction
     */
    public VariableMonitoring(Integer id, Boolean transaction, Double value, MonitorEnum type, Integer severity) {
        super();
        this.id = id;
        this.transaction = transaction;
        this.value = value;
        this.type = type;
        this.severity = severity;
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

    public VariableMonitoring withCustomData(CustomData customData) {
        this.customData = customData;
        return this;
    }

    /**
     * Identifies the monitor.
     * 
     * (Required)
     * 
     */
    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    /**
     * Identifies the monitor.
     * 
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    public VariableMonitoring withId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * Monitor only active when a transaction is ongoing on a component relevant to this transaction. 
     * 
     * (Required)
     * 
     */
    @JsonProperty("transaction")
    public Boolean getTransaction() {
        return transaction;
    }

    /**
     * Monitor only active when a transaction is ongoing on a component relevant to this transaction. 
     * 
     * (Required)
     * 
     */
    @JsonProperty("transaction")
    public void setTransaction(Boolean transaction) {
        this.transaction = transaction;
    }

    public VariableMonitoring withTransaction(Boolean transaction) {
        this.transaction = transaction;
        return this;
    }

    /**
     * Value for threshold or delta monitoring.
     * For Periodic or PeriodicClockAligned this is the interval in seconds.
     * 
     * (Required)
     * 
     */
    @JsonProperty("value")
    public Double getValue() {
        return value;
    }

    /**
     * Value for threshold or delta monitoring.
     * For Periodic or PeriodicClockAligned this is the interval in seconds.
     * 
     * (Required)
     * 
     */
    @JsonProperty("value")
    public void setValue(Double value) {
        this.value = value;
    }

    public VariableMonitoring withValue(Double value) {
        this.value = value;
        return this;
    }

    /**
     * The type of this monitor, e.g. a threshold, delta or periodic monitor. 
     * 
     * (Required)
     * 
     */
    @JsonProperty("type")
    public MonitorEnum getType() {
        return type;
    }

    /**
     * The type of this monitor, e.g. a threshold, delta or periodic monitor. 
     * 
     * (Required)
     * 
     */
    @JsonProperty("type")
    public void setType(MonitorEnum type) {
        this.type = type;
    }

    public VariableMonitoring withType(MonitorEnum type) {
        this.type = type;
        return this;
    }

    /**
     * The severity that will be assigned to an event that is triggered by this monitor. The severity range is 0-9, with 0 as the highest and 9 as the lowest severity level.
     * 
     * The severity levels have the following meaning: +
     * *0-Danger* +
     * Indicates lives are potentially in danger. Urgent attention is needed and action should be taken immediately. +
     * *1-Hardware Failure* +
     * Indicates that the Charging Station is unable to continue regular operations due to Hardware issues. Action is required. +
     * *2-System Failure* +
     * Indicates that the Charging Station is unable to continue regular operations due to software or minor hardware issues. Action is required. +
     * *3-Critical* +
     * Indicates a critical error. Action is required. +
     * *4-Error* +
     * Indicates a non-urgent error. Action is required. +
     * *5-Alert* +
     * Indicates an alert event. Default severity for any type of monitoring event.  +
     * *6-Warning* +
     * Indicates a warning event. Action may be required. +
     * *7-Notice* +
     * Indicates an unusual event. No immediate action is required. +
     * *8-Informational* +
     * Indicates a regular operational event. May be used for reporting, measuring throughput, etc. No action is required. +
     * *9-Debug* +
     * Indicates information useful to developers for debugging, not useful during operations.
     * 
     * (Required)
     * 
     */
    @JsonProperty("severity")
    public Integer getSeverity() {
        return severity;
    }

    /**
     * The severity that will be assigned to an event that is triggered by this monitor. The severity range is 0-9, with 0 as the highest and 9 as the lowest severity level.
     * 
     * The severity levels have the following meaning: +
     * *0-Danger* +
     * Indicates lives are potentially in danger. Urgent attention is needed and action should be taken immediately. +
     * *1-Hardware Failure* +
     * Indicates that the Charging Station is unable to continue regular operations due to Hardware issues. Action is required. +
     * *2-System Failure* +
     * Indicates that the Charging Station is unable to continue regular operations due to software or minor hardware issues. Action is required. +
     * *3-Critical* +
     * Indicates a critical error. Action is required. +
     * *4-Error* +
     * Indicates a non-urgent error. Action is required. +
     * *5-Alert* +
     * Indicates an alert event. Default severity for any type of monitoring event.  +
     * *6-Warning* +
     * Indicates a warning event. Action may be required. +
     * *7-Notice* +
     * Indicates an unusual event. No immediate action is required. +
     * *8-Informational* +
     * Indicates a regular operational event. May be used for reporting, measuring throughput, etc. No action is required. +
     * *9-Debug* +
     * Indicates information useful to developers for debugging, not useful during operations.
     * 
     * (Required)
     * 
     */
    @JsonProperty("severity")
    public void setSeverity(Integer severity) {
        this.severity = severity;
    }

    public VariableMonitoring withSeverity(Integer severity) {
        this.severity = severity;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(VariableMonitoring.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("customData");
        sb.append('=');
        sb.append(((this.customData == null)?"<null>":this.customData));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("transaction");
        sb.append('=');
        sb.append(((this.transaction == null)?"<null>":this.transaction));
        sb.append(',');
        sb.append("value");
        sb.append('=');
        sb.append(((this.value == null)?"<null>":this.value));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("severity");
        sb.append('=');
        sb.append(((this.severity == null)?"<null>":this.severity));
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
        result = ((result* 31)+((this.severity == null)? 0 :this.severity.hashCode()));
        result = ((result* 31)+((this.customData == null)? 0 :this.customData.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.value == null)? 0 :this.value.hashCode()));
        result = ((result* 31)+((this.transaction == null)? 0 :this.transaction.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof VariableMonitoring) == false) {
            return false;
        }
        VariableMonitoring rhs = ((VariableMonitoring) other);
        return (((((((this.severity == rhs.severity)||((this.severity!= null)&&this.severity.equals(rhs.severity)))&&((this.customData == rhs.customData)||((this.customData!= null)&&this.customData.equals(rhs.customData))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.value == rhs.value)||((this.value!= null)&&this.value.equals(rhs.value))))&&((this.transaction == rhs.transaction)||((this.transaction!= null)&&this.transaction.equals(rhs.transaction))));
    }

}
