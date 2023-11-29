
package ocpp.v16.cp;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Defines the TriggerMessage.req PDU
 * 
 * <p>Java class for TriggerMessageRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TriggerMessageRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="requestedMessage" type="{urn://Ocpp/Cp/2015/10/}MessageTrigger"/&gt;
 *         &lt;element name="connectorId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TriggerMessageRequest", propOrder = {
    "requestedMessage",
    "connectorId"
})
public class TriggerMessageRequest {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected MessageTrigger requestedMessage;
    protected Integer connectorId;

    /**
     * Gets the value of the requestedMessage property.
     * 
     * @return
     *     possible object is
     *     {@link MessageTrigger }
     *     
     */
    public MessageTrigger getRequestedMessage() {
        return requestedMessage;
    }

    /**
     * Sets the value of the requestedMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageTrigger }
     *     
     */
    public void setRequestedMessage(MessageTrigger value) {
        this.requestedMessage = value;
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

}
