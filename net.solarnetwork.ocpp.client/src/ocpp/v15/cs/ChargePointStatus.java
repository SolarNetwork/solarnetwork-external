
package ocpp.v15.cs;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChargePointStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ChargePointStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Available"/>
 *     &lt;enumeration value="Occupied"/>
 *     &lt;enumeration value="Faulted"/>
 *     &lt;enumeration value="Unavailable"/>
 *     &lt;enumeration value="Reserved"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ChargePointStatus")
@XmlEnum
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-06-12T04:15:01+12:00", comments = "JAXB RI v2.2.4-2")
public enum ChargePointStatus {

    @XmlEnumValue("Available")
    AVAILABLE("Available"),
    @XmlEnumValue("Occupied")
    OCCUPIED("Occupied"),
    @XmlEnumValue("Faulted")
    FAULTED("Faulted"),
    @XmlEnumValue("Unavailable")
    UNAVAILABLE("Unavailable"),
    @XmlEnumValue("Reserved")
    RESERVED("Reserved");
    private final String value;

    ChargePointStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ChargePointStatus fromValue(String v) {
        for (ChargePointStatus c: ChargePointStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
