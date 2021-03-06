//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.2-hudson-jaxb-ri-2.2-63- 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.02.02 at 04:16:30 PM NZDT 
//


package openadr.model.v20b.ei;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;
import openadr.model.v20b.xcal.DateTime;
import openadr.model.v20b.xcal.DurationPropType;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the openadr.model.v20b.ei package. 
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

    private final static QName _SignalName_QNAME = new QName("http://docs.oasis-open.org/ns/energyinterop/201110", "signalName");
    private final static QName _EiReportID_QNAME = new QName("http://docs.oasis-open.org/ns/energyinterop/201110", "eiReportID");
    private final static QName _ResourceID_QNAME = new QName("http://docs.oasis-open.org/ns/energyinterop/201110", "resourceID");
    private final static QName _ReportRequestID_QNAME = new QName("http://docs.oasis-open.org/ns/energyinterop/201110", "reportRequestID");
    private final static QName _ResponseDescription_QNAME = new QName("http://docs.oasis-open.org/ns/energyinterop/201110", "responseDescription");
    private final static QName _EventStatus_QNAME = new QName("http://docs.oasis-open.org/ns/energyinterop/201110", "eventStatus");
    private final static QName _XEiRecovery_QNAME = new QName("http://docs.oasis-open.org/ns/energyinterop/201110", "x-eiRecovery");
    private final static QName _ReportDataSource_QNAME = new QName("http://docs.oasis-open.org/ns/energyinterop/201110", "reportDataSource");
    private final static QName _EiTarget_QNAME = new QName("http://docs.oasis-open.org/ns/energyinterop/201110", "eiTarget");
    private final static QName _PayloadBase_QNAME = new QName("http://docs.oasis-open.org/ns/energyinterop/201110", "payloadBase");
    private final static QName _ReadingType_QNAME = new QName("http://docs.oasis-open.org/ns/energyinterop/201110", "readingType");
    private final static QName _SignalPayload_QNAME = new QName("http://docs.oasis-open.org/ns/energyinterop/201110", "signalPayload");
    private final static QName _VenID_QNAME = new QName("http://docs.oasis-open.org/ns/energyinterop/201110", "venID");
    private final static QName _Uid_QNAME = new QName("http://docs.oasis-open.org/ns/energyinterop/201110", "uid");
    private final static QName _OptID_QNAME = new QName("http://docs.oasis-open.org/ns/energyinterop/201110", "optID");
    private final static QName _StatusDateTime_QNAME = new QName("http://docs.oasis-open.org/ns/energyinterop/201110", "statusDateTime");
    private final static QName _NumDataSources_QNAME = new QName("http://docs.oasis-open.org/ns/energyinterop/201110", "numDataSources");
    private final static QName _SignalType_QNAME = new QName("http://docs.oasis-open.org/ns/energyinterop/201110", "signalType");
    private final static QName _GroupName_QNAME = new QName("http://docs.oasis-open.org/ns/energyinterop/201110", "groupName");
    private final static QName _PartyID_QNAME = new QName("http://docs.oasis-open.org/ns/energyinterop/201110", "partyID");
    private final static QName _VtnID_QNAME = new QName("http://docs.oasis-open.org/ns/energyinterop/201110", "vtnID");
    private final static QName _RID_QNAME = new QName("http://docs.oasis-open.org/ns/energyinterop/201110", "rID");
    private final static QName _ResponseCode_QNAME = new QName("http://docs.oasis-open.org/ns/energyinterop/201110", "responseCode");
    private final static QName _CreatedDateTime_QNAME = new QName("http://docs.oasis-open.org/ns/energyinterop/201110", "createdDateTime");
    private final static QName _Accuracy_QNAME = new QName("http://docs.oasis-open.org/ns/energyinterop/201110", "accuracy");
    private final static QName _Confidence_QNAME = new QName("http://docs.oasis-open.org/ns/energyinterop/201110", "confidence");
    private final static QName _ReportSubject_QNAME = new QName("http://docs.oasis-open.org/ns/energyinterop/201110", "reportSubject");
    private final static QName _PayloadFloat_QNAME = new QName("http://docs.oasis-open.org/ns/energyinterop/201110", "payloadFloat");
    private final static QName _XEiRampUp_QNAME = new QName("http://docs.oasis-open.org/ns/energyinterop/201110", "x-eiRampUp");
    private final static QName _OptType_QNAME = new QName("http://docs.oasis-open.org/ns/energyinterop/201110", "optType");
    private final static QName _OptReason_QNAME = new QName("http://docs.oasis-open.org/ns/energyinterop/201110", "optReason");
    private final static QName _ReportName_QNAME = new QName("http://docs.oasis-open.org/ns/energyinterop/201110", "reportName");
    private final static QName _EventID_QNAME = new QName("http://docs.oasis-open.org/ns/energyinterop/201110", "eventID");
    private final static QName _XEiNotification_QNAME = new QName("http://docs.oasis-open.org/ns/energyinterop/201110", "x-eiNotification");
    private final static QName _ModificationNumber_QNAME = new QName("http://docs.oasis-open.org/ns/energyinterop/201110", "modificationNumber");
    private final static QName _ReportEnumerated_QNAME = new QName("http://docs.oasis-open.org/ns/energyinterop/201110", "reportEnumerated");
    private final static QName _GroupID_QNAME = new QName("http://docs.oasis-open.org/ns/energyinterop/201110", "groupID");
    private final static QName _OptReasonEnumerated_QNAME = new QName("http://docs.oasis-open.org/ns/energyinterop/201110", "optReasonEnumerated");
    private final static QName _RegistrationID_QNAME = new QName("http://docs.oasis-open.org/ns/energyinterop/201110", "registrationID");
    private final static QName _ReadingTypeEnumerated_QNAME = new QName("http://docs.oasis-open.org/ns/energyinterop/201110", "readingTypeEnumerated");
    private final static QName _SignalNameEnumerated_QNAME = new QName("http://docs.oasis-open.org/ns/energyinterop/201110", "SignalNameEnumerated");
    private final static QName _ReportSpecifierID_QNAME = new QName("http://docs.oasis-open.org/ns/energyinterop/201110", "reportSpecifierID");
    private final static QName _ReportType_QNAME = new QName("http://docs.oasis-open.org/ns/energyinterop/201110", "reportType");
    private final static QName _RefID_QNAME = new QName("http://docs.oasis-open.org/ns/energyinterop/201110", "refID");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: openadr.model.v20b.ei
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EventResponses }
     * 
     */
    public EventResponses createEventResponses() {
        return new EventResponses();
    }

    /**
     * Create an instance of {@link EventDescriptor }
     * 
     */
    public EventDescriptor createEventDescriptor() {
        return new EventDescriptor();
    }

    /**
     * Create an instance of {@link EiResponse }
     * 
     */
    public EiResponse createEiResponse() {
        return new EiResponse();
    }

    /**
     * Create an instance of {@link ResponseCode }
     * 
     */
    public ResponseCode createResponseCode() {
        return new ResponseCode();
    }

    /**
     * Create an instance of {@link EiTarget }
     * 
     */
    public EiTarget createEiTarget() {
        return new EiTarget();
    }

    /**
     * Create an instance of {@link Interval }
     * 
     */
    public Interval createInterval() {
        return new Interval();
    }

    /**
     * Create an instance of {@link ReportSpecifier }
     * 
     */
    public ReportSpecifier createReportSpecifier() {
        return new ReportSpecifier();
    }

    /**
     * Create an instance of {@link SpecifierPayload }
     * 
     */
    public SpecifierPayload createSpecifierPayload() {
        return new SpecifierPayload();
    }

    /**
     * Create an instance of {@link EiOptType }
     * 
     */
    public EiOptType createEiOptType() {
        return new EiOptType();
    }

    /**
     * Create an instance of {@link QualifiedEventID }
     * 
     */
    public QualifiedEventID createQualifiedEventID() {
        return new QualifiedEventID();
    }

    /**
     * Create an instance of {@link EventResponses.EventResponse }
     * 
     */
    public EventResponses.EventResponse createEventResponsesEventResponse() {
        return new EventResponses.EventResponse();
    }

    /**
     * Create an instance of {@link EventDescriptor.EiMarketContext }
     * 
     */
    public EventDescriptor.EiMarketContext createEventDescriptorEiMarketContext() {
        return new EventDescriptor.EiMarketContext();
    }

    /**
     * Create an instance of {@link EiActivePeriod }
     * 
     */
    public EiActivePeriod createEiActivePeriod() {
        return new EiActivePeriod();
    }

    /**
     * Create an instance of {@link EiEventSignal }
     * 
     */
    public EiEventSignal createEiEventSignal() {
        return new EiEventSignal();
    }

    /**
     * Create an instance of {@link CurrentValue }
     * 
     */
    public CurrentValue createCurrentValue() {
        return new CurrentValue();
    }

    /**
     * Create an instance of {@link PayloadFloatType }
     * 
     */
    public PayloadFloatType createPayloadFloatType() {
        return new PayloadFloatType();
    }

    /**
     * Create an instance of {@link EiEventSignals }
     * 
     */
    public EiEventSignals createEiEventSignals() {
        return new EiEventSignals();
    }

    /**
     * Create an instance of {@link EiEventBaseline }
     * 
     */
    public EiEventBaseline createEiEventBaseline() {
        return new EiEventBaseline();
    }

    /**
     * Create an instance of {@link SignalPayload }
     * 
     */
    public SignalPayload createSignalPayload() {
        return new SignalPayload();
    }

    /**
     * Create an instance of {@link EiEvent }
     * 
     */
    public EiEvent createEiEvent() {
        return new EiEvent();
    }

    /**
     * Create an instance of {@link Responses }
     * 
     */
    public Responses createResponses() {
        return new Responses();
    }

    /**
     * Create an instance of {@link ReportPayloadType }
     * 
     */
    public ReportPayloadType createReportPayloadType() {
        return new ReportPayloadType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/energyinterop/201110", name = "signalName")
    public JAXBElement<String> createSignalName(String value) {
        return new JAXBElement<String>(_SignalName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/energyinterop/201110", name = "eiReportID")
    public JAXBElement<String> createEiReportID(String value) {
        return new JAXBElement<String>(_EiReportID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/energyinterop/201110", name = "resourceID")
    public JAXBElement<String> createResourceID(String value) {
        return new JAXBElement<String>(_ResourceID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/energyinterop/201110", name = "reportRequestID")
    public JAXBElement<String> createReportRequestID(String value) {
        return new JAXBElement<String>(_ReportRequestID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/energyinterop/201110", name = "responseDescription")
    public JAXBElement<String> createResponseDescription(String value) {
        return new JAXBElement<String>(_ResponseDescription_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EventStatusEnumeratedType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/energyinterop/201110", name = "eventStatus")
    public JAXBElement<EventStatusEnumeratedType> createEventStatus(EventStatusEnumeratedType value) {
        return new JAXBElement<EventStatusEnumeratedType>(_EventStatus_QNAME, EventStatusEnumeratedType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DurationPropType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/energyinterop/201110", name = "x-eiRecovery")
    public JAXBElement<DurationPropType> createXEiRecovery(DurationPropType value) {
        return new JAXBElement<DurationPropType>(_XEiRecovery_QNAME, DurationPropType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EiTarget }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/energyinterop/201110", name = "reportDataSource")
    public JAXBElement<EiTarget> createReportDataSource(EiTarget value) {
        return new JAXBElement<EiTarget>(_ReportDataSource_QNAME, EiTarget.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EiTarget }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/energyinterop/201110", name = "eiTarget")
    public JAXBElement<EiTarget> createEiTarget(EiTarget value) {
        return new JAXBElement<EiTarget>(_EiTarget_QNAME, EiTarget.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PayloadBaseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/energyinterop/201110", name = "payloadBase")
    public JAXBElement<PayloadBaseType> createPayloadBase(PayloadBaseType value) {
        return new JAXBElement<PayloadBaseType>(_PayloadBase_QNAME, PayloadBaseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/energyinterop/201110", name = "readingType")
    public JAXBElement<String> createReadingType(String value) {
        return new JAXBElement<String>(_ReadingType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SignalPayload }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/energyinterop/201110", name = "signalPayload", substitutionHeadNamespace = "urn:ietf:params:xml:ns:icalendar-2.0:stream", substitutionHeadName = "streamPayloadBase")
    public JAXBElement<SignalPayload> createSignalPayload(SignalPayload value) {
        return new JAXBElement<SignalPayload>(_SignalPayload_QNAME, SignalPayload.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/energyinterop/201110", name = "venID")
    public JAXBElement<String> createVenID(String value) {
        return new JAXBElement<String>(_VenID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/energyinterop/201110", name = "uid")
    public JAXBElement<String> createUid(String value) {
        return new JAXBElement<String>(_Uid_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/energyinterop/201110", name = "optID")
    public JAXBElement<String> createOptID(String value) {
        return new JAXBElement<String>(_OptID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DateTime }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/energyinterop/201110", name = "statusDateTime")
    public JAXBElement<DateTime> createStatusDateTime(DateTime value) {
        return new JAXBElement<DateTime>(_StatusDateTime_QNAME, DateTime.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/energyinterop/201110", name = "numDataSources")
    public JAXBElement<Long> createNumDataSources(Long value) {
        return new JAXBElement<Long>(_NumDataSources_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SignalTypeEnumeratedType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/energyinterop/201110", name = "signalType")
    public JAXBElement<SignalTypeEnumeratedType> createSignalType(SignalTypeEnumeratedType value) {
        return new JAXBElement<SignalTypeEnumeratedType>(_SignalType_QNAME, SignalTypeEnumeratedType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/energyinterop/201110", name = "groupName")
    public JAXBElement<String> createGroupName(String value) {
        return new JAXBElement<String>(_GroupName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/energyinterop/201110", name = "partyID")
    public JAXBElement<String> createPartyID(String value) {
        return new JAXBElement<String>(_PartyID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/energyinterop/201110", name = "vtnID")
    public JAXBElement<String> createVtnID(String value) {
        return new JAXBElement<String>(_VtnID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/energyinterop/201110", name = "rID")
    public JAXBElement<String> createRID(String value) {
        return new JAXBElement<String>(_RID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponseCode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/energyinterop/201110", name = "responseCode")
    public JAXBElement<ResponseCode> createResponseCode(ResponseCode value) {
        return new JAXBElement<ResponseCode>(_ResponseCode_QNAME, ResponseCode.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DateTime }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/energyinterop/201110", name = "createdDateTime")
    public JAXBElement<DateTime> createCreatedDateTime(DateTime value) {
        return new JAXBElement<DateTime>(_CreatedDateTime_QNAME, DateTime.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/energyinterop/201110", name = "accuracy")
    public JAXBElement<Float> createAccuracy(Float value) {
        return new JAXBElement<Float>(_Accuracy_QNAME, Float.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/energyinterop/201110", name = "confidence")
    public JAXBElement<Long> createConfidence(Long value) {
        return new JAXBElement<Long>(_Confidence_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EiTarget }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/energyinterop/201110", name = "reportSubject")
    public JAXBElement<EiTarget> createReportSubject(EiTarget value) {
        return new JAXBElement<EiTarget>(_ReportSubject_QNAME, EiTarget.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PayloadFloatType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/energyinterop/201110", name = "payloadFloat", substitutionHeadNamespace = "http://docs.oasis-open.org/ns/energyinterop/201110", substitutionHeadName = "payloadBase")
    public JAXBElement<PayloadFloatType> createPayloadFloat(PayloadFloatType value) {
        return new JAXBElement<PayloadFloatType>(_PayloadFloat_QNAME, PayloadFloatType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DurationPropType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/energyinterop/201110", name = "x-eiRampUp")
    public JAXBElement<DurationPropType> createXEiRampUp(DurationPropType value) {
        return new JAXBElement<DurationPropType>(_XEiRampUp_QNAME, DurationPropType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OptTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/energyinterop/201110", name = "optType")
    public JAXBElement<OptTypeType> createOptType(OptTypeType value) {
        return new JAXBElement<OptTypeType>(_OptType_QNAME, OptTypeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/energyinterop/201110", name = "optReason")
    public JAXBElement<String> createOptReason(String value) {
        return new JAXBElement<String>(_OptReason_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/energyinterop/201110", name = "reportName")
    public JAXBElement<String> createReportName(String value) {
        return new JAXBElement<String>(_ReportName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/energyinterop/201110", name = "eventID")
    public JAXBElement<String> createEventID(String value) {
        return new JAXBElement<String>(_EventID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DurationPropType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/energyinterop/201110", name = "x-eiNotification")
    public JAXBElement<DurationPropType> createXEiNotification(DurationPropType value) {
        return new JAXBElement<DurationPropType>(_XEiNotification_QNAME, DurationPropType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/energyinterop/201110", name = "modificationNumber")
    public JAXBElement<Long> createModificationNumber(Long value) {
        return new JAXBElement<Long>(_ModificationNumber_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReportEnumeratedType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/energyinterop/201110", name = "reportEnumerated")
    public JAXBElement<ReportEnumeratedType> createReportEnumerated(ReportEnumeratedType value) {
        return new JAXBElement<ReportEnumeratedType>(_ReportEnumerated_QNAME, ReportEnumeratedType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/energyinterop/201110", name = "groupID")
    public JAXBElement<String> createGroupID(String value) {
        return new JAXBElement<String>(_GroupID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OptReasonEnumeratedType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/energyinterop/201110", name = "optReasonEnumerated")
    public JAXBElement<OptReasonEnumeratedType> createOptReasonEnumerated(OptReasonEnumeratedType value) {
        return new JAXBElement<OptReasonEnumeratedType>(_OptReasonEnumerated_QNAME, OptReasonEnumeratedType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/energyinterop/201110", name = "registrationID", substitutionHeadNamespace = "http://docs.oasis-open.org/ns/energyinterop/201110", substitutionHeadName = "refID")
    public JAXBElement<String> createRegistrationID(String value) {
        return new JAXBElement<String>(_RegistrationID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadingTypeEnumeratedType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/energyinterop/201110", name = "readingTypeEnumerated")
    public JAXBElement<ReadingTypeEnumeratedType> createReadingTypeEnumerated(ReadingTypeEnumeratedType value) {
        return new JAXBElement<ReadingTypeEnumeratedType>(_ReadingTypeEnumerated_QNAME, ReadingTypeEnumeratedType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/energyinterop/201110", name = "SignalNameEnumerated")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createSignalNameEnumerated(String value) {
        return new JAXBElement<String>(_SignalNameEnumerated_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/energyinterop/201110", name = "reportSpecifierID")
    public JAXBElement<String> createReportSpecifierID(String value) {
        return new JAXBElement<String>(_ReportSpecifierID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/energyinterop/201110", name = "reportType")
    public JAXBElement<String> createReportType(String value) {
        return new JAXBElement<String>(_ReportType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/energyinterop/201110", name = "refID", substitutionHeadNamespace = "http://docs.oasis-open.org/ns/energyinterop/201110", substitutionHeadName = "uid")
    public JAXBElement<String> createRefID(String value) {
        return new JAXBElement<String>(_RefID_QNAME, String.class, null, value);
    }

}
