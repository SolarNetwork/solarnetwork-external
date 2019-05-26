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
 * [extension] Service Delivery Point is representation of revenue UsagePoint attributes
 * 
 * <p>Java class for ServiceDeliveryPoint complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceDeliveryPoint">
 *   &lt;complexContent>
 *     &lt;extension base="{http://naesb.org/espi}Object">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://naesb.org/espi}String256" minOccurs="0"/>
 *         &lt;element name="tariffProfile" type="{http://naesb.org/espi}String256" minOccurs="0"/>
 *         &lt;element name="customerAgreement" type="{http://naesb.org/espi}String256" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceDeliveryPoint", propOrder = {
    "name",
    "tariffProfile",
    "customerAgreement"
})
public class ServiceDeliveryPoint
    extends openadr.model.v20b.greenbutton.Object
    implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 1L;
    protected String name;
    protected String tariffProfile;
    protected String customerAgreement;

    /**
     * Default no-arg constructor
     * 
     */
    public ServiceDeliveryPoint() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public ServiceDeliveryPoint(final List<java.lang.Object> extensions, final String name, final String tariffProfile, final String customerAgreement) {
        super(extensions);
        this.name = name;
        this.tariffProfile = tariffProfile;
        this.customerAgreement = customerAgreement;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the tariffProfile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTariffProfile() {
        return tariffProfile;
    }

    /**
     * Sets the value of the tariffProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTariffProfile(String value) {
        this.tariffProfile = value;
    }

    /**
     * Gets the value of the customerAgreement property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerAgreement() {
        return customerAgreement;
    }

    /**
     * Sets the value of the customerAgreement property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerAgreement(String value) {
        this.customerAgreement = value;
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
            String theName;
            theName = this.getName();
            strategy.appendField(locator, this, "name", buffer, theName, (this.name!= null));
        }
        {
            String theTariffProfile;
            theTariffProfile = this.getTariffProfile();
            strategy.appendField(locator, this, "tariffProfile", buffer, theTariffProfile, (this.tariffProfile!= null));
        }
        {
            String theCustomerAgreement;
            theCustomerAgreement = this.getCustomerAgreement();
            strategy.appendField(locator, this, "customerAgreement", buffer, theCustomerAgreement, (this.customerAgreement!= null));
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
        final ServiceDeliveryPoint that = ((ServiceDeliveryPoint) object);
        {
            String lhsName;
            lhsName = this.getName();
            String rhsName;
            rhsName = that.getName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "name", lhsName), LocatorUtils.property(thatLocator, "name", rhsName), lhsName, rhsName, (this.name!= null), (that.name!= null))) {
                return false;
            }
        }
        {
            String lhsTariffProfile;
            lhsTariffProfile = this.getTariffProfile();
            String rhsTariffProfile;
            rhsTariffProfile = that.getTariffProfile();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "tariffProfile", lhsTariffProfile), LocatorUtils.property(thatLocator, "tariffProfile", rhsTariffProfile), lhsTariffProfile, rhsTariffProfile, (this.tariffProfile!= null), (that.tariffProfile!= null))) {
                return false;
            }
        }
        {
            String lhsCustomerAgreement;
            lhsCustomerAgreement = this.getCustomerAgreement();
            String rhsCustomerAgreement;
            rhsCustomerAgreement = that.getCustomerAgreement();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "customerAgreement", lhsCustomerAgreement), LocatorUtils.property(thatLocator, "customerAgreement", rhsCustomerAgreement), lhsCustomerAgreement, rhsCustomerAgreement, (this.customerAgreement!= null), (that.customerAgreement!= null))) {
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
            String theName;
            theName = this.getName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "name", theName), currentHashCode, theName, (this.name!= null));
        }
        {
            String theTariffProfile;
            theTariffProfile = this.getTariffProfile();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "tariffProfile", theTariffProfile), currentHashCode, theTariffProfile, (this.tariffProfile!= null));
        }
        {
            String theCustomerAgreement;
            theCustomerAgreement = this.getCustomerAgreement();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "customerAgreement", theCustomerAgreement), currentHashCode, theCustomerAgreement, (this.customerAgreement!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

    public ServiceDeliveryPoint withName(String value) {
        setName(value);
        return this;
    }

    public ServiceDeliveryPoint withTariffProfile(String value) {
        setTariffProfile(value);
        return this;
    }

    public ServiceDeliveryPoint withCustomerAgreement(String value) {
        setCustomerAgreement(value);
        return this;
    }

    @Override
    public ServiceDeliveryPoint withExtensions(java.lang.Object... values) {
        if (values!= null) {
            for (java.lang.Object value: values) {
                getExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public ServiceDeliveryPoint withExtensions(Collection<java.lang.Object> values) {
        if (values!= null) {
            getExtensions().addAll(values);
        }
        return this;
    }

}
