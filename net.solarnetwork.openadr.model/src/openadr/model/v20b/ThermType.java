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
import javax.xml.bind.annotation.XmlType;
import openadr.model.v20b.emix.ItemBaseType;
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
 * Therm
 * 
 * <p>Java class for ThermType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ThermType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://docs.oasis-open.org/ns/emix/2011/06}ItemBaseType">
 *       &lt;sequence>
 *         &lt;element name="itemDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="itemUnits" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/emix/2011/06/siscale}siScaleCode"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ThermType", propOrder = {
    "itemDescription",
    "itemUnits",
    "siScaleCode"
})
public class ThermType
    extends ItemBaseType
    implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected String itemDescription;
    @XmlElement(required = true)
    protected String itemUnits;
    @XmlElement(namespace = "http://docs.oasis-open.org/ns/emix/2011/06/siscale", required = true)
    protected String siScaleCode;

    /**
     * Default no-arg constructor
     * 
     */
    public ThermType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public ThermType(final String itemDescription, final String itemUnits, final String siScaleCode) {
        super();
        this.itemDescription = itemDescription;
        this.itemUnits = itemUnits;
        this.siScaleCode = siScaleCode;
    }

    /**
     * Gets the value of the itemDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemDescription() {
        return itemDescription;
    }

    /**
     * Sets the value of the itemDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemDescription(String value) {
        this.itemDescription = value;
    }

    /**
     * Gets the value of the itemUnits property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemUnits() {
        return itemUnits;
    }

    /**
     * Sets the value of the itemUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemUnits(String value) {
        this.itemUnits = value;
    }

    /**
     * Gets the value of the siScaleCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSiScaleCode() {
        return siScaleCode;
    }

    /**
     * Sets the value of the siScaleCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSiScaleCode(String value) {
        this.siScaleCode = value;
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
            String theItemDescription;
            theItemDescription = this.getItemDescription();
            strategy.appendField(locator, this, "itemDescription", buffer, theItemDescription, (this.itemDescription!= null));
        }
        {
            String theItemUnits;
            theItemUnits = this.getItemUnits();
            strategy.appendField(locator, this, "itemUnits", buffer, theItemUnits, (this.itemUnits!= null));
        }
        {
            String theSiScaleCode;
            theSiScaleCode = this.getSiScaleCode();
            strategy.appendField(locator, this, "siScaleCode", buffer, theSiScaleCode, (this.siScaleCode!= null));
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
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final ThermType that = ((ThermType) object);
        {
            String lhsItemDescription;
            lhsItemDescription = this.getItemDescription();
            String rhsItemDescription;
            rhsItemDescription = that.getItemDescription();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "itemDescription", lhsItemDescription), LocatorUtils.property(thatLocator, "itemDescription", rhsItemDescription), lhsItemDescription, rhsItemDescription, (this.itemDescription!= null), (that.itemDescription!= null))) {
                return false;
            }
        }
        {
            String lhsItemUnits;
            lhsItemUnits = this.getItemUnits();
            String rhsItemUnits;
            rhsItemUnits = that.getItemUnits();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "itemUnits", lhsItemUnits), LocatorUtils.property(thatLocator, "itemUnits", rhsItemUnits), lhsItemUnits, rhsItemUnits, (this.itemUnits!= null), (that.itemUnits!= null))) {
                return false;
            }
        }
        {
            String lhsSiScaleCode;
            lhsSiScaleCode = this.getSiScaleCode();
            String rhsSiScaleCode;
            rhsSiScaleCode = that.getSiScaleCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "siScaleCode", lhsSiScaleCode), LocatorUtils.property(thatLocator, "siScaleCode", rhsSiScaleCode), lhsSiScaleCode, rhsSiScaleCode, (this.siScaleCode!= null), (that.siScaleCode!= null))) {
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
        int currentHashCode = super.hashCode(locator, strategy);
        {
            String theItemDescription;
            theItemDescription = this.getItemDescription();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "itemDescription", theItemDescription), currentHashCode, theItemDescription, (this.itemDescription!= null));
        }
        {
            String theItemUnits;
            theItemUnits = this.getItemUnits();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "itemUnits", theItemUnits), currentHashCode, theItemUnits, (this.itemUnits!= null));
        }
        {
            String theSiScaleCode;
            theSiScaleCode = this.getSiScaleCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "siScaleCode", theSiScaleCode), currentHashCode, theSiScaleCode, (this.siScaleCode!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

    public ThermType withItemDescription(String value) {
        setItemDescription(value);
        return this;
    }

    public ThermType withItemUnits(String value) {
        setItemUnits(value);
        return this;
    }

    public ThermType withSiScaleCode(String value) {
        setSiScaleCode(value);
        return this;
    }

}
