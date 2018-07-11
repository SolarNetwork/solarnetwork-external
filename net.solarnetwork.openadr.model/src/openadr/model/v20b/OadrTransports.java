//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.2-hudson-jaxb-ri-2.2-63- 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.02.02 at 04:16:30 PM NZDT 
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
 *         &lt;element name="oadrTransport" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://openadr.org/oadr-2.0b/2012/07}oadrTransportName"/>
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
    "oadrTransports"
})
@XmlRootElement(name = "oadrTransports")
public class OadrTransports implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "oadrTransport", required = true)
    protected List<OadrTransports.OadrTransport> oadrTransports;

    /**
     * Default no-arg constructor
     * 
     */
    public OadrTransports() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public OadrTransports(final List<OadrTransports.OadrTransport> oadrTransports) {
        this.oadrTransports = oadrTransports;
    }

    /**
     * Gets the value of the oadrTransports property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the oadrTransports property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOadrTransports().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OadrTransports.OadrTransport }
     * 
     * 
     */
    public List<OadrTransports.OadrTransport> getOadrTransports() {
        if (oadrTransports == null) {
            oadrTransports = new ArrayList<OadrTransports.OadrTransport>();
        }
        return this.oadrTransports;
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
            List<OadrTransports.OadrTransport> theOadrTransports;
            theOadrTransports = (((this.oadrTransports!= null)&&(!this.oadrTransports.isEmpty()))?this.getOadrTransports():null);
            strategy.appendField(locator, this, "oadrTransports", buffer, theOadrTransports, ((this.oadrTransports!= null)&&(!this.oadrTransports.isEmpty())));
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
        final OadrTransports that = ((OadrTransports) object);
        {
            List<OadrTransports.OadrTransport> lhsOadrTransports;
            lhsOadrTransports = (((this.oadrTransports!= null)&&(!this.oadrTransports.isEmpty()))?this.getOadrTransports():null);
            List<OadrTransports.OadrTransport> rhsOadrTransports;
            rhsOadrTransports = (((that.oadrTransports!= null)&&(!that.oadrTransports.isEmpty()))?that.getOadrTransports():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "oadrTransports", lhsOadrTransports), LocatorUtils.property(thatLocator, "oadrTransports", rhsOadrTransports), lhsOadrTransports, rhsOadrTransports, ((this.oadrTransports!= null)&&(!this.oadrTransports.isEmpty())), ((that.oadrTransports!= null)&&(!that.oadrTransports.isEmpty())))) {
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
            List<OadrTransports.OadrTransport> theOadrTransports;
            theOadrTransports = (((this.oadrTransports!= null)&&(!this.oadrTransports.isEmpty()))?this.getOadrTransports():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "oadrTransports", theOadrTransports), currentHashCode, theOadrTransports, ((this.oadrTransports!= null)&&(!this.oadrTransports.isEmpty())));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

    public OadrTransports withOadrTransports(OadrTransports.OadrTransport... values) {
        if (values!= null) {
            for (OadrTransports.OadrTransport value: values) {
                getOadrTransports().add(value);
            }
        }
        return this;
    }

    public OadrTransports withOadrTransports(Collection<OadrTransports.OadrTransport> values) {
        if (values!= null) {
            getOadrTransports().addAll(values);
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
     *         &lt;element ref="{http://openadr.org/oadr-2.0b/2012/07}oadrTransportName"/>
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
        "oadrTransportName"
    })
    public static class OadrTransport implements Serializable, Equals2, HashCode2, ToString2
    {

        private final static long serialVersionUID = 1L;
        @XmlElement(required = true)
        protected OadrTransportType oadrTransportName;

        /**
         * Default no-arg constructor
         * 
         */
        public OadrTransport() {
            super();
        }

        /**
         * Fully-initialising value constructor
         * 
         */
        public OadrTransport(final OadrTransportType oadrTransportName) {
            this.oadrTransportName = oadrTransportName;
        }

        /**
         * Gets the value of the oadrTransportName property.
         * 
         * @return
         *     possible object is
         *     {@link OadrTransportType }
         *     
         */
        public OadrTransportType getOadrTransportName() {
            return oadrTransportName;
        }

        /**
         * Sets the value of the oadrTransportName property.
         * 
         * @param value
         *     allowed object is
         *     {@link OadrTransportType }
         *     
         */
        public void setOadrTransportName(OadrTransportType value) {
            this.oadrTransportName = value;
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
                OadrTransportType theOadrTransportName;
                theOadrTransportName = this.getOadrTransportName();
                strategy.appendField(locator, this, "oadrTransportName", buffer, theOadrTransportName, (this.oadrTransportName!= null));
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
            final OadrTransports.OadrTransport that = ((OadrTransports.OadrTransport) object);
            {
                OadrTransportType lhsOadrTransportName;
                lhsOadrTransportName = this.getOadrTransportName();
                OadrTransportType rhsOadrTransportName;
                rhsOadrTransportName = that.getOadrTransportName();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "oadrTransportName", lhsOadrTransportName), LocatorUtils.property(thatLocator, "oadrTransportName", rhsOadrTransportName), lhsOadrTransportName, rhsOadrTransportName, (this.oadrTransportName!= null), (that.oadrTransportName!= null))) {
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
                OadrTransportType theOadrTransportName;
                theOadrTransportName = this.getOadrTransportName();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "oadrTransportName", theOadrTransportName), currentHashCode, theOadrTransportName, (this.oadrTransportName!= null));
            }
            return currentHashCode;
        }

        public int hashCode() {
            final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
            return this.hashCode(null, strategy);
        }

        public OadrTransports.OadrTransport withOadrTransportName(OadrTransportType value) {
            setOadrTransportName(value);
            return this;
        }

    }

}