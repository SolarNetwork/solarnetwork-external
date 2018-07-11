//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.2-hudson-jaxb-ri-2.2-63- 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.02.02 at 04:16:30 PM NZDT 
//


package openadr.model.v20b.greenbutton;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 * An aggregated summary measurement reading.
 * 
 * <p>Java class for SummaryMeasurement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SummaryMeasurement">
 *   &lt;complexContent>
 *     &lt;extension base="{http://naesb.org/espi}Object">
 *       &lt;sequence>
 *         &lt;element name="powerOfTenMultiplier" type="{http://naesb.org/espi}UnitMultiplierKind" minOccurs="0"/>
 *         &lt;element name="timeStamp" type="{http://naesb.org/espi}TimeType" minOccurs="0"/>
 *         &lt;element name="uom" type="{http://naesb.org/espi}UnitSymbolKind" minOccurs="0"/>
 *         &lt;element name="value" type="{http://naesb.org/espi}Int48" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SummaryMeasurement", propOrder = {
    "powerOfTenMultiplier",
    "timeStamp",
    "uom",
    "value"
})
@XmlRootElement(name = "SummaryMeasurement")
public class SummaryMeasurement
    extends openadr.model.v20b.greenbutton.Object
    implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 1L;
    protected String powerOfTenMultiplier;
    protected Long timeStamp;
    protected String uom;
    protected Long value;

    /**
     * Default no-arg constructor
     * 
     */
    public SummaryMeasurement() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public SummaryMeasurement(final List<java.lang.Object> extensions, final String powerOfTenMultiplier, final Long timeStamp, final String uom, final Long value) {
        super(extensions);
        this.powerOfTenMultiplier = powerOfTenMultiplier;
        this.timeStamp = timeStamp;
        this.uom = uom;
        this.value = value;
    }

    /**
     * Gets the value of the powerOfTenMultiplier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPowerOfTenMultiplier() {
        return powerOfTenMultiplier;
    }

    /**
     * Sets the value of the powerOfTenMultiplier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPowerOfTenMultiplier(String value) {
        this.powerOfTenMultiplier = value;
    }

    /**
     * Gets the value of the timeStamp property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTimeStamp() {
        return timeStamp;
    }

    /**
     * Sets the value of the timeStamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTimeStamp(Long value) {
        this.timeStamp = value;
    }

    /**
     * Gets the value of the uom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUom() {
        return uom;
    }

    /**
     * Sets the value of the uom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUom(String value) {
        this.uom = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setValue(Long value) {
        this.value = value;
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
        super.appendFields(locator, buffer, strategy);
        {
            String thePowerOfTenMultiplier;
            thePowerOfTenMultiplier = this.getPowerOfTenMultiplier();
            strategy.appendField(locator, this, "powerOfTenMultiplier", buffer, thePowerOfTenMultiplier, (this.powerOfTenMultiplier!= null));
        }
        {
            Long theTimeStamp;
            theTimeStamp = this.getTimeStamp();
            strategy.appendField(locator, this, "timeStamp", buffer, theTimeStamp, (this.timeStamp!= null));
        }
        {
            String theUom;
            theUom = this.getUom();
            strategy.appendField(locator, this, "uom", buffer, theUom, (this.uom!= null));
        }
        {
            Long theValue;
            theValue = this.getValue();
            strategy.appendField(locator, this, "value", buffer, theValue, (this.value!= null));
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, java.lang.Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final SummaryMeasurement that = ((SummaryMeasurement) object);
        {
            String lhsPowerOfTenMultiplier;
            lhsPowerOfTenMultiplier = this.getPowerOfTenMultiplier();
            String rhsPowerOfTenMultiplier;
            rhsPowerOfTenMultiplier = that.getPowerOfTenMultiplier();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "powerOfTenMultiplier", lhsPowerOfTenMultiplier), LocatorUtils.property(thatLocator, "powerOfTenMultiplier", rhsPowerOfTenMultiplier), lhsPowerOfTenMultiplier, rhsPowerOfTenMultiplier, (this.powerOfTenMultiplier!= null), (that.powerOfTenMultiplier!= null))) {
                return false;
            }
        }
        {
            Long lhsTimeStamp;
            lhsTimeStamp = this.getTimeStamp();
            Long rhsTimeStamp;
            rhsTimeStamp = that.getTimeStamp();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "timeStamp", lhsTimeStamp), LocatorUtils.property(thatLocator, "timeStamp", rhsTimeStamp), lhsTimeStamp, rhsTimeStamp, (this.timeStamp!= null), (that.timeStamp!= null))) {
                return false;
            }
        }
        {
            String lhsUom;
            lhsUom = this.getUom();
            String rhsUom;
            rhsUom = that.getUom();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "uom", lhsUom), LocatorUtils.property(thatLocator, "uom", rhsUom), lhsUom, rhsUom, (this.uom!= null), (that.uom!= null))) {
                return false;
            }
        }
        {
            Long lhsValue;
            lhsValue = this.getValue();
            Long rhsValue;
            rhsValue = that.getValue();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "value", lhsValue), LocatorUtils.property(thatLocator, "value", rhsValue), lhsValue, rhsValue, (this.value!= null), (that.value!= null))) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(java.lang.Object object) {
        final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy2 strategy) {
        int currentHashCode = super.hashCode(locator, strategy);
        {
            String thePowerOfTenMultiplier;
            thePowerOfTenMultiplier = this.getPowerOfTenMultiplier();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "powerOfTenMultiplier", thePowerOfTenMultiplier), currentHashCode, thePowerOfTenMultiplier, (this.powerOfTenMultiplier!= null));
        }
        {
            Long theTimeStamp;
            theTimeStamp = this.getTimeStamp();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "timeStamp", theTimeStamp), currentHashCode, theTimeStamp, (this.timeStamp!= null));
        }
        {
            String theUom;
            theUom = this.getUom();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "uom", theUom), currentHashCode, theUom, (this.uom!= null));
        }
        {
            Long theValue;
            theValue = this.getValue();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "value", theValue), currentHashCode, theValue, (this.value!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

    public SummaryMeasurement withPowerOfTenMultiplier(String value) {
        setPowerOfTenMultiplier(value);
        return this;
    }

    public SummaryMeasurement withTimeStamp(Long value) {
        setTimeStamp(value);
        return this;
    }

    public SummaryMeasurement withUom(String value) {
        setUom(value);
        return this;
    }

    public SummaryMeasurement withValue(Long value) {
        setValue(value);
        return this;
    }

    @Override
    public SummaryMeasurement withExtensions(java.lang.Object... values) {
        if (values!= null) {
            for (java.lang.Object value: values) {
                getExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public SummaryMeasurement withExtensions(Collection<java.lang.Object> values) {
        if (values!= null) {
            getExtensions().addAll(values);
        }
        return this;
    }

}