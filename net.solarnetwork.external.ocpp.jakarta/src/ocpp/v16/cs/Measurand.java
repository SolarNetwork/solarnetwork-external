
package ocpp.v16.cs;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Measurand.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="Measurand"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Current.Export"/&gt;
 *     &lt;enumeration value="Current.Import"/&gt;
 *     &lt;enumeration value="Current.Offered"/&gt;
 *     &lt;enumeration value="Energy.Active.Export.Register"/&gt;
 *     &lt;enumeration value="Energy.Active.Import.Register"/&gt;
 *     &lt;enumeration value="Energy.Reactive.Export.Register"/&gt;
 *     &lt;enumeration value="Energy.Reactive.Import.Register"/&gt;
 *     &lt;enumeration value="Energy.Active.Export.Interval"/&gt;
 *     &lt;enumeration value="Energy.Active.Import.Interval"/&gt;
 *     &lt;enumeration value="Energy.Reactive.Export.Interval"/&gt;
 *     &lt;enumeration value="Energy.Reactive.Import.Interval"/&gt;
 *     &lt;enumeration value="Frequency"/&gt;
 *     &lt;enumeration value="Power.Active.Export"/&gt;
 *     &lt;enumeration value="Power.Active.Import"/&gt;
 *     &lt;enumeration value="Power.Factor"/&gt;
 *     &lt;enumeration value="Power.Offered"/&gt;
 *     &lt;enumeration value="Power.Reactive.Export"/&gt;
 *     &lt;enumeration value="Power.Reactive.Import"/&gt;
 *     &lt;enumeration value="RPM"/&gt;
 *     &lt;enumeration value="SoC"/&gt;
 *     &lt;enumeration value="Temperature"/&gt;
 *     &lt;enumeration value="Voltage"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Measurand")
@XmlEnum
public enum Measurand {

    @XmlEnumValue("Current.Export")
    CURRENT_EXPORT("Current.Export"),
    @XmlEnumValue("Current.Import")
    CURRENT_IMPORT("Current.Import"),
    @XmlEnumValue("Current.Offered")
    CURRENT_OFFERED("Current.Offered"),
    @XmlEnumValue("Energy.Active.Export.Register")
    ENERGY_ACTIVE_EXPORT_REGISTER("Energy.Active.Export.Register"),
    @XmlEnumValue("Energy.Active.Import.Register")
    ENERGY_ACTIVE_IMPORT_REGISTER("Energy.Active.Import.Register"),
    @XmlEnumValue("Energy.Reactive.Export.Register")
    ENERGY_REACTIVE_EXPORT_REGISTER("Energy.Reactive.Export.Register"),
    @XmlEnumValue("Energy.Reactive.Import.Register")
    ENERGY_REACTIVE_IMPORT_REGISTER("Energy.Reactive.Import.Register"),
    @XmlEnumValue("Energy.Active.Export.Interval")
    ENERGY_ACTIVE_EXPORT_INTERVAL("Energy.Active.Export.Interval"),
    @XmlEnumValue("Energy.Active.Import.Interval")
    ENERGY_ACTIVE_IMPORT_INTERVAL("Energy.Active.Import.Interval"),
    @XmlEnumValue("Energy.Reactive.Export.Interval")
    ENERGY_REACTIVE_EXPORT_INTERVAL("Energy.Reactive.Export.Interval"),
    @XmlEnumValue("Energy.Reactive.Import.Interval")
    ENERGY_REACTIVE_IMPORT_INTERVAL("Energy.Reactive.Import.Interval"),
    @XmlEnumValue("Frequency")
    FREQUENCY("Frequency"),
    @XmlEnumValue("Power.Active.Export")
    POWER_ACTIVE_EXPORT("Power.Active.Export"),
    @XmlEnumValue("Power.Active.Import")
    POWER_ACTIVE_IMPORT("Power.Active.Import"),
    @XmlEnumValue("Power.Factor")
    POWER_FACTOR("Power.Factor"),
    @XmlEnumValue("Power.Offered")
    POWER_OFFERED("Power.Offered"),
    @XmlEnumValue("Power.Reactive.Export")
    POWER_REACTIVE_EXPORT("Power.Reactive.Export"),
    @XmlEnumValue("Power.Reactive.Import")
    POWER_REACTIVE_IMPORT("Power.Reactive.Import"),
    RPM("RPM"),
    @XmlEnumValue("SoC")
    SO_C("SoC"),
    @XmlEnumValue("Temperature")
    TEMPERATURE("Temperature"),
    @XmlEnumValue("Voltage")
    VOLTAGE("Voltage");
    private final String value;

    Measurand(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Measurand fromValue(String v) {
        for (Measurand c: Measurand.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
