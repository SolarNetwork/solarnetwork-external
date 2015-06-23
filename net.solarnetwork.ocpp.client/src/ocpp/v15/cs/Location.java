
package ocpp.v15.cs;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Location.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Location">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Inlet"/>
 *     &lt;enumeration value="Outlet"/>
 *     &lt;enumeration value="Body"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Location")
@XmlEnum
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-06-12T04:15:01+12:00", comments = "JAXB RI v2.2.4-2")
public enum Location {

    @XmlEnumValue("Inlet")
    INLET("Inlet"),
    @XmlEnumValue("Outlet")
    OUTLET("Outlet"),
    @XmlEnumValue("Body")
    BODY("Body");
    private final String value;

    Location(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Location fromValue(String v) {
        for (Location c: Location.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
