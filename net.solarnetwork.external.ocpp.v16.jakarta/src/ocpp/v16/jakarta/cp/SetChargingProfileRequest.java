
package ocpp.v16.jakarta.cp;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Defines the SetChargingProfile.req PDU
 * 
 * <p>Java class for SetChargingProfileRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SetChargingProfileRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="connectorId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="csChargingProfiles" type="{urn://Ocpp/Cp/2015/10/}ChargingProfile"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SetChargingProfileRequest", propOrder = {
    "connectorId",
    "csChargingProfiles"
})
public class SetChargingProfileRequest {

    protected int connectorId;
    @XmlElement(required = true)
    protected ChargingProfile csChargingProfiles;

    /**
     * Gets the value of the connectorId property.
     * 
     */
    public int getConnectorId() {
        return connectorId;
    }

    /**
     * Sets the value of the connectorId property.
     * 
     */
    public void setConnectorId(int value) {
        this.connectorId = value;
    }

    /**
     * Gets the value of the csChargingProfiles property.
     * 
     * @return
     *     possible object is
     *     {@link ChargingProfile }
     *     
     */
    public ChargingProfile getCsChargingProfiles() {
        return csChargingProfiles;
    }

    /**
     * Sets the value of the csChargingProfiles property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChargingProfile }
     *     
     */
    public void setCsChargingProfiles(ChargingProfile value) {
        this.csChargingProfiles = value;
    }

}
