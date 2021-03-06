//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.2-hudson-jaxb-ri-2.2-63- 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.02.02 at 04:16:30 PM NZDT 
//


package openadr.model.v20b.greenbutton;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
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
 * Time sequence of Readings of the same ReadingType.
 * 
 * <p>Java class for IntervalBlock complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IntervalBlock">
 *   &lt;complexContent>
 *     &lt;extension base="{http://naesb.org/espi}IdentifiedObject">
 *       &lt;sequence>
 *         &lt;element name="interval" type="{http://naesb.org/espi}DateTimeInterval" minOccurs="0"/>
 *         &lt;element name="IntervalReading" type="{http://naesb.org/espi}IntervalReading" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IntervalBlock", propOrder = {
    "interval",
    "intervalReadings"
})
@XmlRootElement(name = "IntervalBlock")
public class IntervalBlock
    extends IdentifiedObject
    implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 1L;
    protected DateTimeInterval interval;
    @XmlElement(name = "IntervalReading")
    protected List<IntervalReading> intervalReadings;

    /**
     * Default no-arg constructor
     * 
     */
    public IntervalBlock() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public IntervalBlock(final List<java.lang.Object> extensions, final BatchItemInfo batchItemInfo, final DateTimeInterval interval, final List<IntervalReading> intervalReadings) {
        super(extensions, batchItemInfo);
        this.interval = interval;
        this.intervalReadings = intervalReadings;
    }

    /**
     * Gets the value of the interval property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeInterval }
     *     
     */
    public DateTimeInterval getInterval() {
        return interval;
    }

    /**
     * Sets the value of the interval property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeInterval }
     *     
     */
    public void setInterval(DateTimeInterval value) {
        this.interval = value;
    }

    /**
     * Gets the value of the intervalReadings property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the intervalReadings property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIntervalReadings().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IntervalReading }
     * 
     * 
     */
    public List<IntervalReading> getIntervalReadings() {
        if (intervalReadings == null) {
            intervalReadings = new ArrayList<IntervalReading>();
        }
        return this.intervalReadings;
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
            DateTimeInterval theInterval;
            theInterval = this.getInterval();
            strategy.appendField(locator, this, "interval", buffer, theInterval, (this.interval!= null));
        }
        {
            List<IntervalReading> theIntervalReadings;
            theIntervalReadings = (((this.intervalReadings!= null)&&(!this.intervalReadings.isEmpty()))?this.getIntervalReadings():null);
            strategy.appendField(locator, this, "intervalReadings", buffer, theIntervalReadings, ((this.intervalReadings!= null)&&(!this.intervalReadings.isEmpty())));
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
        final IntervalBlock that = ((IntervalBlock) object);
        {
            DateTimeInterval lhsInterval;
            lhsInterval = this.getInterval();
            DateTimeInterval rhsInterval;
            rhsInterval = that.getInterval();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "interval", lhsInterval), LocatorUtils.property(thatLocator, "interval", rhsInterval), lhsInterval, rhsInterval, (this.interval!= null), (that.interval!= null))) {
                return false;
            }
        }
        {
            List<IntervalReading> lhsIntervalReadings;
            lhsIntervalReadings = (((this.intervalReadings!= null)&&(!this.intervalReadings.isEmpty()))?this.getIntervalReadings():null);
            List<IntervalReading> rhsIntervalReadings;
            rhsIntervalReadings = (((that.intervalReadings!= null)&&(!that.intervalReadings.isEmpty()))?that.getIntervalReadings():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "intervalReadings", lhsIntervalReadings), LocatorUtils.property(thatLocator, "intervalReadings", rhsIntervalReadings), lhsIntervalReadings, rhsIntervalReadings, ((this.intervalReadings!= null)&&(!this.intervalReadings.isEmpty())), ((that.intervalReadings!= null)&&(!that.intervalReadings.isEmpty())))) {
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
            DateTimeInterval theInterval;
            theInterval = this.getInterval();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "interval", theInterval), currentHashCode, theInterval, (this.interval!= null));
        }
        {
            List<IntervalReading> theIntervalReadings;
            theIntervalReadings = (((this.intervalReadings!= null)&&(!this.intervalReadings.isEmpty()))?this.getIntervalReadings():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "intervalReadings", theIntervalReadings), currentHashCode, theIntervalReadings, ((this.intervalReadings!= null)&&(!this.intervalReadings.isEmpty())));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

    public IntervalBlock withInterval(DateTimeInterval value) {
        setInterval(value);
        return this;
    }

    public IntervalBlock withIntervalReadings(IntervalReading... values) {
        if (values!= null) {
            for (IntervalReading value: values) {
                getIntervalReadings().add(value);
            }
        }
        return this;
    }

    public IntervalBlock withIntervalReadings(Collection<IntervalReading> values) {
        if (values!= null) {
            getIntervalReadings().addAll(values);
        }
        return this;
    }

    @Override
    public IntervalBlock withBatchItemInfo(BatchItemInfo value) {
        setBatchItemInfo(value);
        return this;
    }

    @Override
    public IntervalBlock withExtensions(java.lang.Object... values) {
        if (values!= null) {
            for (java.lang.Object value: values) {
                getExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public IntervalBlock withExtensions(Collection<java.lang.Object> values) {
        if (values!= null) {
            getExtensions().addAll(values);
        }
        return this;
    }

}
