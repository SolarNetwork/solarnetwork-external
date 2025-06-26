
package ocpp.v16.jakarta.cp;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Defines the ClearChargingProfile.req PDU
 * 
 * <p>Java class for ClearChargingProfileRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClearChargingProfileRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="connectorId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="chargingProfilePurpose" type="{urn://Ocpp/Cp/2015/10/}ChargingProfilePurposeType" minOccurs="0"/&gt;
 *         &lt;element name="stackLevel" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClearChargingProfileRequest", propOrder = {
    "id",
    "connectorId",
    "chargingProfilePurpose",
    "stackLevel"
})
public class ClearChargingProfileRequest {

    protected Integer id;
    protected Integer connectorId;
    @XmlSchemaType(name = "string")
    protected ChargingProfilePurposeType chargingProfilePurpose;
    protected Integer stackLevel;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setId(Integer value) {
        this.id = value;
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
     * Gets the value of the chargingProfilePurpose property.
     * 
     * @return
     *     possible object is
     *     {@link ChargingProfilePurposeType }
     *     
     */
    public ChargingProfilePurposeType getChargingProfilePurpose() {
        return chargingProfilePurpose;
    }

    /**
     * Sets the value of the chargingProfilePurpose property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChargingProfilePurposeType }
     *     
     */
    public void setChargingProfilePurpose(ChargingProfilePurposeType value) {
        this.chargingProfilePurpose = value;
    }

    /**
     * Gets the value of the stackLevel property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStackLevel() {
        return stackLevel;
    }

    /**
     * Sets the value of the stackLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStackLevel(Integer value) {
        this.stackLevel = value;
    }

}
