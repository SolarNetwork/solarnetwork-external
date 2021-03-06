//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.2-hudson-jaxb-ri-2.2-63- 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.02.02 at 04:16:30 PM NZDT 
//


package openadr.model.v20b.greenbutton;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 * [extension] Line item of detail for additional cost
 * 
 * <p>Java class for LineItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LineItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="amount" type="{http://naesb.org/espi}Int48"/>
 *         &lt;element name="rounding" type="{http://naesb.org/espi}Int48" minOccurs="0"/>
 *         &lt;element name="dateTime" type="{http://naesb.org/espi}TimeType"/>
 *         &lt;element name="note" type="{http://naesb.org/espi}String256"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LineItem", propOrder = {
    "amount",
    "rounding",
    "dateTime",
    "note"
})
public class LineItem implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 1L;
    protected long amount;
    protected Long rounding;
    protected long dateTime;
    @XmlElement(required = true)
    protected String note;

    /**
     * Default no-arg constructor
     * 
     */
    public LineItem() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public LineItem(final long amount, final Long rounding, final long dateTime, final String note) {
        this.amount = amount;
        this.rounding = rounding;
        this.dateTime = dateTime;
        this.note = note;
    }

    /**
     * Gets the value of the amount property.
     * 
     */
    public long getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     */
    public void setAmount(long value) {
        this.amount = value;
    }

    /**
     * Gets the value of the rounding property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRounding() {
        return rounding;
    }

    /**
     * Sets the value of the rounding property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRounding(Long value) {
        this.rounding = value;
    }

    /**
     * Gets the value of the dateTime property.
     * 
     */
    public long getDateTime() {
        return dateTime;
    }

    /**
     * Sets the value of the dateTime property.
     * 
     */
    public void setDateTime(long value) {
        this.dateTime = value;
    }

    /**
     * Gets the value of the note property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNote() {
        return note;
    }

    /**
     * Sets the value of the note property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNote(String value) {
        this.note = value;
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
            long theAmount;
            theAmount = this.getAmount();
            strategy.appendField(locator, this, "amount", buffer, theAmount, true);
        }
        {
            Long theRounding;
            theRounding = this.getRounding();
            strategy.appendField(locator, this, "rounding", buffer, theRounding, (this.rounding!= null));
        }
        {
            long theDateTime;
            theDateTime = this.getDateTime();
            strategy.appendField(locator, this, "dateTime", buffer, theDateTime, true);
        }
        {
            String theNote;
            theNote = this.getNote();
            strategy.appendField(locator, this, "note", buffer, theNote, (this.note!= null));
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
        final LineItem that = ((LineItem) object);
        {
            long lhsAmount;
            lhsAmount = this.getAmount();
            long rhsAmount;
            rhsAmount = that.getAmount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "amount", lhsAmount), LocatorUtils.property(thatLocator, "amount", rhsAmount), lhsAmount, rhsAmount, true, true)) {
                return false;
            }
        }
        {
            Long lhsRounding;
            lhsRounding = this.getRounding();
            Long rhsRounding;
            rhsRounding = that.getRounding();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "rounding", lhsRounding), LocatorUtils.property(thatLocator, "rounding", rhsRounding), lhsRounding, rhsRounding, (this.rounding!= null), (that.rounding!= null))) {
                return false;
            }
        }
        {
            long lhsDateTime;
            lhsDateTime = this.getDateTime();
            long rhsDateTime;
            rhsDateTime = that.getDateTime();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dateTime", lhsDateTime), LocatorUtils.property(thatLocator, "dateTime", rhsDateTime), lhsDateTime, rhsDateTime, true, true)) {
                return false;
            }
        }
        {
            String lhsNote;
            lhsNote = this.getNote();
            String rhsNote;
            rhsNote = that.getNote();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "note", lhsNote), LocatorUtils.property(thatLocator, "note", rhsNote), lhsNote, rhsNote, (this.note!= null), (that.note!= null))) {
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
        int currentHashCode = 1;
        {
            long theAmount;
            theAmount = this.getAmount();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "amount", theAmount), currentHashCode, theAmount, true);
        }
        {
            Long theRounding;
            theRounding = this.getRounding();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "rounding", theRounding), currentHashCode, theRounding, (this.rounding!= null));
        }
        {
            long theDateTime;
            theDateTime = this.getDateTime();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dateTime", theDateTime), currentHashCode, theDateTime, true);
        }
        {
            String theNote;
            theNote = this.getNote();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "note", theNote), currentHashCode, theNote, (this.note!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

    public LineItem withAmount(long value) {
        setAmount(value);
        return this;
    }

    public LineItem withRounding(Long value) {
        setRounding(value);
        return this;
    }

    public LineItem withDateTime(long value) {
        setDateTime(value);
        return this;
    }

    public LineItem withNote(String value) {
        setNote(value);
        return this;
    }

}
