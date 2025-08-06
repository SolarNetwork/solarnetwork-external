
package ocpp.v16.jakarta.cs;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Defines the DiagnosticsStatusNotification.req PDU
 * 
 * <p>Java class for DiagnosticsStatusNotificationRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DiagnosticsStatusNotificationRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="status" type="{urn://Ocpp/Cs/2015/10/}DiagnosticsStatus"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DiagnosticsStatusNotificationRequest", propOrder = {
    "status"
})
public class DiagnosticsStatusNotificationRequest {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected DiagnosticsStatus status;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link DiagnosticsStatus }
     *     
     */
    public DiagnosticsStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link DiagnosticsStatus }
     *     
     */
    public void setStatus(DiagnosticsStatus value) {
        this.status = value;
    }

}
