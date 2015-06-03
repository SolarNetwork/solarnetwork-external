
package ocpp.v15;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Defines the StatusNotification.req PDU
 * 
 * <p>Java class for StatusNotificationRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatusNotificationRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="connectorId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="status" type="{urn://Ocpp/Cs/2012/06/}ChargePointStatus"/>
 *         &lt;element name="errorCode" type="{urn://Ocpp/Cs/2012/06/}ChargePointErrorCode"/>
 *         &lt;element name="info" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="timestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="vendorId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vendorErrorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusNotificationRequest", propOrder = {
    "connectorId",
    "status",
    "errorCode",
    "info",
    "timestamp",
    "vendorId",
    "vendorErrorCode"
})
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-06-04T10:08:51+12:00", comments = "JAXB RI v2.2.4-2")
public class StatusNotificationRequest {

    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-06-04T10:08:51+12:00", comments = "JAXB RI v2.2.4-2")
    protected int connectorId;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-06-04T10:08:51+12:00", comments = "JAXB RI v2.2.4-2")
    protected ChargePointStatus status;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-06-04T10:08:51+12:00", comments = "JAXB RI v2.2.4-2")
    protected ChargePointErrorCode errorCode;
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-06-04T10:08:51+12:00", comments = "JAXB RI v2.2.4-2")
    protected String info;
    @XmlSchemaType(name = "dateTime")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-06-04T10:08:51+12:00", comments = "JAXB RI v2.2.4-2")
    protected XMLGregorianCalendar timestamp;
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-06-04T10:08:51+12:00", comments = "JAXB RI v2.2.4-2")
    protected String vendorId;
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-06-04T10:08:51+12:00", comments = "JAXB RI v2.2.4-2")
    protected String vendorErrorCode;

    /**
     * Gets the value of the connectorId property.
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-06-04T10:08:51+12:00", comments = "JAXB RI v2.2.4-2")
    public int getConnectorId() {
        return connectorId;
    }

    /**
     * Sets the value of the connectorId property.
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-06-04T10:08:51+12:00", comments = "JAXB RI v2.2.4-2")
    public void setConnectorId(int value) {
        this.connectorId = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link ChargePointStatus }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-06-04T10:08:51+12:00", comments = "JAXB RI v2.2.4-2")
    public ChargePointStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChargePointStatus }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-06-04T10:08:51+12:00", comments = "JAXB RI v2.2.4-2")
    public void setStatus(ChargePointStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the errorCode property.
     * 
     * @return
     *     possible object is
     *     {@link ChargePointErrorCode }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-06-04T10:08:51+12:00", comments = "JAXB RI v2.2.4-2")
    public ChargePointErrorCode getErrorCode() {
        return errorCode;
    }

    /**
     * Sets the value of the errorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChargePointErrorCode }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-06-04T10:08:51+12:00", comments = "JAXB RI v2.2.4-2")
    public void setErrorCode(ChargePointErrorCode value) {
        this.errorCode = value;
    }

    /**
     * Gets the value of the info property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-06-04T10:08:51+12:00", comments = "JAXB RI v2.2.4-2")
    public String getInfo() {
        return info;
    }

    /**
     * Sets the value of the info property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-06-04T10:08:51+12:00", comments = "JAXB RI v2.2.4-2")
    public void setInfo(String value) {
        this.info = value;
    }

    /**
     * Gets the value of the timestamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-06-04T10:08:51+12:00", comments = "JAXB RI v2.2.4-2")
    public XMLGregorianCalendar getTimestamp() {
        return timestamp;
    }

    /**
     * Sets the value of the timestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-06-04T10:08:51+12:00", comments = "JAXB RI v2.2.4-2")
    public void setTimestamp(XMLGregorianCalendar value) {
        this.timestamp = value;
    }

    /**
     * Gets the value of the vendorId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-06-04T10:08:51+12:00", comments = "JAXB RI v2.2.4-2")
    public String getVendorId() {
        return vendorId;
    }

    /**
     * Sets the value of the vendorId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-06-04T10:08:51+12:00", comments = "JAXB RI v2.2.4-2")
    public void setVendorId(String value) {
        this.vendorId = value;
    }

    /**
     * Gets the value of the vendorErrorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-06-04T10:08:51+12:00", comments = "JAXB RI v2.2.4-2")
    public String getVendorErrorCode() {
        return vendorErrorCode;
    }

    /**
     * Sets the value of the vendorErrorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-06-04T10:08:51+12:00", comments = "JAXB RI v2.2.4-2")
    public void setVendorErrorCode(String value) {
        this.vendorErrorCode = value;
    }

}
