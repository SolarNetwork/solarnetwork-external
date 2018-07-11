//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.2-hudson-jaxb-ri-2.2-63- 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.02.02 at 04:16:30 PM NZDT 
//


package openadr.model.v20b.gml;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
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
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="location">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Polygon">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="exterior">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="LinearRing">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element ref="{http://www.opengis.net/gml/3.2}posList"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attribute ref="{http://www.opengis.net/gml/3.2}id"/>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute ref="{http://www.opengis.net/gml/3.2}id"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "location"
})
@XmlRootElement(name = "FeatureCollection")
public class FeatureCollection implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected FeatureCollection.Location location;
    @XmlAttribute(name = "id", namespace = "http://www.opengis.net/gml/3.2")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

    /**
     * Default no-arg constructor
     * 
     */
    public FeatureCollection() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public FeatureCollection(final FeatureCollection.Location location, final String id) {
        this.location = location;
        this.id = id;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link FeatureCollection.Location }
     *     
     */
    public FeatureCollection.Location getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeatureCollection.Location }
     *     
     */
    public void setLocation(FeatureCollection.Location value) {
        this.location = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
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
            FeatureCollection.Location theLocation;
            theLocation = this.getLocation();
            strategy.appendField(locator, this, "location", buffer, theLocation, (this.location!= null));
        }
        {
            String theId;
            theId = this.getId();
            strategy.appendField(locator, this, "id", buffer, theId, (this.id!= null));
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
        final FeatureCollection that = ((FeatureCollection) object);
        {
            FeatureCollection.Location lhsLocation;
            lhsLocation = this.getLocation();
            FeatureCollection.Location rhsLocation;
            rhsLocation = that.getLocation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "location", lhsLocation), LocatorUtils.property(thatLocator, "location", rhsLocation), lhsLocation, rhsLocation, (this.location!= null), (that.location!= null))) {
                return false;
            }
        }
        {
            String lhsId;
            lhsId = this.getId();
            String rhsId;
            rhsId = that.getId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "id", lhsId), LocatorUtils.property(thatLocator, "id", rhsId), lhsId, rhsId, (this.id!= null), (that.id!= null))) {
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
            FeatureCollection.Location theLocation;
            theLocation = this.getLocation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "location", theLocation), currentHashCode, theLocation, (this.location!= null));
        }
        {
            String theId;
            theId = this.getId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "id", theId), currentHashCode, theId, (this.id!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

    public FeatureCollection withLocation(FeatureCollection.Location value) {
        setLocation(value);
        return this;
    }

    public FeatureCollection withId(String value) {
        setId(value);
        return this;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Polygon">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="exterior">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="LinearRing">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element ref="{http://www.opengis.net/gml/3.2}posList"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attribute ref="{http://www.opengis.net/gml/3.2}id"/>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "polygon"
    })
    public static class Location implements Serializable, Equals2, HashCode2, ToString2
    {

        private final static long serialVersionUID = 1L;
        @XmlElement(name = "Polygon", required = true)
        protected FeatureCollection.Location.Polygon polygon;

        /**
         * Default no-arg constructor
         * 
         */
        public Location() {
            super();
        }

        /**
         * Fully-initialising value constructor
         * 
         */
        public Location(final FeatureCollection.Location.Polygon polygon) {
            this.polygon = polygon;
        }

        /**
         * Gets the value of the polygon property.
         * 
         * @return
         *     possible object is
         *     {@link FeatureCollection.Location.Polygon }
         *     
         */
        public FeatureCollection.Location.Polygon getPolygon() {
            return polygon;
        }

        /**
         * Sets the value of the polygon property.
         * 
         * @param value
         *     allowed object is
         *     {@link FeatureCollection.Location.Polygon }
         *     
         */
        public void setPolygon(FeatureCollection.Location.Polygon value) {
            this.polygon = value;
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
                FeatureCollection.Location.Polygon thePolygon;
                thePolygon = this.getPolygon();
                strategy.appendField(locator, this, "polygon", buffer, thePolygon, (this.polygon!= null));
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
            final FeatureCollection.Location that = ((FeatureCollection.Location) object);
            {
                FeatureCollection.Location.Polygon lhsPolygon;
                lhsPolygon = this.getPolygon();
                FeatureCollection.Location.Polygon rhsPolygon;
                rhsPolygon = that.getPolygon();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "polygon", lhsPolygon), LocatorUtils.property(thatLocator, "polygon", rhsPolygon), lhsPolygon, rhsPolygon, (this.polygon!= null), (that.polygon!= null))) {
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
                FeatureCollection.Location.Polygon thePolygon;
                thePolygon = this.getPolygon();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "polygon", thePolygon), currentHashCode, thePolygon, (this.polygon!= null));
            }
            return currentHashCode;
        }

        public int hashCode() {
            final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
            return this.hashCode(null, strategy);
        }

        public FeatureCollection.Location withPolygon(FeatureCollection.Location.Polygon value) {
            setPolygon(value);
            return this;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="exterior">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="LinearRing">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element ref="{http://www.opengis.net/gml/3.2}posList"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attribute ref="{http://www.opengis.net/gml/3.2}id"/>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "exterior"
        })
        public static class Polygon implements Serializable, Equals2, HashCode2, ToString2
        {

            private final static long serialVersionUID = 1L;
            @XmlElement(required = true)
            protected FeatureCollection.Location.Polygon.Exterior exterior;
            @XmlAttribute(name = "id", namespace = "http://www.opengis.net/gml/3.2")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlID
            @XmlSchemaType(name = "ID")
            protected String id;

            /**
             * Default no-arg constructor
             * 
             */
            public Polygon() {
                super();
            }

            /**
             * Fully-initialising value constructor
             * 
             */
            public Polygon(final FeatureCollection.Location.Polygon.Exterior exterior, final String id) {
                this.exterior = exterior;
                this.id = id;
            }

            /**
             * Gets the value of the exterior property.
             * 
             * @return
             *     possible object is
             *     {@link FeatureCollection.Location.Polygon.Exterior }
             *     
             */
            public FeatureCollection.Location.Polygon.Exterior getExterior() {
                return exterior;
            }

            /**
             * Sets the value of the exterior property.
             * 
             * @param value
             *     allowed object is
             *     {@link FeatureCollection.Location.Polygon.Exterior }
             *     
             */
            public void setExterior(FeatureCollection.Location.Polygon.Exterior value) {
                this.exterior = value;
            }

            /**
             * Gets the value of the id property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getId() {
                return id;
            }

            /**
             * Sets the value of the id property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setId(String value) {
                this.id = value;
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
                    FeatureCollection.Location.Polygon.Exterior theExterior;
                    theExterior = this.getExterior();
                    strategy.appendField(locator, this, "exterior", buffer, theExterior, (this.exterior!= null));
                }
                {
                    String theId;
                    theId = this.getId();
                    strategy.appendField(locator, this, "id", buffer, theId, (this.id!= null));
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
                final FeatureCollection.Location.Polygon that = ((FeatureCollection.Location.Polygon) object);
                {
                    FeatureCollection.Location.Polygon.Exterior lhsExterior;
                    lhsExterior = this.getExterior();
                    FeatureCollection.Location.Polygon.Exterior rhsExterior;
                    rhsExterior = that.getExterior();
                    if (!strategy.equals(LocatorUtils.property(thisLocator, "exterior", lhsExterior), LocatorUtils.property(thatLocator, "exterior", rhsExterior), lhsExterior, rhsExterior, (this.exterior!= null), (that.exterior!= null))) {
                        return false;
                    }
                }
                {
                    String lhsId;
                    lhsId = this.getId();
                    String rhsId;
                    rhsId = that.getId();
                    if (!strategy.equals(LocatorUtils.property(thisLocator, "id", lhsId), LocatorUtils.property(thatLocator, "id", rhsId), lhsId, rhsId, (this.id!= null), (that.id!= null))) {
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
                    FeatureCollection.Location.Polygon.Exterior theExterior;
                    theExterior = this.getExterior();
                    currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "exterior", theExterior), currentHashCode, theExterior, (this.exterior!= null));
                }
                {
                    String theId;
                    theId = this.getId();
                    currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "id", theId), currentHashCode, theId, (this.id!= null));
                }
                return currentHashCode;
            }

            public int hashCode() {
                final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
                return this.hashCode(null, strategy);
            }

            public FeatureCollection.Location.Polygon withExterior(FeatureCollection.Location.Polygon.Exterior value) {
                setExterior(value);
                return this;
            }

            public FeatureCollection.Location.Polygon withId(String value) {
                setId(value);
                return this;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="LinearRing">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element ref="{http://www.opengis.net/gml/3.2}posList"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "linearRing"
            })
            public static class Exterior implements Serializable, Equals2, HashCode2, ToString2
            {

                private final static long serialVersionUID = 1L;
                @XmlElement(name = "LinearRing", required = true)
                protected FeatureCollection.Location.Polygon.Exterior.LinearRing linearRing;

                /**
                 * Default no-arg constructor
                 * 
                 */
                public Exterior() {
                    super();
                }

                /**
                 * Fully-initialising value constructor
                 * 
                 */
                public Exterior(final FeatureCollection.Location.Polygon.Exterior.LinearRing linearRing) {
                    this.linearRing = linearRing;
                }

                /**
                 * Gets the value of the linearRing property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link FeatureCollection.Location.Polygon.Exterior.LinearRing }
                 *     
                 */
                public FeatureCollection.Location.Polygon.Exterior.LinearRing getLinearRing() {
                    return linearRing;
                }

                /**
                 * Sets the value of the linearRing property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link FeatureCollection.Location.Polygon.Exterior.LinearRing }
                 *     
                 */
                public void setLinearRing(FeatureCollection.Location.Polygon.Exterior.LinearRing value) {
                    this.linearRing = value;
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
                        FeatureCollection.Location.Polygon.Exterior.LinearRing theLinearRing;
                        theLinearRing = this.getLinearRing();
                        strategy.appendField(locator, this, "linearRing", buffer, theLinearRing, (this.linearRing!= null));
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
                    final FeatureCollection.Location.Polygon.Exterior that = ((FeatureCollection.Location.Polygon.Exterior) object);
                    {
                        FeatureCollection.Location.Polygon.Exterior.LinearRing lhsLinearRing;
                        lhsLinearRing = this.getLinearRing();
                        FeatureCollection.Location.Polygon.Exterior.LinearRing rhsLinearRing;
                        rhsLinearRing = that.getLinearRing();
                        if (!strategy.equals(LocatorUtils.property(thisLocator, "linearRing", lhsLinearRing), LocatorUtils.property(thatLocator, "linearRing", rhsLinearRing), lhsLinearRing, rhsLinearRing, (this.linearRing!= null), (that.linearRing!= null))) {
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
                        FeatureCollection.Location.Polygon.Exterior.LinearRing theLinearRing;
                        theLinearRing = this.getLinearRing();
                        currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "linearRing", theLinearRing), currentHashCode, theLinearRing, (this.linearRing!= null));
                    }
                    return currentHashCode;
                }

                public int hashCode() {
                    final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
                    return this.hashCode(null, strategy);
                }

                public FeatureCollection.Location.Polygon.Exterior withLinearRing(FeatureCollection.Location.Polygon.Exterior.LinearRing value) {
                    setLinearRing(value);
                    return this;
                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;element ref="{http://www.opengis.net/gml/3.2}posList"/>
                 *       &lt;/sequence>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "posList"
                })
                public static class LinearRing implements Serializable, Equals2, HashCode2, ToString2
                {

                    private final static long serialVersionUID = 1L;
                    @XmlList
                    @XmlElement(type = Double.class)
                    protected List<Double> posList;

                    /**
                     * Default no-arg constructor
                     * 
                     */
                    public LinearRing() {
                        super();
                    }

                    /**
                     * Fully-initialising value constructor
                     * 
                     */
                    public LinearRing(final List<Double> posList) {
                        this.posList = posList;
                    }

                    /**
                     * Gets the value of the posList property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the posList property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getPosList().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link Double }
                     * 
                     * 
                     */
                    public List<Double> getPosList() {
                        if (posList == null) {
                            posList = new ArrayList<Double>();
                        }
                        return this.posList;
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
                            List<Double> thePosList;
                            thePosList = (((this.posList!= null)&&(!this.posList.isEmpty()))?this.getPosList():null);
                            strategy.appendField(locator, this, "posList", buffer, thePosList, ((this.posList!= null)&&(!this.posList.isEmpty())));
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
                        final FeatureCollection.Location.Polygon.Exterior.LinearRing that = ((FeatureCollection.Location.Polygon.Exterior.LinearRing) object);
                        {
                            List<Double> lhsPosList;
                            lhsPosList = (((this.posList!= null)&&(!this.posList.isEmpty()))?this.getPosList():null);
                            List<Double> rhsPosList;
                            rhsPosList = (((that.posList!= null)&&(!that.posList.isEmpty()))?that.getPosList():null);
                            if (!strategy.equals(LocatorUtils.property(thisLocator, "posList", lhsPosList), LocatorUtils.property(thatLocator, "posList", rhsPosList), lhsPosList, rhsPosList, ((this.posList!= null)&&(!this.posList.isEmpty())), ((that.posList!= null)&&(!that.posList.isEmpty())))) {
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
                            List<Double> thePosList;
                            thePosList = (((this.posList!= null)&&(!this.posList.isEmpty()))?this.getPosList():null);
                            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "posList", thePosList), currentHashCode, thePosList, ((this.posList!= null)&&(!this.posList.isEmpty())));
                        }
                        return currentHashCode;
                    }

                    public int hashCode() {
                        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
                        return this.hashCode(null, strategy);
                    }

                    public FeatureCollection.Location.Polygon.Exterior.LinearRing withPosList(Double... values) {
                        if (values!= null) {
                            for (Double value: values) {
                                getPosList().add(value);
                            }
                        }
                        return this;
                    }

                    public FeatureCollection.Location.Polygon.Exterior.LinearRing withPosList(Collection<Double> values) {
                        if (values!= null) {
                            getPosList().addAll(values);
                        }
                        return this;
                    }

                }

            }

        }

    }

}