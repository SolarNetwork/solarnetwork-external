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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import openadr.model.v20b.atom.Feed;
import openadr.model.v20b.strm.StreamPayloadBase;
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
 * <p>Java class for oadrGBStreamPayloadBase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="oadrGBStreamPayloadBase">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ietf:params:xml:ns:icalendar-2.0:stream}StreamPayloadBaseType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.w3.org/2005/Atom}feed"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "oadrGBStreamPayloadBase", propOrder = {
    "feed"
})
public class OadrGBStreamPayloadBase
    extends StreamPayloadBase
    implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 1L;
    @XmlElement(namespace = "http://www.w3.org/2005/Atom", required = true)
    protected Feed feed;

    /**
     * Default no-arg constructor
     * 
     */
    public OadrGBStreamPayloadBase() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public OadrGBStreamPayloadBase(final Feed feed) {
        super();
        this.feed = feed;
    }

    /**
     * Gets the value of the feed property.
     * 
     * @return
     *     possible object is
     *     {@link Feed }
     *     
     */
    public Feed getFeed() {
        return feed;
    }

    /**
     * Sets the value of the feed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Feed }
     *     
     */
    public void setFeed(Feed value) {
        this.feed = value;
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
            Feed theFeed;
            theFeed = this.getFeed();
            strategy.appendField(locator, this, "feed", buffer, theFeed, (this.feed!= null));
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
        final OadrGBStreamPayloadBase that = ((OadrGBStreamPayloadBase) object);
        {
            Feed lhsFeed;
            lhsFeed = this.getFeed();
            Feed rhsFeed;
            rhsFeed = that.getFeed();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "feed", lhsFeed), LocatorUtils.property(thatLocator, "feed", rhsFeed), lhsFeed, rhsFeed, (this.feed!= null), (that.feed!= null))) {
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
            Feed theFeed;
            theFeed = this.getFeed();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "feed", theFeed), currentHashCode, theFeed, (this.feed!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

    public OadrGBStreamPayloadBase withFeed(Feed value) {
        setFeed(value);
        return this;
    }

}
