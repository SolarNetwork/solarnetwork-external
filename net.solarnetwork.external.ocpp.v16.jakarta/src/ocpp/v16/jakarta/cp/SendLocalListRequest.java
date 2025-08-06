
package ocpp.v16.jakarta.cp;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Defines the SendLocalList.req PDU
 * 
 * <p>Java class for SendLocalListRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SendLocalListRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="listVersion" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="localAuthorizationList" type="{urn://Ocpp/Cp/2015/10/}AuthorizationData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="updateType" type="{urn://Ocpp/Cp/2015/10/}UpdateType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SendLocalListRequest", propOrder = {
    "listVersion",
    "localAuthorizationList",
    "updateType"
})
public class SendLocalListRequest {

    protected int listVersion;
    protected List<AuthorizationData> localAuthorizationList;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected UpdateType updateType;

    /**
     * Gets the value of the listVersion property.
     * 
     */
    public int getListVersion() {
        return listVersion;
    }

    /**
     * Sets the value of the listVersion property.
     * 
     */
    public void setListVersion(int value) {
        this.listVersion = value;
    }

    /**
     * Gets the value of the localAuthorizationList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the localAuthorizationList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocalAuthorizationList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AuthorizationData }
     * 
     * 
     */
    public List<AuthorizationData> getLocalAuthorizationList() {
        if (localAuthorizationList == null) {
            localAuthorizationList = new ArrayList<AuthorizationData>();
        }
        return this.localAuthorizationList;
    }

    /**
     * Gets the value of the updateType property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateType }
     *     
     */
    public UpdateType getUpdateType() {
        return updateType;
    }

    /**
     * Sets the value of the updateType property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateType }
     *     
     */
    public void setUpdateType(UpdateType value) {
        this.updateType = value;
    }

}
