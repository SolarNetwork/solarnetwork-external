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
 * <p>Java class for oadrRegisterReportType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="oadrRegisterReportType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/energyinterop/201110/payloads}requestID"/>
 *         &lt;element ref="{http://openadr.org/oadr-2.0b/2012/07}oadrReport" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/energyinterop/201110}venID" minOccurs="0"/>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/energyinterop/201110}reportRequestID" minOccurs="0"/>
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
@XmlType(name = "oadrRegisterReportType", propOrder = {
    "requestID",
    "oadrReports",
    "venID",
    "reportRequestID"
})
@XmlRootElement(name = "oadrRegisterReport")
public class OadrRegisterReport implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 1L;
    @XmlElement(namespace = "http://docs.oasis-open.org/ns/energyinterop/201110/payloads", required = true)
    protected String requestID;
    @XmlElement(name = "oadrReport")
    protected List<OadrReport> oadrReports;
    @XmlElement(namespace = "http://docs.oasis-open.org/ns/energyinterop/201110")
    protected String venID;
    @XmlElement(namespace = "http://docs.oasis-open.org/ns/energyinterop/201110")
    protected String reportRequestID;
    @XmlAttribute(name = "schemaVersion", namespace = "http://docs.oasis-open.org/ns/energyinterop/201110")
    protected String schemaVersion;

    /**
     * Default no-arg constructor
     * 
     */
    public OadrRegisterReport() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public OadrRegisterReport(final String requestID, final List<OadrReport> oadrReports, final String venID, final String reportRequestID, final String schemaVersion) {
        this.requestID = requestID;
        this.oadrReports = oadrReports;
        this.venID = venID;
        this.reportRequestID = reportRequestID;
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
     * Gets the value of the oadrReports property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the oadrReports property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOadrReports().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OadrReport }
     * 
     * 
     */
    public List<OadrReport> getOadrReports() {
        if (oadrReports == null) {
            oadrReports = new ArrayList<OadrReport>();
        }
        return this.oadrReports;
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
     * Gets the value of the reportRequestID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportRequestID() {
        return reportRequestID;
    }

    /**
     * Sets the value of the reportRequestID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportRequestID(String value) {
        this.reportRequestID = value;
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
            List<OadrReport> theOadrReports;
            theOadrReports = (((this.oadrReports!= null)&&(!this.oadrReports.isEmpty()))?this.getOadrReports():null);
            strategy.appendField(locator, this, "oadrReports", buffer, theOadrReports, ((this.oadrReports!= null)&&(!this.oadrReports.isEmpty())));
        }
        {
            String theVenID;
            theVenID = this.getVenID();
            strategy.appendField(locator, this, "venID", buffer, theVenID, (this.venID!= null));
        }
        {
            String theReportRequestID;
            theReportRequestID = this.getReportRequestID();
            strategy.appendField(locator, this, "reportRequestID", buffer, theReportRequestID, (this.reportRequestID!= null));
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
        final OadrRegisterReport that = ((OadrRegisterReport) object);
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
            List<OadrReport> lhsOadrReports;
            lhsOadrReports = (((this.oadrReports!= null)&&(!this.oadrReports.isEmpty()))?this.getOadrReports():null);
            List<OadrReport> rhsOadrReports;
            rhsOadrReports = (((that.oadrReports!= null)&&(!that.oadrReports.isEmpty()))?that.getOadrReports():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "oadrReports", lhsOadrReports), LocatorUtils.property(thatLocator, "oadrReports", rhsOadrReports), lhsOadrReports, rhsOadrReports, ((this.oadrReports!= null)&&(!this.oadrReports.isEmpty())), ((that.oadrReports!= null)&&(!that.oadrReports.isEmpty())))) {
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
            String lhsReportRequestID;
            lhsReportRequestID = this.getReportRequestID();
            String rhsReportRequestID;
            rhsReportRequestID = that.getReportRequestID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "reportRequestID", lhsReportRequestID), LocatorUtils.property(thatLocator, "reportRequestID", rhsReportRequestID), lhsReportRequestID, rhsReportRequestID, (this.reportRequestID!= null), (that.reportRequestID!= null))) {
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
            List<OadrReport> theOadrReports;
            theOadrReports = (((this.oadrReports!= null)&&(!this.oadrReports.isEmpty()))?this.getOadrReports():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "oadrReports", theOadrReports), currentHashCode, theOadrReports, ((this.oadrReports!= null)&&(!this.oadrReports.isEmpty())));
        }
        {
            String theVenID;
            theVenID = this.getVenID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "venID", theVenID), currentHashCode, theVenID, (this.venID!= null));
        }
        {
            String theReportRequestID;
            theReportRequestID = this.getReportRequestID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "reportRequestID", theReportRequestID), currentHashCode, theReportRequestID, (this.reportRequestID!= null));
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

    public OadrRegisterReport withRequestID(String value) {
        setRequestID(value);
        return this;
    }

    public OadrRegisterReport withOadrReports(OadrReport... values) {
        if (values!= null) {
            for (OadrReport value: values) {
                getOadrReports().add(value);
            }
        }
        return this;
    }

    public OadrRegisterReport withOadrReports(Collection<OadrReport> values) {
        if (values!= null) {
            getOadrReports().addAll(values);
        }
        return this;
    }

    public OadrRegisterReport withVenID(String value) {
        setVenID(value);
        return this;
    }

    public OadrRegisterReport withReportRequestID(String value) {
        setReportRequestID(value);
        return this;
    }

    public OadrRegisterReport withSchemaVersion(String value) {
        setSchemaVersion(value);
        return this;
    }

}
