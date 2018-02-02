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
 * abstract base for communication of schedules for signals and observations
 * 
 * <p>Java class for StreamBaseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StreamBaseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ietf:params:xml:ns:icalendar-2.0}dtstart" minOccurs="0"/>
 *         &lt;element ref="{urn:ietf:params:xml:ns:icalendar-2.0}duration" minOccurs="0"/>
 *         &lt;element ref="{urn:ietf:params:xml:ns:icalendar-2.0:stream}intervals" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StreamBaseType", namespace = "urn:ietf:params:xml:ns:icalendar-2.0:stream", propOrder = {
    "dtstart",
    "duration",
    "intervals"
})
public abstract class StreamBase implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 1L;
    @XmlElement(namespace = "urn:ietf:params:xml:ns:icalendar-2.0")
    protected Dtstart dtstart;
    @XmlElement(namespace = "urn:ietf:params:xml:ns:icalendar-2.0")
    protected DurationPropType duration;
    protected Intervals intervals;

    /**
     * Default no-arg constructor
     * 
     */
    public StreamBase() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public StreamBase(final Dtstart dtstart, final DurationPropType duration, final Intervals intervals) {
        this.dtstart = dtstart;
        this.duration = duration;
        this.intervals = intervals;
    }

    /**
     * Indicates when the Designated Interval of the Stream begins. May be inherited from containing artifact.
     * 
     * @return
     *     possible object is
     *     {@link Dtstart }
     *     
     */
    public Dtstart getDtstart() {
        return dtstart;
    }

    /**
     * Sets the value of the dtstart property.
     * 
     * @param value
     *     allowed object is
     *     {@link Dtstart }
     *     
     */
    public void setDtstart(Dtstart value) {
        this.dtstart = value;
    }

    /**
     * Indicates the duration inherited by the intervals. May be inherited from containing artifact.
     * 
     * @return
     *     possible object is
     *     {@link DurationPropType }
     *     
     */
    public DurationPropType getDuration() {
        return duration;
    }

    /**
     * Sets the value of the duration property.
     * 
     * @param value
     *     allowed object is
     *     {@link DurationPropType }
     *     
     */
    public void setDuration(DurationPropType value) {
        this.duration = value;
    }

    /**
     * Gets the value of the intervals property.
     * 
     * @return
     *     possible object is
     *     {@link Intervals }
     *     
     */
    public Intervals getIntervals() {
        return intervals;
    }

    /**
     * Sets the value of the intervals property.
     * 
     * @param value
     *     allowed object is
     *     {@link Intervals }
     *     
     */
    public void setIntervals(Intervals value) {
        this.intervals = value;
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
            Dtstart theDtstart;
            theDtstart = this.getDtstart();
            strategy.appendField(locator, this, "dtstart", buffer, theDtstart, (this.dtstart!= null));
        }
        {
            DurationPropType theDuration;
            theDuration = this.getDuration();
            strategy.appendField(locator, this, "duration", buffer, theDuration, (this.duration!= null));
        }
        {
            Intervals theIntervals;
            theIntervals = this.getIntervals();
            strategy.appendField(locator, this, "intervals", buffer, theIntervals, (this.intervals!= null));
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
        final StreamBase that = ((StreamBase) object);
        {
            Dtstart lhsDtstart;
            lhsDtstart = this.getDtstart();
            Dtstart rhsDtstart;
            rhsDtstart = that.getDtstart();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dtstart", lhsDtstart), LocatorUtils.property(thatLocator, "dtstart", rhsDtstart), lhsDtstart, rhsDtstart, (this.dtstart!= null), (that.dtstart!= null))) {
                return false;
            }
        }
        {
            DurationPropType lhsDuration;
            lhsDuration = this.getDuration();
            DurationPropType rhsDuration;
            rhsDuration = that.getDuration();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "duration", lhsDuration), LocatorUtils.property(thatLocator, "duration", rhsDuration), lhsDuration, rhsDuration, (this.duration!= null), (that.duration!= null))) {
                return false;
            }
        }
        {
            Intervals lhsIntervals;
            lhsIntervals = this.getIntervals();
            Intervals rhsIntervals;
            rhsIntervals = that.getIntervals();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "intervals", lhsIntervals), LocatorUtils.property(thatLocator, "intervals", rhsIntervals), lhsIntervals, rhsIntervals, (this.intervals!= null), (that.intervals!= null))) {
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
            Dtstart theDtstart;
            theDtstart = this.getDtstart();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dtstart", theDtstart), currentHashCode, theDtstart, (this.dtstart!= null));
        }
        {
            DurationPropType theDuration;
            theDuration = this.getDuration();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "duration", theDuration), currentHashCode, theDuration, (this.duration!= null));
        }
        {
            Intervals theIntervals;
            theIntervals = this.getIntervals();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "intervals", theIntervals), currentHashCode, theIntervals, (this.intervals!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

    public StreamBase withDtstart(Dtstart value) {
        setDtstart(value);
        return this;
    }

    public StreamBase withDuration(DurationPropType value) {
        setDuration(value);
        return this;
    }

    public StreamBase withIntervals(Intervals value) {
        setIntervals(value);
        return this;
    }

}
