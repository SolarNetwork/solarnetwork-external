
package ocpp.v16.jakarta.cp;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChargingProfileKindType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ChargingProfileKindType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Absolute"/&gt;
 *     &lt;enumeration value="Recurring"/&gt;
 *     &lt;enumeration value="Relative"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ChargingProfileKindType")
@XmlEnum
public enum ChargingProfileKindType {

    @XmlEnumValue("Absolute")
    ABSOLUTE("Absolute"),
    @XmlEnumValue("Recurring")
    RECURRING("Recurring"),
    @XmlEnumValue("Relative")
    RELATIVE("Relative");
    private final String value;

    ChargingProfileKindType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ChargingProfileKindType fromValue(String v) {
        for (ChargingProfileKindType c: ChargingProfileKindType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
