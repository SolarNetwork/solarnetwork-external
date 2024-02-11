
package ocpp.v16.cp;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChargingRateUnitType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ChargingRateUnitType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="W"/>
 *     &lt;enumeration value="A"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
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
