//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.2-hudson-jaxb-ri-2.2-63- 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.02.02 at 04:16:30 PM NZDT 
//


package openadr.model.v20b.xmldsig;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 * <p>Java class for DSAKeyValueType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DSAKeyValueType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;sequence minOccurs="0">
 *           &lt;element name="P" type="{http://www.w3.org/2000/09/xmldsig#}CryptoBinary"/>
 *           &lt;element name="Q" type="{http://www.w3.org/2000/09/xmldsig#}CryptoBinary"/>
 *         &lt;/sequence>
 *         &lt;element name="G" type="{http://www.w3.org/2000/09/xmldsig#}CryptoBinary" minOccurs="0"/>
 *         &lt;element name="Y" type="{http://www.w3.org/2000/09/xmldsig#}CryptoBinary"/>
 *         &lt;element name="J" type="{http://www.w3.org/2000/09/xmldsig#}CryptoBinary" minOccurs="0"/>
 *         &lt;sequence minOccurs="0">
 *           &lt;element name="Seed" type="{http://www.w3.org/2000/09/xmldsig#}CryptoBinary"/>
 *           &lt;element name="PgenCounter" type="{http://www.w3.org/2000/09/xmldsig#}CryptoBinary"/>
 *         &lt;/sequence>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DSAKeyValueType", propOrder = {
    "p",
    "q",
    "g",
    "y",
    "j",
    "seed",
    "pgenCounter"
})
@XmlRootElement(name = "DSAKeyValue")
public class DSAKeyValue implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "P")
    protected byte[] p;
    @XmlElement(name = "Q")
    protected byte[] q;
    @XmlElement(name = "G")
    protected byte[] g;
    @XmlElement(name = "Y", required = true)
    protected byte[] y;
    @XmlElement(name = "J")
    protected byte[] j;
    @XmlElement(name = "Seed")
    protected byte[] seed;
    @XmlElement(name = "PgenCounter")
    protected byte[] pgenCounter;

    /**
     * Default no-arg constructor
     * 
     */
    public DSAKeyValue() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public DSAKeyValue(final byte[] p, final byte[] q, final byte[] g, final byte[] y, final byte[] j, final byte[] seed, final byte[] pgenCounter) {
        this.p = p;
        this.q = q;
        this.g = g;
        this.y = y;
        this.j = j;
        this.seed = seed;
        this.pgenCounter = pgenCounter;
    }

    /**
     * Gets the value of the p property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getP() {
        return p;
    }

    /**
     * Sets the value of the p property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setP(byte[] value) {
        this.p = ((byte[]) value);
    }

    /**
     * Gets the value of the q property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getQ() {
        return q;
    }

    /**
     * Sets the value of the q property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setQ(byte[] value) {
        this.q = ((byte[]) value);
    }

    /**
     * Gets the value of the g property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getG() {
        return g;
    }

    /**
     * Sets the value of the g property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setG(byte[] value) {
        this.g = ((byte[]) value);
    }

    /**
     * Gets the value of the y property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getY() {
        return y;
    }

    /**
     * Sets the value of the y property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setY(byte[] value) {
        this.y = ((byte[]) value);
    }

    /**
     * Gets the value of the j property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getJ() {
        return j;
    }

    /**
     * Sets the value of the j property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setJ(byte[] value) {
        this.j = ((byte[]) value);
    }

    /**
     * Gets the value of the seed property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getSeed() {
        return seed;
    }

    /**
     * Sets the value of the seed property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setSeed(byte[] value) {
        this.seed = ((byte[]) value);
    }

    /**
     * Gets the value of the pgenCounter property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getPgenCounter() {
        return pgenCounter;
    }

    /**
     * Sets the value of the pgenCounter property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setPgenCounter(byte[] value) {
        this.pgenCounter = ((byte[]) value);
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
            byte[] theP;
            theP = this.getP();
            strategy.appendField(locator, this, "p", buffer, theP, (this.p!= null));
        }
        {
            byte[] theQ;
            theQ = this.getQ();
            strategy.appendField(locator, this, "q", buffer, theQ, (this.q!= null));
        }
        {
            byte[] theG;
            theG = this.getG();
            strategy.appendField(locator, this, "g", buffer, theG, (this.g!= null));
        }
        {
            byte[] theY;
            theY = this.getY();
            strategy.appendField(locator, this, "y", buffer, theY, (this.y!= null));
        }
        {
            byte[] theJ;
            theJ = this.getJ();
            strategy.appendField(locator, this, "j", buffer, theJ, (this.j!= null));
        }
        {
            byte[] theSeed;
            theSeed = this.getSeed();
            strategy.appendField(locator, this, "seed", buffer, theSeed, (this.seed!= null));
        }
        {
            byte[] thePgenCounter;
            thePgenCounter = this.getPgenCounter();
            strategy.appendField(locator, this, "pgenCounter", buffer, thePgenCounter, (this.pgenCounter!= null));
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
        final DSAKeyValue that = ((DSAKeyValue) object);
        {
            byte[] lhsP;
            lhsP = this.getP();
            byte[] rhsP;
            rhsP = that.getP();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "p", lhsP), LocatorUtils.property(thatLocator, "p", rhsP), lhsP, rhsP, (this.p!= null), (that.p!= null))) {
                return false;
            }
        }
        {
            byte[] lhsQ;
            lhsQ = this.getQ();
            byte[] rhsQ;
            rhsQ = that.getQ();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "q", lhsQ), LocatorUtils.property(thatLocator, "q", rhsQ), lhsQ, rhsQ, (this.q!= null), (that.q!= null))) {
                return false;
            }
        }
        {
            byte[] lhsG;
            lhsG = this.getG();
            byte[] rhsG;
            rhsG = that.getG();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "g", lhsG), LocatorUtils.property(thatLocator, "g", rhsG), lhsG, rhsG, (this.g!= null), (that.g!= null))) {
                return false;
            }
        }
        {
            byte[] lhsY;
            lhsY = this.getY();
            byte[] rhsY;
            rhsY = that.getY();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "y", lhsY), LocatorUtils.property(thatLocator, "y", rhsY), lhsY, rhsY, (this.y!= null), (that.y!= null))) {
                return false;
            }
        }
        {
            byte[] lhsJ;
            lhsJ = this.getJ();
            byte[] rhsJ;
            rhsJ = that.getJ();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "j", lhsJ), LocatorUtils.property(thatLocator, "j", rhsJ), lhsJ, rhsJ, (this.j!= null), (that.j!= null))) {
                return false;
            }
        }
        {
            byte[] lhsSeed;
            lhsSeed = this.getSeed();
            byte[] rhsSeed;
            rhsSeed = that.getSeed();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "seed", lhsSeed), LocatorUtils.property(thatLocator, "seed", rhsSeed), lhsSeed, rhsSeed, (this.seed!= null), (that.seed!= null))) {
                return false;
            }
        }
        {
            byte[] lhsPgenCounter;
            lhsPgenCounter = this.getPgenCounter();
            byte[] rhsPgenCounter;
            rhsPgenCounter = that.getPgenCounter();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "pgenCounter", lhsPgenCounter), LocatorUtils.property(thatLocator, "pgenCounter", rhsPgenCounter), lhsPgenCounter, rhsPgenCounter, (this.pgenCounter!= null), (that.pgenCounter!= null))) {
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
            byte[] theP;
            theP = this.getP();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "p", theP), currentHashCode, theP, (this.p!= null));
        }
        {
            byte[] theQ;
            theQ = this.getQ();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "q", theQ), currentHashCode, theQ, (this.q!= null));
        }
        {
            byte[] theG;
            theG = this.getG();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "g", theG), currentHashCode, theG, (this.g!= null));
        }
        {
            byte[] theY;
            theY = this.getY();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "y", theY), currentHashCode, theY, (this.y!= null));
        }
        {
            byte[] theJ;
            theJ = this.getJ();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "j", theJ), currentHashCode, theJ, (this.j!= null));
        }
        {
            byte[] theSeed;
            theSeed = this.getSeed();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "seed", theSeed), currentHashCode, theSeed, (this.seed!= null));
        }
        {
            byte[] thePgenCounter;
            thePgenCounter = this.getPgenCounter();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "pgenCounter", thePgenCounter), currentHashCode, thePgenCounter, (this.pgenCounter!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

    public DSAKeyValue withP(byte[] value) {
        setP(value);
        return this;
    }

    public DSAKeyValue withQ(byte[] value) {
        setQ(value);
        return this;
    }

    public DSAKeyValue withG(byte[] value) {
        setG(value);
        return this;
    }

    public DSAKeyValue withY(byte[] value) {
        setY(value);
        return this;
    }

    public DSAKeyValue withJ(byte[] value) {
        setJ(value);
        return this;
    }

    public DSAKeyValue withSeed(byte[] value) {
        setSeed(value);
        return this;
    }

    public DSAKeyValue withPgenCounter(byte[] value) {
        setPgenCounter(value);
        return this;
    }

}