//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.2-hudson-jaxb-ri-2.2-63- 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.02.02 at 04:16:30 PM NZDT 
//


package openadr.model.v20b;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 * <p>Java class for oadrCreatePartyRegistrationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="oadrCreatePartyRegistrationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/energyinterop/201110/payloads}requestID"/>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/energyinterop/201110}registrationID" minOccurs="0"/>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/energyinterop/201110}venID" minOccurs="0"/>
 *         &lt;element ref="{http://openadr.org/oadr-2.0b/2012/07}oadrProfileName"/>
 *         &lt;element ref="{http://openadr.org/oadr-2.0b/2012/07}oadrTransportName"/>
 *         &lt;element ref="{http://openadr.org/oadr-2.0b/2012/07}oadrTransportAddress" minOccurs="0"/>
 *         &lt;element ref="{http://openadr.org/oadr-2.0b/2012/07}oadrReportOnly"/>
 *         &lt;element ref="{http://openadr.org/oadr-2.0b/2012/07}oadrXmlSignature"/>
 *         &lt;element ref="{http://openadr.org/oadr-2.0b/2012/07}oadrVenName" minOccurs="0"/>
 *         &lt;element ref="{http://openadr.org/oadr-2.0b/2012/07}oadrHttpPullModel" minOccurs="0"/>
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
@XmlType(name = "oadrCreatePartyRegistrationType", propOrder = {
    "requestID",
    "registrationID",
    "venID",
    "oadrProfileName",
    "oadrTransportName",
    "oadrTransportAddress",
    "oadrReportOnly",
    "oadrXmlSignature",
    "oadrVenName",
    "oadrHttpPullModel"
})
@XmlRootElement(name = "oadrCreatePartyRegistration")
public class OadrCreatePartyRegistration implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 1L;
    @XmlElement(namespace = "http://docs.oasis-open.org/ns/energyinterop/201110/payloads", required = true)
    protected String requestID;
    @XmlElement(namespace = "http://docs.oasis-open.org/ns/energyinterop/201110")
    protected String registrationID;
    @XmlElement(namespace = "http://docs.oasis-open.org/ns/energyinterop/201110")
    protected String venID;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String oadrProfileName;
    @XmlElement(required = true)
    protected OadrTransportType oadrTransportName;
    protected String oadrTransportAddress;
    protected boolean oadrReportOnly;
    protected boolean oadrXmlSignature;
    protected String oadrVenName;
    protected Boolean oadrHttpPullModel;
    @XmlAttribute(name = "schemaVersion", namespace = "http://docs.oasis-open.org/ns/energyinterop/201110")
    protected String schemaVersion;

    /**
     * Default no-arg constructor
     * 
     */
    public OadrCreatePartyRegistration() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public OadrCreatePartyRegistration(final String requestID, final String registrationID, final String venID, final String oadrProfileName, final OadrTransportType oadrTransportName, final String oadrTransportAddress, final boolean oadrReportOnly, final boolean oadrXmlSignature, final String oadrVenName, final Boolean oadrHttpPullModel, final String schemaVersion) {
        this.requestID = requestID;
        this.registrationID = registrationID;
        this.venID = venID;
        this.oadrProfileName = oadrProfileName;
        this.oadrTransportName = oadrTransportName;
        this.oadrTransportAddress = oadrTransportAddress;
        this.oadrReportOnly = oadrReportOnly;
        this.oadrXmlSignature = oadrXmlSignature;
        this.oadrVenName = oadrVenName;
        this.oadrHttpPullModel = oadrHttpPullModel;
        this.schemaVersion = schemaVersion;
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
     * Used for re-registering an existing registration
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistrationID() {
        return registrationID;
    }

    /**
     * Sets the value of the registrationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistrationID(String value) {
        this.registrationID = value;
    }

    /**
     * Gets the value of the venID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVenID() {
        return venID;
    }

    /**
     * Sets the value of the venID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVenID(String value) {
        this.venID = value;
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

    /**
     * Address of this VEN. Not required if http pull model
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOadrTransportAddress() {
        return oadrTransportAddress;
    }

    /**
     * Sets the value of the oadrTransportAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOadrTransportAddress(String value) {
        this.oadrTransportAddress = value;
    }

    /**
     * ReportOnlyDeviceFlag - True or False
     * 
     */
    public boolean isOadrReportOnly() {
        return oadrReportOnly;
    }

    /**
     * Sets the value of the oadrReportOnly property.
     * 
     */
    public void setOadrReportOnly(boolean value) {
        this.oadrReportOnly = value;
    }

    /**
     * Implementation supports XML signatures - True or False
     * 
     */
    public boolean isOadrXmlSignature() {
        return oadrXmlSignature;
    }

    /**
     * Sets the value of the oadrXmlSignature property.
     * 
     */
    public void setOadrXmlSignature(boolean value) {
        this.oadrXmlSignature = value;
    }

    /**
     * Human readable name for VEN
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOadrVenName() {
        return oadrVenName;
    }

    /**
     * Sets the value of the oadrVenName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOadrVenName(String value) {
        this.oadrVenName = value;
    }

    /**
     * If transport is simpleHttp indicate if VEN is operating in pull exchange model - true or false
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOadrHttpPullModel() {
        return oadrHttpPullModel;
    }

    /**
     * Sets the value of the oadrHttpPullModel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOadrHttpPullModel(Boolean value) {
        this.oadrHttpPullModel = value;
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
            String theRequestID;
            theRequestID = this.getRequestID();
            strategy.appendField(locator, this, "requestID", buffer, theRequestID, (this.requestID!= null));
        }
        {
            String theRegistrationID;
            theRegistrationID = this.getRegistrationID();
            strategy.appendField(locator, this, "registrationID", buffer, theRegistrationID, (this.registrationID!= null));
        }
        {
            String theVenID;
            theVenID = this.getVenID();
            strategy.appendField(locator, this, "venID", buffer, theVenID, (this.venID!= null));
        }
        {
            String theOadrProfileName;
            theOadrProfileName = this.getOadrProfileName();
            strategy.appendField(locator, this, "oadrProfileName", buffer, theOadrProfileName, (this.oadrProfileName!= null));
        }
        {
            OadrTransportType theOadrTransportName;
            theOadrTransportName = this.getOadrTransportName();
            strategy.appendField(locator, this, "oadrTransportName", buffer, theOadrTransportName, (this.oadrTransportName!= null));
        }
        {
            String theOadrTransportAddress;
            theOadrTransportAddress = this.getOadrTransportAddress();
            strategy.appendField(locator, this, "oadrTransportAddress", buffer, theOadrTransportAddress, (this.oadrTransportAddress!= null));
        }
        {
            boolean theOadrReportOnly;
            theOadrReportOnly = this.isOadrReportOnly();
            strategy.appendField(locator, this, "oadrReportOnly", buffer, theOadrReportOnly, true);
        }
        {
            boolean theOadrXmlSignature;
            theOadrXmlSignature = this.isOadrXmlSignature();
            strategy.appendField(locator, this, "oadrXmlSignature", buffer, theOadrXmlSignature, true);
        }
        {
            String theOadrVenName;
            theOadrVenName = this.getOadrVenName();
            strategy.appendField(locator, this, "oadrVenName", buffer, theOadrVenName, (this.oadrVenName!= null));
        }
        {
            Boolean theOadrHttpPullModel;
            theOadrHttpPullModel = this.isOadrHttpPullModel();
            strategy.appendField(locator, this, "oadrHttpPullModel", buffer, theOadrHttpPullModel, (this.oadrHttpPullModel!= null));
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
        final OadrCreatePartyRegistration that = ((OadrCreatePartyRegistration) object);
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
            String lhsRegistrationID;
            lhsRegistrationID = this.getRegistrationID();
            String rhsRegistrationID;
            rhsRegistrationID = that.getRegistrationID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "registrationID", lhsRegistrationID), LocatorUtils.property(thatLocator, "registrationID", rhsRegistrationID), lhsRegistrationID, rhsRegistrationID, (this.registrationID!= null), (that.registrationID!= null))) {
                return false;
            }
        }
        {
            String lhsVenID;
            lhsVenID = this.getVenID();
            String rhsVenID;
            rhsVenID = that.getVenID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "venID", lhsVenID), LocatorUtils.property(thatLocator, "venID", rhsVenID), lhsVenID, rhsVenID, (this.venID!= null), (that.venID!= null))) {
                return false;
            }
        }
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
            OadrTransportType lhsOadrTransportName;
            lhsOadrTransportName = this.getOadrTransportName();
            OadrTransportType rhsOadrTransportName;
            rhsOadrTransportName = that.getOadrTransportName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "oadrTransportName", lhsOadrTransportName), LocatorUtils.property(thatLocator, "oadrTransportName", rhsOadrTransportName), lhsOadrTransportName, rhsOadrTransportName, (this.oadrTransportName!= null), (that.oadrTransportName!= null))) {
                return false;
            }
        }
        {
            String lhsOadrTransportAddress;
            lhsOadrTransportAddress = this.getOadrTransportAddress();
            String rhsOadrTransportAddress;
            rhsOadrTransportAddress = that.getOadrTransportAddress();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "oadrTransportAddress", lhsOadrTransportAddress), LocatorUtils.property(thatLocator, "oadrTransportAddress", rhsOadrTransportAddress), lhsOadrTransportAddress, rhsOadrTransportAddress, (this.oadrTransportAddress!= null), (that.oadrTransportAddress!= null))) {
                return false;
            }
        }
        {
            boolean lhsOadrReportOnly;
            lhsOadrReportOnly = this.isOadrReportOnly();
            boolean rhsOadrReportOnly;
            rhsOadrReportOnly = that.isOadrReportOnly();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "oadrReportOnly", lhsOadrReportOnly), LocatorUtils.property(thatLocator, "oadrReportOnly", rhsOadrReportOnly), lhsOadrReportOnly, rhsOadrReportOnly, true, true)) {
                return false;
            }
        }
        {
            boolean lhsOadrXmlSignature;
            lhsOadrXmlSignature = this.isOadrXmlSignature();
            boolean rhsOadrXmlSignature;
            rhsOadrXmlSignature = that.isOadrXmlSignature();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "oadrXmlSignature", lhsOadrXmlSignature), LocatorUtils.property(thatLocator, "oadrXmlSignature", rhsOadrXmlSignature), lhsOadrXmlSignature, rhsOadrXmlSignature, true, true)) {
                return false;
            }
        }
        {
            String lhsOadrVenName;
            lhsOadrVenName = this.getOadrVenName();
            String rhsOadrVenName;
            rhsOadrVenName = that.getOadrVenName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "oadrVenName", lhsOadrVenName), LocatorUtils.property(thatLocator, "oadrVenName", rhsOadrVenName), lhsOadrVenName, rhsOadrVenName, (this.oadrVenName!= null), (that.oadrVenName!= null))) {
                return false;
            }
        }
        {
            Boolean lhsOadrHttpPullModel;
            lhsOadrHttpPullModel = this.isOadrHttpPullModel();
            Boolean rhsOadrHttpPullModel;
            rhsOadrHttpPullModel = that.isOadrHttpPullModel();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "oadrHttpPullModel", lhsOadrHttpPullModel), LocatorUtils.property(thatLocator, "oadrHttpPullModel", rhsOadrHttpPullModel), lhsOadrHttpPullModel, rhsOadrHttpPullModel, (this.oadrHttpPullModel!= null), (that.oadrHttpPullModel!= null))) {
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
            String theRequestID;
            theRequestID = this.getRequestID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "requestID", theRequestID), currentHashCode, theRequestID, (this.requestID!= null));
        }
        {
            String theRegistrationID;
            theRegistrationID = this.getRegistrationID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "registrationID", theRegistrationID), currentHashCode, theRegistrationID, (this.registrationID!= null));
        }
        {
            String theVenID;
            theVenID = this.getVenID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "venID", theVenID), currentHashCode, theVenID, (this.venID!= null));
        }
        {
            String theOadrProfileName;
            theOadrProfileName = this.getOadrProfileName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "oadrProfileName", theOadrProfileName), currentHashCode, theOadrProfileName, (this.oadrProfileName!= null));
        }
        {
            OadrTransportType theOadrTransportName;
            theOadrTransportName = this.getOadrTransportName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "oadrTransportName", theOadrTransportName), currentHashCode, theOadrTransportName, (this.oadrTransportName!= null));
        }
        {
            String theOadrTransportAddress;
            theOadrTransportAddress = this.getOadrTransportAddress();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "oadrTransportAddress", theOadrTransportAddress), currentHashCode, theOadrTransportAddress, (this.oadrTransportAddress!= null));
        }
        {
            boolean theOadrReportOnly;
            theOadrReportOnly = this.isOadrReportOnly();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "oadrReportOnly", theOadrReportOnly), currentHashCode, theOadrReportOnly, true);
        }
        {
            boolean theOadrXmlSignature;
            theOadrXmlSignature = this.isOadrXmlSignature();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "oadrXmlSignature", theOadrXmlSignature), currentHashCode, theOadrXmlSignature, true);
        }
        {
            String theOadrVenName;
            theOadrVenName = this.getOadrVenName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "oadrVenName", theOadrVenName), currentHashCode, theOadrVenName, (this.oadrVenName!= null));
        }
        {
            Boolean theOadrHttpPullModel;
            theOadrHttpPullModel = this.isOadrHttpPullModel();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "oadrHttpPullModel", theOadrHttpPullModel), currentHashCode, theOadrHttpPullModel, (this.oadrHttpPullModel!= null));
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

    public OadrCreatePartyRegistration withRequestID(String value) {
        setRequestID(value);
        return this;
    }

    public OadrCreatePartyRegistration withRegistrationID(String value) {
        setRegistrationID(value);
        return this;
    }

    public OadrCreatePartyRegistration withVenID(String value) {
        setVenID(value);
        return this;
    }

    public OadrCreatePartyRegistration withOadrProfileName(String value) {
        setOadrProfileName(value);
        return this;
    }

    public OadrCreatePartyRegistration withOadrTransportName(OadrTransportType value) {
        setOadrTransportName(value);
        return this;
    }

    public OadrCreatePartyRegistration withOadrTransportAddress(String value) {
        setOadrTransportAddress(value);
        return this;
    }

    public OadrCreatePartyRegistration withOadrReportOnly(boolean value) {
        setOadrReportOnly(value);
        return this;
    }

    public OadrCreatePartyRegistration withOadrXmlSignature(boolean value) {
        setOadrXmlSignature(value);
        return this;
    }

    public OadrCreatePartyRegistration withOadrVenName(String value) {
        setOadrVenName(value);
        return this;
    }

    public OadrCreatePartyRegistration withOadrHttpPullModel(Boolean value) {
        setOadrHttpPullModel(value);
        return this;
    }

    public OadrCreatePartyRegistration withSchemaVersion(String value) {
        setSchemaVersion(value);
        return this;
    }

}
