//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.2-hudson-jaxb-ri-2.2-63- 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.02.02 at 02:58:26 PM NZDT 
//


package openadr.model.v20b;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import openadr.model.v20b.ei.ReportSpecifier;
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
 * This type is used to request an EiReport
 * 
 * <p>Java class for oadrReportRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="oadrReportRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/energyinterop/201110}reportRequestID"/>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/energyinterop/201110}reportSpecifier"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "oadrReportRequestType", propOrder = {
    "reportRequestID",
    "reportSpecifier"
})
@XmlRootElement(name = "oadrReportRequest")
public class OadrReportRequest implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 1L;
    @XmlElement(namespace = "http://docs.oasis-open.org/ns/energyinterop/201110", required = true)
    protected String reportRequestID;
    @XmlElement(namespace = "http://docs.oasis-open.org/ns/energyinterop/201110", required = true)
    protected ReportSpecifier reportSpecifier;

    /**
     * Default no-arg constructor
     * 
     */
    public OadrReportRequest() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public OadrReportRequest(final String reportRequestID, final ReportSpecifier reportSpecifier) {
        this.reportRequestID = reportRequestID;
        this.reportSpecifier = reportSpecifier;
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
     * Gets the value of the reportSpecifier property.
     * 
     * @return
     *     possible object is
     *     {@link ReportSpecifier }
     *     
     */
    public ReportSpecifier getReportSpecifier() {
        return reportSpecifier;
    }

    /**
     * Sets the value of the reportSpecifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportSpecifier }
     *     
     */
    public void setReportSpecifier(ReportSpecifier value) {
        this.reportSpecifier = value;
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
            String theReportRequestID;
            theReportRequestID = this.getReportRequestID();
            strategy.appendField(locator, this, "reportRequestID", buffer, theReportRequestID, (this.reportRequestID!= null));
        }
        {
            ReportSpecifier theReportSpecifier;
            theReportSpecifier = this.getReportSpecifier();
            strategy.appendField(locator, this, "reportSpecifier", buffer, theReportSpecifier, (this.reportSpecifier!= null));
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
        final OadrReportRequest that = ((OadrReportRequest) object);
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
            ReportSpecifier lhsReportSpecifier;
            lhsReportSpecifier = this.getReportSpecifier();
            ReportSpecifier rhsReportSpecifier;
            rhsReportSpecifier = that.getReportSpecifier();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "reportSpecifier", lhsReportSpecifier), LocatorUtils.property(thatLocator, "reportSpecifier", rhsReportSpecifier), lhsReportSpecifier, rhsReportSpecifier, (this.reportSpecifier!= null), (that.reportSpecifier!= null))) {
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
            String theReportRequestID;
            theReportRequestID = this.getReportRequestID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "reportRequestID", theReportRequestID), currentHashCode, theReportRequestID, (this.reportRequestID!= null));
        }
        {
            ReportSpecifier theReportSpecifier;
            theReportSpecifier = this.getReportSpecifier();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "reportSpecifier", theReportSpecifier), currentHashCode, theReportSpecifier, (this.reportSpecifier!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

    public OadrReportRequest withReportRequestID(String value) {
        setReportRequestID(value);
        return this;
    }

    public OadrReportRequest withReportSpecifier(ReportSpecifier value) {
        setReportSpecifier(value);
        return this;
    }

}
