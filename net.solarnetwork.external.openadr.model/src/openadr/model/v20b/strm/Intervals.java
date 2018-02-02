//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.2-hudson-jaxb-ri-2.2-63- 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.02.02 at 04:16:30 PM NZDT 
//


package openadr.model.v20b.strm;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import openadr.model.v20b.ei.Interval;
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
 *         &lt;element ref="{http://docs.oasis-open.org/ns/energyinterop/201110}interval" maxOccurs="unbounded"/>
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
    "intervals"
})
@XmlRootElement(name = "intervals")
public class Intervals implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "interval", namespace = "http://docs.oasis-open.org/ns/energyinterop/201110", required = true)
    protected List<Interval> intervals;

    /**
     * Default no-arg constructor
     * 
     */
    public Intervals() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public Intervals(final List<Interval> intervals) {
        this.intervals = intervals;
    }

    /**
     * Gets the value of the intervals property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the intervals property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIntervals().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Interval }
     * 
     * 
     */
    public List<Interval> getIntervals() {
        if (intervals == null) {
            intervals = new ArrayList<Interval>();
        }
        return this.intervals;
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
            List<Interval> theIntervals;
            theIntervals = (((this.intervals!= null)&&(!this.intervals.isEmpty()))?this.getIntervals():null);
            strategy.appendField(locator, this, "intervals", buffer, theIntervals, ((this.intervals!= null)&&(!this.intervals.isEmpty())));
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
        final Intervals that = ((Intervals) object);
        {
            List<Interval> lhsIntervals;
            lhsIntervals = (((this.intervals!= null)&&(!this.intervals.isEmpty()))?this.getIntervals():null);
            List<Interval> rhsIntervals;
            rhsIntervals = (((that.intervals!= null)&&(!that.intervals.isEmpty()))?that.getIntervals():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "intervals", lhsIntervals), LocatorUtils.property(thatLocator, "intervals", rhsIntervals), lhsIntervals, rhsIntervals, ((this.intervals!= null)&&(!this.intervals.isEmpty())), ((that.intervals!= null)&&(!that.intervals.isEmpty())))) {
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
            List<Interval> theIntervals;
            theIntervals = (((this.intervals!= null)&&(!this.intervals.isEmpty()))?this.getIntervals():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "intervals", theIntervals), currentHashCode, theIntervals, ((this.intervals!= null)&&(!this.intervals.isEmpty())));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

    public Intervals withIntervals(Interval... values) {
        if (values!= null) {
            for (Interval value: values) {
                getIntervals().add(value);
            }
        }
        return this;
    }

    public Intervals withIntervals(Collection<Interval> values) {
        if (values!= null) {
            getIntervals().addAll(values);
        }
        return this;
    }

}
