//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.2-hudson-jaxb-ri-2.2-63- 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.02.02 at 04:16:20 PM NZDT 
//


package openadr.model;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 * <p>Java class for currentValueType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="currentValueType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/energyinterop/201110}payloadFloat"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "currentValueType", propOrder = {
    "payloadFloat"
})
public class CurrentValue implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 1L;
    protected PayloadFloat payloadFloat;

    /**
     * Default no-arg constructor
     * 
     */
    public CurrentValue() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public CurrentValue(final PayloadFloat payloadFloat) {
        this.payloadFloat = payloadFloat;
    }

    /**
     * Gets the value of the payloadFloat property.
     * 
     * @return
     *     possible object is
     *     {@link PayloadFloat }
     *     
     */
    public PayloadFloat getPayloadFloat() {
        return payloadFloat;
    }

    /**
     * Sets the value of the payloadFloat property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayloadFloat }
     *     
     */
    public void setPayloadFloat(PayloadFloat value) {
        this.payloadFloat = value;
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
            PayloadFloat thePayloadFloat;
            thePayloadFloat = this.getPayloadFloat();
            strategy.appendField(locator, this, "payloadFloat", buffer, thePayloadFloat, (this.payloadFloat!= null));
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
        final CurrentValue that = ((CurrentValue) object);
        {
            PayloadFloat lhsPayloadFloat;
            lhsPayloadFloat = this.getPayloadFloat();
            PayloadFloat rhsPayloadFloat;
            rhsPayloadFloat = that.getPayloadFloat();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "payloadFloat", lhsPayloadFloat), LocatorUtils.property(thatLocator, "payloadFloat", rhsPayloadFloat), lhsPayloadFloat, rhsPayloadFloat, (this.payloadFloat!= null), (that.payloadFloat!= null))) {
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
            PayloadFloat thePayloadFloat;
            thePayloadFloat = this.getPayloadFloat();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "payloadFloat", thePayloadFloat), currentHashCode, thePayloadFloat, (this.payloadFloat!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

    public CurrentValue withPayloadFloat(PayloadFloat value) {
        setPayloadFloat(value);
        return this;
    }

}
