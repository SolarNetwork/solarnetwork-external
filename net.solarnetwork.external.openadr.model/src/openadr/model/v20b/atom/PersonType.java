//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.2-hudson-jaxb-ri-2.2-63- 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.02.02 at 02:58:26 PM NZDT 
//


package openadr.model.v20b.atom;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;
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
 * 
 * 				The Atom person construct is defined in section 3.2 of the format spec.
 * 			
 * 
 * <p>Java class for personType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="personType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="uri" type="{http://www.w3.org/2005/Atom}uriType" minOccurs="0"/>
 *         &lt;element name="email" type="{http://www.w3.org/2005/Atom}emailType" minOccurs="0"/>
 *         &lt;any namespace='##other'/>
 *       &lt;/choice>
 *       &lt;attGroup ref="{http://www.w3.org/2005/Atom}commonAttributes"/>
 *       &lt;anyAttribute namespace='##other'/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "personType", propOrder = {
    "namesAndUrisAndEmails"
})
public class PersonType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 1L;
    @XmlElementRefs({
        @XmlElementRef(name = "name", namespace = "http://www.w3.org/2005/Atom", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "uri", namespace = "http://www.w3.org/2005/Atom", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "email", namespace = "http://www.w3.org/2005/Atom", type = JAXBElement.class, required = false)
    })
    @XmlAnyElement(lax = true)
    protected List<Object> namesAndUrisAndEmails;
    @XmlAttribute(name = "base", namespace = "http://www.w3.org/XML/1998/namespace")
    @XmlSchemaType(name = "anyURI")
    protected String base;
    @XmlAttribute(name = "lang", namespace = "http://www.w3.org/XML/1998/namespace")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "language")
    protected String lang;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Default no-arg constructor
     * 
     */
    public PersonType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public PersonType(final List<Object> namesAndUrisAndEmails, final String base, final String lang, final Map<QName, String> otherAttributes) {
        this.namesAndUrisAndEmails = namesAndUrisAndEmails;
        this.base = base;
        this.lang = lang;
        this.otherAttributes = otherAttributes;
    }

    /**
     * Gets the value of the namesAndUrisAndEmails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the namesAndUrisAndEmails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNamesAndUrisAndEmails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link UriType }{@code >}
     * {@link Object }
     * 
     * 
     */
    public List<Object> getNamesAndUrisAndEmails() {
        if (namesAndUrisAndEmails == null) {
            namesAndUrisAndEmails = new ArrayList<Object>();
        }
        return this.namesAndUrisAndEmails;
    }

    /**
     * Gets the value of the base property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBase() {
        return base;
    }

    /**
     * Sets the value of the base property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBase(String value) {
        this.base = value;
    }

    /**
     * Gets the value of the lang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLang() {
        return lang;
    }

    /**
     * Sets the value of the lang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLang(String value) {
        this.lang = value;
    }

    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     * 
     * <p>
     * the map is keyed by the name of the attribute and 
     * the value is the string value of the attribute.
     * 
     * the map returned by this method is live, and you can add new attribute
     * by updating the map directly. Because of this design, there's no setter.
     * 
     * 
     * @return
     *     always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
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
            List<Object> theNamesAndUrisAndEmails;
            theNamesAndUrisAndEmails = (((this.namesAndUrisAndEmails!= null)&&(!this.namesAndUrisAndEmails.isEmpty()))?this.getNamesAndUrisAndEmails():null);
            strategy.appendField(locator, this, "namesAndUrisAndEmails", buffer, theNamesAndUrisAndEmails, ((this.namesAndUrisAndEmails!= null)&&(!this.namesAndUrisAndEmails.isEmpty())));
        }
        {
            String theBase;
            theBase = this.getBase();
            strategy.appendField(locator, this, "base", buffer, theBase, (this.base!= null));
        }
        {
            String theLang;
            theLang = this.getLang();
            strategy.appendField(locator, this, "lang", buffer, theLang, (this.lang!= null));
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
        final PersonType that = ((PersonType) object);
        {
            List<Object> lhsNamesAndUrisAndEmails;
            lhsNamesAndUrisAndEmails = (((this.namesAndUrisAndEmails!= null)&&(!this.namesAndUrisAndEmails.isEmpty()))?this.getNamesAndUrisAndEmails():null);
            List<Object> rhsNamesAndUrisAndEmails;
            rhsNamesAndUrisAndEmails = (((that.namesAndUrisAndEmails!= null)&&(!that.namesAndUrisAndEmails.isEmpty()))?that.getNamesAndUrisAndEmails():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "namesAndUrisAndEmails", lhsNamesAndUrisAndEmails), LocatorUtils.property(thatLocator, "namesAndUrisAndEmails", rhsNamesAndUrisAndEmails), lhsNamesAndUrisAndEmails, rhsNamesAndUrisAndEmails, ((this.namesAndUrisAndEmails!= null)&&(!this.namesAndUrisAndEmails.isEmpty())), ((that.namesAndUrisAndEmails!= null)&&(!that.namesAndUrisAndEmails.isEmpty())))) {
                return false;
            }
        }
        {
            String lhsBase;
            lhsBase = this.getBase();
            String rhsBase;
            rhsBase = that.getBase();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "base", lhsBase), LocatorUtils.property(thatLocator, "base", rhsBase), lhsBase, rhsBase, (this.base!= null), (that.base!= null))) {
                return false;
            }
        }
        {
            String lhsLang;
            lhsLang = this.getLang();
            String rhsLang;
            rhsLang = that.getLang();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lang", lhsLang), LocatorUtils.property(thatLocator, "lang", rhsLang), lhsLang, rhsLang, (this.lang!= null), (that.lang!= null))) {
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
            List<Object> theNamesAndUrisAndEmails;
            theNamesAndUrisAndEmails = (((this.namesAndUrisAndEmails!= null)&&(!this.namesAndUrisAndEmails.isEmpty()))?this.getNamesAndUrisAndEmails():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "namesAndUrisAndEmails", theNamesAndUrisAndEmails), currentHashCode, theNamesAndUrisAndEmails, ((this.namesAndUrisAndEmails!= null)&&(!this.namesAndUrisAndEmails.isEmpty())));
        }
        {
            String theBase;
            theBase = this.getBase();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "base", theBase), currentHashCode, theBase, (this.base!= null));
        }
        {
            String theLang;
            theLang = this.getLang();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lang", theLang), currentHashCode, theLang, (this.lang!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

    public PersonType withNamesAndUrisAndEmails(Object... values) {
        if (values!= null) {
            for (Object value: values) {
                getNamesAndUrisAndEmails().add(value);
            }
        }
        return this;
    }

    public PersonType withNamesAndUrisAndEmails(Collection<Object> values) {
        if (values!= null) {
            getNamesAndUrisAndEmails().addAll(values);
        }
        return this;
    }

    public PersonType withBase(String value) {
        setBase(value);
        return this;
    }

    public PersonType withLang(String value) {
        setLang(value);
        return this;
    }

}
