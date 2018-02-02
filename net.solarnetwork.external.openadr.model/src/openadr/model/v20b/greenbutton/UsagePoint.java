//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.2-hudson-jaxb-ri-2.2-63- 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.02.02 at 02:58:26 PM NZDT 
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
import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
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
 * Logical point on a network at which consumption or production is either physically measured (e.g., metered) or estimated (e.g., unmetered street lights).
 * 
 * <p>Java class for UsagePoint complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UsagePoint">
 *   &lt;complexContent>
 *     &lt;extension base="{http://naesb.org/espi}IdentifiedObject">
 *       &lt;sequence>
 *         &lt;element name="roleFlags" type="{http://naesb.org/espi}HexBinary16" minOccurs="0"/>
 *         &lt;element name="ServiceCategory" type="{http://naesb.org/espi}ServiceCategory" minOccurs="0"/>
 *         &lt;element name="status" type="{http://naesb.org/espi}UInt8" minOccurs="0"/>
 *         &lt;element name="ServiceDeliveryPoint" type="{http://naesb.org/espi}ServiceDeliveryPoint" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UsagePoint", propOrder = {
    "roleFlags",
    "serviceCategory",
    "status",
    "serviceDeliveryPoint"
})
@XmlRootElement(name = "UsagePoint")
public class UsagePoint
    extends IdentifiedObject
    implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 1L;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    protected byte[] roleFlags;
    @XmlElement(name = "ServiceCategory")
    protected ServiceCategory serviceCategory;
    protected Short status;
    @XmlElement(name = "ServiceDeliveryPoint")
    protected ServiceDeliveryPoint serviceDeliveryPoint;

    /**
     * Default no-arg constructor
     * 
     */
    public UsagePoint() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public UsagePoint(final List<java.lang.Object> extensions, final BatchItemInfo batchItemInfo, final byte[] roleFlags, final ServiceCategory serviceCategory, final Short status, final ServiceDeliveryPoint serviceDeliveryPoint) {
        super(extensions, batchItemInfo);
        this.roleFlags = roleFlags;
        this.serviceCategory = serviceCategory;
        this.status = status;
        this.serviceDeliveryPoint = serviceDeliveryPoint;
    }

    /**
     * Gets the value of the roleFlags property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getRoleFlags() {
        return roleFlags;
    }

    /**
     * Sets the value of the roleFlags property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoleFlags(byte[] value) {
        this.roleFlags = ((byte[]) value);
    }

    /**
     * Gets the value of the serviceCategory property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceCategory }
     *     
     */
    public ServiceCategory getServiceCategory() {
        return serviceCategory;
    }

    /**
     * Sets the value of the serviceCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceCategory }
     *     
     */
    public void setServiceCategory(ServiceCategory value) {
        this.serviceCategory = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setStatus(Short value) {
        this.status = value;
    }

    /**
     * Gets the value of the serviceDeliveryPoint property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceDeliveryPoint }
     *     
     */
    public ServiceDeliveryPoint getServiceDeliveryPoint() {
        return serviceDeliveryPoint;
    }

    /**
     * Sets the value of the serviceDeliveryPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceDeliveryPoint }
     *     
     */
    public void setServiceDeliveryPoint(ServiceDeliveryPoint value) {
        this.serviceDeliveryPoint = value;
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
            byte[] theRoleFlags;
            theRoleFlags = this.getRoleFlags();
            strategy.appendField(locator, this, "roleFlags", buffer, theRoleFlags, (this.roleFlags!= null));
        }
        {
            ServiceCategory theServiceCategory;
            theServiceCategory = this.getServiceCategory();
            strategy.appendField(locator, this, "serviceCategory", buffer, theServiceCategory, (this.serviceCategory!= null));
        }
        {
            Short theStatus;
            theStatus = this.getStatus();
            strategy.appendField(locator, this, "status", buffer, theStatus, (this.status!= null));
        }
        {
            ServiceDeliveryPoint theServiceDeliveryPoint;
            theServiceDeliveryPoint = this.getServiceDeliveryPoint();
            strategy.appendField(locator, this, "serviceDeliveryPoint", buffer, theServiceDeliveryPoint, (this.serviceDeliveryPoint!= null));
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
        final UsagePoint that = ((UsagePoint) object);
        {
            byte[] lhsRoleFlags;
            lhsRoleFlags = this.getRoleFlags();
            byte[] rhsRoleFlags;
            rhsRoleFlags = that.getRoleFlags();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "roleFlags", lhsRoleFlags), LocatorUtils.property(thatLocator, "roleFlags", rhsRoleFlags), lhsRoleFlags, rhsRoleFlags, (this.roleFlags!= null), (that.roleFlags!= null))) {
                return false;
            }
        }
        {
            ServiceCategory lhsServiceCategory;
            lhsServiceCategory = this.getServiceCategory();
            ServiceCategory rhsServiceCategory;
            rhsServiceCategory = that.getServiceCategory();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "serviceCategory", lhsServiceCategory), LocatorUtils.property(thatLocator, "serviceCategory", rhsServiceCategory), lhsServiceCategory, rhsServiceCategory, (this.serviceCategory!= null), (that.serviceCategory!= null))) {
                return false;
            }
        }
        {
            Short lhsStatus;
            lhsStatus = this.getStatus();
            Short rhsStatus;
            rhsStatus = that.getStatus();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "status", lhsStatus), LocatorUtils.property(thatLocator, "status", rhsStatus), lhsStatus, rhsStatus, (this.status!= null), (that.status!= null))) {
                return false;
            }
        }
        {
            ServiceDeliveryPoint lhsServiceDeliveryPoint;
            lhsServiceDeliveryPoint = this.getServiceDeliveryPoint();
            ServiceDeliveryPoint rhsServiceDeliveryPoint;
            rhsServiceDeliveryPoint = that.getServiceDeliveryPoint();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "serviceDeliveryPoint", lhsServiceDeliveryPoint), LocatorUtils.property(thatLocator, "serviceDeliveryPoint", rhsServiceDeliveryPoint), lhsServiceDeliveryPoint, rhsServiceDeliveryPoint, (this.serviceDeliveryPoint!= null), (that.serviceDeliveryPoint!= null))) {
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
            byte[] theRoleFlags;
            theRoleFlags = this.getRoleFlags();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "roleFlags", theRoleFlags), currentHashCode, theRoleFlags, (this.roleFlags!= null));
        }
        {
            ServiceCategory theServiceCategory;
            theServiceCategory = this.getServiceCategory();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "serviceCategory", theServiceCategory), currentHashCode, theServiceCategory, (this.serviceCategory!= null));
        }
        {
            Short theStatus;
            theStatus = this.getStatus();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "status", theStatus), currentHashCode, theStatus, (this.status!= null));
        }
        {
            ServiceDeliveryPoint theServiceDeliveryPoint;
            theServiceDeliveryPoint = this.getServiceDeliveryPoint();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "serviceDeliveryPoint", theServiceDeliveryPoint), currentHashCode, theServiceDeliveryPoint, (this.serviceDeliveryPoint!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

    public UsagePoint withRoleFlags(byte[] value) {
        setRoleFlags(value);
        return this;
    }

    public UsagePoint withServiceCategory(ServiceCategory value) {
        setServiceCategory(value);
        return this;
    }

    public UsagePoint withStatus(Short value) {
        setStatus(value);
        return this;
    }

    public UsagePoint withServiceDeliveryPoint(ServiceDeliveryPoint value) {
        setServiceDeliveryPoint(value);
        return this;
    }

    @Override
    public UsagePoint withBatchItemInfo(BatchItemInfo value) {
        setBatchItemInfo(value);
        return this;
    }

    @Override
    public UsagePoint withExtensions(java.lang.Object... values) {
        if (values!= null) {
            for (java.lang.Object value: values) {
                getExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public UsagePoint withExtensions(Collection<java.lang.Object> values) {
        if (values!= null) {
            getExtensions().addAll(values);
        }
        return this;
    }

}
