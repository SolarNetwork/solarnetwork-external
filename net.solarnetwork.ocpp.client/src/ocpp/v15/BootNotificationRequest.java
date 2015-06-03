
package ocpp.v15;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Defines the BootNotification.req PDU
 * 
 * <p>Java class for BootNotificationRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BootNotificationRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="chargePointVendor" type="{urn://Ocpp/Cs/2012/06/}ChargePointVendor"/>
 *         &lt;element name="chargePointModel" type="{urn://Ocpp/Cs/2012/06/}ChargePointModel"/>
 *         &lt;element name="chargePointSerialNumber" type="{urn://Ocpp/Cs/2012/06/}ChargePointSerialNumber" minOccurs="0"/>
 *         &lt;element name="chargeBoxSerialNumber" type="{urn://Ocpp/Cs/2012/06/}ChargeBoxSerialNumber" minOccurs="0"/>
 *         &lt;element name="firmwareVersion" type="{urn://Ocpp/Cs/2012/06/}FirmwareVersion" minOccurs="0"/>
 *         &lt;element name="iccid" type="{urn://Ocpp/Cs/2012/06/}IccidString" minOccurs="0"/>
 *         &lt;element name="imsi" type="{urn://Ocpp/Cs/2012/06/}ImsiString" minOccurs="0"/>
 *         &lt;element name="meterType" type="{urn://Ocpp/Cs/2012/06/}MeterType" minOccurs="0"/>
 *         &lt;element name="meterSerialNumber" type="{urn://Ocpp/Cs/2012/06/}MeterSerialNumber" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BootNotificationRequest", propOrder = {
    "chargePointVendor",
    "chargePointModel",
    "chargePointSerialNumber",
    "chargeBoxSerialNumber",
    "firmwareVersion",
    "iccid",
    "imsi",
    "meterType",
    "meterSerialNumber"
})
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-06-04T10:08:51+12:00", comments = "JAXB RI v2.2.4-2")
public class BootNotificationRequest {

    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-06-04T10:08:51+12:00", comments = "JAXB RI v2.2.4-2")
    protected String chargePointVendor;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-06-04T10:08:51+12:00", comments = "JAXB RI v2.2.4-2")
    protected String chargePointModel;
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-06-04T10:08:51+12:00", comments = "JAXB RI v2.2.4-2")
    protected String chargePointSerialNumber;
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-06-04T10:08:51+12:00", comments = "JAXB RI v2.2.4-2")
    protected String chargeBoxSerialNumber;
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-06-04T10:08:51+12:00", comments = "JAXB RI v2.2.4-2")
    protected String firmwareVersion;
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-06-04T10:08:51+12:00", comments = "JAXB RI v2.2.4-2")
    protected String iccid;
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-06-04T10:08:51+12:00", comments = "JAXB RI v2.2.4-2")
    protected String imsi;
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-06-04T10:08:51+12:00", comments = "JAXB RI v2.2.4-2")
    protected String meterType;
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-06-04T10:08:51+12:00", comments = "JAXB RI v2.2.4-2")
    protected String meterSerialNumber;

    /**
     * Gets the value of the chargePointVendor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-06-04T10:08:51+12:00", comments = "JAXB RI v2.2.4-2")
    public String getChargePointVendor() {
        return chargePointVendor;
    }

    /**
     * Sets the value of the chargePointVendor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-06-04T10:08:51+12:00", comments = "JAXB RI v2.2.4-2")
    public void setChargePointVendor(String value) {
        this.chargePointVendor = value;
    }

    /**
     * Gets the value of the chargePointModel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-06-04T10:08:51+12:00", comments = "JAXB RI v2.2.4-2")
    public String getChargePointModel() {
        return chargePointModel;
    }

    /**
     * Sets the value of the chargePointModel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-06-04T10:08:51+12:00", comments = "JAXB RI v2.2.4-2")
    public void setChargePointModel(String value) {
        this.chargePointModel = value;
    }

    /**
     * Gets the value of the chargePointSerialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-06-04T10:08:51+12:00", comments = "JAXB RI v2.2.4-2")
    public String getChargePointSerialNumber() {
        return chargePointSerialNumber;
    }

    /**
     * Sets the value of the chargePointSerialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-06-04T10:08:51+12:00", comments = "JAXB RI v2.2.4-2")
    public void setChargePointSerialNumber(String value) {
        this.chargePointSerialNumber = value;
    }

    /**
     * Gets the value of the chargeBoxSerialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-06-04T10:08:51+12:00", comments = "JAXB RI v2.2.4-2")
    public String getChargeBoxSerialNumber() {
        return chargeBoxSerialNumber;
    }

    /**
     * Sets the value of the chargeBoxSerialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-06-04T10:08:51+12:00", comments = "JAXB RI v2.2.4-2")
    public void setChargeBoxSerialNumber(String value) {
        this.chargeBoxSerialNumber = value;
    }

    /**
     * Gets the value of the firmwareVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-06-04T10:08:51+12:00", comments = "JAXB RI v2.2.4-2")
    public String getFirmwareVersion() {
        return firmwareVersion;
    }

    /**
     * Sets the value of the firmwareVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-06-04T10:08:51+12:00", comments = "JAXB RI v2.2.4-2")
    public void setFirmwareVersion(String value) {
        this.firmwareVersion = value;
    }

    /**
     * Gets the value of the iccid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-06-04T10:08:51+12:00", comments = "JAXB RI v2.2.4-2")
    public String getIccid() {
        return iccid;
    }

    /**
     * Sets the value of the iccid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-06-04T10:08:51+12:00", comments = "JAXB RI v2.2.4-2")
    public void setIccid(String value) {
        this.iccid = value;
    }

    /**
     * Gets the value of the imsi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-06-04T10:08:51+12:00", comments = "JAXB RI v2.2.4-2")
    public String getImsi() {
        return imsi;
    }

    /**
     * Sets the value of the imsi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-06-04T10:08:51+12:00", comments = "JAXB RI v2.2.4-2")
    public void setImsi(String value) {
        this.imsi = value;
    }

    /**
     * Gets the value of the meterType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-06-04T10:08:51+12:00", comments = "JAXB RI v2.2.4-2")
    public String getMeterType() {
        return meterType;
    }

    /**
     * Sets the value of the meterType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-06-04T10:08:51+12:00", comments = "JAXB RI v2.2.4-2")
    public void setMeterType(String value) {
        this.meterType = value;
    }

    /**
     * Gets the value of the meterSerialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-06-04T10:08:51+12:00", comments = "JAXB RI v2.2.4-2")
    public String getMeterSerialNumber() {
        return meterSerialNumber;
    }

    /**
     * Sets the value of the meterSerialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-06-04T10:08:51+12:00", comments = "JAXB RI v2.2.4-2")
    public void setMeterSerialNumber(String value) {
        this.meterSerialNumber = value;
    }

}
