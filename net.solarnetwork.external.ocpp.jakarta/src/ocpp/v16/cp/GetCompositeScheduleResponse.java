
package ocpp.v16.cp;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Defines the GetCompositeSchedule.conf PDU
 * 
 * <p>Java class for GetCompositeScheduleResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetCompositeScheduleResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="status" type="{urn://Ocpp/Cp/2015/10/}GetCompositeScheduleStatus"/&gt;
 *         &lt;element name="connectorId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="scheduleStart" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="chargingSchedule" type="{urn://Ocpp/Cp/2015/10/}ChargingSchedule" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetCompositeScheduleResponse", propOrder = {
    "status",
    "connectorId",
    "scheduleStart",
    "chargingSchedule"
})
public class GetCompositeScheduleResponse {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected GetCompositeScheduleStatus status;
    protected Integer connectorId;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar scheduleStart;
    protected ChargingSchedule chargingSchedule;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link GetCompositeScheduleStatus }
     *     
     */
    public GetCompositeScheduleStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetCompositeScheduleStatus }
     *     
     */
    public void setStatus(GetCompositeScheduleStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the connectorId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getConnectorId() {
        return connectorId;
    }

    /**
     * Sets the value of the connectorId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setConnectorId(Integer value) {
        this.connectorId = value;
    }

    /**
     * Gets the value of the scheduleStart property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getScheduleStart() {
        return scheduleStart;
    }

    /**
     * Sets the value of the scheduleStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setScheduleStart(XMLGregorianCalendar value) {
        this.scheduleStart = value;
    }

    /**
     * Gets the value of the chargingSchedule property.
     * 
     * @return
     *     possible object is
     *     {@link ChargingSchedule }
     *     
     */
    public ChargingSchedule getChargingSchedule() {
        return chargingSchedule;
    }

    /**
     * Sets the value of the chargingSchedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChargingSchedule }
     *     
     */
    public void setChargingSchedule(ChargingSchedule value) {
        this.chargingSchedule = value;
    }

}
