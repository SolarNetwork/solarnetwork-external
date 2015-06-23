
package ocpp.v15.cp;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Defines the UnlockConnector.conf PDU
 * 
 * <p>Java class for UnlockConnectorResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UnlockConnectorResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="status" type="{urn://Ocpp/Cp/2012/06/}UnlockStatus"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnlockConnectorResponse", propOrder = {
    "status"
})
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-06-12T04:14:37+12:00", comments = "JAXB RI v2.2.4-2")
public class UnlockConnectorResponse {

    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-06-12T04:14:37+12:00", comments = "JAXB RI v2.2.4-2")
    protected UnlockStatus status;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link UnlockStatus }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-06-12T04:14:37+12:00", comments = "JAXB RI v2.2.4-2")
    public UnlockStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnlockStatus }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-06-12T04:14:37+12:00", comments = "JAXB RI v2.2.4-2")
    public void setStatus(UnlockStatus value) {
        this.status = value;
    }

}
