
package org.jco.jaxws.client;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.jco.jaxws.client package. 
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

    private final static QName _FacturaGeneral_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "FacturaGeneral");
    private final static QName _ArrayOfAnticipos_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "ArrayOfAnticipos");
    private final static QName _Anticipos_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "Anticipos");
    private final static QName _ArrayOfExtensible_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "ArrayOfExtensible");
    private final static QName _Extensible_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "Extensible");
    private final static QName _Autorizado_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "Autorizado");
    private final static QName _Direccion_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "Direccion");
    private final static QName _ArrayOfCoordenadas_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "ArrayOfCoordenadas");
    private final static QName _Coordenadas_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "Coordenadas");
    private final static QName _ArrayOfCargosDescuentos_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "ArrayOfCargosDescuentos");
    private final static QName _CargosDescuentos_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "CargosDescuentos");
    private final static QName _Cliente_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "Cliente");
    private final static QName _ArrayOfDestinatario_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "ArrayOfDestinatario");
    private final static QName _Destinatario_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "Destinatario");
    private final static QName _ArrayOfTributos_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "ArrayOfTributos");
    private final static QName _Tributos_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "Tributos");
    private final static QName _InformacionLegal_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "InformacionLegal");
    private final static QName _ArrayOfObligaciones_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "ArrayOfObligaciones");
    private final static QName _Obligaciones_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "Obligaciones");
    private final static QName _ArrayOfCondicionDePago_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "ArrayOfCondicionDePago");
    private final static QName _CondicionDePago_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "CondicionDePago");
    private final static QName _ArrayOfFacturaDetalle_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "ArrayOfFacturaDetalle");
    private final static QName _FacturaDetalle_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "FacturaDetalle");
    private final static QName _ArrayOfDocumentoReferenciado_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "ArrayOfDocumentoReferenciado");
    private final static QName _DocumentoReferenciado_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "DocumentoReferenciado");
    private final static QName _ArrayOfFacturaImpuestos_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "ArrayOfFacturaImpuestos");
    private final static QName _FacturaImpuestos_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "FacturaImpuestos");
    private final static QName _ArrayOfImpuestosTotales_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "ArrayOfImpuestosTotales");
    private final static QName _ImpuestosTotales_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "ImpuestosTotales");
    private final static QName _ArrayOfLineaInformacionAdicional_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "ArrayOfLineaInformacionAdicional");
    private final static QName _LineaInformacionAdicional_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "LineaInformacionAdicional");
    private final static QName _Entrega_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "Entrega");
    private final static QName _DatosDelTransportista_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "DatosDelTransportista");
    private final static QName _ArrayOfExtras_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "ArrayOfExtras");
    private final static QName _Extras_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "Extras");
    private final static QName _ArrayOfMediosDePago_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "ArrayOfMediosDePago");
    private final static QName _MediosDePago_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "MediosDePago");
    private final static QName _ArrayOfOrdenDeCompra_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "ArrayOfOrdenDeCompra");
    private final static QName _OrdenDeCompra_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "OrdenDeCompra");
    private final static QName _TasaDeCambio_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "TasaDeCambio");
    private final static QName _TasaDeCambioAlternativa_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "TasaDeCambioAlternativa");
    private final static QName _TerminosDeEntrega_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "TerminosDeEntrega");
    private final static QName _ArrayOfHistorialDeEntrega_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "ArrayOfHistorialDeEntrega");
    private final static QName _HistorialDeEntrega_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "HistorialDeEntrega");
    private final static QName _DatosEvento_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "DatosEvento");
    private final static QName _ArrayOfDatosExtras_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "ArrayOfDatosExtras");
    private final static QName _DatosExtras_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "DatosExtras");
    private final static QName _ArrayOfstring_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOfstring");
    private final static QName _DocumentResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", "DocumentResponse");
    private final static QName _DocumentStatusResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", "DocumentStatusResponse");
    private final static QName _SendEmailResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", "SendEmailResponse");
    private final static QName _DownloadPDFResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", "DownloadPDFResponse");
    private final static QName _DownloadXMLResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", "DownloadXMLResponse");
    private final static QName _FoliosRemainingResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", "FoliosRemainingResponse");
    private final static QName _LoadCertificateResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", "LoadCertificateResponse");
    private final static QName _EventoResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", "EventoResponse");
    private final static QName _DescargarEventoResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", "DescargarEventoResponse");
    private final static QName _ContenedorResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", "ContenedorResponse");
    private final static QName _ArrayOfEvento_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.Models.Response", "ArrayOfEvento");
    private final static QName _Evento_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.Models.Response", "Evento");
    private final static QName _ArrayOfExtrasEvento_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.Models.Response", "ArrayOfExtrasEvento");
    private final static QName _ExtrasEvento_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.Models.Response", "ExtrasEvento");
    private final static QName _AnyType_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyType");
    private final static QName _AnyURI_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyURI");
    private final static QName _Base64Binary_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "base64Binary");
    private final static QName _Boolean_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "boolean");
    private final static QName _Byte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "byte");
    private final static QName _DateTime_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "dateTime");
    private final static QName _Decimal_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "decimal");
    private final static QName _Double_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "double");
    private final static QName _Float_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "float");
    private final static QName _Int_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "int");
    private final static QName _Long_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "long");
    private final static QName _QName_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "QName");
    private final static QName _Short_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "short");
    private final static QName _String_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "string");
    private final static QName _UnsignedByte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedByte");
    private final static QName _UnsignedInt_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedInt");
    private final static QName _UnsignedLong_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedLong");
    private final static QName _UnsignedShort_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedShort");
    private final static QName _Char_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "char");
    private final static QName _Duration_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "duration");
    private final static QName _Guid_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "guid");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.jco.jaxws.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Enviar }
     * 
     */
    public Enviar createEnviar() {
        return new Enviar();
    }

    /**
     * Create an instance of {@link FacturaGeneral }
     * 
     */
    public FacturaGeneral createFacturaGeneral() {
        return new FacturaGeneral();
    }

    /**
     * Create an instance of {@link EnviarResponse }
     * 
     */
    public EnviarResponse createEnviarResponse() {
        return new EnviarResponse();
    }

    /**
     * Create an instance of {@link DocumentResponse }
     * 
     */
    public DocumentResponse createDocumentResponse() {
        return new DocumentResponse();
    }

    /**
     * Create an instance of {@link EstadoDocumento }
     * 
     */
    public EstadoDocumento createEstadoDocumento() {
        return new EstadoDocumento();
    }

    /**
     * Create an instance of {@link EstadoDocumentoResponse }
     * 
     */
    public EstadoDocumentoResponse createEstadoDocumentoResponse() {
        return new EstadoDocumentoResponse();
    }

    /**
     * Create an instance of {@link DocumentStatusResponse }
     * 
     */
    public DocumentStatusResponse createDocumentStatusResponse() {
        return new DocumentStatusResponse();
    }

    /**
     * Create an instance of {@link EnvioCorreo }
     * 
     */
    public EnvioCorreo createEnvioCorreo() {
        return new EnvioCorreo();
    }

    /**
     * Create an instance of {@link EnvioCorreoResponse }
     * 
     */
    public EnvioCorreoResponse createEnvioCorreoResponse() {
        return new EnvioCorreoResponse();
    }

    /**
     * Create an instance of {@link SendEmailResponse }
     * 
     */
    public SendEmailResponse createSendEmailResponse() {
        return new SendEmailResponse();
    }

    /**
     * Create an instance of {@link DescargaPDF }
     * 
     */
    public DescargaPDF createDescargaPDF() {
        return new DescargaPDF();
    }

    /**
     * Create an instance of {@link DescargaPDFResponse }
     * 
     */
    public DescargaPDFResponse createDescargaPDFResponse() {
        return new DescargaPDFResponse();
    }

    /**
     * Create an instance of {@link DownloadPDFResponse }
     * 
     */
    public DownloadPDFResponse createDownloadPDFResponse() {
        return new DownloadPDFResponse();
    }

    /**
     * Create an instance of {@link DescargaXML }
     * 
     */
    public DescargaXML createDescargaXML() {
        return new DescargaXML();
    }

    /**
     * Create an instance of {@link DescargaXMLResponse }
     * 
     */
    public DescargaXMLResponse createDescargaXMLResponse() {
        return new DescargaXMLResponse();
    }

    /**
     * Create an instance of {@link DownloadXMLResponse }
     * 
     */
    public DownloadXMLResponse createDownloadXMLResponse() {
        return new DownloadXMLResponse();
    }

    /**
     * Create an instance of {@link FoliosRestantes }
     * 
     */
    public FoliosRestantes createFoliosRestantes() {
        return new FoliosRestantes();
    }

    /**
     * Create an instance of {@link FoliosRestantesResponse }
     * 
     */
    public FoliosRestantesResponse createFoliosRestantesResponse() {
        return new FoliosRestantesResponse();
    }

    /**
     * Create an instance of {@link FoliosRemainingResponse }
     * 
     */
    public FoliosRemainingResponse createFoliosRemainingResponse() {
        return new FoliosRemainingResponse();
    }

    /**
     * Create an instance of {@link CargarCertificado }
     * 
     */
    public CargarCertificado createCargarCertificado() {
        return new CargarCertificado();
    }

    /**
     * Create an instance of {@link CargarCertificadoResponse }
     * 
     */
    public CargarCertificadoResponse createCargarCertificadoResponse() {
        return new CargarCertificadoResponse();
    }

    /**
     * Create an instance of {@link LoadCertificateResponse }
     * 
     */
    public LoadCertificateResponse createLoadCertificateResponse() {
        return new LoadCertificateResponse();
    }

    /**
     * Create an instance of {@link GenerarEvento }
     * 
     */
    public GenerarEvento createGenerarEvento() {
        return new GenerarEvento();
    }

    /**
     * Create an instance of {@link DatosEvento }
     * 
     */
    public DatosEvento createDatosEvento() {
        return new DatosEvento();
    }

    /**
     * Create an instance of {@link GenerarEventoResponse }
     * 
     */
    public GenerarEventoResponse createGenerarEventoResponse() {
        return new GenerarEventoResponse();
    }

    /**
     * Create an instance of {@link EventoResponse }
     * 
     */
    public EventoResponse createEventoResponse() {
        return new EventoResponse();
    }

    /**
     * Create an instance of {@link DescargarEventoXML }
     * 
     */
    public DescargarEventoXML createDescargarEventoXML() {
        return new DescargarEventoXML();
    }

    /**
     * Create an instance of {@link DescargarEventoXMLResponse }
     * 
     */
    public DescargarEventoXMLResponse createDescargarEventoXMLResponse() {
        return new DescargarEventoXMLResponse();
    }

    /**
     * Create an instance of {@link DescargarEventoResponse }
     * 
     */
    public DescargarEventoResponse createDescargarEventoResponse() {
        return new DescargarEventoResponse();
    }

    /**
     * Create an instance of {@link GenerarContenedor }
     * 
     */
    public GenerarContenedor createGenerarContenedor() {
        return new GenerarContenedor();
    }

    /**
     * Create an instance of {@link GenerarContenedorResponse }
     * 
     */
    public GenerarContenedorResponse createGenerarContenedorResponse() {
        return new GenerarContenedorResponse();
    }

    /**
     * Create an instance of {@link ContenedorResponse }
     * 
     */
    public ContenedorResponse createContenedorResponse() {
        return new ContenedorResponse();
    }

    /**
     * Create an instance of {@link ArrayOfAnticipos }
     * 
     */
    public ArrayOfAnticipos createArrayOfAnticipos() {
        return new ArrayOfAnticipos();
    }

    /**
     * Create an instance of {@link Anticipos }
     * 
     */
    public Anticipos createAnticipos() {
        return new Anticipos();
    }

    /**
     * Create an instance of {@link ArrayOfExtensible }
     * 
     */
    public ArrayOfExtensible createArrayOfExtensible() {
        return new ArrayOfExtensible();
    }

    /**
     * Create an instance of {@link Extensible }
     * 
     */
    public Extensible createExtensible() {
        return new Extensible();
    }

    /**
     * Create an instance of {@link Autorizado }
     * 
     */
    public Autorizado createAutorizado() {
        return new Autorizado();
    }

    /**
     * Create an instance of {@link Direccion }
     * 
     */
    public Direccion createDireccion() {
        return new Direccion();
    }

    /**
     * Create an instance of {@link ArrayOfCoordenadas }
     * 
     */
    public ArrayOfCoordenadas createArrayOfCoordenadas() {
        return new ArrayOfCoordenadas();
    }

    /**
     * Create an instance of {@link Coordenadas }
     * 
     */
    public Coordenadas createCoordenadas() {
        return new Coordenadas();
    }

    /**
     * Create an instance of {@link ArrayOfCargosDescuentos }
     * 
     */
    public ArrayOfCargosDescuentos createArrayOfCargosDescuentos() {
        return new ArrayOfCargosDescuentos();
    }

    /**
     * Create an instance of {@link CargosDescuentos }
     * 
     */
    public CargosDescuentos createCargosDescuentos() {
        return new CargosDescuentos();
    }

    /**
     * Create an instance of {@link Cliente }
     * 
     */
    public Cliente createCliente() {
        return new Cliente();
    }

    /**
     * Create an instance of {@link ArrayOfDestinatario }
     * 
     */
    public ArrayOfDestinatario createArrayOfDestinatario() {
        return new ArrayOfDestinatario();
    }

    /**
     * Create an instance of {@link Destinatario }
     * 
     */
    public Destinatario createDestinatario() {
        return new Destinatario();
    }

    /**
     * Create an instance of {@link ArrayOfTributos }
     * 
     */
    public ArrayOfTributos createArrayOfTributos() {
        return new ArrayOfTributos();
    }

    /**
     * Create an instance of {@link Tributos }
     * 
     */
    public Tributos createTributos() {
        return new Tributos();
    }

    /**
     * Create an instance of {@link InformacionLegal }
     * 
     */
    public InformacionLegal createInformacionLegal() {
        return new InformacionLegal();
    }

    /**
     * Create an instance of {@link ArrayOfObligaciones }
     * 
     */
    public ArrayOfObligaciones createArrayOfObligaciones() {
        return new ArrayOfObligaciones();
    }

    /**
     * Create an instance of {@link Obligaciones }
     * 
     */
    public Obligaciones createObligaciones() {
        return new Obligaciones();
    }

    /**
     * Create an instance of {@link ArrayOfCondicionDePago }
     * 
     */
    public ArrayOfCondicionDePago createArrayOfCondicionDePago() {
        return new ArrayOfCondicionDePago();
    }

    /**
     * Create an instance of {@link CondicionDePago }
     * 
     */
    public CondicionDePago createCondicionDePago() {
        return new CondicionDePago();
    }

    /**
     * Create an instance of {@link ArrayOfFacturaDetalle }
     * 
     */
    public ArrayOfFacturaDetalle createArrayOfFacturaDetalle() {
        return new ArrayOfFacturaDetalle();
    }

    /**
     * Create an instance of {@link FacturaDetalle }
     * 
     */
    public FacturaDetalle createFacturaDetalle() {
        return new FacturaDetalle();
    }

    /**
     * Create an instance of {@link ArrayOfDocumentoReferenciado }
     * 
     */
    public ArrayOfDocumentoReferenciado createArrayOfDocumentoReferenciado() {
        return new ArrayOfDocumentoReferenciado();
    }

    /**
     * Create an instance of {@link DocumentoReferenciado }
     * 
     */
    public DocumentoReferenciado createDocumentoReferenciado() {
        return new DocumentoReferenciado();
    }

    /**
     * Create an instance of {@link ArrayOfFacturaImpuestos }
     * 
     */
    public ArrayOfFacturaImpuestos createArrayOfFacturaImpuestos() {
        return new ArrayOfFacturaImpuestos();
    }

    /**
     * Create an instance of {@link FacturaImpuestos }
     * 
     */
    public FacturaImpuestos createFacturaImpuestos() {
        return new FacturaImpuestos();
    }

    /**
     * Create an instance of {@link ArrayOfImpuestosTotales }
     * 
     */
    public ArrayOfImpuestosTotales createArrayOfImpuestosTotales() {
        return new ArrayOfImpuestosTotales();
    }

    /**
     * Create an instance of {@link ImpuestosTotales }
     * 
     */
    public ImpuestosTotales createImpuestosTotales() {
        return new ImpuestosTotales();
    }

    /**
     * Create an instance of {@link ArrayOfLineaInformacionAdicional }
     * 
     */
    public ArrayOfLineaInformacionAdicional createArrayOfLineaInformacionAdicional() {
        return new ArrayOfLineaInformacionAdicional();
    }

    /**
     * Create an instance of {@link LineaInformacionAdicional }
     * 
     */
    public LineaInformacionAdicional createLineaInformacionAdicional() {
        return new LineaInformacionAdicional();
    }

    /**
     * Create an instance of {@link Entrega }
     * 
     */
    public Entrega createEntrega() {
        return new Entrega();
    }

    /**
     * Create an instance of {@link DatosDelTransportista }
     * 
     */
    public DatosDelTransportista createDatosDelTransportista() {
        return new DatosDelTransportista();
    }

    /**
     * Create an instance of {@link ArrayOfExtras }
     * 
     */
    public ArrayOfExtras createArrayOfExtras() {
        return new ArrayOfExtras();
    }

    /**
     * Create an instance of {@link Extras }
     * 
     */
    public Extras createExtras() {
        return new Extras();
    }

    /**
     * Create an instance of {@link ArrayOfMediosDePago }
     * 
     */
    public ArrayOfMediosDePago createArrayOfMediosDePago() {
        return new ArrayOfMediosDePago();
    }

    /**
     * Create an instance of {@link MediosDePago }
     * 
     */
    public MediosDePago createMediosDePago() {
        return new MediosDePago();
    }

    /**
     * Create an instance of {@link ArrayOfOrdenDeCompra }
     * 
     */
    public ArrayOfOrdenDeCompra createArrayOfOrdenDeCompra() {
        return new ArrayOfOrdenDeCompra();
    }

    /**
     * Create an instance of {@link OrdenDeCompra }
     * 
     */
    public OrdenDeCompra createOrdenDeCompra() {
        return new OrdenDeCompra();
    }

    /**
     * Create an instance of {@link TasaDeCambio }
     * 
     */
    public TasaDeCambio createTasaDeCambio() {
        return new TasaDeCambio();
    }

    /**
     * Create an instance of {@link TasaDeCambioAlternativa }
     * 
     */
    public TasaDeCambioAlternativa createTasaDeCambioAlternativa() {
        return new TasaDeCambioAlternativa();
    }

    /**
     * Create an instance of {@link TerminosDeEntrega }
     * 
     */
    public TerminosDeEntrega createTerminosDeEntrega() {
        return new TerminosDeEntrega();
    }

    /**
     * Create an instance of {@link ArrayOfHistorialDeEntrega }
     * 
     */
    public ArrayOfHistorialDeEntrega createArrayOfHistorialDeEntrega() {
        return new ArrayOfHistorialDeEntrega();
    }

    /**
     * Create an instance of {@link HistorialDeEntrega }
     * 
     */
    public HistorialDeEntrega createHistorialDeEntrega() {
        return new HistorialDeEntrega();
    }

    /**
     * Create an instance of {@link ArrayOfDatosExtras }
     * 
     */
    public ArrayOfDatosExtras createArrayOfDatosExtras() {
        return new ArrayOfDatosExtras();
    }

    /**
     * Create an instance of {@link DatosExtras }
     * 
     */
    public DatosExtras createDatosExtras() {
        return new DatosExtras();
    }

    /**
     * Create an instance of {@link ArrayOfstring }
     * 
     */
    public ArrayOfstring createArrayOfstring() {
        return new ArrayOfstring();
    }

    /**
     * Create an instance of {@link ArrayOfEvento }
     * 
     */
    public ArrayOfEvento createArrayOfEvento() {
        return new ArrayOfEvento();
    }

    /**
     * Create an instance of {@link Evento }
     * 
     */
    public Evento createEvento() {
        return new Evento();
    }

    /**
     * Create an instance of {@link ArrayOfExtrasEvento }
     * 
     */
    public ArrayOfExtrasEvento createArrayOfExtrasEvento() {
        return new ArrayOfExtrasEvento();
    }

    /**
     * Create an instance of {@link ExtrasEvento }
     * 
     */
    public ExtrasEvento createExtrasEvento() {
        return new ExtrasEvento();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FacturaGeneral }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FacturaGeneral }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "FacturaGeneral")
    public JAXBElement<FacturaGeneral> createFacturaGeneral(FacturaGeneral value) {
        return new JAXBElement<FacturaGeneral>(_FacturaGeneral_QNAME, FacturaGeneral.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAnticipos }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfAnticipos }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "ArrayOfAnticipos")
    public JAXBElement<ArrayOfAnticipos> createArrayOfAnticipos(ArrayOfAnticipos value) {
        return new JAXBElement<ArrayOfAnticipos>(_ArrayOfAnticipos_QNAME, ArrayOfAnticipos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Anticipos }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Anticipos }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "Anticipos")
    public JAXBElement<Anticipos> createAnticipos(Anticipos value) {
        return new JAXBElement<Anticipos>(_Anticipos_QNAME, Anticipos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfExtensible }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfExtensible }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "ArrayOfExtensible")
    public JAXBElement<ArrayOfExtensible> createArrayOfExtensible(ArrayOfExtensible value) {
        return new JAXBElement<ArrayOfExtensible>(_ArrayOfExtensible_QNAME, ArrayOfExtensible.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Extensible }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Extensible }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "Extensible")
    public JAXBElement<Extensible> createExtensible(Extensible value) {
        return new JAXBElement<Extensible>(_Extensible_QNAME, Extensible.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Autorizado }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Autorizado }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "Autorizado")
    public JAXBElement<Autorizado> createAutorizado(Autorizado value) {
        return new JAXBElement<Autorizado>(_Autorizado_QNAME, Autorizado.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Direccion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Direccion }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "Direccion")
    public JAXBElement<Direccion> createDireccion(Direccion value) {
        return new JAXBElement<Direccion>(_Direccion_QNAME, Direccion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCoordenadas }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfCoordenadas }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "ArrayOfCoordenadas")
    public JAXBElement<ArrayOfCoordenadas> createArrayOfCoordenadas(ArrayOfCoordenadas value) {
        return new JAXBElement<ArrayOfCoordenadas>(_ArrayOfCoordenadas_QNAME, ArrayOfCoordenadas.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Coordenadas }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Coordenadas }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "Coordenadas")
    public JAXBElement<Coordenadas> createCoordenadas(Coordenadas value) {
        return new JAXBElement<Coordenadas>(_Coordenadas_QNAME, Coordenadas.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCargosDescuentos }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfCargosDescuentos }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "ArrayOfCargosDescuentos")
    public JAXBElement<ArrayOfCargosDescuentos> createArrayOfCargosDescuentos(ArrayOfCargosDescuentos value) {
        return new JAXBElement<ArrayOfCargosDescuentos>(_ArrayOfCargosDescuentos_QNAME, ArrayOfCargosDescuentos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CargosDescuentos }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CargosDescuentos }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "CargosDescuentos")
    public JAXBElement<CargosDescuentos> createCargosDescuentos(CargosDescuentos value) {
        return new JAXBElement<CargosDescuentos>(_CargosDescuentos_QNAME, CargosDescuentos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Cliente }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Cliente }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "Cliente")
    public JAXBElement<Cliente> createCliente(Cliente value) {
        return new JAXBElement<Cliente>(_Cliente_QNAME, Cliente.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDestinatario }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfDestinatario }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "ArrayOfDestinatario")
    public JAXBElement<ArrayOfDestinatario> createArrayOfDestinatario(ArrayOfDestinatario value) {
        return new JAXBElement<ArrayOfDestinatario>(_ArrayOfDestinatario_QNAME, ArrayOfDestinatario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Destinatario }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Destinatario }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "Destinatario")
    public JAXBElement<Destinatario> createDestinatario(Destinatario value) {
        return new JAXBElement<Destinatario>(_Destinatario_QNAME, Destinatario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTributos }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfTributos }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "ArrayOfTributos")
    public JAXBElement<ArrayOfTributos> createArrayOfTributos(ArrayOfTributos value) {
        return new JAXBElement<ArrayOfTributos>(_ArrayOfTributos_QNAME, ArrayOfTributos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Tributos }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Tributos }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "Tributos")
    public JAXBElement<Tributos> createTributos(Tributos value) {
        return new JAXBElement<Tributos>(_Tributos_QNAME, Tributos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InformacionLegal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link InformacionLegal }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "InformacionLegal")
    public JAXBElement<InformacionLegal> createInformacionLegal(InformacionLegal value) {
        return new JAXBElement<InformacionLegal>(_InformacionLegal_QNAME, InformacionLegal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfObligaciones }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfObligaciones }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "ArrayOfObligaciones")
    public JAXBElement<ArrayOfObligaciones> createArrayOfObligaciones(ArrayOfObligaciones value) {
        return new JAXBElement<ArrayOfObligaciones>(_ArrayOfObligaciones_QNAME, ArrayOfObligaciones.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Obligaciones }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Obligaciones }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "Obligaciones")
    public JAXBElement<Obligaciones> createObligaciones(Obligaciones value) {
        return new JAXBElement<Obligaciones>(_Obligaciones_QNAME, Obligaciones.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCondicionDePago }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfCondicionDePago }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "ArrayOfCondicionDePago")
    public JAXBElement<ArrayOfCondicionDePago> createArrayOfCondicionDePago(ArrayOfCondicionDePago value) {
        return new JAXBElement<ArrayOfCondicionDePago>(_ArrayOfCondicionDePago_QNAME, ArrayOfCondicionDePago.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CondicionDePago }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CondicionDePago }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "CondicionDePago")
    public JAXBElement<CondicionDePago> createCondicionDePago(CondicionDePago value) {
        return new JAXBElement<CondicionDePago>(_CondicionDePago_QNAME, CondicionDePago.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfFacturaDetalle }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfFacturaDetalle }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "ArrayOfFacturaDetalle")
    public JAXBElement<ArrayOfFacturaDetalle> createArrayOfFacturaDetalle(ArrayOfFacturaDetalle value) {
        return new JAXBElement<ArrayOfFacturaDetalle>(_ArrayOfFacturaDetalle_QNAME, ArrayOfFacturaDetalle.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FacturaDetalle }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FacturaDetalle }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "FacturaDetalle")
    public JAXBElement<FacturaDetalle> createFacturaDetalle(FacturaDetalle value) {
        return new JAXBElement<FacturaDetalle>(_FacturaDetalle_QNAME, FacturaDetalle.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDocumentoReferenciado }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfDocumentoReferenciado }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "ArrayOfDocumentoReferenciado")
    public JAXBElement<ArrayOfDocumentoReferenciado> createArrayOfDocumentoReferenciado(ArrayOfDocumentoReferenciado value) {
        return new JAXBElement<ArrayOfDocumentoReferenciado>(_ArrayOfDocumentoReferenciado_QNAME, ArrayOfDocumentoReferenciado.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentoReferenciado }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DocumentoReferenciado }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "DocumentoReferenciado")
    public JAXBElement<DocumentoReferenciado> createDocumentoReferenciado(DocumentoReferenciado value) {
        return new JAXBElement<DocumentoReferenciado>(_DocumentoReferenciado_QNAME, DocumentoReferenciado.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfFacturaImpuestos }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfFacturaImpuestos }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "ArrayOfFacturaImpuestos")
    public JAXBElement<ArrayOfFacturaImpuestos> createArrayOfFacturaImpuestos(ArrayOfFacturaImpuestos value) {
        return new JAXBElement<ArrayOfFacturaImpuestos>(_ArrayOfFacturaImpuestos_QNAME, ArrayOfFacturaImpuestos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FacturaImpuestos }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FacturaImpuestos }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "FacturaImpuestos")
    public JAXBElement<FacturaImpuestos> createFacturaImpuestos(FacturaImpuestos value) {
        return new JAXBElement<FacturaImpuestos>(_FacturaImpuestos_QNAME, FacturaImpuestos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfImpuestosTotales }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfImpuestosTotales }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "ArrayOfImpuestosTotales")
    public JAXBElement<ArrayOfImpuestosTotales> createArrayOfImpuestosTotales(ArrayOfImpuestosTotales value) {
        return new JAXBElement<ArrayOfImpuestosTotales>(_ArrayOfImpuestosTotales_QNAME, ArrayOfImpuestosTotales.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ImpuestosTotales }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ImpuestosTotales }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "ImpuestosTotales")
    public JAXBElement<ImpuestosTotales> createImpuestosTotales(ImpuestosTotales value) {
        return new JAXBElement<ImpuestosTotales>(_ImpuestosTotales_QNAME, ImpuestosTotales.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfLineaInformacionAdicional }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfLineaInformacionAdicional }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "ArrayOfLineaInformacionAdicional")
    public JAXBElement<ArrayOfLineaInformacionAdicional> createArrayOfLineaInformacionAdicional(ArrayOfLineaInformacionAdicional value) {
        return new JAXBElement<ArrayOfLineaInformacionAdicional>(_ArrayOfLineaInformacionAdicional_QNAME, ArrayOfLineaInformacionAdicional.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LineaInformacionAdicional }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LineaInformacionAdicional }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "LineaInformacionAdicional")
    public JAXBElement<LineaInformacionAdicional> createLineaInformacionAdicional(LineaInformacionAdicional value) {
        return new JAXBElement<LineaInformacionAdicional>(_LineaInformacionAdicional_QNAME, LineaInformacionAdicional.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Entrega }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Entrega }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "Entrega")
    public JAXBElement<Entrega> createEntrega(Entrega value) {
        return new JAXBElement<Entrega>(_Entrega_QNAME, Entrega.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatosDelTransportista }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DatosDelTransportista }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "DatosDelTransportista")
    public JAXBElement<DatosDelTransportista> createDatosDelTransportista(DatosDelTransportista value) {
        return new JAXBElement<DatosDelTransportista>(_DatosDelTransportista_QNAME, DatosDelTransportista.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfExtras }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfExtras }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "ArrayOfExtras")
    public JAXBElement<ArrayOfExtras> createArrayOfExtras(ArrayOfExtras value) {
        return new JAXBElement<ArrayOfExtras>(_ArrayOfExtras_QNAME, ArrayOfExtras.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Extras }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Extras }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "Extras")
    public JAXBElement<Extras> createExtras(Extras value) {
        return new JAXBElement<Extras>(_Extras_QNAME, Extras.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfMediosDePago }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfMediosDePago }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "ArrayOfMediosDePago")
    public JAXBElement<ArrayOfMediosDePago> createArrayOfMediosDePago(ArrayOfMediosDePago value) {
        return new JAXBElement<ArrayOfMediosDePago>(_ArrayOfMediosDePago_QNAME, ArrayOfMediosDePago.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MediosDePago }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MediosDePago }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "MediosDePago")
    public JAXBElement<MediosDePago> createMediosDePago(MediosDePago value) {
        return new JAXBElement<MediosDePago>(_MediosDePago_QNAME, MediosDePago.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfOrdenDeCompra }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfOrdenDeCompra }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "ArrayOfOrdenDeCompra")
    public JAXBElement<ArrayOfOrdenDeCompra> createArrayOfOrdenDeCompra(ArrayOfOrdenDeCompra value) {
        return new JAXBElement<ArrayOfOrdenDeCompra>(_ArrayOfOrdenDeCompra_QNAME, ArrayOfOrdenDeCompra.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrdenDeCompra }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OrdenDeCompra }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "OrdenDeCompra")
    public JAXBElement<OrdenDeCompra> createOrdenDeCompra(OrdenDeCompra value) {
        return new JAXBElement<OrdenDeCompra>(_OrdenDeCompra_QNAME, OrdenDeCompra.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TasaDeCambio }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TasaDeCambio }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "TasaDeCambio")
    public JAXBElement<TasaDeCambio> createTasaDeCambio(TasaDeCambio value) {
        return new JAXBElement<TasaDeCambio>(_TasaDeCambio_QNAME, TasaDeCambio.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TasaDeCambioAlternativa }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TasaDeCambioAlternativa }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "TasaDeCambioAlternativa")
    public JAXBElement<TasaDeCambioAlternativa> createTasaDeCambioAlternativa(TasaDeCambioAlternativa value) {
        return new JAXBElement<TasaDeCambioAlternativa>(_TasaDeCambioAlternativa_QNAME, TasaDeCambioAlternativa.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TerminosDeEntrega }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TerminosDeEntrega }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "TerminosDeEntrega")
    public JAXBElement<TerminosDeEntrega> createTerminosDeEntrega(TerminosDeEntrega value) {
        return new JAXBElement<TerminosDeEntrega>(_TerminosDeEntrega_QNAME, TerminosDeEntrega.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfHistorialDeEntrega }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfHistorialDeEntrega }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "ArrayOfHistorialDeEntrega")
    public JAXBElement<ArrayOfHistorialDeEntrega> createArrayOfHistorialDeEntrega(ArrayOfHistorialDeEntrega value) {
        return new JAXBElement<ArrayOfHistorialDeEntrega>(_ArrayOfHistorialDeEntrega_QNAME, ArrayOfHistorialDeEntrega.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HistorialDeEntrega }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link HistorialDeEntrega }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "HistorialDeEntrega")
    public JAXBElement<HistorialDeEntrega> createHistorialDeEntrega(HistorialDeEntrega value) {
        return new JAXBElement<HistorialDeEntrega>(_HistorialDeEntrega_QNAME, HistorialDeEntrega.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatosEvento }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DatosEvento }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "DatosEvento")
    public JAXBElement<DatosEvento> createDatosEvento(DatosEvento value) {
        return new JAXBElement<DatosEvento>(_DatosEvento_QNAME, DatosEvento.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDatosExtras }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfDatosExtras }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "ArrayOfDatosExtras")
    public JAXBElement<ArrayOfDatosExtras> createArrayOfDatosExtras(ArrayOfDatosExtras value) {
        return new JAXBElement<ArrayOfDatosExtras>(_ArrayOfDatosExtras_QNAME, ArrayOfDatosExtras.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatosExtras }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DatosExtras }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "DatosExtras")
    public JAXBElement<DatosExtras> createDatosExtras(DatosExtras value) {
        return new JAXBElement<DatosExtras>(_DatosExtras_QNAME, DatosExtras.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/Arrays", name = "ArrayOfstring")
    public JAXBElement<ArrayOfstring> createArrayOfstring(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_ArrayOfstring_QNAME, ArrayOfstring.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DocumentResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", name = "DocumentResponse")
    public JAXBElement<DocumentResponse> createDocumentResponse(DocumentResponse value) {
        return new JAXBElement<DocumentResponse>(_DocumentResponse_QNAME, DocumentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentStatusResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DocumentStatusResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", name = "DocumentStatusResponse")
    public JAXBElement<DocumentStatusResponse> createDocumentStatusResponse(DocumentStatusResponse value) {
        return new JAXBElement<DocumentStatusResponse>(_DocumentStatusResponse_QNAME, DocumentStatusResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendEmailResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SendEmailResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", name = "SendEmailResponse")
    public JAXBElement<SendEmailResponse> createSendEmailResponse(SendEmailResponse value) {
        return new JAXBElement<SendEmailResponse>(_SendEmailResponse_QNAME, SendEmailResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DownloadPDFResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DownloadPDFResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", name = "DownloadPDFResponse")
    public JAXBElement<DownloadPDFResponse> createDownloadPDFResponse(DownloadPDFResponse value) {
        return new JAXBElement<DownloadPDFResponse>(_DownloadPDFResponse_QNAME, DownloadPDFResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DownloadXMLResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DownloadXMLResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", name = "DownloadXMLResponse")
    public JAXBElement<DownloadXMLResponse> createDownloadXMLResponse(DownloadXMLResponse value) {
        return new JAXBElement<DownloadXMLResponse>(_DownloadXMLResponse_QNAME, DownloadXMLResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FoliosRemainingResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FoliosRemainingResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", name = "FoliosRemainingResponse")
    public JAXBElement<FoliosRemainingResponse> createFoliosRemainingResponse(FoliosRemainingResponse value) {
        return new JAXBElement<FoliosRemainingResponse>(_FoliosRemainingResponse_QNAME, FoliosRemainingResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoadCertificateResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LoadCertificateResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", name = "LoadCertificateResponse")
    public JAXBElement<LoadCertificateResponse> createLoadCertificateResponse(LoadCertificateResponse value) {
        return new JAXBElement<LoadCertificateResponse>(_LoadCertificateResponse_QNAME, LoadCertificateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EventoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EventoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", name = "EventoResponse")
    public JAXBElement<EventoResponse> createEventoResponse(EventoResponse value) {
        return new JAXBElement<EventoResponse>(_EventoResponse_QNAME, EventoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DescargarEventoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DescargarEventoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", name = "DescargarEventoResponse")
    public JAXBElement<DescargarEventoResponse> createDescargarEventoResponse(DescargarEventoResponse value) {
        return new JAXBElement<DescargarEventoResponse>(_DescargarEventoResponse_QNAME, DescargarEventoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContenedorResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ContenedorResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", name = "ContenedorResponse")
    public JAXBElement<ContenedorResponse> createContenedorResponse(ContenedorResponse value) {
        return new JAXBElement<ContenedorResponse>(_ContenedorResponse_QNAME, ContenedorResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfEvento }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfEvento }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.Models.Response", name = "ArrayOfEvento")
    public JAXBElement<ArrayOfEvento> createArrayOfEvento(ArrayOfEvento value) {
        return new JAXBElement<ArrayOfEvento>(_ArrayOfEvento_QNAME, ArrayOfEvento.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Evento }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Evento }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.Models.Response", name = "Evento")
    public JAXBElement<Evento> createEvento(Evento value) {
        return new JAXBElement<Evento>(_Evento_QNAME, Evento.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfExtrasEvento }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfExtrasEvento }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.Models.Response", name = "ArrayOfExtrasEvento")
    public JAXBElement<ArrayOfExtrasEvento> createArrayOfExtrasEvento(ArrayOfExtrasEvento value) {
        return new JAXBElement<ArrayOfExtrasEvento>(_ArrayOfExtrasEvento_QNAME, ArrayOfExtrasEvento.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExtrasEvento }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ExtrasEvento }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.Models.Response", name = "ExtrasEvento")
    public JAXBElement<ExtrasEvento> createExtrasEvento(ExtrasEvento value) {
        return new JAXBElement<ExtrasEvento>(_ExtrasEvento_QNAME, ExtrasEvento.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "anyType")
    public JAXBElement<Object> createAnyType(Object value) {
        return new JAXBElement<Object>(_AnyType_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "anyURI")
    public JAXBElement<String> createAnyURI(String value) {
        return new JAXBElement<String>(_AnyURI_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "base64Binary")
    public JAXBElement<byte[]> createBase64Binary(byte[] value) {
        return new JAXBElement<byte[]>(_Base64Binary_QNAME, byte[].class, null, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "boolean")
    public JAXBElement<Boolean> createBoolean(Boolean value) {
        return new JAXBElement<Boolean>(_Boolean_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Byte }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Byte }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "byte")
    public JAXBElement<Byte> createByte(Byte value) {
        return new JAXBElement<Byte>(_Byte_QNAME, Byte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "dateTime")
    public JAXBElement<XMLGregorianCalendar> createDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DateTime_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "decimal")
    public JAXBElement<BigDecimal> createDecimal(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Decimal_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Double }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "double")
    public JAXBElement<Double> createDouble(Double value) {
        return new JAXBElement<Double>(_Double_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Float }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "float")
    public JAXBElement<Float> createFloat(Float value) {
        return new JAXBElement<Float>(_Float_QNAME, Float.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "int")
    public JAXBElement<Integer> createInt(Integer value) {
        return new JAXBElement<Integer>(_Int_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "long")
    public JAXBElement<Long> createLong(Long value) {
        return new JAXBElement<Long>(_Long_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QName }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link QName }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "QName")
    public JAXBElement<QName> createQName(QName value) {
        return new JAXBElement<QName>(_QName_QNAME, QName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "short")
    public JAXBElement<Short> createShort(Short value) {
        return new JAXBElement<Short>(_Short_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "string")
    public JAXBElement<String> createString(String value) {
        return new JAXBElement<String>(_String_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedByte")
    public JAXBElement<Short> createUnsignedByte(Short value) {
        return new JAXBElement<Short>(_UnsignedByte_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedInt")
    public JAXBElement<Long> createUnsignedInt(Long value) {
        return new JAXBElement<Long>(_UnsignedInt_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedLong")
    public JAXBElement<BigInteger> createUnsignedLong(BigInteger value) {
        return new JAXBElement<BigInteger>(_UnsignedLong_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedShort")
    public JAXBElement<Integer> createUnsignedShort(Integer value) {
        return new JAXBElement<Integer>(_UnsignedShort_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "char")
    public JAXBElement<Integer> createChar(Integer value) {
        return new JAXBElement<Integer>(_Char_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "duration")
    public JAXBElement<Duration> createDuration(Duration value) {
        return new JAXBElement<Duration>(_Duration_QNAME, Duration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "guid")
    public JAXBElement<String> createGuid(String value) {
        return new JAXBElement<String>(_Guid_QNAME, String.class, null, value);
    }

}
