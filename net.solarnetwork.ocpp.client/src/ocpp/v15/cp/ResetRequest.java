
package ocpp.v15.cp;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Defines the Reset.req PDU
 * 
 * <p>Java class for ResetRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResetRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="type" type="{urn://Ocpp/Cp/2012/06/}ResetType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResetRequest", propOrder = {
    "type"
})
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-06-12T04:14:37+12:00", comments = "JAXB RI v2.2.4-2")
public class ResetRequest {

    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-06-12T04:14:37+12:00", comments = "JAXB RI v2.2.4-2")
    protected ResetType type;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link ResetType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-06-12T04:14:37+12:00", comments = "JAXB RI v2.2.4-2")
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
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-06-12T04:14:37+12:00", comments = "JAXB RI v2.2.4-2")
    public void setType(ResetType value) {
        this.type = value;
    }

}
