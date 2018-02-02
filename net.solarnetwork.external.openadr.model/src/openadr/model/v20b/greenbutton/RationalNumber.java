//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.2-hudson-jaxb-ri-2.2-63- 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.02.02 at 02:58:26 PM NZDT 
//


package openadr.model.v20b.greenbutton;

import java.io.Serializable;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 * [extension] Rational number = 'numerator' / 'denominator'.
 * 
 * <p>Java class for RationalNumber complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RationalNumber">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numerator" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="denominator" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RationalNumber", propOrder = {
    "numerator",
    "denominator"
})
public class RationalNumber implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 1L;
    protected BigInteger numerator;
    protected java.lang.Object denominator;

    /**
     * Default no-arg constructor
     * 
     */
    public RationalNumber() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public RationalNumber(final BigInteger numerator, final java.lang.Object denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    /**
     * Gets the value of the numerator property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumerator() {
        return numerator;
    }

    /**
     * Sets the value of the numerator property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumerator(BigInteger value) {
        this.numerator = value;
    }

    /**
     * Gets the value of the denominator property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.Object }
     *     
     */
    public java.lang.Object getDenominator() {
        return denominator;
    }

    /**
     * Sets the value of the denominator property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.Object }
     *     
     */
    public void setDenominator(java.lang.Object value) {
        this.denominator = value;
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
            BigInteger theNumerator;
            theNumerator = this.getNumerator();
            strategy.appendField(locator, this, "numerator", buffer, theNumerator, (this.numerator!= null));
        }
        {
            java.lang.Object theDenominator;
            theDenominator = this.getDenominator();
            strategy.appendField(locator, this, "denominator", buffer, theDenominator, (this.denominator!= null));
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, java.lang.Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final RationalNumber that = ((RationalNumber) object);
        {
            BigInteger lhsNumerator;
            lhsNumerator = this.getNumerator();
            BigInteger rhsNumerator;
            rhsNumerator = that.getNumerator();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "numerator", lhsNumerator), LocatorUtils.property(thatLocator, "numerator", rhsNumerator), lhsNumerator, rhsNumerator, (this.numerator!= null), (that.numerator!= null))) {
                return false;
            }
        }
        {
            java.lang.Object lhsDenominator;
            lhsDenominator = this.getDenominator();
            java.lang.Object rhsDenominator;
            rhsDenominator = that.getDenominator();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "denominator", lhsDenominator), LocatorUtils.property(thatLocator, "denominator", rhsDenominator), lhsDenominator, rhsDenominator, (this.denominator!= null), (that.denominator!= null))) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(java.lang.Object object) {
        final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy2 strategy) {
        int currentHashCode = 1;
        {
            BigInteger theNumerator;
            theNumerator = this.getNumerator();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "numerator", theNumerator), currentHashCode, theNumerator, (this.numerator!= null));
        }
        {
            java.lang.Object theDenominator;
            theDenominator = this.getDenominator();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "denominator", theDenominator), currentHashCode, theDenominator, (this.denominator!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

    public RationalNumber withNumerator(BigInteger value) {
        setNumerator(value);
        return this;
    }

    public RationalNumber withDenominator(java.lang.Object value) {
        setDenominator(value);
        return this;
    }

}
