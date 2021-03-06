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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 * Fully Qualified Event ID includes the eventID and the Modification Number
 * 
 * <p>Java class for QualifiedEventIDType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QualifiedEventIDType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/energyinterop/201110}eventID"/>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/energyinterop/201110}modificationNumber"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QualifiedEventIDType", propOrder = {
    "eventID",
    "modificationNumber"
})
public class QualifiedEventID implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected String eventID;
    @XmlSchemaType(name = "unsignedInt")
    protected long modificationNumber;

    /**
     * Default no-arg constructor
     * 
     */
    public QualifiedEventID() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public QualifiedEventID(final String eventID, final long modificationNumber) {
        this.eventID = eventID;
        this.modificationNumber = modificationNumber;
    }

    /**
     * Gets the value of the eventID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventID() {
        return eventID;
    }

    /**
     * Sets the value of the eventID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventID(String value) {
        this.eventID = value;
    }

    /**
     * Gets the value of the modificationNumber property.
     * 
     */
    public long getModificationNumber() {
        return modificationNumber;
    }

    /**
     * Sets the value of the modificationNumber property.
     * 
     */
    public void setModificationNumber(long value) {
        this.modificationNumber = value;
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
            String theEventID;
            theEventID = this.getEventID();
            strategy.appendField(locator, this, "eventID", buffer, theEventID, (this.eventID!= null));
        }
        {
            long theModificationNumber;
            theModificationNumber = this.getModificationNumber();
            strategy.appendField(locator, this, "modificationNumber", buffer, theModificationNumber, true);
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
        final QualifiedEventID that = ((QualifiedEventID) object);
        {
            String lhsEventID;
            lhsEventID = this.getEventID();
            String rhsEventID;
            rhsEventID = that.getEventID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "eventID", lhsEventID), LocatorUtils.property(thatLocator, "eventID", rhsEventID), lhsEventID, rhsEventID, (this.eventID!= null), (that.eventID!= null))) {
                return false;
            }
        }
        {
            long lhsModificationNumber;
            lhsModificationNumber = this.getModificationNumber();
            long rhsModificationNumber;
            rhsModificationNumber = that.getModificationNumber();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "modificationNumber", lhsModificationNumber), LocatorUtils.property(thatLocator, "modificationNumber", rhsModificationNumber), lhsModificationNumber, rhsModificationNumber, true, true)) {
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
            String theEventID;
            theEventID = this.getEventID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "eventID", theEventID), currentHashCode, theEventID, (this.eventID!= null));
        }
        {
            long theModificationNumber;
            theModificationNumber = this.getModificationNumber();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "modificationNumber", theModificationNumber), currentHashCode, theModificationNumber, true);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

    public QualifiedEventID withEventID(String value) {
        setEventID(value);
        return this;
    }

    public QualifiedEventID withModificationNumber(long value) {
        setModificationNumber(value);
        return this;
    }

}
