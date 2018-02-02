//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.2-hudson-jaxb-ri-2.2-63- 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.02.02 at 02:58:26 PM NZDT 
//


package openadr.model.v20b;

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
 * <p>Java class for oadrLoadControlStateTypeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="oadrLoadControlStateTypeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="oadrMin" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="oadrMax" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="oadrCurrent" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="oadrNormal" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "oadrLoadControlStateTypeType", propOrder = {
    "oadrMin",
    "oadrMax",
    "oadrCurrent",
    "oadrNormal"
})
public class OadrLoadControlStateTypeType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 1L;
    protected Float oadrMin;
    protected Float oadrMax;
    protected float oadrCurrent;
    protected Float oadrNormal;

    /**
     * Default no-arg constructor
     * 
     */
    public OadrLoadControlStateTypeType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public OadrLoadControlStateTypeType(final Float oadrMin, final Float oadrMax, final float oadrCurrent, final Float oadrNormal) {
        this.oadrMin = oadrMin;
        this.oadrMax = oadrMax;
        this.oadrCurrent = oadrCurrent;
        this.oadrNormal = oadrNormal;
    }

    /**
     * Gets the value of the oadrMin property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getOadrMin() {
        return oadrMin;
    }

    /**
     * Sets the value of the oadrMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setOadrMin(Float value) {
        this.oadrMin = value;
    }

    /**
     * Gets the value of the oadrMax property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getOadrMax() {
        return oadrMax;
    }

    /**
     * Sets the value of the oadrMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setOadrMax(Float value) {
        this.oadrMax = value;
    }

    /**
     * Gets the value of the oadrCurrent property.
     * 
     */
    public float getOadrCurrent() {
        return oadrCurrent;
    }

    /**
     * Sets the value of the oadrCurrent property.
     * 
     */
    public void setOadrCurrent(float value) {
        this.oadrCurrent = value;
    }

    /**
     * Gets the value of the oadrNormal property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getOadrNormal() {
        return oadrNormal;
    }

    /**
     * Sets the value of the oadrNormal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setOadrNormal(Float value) {
        this.oadrNormal = value;
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
            Float theOadrMin;
            theOadrMin = this.getOadrMin();
            strategy.appendField(locator, this, "oadrMin", buffer, theOadrMin, (this.oadrMin!= null));
        }
        {
            Float theOadrMax;
            theOadrMax = this.getOadrMax();
            strategy.appendField(locator, this, "oadrMax", buffer, theOadrMax, (this.oadrMax!= null));
        }
        {
            float theOadrCurrent;
            theOadrCurrent = this.getOadrCurrent();
            strategy.appendField(locator, this, "oadrCurrent", buffer, theOadrCurrent, true);
        }
        {
            Float theOadrNormal;
            theOadrNormal = this.getOadrNormal();
            strategy.appendField(locator, this, "oadrNormal", buffer, theOadrNormal, (this.oadrNormal!= null));
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
        final OadrLoadControlStateTypeType that = ((OadrLoadControlStateTypeType) object);
        {
            Float lhsOadrMin;
            lhsOadrMin = this.getOadrMin();
            Float rhsOadrMin;
            rhsOadrMin = that.getOadrMin();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "oadrMin", lhsOadrMin), LocatorUtils.property(thatLocator, "oadrMin", rhsOadrMin), lhsOadrMin, rhsOadrMin, (this.oadrMin!= null), (that.oadrMin!= null))) {
                return false;
            }
        }
        {
            Float lhsOadrMax;
            lhsOadrMax = this.getOadrMax();
            Float rhsOadrMax;
            rhsOadrMax = that.getOadrMax();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "oadrMax", lhsOadrMax), LocatorUtils.property(thatLocator, "oadrMax", rhsOadrMax), lhsOadrMax, rhsOadrMax, (this.oadrMax!= null), (that.oadrMax!= null))) {
                return false;
            }
        }
        {
            float lhsOadrCurrent;
            lhsOadrCurrent = this.getOadrCurrent();
            float rhsOadrCurrent;
            rhsOadrCurrent = that.getOadrCurrent();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "oadrCurrent", lhsOadrCurrent), LocatorUtils.property(thatLocator, "oadrCurrent", rhsOadrCurrent), lhsOadrCurrent, rhsOadrCurrent, true, true)) {
                return false;
            }
        }
        {
            Float lhsOadrNormal;
            lhsOadrNormal = this.getOadrNormal();
            Float rhsOadrNormal;
            rhsOadrNormal = that.getOadrNormal();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "oadrNormal", lhsOadrNormal), LocatorUtils.property(thatLocator, "oadrNormal", rhsOadrNormal), lhsOadrNormal, rhsOadrNormal, (this.oadrNormal!= null), (that.oadrNormal!= null))) {
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
            Float theOadrMin;
            theOadrMin = this.getOadrMin();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "oadrMin", theOadrMin), currentHashCode, theOadrMin, (this.oadrMin!= null));
        }
        {
            Float theOadrMax;
            theOadrMax = this.getOadrMax();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "oadrMax", theOadrMax), currentHashCode, theOadrMax, (this.oadrMax!= null));
        }
        {
            float theOadrCurrent;
            theOadrCurrent = this.getOadrCurrent();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "oadrCurrent", theOadrCurrent), currentHashCode, theOadrCurrent, true);
        }
        {
            Float theOadrNormal;
            theOadrNormal = this.getOadrNormal();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "oadrNormal", theOadrNormal), currentHashCode, theOadrNormal, (this.oadrNormal!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

    public OadrLoadControlStateTypeType withOadrMin(Float value) {
        setOadrMin(value);
        return this;
    }

    public OadrLoadControlStateTypeType withOadrMax(Float value) {
        setOadrMax(value);
        return this;
    }

    public OadrLoadControlStateTypeType withOadrCurrent(float value) {
        setOadrCurrent(value);
        return this;
    }

    public OadrLoadControlStateTypeType withOadrNormal(Float value) {
        setOadrNormal(value);
        return this;
    }

}
