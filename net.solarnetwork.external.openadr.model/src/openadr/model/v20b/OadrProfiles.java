//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.2-hudson-jaxb-ri-2.2-63- 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.02.02 at 02:58:26 PM NZDT 
//


package openadr.model.v20b;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
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
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="oadrProfile" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://openadr.org/oadr-2.0b/2012/07}oadrProfileName"/>
 *                   &lt;element ref="{http://openadr.org/oadr-2.0b/2012/07}oadrTransports"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
    "oadrProfiles"
})
@XmlRootElement(name = "oadrProfiles")
public class OadrProfiles implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "oadrProfile", required = true)
    protected List<OadrProfiles.OadrProfile> oadrProfiles;

    /**
     * Default no-arg constructor
     * 
     */
    public OadrProfiles() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public OadrProfiles(final List<OadrProfiles.OadrProfile> oadrProfiles) {
        this.oadrProfiles = oadrProfiles;
    }

    /**
     * Gets the value of the oadrProfiles property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the oadrProfiles property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOadrProfiles().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OadrProfiles.OadrProfile }
     * 
     * 
     */
    public List<OadrProfiles.OadrProfile> getOadrProfiles() {
        if (oadrProfiles == null) {
            oadrProfiles = new ArrayList<OadrProfiles.OadrProfile>();
        }
        return this.oadrProfiles;
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
            List<OadrProfiles.OadrProfile> theOadrProfiles;
            theOadrProfiles = (((this.oadrProfiles!= null)&&(!this.oadrProfiles.isEmpty()))?this.getOadrProfiles():null);
            strategy.appendField(locator, this, "oadrProfiles", buffer, theOadrProfiles, ((this.oadrProfiles!= null)&&(!this.oadrProfiles.isEmpty())));
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
        final OadrProfiles that = ((OadrProfiles) object);
        {
            List<OadrProfiles.OadrProfile> lhsOadrProfiles;
            lhsOadrProfiles = (((this.oadrProfiles!= null)&&(!this.oadrProfiles.isEmpty()))?this.getOadrProfiles():null);
            List<OadrProfiles.OadrProfile> rhsOadrProfiles;
            rhsOadrProfiles = (((that.oadrProfiles!= null)&&(!that.oadrProfiles.isEmpty()))?that.getOadrProfiles():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "oadrProfiles", lhsOadrProfiles), LocatorUtils.property(thatLocator, "oadrProfiles", rhsOadrProfiles), lhsOadrProfiles, rhsOadrProfiles, ((this.oadrProfiles!= null)&&(!this.oadrProfiles.isEmpty())), ((that.oadrProfiles!= null)&&(!that.oadrProfiles.isEmpty())))) {
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
            List<OadrProfiles.OadrProfile> theOadrProfiles;
            theOadrProfiles = (((this.oadrProfiles!= null)&&(!this.oadrProfiles.isEmpty()))?this.getOadrProfiles():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "oadrProfiles", theOadrProfiles), currentHashCode, theOadrProfiles, ((this.oadrProfiles!= null)&&(!this.oadrProfiles.isEmpty())));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

    public OadrProfiles withOadrProfiles(OadrProfiles.OadrProfile... values) {
        if (values!= null) {
            for (OadrProfiles.OadrProfile value: values) {
                getOadrProfiles().add(value);
            }
        }
        return this;
    }

    public OadrProfiles withOadrProfiles(Collection<OadrProfiles.OadrProfile> values) {
        if (values!= null) {
            getOadrProfiles().addAll(values);
        }
        return this;
    }


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
     *         &lt;element ref="{http://openadr.org/oadr-2.0b/2012/07}oadrProfileName"/>
     *         &lt;element ref="{http://openadr.org/oadr-2.0b/2012/07}oadrTransports"/>
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
        "oadrProfileName",
        "oadrTransports"
    })
    public static class OadrProfile implements Serializable, Equals2, HashCode2, ToString2
    {

        private final static long serialVersionUID = 1L;
        @XmlElement(required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String oadrProfileName;
        @XmlElement(required = true)
        protected OadrTransports oadrTransports;

        /**
         * Default no-arg constructor
         * 
         */
        public OadrProfile() {
            super();
        }

        /**
         * Fully-initialising value constructor
         * 
         */
        public OadrProfile(final String oadrProfileName, final OadrTransports oadrTransports) {
            this.oadrProfileName = oadrProfileName;
            this.oadrTransports = oadrTransports;
        }

        /**
         * Gets the value of the oadrProfileName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOadrProfileName() {
            return oadrProfileName;
        }

        /**
         * Sets the value of the oadrProfileName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOadrProfileName(String value) {
            this.oadrProfileName = value;
        }

        /**
         * Gets the value of the oadrTransports property.
         * 
         * @return
         *     possible object is
         *     {@link OadrTransports }
         *     
         */
        public OadrTransports getOadrTransports() {
            return oadrTransports;
        }

        /**
         * Sets the value of the oadrTransports property.
         * 
         * @param value
         *     allowed object is
         *     {@link OadrTransports }
         *     
         */
        public void setOadrTransports(OadrTransports value) {
            this.oadrTransports = value;
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
                String theOadrProfileName;
                theOadrProfileName = this.getOadrProfileName();
                strategy.appendField(locator, this, "oadrProfileName", buffer, theOadrProfileName, (this.oadrProfileName!= null));
            }
            {
                OadrTransports theOadrTransports;
                theOadrTransports = this.getOadrTransports();
                strategy.appendField(locator, this, "oadrTransports", buffer, theOadrTransports, (this.oadrTransports!= null));
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
            final OadrProfiles.OadrProfile that = ((OadrProfiles.OadrProfile) object);
            {
                String lhsOadrProfileName;
                lhsOadrProfileName = this.getOadrProfileName();
                String rhsOadrProfileName;
                rhsOadrProfileName = that.getOadrProfileName();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "oadrProfileName", lhsOadrProfileName), LocatorUtils.property(thatLocator, "oadrProfileName", rhsOadrProfileName), lhsOadrProfileName, rhsOadrProfileName, (this.oadrProfileName!= null), (that.oadrProfileName!= null))) {
                    return false;
                }
            }
            {
                OadrTransports lhsOadrTransports;
                lhsOadrTransports = this.getOadrTransports();
                OadrTransports rhsOadrTransports;
                rhsOadrTransports = that.getOadrTransports();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "oadrTransports", lhsOadrTransports), LocatorUtils.property(thatLocator, "oadrTransports", rhsOadrTransports), lhsOadrTransports, rhsOadrTransports, (this.oadrTransports!= null), (that.oadrTransports!= null))) {
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
                String theOadrProfileName;
                theOadrProfileName = this.getOadrProfileName();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "oadrProfileName", theOadrProfileName), currentHashCode, theOadrProfileName, (this.oadrProfileName!= null));
            }
            {
                OadrTransports theOadrTransports;
                theOadrTransports = this.getOadrTransports();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "oadrTransports", theOadrTransports), currentHashCode, theOadrTransports, (this.oadrTransports!= null));
            }
            return currentHashCode;
        }

        public int hashCode() {
            final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
            return this.hashCode(null, strategy);
        }

        public OadrProfiles.OadrProfile withOadrProfileName(String value) {
            setOadrProfileName(value);
            return this;
        }

        public OadrProfiles.OadrProfile withOadrTransports(OadrTransports value) {
            setOadrTransports(value);
            return this;
        }

    }

}
