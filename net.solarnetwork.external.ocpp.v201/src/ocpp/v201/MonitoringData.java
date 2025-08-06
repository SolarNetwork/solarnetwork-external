
package ocpp.v201;

import java.io.Serializable;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Class to hold parameters of SetVariableMonitoring request.
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "customData",
    "component",
    "variable",
    "variableMonitoring"
})
public class MonitoringData implements Serializable
{

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     * 
     */
    @JsonProperty("customData")
    @JsonPropertyDescription("This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.")
    private CustomData customData;
    /**
     * A physical or logical component
     * 
     * (Required)
     * 
     */
    @JsonProperty("component")
    @JsonPropertyDescription("A physical or logical component\r\n")
    private Component component;
    /**
     * Reference key to a component-variable.
     * 
     * (Required)
     * 
     */
    @JsonProperty("variable")
    @JsonPropertyDescription("Reference key to a component-variable.\r\n")
    private Variable variable;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("variableMonitoring")
    private List<VariableMonitoring> variableMonitoring;
    private final static long serialVersionUID = -3451883920800117026L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public MonitoringData() {
    }

    /**
     * 
     * @param component
     * @param variableMonitoring
     * @param variable
     */
    public MonitoringData(Component component, Variable variable, List<VariableMonitoring> variableMonitoring) {
        super();
        this.component = component;
        this.variable = variable;
        this.variableMonitoring = variableMonitoring;
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

    public MonitoringData withCustomData(CustomData customData) {
        this.customData = customData;
        return this;
    }

    /**
     * A physical or logical component
     * 
     * (Required)
     * 
     */
    @JsonProperty("component")
    public Component getComponent() {
        return component;
    }

    /**
     * A physical or logical component
     * 
     * (Required)
     * 
     */
    @JsonProperty("component")
    public void setComponent(Component component) {
        this.component = component;
    }

    public MonitoringData withComponent(Component component) {
        this.component = component;
        return this;
    }

    /**
     * Reference key to a component-variable.
     * 
     * (Required)
     * 
     */
    @JsonProperty("variable")
    public Variable getVariable() {
        return variable;
    }

    /**
     * Reference key to a component-variable.
     * 
     * (Required)
     * 
     */
    @JsonProperty("variable")
    public void setVariable(Variable variable) {
        this.variable = variable;
    }

    public MonitoringData withVariable(Variable variable) {
        this.variable = variable;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("variableMonitoring")
    public List<VariableMonitoring> getVariableMonitoring() {
        return variableMonitoring;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("variableMonitoring")
    public void setVariableMonitoring(List<VariableMonitoring> variableMonitoring) {
        this.variableMonitoring = variableMonitoring;
    }

    public MonitoringData withVariableMonitoring(List<VariableMonitoring> variableMonitoring) {
        this.variableMonitoring = variableMonitoring;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(MonitoringData.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("customData");
        sb.append('=');
        sb.append(((this.customData == null)?"<null>":this.customData));
        sb.append(',');
        sb.append("component");
        sb.append('=');
        sb.append(((this.component == null)?"<null>":this.component));
        sb.append(',');
        sb.append("variable");
        sb.append('=');
        sb.append(((this.variable == null)?"<null>":this.variable));
        sb.append(',');
        sb.append("variableMonitoring");
        sb.append('=');
        sb.append(((this.variableMonitoring == null)?"<null>":this.variableMonitoring));
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
        result = ((result* 31)+((this.variable == null)? 0 :this.variable.hashCode()));
        result = ((result* 31)+((this.customData == null)? 0 :this.customData.hashCode()));
        result = ((result* 31)+((this.component == null)? 0 :this.component.hashCode()));
        result = ((result* 31)+((this.variableMonitoring == null)? 0 :this.variableMonitoring.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MonitoringData) == false) {
            return false;
        }
        MonitoringData rhs = ((MonitoringData) other);
        return (((((this.variable == rhs.variable)||((this.variable!= null)&&this.variable.equals(rhs.variable)))&&((this.customData == rhs.customData)||((this.customData!= null)&&this.customData.equals(rhs.customData))))&&((this.component == rhs.component)||((this.component!= null)&&this.component.equals(rhs.component))))&&((this.variableMonitoring == rhs.variableMonitoring)||((this.variableMonitoring!= null)&&this.variableMonitoring.equals(rhs.variableMonitoring))));
    }

}
