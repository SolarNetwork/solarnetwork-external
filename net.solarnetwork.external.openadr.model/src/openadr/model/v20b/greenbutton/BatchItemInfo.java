//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.2-hudson-jaxb-ri-2.2-63- 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.02.02 at 02:58:26 PM NZDT 
//


package openadr.model.v20b.greenbutton;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
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
 * Includes elements that make it possible to include multiple transactions in a single (batch) request.
 * 
 * <p>Java class for BatchItemInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BatchItemInfo">
 *   &lt;complexContent>
 *     &lt;extension base="{http://naesb.org/espi}Object">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://naesb.org/espi}HexBinary16" minOccurs="0"/>
 *         &lt;element name="operation" type="{http://naesb.org/espi}CRUDOperation" minOccurs="0"/>
 *         &lt;element name="statusCode" type="{http://naesb.org/espi}StatusCode" minOccurs="0"/>
 *         &lt;element name="statusReason" type="{http://naesb.org/espi}String256" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BatchItemInfo", propOrder = {
    "name",
    "operation",
    "statusCode",
    "statusReason"
})
@XmlRootElement(name = "BatchItemInfo")
public class BatchItemInfo
    extends openadr.model.v20b.greenbutton.Object
    implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 1L;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    protected byte[] name;
    protected String operation;
    protected String statusCode;
    protected String statusReason;

    /**
     * Default no-arg constructor
     * 
     */
    public BatchItemInfo() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public BatchItemInfo(final List<java.lang.Object> extensions, final byte[] name, final String operation, final String statusCode, final String statusReason) {
        super(extensions);
        this.name = name;
        this.operation = operation;
        this.statusCode = statusCode;
        this.statusReason = statusReason;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(byte[] value) {
        this.name = ((byte[]) value);
    }

    /**
     * Gets the value of the operation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperation() {
        return operation;
    }

    /**
     * Sets the value of the operation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperation(String value) {
        this.operation = value;
    }

    /**
     * Gets the value of the statusCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusCode() {
        return statusCode;
    }

    /**
     * Sets the value of the statusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusCode(String value) {
        this.statusCode = value;
    }

    /**
     * Gets the value of the statusReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusReason() {
        return statusReason;
    }

    /**
     * Sets the value of the statusReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusReason(String value) {
        this.statusReason = value;
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
            byte[] theName;
            theName = this.getName();
            strategy.appendField(locator, this, "name", buffer, theName, (this.name!= null));
        }
        {
            String theOperation;
            theOperation = this.getOperation();
            strategy.appendField(locator, this, "operation", buffer, theOperation, (this.operation!= null));
        }
        {
            String theStatusCode;
            theStatusCode = this.getStatusCode();
            strategy.appendField(locator, this, "statusCode", buffer, theStatusCode, (this.statusCode!= null));
        }
        {
            String theStatusReason;
            theStatusReason = this.getStatusReason();
            strategy.appendField(locator, this, "statusReason", buffer, theStatusReason, (this.statusReason!= null));
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
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final BatchItemInfo that = ((BatchItemInfo) object);
        {
            byte[] lhsName;
            lhsName = this.getName();
            byte[] rhsName;
            rhsName = that.getName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "name", lhsName), LocatorUtils.property(thatLocator, "name", rhsName), lhsName, rhsName, (this.name!= null), (that.name!= null))) {
                return false;
            }
        }
        {
            String lhsOperation;
            lhsOperation = this.getOperation();
            String rhsOperation;
            rhsOperation = that.getOperation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "operation", lhsOperation), LocatorUtils.property(thatLocator, "operation", rhsOperation), lhsOperation, rhsOperation, (this.operation!= null), (that.operation!= null))) {
                return false;
            }
        }
        {
            String lhsStatusCode;
            lhsStatusCode = this.getStatusCode();
            String rhsStatusCode;
            rhsStatusCode = that.getStatusCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "statusCode", lhsStatusCode), LocatorUtils.property(thatLocator, "statusCode", rhsStatusCode), lhsStatusCode, rhsStatusCode, (this.statusCode!= null), (that.statusCode!= null))) {
                return false;
            }
        }
        {
            String lhsStatusReason;
            lhsStatusReason = this.getStatusReason();
            String rhsStatusReason;
            rhsStatusReason = that.getStatusReason();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "statusReason", lhsStatusReason), LocatorUtils.property(thatLocator, "statusReason", rhsStatusReason), lhsStatusReason, rhsStatusReason, (this.statusReason!= null), (that.statusReason!= null))) {
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
        int currentHashCode = super.hashCode(locator, strategy);
        {
            byte[] theName;
            theName = this.getName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "name", theName), currentHashCode, theName, (this.name!= null));
        }
        {
            String theOperation;
            theOperation = this.getOperation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "operation", theOperation), currentHashCode, theOperation, (this.operation!= null));
        }
        {
            String theStatusCode;
            theStatusCode = this.getStatusCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "statusCode", theStatusCode), currentHashCode, theStatusCode, (this.statusCode!= null));
        }
        {
            String theStatusReason;
            theStatusReason = this.getStatusReason();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "statusReason", theStatusReason), currentHashCode, theStatusReason, (this.statusReason!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

    public BatchItemInfo withName(byte[] value) {
        setName(value);
        return this;
    }

    public BatchItemInfo withOperation(String value) {
        setOperation(value);
        return this;
    }

    public BatchItemInfo withStatusCode(String value) {
        setStatusCode(value);
        return this;
    }

    public BatchItemInfo withStatusReason(String value) {
        setStatusReason(value);
        return this;
    }

    @Override
    public BatchItemInfo withExtensions(java.lang.Object... values) {
        if (values!= null) {
            for (java.lang.Object value: values) {
                getExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public BatchItemInfo withExtensions(Collection<java.lang.Object> values) {
        if (values!= null) {
            getExtensions().addAll(values);
        }
        return this;
    }

}
