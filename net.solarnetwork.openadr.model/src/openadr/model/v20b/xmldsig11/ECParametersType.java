//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.2-hudson-jaxb-ri-2.2-63- 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.02.02 at 04:16:30 PM NZDT 
//


package openadr.model.v20b.xmldsig11;

import java.io.Serializable;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 * <p>Java class for ECParametersType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ECParametersType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FieldID" type="{http://www.w3.org/2009/xmldsig11#}FieldIDType"/>
 *         &lt;element name="Curve" type="{http://www.w3.org/2009/xmldsig11#}CurveType"/>
 *         &lt;element name="Base" type="{http://www.w3.org/2009/xmldsig11#}ECPointType"/>
 *         &lt;element name="Order" type="{http://www.w3.org/2000/09/xmldsig#}CryptoBinary"/>
 *         &lt;element name="CoFactor" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="ValidationData" type="{http://www.w3.org/2009/xmldsig11#}ECValidationDataType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ECParametersType", propOrder = {
    "fieldID",
    "curve",
    "base",
    "order",
    "coFactor",
    "validationData"
})
public class ECParametersType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "FieldID", required = true)
    protected FieldIDType fieldID;
    @XmlElement(name = "Curve", required = true)
    protected CurveType curve;
    @XmlElement(name = "Base", required = true)
    protected byte[] base;
    @XmlElement(name = "Order", required = true)
    protected byte[] order;
    @XmlElement(name = "CoFactor")
    protected BigInteger coFactor;
    @XmlElement(name = "ValidationData")
    protected ECValidationDataType validationData;

    /**
     * Default no-arg constructor
     * 
     */
    public ECParametersType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public ECParametersType(final FieldIDType fieldID, final CurveType curve, final byte[] base, final byte[] order, final BigInteger coFactor, final ECValidationDataType validationData) {
        this.fieldID = fieldID;
        this.curve = curve;
        this.base = base;
        this.order = order;
        this.coFactor = coFactor;
        this.validationData = validationData;
    }

    /**
     * Gets the value of the fieldID property.
     * 
     * @return
     *     possible object is
     *     {@link FieldIDType }
     *     
     */
    public FieldIDType getFieldID() {
        return fieldID;
    }

    /**
     * Sets the value of the fieldID property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldIDType }
     *     
     */
    public void setFieldID(FieldIDType value) {
        this.fieldID = value;
    }

    /**
     * Gets the value of the curve property.
     * 
     * @return
     *     possible object is
     *     {@link CurveType }
     *     
     */
    public CurveType getCurve() {
        return curve;
    }

    /**
     * Sets the value of the curve property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurveType }
     *     
     */
    public void setCurve(CurveType value) {
        this.curve = value;
    }

    /**
     * Gets the value of the base property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getBase() {
        return base;
    }

    /**
     * Sets the value of the base property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setBase(byte[] value) {
        this.base = ((byte[]) value);
    }

    /**
     * Gets the value of the order property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getOrder() {
        return order;
    }

    /**
     * Sets the value of the order property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setOrder(byte[] value) {
        this.order = ((byte[]) value);
    }

    /**
     * Gets the value of the coFactor property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCoFactor() {
        return coFactor;
    }

    /**
     * Sets the value of the coFactor property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCoFactor(BigInteger value) {
        this.coFactor = value;
    }

    /**
     * Gets the value of the validationData property.
     * 
     * @return
     *     possible object is
     *     {@link ECValidationDataType }
     *     
     */
    public ECValidationDataType getValidationData() {
        return validationData;
    }

    /**
     * Sets the value of the validationData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ECValidationDataType }
     *     
     */
    public void setValidationData(ECValidationDataType value) {
        this.validationData = value;
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
            FieldIDType theFieldID;
            theFieldID = this.getFieldID();
            strategy.appendField(locator, this, "fieldID", buffer, theFieldID, (this.fieldID!= null));
        }
        {
            CurveType theCurve;
            theCurve = this.getCurve();
            strategy.appendField(locator, this, "curve", buffer, theCurve, (this.curve!= null));
        }
        {
            byte[] theBase;
            theBase = this.getBase();
            strategy.appendField(locator, this, "base", buffer, theBase, (this.base!= null));
        }
        {
            byte[] theOrder;
            theOrder = this.getOrder();
            strategy.appendField(locator, this, "order", buffer, theOrder, (this.order!= null));
        }
        {
            BigInteger theCoFactor;
            theCoFactor = this.getCoFactor();
            strategy.appendField(locator, this, "coFactor", buffer, theCoFactor, (this.coFactor!= null));
        }
        {
            ECValidationDataType theValidationData;
            theValidationData = this.getValidationData();
            strategy.appendField(locator, this, "validationData", buffer, theValidationData, (this.validationData!= null));
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
        final ECParametersType that = ((ECParametersType) object);
        {
            FieldIDType lhsFieldID;
            lhsFieldID = this.getFieldID();
            FieldIDType rhsFieldID;
            rhsFieldID = that.getFieldID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fieldID", lhsFieldID), LocatorUtils.property(thatLocator, "fieldID", rhsFieldID), lhsFieldID, rhsFieldID, (this.fieldID!= null), (that.fieldID!= null))) {
                return false;
            }
        }
        {
            CurveType lhsCurve;
            lhsCurve = this.getCurve();
            CurveType rhsCurve;
            rhsCurve = that.getCurve();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "curve", lhsCurve), LocatorUtils.property(thatLocator, "curve", rhsCurve), lhsCurve, rhsCurve, (this.curve!= null), (that.curve!= null))) {
                return false;
            }
        }
        {
            byte[] lhsBase;
            lhsBase = this.getBase();
            byte[] rhsBase;
            rhsBase = that.getBase();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "base", lhsBase), LocatorUtils.property(thatLocator, "base", rhsBase), lhsBase, rhsBase, (this.base!= null), (that.base!= null))) {
                return false;
            }
        }
        {
            byte[] lhsOrder;
            lhsOrder = this.getOrder();
            byte[] rhsOrder;
            rhsOrder = that.getOrder();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "order", lhsOrder), LocatorUtils.property(thatLocator, "order", rhsOrder), lhsOrder, rhsOrder, (this.order!= null), (that.order!= null))) {
                return false;
            }
        }
        {
            BigInteger lhsCoFactor;
            lhsCoFactor = this.getCoFactor();
            BigInteger rhsCoFactor;
            rhsCoFactor = that.getCoFactor();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "coFactor", lhsCoFactor), LocatorUtils.property(thatLocator, "coFactor", rhsCoFactor), lhsCoFactor, rhsCoFactor, (this.coFactor!= null), (that.coFactor!= null))) {
                return false;
            }
        }
        {
            ECValidationDataType lhsValidationData;
            lhsValidationData = this.getValidationData();
            ECValidationDataType rhsValidationData;
            rhsValidationData = that.getValidationData();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "validationData", lhsValidationData), LocatorUtils.property(thatLocator, "validationData", rhsValidationData), lhsValidationData, rhsValidationData, (this.validationData!= null), (that.validationData!= null))) {
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
            FieldIDType theFieldID;
            theFieldID = this.getFieldID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "fieldID", theFieldID), currentHashCode, theFieldID, (this.fieldID!= null));
        }
        {
            CurveType theCurve;
            theCurve = this.getCurve();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "curve", theCurve), currentHashCode, theCurve, (this.curve!= null));
        }
        {
            byte[] theBase;
            theBase = this.getBase();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "base", theBase), currentHashCode, theBase, (this.base!= null));
        }
        {
            byte[] theOrder;
            theOrder = this.getOrder();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "order", theOrder), currentHashCode, theOrder, (this.order!= null));
        }
        {
            BigInteger theCoFactor;
            theCoFactor = this.getCoFactor();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "coFactor", theCoFactor), currentHashCode, theCoFactor, (this.coFactor!= null));
        }
        {
            ECValidationDataType theValidationData;
            theValidationData = this.getValidationData();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "validationData", theValidationData), currentHashCode, theValidationData, (this.validationData!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

    public ECParametersType withFieldID(FieldIDType value) {
        setFieldID(value);
        return this;
    }

    public ECParametersType withCurve(CurveType value) {
        setCurve(value);
        return this;
    }

    public ECParametersType withBase(byte[] value) {
        setBase(value);
        return this;
    }

    public ECParametersType withOrder(byte[] value) {
        setOrder(value);
        return this;
    }

    public ECParametersType withCoFactor(BigInteger value) {
        setCoFactor(value);
        return this;
    }

    public ECParametersType withValidationData(ECValidationDataType value) {
        setValidationData(value);
        return this;
    }

}