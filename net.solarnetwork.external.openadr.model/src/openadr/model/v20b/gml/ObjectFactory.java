//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.2-hudson-jaxb-ri-2.2-63- 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.02.02 at 04:16:30 PM NZDT 
//


package openadr.model.v20b.gml;

import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the openadr.model.v20b.gml package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _PosList_QNAME = new QName("http://www.opengis.net/gml/3.2", "posList");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: openadr.model.v20b.gml
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FeatureCollection }
     * 
     */
    public FeatureCollection createFeatureCollection() {
        return new FeatureCollection();
    }

    /**
     * Create an instance of {@link FeatureCollection.Location }
     * 
     */
    public FeatureCollection.Location createFeatureCollectionLocation() {
        return new FeatureCollection.Location();
    }

    /**
     * Create an instance of {@link FeatureCollection.Location.Polygon }
     * 
     */
    public FeatureCollection.Location.Polygon createFeatureCollectionLocationPolygon() {
        return new FeatureCollection.Location.Polygon();
    }

    /**
     * Create an instance of {@link FeatureCollection.Location.Polygon.Exterior }
     * 
     */
    public FeatureCollection.Location.Polygon.Exterior createFeatureCollectionLocationPolygonExterior() {
        return new FeatureCollection.Location.Polygon.Exterior();
    }

    /**
     * Create an instance of {@link FeatureCollection.Location.Polygon.Exterior.LinearRing }
     * 
     */
    public FeatureCollection.Location.Polygon.Exterior.LinearRing createFeatureCollectionLocationPolygonExteriorLinearRing() {
        return new FeatureCollection.Location.Polygon.Exterior.LinearRing();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link Double }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "posList")
    public JAXBElement<List<Double>> createPosList(List<Double> value) {
        return new JAXBElement<List<Double>>(_PosList_QNAME, ((Class) List.class), null, ((List<Double> ) value));
    }

}
