//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.2-hudson-jaxb-ri-2.2-63- 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.02.02 at 02:58:26 PM NZDT 
//


package openadr.model.v20b.xcal;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
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
 * <p>Java class for ArrayOfVavailabilityContainedComponents complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfVavailabilityContainedComponents">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ietf:params:xml:ns:icalendar-2.0}available" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfVavailabilityContainedComponents", propOrder = {
    "availables"
})
public class ArrayOfVavailabilityContainedComponents implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "available")
    protected List<Available> availables;

    /**
     * Default no-arg constructor
     * 
     */
    public ArrayOfVavailabilityContainedComponents() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public ArrayOfVavailabilityContainedComponents(final List<Available> availables) {
        this.availables = availables;
    }

    /**
     * Gets the value of the availables property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the availables property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAvailables().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Available }
     * 
     * 
     */
    public List<Available> getAvailables() {
        if (availables == null) {
            availables = new ArrayList<Available>();
        }
        return this.availables;
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
            List<Available> theAvailables;
            theAvailables = (((this.availables!= null)&&(!this.availables.isEmpty()))?this.getAvailables():null);
            strategy.appendField(locator, this, "availables", buffer, theAvailables, ((this.availables!= null)&&(!this.availables.isEmpty())));
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
        final ArrayOfVavailabilityContainedComponents that = ((ArrayOfVavailabilityContainedComponents) object);
        {
            List<Available> lhsAvailables;
            lhsAvailables = (((this.availables!= null)&&(!this.availables.isEmpty()))?this.getAvailables():null);
            List<Available> rhsAvailables;
            rhsAvailables = (((that.availables!= null)&&(!that.availables.isEmpty()))?that.getAvailables():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "availables", lhsAvailables), LocatorUtils.property(thatLocator, "availables", rhsAvailables), lhsAvailables, rhsAvailables, ((this.availables!= null)&&(!this.availables.isEmpty())), ((that.availables!= null)&&(!that.availables.isEmpty())))) {
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
            List<Available> theAvailables;
            theAvailables = (((this.availables!= null)&&(!this.availables.isEmpty()))?this.getAvailables():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "availables", theAvailables), currentHashCode, theAvailables, ((this.availables!= null)&&(!this.availables.isEmpty())));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

    public ArrayOfVavailabilityContainedComponents withAvailables(Available... values) {
        if (values!= null) {
            for (Available value: values) {
                getAvailables().add(value);
            }
        }
        return this;
    }

    public ArrayOfVavailabilityContainedComponents withAvailables(Collection<Available> values) {
        if (values!= null) {
            getAvailables().addAll(values);
        }
        return this;
    }

}
