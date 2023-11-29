
package ocpp.v16.cs;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Location.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="Location"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Body"/&gt;
 *     &lt;enumeration value="Cable"/&gt;
 *     &lt;enumeration value="EV"/&gt;
 *     &lt;enumeration value="Inlet"/&gt;
 *     &lt;enumeration value="Outlet"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Location")
@XmlEnum
public enum Location {

    @XmlEnumValue("Body")
    BODY("Body"),
    @XmlEnumValue("Cable")
    CABLE("Cable"),
    EV("EV"),
    @XmlEnumValue("Inlet")
    INLET("Inlet"),
    @XmlEnumValue("Outlet")
    OUTLET("Outlet");
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
