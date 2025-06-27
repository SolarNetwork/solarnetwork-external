
package ocpp.v16.jakarta.cp;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChargingRateUnitType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ChargingRateUnitType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="W"/&gt;
 *     &lt;enumeration value="A"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ChargingRateUnitType")
@XmlEnum
public enum ChargingRateUnitType {

    W,
    A;

    public String value() {
        return name();
    }

    public static ChargingRateUnitType fromValue(String v) {
        return valueOf(v);
    }

}
