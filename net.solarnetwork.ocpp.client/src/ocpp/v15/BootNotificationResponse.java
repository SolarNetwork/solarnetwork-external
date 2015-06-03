
package ocpp.v15;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Defines the BootNotification.conf PDU
 * 
 * <p>Java class for BootNotificationResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BootNotificationResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="status" type="{urn://Ocpp/Cs/2012/06/}RegistrationStatus"/>
 *         &lt;element name="currentTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="heartbeatInterval" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BootNotificationResponse", propOrder = {
    "status",
    "currentTime",
    "heartbeatInterval"
})
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-06-04T10:08:51+12:00", comments = "JAXB RI v2.2.4-2")
public class BootNotificationResponse {

    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-06-04T10:08:51+12:00", comments = "JAXB RI v2.2.4-2")
    protected RegistrationStatus status;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-06-04T10:08:51+12:00", comments = "JAXB RI v2.2.4-2")
    protected XMLGregorianCalendar currentTime;
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-06-04T10:08:51+12:00", comments = "JAXB RI v2.2.4-2")
    protected int heartbeatInterval;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link RegistrationStatus }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-06-04T10:08:51+12:00", comments = "JAXB RI v2.2.4-2")
    public RegistrationStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegistrationStatus }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-06-04T10:08:51+12:00", comments = "JAXB RI v2.2.4-2")
    public void setStatus(RegistrationStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the currentTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-06-04T10:08:51+12:00", comments = "JAXB RI v2.2.4-2")
    public XMLGregorianCalendar getCurrentTime() {
        return currentTime;
    }

    /**
     * Sets the value of the currentTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-06-04T10:08:51+12:00", comments = "JAXB RI v2.2.4-2")
    public void setCurrentTime(XMLGregorianCalendar value) {
        this.currentTime = value;
    }

    /**
     * Gets the value of the heartbeatInterval property.
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-06-04T10:08:51+12:00", comments = "JAXB RI v2.2.4-2")
    public int getHeartbeatInterval() {
        return heartbeatInterval;
    }

    /**
     * Sets the value of the heartbeatInterval property.
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-06-04T10:08:51+12:00", comments = "JAXB RI v2.2.4-2")
    public void setHeartbeatInterval(int value) {
        this.heartbeatInterval = value;
    }

}
