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
 * Contains the current status of the service.
 * 
 * <p>Java class for ServiceStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceStatus">
 *   &lt;complexContent>
 *     &lt;extension base="{http://naesb.org/espi}Object">
 *       &lt;sequence>
 *         &lt;element name="currentStatus" type="{http://naesb.org/espi}ESPIServiceStatus"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceStatus", propOrder = {
    "currentStatus"
})
@XmlRootElement(name = "ServiceStatus")
public class ServiceStatus
    extends openadr.model.v20b.greenbutton.Object
    implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected String currentStatus;

    /**
     * Default no-arg constructor
     * 
     */
    public ServiceStatus() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public ServiceStatus(final List<java.lang.Object> extensions, final String currentStatus) {
        super(extensions);
        this.currentStatus = currentStatus;
    }

    /**
     * Gets the value of the currentStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentStatus() {
        return currentStatus;
    }

    /**
     * Sets the value of the currentStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentStatus(String value) {
        this.currentStatus = value;
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
            String theCurrentStatus;
            theCurrentStatus = this.getCurrentStatus();
            strategy.appendField(locator, this, "currentStatus", buffer, theCurrentStatus, (this.currentStatus!= null));
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
        final ServiceStatus that = ((ServiceStatus) object);
        {
            String lhsCurrentStatus;
            lhsCurrentStatus = this.getCurrentStatus();
            String rhsCurrentStatus;
            rhsCurrentStatus = that.getCurrentStatus();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "currentStatus", lhsCurrentStatus), LocatorUtils.property(thatLocator, "currentStatus", rhsCurrentStatus), lhsCurrentStatus, rhsCurrentStatus, (this.currentStatus!= null), (that.currentStatus!= null))) {
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
            String theCurrentStatus;
            theCurrentStatus = this.getCurrentStatus();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "currentStatus", theCurrentStatus), currentHashCode, theCurrentStatus, (this.currentStatus!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

    public ServiceStatus withCurrentStatus(String value) {
        setCurrentStatus(value);
        return this;
    }

    @Override
    public ServiceStatus withExtensions(java.lang.Object... values) {
        if (values!= null) {
            for (java.lang.Object value: values) {
                getExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public ServiceStatus withExtensions(Collection<java.lang.Object> values) {
        if (values!= null) {
            getExtensions().addAll(values);
        }
        return this;
    }

}
