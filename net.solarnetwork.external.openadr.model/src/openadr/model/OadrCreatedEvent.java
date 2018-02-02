//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.2-hudson-jaxb-ri-2.2-63- 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.02.02 at 02:58:08 PM NZDT 
//


package openadr.model;

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
 *         &lt;element ref="{http://docs.oasis-open.org/ns/energyinterop/201110/payloads}eiCreatedEvent"/>
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
    "eiCreatedEvent"
})
@XmlRootElement(name = "oadrCreatedEvent", namespace = "http://openadr.org/oadr-2.0a/2012/07")
public class OadrCreatedEvent implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 1L;
    @XmlElement(namespace = "http://docs.oasis-open.org/ns/energyinterop/201110/payloads", required = true)
    protected EiCreatedEvent eiCreatedEvent;

    /**
     * Default no-arg constructor
     * 
     */
    public OadrCreatedEvent() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public OadrCreatedEvent(final EiCreatedEvent eiCreatedEvent) {
        this.eiCreatedEvent = eiCreatedEvent;
    }

    /**
     * Gets the value of the eiCreatedEvent property.
     * 
     * @return
     *     possible object is
     *     {@link EiCreatedEvent }
     *     
     */
    public EiCreatedEvent getEiCreatedEvent() {
        return eiCreatedEvent;
    }

    /**
     * Sets the value of the eiCreatedEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link EiCreatedEvent }
     *     
     */
    public void setEiCreatedEvent(EiCreatedEvent value) {
        this.eiCreatedEvent = value;
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
            EiCreatedEvent theEiCreatedEvent;
            theEiCreatedEvent = this.getEiCreatedEvent();
            strategy.appendField(locator, this, "eiCreatedEvent", buffer, theEiCreatedEvent, (this.eiCreatedEvent!= null));
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
        final OadrCreatedEvent that = ((OadrCreatedEvent) object);
        {
            EiCreatedEvent lhsEiCreatedEvent;
            lhsEiCreatedEvent = this.getEiCreatedEvent();
            EiCreatedEvent rhsEiCreatedEvent;
            rhsEiCreatedEvent = that.getEiCreatedEvent();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "eiCreatedEvent", lhsEiCreatedEvent), LocatorUtils.property(thatLocator, "eiCreatedEvent", rhsEiCreatedEvent), lhsEiCreatedEvent, rhsEiCreatedEvent, (this.eiCreatedEvent!= null), (that.eiCreatedEvent!= null))) {
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
            EiCreatedEvent theEiCreatedEvent;
            theEiCreatedEvent = this.getEiCreatedEvent();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "eiCreatedEvent", theEiCreatedEvent), currentHashCode, theEiCreatedEvent, (this.eiCreatedEvent!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

    public OadrCreatedEvent withEiCreatedEvent(EiCreatedEvent value) {
        setEiCreatedEvent(value);
        return this;
    }

}
