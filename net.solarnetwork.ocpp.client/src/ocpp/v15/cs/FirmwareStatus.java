
package ocpp.v15.cs;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FirmwareStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FirmwareStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Downloaded"/>
 *     &lt;enumeration value="DownloadFailed"/>
 *     &lt;enumeration value="InstallationFailed"/>
 *     &lt;enumeration value="Installed"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FirmwareStatus")
@XmlEnum
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-06-12T04:15:01+12:00", comments = "JAXB RI v2.2.4-2")
public enum FirmwareStatus {

    @XmlEnumValue("Downloaded")
    DOWNLOADED("Downloaded"),
    @XmlEnumValue("DownloadFailed")
    DOWNLOAD_FAILED("DownloadFailed"),
    @XmlEnumValue("InstallationFailed")
    INSTALLATION_FAILED("InstallationFailed"),
    @XmlEnumValue("Installed")
    INSTALLED("Installed");
    private final String value;

    FirmwareStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FirmwareStatus fromValue(String v) {
        for (FirmwareStatus c: FirmwareStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
