
package ocpp.v16.cp;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Defines the GetConfiguration.req PDU
 * 
 * <p>Java class for GetConfigurationResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetConfigurationResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="configurationKey" type="{urn://Ocpp/Cp/2015/10/}KeyValue" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="unknownKey" type="{urn://Ocpp/Cp/2015/10/}CiString50Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetConfigurationResponse", propOrder = {
    "configurationKey",
    "unknownKey"
})
public class GetConfigurationResponse {

    protected List<KeyValue> configurationKey;
    protected List<String> unknownKey;

    /**
     * Gets the value of the configurationKey property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the configurationKey property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConfigurationKey().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KeyValue }
     * 
     * 
     */
    public List<KeyValue> getConfigurationKey() {
        if (configurationKey == null) {
            configurationKey = new ArrayList<KeyValue>();
        }
        return this.configurationKey;
    }

    /**
     * Gets the value of the unknownKey property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the unknownKey property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnknownKey().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getUnknownKey() {
        if (unknownKey == null) {
            unknownKey = new ArrayList<String>();
        }
        return this.unknownKey;
    }

}
