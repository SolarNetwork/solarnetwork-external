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
 * <p>Java class for oadrCanceledReportType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="oadrCanceledReportType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/energyinterop/201110}eiResponse"/>
 *         &lt;element ref="{http://openadr.org/oadr-2.0b/2012/07}oadrPendingReports"/>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/energyinterop/201110}venID" minOccurs="0"/>
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
@XmlType(name = "oadrCanceledReportType", propOrder = {
    "eiResponse",
    "oadrPendingReports",
    "venID"
})
@XmlRootElement(name = "oadrCanceledReport")
public class OadrCanceledReport implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 1L;
    @XmlElement(namespace = "http://docs.oasis-open.org/ns/energyinterop/201110", required = true)
    protected EiResponse eiResponse;
    @XmlElement(required = true)
    protected OadrPendingReports oadrPendingReports;
    @XmlElement(namespace = "http://docs.oasis-open.org/ns/energyinterop/201110")
    protected String venID;
    @XmlAttribute(name = "schemaVersion", namespace = "http://docs.oasis-open.org/ns/energyinterop/201110")
    protected String schemaVersion;

    /**
     * Default no-arg constructor
     * 
     */
    public OadrCanceledReport() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public OadrCanceledReport(final EiResponse eiResponse, final OadrPendingReports oadrPendingReports, final String venID, final String schemaVersion) {
        this.eiResponse = eiResponse;
        this.oadrPendingReports = oadrPendingReports;
        this.venID = venID;
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
     * Gets the value of the oadrPendingReports property.
     * 
     * @return
     *     possible object is
     *     {@link OadrPendingReports }
     *     
     */
    public OadrPendingReports getOadrPendingReports() {
        return oadrPendingReports;
    }

    /**
     * Sets the value of the oadrPendingReports property.
     * 
     * @param value
     *     allowed object is
     *     {@link OadrPendingReports }
     *     
     */
    public void setOadrPendingReports(OadrPendingReports value) {
        this.oadrPendingReports = value;
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
            OadrPendingReports theOadrPendingReports;
            theOadrPendingReports = this.getOadrPendingReports();
            strategy.appendField(locator, this, "oadrPendingReports", buffer, theOadrPendingReports, (this.oadrPendingReports!= null));
        }
        {
            String theVenID;
            theVenID = this.getVenID();
            strategy.appendField(locator, this, "venID", buffer, theVenID, (this.venID!= null));
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
        final OadrCanceledReport that = ((OadrCanceledReport) object);
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
            OadrPendingReports lhsOadrPendingReports;
            lhsOadrPendingReports = this.getOadrPendingReports();
            OadrPendingReports rhsOadrPendingReports;
            rhsOadrPendingReports = that.getOadrPendingReports();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "oadrPendingReports", lhsOadrPendingReports), LocatorUtils.property(thatLocator, "oadrPendingReports", rhsOadrPendingReports), lhsOadrPendingReports, rhsOadrPendingReports, (this.oadrPendingReports!= null), (that.oadrPendingReports!= null))) {
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
            OadrPendingReports theOadrPendingReports;
            theOadrPendingReports = this.getOadrPendingReports();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "oadrPendingReports", theOadrPendingReports), currentHashCode, theOadrPendingReports, (this.oadrPendingReports!= null));
        }
        {
            String theVenID;
            theVenID = this.getVenID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "venID", theVenID), currentHashCode, theVenID, (this.venID!= null));
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

    public OadrCanceledReport withEiResponse(EiResponse value) {
        setEiResponse(value);
        return this;
    }

    public OadrCanceledReport withOadrPendingReports(OadrPendingReports value) {
        setOadrPendingReports(value);
        return this;
    }

    public OadrCanceledReport withVenID(String value) {
        setVenID(value);
        return this;
    }

    public OadrCanceledReport withSchemaVersion(String value) {
        setSchemaVersion(value);
        return this;
    }

}
