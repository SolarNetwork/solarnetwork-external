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
import openadr.model.v20b.strm.Intervals;
import openadr.model.v20b.strm.StreamBase;
import openadr.model.v20b.xcal.DateTime;
import openadr.model.v20b.xcal.Dtstart;
import openadr.model.v20b.xcal.DurationPropType;
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
 * eiReport is a Stream of [measurements] recorded over time and delivered to the requestor periodically. The readings may be actual, computed, summed if derived in some other manner.
 * 
 * <p>Java class for oadrReportType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="oadrReportType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ietf:params:xml:ns:icalendar-2.0:stream}StreamBaseType">
 *       &lt;sequence>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/energyinterop/201110}eiReportID" minOccurs="0"/>
 *         &lt;element ref="{http://openadr.org/oadr-2.0b/2012/07}oadrReportDescription" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/energyinterop/201110}reportRequestID"/>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/energyinterop/201110}reportSpecifierID"/>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/energyinterop/201110}reportName" minOccurs="0"/>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/energyinterop/201110}createdDateTime"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "oadrReportType", propOrder = {
    "eiReportID",
    "oadrReportDescriptions",
    "reportRequestID",
    "reportSpecifierID",
    "reportName",
    "createdDateTime"
})
@XmlRootElement(name = "oadrReport")
public class OadrReport
    extends StreamBase
    implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 1L;
    @XmlElement(namespace = "http://docs.oasis-open.org/ns/energyinterop/201110")
    protected String eiReportID;
    @XmlElement(name = "oadrReportDescription")
    protected List<OadrReportDescription> oadrReportDescriptions;
    @XmlElement(namespace = "http://docs.oasis-open.org/ns/energyinterop/201110", required = true)
    protected String reportRequestID;
    @XmlElement(namespace = "http://docs.oasis-open.org/ns/energyinterop/201110", required = true)
    protected String reportSpecifierID;
    @XmlElement(namespace = "http://docs.oasis-open.org/ns/energyinterop/201110")
    protected String reportName;
    @XmlElement(namespace = "http://docs.oasis-open.org/ns/energyinterop/201110", required = true)
    protected DateTime createdDateTime;

    /**
     * Default no-arg constructor
     * 
     */
    public OadrReport() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public OadrReport(final Dtstart dtstart, final DurationPropType duration, final Intervals intervals, final String eiReportID, final List<OadrReportDescription> oadrReportDescriptions, final String reportRequestID, final String reportSpecifierID, final String reportName, final DateTime createdDateTime) {
        super(dtstart, duration, intervals);
        this.eiReportID = eiReportID;
        this.oadrReportDescriptions = oadrReportDescriptions;
        this.reportRequestID = reportRequestID;
        this.reportSpecifierID = reportSpecifierID;
        this.reportName = reportName;
        this.createdDateTime = createdDateTime;
    }

    /**
     * reference ID to this report.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEiReportID() {
        return eiReportID;
    }

    /**
     * Sets the value of the eiReportID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEiReportID(String value) {
        this.eiReportID = value;
    }

    /**
     * Define data points the implementation is capable of reporting on. Only used in Metadata report Gets the value of the oadrReportDescriptions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the oadrReportDescriptions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOadrReportDescriptions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OadrReportDescription }
     * 
     * 
     */
    public List<OadrReportDescription> getOadrReportDescriptions() {
        if (oadrReportDescriptions == null) {
            oadrReportDescriptions = new ArrayList<OadrReportDescription>();
        }
        return this.oadrReportDescriptions;
    }

    /**
     * Reference to the oadrCreateReport request that defined this report.
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
     * Reference to Metadata report from which this report was derived.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportSpecifierID() {
        return reportSpecifierID;
    }

    /**
     * Sets the value of the reportSpecifierID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportSpecifierID(String value) {
        this.reportSpecifierID = value;
    }

    /**
     * Name possibly for use in a user interface.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportName() {
        return reportName;
    }

    /**
     * Sets the value of the reportName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportName(String value) {
        this.reportName = value;
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
            String theEiReportID;
            theEiReportID = this.getEiReportID();
            strategy.appendField(locator, this, "eiReportID", buffer, theEiReportID, (this.eiReportID!= null));
        }
        {
            List<OadrReportDescription> theOadrReportDescriptions;
            theOadrReportDescriptions = (((this.oadrReportDescriptions!= null)&&(!this.oadrReportDescriptions.isEmpty()))?this.getOadrReportDescriptions():null);
            strategy.appendField(locator, this, "oadrReportDescriptions", buffer, theOadrReportDescriptions, ((this.oadrReportDescriptions!= null)&&(!this.oadrReportDescriptions.isEmpty())));
        }
        {
            String theReportRequestID;
            theReportRequestID = this.getReportRequestID();
            strategy.appendField(locator, this, "reportRequestID", buffer, theReportRequestID, (this.reportRequestID!= null));
        }
        {
            String theReportSpecifierID;
            theReportSpecifierID = this.getReportSpecifierID();
            strategy.appendField(locator, this, "reportSpecifierID", buffer, theReportSpecifierID, (this.reportSpecifierID!= null));
        }
        {
            String theReportName;
            theReportName = this.getReportName();
            strategy.appendField(locator, this, "reportName", buffer, theReportName, (this.reportName!= null));
        }
        {
            DateTime theCreatedDateTime;
            theCreatedDateTime = this.getCreatedDateTime();
            strategy.appendField(locator, this, "createdDateTime", buffer, theCreatedDateTime, (this.createdDateTime!= null));
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
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final OadrReport that = ((OadrReport) object);
        {
            String lhsEiReportID;
            lhsEiReportID = this.getEiReportID();
            String rhsEiReportID;
            rhsEiReportID = that.getEiReportID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "eiReportID", lhsEiReportID), LocatorUtils.property(thatLocator, "eiReportID", rhsEiReportID), lhsEiReportID, rhsEiReportID, (this.eiReportID!= null), (that.eiReportID!= null))) {
                return false;
            }
        }
        {
            List<OadrReportDescription> lhsOadrReportDescriptions;
            lhsOadrReportDescriptions = (((this.oadrReportDescriptions!= null)&&(!this.oadrReportDescriptions.isEmpty()))?this.getOadrReportDescriptions():null);
            List<OadrReportDescription> rhsOadrReportDescriptions;
            rhsOadrReportDescriptions = (((that.oadrReportDescriptions!= null)&&(!that.oadrReportDescriptions.isEmpty()))?that.getOadrReportDescriptions():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "oadrReportDescriptions", lhsOadrReportDescriptions), LocatorUtils.property(thatLocator, "oadrReportDescriptions", rhsOadrReportDescriptions), lhsOadrReportDescriptions, rhsOadrReportDescriptions, ((this.oadrReportDescriptions!= null)&&(!this.oadrReportDescriptions.isEmpty())), ((that.oadrReportDescriptions!= null)&&(!that.oadrReportDescriptions.isEmpty())))) {
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
            String lhsReportSpecifierID;
            lhsReportSpecifierID = this.getReportSpecifierID();
            String rhsReportSpecifierID;
            rhsReportSpecifierID = that.getReportSpecifierID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "reportSpecifierID", lhsReportSpecifierID), LocatorUtils.property(thatLocator, "reportSpecifierID", rhsReportSpecifierID), lhsReportSpecifierID, rhsReportSpecifierID, (this.reportSpecifierID!= null), (that.reportSpecifierID!= null))) {
                return false;
            }
        }
        {
            String lhsReportName;
            lhsReportName = this.getReportName();
            String rhsReportName;
            rhsReportName = that.getReportName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "reportName", lhsReportName), LocatorUtils.property(thatLocator, "reportName", rhsReportName), lhsReportName, rhsReportName, (this.reportName!= null), (that.reportName!= null))) {
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
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy2 strategy) {
        int currentHashCode = super.hashCode(locator, strategy);
        {
            String theEiReportID;
            theEiReportID = this.getEiReportID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "eiReportID", theEiReportID), currentHashCode, theEiReportID, (this.eiReportID!= null));
        }
        {
            List<OadrReportDescription> theOadrReportDescriptions;
            theOadrReportDescriptions = (((this.oadrReportDescriptions!= null)&&(!this.oadrReportDescriptions.isEmpty()))?this.getOadrReportDescriptions():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "oadrReportDescriptions", theOadrReportDescriptions), currentHashCode, theOadrReportDescriptions, ((this.oadrReportDescriptions!= null)&&(!this.oadrReportDescriptions.isEmpty())));
        }
        {
            String theReportRequestID;
            theReportRequestID = this.getReportRequestID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "reportRequestID", theReportRequestID), currentHashCode, theReportRequestID, (this.reportRequestID!= null));
        }
        {
            String theReportSpecifierID;
            theReportSpecifierID = this.getReportSpecifierID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "reportSpecifierID", theReportSpecifierID), currentHashCode, theReportSpecifierID, (this.reportSpecifierID!= null));
        }
        {
            String theReportName;
            theReportName = this.getReportName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "reportName", theReportName), currentHashCode, theReportName, (this.reportName!= null));
        }
        {
            DateTime theCreatedDateTime;
            theCreatedDateTime = this.getCreatedDateTime();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "createdDateTime", theCreatedDateTime), currentHashCode, theCreatedDateTime, (this.createdDateTime!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

    public OadrReport withEiReportID(String value) {
        setEiReportID(value);
        return this;
    }

    public OadrReport withOadrReportDescriptions(OadrReportDescription... values) {
        if (values!= null) {
            for (OadrReportDescription value: values) {
                getOadrReportDescriptions().add(value);
            }
        }
        return this;
    }

    public OadrReport withOadrReportDescriptions(Collection<OadrReportDescription> values) {
        if (values!= null) {
            getOadrReportDescriptions().addAll(values);
        }
        return this;
    }

    public OadrReport withReportRequestID(String value) {
        setReportRequestID(value);
        return this;
    }

    public OadrReport withReportSpecifierID(String value) {
        setReportSpecifierID(value);
        return this;
    }

    public OadrReport withReportName(String value) {
        setReportName(value);
        return this;
    }

    public OadrReport withCreatedDateTime(DateTime value) {
        setCreatedDateTime(value);
        return this;
    }

    @Override
    public OadrReport withDtstart(Dtstart value) {
        setDtstart(value);
        return this;
    }

    @Override
    public OadrReport withDuration(DurationPropType value) {
        setDuration(value);
        return this;
    }

    @Override
    public OadrReport withIntervals(Intervals value) {
        setIntervals(value);
        return this;
    }

}
