//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.2-hudson-jaxb-ri-2.2-63- 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.02.02 at 04:16:30 PM NZDT 
//


package openadr.model.v20b;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.Equals2;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy2;
import org.jvnet.jaxb2_commons.lang.HashCode2;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy2;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString2;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy2;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="oadrKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="oadrValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "oadrKey",
    "oadrValue"
})
@XmlRootElement(name = "oadrInfo")
public class OadrInfo implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected String oadrKey;
    @XmlElement(required = true)
    protected String oadrValue;

    /**
     * Default no-arg constructor
     * 
     */
    public OadrInfo() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public OadrInfo(final String oadrKey, final String oadrValue) {
        this.oadrKey = oadrKey;
        this.oadrValue = oadrValue;
    }

    /**
     * Gets the value of the oadrKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOadrKey() {
        return oadrKey;
    }

    /**
     * Sets the value of the oadrKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOadrKey(String value) {
        this.oadrKey = value;
    }

    /**
     * Gets the value of the oadrValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOadrValue() {
        return oadrValue;
    }

    /**
     * Sets the value of the oadrValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOadrValue(String value) {
        this.oadrValue = value;
    }

    public String toString() {
        final ToStringStrategy2 strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        {
            String theOadrKey;
            theOadrKey = this.getOadrKey();
            strategy.appendField(locator, this, "oadrKey", buffer, theOadrKey, (this.oadrKey!= null));
        }
        {
            String theOadrValue;
            theOadrValue = this.getOadrValue();
            strategy.appendField(locator, this, "oadrValue", buffer, theOadrValue, (this.oadrValue!= null));
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final OadrInfo that = ((OadrInfo) object);
        {
            String lhsOadrKey;
            lhsOadrKey = this.getOadrKey();
            String rhsOadrKey;
            rhsOadrKey = that.getOadrKey();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "oadrKey", lhsOadrKey), LocatorUtils.property(thatLocator, "oadrKey", rhsOadrKey), lhsOadrKey, rhsOadrKey, (this.oadrKey!= null), (that.oadrKey!= null))) {
                return false;
            }
        }
        {
            String lhsOadrValue;
            lhsOadrValue = this.getOadrValue();
            String rhsOadrValue;
            rhsOadrValue = that.getOadrValue();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "oadrValue", lhsOadrValue), LocatorUtils.property(thatLocator, "oadrValue", rhsOadrValue), lhsOadrValue, rhsOadrValue, (this.oadrValue!= null), (that.oadrValue!= null))) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy2 strategy) {
        int currentHashCode = 1;
        {
            String theOadrKey;
            theOadrKey = this.getOadrKey();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "oadrKey", theOadrKey), currentHashCode, theOadrKey, (this.oadrKey!= null));
        }
        {
            String theOadrValue;
            theOadrValue = this.getOadrValue();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "oadrValue", theOadrValue), currentHashCode, theOadrValue, (this.oadrValue!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

    public OadrInfo withOadrKey(String value) {
        setOadrKey(value);
        return this;
    }

    public OadrInfo withOadrValue(String value) {
        setOadrValue(value);
        return this;
    }

}
