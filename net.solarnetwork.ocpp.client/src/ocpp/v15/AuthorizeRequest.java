
package ocpp.v15;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Defines the Authorize.req PDU
 * 
 * <p>Java class for AuthorizeRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AuthorizeRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idTag" type="{urn://Ocpp/Cs/2012/06/}IdToken"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuthorizeRequest", propOrder = {
    "idTag"
})
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-06-04T10:08:51+12:00", comments = "JAXB RI v2.2.4-2")
public class AuthorizeRequest {

    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-06-04T10:08:51+12:00", comments = "JAXB RI v2.2.4-2")
    protected String idTag;

    /**
     * Gets the value of the idTag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-06-04T10:08:51+12:00", comments = "JAXB RI v2.2.4-2")
    public String getIdTag() {
        return idTag;
    }

    /**
     * Sets the value of the idTag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-06-04T10:08:51+12:00", comments = "JAXB RI v2.2.4-2")
    public void setIdTag(String value) {
        this.idTag = value;
    }

}
