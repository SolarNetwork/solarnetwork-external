//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.2-hudson-jaxb-ri-2.2-63- 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.02.02 at 04:16:20 PM NZDT 
//


package openadr.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SignalTypeEnumeratedType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SignalTypeEnumeratedType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="delta"/>
 *     &lt;enumeration value="level"/>
 *     &lt;enumeration value="multiplier"/>
 *     &lt;enumeration value="price"/>
 *     &lt;enumeration value="priceMultiplier"/>
 *     &lt;enumeration value="priceRelative"/>
 *     &lt;enumeration value="product"/>
 *     &lt;enumeration value="setpoint"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SignalTypeEnumeratedType")
@XmlEnum
public enum SignalTypeEnumeratedType {


    /**
     * Signal indicates the amount to change (denominated in Itembase or in the EMIX Product) from what one would have used without the Signal. This may or may not be accompanied by a baseline. Payload Type Quantity
     * 
     */
    @XmlEnumValue("delta")
    DELTA("delta"),

    /**
     * Signal indicates a Program Level. Payload Type is Program Level
     * 
     */
    @XmlEnumValue("level")
    LEVEL("level"),

    /**
     * Signal indicates a multiplier applied to the current rate of  delivery or usage (denominated in Itembase or in the EMIX Product) from what one would have used without the Signal. This may or may not be accompanied by a baseline. Payload Type is Float
     * 
     */
    @XmlEnumValue("multiplier")
    MULTIPLIER("multiplier"),

    /**
     * Signal indicates the Price. Extended Price is the value multiplied by the number of units units (denominated in Itembase or in the EMIX Product). Payload Type is emix:price
     * 
     */
    @XmlEnumValue("price")
    PRICE("price"),

    /**
     * Signal indicates the Price Multiplier. Extended Price is the computed price (as described in EMIX) the value multiplied by the number of units units (denominated in Itembase or in the EMIX Product). Payload Type is emix:priceMultiplier
     * 
     */
    @XmlEnumValue("priceMultiplier")
    PRICE_MULTIPLIER("priceMultiplier"),

    /**
     * Signal indicates the Relative Price. Extended Price is the computed price (as described in EMIX) the value multiplied by the number of units units (denominated in Itembase or in the EMIX Product). Payload Type is emix:priceRelative
     * 
     */
    @XmlEnumValue("priceRelative")
    PRICE_RELATIVE("priceRelative"),

    /**
     * Signal indicates the Product for each interval. Payload Type is an EMIX Product Description
     * 
     */
    @XmlEnumValue("product")
    PRODUCT("product"),

    /**
     * Signal indicates a target amount of units (denominated in Itembase or in the EMIX Product). Payload Type is Quantity
     * 
     */
    @XmlEnumValue("setpoint")
    SETPOINT("setpoint");
    private final String value;

    SignalTypeEnumeratedType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SignalTypeEnumeratedType fromValue(String v) {
        for (SignalTypeEnumeratedType c: SignalTypeEnumeratedType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
