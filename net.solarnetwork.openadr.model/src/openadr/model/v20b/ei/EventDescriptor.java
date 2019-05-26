//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.2-hudson-jaxb-ri-2.2-63- 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.02.02 at 04:16:30 PM NZDT 
//


package openadr.model.v20b.ei;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import openadr.model.v20b.emix.MarketContext;
import openadr.model.v20b.xcal.DateTime;
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
 * <p>Java class for eventDescriptorType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="eventDescriptorType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/energyinterop/201110}eventID"/>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/energyinterop/201110}modificationNumber"/>
 *         &lt;element name="modificationDateTime" type="{urn:ietf:params:xml:ns:icalendar-2.0}DateTimeType" minOccurs="0"/>
 *         &lt;element name="modificationReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="priority" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *         &lt;element name="eiMarketContext">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://docs.oasis-open.org/ns/emix/2011/06}marketContext"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/energyinterop/201110}createdDateTime"/>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/energyinterop/201110}eventStatus"/>
 *         &lt;element name="testEvent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vtnComment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "eventDescriptorType", propOrder = {
    "eventID",
    "modificationNumber",
    "modificationDateTime",
    "modificationReason",
    "priority",
    "eiMarketContext",
    "createdDateTime",
    "eventStatus",
    "testEvent",
    "vtnComment"
})
public class EventDescriptor implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected String eventID;
    @XmlSchemaType(name = "unsignedInt")
    protected long modificationNumber;
    protected DateTime modificationDateTime;
    protected String modificationReason;
    @XmlSchemaType(name = "unsignedInt")
    protected Long priority;
    @XmlElement(required = true)
    protected EventDescriptor.EiMarketContext eiMarketContext;
    @XmlElement(required = true)
    protected DateTime createdDateTime;
    @XmlElement(required = true)
    protected EventStatusEnumeratedType eventStatus;
    protected String testEvent;
    protected String vtnComment;

    /**
     * Default no-arg constructor
     * 
     */
    public EventDescriptor() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public EventDescriptor(final String eventID, final long modificationNumber, final DateTime modificationDateTime, final String modificationReason, final Long priority, final EventDescriptor.EiMarketContext eiMarketContext, final DateTime createdDateTime, final EventStatusEnumeratedType eventStatus, final String testEvent, final String vtnComment) {
        this.eventID = eventID;
        this.modificationNumber = modificationNumber;
        this.modificationDateTime = modificationDateTime;
        this.modificationReason = modificationReason;
        this.priority = priority;
        this.eiMarketContext = eiMarketContext;
        this.createdDateTime = createdDateTime;
        this.eventStatus = eventStatus;
        this.testEvent = testEvent;
        this.vtnComment = vtnComment;
    }

    /**
     * Gets the value of the eventID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventID() {
        return eventID;
    }

    /**
     * Sets the value of the eventID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventID(String value) {
        this.eventID = value;
    }

    /**
     * Gets the value of the modificationNumber property.
     * 
     */
    public long getModificationNumber() {
        return modificationNumber;
    }

    /**
     * Sets the value of the modificationNumber property.
     * 
     */
    public void setModificationNumber(long value) {
        this.modificationNumber = value;
    }

    /**
     * Gets the value of the modificationDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getModificationDateTime() {
        return modificationDateTime;
    }

    /**
     * Sets the value of the modificationDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setModificationDateTime(DateTime value) {
        this.modificationDateTime = value;
    }

    /**
     * Gets the value of the modificationReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModificationReason() {
        return modificationReason;
    }

    /**
     * Sets the value of the modificationReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModificationReason(String value) {
        this.modificationReason = value;
    }

    /**
     * Gets the value of the priority property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPriority() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPriority(Long value) {
        this.priority = value;
    }

    /**
     * Gets the value of the eiMarketContext property.
     * 
     * @return
     *     possible object is
     *     {@link EventDescriptor.EiMarketContext }
     *     
     */
    public EventDescriptor.EiMarketContext getEiMarketContext() {
        return eiMarketContext;
    }

    /**
     * Sets the value of the eiMarketContext property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventDescriptor.EiMarketContext }
     *     
     */
    public void setEiMarketContext(EventDescriptor.EiMarketContext value) {
        this.eiMarketContext = value;
    }

    /**
     * Gets the value of the createdDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getCreatedDateTime() {
        return createdDateTime;
    }

    /**
     * Sets the value of the createdDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setCreatedDateTime(DateTime value) {
        this.createdDateTime = value;
    }

    /**
     * An indication of the event state: far, near, active, canceled, completed
     * 
     * @return
     *     possible object is
     *     {@link EventStatusEnumeratedType }
     *     
     */
    public EventStatusEnumeratedType getEventStatus() {
        return eventStatus;
    }

    /**
     * Sets the value of the eventStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventStatusEnumeratedType }
     *     
     */
    public void setEventStatus(EventStatusEnumeratedType value) {
        this.eventStatus = value;
    }

    /**
     * Gets the value of the testEvent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTestEvent() {
        return testEvent;
    }

    /**
     * Sets the value of the testEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTestEvent(String value) {
        this.testEvent = value;
    }

    /**
     * Gets the value of the vtnComment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVtnComment() {
        return vtnComment;
    }

    /**
     * Sets the value of the vtnComment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVtnComment(String value) {
        this.vtnComment = value;
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
            String theEventID;
            theEventID = this.getEventID();
            strategy.appendField(locator, this, "eventID", buffer, theEventID, (this.eventID!= null));
        }
        {
            long theModificationNumber;
            theModificationNumber = this.getModificationNumber();
            strategy.appendField(locator, this, "modificationNumber", buffer, theModificationNumber, true);
        }
        {
            DateTime theModificationDateTime;
            theModificationDateTime = this.getModificationDateTime();
            strategy.appendField(locator, this, "modificationDateTime", buffer, theModificationDateTime, (this.modificationDateTime!= null));
        }
        {
            String theModificationReason;
            theModificationReason = this.getModificationReason();
            strategy.appendField(locator, this, "modificationReason", buffer, theModificationReason, (this.modificationReason!= null));
        }
        {
            Long thePriority;
            thePriority = this.getPriority();
            strategy.appendField(locator, this, "priority", buffer, thePriority, (this.priority!= null));
        }
        {
            EventDescriptor.EiMarketContext theEiMarketContext;
            theEiMarketContext = this.getEiMarketContext();
            strategy.appendField(locator, this, "eiMarketContext", buffer, theEiMarketContext, (this.eiMarketContext!= null));
        }
        {
            DateTime theCreatedDateTime;
            theCreatedDateTime = this.getCreatedDateTime();
            strategy.appendField(locator, this, "createdDateTime", buffer, theCreatedDateTime, (this.createdDateTime!= null));
        }
        {
            EventStatusEnumeratedType theEventStatus;
            theEventStatus = this.getEventStatus();
            strategy.appendField(locator, this, "eventStatus", buffer, theEventStatus, (this.eventStatus!= null));
        }
        {
            String theTestEvent;
            theTestEvent = this.getTestEvent();
            strategy.appendField(locator, this, "testEvent", buffer, theTestEvent, (this.testEvent!= null));
        }
        {
            String theVtnComment;
            theVtnComment = this.getVtnComment();
            strategy.appendField(locator, this, "vtnComment", buffer, theVtnComment, (this.vtnComment!= null));
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
        final EventDescriptor that = ((EventDescriptor) object);
        {
            String lhsEventID;
            lhsEventID = this.getEventID();
            String rhsEventID;
            rhsEventID = that.getEventID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "eventID", lhsEventID), LocatorUtils.property(thatLocator, "eventID", rhsEventID), lhsEventID, rhsEventID, (this.eventID!= null), (that.eventID!= null))) {
                return false;
            }
        }
        {
            long lhsModificationNumber;
            lhsModificationNumber = this.getModificationNumber();
            long rhsModificationNumber;
            rhsModificationNumber = that.getModificationNumber();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "modificationNumber", lhsModificationNumber), LocatorUtils.property(thatLocator, "modificationNumber", rhsModificationNumber), lhsModificationNumber, rhsModificationNumber, true, true)) {
                return false;
            }
        }
        {
            DateTime lhsModificationDateTime;
            lhsModificationDateTime = this.getModificationDateTime();
            DateTime rhsModificationDateTime;
            rhsModificationDateTime = that.getModificationDateTime();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "modificationDateTime", lhsModificationDateTime), LocatorUtils.property(thatLocator, "modificationDateTime", rhsModificationDateTime), lhsModificationDateTime, rhsModificationDateTime, (this.modificationDateTime!= null), (that.modificationDateTime!= null))) {
                return false;
            }
        }
        {
            String lhsModificationReason;
            lhsModificationReason = this.getModificationReason();
            String rhsModificationReason;
            rhsModificationReason = that.getModificationReason();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "modificationReason", lhsModificationReason), LocatorUtils.property(thatLocator, "modificationReason", rhsModificationReason), lhsModificationReason, rhsModificationReason, (this.modificationReason!= null), (that.modificationReason!= null))) {
                return false;
            }
        }
        {
            Long lhsPriority;
            lhsPriority = this.getPriority();
            Long rhsPriority;
            rhsPriority = that.getPriority();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "priority", lhsPriority), LocatorUtils.property(thatLocator, "priority", rhsPriority), lhsPriority, rhsPriority, (this.priority!= null), (that.priority!= null))) {
                return false;
            }
        }
        {
            EventDescriptor.EiMarketContext lhsEiMarketContext;
            lhsEiMarketContext = this.getEiMarketContext();
            EventDescriptor.EiMarketContext rhsEiMarketContext;
            rhsEiMarketContext = that.getEiMarketContext();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "eiMarketContext", lhsEiMarketContext), LocatorUtils.property(thatLocator, "eiMarketContext", rhsEiMarketContext), lhsEiMarketContext, rhsEiMarketContext, (this.eiMarketContext!= null), (that.eiMarketContext!= null))) {
                return false;
            }
        }
        {
            DateTime lhsCreatedDateTime;
            lhsCreatedDateTime = this.getCreatedDateTime();
            DateTime rhsCreatedDateTime;
            rhsCreatedDateTime = that.getCreatedDateTime();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "createdDateTime", lhsCreatedDateTime), LocatorUtils.property(thatLocator, "createdDateTime", rhsCreatedDateTime), lhsCreatedDateTime, rhsCreatedDateTime, (this.createdDateTime!= null), (that.createdDateTime!= null))) {
                return false;
            }
        }
        {
            EventStatusEnumeratedType lhsEventStatus;
            lhsEventStatus = this.getEventStatus();
            EventStatusEnumeratedType rhsEventStatus;
            rhsEventStatus = that.getEventStatus();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "eventStatus", lhsEventStatus), LocatorUtils.property(thatLocator, "eventStatus", rhsEventStatus), lhsEventStatus, rhsEventStatus, (this.eventStatus!= null), (that.eventStatus!= null))) {
                return false;
            }
        }
        {
            String lhsTestEvent;
            lhsTestEvent = this.getTestEvent();
            String rhsTestEvent;
            rhsTestEvent = that.getTestEvent();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "testEvent", lhsTestEvent), LocatorUtils.property(thatLocator, "testEvent", rhsTestEvent), lhsTestEvent, rhsTestEvent, (this.testEvent!= null), (that.testEvent!= null))) {
                return false;
            }
        }
        {
            String lhsVtnComment;
            lhsVtnComment = this.getVtnComment();
            String rhsVtnComment;
            rhsVtnComment = that.getVtnComment();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "vtnComment", lhsVtnComment), LocatorUtils.property(thatLocator, "vtnComment", rhsVtnComment), lhsVtnComment, rhsVtnComment, (this.vtnComment!= null), (that.vtnComment!= null))) {
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
            String theEventID;
            theEventID = this.getEventID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "eventID", theEventID), currentHashCode, theEventID, (this.eventID!= null));
        }
        {
            long theModificationNumber;
            theModificationNumber = this.getModificationNumber();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "modificationNumber", theModificationNumber), currentHashCode, theModificationNumber, true);
        }
        {
            DateTime theModificationDateTime;
            theModificationDateTime = this.getModificationDateTime();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "modificationDateTime", theModificationDateTime), currentHashCode, theModificationDateTime, (this.modificationDateTime!= null));
        }
        {
            String theModificationReason;
            theModificationReason = this.getModificationReason();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "modificationReason", theModificationReason), currentHashCode, theModificationReason, (this.modificationReason!= null));
        }
        {
            Long thePriority;
            thePriority = this.getPriority();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "priority", thePriority), currentHashCode, thePriority, (this.priority!= null));
        }
        {
            EventDescriptor.EiMarketContext theEiMarketContext;
            theEiMarketContext = this.getEiMarketContext();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "eiMarketContext", theEiMarketContext), currentHashCode, theEiMarketContext, (this.eiMarketContext!= null));
        }
        {
            DateTime theCreatedDateTime;
            theCreatedDateTime = this.getCreatedDateTime();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "createdDateTime", theCreatedDateTime), currentHashCode, theCreatedDateTime, (this.createdDateTime!= null));
        }
        {
            EventStatusEnumeratedType theEventStatus;
            theEventStatus = this.getEventStatus();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "eventStatus", theEventStatus), currentHashCode, theEventStatus, (this.eventStatus!= null));
        }
        {
            String theTestEvent;
            theTestEvent = this.getTestEvent();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "testEvent", theTestEvent), currentHashCode, theTestEvent, (this.testEvent!= null));
        }
        {
            String theVtnComment;
            theVtnComment = this.getVtnComment();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "vtnComment", theVtnComment), currentHashCode, theVtnComment, (this.vtnComment!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

    public EventDescriptor withEventID(String value) {
        setEventID(value);
        return this;
    }

    public EventDescriptor withModificationNumber(long value) {
        setModificationNumber(value);
        return this;
    }

    public EventDescriptor withModificationDateTime(DateTime value) {
        setModificationDateTime(value);
        return this;
    }

    public EventDescriptor withModificationReason(String value) {
        setModificationReason(value);
        return this;
    }

    public EventDescriptor withPriority(Long value) {
        setPriority(value);
        return this;
    }

    public EventDescriptor withEiMarketContext(EventDescriptor.EiMarketContext value) {
        setEiMarketContext(value);
        return this;
    }

    public EventDescriptor withCreatedDateTime(DateTime value) {
        setCreatedDateTime(value);
        return this;
    }

    public EventDescriptor withEventStatus(EventStatusEnumeratedType value) {
        setEventStatus(value);
        return this;
    }

    public EventDescriptor withTestEvent(String value) {
        setTestEvent(value);
        return this;
    }

    public EventDescriptor withVtnComment(String value) {
        setVtnComment(value);
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
     *         &lt;element ref="{http://docs.oasis-open.org/ns/emix/2011/06}marketContext"/>
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
        "marketContext"
    })
    public static class EiMarketContext implements Serializable, Equals2, HashCode2, ToString2
    {

        private final static long serialVersionUID = 1L;
        @XmlElement(namespace = "http://docs.oasis-open.org/ns/emix/2011/06", required = true)
        protected MarketContext marketContext;

        /**
         * Default no-arg constructor
         * 
         */
        public EiMarketContext() {
            super();
        }

        /**
         * Fully-initialising value constructor
         * 
         */
        public EiMarketContext(final MarketContext marketContext) {
            this.marketContext = marketContext;
        }

        /**
         * Gets the value of the marketContext property.
         * 
         * @return
         *     possible object is
         *     {@link MarketContext }
         *     
         */
        public MarketContext getMarketContext() {
            return marketContext;
        }

        /**
         * Sets the value of the marketContext property.
         * 
         * @param value
         *     allowed object is
         *     {@link MarketContext }
         *     
         */
        public void setMarketContext(MarketContext value) {
            this.marketContext = value;
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
                MarketContext theMarketContext;
                theMarketContext = this.getMarketContext();
                strategy.appendField(locator, this, "marketContext", buffer, theMarketContext, (this.marketContext!= null));
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
            final EventDescriptor.EiMarketContext that = ((EventDescriptor.EiMarketContext) object);
            {
                MarketContext lhsMarketContext;
                lhsMarketContext = this.getMarketContext();
                MarketContext rhsMarketContext;
                rhsMarketContext = that.getMarketContext();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "marketContext", lhsMarketContext), LocatorUtils.property(thatLocator, "marketContext", rhsMarketContext), lhsMarketContext, rhsMarketContext, (this.marketContext!= null), (that.marketContext!= null))) {
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
                MarketContext theMarketContext;
                theMarketContext = this.getMarketContext();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "marketContext", theMarketContext), currentHashCode, theMarketContext, (this.marketContext!= null));
            }
            return currentHashCode;
        }

        public int hashCode() {
            final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
            return this.hashCode(null, strategy);
        }

        public EventDescriptor.EiMarketContext withMarketContext(MarketContext value) {
            setMarketContext(value);
            return this;
        }

    }

}
