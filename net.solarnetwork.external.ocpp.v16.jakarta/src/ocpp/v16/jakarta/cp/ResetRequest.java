
package ocpp.v16.jakarta.cp;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Defines the Reset.req PDU
 * 
 * <p>Java class for ResetRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResetRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="type" type="{urn://Ocpp/Cp/2015/10/}ResetType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResetRequest", propOrder = {
    "type"
})
public class ResetRequest {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ResetType type;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link ResetType }
     *     
     */
    public ResetType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResetType }
     *     
     */
    public void setType(ResetType value) {
        this.type = value;
    }

}
