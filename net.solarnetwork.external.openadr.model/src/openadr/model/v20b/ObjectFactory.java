//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.2-hudson-jaxb-ri-2.2-63- 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.02.02 at 02:58:26 PM NZDT 
//


package openadr.model.v20b;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;
import openadr.model.v20b.ei.EiTarget;
import openadr.model.v20b.xcal.DurationPropType;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the openadr.model.v20b package. 
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

    private final static QName _OadrRequestedOadrPollFreq_QNAME = new QName("http://openadr.org/oadr-2.0b/2012/07", "oadrRequestedOadrPollFreq");
    private final static QName _OadrResponseRequired_QNAME = new QName("http://openadr.org/oadr-2.0b/2012/07", "oadrResponseRequired");
    private final static QName _OadrXmlSignature_QNAME = new QName("http://openadr.org/oadr-2.0b/2012/07", "oadrXmlSignature");
    private final static QName _Currency_QNAME = new QName("http://openadr.org/oadr-2.0b/2012/07", "currency");
    private final static QName _Temperature_QNAME = new QName("http://openadr.org/oadr-2.0b/2012/07", "temperature");
    private final static QName _Current_QNAME = new QName("http://openadr.org/oadr-2.0b/2012/07", "current");
    private final static QName _CustomUnit_QNAME = new QName("http://openadr.org/oadr-2.0b/2012/07", "customUnit");
    private final static QName _OadrVenName_QNAME = new QName("http://openadr.org/oadr-2.0b/2012/07", "oadrVenName");
    private final static QName _PulseFactor_QNAME = new QName("http://openadr.org/oadr-2.0b/2012/07", "pulseFactor");
    private final static QName _OadrGBDataDescription_QNAME = new QName("http://openadr.org/oadr-2.0b/2012/07", "oadrGBDataDescription");
    private final static QName _OadrServiceName_QNAME = new QName("http://openadr.org/oadr-2.0b/2012/07", "oadrServiceName");
    private final static QName _OadrPayloadResourceStatus_QNAME = new QName("http://openadr.org/oadr-2.0b/2012/07", "oadrPayloadResourceStatus");
    private final static QName _PulseCount_QNAME = new QName("http://openadr.org/oadr-2.0b/2012/07", "pulseCount");
    private final static QName _CurrencyPerKW_QNAME = new QName("http://openadr.org/oadr-2.0b/2012/07", "currencyPerKW");
    private final static QName _OadrReportOnly_QNAME = new QName("http://openadr.org/oadr-2.0b/2012/07", "oadrReportOnly");
    private final static QName _OadrTransportAddress_QNAME = new QName("http://openadr.org/oadr-2.0b/2012/07", "oadrTransportAddress");
    private final static QName _OadrGBPayload_QNAME = new QName("http://openadr.org/oadr-2.0b/2012/07", "oadrGBPayload");
    private final static QName _CurrencyPerThm_QNAME = new QName("http://openadr.org/oadr-2.0b/2012/07", "currencyPerThm");
    private final static QName _OadrProfileName_QNAME = new QName("http://openadr.org/oadr-2.0b/2012/07", "oadrProfileName");
    private final static QName _Frequency_QNAME = new QName("http://openadr.org/oadr-2.0b/2012/07", "frequency");
    private final static QName _OadrTransportName_QNAME = new QName("http://openadr.org/oadr-2.0b/2012/07", "oadrTransportName");
    private final static QName _OadrReportPayload_QNAME = new QName("http://openadr.org/oadr-2.0b/2012/07", "oadrReportPayload");
    private final static QName _Therm_QNAME = new QName("http://openadr.org/oadr-2.0b/2012/07", "Therm");
    private final static QName _OadrDeviceClass_QNAME = new QName("http://openadr.org/oadr-2.0b/2012/07", "oadrDeviceClass");
    private final static QName _CurrencyPerKWh_QNAME = new QName("http://openadr.org/oadr-2.0b/2012/07", "currencyPerKWh");
    private final static QName _OadrHttpPullModel_QNAME = new QName("http://openadr.org/oadr-2.0b/2012/07", "oadrHttpPullModel");
    private final static QName _OadrDataQuality_QNAME = new QName("http://openadr.org/oadr-2.0b/2012/07", "oadrDataQuality");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: openadr.model.v20b
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link OadrTransports }
     * 
     */
    public OadrTransports createOadrTransports() {
        return new OadrTransports();
    }

    /**
     * Create an instance of {@link OadrProfiles }
     * 
     */
    public OadrProfiles createOadrProfiles() {
        return new OadrProfiles();
    }

    /**
     * Create an instance of {@link OadrServiceSpecificInfo }
     * 
     */
    public OadrServiceSpecificInfo createOadrServiceSpecificInfo() {
        return new OadrServiceSpecificInfo();
    }

    /**
     * Create an instance of {@link OadrCreatedPartyRegistration }
     * 
     */
    public OadrCreatedPartyRegistration createOadrCreatedPartyRegistration() {
        return new OadrCreatedPartyRegistration();
    }

    /**
     * Create an instance of {@link OadrDistributeEvent }
     * 
     */
    public OadrDistributeEvent createOadrDistributeEvent() {
        return new OadrDistributeEvent();
    }

    /**
     * Create an instance of {@link OadrCreatedPartyRegistration.OadrExtensions }
     * 
     */
    public OadrCreatedPartyRegistration.OadrExtensions createOadrCreatedPartyRegistrationOadrExtensions() {
        return new OadrCreatedPartyRegistration.OadrExtensions();
    }

    /**
     * Create an instance of {@link OadrQueryRegistration }
     * 
     */
    public OadrQueryRegistration createOadrQueryRegistration() {
        return new OadrQueryRegistration();
    }

    /**
     * Create an instance of {@link OadrCanceledPartyRegistration }
     * 
     */
    public OadrCanceledPartyRegistration createOadrCanceledPartyRegistration() {
        return new OadrCanceledPartyRegistration();
    }

    /**
     * Create an instance of {@link OadrReportPayloadType }
     * 
     */
    public OadrReportPayloadType createOadrReportPayloadType() {
        return new OadrReportPayloadType();
    }

    /**
     * Create an instance of {@link OadrUpdatedReport }
     * 
     */
    public OadrUpdatedReport createOadrUpdatedReport() {
        return new OadrUpdatedReport();
    }

    /**
     * Create an instance of {@link OadrCancelReport }
     * 
     */
    public OadrCancelReport createOadrCancelReport() {
        return new OadrCancelReport();
    }

    /**
     * Create an instance of {@link FrequencyType }
     * 
     */
    public FrequencyType createFrequencyType() {
        return new FrequencyType();
    }

    /**
     * Create an instance of {@link OadrTransports.OadrTransport }
     * 
     */
    public OadrTransports.OadrTransport createOadrTransportsOadrTransport() {
        return new OadrTransports.OadrTransport();
    }

    /**
     * Create an instance of {@link OadrReportDescription }
     * 
     */
    public OadrReportDescription createOadrReportDescription() {
        return new OadrReportDescription();
    }

    /**
     * Create an instance of {@link OadrSamplingRate }
     * 
     */
    public OadrSamplingRate createOadrSamplingRate() {
        return new OadrSamplingRate();
    }

    /**
     * Create an instance of {@link OadrSignedObject }
     * 
     */
    public OadrSignedObject createOadrSignedObject() {
        return new OadrSignedObject();
    }

    /**
     * Create an instance of {@link OadrPoll }
     * 
     */
    public OadrPoll createOadrPoll() {
        return new OadrPoll();
    }

    /**
     * Create an instance of {@link OadrRequestReregistration }
     * 
     */
    public OadrRequestReregistration createOadrRequestReregistration() {
        return new OadrRequestReregistration();
    }

    /**
     * Create an instance of {@link OadrProfiles.OadrProfile }
     * 
     */
    public OadrProfiles.OadrProfile createOadrProfilesOadrProfile() {
        return new OadrProfiles.OadrProfile();
    }

    /**
     * Create an instance of {@link OadrServiceSpecificInfo.OadrService }
     * 
     */
    public OadrServiceSpecificInfo.OadrService createOadrServiceSpecificInfoOadrService() {
        return new OadrServiceSpecificInfo.OadrService();
    }

    /**
     * Create an instance of {@link OadrCreatePartyRegistration }
     * 
     */
    public OadrCreatePartyRegistration createOadrCreatePartyRegistration() {
        return new OadrCreatePartyRegistration();
    }

    /**
     * Create an instance of {@link OadrCancelPartyRegistration }
     * 
     */
    public OadrCancelPartyRegistration createOadrCancelPartyRegistration() {
        return new OadrCancelPartyRegistration();
    }

    /**
     * Create an instance of {@link OadrUpdateReport }
     * 
     */
    public OadrUpdateReport createOadrUpdateReport() {
        return new OadrUpdateReport();
    }

    /**
     * Create an instance of {@link OadrReport }
     * 
     */
    public OadrReport createOadrReport() {
        return new OadrReport();
    }

    /**
     * Create an instance of {@link OadrRegisteredReport }
     * 
     */
    public OadrRegisteredReport createOadrRegisteredReport() {
        return new OadrRegisteredReport();
    }

    /**
     * Create an instance of {@link OadrReportRequest }
     * 
     */
    public OadrReportRequest createOadrReportRequest() {
        return new OadrReportRequest();
    }

    /**
     * Create an instance of {@link OadrRegisterReport }
     * 
     */
    public OadrRegisterReport createOadrRegisterReport() {
        return new OadrRegisterReport();
    }

    /**
     * Create an instance of {@link OadrCreatedReport }
     * 
     */
    public OadrCreatedReport createOadrCreatedReport() {
        return new OadrCreatedReport();
    }

    /**
     * Create an instance of {@link OadrPendingReports }
     * 
     */
    public OadrPendingReports createOadrPendingReports() {
        return new OadrPendingReports();
    }

    /**
     * Create an instance of {@link OadrCreateReport }
     * 
     */
    public OadrCreateReport createOadrCreateReport() {
        return new OadrCreateReport();
    }

    /**
     * Create an instance of {@link OadrCanceledReport }
     * 
     */
    public OadrCanceledReport createOadrCanceledReport() {
        return new OadrCanceledReport();
    }

    /**
     * Create an instance of {@link OadrCreatedOpt }
     * 
     */
    public OadrCreatedOpt createOadrCreatedOpt() {
        return new OadrCreatedOpt();
    }

    /**
     * Create an instance of {@link OadrCreateOpt }
     * 
     */
    public OadrCreateOpt createOadrCreateOpt() {
        return new OadrCreateOpt();
    }

    /**
     * Create an instance of {@link OadrCanceledOpt }
     * 
     */
    public OadrCanceledOpt createOadrCanceledOpt() {
        return new OadrCanceledOpt();
    }

    /**
     * Create an instance of {@link OadrCancelOpt }
     * 
     */
    public OadrCancelOpt createOadrCancelOpt() {
        return new OadrCancelOpt();
    }

    /**
     * Create an instance of {@link OadrResponse }
     * 
     */
    public OadrResponse createOadrResponse() {
        return new OadrResponse();
    }

    /**
     * Create an instance of {@link OadrRequestEvent }
     * 
     */
    public OadrRequestEvent createOadrRequestEvent() {
        return new OadrRequestEvent();
    }

    /**
     * Create an instance of {@link OadrCreatedEvent }
     * 
     */
    public OadrCreatedEvent createOadrCreatedEvent() {
        return new OadrCreatedEvent();
    }

    /**
     * Create an instance of {@link OadrDistributeEvent.OadrEvent }
     * 
     */
    public OadrDistributeEvent.OadrEvent createOadrDistributeEventOadrEvent() {
        return new OadrDistributeEvent.OadrEvent();
    }

    /**
     * Create an instance of {@link CurrencyType }
     * 
     */
    public CurrencyType createCurrencyType() {
        return new CurrencyType();
    }

    /**
     * Create an instance of {@link ThermType }
     * 
     */
    public ThermType createThermType() {
        return new ThermType();
    }

    /**
     * Create an instance of {@link BaseUnitType }
     * 
     */
    public BaseUnitType createBaseUnitType() {
        return new BaseUnitType();
    }

    /**
     * Create an instance of {@link OadrGBItemBase }
     * 
     */
    public OadrGBItemBase createOadrGBItemBase() {
        return new OadrGBItemBase();
    }

    /**
     * Create an instance of {@link OadrInfo }
     * 
     */
    public OadrInfo createOadrInfo() {
        return new OadrInfo();
    }

    /**
     * Create an instance of {@link OadrLoadControlState }
     * 
     */
    public OadrLoadControlState createOadrLoadControlState() {
        return new OadrLoadControlState();
    }

    /**
     * Create an instance of {@link OadrLoadControlStateTypeType }
     * 
     */
    public OadrLoadControlStateTypeType createOadrLoadControlStateTypeType() {
        return new OadrLoadControlStateTypeType();
    }

    /**
     * Create an instance of {@link CurrentType }
     * 
     */
    public CurrentType createCurrentType() {
        return new CurrentType();
    }

    /**
     * Create an instance of {@link OadrGBStreamPayloadBase }
     * 
     */
    public OadrGBStreamPayloadBase createOadrGBStreamPayloadBase() {
        return new OadrGBStreamPayloadBase();
    }

    /**
     * Create an instance of {@link TemperatureType }
     * 
     */
    public TemperatureType createTemperatureType() {
        return new TemperatureType();
    }

    /**
     * Create an instance of {@link OadrPayload }
     * 
     */
    public OadrPayload createOadrPayload() {
        return new OadrPayload();
    }

    /**
     * Create an instance of {@link PulseCountType }
     * 
     */
    public PulseCountType createPulseCountType() {
        return new PulseCountType();
    }

    /**
     * Create an instance of {@link OadrPayloadResourceStatusType }
     * 
     */
    public OadrPayloadResourceStatusType createOadrPayloadResourceStatusType() {
        return new OadrPayloadResourceStatusType();
    }

    /**
     * Create an instance of {@link OadrCreatedPartyRegistration.OadrExtensions.OadrExtension }
     * 
     */
    public OadrCreatedPartyRegistration.OadrExtensions.OadrExtension createOadrCreatedPartyRegistrationOadrExtensionsOadrExtension() {
        return new OadrCreatedPartyRegistration.OadrExtensions.OadrExtension();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DurationPropType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://openadr.org/oadr-2.0b/2012/07", name = "oadrRequestedOadrPollFreq")
    public JAXBElement<DurationPropType> createOadrRequestedOadrPollFreq(DurationPropType value) {
        return new JAXBElement<DurationPropType>(_OadrRequestedOadrPollFreq_QNAME, DurationPropType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponseRequiredType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://openadr.org/oadr-2.0b/2012/07", name = "oadrResponseRequired")
    public JAXBElement<ResponseRequiredType> createOadrResponseRequired(ResponseRequiredType value) {
        return new JAXBElement<ResponseRequiredType>(_OadrResponseRequired_QNAME, ResponseRequiredType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://openadr.org/oadr-2.0b/2012/07", name = "oadrXmlSignature")
    public JAXBElement<Boolean> createOadrXmlSignature(Boolean value) {
        return new JAXBElement<Boolean>(_OadrXmlSignature_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CurrencyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://openadr.org/oadr-2.0b/2012/07", name = "currency", substitutionHeadNamespace = "http://docs.oasis-open.org/ns/emix/2011/06", substitutionHeadName = "itemBase")
    public JAXBElement<CurrencyType> createCurrency(CurrencyType value) {
        return new JAXBElement<CurrencyType>(_Currency_QNAME, CurrencyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TemperatureType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://openadr.org/oadr-2.0b/2012/07", name = "temperature", substitutionHeadNamespace = "http://docs.oasis-open.org/ns/emix/2011/06", substitutionHeadName = "itemBase")
    public JAXBElement<TemperatureType> createTemperature(TemperatureType value) {
        return new JAXBElement<TemperatureType>(_Temperature_QNAME, TemperatureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CurrentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://openadr.org/oadr-2.0b/2012/07", name = "current", substitutionHeadNamespace = "http://docs.oasis-open.org/ns/emix/2011/06", substitutionHeadName = "itemBase")
    public JAXBElement<CurrentType> createCurrent(CurrentType value) {
        return new JAXBElement<CurrentType>(_Current_QNAME, CurrentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseUnitType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://openadr.org/oadr-2.0b/2012/07", name = "customUnit", substitutionHeadNamespace = "http://docs.oasis-open.org/ns/emix/2011/06", substitutionHeadName = "itemBase")
    public JAXBElement<BaseUnitType> createCustomUnit(BaseUnitType value) {
        return new JAXBElement<BaseUnitType>(_CustomUnit_QNAME, BaseUnitType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://openadr.org/oadr-2.0b/2012/07", name = "oadrVenName")
    public JAXBElement<String> createOadrVenName(String value) {
        return new JAXBElement<String>(_OadrVenName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://openadr.org/oadr-2.0b/2012/07", name = "pulseFactor")
    public JAXBElement<Float> createPulseFactor(Float value) {
        return new JAXBElement<Float>(_PulseFactor_QNAME, Float.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OadrGBItemBase }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://openadr.org/oadr-2.0b/2012/07", name = "oadrGBDataDescription", substitutionHeadNamespace = "http://docs.oasis-open.org/ns/emix/2011/06", substitutionHeadName = "itemBase")
    public JAXBElement<OadrGBItemBase> createOadrGBDataDescription(OadrGBItemBase value) {
        return new JAXBElement<OadrGBItemBase>(_OadrGBDataDescription_QNAME, OadrGBItemBase.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OadrServiceNameType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://openadr.org/oadr-2.0b/2012/07", name = "oadrServiceName")
    public JAXBElement<OadrServiceNameType> createOadrServiceName(OadrServiceNameType value) {
        return new JAXBElement<OadrServiceNameType>(_OadrServiceName_QNAME, OadrServiceNameType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OadrPayloadResourceStatusType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://openadr.org/oadr-2.0b/2012/07", name = "oadrPayloadResourceStatus", substitutionHeadNamespace = "http://docs.oasis-open.org/ns/energyinterop/201110", substitutionHeadName = "payloadBase")
    public JAXBElement<OadrPayloadResourceStatusType> createOadrPayloadResourceStatus(OadrPayloadResourceStatusType value) {
        return new JAXBElement<OadrPayloadResourceStatusType>(_OadrPayloadResourceStatus_QNAME, OadrPayloadResourceStatusType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PulseCountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://openadr.org/oadr-2.0b/2012/07", name = "pulseCount", substitutionHeadNamespace = "http://docs.oasis-open.org/ns/emix/2011/06", substitutionHeadName = "itemBase")
    public JAXBElement<PulseCountType> createPulseCount(PulseCountType value) {
        return new JAXBElement<PulseCountType>(_PulseCount_QNAME, PulseCountType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CurrencyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://openadr.org/oadr-2.0b/2012/07", name = "currencyPerKW", substitutionHeadNamespace = "http://docs.oasis-open.org/ns/emix/2011/06", substitutionHeadName = "itemBase")
    public JAXBElement<CurrencyType> createCurrencyPerKW(CurrencyType value) {
        return new JAXBElement<CurrencyType>(_CurrencyPerKW_QNAME, CurrencyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://openadr.org/oadr-2.0b/2012/07", name = "oadrReportOnly")
    public JAXBElement<Boolean> createOadrReportOnly(Boolean value) {
        return new JAXBElement<Boolean>(_OadrReportOnly_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://openadr.org/oadr-2.0b/2012/07", name = "oadrTransportAddress")
    public JAXBElement<String> createOadrTransportAddress(String value) {
        return new JAXBElement<String>(_OadrTransportAddress_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OadrGBStreamPayloadBase }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://openadr.org/oadr-2.0b/2012/07", name = "oadrGBPayload", substitutionHeadNamespace = "urn:ietf:params:xml:ns:icalendar-2.0:stream", substitutionHeadName = "streamPayloadBase")
    public JAXBElement<OadrGBStreamPayloadBase> createOadrGBPayload(OadrGBStreamPayloadBase value) {
        return new JAXBElement<OadrGBStreamPayloadBase>(_OadrGBPayload_QNAME, OadrGBStreamPayloadBase.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CurrencyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://openadr.org/oadr-2.0b/2012/07", name = "currencyPerThm", substitutionHeadNamespace = "http://docs.oasis-open.org/ns/emix/2011/06", substitutionHeadName = "itemBase")
    public JAXBElement<CurrencyType> createCurrencyPerThm(CurrencyType value) {
        return new JAXBElement<CurrencyType>(_CurrencyPerThm_QNAME, CurrencyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://openadr.org/oadr-2.0b/2012/07", name = "oadrProfileName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createOadrProfileName(String value) {
        return new JAXBElement<String>(_OadrProfileName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FrequencyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://openadr.org/oadr-2.0b/2012/07", name = "frequency", substitutionHeadNamespace = "http://docs.oasis-open.org/ns/emix/2011/06", substitutionHeadName = "itemBase")
    public JAXBElement<FrequencyType> createFrequency(FrequencyType value) {
        return new JAXBElement<FrequencyType>(_Frequency_QNAME, FrequencyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OadrTransportType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://openadr.org/oadr-2.0b/2012/07", name = "oadrTransportName")
    public JAXBElement<OadrTransportType> createOadrTransportName(OadrTransportType value) {
        return new JAXBElement<OadrTransportType>(_OadrTransportName_QNAME, OadrTransportType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OadrReportPayloadType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://openadr.org/oadr-2.0b/2012/07", name = "oadrReportPayload", substitutionHeadNamespace = "urn:ietf:params:xml:ns:icalendar-2.0:stream", substitutionHeadName = "streamPayloadBase")
    public JAXBElement<OadrReportPayloadType> createOadrReportPayload(OadrReportPayloadType value) {
        return new JAXBElement<OadrReportPayloadType>(_OadrReportPayload_QNAME, OadrReportPayloadType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ThermType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://openadr.org/oadr-2.0b/2012/07", name = "Therm", substitutionHeadNamespace = "http://docs.oasis-open.org/ns/emix/2011/06", substitutionHeadName = "itemBase")
    public JAXBElement<ThermType> createTherm(ThermType value) {
        return new JAXBElement<ThermType>(_Therm_QNAME, ThermType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EiTarget }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://openadr.org/oadr-2.0b/2012/07", name = "oadrDeviceClass")
    public JAXBElement<EiTarget> createOadrDeviceClass(EiTarget value) {
        return new JAXBElement<EiTarget>(_OadrDeviceClass_QNAME, EiTarget.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CurrencyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://openadr.org/oadr-2.0b/2012/07", name = "currencyPerKWh", substitutionHeadNamespace = "http://docs.oasis-open.org/ns/emix/2011/06", substitutionHeadName = "itemBase")
    public JAXBElement<CurrencyType> createCurrencyPerKWh(CurrencyType value) {
        return new JAXBElement<CurrencyType>(_CurrencyPerKWh_QNAME, CurrencyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://openadr.org/oadr-2.0b/2012/07", name = "oadrHttpPullModel")
    public JAXBElement<Boolean> createOadrHttpPullModel(Boolean value) {
        return new JAXBElement<Boolean>(_OadrHttpPullModel_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://openadr.org/oadr-2.0b/2012/07", name = "oadrDataQuality")
    public JAXBElement<String> createOadrDataQuality(String value) {
        return new JAXBElement<String>(_OadrDataQuality_QNAME, String.class, null, value);
    }

}
