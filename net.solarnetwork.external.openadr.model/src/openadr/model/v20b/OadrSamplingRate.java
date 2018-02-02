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
import openadr.model.v20b.xcal.DurationValue;
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
 * <p>Java class for oadrSamplingRateType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="oadrSamplingRateType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="oadrMinPeriod" type="{urn:ietf:params:xml:ns:icalendar-2.0}DurationValueType"/>
 *         &lt;element name="oadrMaxPeriod" type="{urn:ietf:params:xml:ns:icalendar-2.0}DurationValueType"/>
 *         &lt;element name="oadrOnChange" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "oadrSamplingRateType", propOrder = {
    "oadrMinPeriod",
    "oadrMaxPeriod",
    "oadrOnChange"
})
@XmlRootElement(name = "oadrSamplingRate")
public class OadrSamplingRate implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected DurationValue oadrMinPeriod;
    @XmlElement(required = true)
    protected DurationValue oadrMaxPeriod;
    protected boolean oadrOnChange;

    /**
     * Default no-arg constructor
     * 
     */
    public OadrSamplingRate() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public OadrSamplingRate(final DurationValue oadrMinPeriod, final DurationValue oadrMaxPeriod, final boolean oadrOnChange) {
        this.oadrMinPeriod = oadrMinPeriod;
        this.oadrMaxPeriod = oadrMaxPeriod;
        this.oadrOnChange = oadrOnChange;
    }

    /**
     * Gets the value of the oadrMinPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link DurationValue }
     *     
     */
    public DurationValue getOadrMinPeriod() {
        return oadrMinPeriod;
    }

    /**
     * Sets the value of the oadrMinPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link DurationValue }
     *     
     */
    public void setOadrMinPeriod(DurationValue value) {
        this.oadrMinPeriod = value;
    }

    /**
     * Gets the value of the oadrMaxPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link DurationValue }
     *     
     */
    public DurationValue getOadrMaxPeriod() {
        return oadrMaxPeriod;
    }

    /**
     * Sets the value of the oadrMaxPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link DurationValue }
     *     
     */
    public void setOadrMaxPeriod(DurationValue value) {
        this.oadrMaxPeriod = value;
    }

    /**
     * Gets the value of the oadrOnChange property.
     * 
     */
    public boolean isOadrOnChange() {
        return oadrOnChange;
    }

    /**
     * Sets the value of the oadrOnChange property.
     * 
     */
    public void setOadrOnChange(boolean value) {
        this.oadrOnChange = value;
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
            DurationValue theOadrMinPeriod;
            theOadrMinPeriod = this.getOadrMinPeriod();
            strategy.appendField(locator, this, "oadrMinPeriod", buffer, theOadrMinPeriod, (this.oadrMinPeriod!= null));
        }
        {
            DurationValue theOadrMaxPeriod;
            theOadrMaxPeriod = this.getOadrMaxPeriod();
            strategy.appendField(locator, this, "oadrMaxPeriod", buffer, theOadrMaxPeriod, (this.oadrMaxPeriod!= null));
        }
        {
            boolean theOadrOnChange;
            theOadrOnChange = this.isOadrOnChange();
            strategy.appendField(locator, this, "oadrOnChange", buffer, theOadrOnChange, true);
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
        final OadrSamplingRate that = ((OadrSamplingRate) object);
        {
            DurationValue lhsOadrMinPeriod;
            lhsOadrMinPeriod = this.getOadrMinPeriod();
            DurationValue rhsOadrMinPeriod;
            rhsOadrMinPeriod = that.getOadrMinPeriod();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "oadrMinPeriod", lhsOadrMinPeriod), LocatorUtils.property(thatLocator, "oadrMinPeriod", rhsOadrMinPeriod), lhsOadrMinPeriod, rhsOadrMinPeriod, (this.oadrMinPeriod!= null), (that.oadrMinPeriod!= null))) {
                return false;
            }
        }
        {
            DurationValue lhsOadrMaxPeriod;
            lhsOadrMaxPeriod = this.getOadrMaxPeriod();
            DurationValue rhsOadrMaxPeriod;
            rhsOadrMaxPeriod = that.getOadrMaxPeriod();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "oadrMaxPeriod", lhsOadrMaxPeriod), LocatorUtils.property(thatLocator, "oadrMaxPeriod", rhsOadrMaxPeriod), lhsOadrMaxPeriod, rhsOadrMaxPeriod, (this.oadrMaxPeriod!= null), (that.oadrMaxPeriod!= null))) {
                return false;
            }
        }
        {
            boolean lhsOadrOnChange;
            lhsOadrOnChange = this.isOadrOnChange();
            boolean rhsOadrOnChange;
            rhsOadrOnChange = that.isOadrOnChange();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "oadrOnChange", lhsOadrOnChange), LocatorUtils.property(thatLocator, "oadrOnChange", rhsOadrOnChange), lhsOadrOnChange, rhsOadrOnChange, true, true)) {
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
            DurationValue theOadrMinPeriod;
            theOadrMinPeriod = this.getOadrMinPeriod();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "oadrMinPeriod", theOadrMinPeriod), currentHashCode, theOadrMinPeriod, (this.oadrMinPeriod!= null));
        }
        {
            DurationValue theOadrMaxPeriod;
            theOadrMaxPeriod = this.getOadrMaxPeriod();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "oadrMaxPeriod", theOadrMaxPeriod), currentHashCode, theOadrMaxPeriod, (this.oadrMaxPeriod!= null));
        }
        {
            boolean theOadrOnChange;
            theOadrOnChange = this.isOadrOnChange();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "oadrOnChange", theOadrOnChange), currentHashCode, theOadrOnChange, true);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

    public OadrSamplingRate withOadrMinPeriod(DurationValue value) {
        setOadrMinPeriod(value);
        return this;
    }

    public OadrSamplingRate withOadrMaxPeriod(DurationValue value) {
        setOadrMaxPeriod(value);
        return this;
    }

    public OadrSamplingRate withOadrOnChange(boolean value) {
        setOadrOnChange(value);
        return this;
    }

}
