//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.2-hudson-jaxb-ri-2.2-63- 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.02.02 at 04:16:30 PM NZDT 
//


package openadr.model.v20b;

import java.io.Serializable;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import openadr.model.v20b.ei.PayloadBaseType;
import openadr.model.v20b.ei.ReportPayloadType;
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
 * Report payload for use in reports.
 * 
 * <p>Java class for oadrReportPayloadType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="oadrReportPayloadType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://docs.oasis-open.org/ns/energyinterop/201110}ReportPayloadType">
 *       &lt;sequence>
 *         &lt;element ref="{http://openadr.org/oadr-2.0b/2012/07}oadrDataQuality" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "oadrReportPayloadType", propOrder = {
    "oadrDataQuality"
})
public class OadrReportPayloadType
    extends ReportPayloadType
    implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 1L;
    protected String oadrDataQuality;

    /**
     * Default no-arg constructor
     * 
     */
    public OadrReportPayloadType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public OadrReportPayloadType(final String rid, final Long confidence, final Float accuracy, final JAXBElement<? extends PayloadBaseType> payloadBase, final String oadrDataQuality) {
        super(rid, confidence, accuracy, payloadBase);
        this.oadrDataQuality = oadrDataQuality;
    }

    /**
     * Enumerated value for the quality of this data item
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOadrDataQuality() {
        return oadrDataQuality;
    }

    /**
     * Sets the value of the oadrDataQuality property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOadrDataQuality(String value) {
        this.oadrDataQuality = value;
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
            String theOadrDataQuality;
            theOadrDataQuality = this.getOadrDataQuality();
            strategy.appendField(locator, this, "oadrDataQuality", buffer, theOadrDataQuality, (this.oadrDataQuality!= null));
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
        final OadrReportPayloadType that = ((OadrReportPayloadType) object);
        {
            String lhsOadrDataQuality;
            lhsOadrDataQuality = this.getOadrDataQuality();
            String rhsOadrDataQuality;
            rhsOadrDataQuality = that.getOadrDataQuality();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "oadrDataQuality", lhsOadrDataQuality), LocatorUtils.property(thatLocator, "oadrDataQuality", rhsOadrDataQuality), lhsOadrDataQuality, rhsOadrDataQuality, (this.oadrDataQuality!= null), (that.oadrDataQuality!= null))) {
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
            String theOadrDataQuality;
            theOadrDataQuality = this.getOadrDataQuality();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "oadrDataQuality", theOadrDataQuality), currentHashCode, theOadrDataQuality, (this.oadrDataQuality!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

    public OadrReportPayloadType withOadrDataQuality(String value) {
        setOadrDataQuality(value);
        return this;
    }

    @Override
    public OadrReportPayloadType withRID(String value) {
        setRID(value);
        return this;
    }

    @Override
    public OadrReportPayloadType withConfidence(Long value) {
        setConfidence(value);
        return this;
    }

    @Override
    public OadrReportPayloadType withAccuracy(Float value) {
        setAccuracy(value);
        return this;
    }

    @Override
    public OadrReportPayloadType withPayloadBase(JAXBElement<? extends PayloadBaseType> value) {
        setPayloadBase(value);
        return this;
    }

}