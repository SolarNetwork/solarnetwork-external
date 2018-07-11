//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.2-hudson-jaxb-ri-2.2-63- 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.02.02 at 04:16:30 PM NZDT 
//


package openadr.model.v20b.xcal;

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
 *         &lt;element ref="{urn:ietf:params:xml:ns:icalendar-2.0}dtstart"/>
 *         &lt;element ref="{urn:ietf:params:xml:ns:icalendar-2.0}duration"/>
 *         &lt;element name="tolerance" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="tolerate">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="startafter" type="{urn:ietf:params:xml:ns:icalendar-2.0}DurationValueType" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/energyinterop/201110}x-eiNotification" minOccurs="0"/>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/energyinterop/201110}x-eiRampUp" minOccurs="0"/>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/energyinterop/201110}x-eiRecovery" minOccurs="0"/>
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
    "dtstart",
    "duration",
    "tolerance",
    "xEiNotification",
    "xEiRampUp",
    "xEiRecovery"
})
@XmlRootElement(name = "properties")
public class Properties implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected Dtstart dtstart;
    @XmlElement(required = true)
    protected DurationPropType duration;
    protected Properties.Tolerance tolerance;
    @XmlElement(name = "x-eiNotification", namespace = "http://docs.oasis-open.org/ns/energyinterop/201110")
    protected DurationPropType xEiNotification;
    @XmlElement(name = "x-eiRampUp", namespace = "http://docs.oasis-open.org/ns/energyinterop/201110")
    protected DurationPropType xEiRampUp;
    @XmlElement(name = "x-eiRecovery", namespace = "http://docs.oasis-open.org/ns/energyinterop/201110")
    protected DurationPropType xEiRecovery;

    /**
     * Default no-arg constructor
     * 
     */
    public Properties() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public Properties(final Dtstart dtstart, final DurationPropType duration, final Properties.Tolerance tolerance, final DurationPropType xEiNotification, final DurationPropType xEiRampUp, final DurationPropType xEiRecovery) {
        this.dtstart = dtstart;
        this.duration = duration;
        this.tolerance = tolerance;
        this.xEiNotification = xEiNotification;
        this.xEiRampUp = xEiRampUp;
        this.xEiRecovery = xEiRecovery;
    }

    /**
     * Gets the value of the dtstart property.
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
     * Gets the value of the duration property.
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
     * Gets the value of the tolerance property.
     * 
     * @return
     *     possible object is
     *     {@link Properties.Tolerance }
     *     
     */
    public Properties.Tolerance getTolerance() {
        return tolerance;
    }

    /**
     * Sets the value of the tolerance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Properties.Tolerance }
     *     
     */
    public void setTolerance(Properties.Tolerance value) {
        this.tolerance = value;
    }

    /**
     * Gets the value of the xEiNotification property.
     * 
     * @return
     *     possible object is
     *     {@link DurationPropType }
     *     
     */
    public DurationPropType getXEiNotification() {
        return xEiNotification;
    }

    /**
     * Sets the value of the xEiNotification property.
     * 
     * @param value
     *     allowed object is
     *     {@link DurationPropType }
     *     
     */
    public void setXEiNotification(DurationPropType value) {
        this.xEiNotification = value;
    }

    /**
     * Gets the value of the xEiRampUp property.
     * 
     * @return
     *     possible object is
     *     {@link DurationPropType }
     *     
     */
    public DurationPropType getXEiRampUp() {
        return xEiRampUp;
    }

    /**
     * Sets the value of the xEiRampUp property.
     * 
     * @param value
     *     allowed object is
     *     {@link DurationPropType }
     *     
     */
    public void setXEiRampUp(DurationPropType value) {
        this.xEiRampUp = value;
    }

    /**
     * Gets the value of the xEiRecovery property.
     * 
     * @return
     *     possible object is
     *     {@link DurationPropType }
     *     
     */
    public DurationPropType getXEiRecovery() {
        return xEiRecovery;
    }

    /**
     * Sets the value of the xEiRecovery property.
     * 
     * @param value
     *     allowed object is
     *     {@link DurationPropType }
     *     
     */
    public void setXEiRecovery(DurationPropType value) {
        this.xEiRecovery = value;
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
            Properties.Tolerance theTolerance;
            theTolerance = this.getTolerance();
            strategy.appendField(locator, this, "tolerance", buffer, theTolerance, (this.tolerance!= null));
        }
        {
            DurationPropType theXEiNotification;
            theXEiNotification = this.getXEiNotification();
            strategy.appendField(locator, this, "xEiNotification", buffer, theXEiNotification, (this.xEiNotification!= null));
        }
        {
            DurationPropType theXEiRampUp;
            theXEiRampUp = this.getXEiRampUp();
            strategy.appendField(locator, this, "xEiRampUp", buffer, theXEiRampUp, (this.xEiRampUp!= null));
        }
        {
            DurationPropType theXEiRecovery;
            theXEiRecovery = this.getXEiRecovery();
            strategy.appendField(locator, this, "xEiRecovery", buffer, theXEiRecovery, (this.xEiRecovery!= null));
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
        final Properties that = ((Properties) object);
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
            Properties.Tolerance lhsTolerance;
            lhsTolerance = this.getTolerance();
            Properties.Tolerance rhsTolerance;
            rhsTolerance = that.getTolerance();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "tolerance", lhsTolerance), LocatorUtils.property(thatLocator, "tolerance", rhsTolerance), lhsTolerance, rhsTolerance, (this.tolerance!= null), (that.tolerance!= null))) {
                return false;
            }
        }
        {
            DurationPropType lhsXEiNotification;
            lhsXEiNotification = this.getXEiNotification();
            DurationPropType rhsXEiNotification;
            rhsXEiNotification = that.getXEiNotification();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "xEiNotification", lhsXEiNotification), LocatorUtils.property(thatLocator, "xEiNotification", rhsXEiNotification), lhsXEiNotification, rhsXEiNotification, (this.xEiNotification!= null), (that.xEiNotification!= null))) {
                return false;
            }
        }
        {
            DurationPropType lhsXEiRampUp;
            lhsXEiRampUp = this.getXEiRampUp();
            DurationPropType rhsXEiRampUp;
            rhsXEiRampUp = that.getXEiRampUp();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "xEiRampUp", lhsXEiRampUp), LocatorUtils.property(thatLocator, "xEiRampUp", rhsXEiRampUp), lhsXEiRampUp, rhsXEiRampUp, (this.xEiRampUp!= null), (that.xEiRampUp!= null))) {
                return false;
            }
        }
        {
            DurationPropType lhsXEiRecovery;
            lhsXEiRecovery = this.getXEiRecovery();
            DurationPropType rhsXEiRecovery;
            rhsXEiRecovery = that.getXEiRecovery();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "xEiRecovery", lhsXEiRecovery), LocatorUtils.property(thatLocator, "xEiRecovery", rhsXEiRecovery), lhsXEiRecovery, rhsXEiRecovery, (this.xEiRecovery!= null), (that.xEiRecovery!= null))) {
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
            Properties.Tolerance theTolerance;
            theTolerance = this.getTolerance();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "tolerance", theTolerance), currentHashCode, theTolerance, (this.tolerance!= null));
        }
        {
            DurationPropType theXEiNotification;
            theXEiNotification = this.getXEiNotification();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "xEiNotification", theXEiNotification), currentHashCode, theXEiNotification, (this.xEiNotification!= null));
        }
        {
            DurationPropType theXEiRampUp;
            theXEiRampUp = this.getXEiRampUp();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "xEiRampUp", theXEiRampUp), currentHashCode, theXEiRampUp, (this.xEiRampUp!= null));
        }
        {
            DurationPropType theXEiRecovery;
            theXEiRecovery = this.getXEiRecovery();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "xEiRecovery", theXEiRecovery), currentHashCode, theXEiRecovery, (this.xEiRecovery!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

    public Properties withDtstart(Dtstart value) {
        setDtstart(value);
        return this;
    }

    public Properties withDuration(DurationPropType value) {
        setDuration(value);
        return this;
    }

    public Properties withTolerance(Properties.Tolerance value) {
        setTolerance(value);
        return this;
    }

    public Properties withXEiNotification(DurationPropType value) {
        setXEiNotification(value);
        return this;
    }

    public Properties withXEiRampUp(DurationPropType value) {
        setXEiRampUp(value);
        return this;
    }

    public Properties withXEiRecovery(DurationPropType value) {
        setXEiRecovery(value);
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
     *         &lt;element name="tolerate">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="startafter" type="{urn:ietf:params:xml:ns:icalendar-2.0}DurationValueType" minOccurs="0"/>
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
        "tolerate"
    })
    public static class Tolerance implements Serializable, Equals2, HashCode2, ToString2
    {

        private final static long serialVersionUID = 1L;
        @XmlElement(required = true)
        protected Properties.Tolerance.Tolerate tolerate;

        /**
         * Default no-arg constructor
         * 
         */
        public Tolerance() {
            super();
        }

        /**
         * Fully-initialising value constructor
         * 
         */
        public Tolerance(final Properties.Tolerance.Tolerate tolerate) {
            this.tolerate = tolerate;
        }

        /**
         * Gets the value of the tolerate property.
         * 
         * @return
         *     possible object is
         *     {@link Properties.Tolerance.Tolerate }
         *     
         */
        public Properties.Tolerance.Tolerate getTolerate() {
            return tolerate;
        }

        /**
         * Sets the value of the tolerate property.
         * 
         * @param value
         *     allowed object is
         *     {@link Properties.Tolerance.Tolerate }
         *     
         */
        public void setTolerate(Properties.Tolerance.Tolerate value) {
            this.tolerate = value;
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
                Properties.Tolerance.Tolerate theTolerate;
                theTolerate = this.getTolerate();
                strategy.appendField(locator, this, "tolerate", buffer, theTolerate, (this.tolerate!= null));
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
            final Properties.Tolerance that = ((Properties.Tolerance) object);
            {
                Properties.Tolerance.Tolerate lhsTolerate;
                lhsTolerate = this.getTolerate();
                Properties.Tolerance.Tolerate rhsTolerate;
                rhsTolerate = that.getTolerate();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "tolerate", lhsTolerate), LocatorUtils.property(thatLocator, "tolerate", rhsTolerate), lhsTolerate, rhsTolerate, (this.tolerate!= null), (that.tolerate!= null))) {
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
                Properties.Tolerance.Tolerate theTolerate;
                theTolerate = this.getTolerate();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "tolerate", theTolerate), currentHashCode, theTolerate, (this.tolerate!= null));
            }
            return currentHashCode;
        }

        public int hashCode() {
            final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
            return this.hashCode(null, strategy);
        }

        public Properties.Tolerance withTolerate(Properties.Tolerance.Tolerate value) {
            setTolerate(value);
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
         *         &lt;element name="startafter" type="{urn:ietf:params:xml:ns:icalendar-2.0}DurationValueType" minOccurs="0"/>
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
            "startafter"
        })
        public static class Tolerate implements Serializable, Equals2, HashCode2, ToString2
        {

            private final static long serialVersionUID = 1L;
            protected DurationValue startafter;

            /**
             * Default no-arg constructor
             * 
             */
            public Tolerate() {
                super();
            }

            /**
             * Fully-initialising value constructor
             * 
             */
            public Tolerate(final DurationValue startafter) {
                this.startafter = startafter;
            }

            /**
             * Gets the value of the startafter property.
             * 
             * @return
             *     possible object is
             *     {@link DurationValue }
             *     
             */
            public DurationValue getStartafter() {
                return startafter;
            }

            /**
             * Sets the value of the startafter property.
             * 
             * @param value
             *     allowed object is
             *     {@link DurationValue }
             *     
             */
            public void setStartafter(DurationValue value) {
                this.startafter = value;
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
                    DurationValue theStartafter;
                    theStartafter = this.getStartafter();
                    strategy.appendField(locator, this, "startafter", buffer, theStartafter, (this.startafter!= null));
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
                final Properties.Tolerance.Tolerate that = ((Properties.Tolerance.Tolerate) object);
                {
                    DurationValue lhsStartafter;
                    lhsStartafter = this.getStartafter();
                    DurationValue rhsStartafter;
                    rhsStartafter = that.getStartafter();
                    if (!strategy.equals(LocatorUtils.property(thisLocator, "startafter", lhsStartafter), LocatorUtils.property(thatLocator, "startafter", rhsStartafter), lhsStartafter, rhsStartafter, (this.startafter!= null), (that.startafter!= null))) {
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
                    DurationValue theStartafter;
                    theStartafter = this.getStartafter();
                    currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "startafter", theStartafter), currentHashCode, theStartafter, (this.startafter!= null));
                }
                return currentHashCode;
            }

            public int hashCode() {
                final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
                return this.hashCode(null, strategy);
            }

            public Properties.Tolerance.Tolerate withStartafter(DurationValue value) {
                setStartafter(value);
                return this;
            }

        }

    }

}