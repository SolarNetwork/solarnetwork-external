
package ocpp.v15.cp;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UpdateType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Differential"/>
 *     &lt;enumeration value="Full"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "UpdateType")
@XmlEnum
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-06-12T04:14:37+12:00", comments = "JAXB RI v2.2.4-2")
public enum UpdateType {

    @XmlEnumValue("Differential")
    DIFFERENTIAL("Differential"),
    @XmlEnumValue("Full")
    FULL("Full");
    private final String value;

    UpdateType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UpdateType fromValue(String v) {
        for (UpdateType c: UpdateType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
