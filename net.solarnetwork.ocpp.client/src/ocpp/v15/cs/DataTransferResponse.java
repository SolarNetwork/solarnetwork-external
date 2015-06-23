
package ocpp.v15.cs;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Defines the DataTransfer.conf PDU
 * 
 * <p>Java class for DataTransferResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DataTransferResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="status" type="{urn://Ocpp/Cs/2012/06/}DataTransferStatus"/>
 *         &lt;element name="data" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataTransferResponse", propOrder = {
    "status",
    "data"
})
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-06-12T04:15:01+12:00", comments = "JAXB RI v2.2.4-2")
public class DataTransferResponse {

    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-06-12T04:15:01+12:00", comments = "JAXB RI v2.2.4-2")
    protected DataTransferStatus status;
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-06-12T04:15:01+12:00", comments = "JAXB RI v2.2.4-2")
    protected String data;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link DataTransferStatus }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-06-12T04:15:01+12:00", comments = "JAXB RI v2.2.4-2")
    public DataTransferStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataTransferStatus }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-06-12T04:15:01+12:00", comments = "JAXB RI v2.2.4-2")
    public void setStatus(DataTransferStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the data property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-06-12T04:15:01+12:00", comments = "JAXB RI v2.2.4-2")
    public String getData() {
        return data;
    }

    /**
     * Sets the value of the data property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-06-12T04:15:01+12:00", comments = "JAXB RI v2.2.4-2")
    public void setData(String value) {
        this.data = value;
    }

}
