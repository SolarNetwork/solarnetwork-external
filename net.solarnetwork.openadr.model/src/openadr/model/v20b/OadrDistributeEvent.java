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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import openadr.model.v20b.ei.EiEvent;
import openadr.model.v20b.ei.EiResponse;
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
 * <p>Java class for oadrDistributeEventType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="oadrDistributeEventType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/energyinterop/201110}eiResponse" minOccurs="0"/>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/energyinterop/201110/payloads}requestID"/>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/energyinterop/201110}vtnID"/>
 *         &lt;element name="oadrEvent" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://docs.oasis-open.org/ns/energyinterop/201110}eiEvent"/>
 *                   &lt;element ref="{http://openadr.org/oadr-2.0b/2012/07}oadrResponseRequired"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute ref="{http://docs.oasis-open.org/ns/energyinterop/201110}schemaVersion"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "oadrDistributeEventType", propOrder = {
    "eiResponse",
    "requestID",
    "vtnID",
    "oadrEvents"
})
@XmlRootElement(name = "oadrDistributeEvent")
public class OadrDistributeEvent implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 1L;
    @XmlElement(namespace = "http://docs.oasis-open.org/ns/energyinterop/201110")
    protected EiResponse eiResponse;
    @XmlElement(namespace = "http://docs.oasis-open.org/ns/energyinterop/201110/payloads", required = true)
    protected String requestID;
    @XmlElement(namespace = "http://docs.oasis-open.org/ns/energyinterop/201110", required = true)
    protected String vtnID;
    @XmlElement(name = "oadrEvent")
    protected List<OadrDistributeEvent.OadrEvent> oadrEvents;
    @XmlAttribute(name = "schemaVersion", namespace = "http://docs.oasis-open.org/ns/energyinterop/201110")
    protected String schemaVersion;

    /**
     * Default no-arg constructor
     * 
     */
    public OadrDistributeEvent() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public OadrDistributeEvent(final EiResponse eiResponse, final String requestID, final String vtnID, final List<OadrDistributeEvent.OadrEvent> oadrEvents, final String schemaVersion) {
        this.eiResponse = eiResponse;
        this.requestID = requestID;
        this.vtnID = vtnID;
        this.oadrEvents = oadrEvents;
        this.schemaVersion = schemaVersion;
    }

    /**
     * Gets the value of the eiResponse property.
     * 
     * @return
     *     possible object is
     *     {@link EiResponse }
     *     
     */
    public EiResponse getEiResponse() {
        return eiResponse;
    }

    /**
     * Sets the value of the eiResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link EiResponse }
     *     
     */
    public void setEiResponse(EiResponse value) {
        this.eiResponse = value;
    }

    /**
     * Gets the value of the requestID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestID() {
        return requestID;
    }

    /**
     * Sets the value of the requestID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestID(String value) {
        this.requestID = value;
    }

    /**
     * Gets the value of the vtnID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVtnID() {
        return vtnID;
    }

    /**
     * Sets the value of the vtnID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVtnID(String value) {
        this.vtnID = value;
    }

    /**
     * Gets the value of the oadrEvents property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the oadrEvents property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOadrEvents().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OadrDistributeEvent.OadrEvent }
     * 
     * 
     */
    public List<OadrDistributeEvent.OadrEvent> getOadrEvents() {
        if (oadrEvents == null) {
            oadrEvents = new ArrayList<OadrDistributeEvent.OadrEvent>();
        }
        return this.oadrEvents;
    }

    /**
     * Gets the value of the schemaVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchemaVersion() {
        return schemaVersion;
    }

    /**
     * Sets the value of the schemaVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchemaVersion(String value) {
        this.schemaVersion = value;
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
            EiResponse theEiResponse;
            theEiResponse = this.getEiResponse();
            strategy.appendField(locator, this, "eiResponse", buffer, theEiResponse, (this.eiResponse!= null));
        }
        {
            String theRequestID;
            theRequestID = this.getRequestID();
            strategy.appendField(locator, this, "requestID", buffer, theRequestID, (this.requestID!= null));
        }
        {
            String theVtnID;
            theVtnID = this.getVtnID();
            strategy.appendField(locator, this, "vtnID", buffer, theVtnID, (this.vtnID!= null));
        }
        {
            List<OadrDistributeEvent.OadrEvent> theOadrEvents;
            theOadrEvents = (((this.oadrEvents!= null)&&(!this.oadrEvents.isEmpty()))?this.getOadrEvents():null);
            strategy.appendField(locator, this, "oadrEvents", buffer, theOadrEvents, ((this.oadrEvents!= null)&&(!this.oadrEvents.isEmpty())));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
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
        final OadrDistributeEvent that = ((OadrDistributeEvent) object);
        {
            EiResponse lhsEiResponse;
            lhsEiResponse = this.getEiResponse();
            EiResponse rhsEiResponse;
            rhsEiResponse = that.getEiResponse();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "eiResponse", lhsEiResponse), LocatorUtils.property(thatLocator, "eiResponse", rhsEiResponse), lhsEiResponse, rhsEiResponse, (this.eiResponse!= null), (that.eiResponse!= null))) {
                return false;
            }
        }
        {
            String lhsRequestID;
            lhsRequestID = this.getRequestID();
            String rhsRequestID;
            rhsRequestID = that.getRequestID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "requestID", lhsRequestID), LocatorUtils.property(thatLocator, "requestID", rhsRequestID), lhsRequestID, rhsRequestID, (this.requestID!= null), (that.requestID!= null))) {
                return false;
            }
        }
        {
            String lhsVtnID;
            lhsVtnID = this.getVtnID();
            String rhsVtnID;
            rhsVtnID = that.getVtnID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "vtnID", lhsVtnID), LocatorUtils.property(thatLocator, "vtnID", rhsVtnID), lhsVtnID, rhsVtnID, (this.vtnID!= null), (that.vtnID!= null))) {
                return false;
            }
        }
        {
            List<OadrDistributeEvent.OadrEvent> lhsOadrEvents;
            lhsOadrEvents = (((this.oadrEvents!= null)&&(!this.oadrEvents.isEmpty()))?this.getOadrEvents():null);
            List<OadrDistributeEvent.OadrEvent> rhsOadrEvents;
            rhsOadrEvents = (((that.oadrEvents!= null)&&(!that.oadrEvents.isEmpty()))?that.getOadrEvents():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "oadrEvents", lhsOadrEvents), LocatorUtils.property(thatLocator, "oadrEvents", rhsOadrEvents), lhsOadrEvents, rhsOadrEvents, ((this.oadrEvents!= null)&&(!this.oadrEvents.isEmpty())), ((that.oadrEvents!= null)&&(!that.oadrEvents.isEmpty())))) {
                return false;
            }
        }
        {
            String lhsSchemaVersion;
            lhsSchemaVersion = this.getSchemaVersion();
            String rhsSchemaVersion;
            rhsSchemaVersion = that.getSchemaVersion();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "schemaVersion", lhsSchemaVersion), LocatorUtils.property(thatLocator, "schemaVersion", rhsSchemaVersion), lhsSchemaVersion, rhsSchemaVersion, (this.schemaVersion!= null), (that.schemaVersion!= null))) {
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
            EiResponse theEiResponse;
            theEiResponse = this.getEiResponse();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "eiResponse", theEiResponse), currentHashCode, theEiResponse, (this.eiResponse!= null));
        }
        {
            String theRequestID;
            theRequestID = this.getRequestID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "requestID", theRequestID), currentHashCode, theRequestID, (this.requestID!= null));
        }
        {
            String theVtnID;
            theVtnID = this.getVtnID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "vtnID", theVtnID), currentHashCode, theVtnID, (this.vtnID!= null));
        }
        {
            List<OadrDistributeEvent.OadrEvent> theOadrEvents;
            theOadrEvents = (((this.oadrEvents!= null)&&(!this.oadrEvents.isEmpty()))?this.getOadrEvents():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "oadrEvents", theOadrEvents), currentHashCode, theOadrEvents, ((this.oadrEvents!= null)&&(!this.oadrEvents.isEmpty())));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "schemaVersion", theSchemaVersion), currentHashCode, theSchemaVersion, (this.schemaVersion!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

    public OadrDistributeEvent withEiResponse(EiResponse value) {
        setEiResponse(value);
        return this;
    }

    public OadrDistributeEvent withRequestID(String value) {
        setRequestID(value);
        return this;
    }

    public OadrDistributeEvent withVtnID(String value) {
        setVtnID(value);
        return this;
    }

    public OadrDistributeEvent withOadrEvents(OadrDistributeEvent.OadrEvent... values) {
        if (values!= null) {
            for (OadrDistributeEvent.OadrEvent value: values) {
                getOadrEvents().add(value);
            }
        }
        return this;
    }

    public OadrDistributeEvent withOadrEvents(Collection<OadrDistributeEvent.OadrEvent> values) {
        if (values!= null) {
            getOadrEvents().addAll(values);
        }
        return this;
    }

    public OadrDistributeEvent withSchemaVersion(String value) {
        setSchemaVersion(value);
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
     *         &lt;element ref="{http://docs.oasis-open.org/ns/energyinterop/201110}eiEvent"/>
     *         &lt;element ref="{http://openadr.org/oadr-2.0b/2012/07}oadrResponseRequired"/>
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
        "eiEvent",
        "oadrResponseRequired"
    })
    public static class OadrEvent implements Serializable, Equals2, HashCode2, ToString2
    {

        private final static long serialVersionUID = 1L;
        @XmlElement(namespace = "http://docs.oasis-open.org/ns/energyinterop/201110", required = true)
        protected EiEvent eiEvent;
        @XmlElement(required = true)
        protected ResponseRequiredType oadrResponseRequired;

        /**
         * Default no-arg constructor
         * 
         */
        public OadrEvent() {
            super();
        }

        /**
         * Fully-initialising value constructor
         * 
         */
        public OadrEvent(final EiEvent eiEvent, final ResponseRequiredType oadrResponseRequired) {
            this.eiEvent = eiEvent;
            this.oadrResponseRequired = oadrResponseRequired;
        }

        /**
         * Gets the value of the eiEvent property.
         * 
         * @return
         *     possible object is
         *     {@link EiEvent }
         *     
         */
        public EiEvent getEiEvent() {
            return eiEvent;
        }

        /**
         * Sets the value of the eiEvent property.
         * 
         * @param value
         *     allowed object is
         *     {@link EiEvent }
         *     
         */
        public void setEiEvent(EiEvent value) {
            this.eiEvent = value;
        }

        /**
         * Gets the value of the oadrResponseRequired property.
         * 
         * @return
         *     possible object is
         *     {@link ResponseRequiredType }
         *     
         */
        public ResponseRequiredType getOadrResponseRequired() {
            return oadrResponseRequired;
        }

        /**
         * Sets the value of the oadrResponseRequired property.
         * 
         * @param value
         *     allowed object is
         *     {@link ResponseRequiredType }
         *     
         */
        public void setOadrResponseRequired(ResponseRequiredType value) {
            this.oadrResponseRequired = value;
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
                EiEvent theEiEvent;
                theEiEvent = this.getEiEvent();
                strategy.appendField(locator, this, "eiEvent", buffer, theEiEvent, (this.eiEvent!= null));
            }
            {
                ResponseRequiredType theOadrResponseRequired;
                theOadrResponseRequired = this.getOadrResponseRequired();
                strategy.appendField(locator, this, "oadrResponseRequired", buffer, theOadrResponseRequired, (this.oadrResponseRequired!= null));
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
            final OadrDistributeEvent.OadrEvent that = ((OadrDistributeEvent.OadrEvent) object);
            {
                EiEvent lhsEiEvent;
                lhsEiEvent = this.getEiEvent();
                EiEvent rhsEiEvent;
                rhsEiEvent = that.getEiEvent();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "eiEvent", lhsEiEvent), LocatorUtils.property(thatLocator, "eiEvent", rhsEiEvent), lhsEiEvent, rhsEiEvent, (this.eiEvent!= null), (that.eiEvent!= null))) {
                    return false;
                }
            }
            {
                ResponseRequiredType lhsOadrResponseRequired;
                lhsOadrResponseRequired = this.getOadrResponseRequired();
                ResponseRequiredType rhsOadrResponseRequired;
                rhsOadrResponseRequired = that.getOadrResponseRequired();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "oadrResponseRequired", lhsOadrResponseRequired), LocatorUtils.property(thatLocator, "oadrResponseRequired", rhsOadrResponseRequired), lhsOadrResponseRequired, rhsOadrResponseRequired, (this.oadrResponseRequired!= null), (that.oadrResponseRequired!= null))) {
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
                EiEvent theEiEvent;
                theEiEvent = this.getEiEvent();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "eiEvent", theEiEvent), currentHashCode, theEiEvent, (this.eiEvent!= null));
            }
            {
                ResponseRequiredType theOadrResponseRequired;
                theOadrResponseRequired = this.getOadrResponseRequired();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "oadrResponseRequired", theOadrResponseRequired), currentHashCode, theOadrResponseRequired, (this.oadrResponseRequired!= null));
            }
            return currentHashCode;
        }

        public int hashCode() {
            final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
            return this.hashCode(null, strategy);
        }

        public OadrDistributeEvent.OadrEvent withEiEvent(EiEvent value) {
            setEiEvent(value);
            return this;
        }

        public OadrDistributeEvent.OadrEvent withOadrResponseRequired(ResponseRequiredType value) {
            setOadrResponseRequired(value);
            return this;
        }

    }

}
