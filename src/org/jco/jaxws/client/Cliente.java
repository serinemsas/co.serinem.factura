
package org.jco.jaxws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Cliente complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Cliente"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="actividadEconomicaCIIU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="apellido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="destinatario" type="{http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object}ArrayOfDestinatario" minOccurs="0"/&gt;
 *         &lt;element name="detallesTributarios" type="{http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object}ArrayOfTributos" minOccurs="0"/&gt;
 *         &lt;element name="direccionCliente" type="{http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object}Direccion" minOccurs="0"/&gt;
 *         &lt;element name="direccionFiscal" type="{http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object}Direccion" minOccurs="0"/&gt;
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="extras" type="{http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object}ArrayOfExtensible" minOccurs="0"/&gt;
 *         &lt;element name="informacionLegalCliente" type="{http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object}InformacionLegal" minOccurs="0"/&gt;
 *         &lt;element name="nombreComercial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nombreContacto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nombreRazonSocial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nota" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="notificar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="numeroDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="numeroIdentificacionDV" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="responsabilidadesRut" type="{http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object}ArrayOfObligaciones" minOccurs="0"/&gt;
 *         &lt;element name="segundoNombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="telefax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="telefono" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tipoIdentificacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tipoPersona" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Cliente", propOrder = {
    "actividadEconomicaCIIU",
    "apellido",
    "destinatario",
    "detallesTributarios",
    "direccionCliente",
    "direccionFiscal",
    "email",
    "extras",
    "informacionLegalCliente",
    "nombreComercial",
    "nombreContacto",
    "nombreRazonSocial",
    "nota",
    "notificar",
    "numeroDocumento",
    "numeroIdentificacionDV",
    "responsabilidadesRut",
    "segundoNombre",
    "telefax",
    "telefono",
    "tipoIdentificacion",
    "tipoPersona"
})
public class Cliente {

    @XmlElement(nillable = true)
    protected String actividadEconomicaCIIU;
    @XmlElement(nillable = true)
    protected String apellido;
    @XmlElement(nillable = true)
    protected ArrayOfDestinatario destinatario;
    @XmlElement(nillable = true)
    protected ArrayOfTributos detallesTributarios;
    @XmlElement(nillable = true)
    protected Direccion direccionCliente;
    @XmlElement(nillable = true)
    protected Direccion direccionFiscal;
    @XmlElement(nillable = true)
    protected String email;
    @XmlElement(nillable = true)
    protected ArrayOfExtensible extras;
    @XmlElement(nillable = true)
    protected InformacionLegal informacionLegalCliente;
    @XmlElement(nillable = true)
    protected String nombreComercial;
    @XmlElement(nillable = true)
    protected String nombreContacto;
    @XmlElement(nillable = true)
    protected String nombreRazonSocial;
    @XmlElement(nillable = true)
    protected String nota;
    @XmlElement(nillable = true)
    protected String notificar;
    @XmlElement(nillable = true)
    protected String numeroDocumento;
    @XmlElement(nillable = true)
    protected String numeroIdentificacionDV;
    @XmlElement(nillable = true)
    protected ArrayOfObligaciones responsabilidadesRut;
    @XmlElement(nillable = true)
    protected String segundoNombre;
    @XmlElement(nillable = true)
    protected String telefax;
    @XmlElement(nillable = true)
    protected String telefono;
    @XmlElement(nillable = true)
    protected String tipoIdentificacion;
    @XmlElement(nillable = true)
    protected String tipoPersona;

    /**
     * Obtiene el valor de la propiedad actividadEconomicaCIIU.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActividadEconomicaCIIU() {
        return actividadEconomicaCIIU;
    }

    /**
     * Define el valor de la propiedad actividadEconomicaCIIU.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActividadEconomicaCIIU(String value) {
        this.actividadEconomicaCIIU = value;
    }

    /**
     * Obtiene el valor de la propiedad apellido.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * Define el valor de la propiedad apellido.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApellido(String value) {
        this.apellido = value;
    }

    /**
     * Obtiene el valor de la propiedad destinatario.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDestinatario }
     *     
     */
    public ArrayOfDestinatario getDestinatario() {
        return destinatario;
    }

    /**
     * Define el valor de la propiedad destinatario.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDestinatario }
     *     
     */
    public void setDestinatario(ArrayOfDestinatario value) {
        this.destinatario = value;
    }

    /**
     * Obtiene el valor de la propiedad detallesTributarios.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTributos }
     *     
     */
    public ArrayOfTributos getDetallesTributarios() {
        return detallesTributarios;
    }

    /**
     * Define el valor de la propiedad detallesTributarios.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTributos }
     *     
     */
    public void setDetallesTributarios(ArrayOfTributos value) {
        this.detallesTributarios = value;
    }

    /**
     * Obtiene el valor de la propiedad direccionCliente.
     * 
     * @return
     *     possible object is
     *     {@link Direccion }
     *     
     */
    public Direccion getDireccionCliente() {
        return direccionCliente;
    }

    /**
     * Define el valor de la propiedad direccionCliente.
     * 
     * @param value
     *     allowed object is
     *     {@link Direccion }
     *     
     */
    public void setDireccionCliente(Direccion value) {
        this.direccionCliente = value;
    }

    /**
     * Obtiene el valor de la propiedad direccionFiscal.
     * 
     * @return
     *     possible object is
     *     {@link Direccion }
     *     
     */
    public Direccion getDireccionFiscal() {
        return direccionFiscal;
    }

    /**
     * Define el valor de la propiedad direccionFiscal.
     * 
     * @param value
     *     allowed object is
     *     {@link Direccion }
     *     
     */
    public void setDireccionFiscal(Direccion value) {
        this.direccionFiscal = value;
    }

    /**
     * Obtiene el valor de la propiedad email.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Define el valor de la propiedad email.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Obtiene el valor de la propiedad extras.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfExtensible }
     *     
     */
    public ArrayOfExtensible getExtras() {
        return extras;
    }

    /**
     * Define el valor de la propiedad extras.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfExtensible }
     *     
     */
    public void setExtras(ArrayOfExtensible value) {
        this.extras = value;
    }

    /**
     * Obtiene el valor de la propiedad informacionLegalCliente.
     * 
     * @return
     *     possible object is
     *     {@link InformacionLegal }
     *     
     */
    public InformacionLegal getInformacionLegalCliente() {
        return informacionLegalCliente;
    }

    /**
     * Define el valor de la propiedad informacionLegalCliente.
     * 
     * @param value
     *     allowed object is
     *     {@link InformacionLegal }
     *     
     */
    public void setInformacionLegalCliente(InformacionLegal value) {
        this.informacionLegalCliente = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreComercial.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreComercial() {
        return nombreComercial;
    }

    /**
     * Define el valor de la propiedad nombreComercial.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreComercial(String value) {
        this.nombreComercial = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreContacto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreContacto() {
        return nombreContacto;
    }

    /**
     * Define el valor de la propiedad nombreContacto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreContacto(String value) {
        this.nombreContacto = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreRazonSocial.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreRazonSocial() {
        return nombreRazonSocial;
    }

    /**
     * Define el valor de la propiedad nombreRazonSocial.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreRazonSocial(String value) {
        this.nombreRazonSocial = value;
    }

    /**
     * Obtiene el valor de la propiedad nota.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNota() {
        return nota;
    }

    /**
     * Define el valor de la propiedad nota.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNota(String value) {
        this.nota = value;
    }

    /**
     * Obtiene el valor de la propiedad notificar.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotificar() {
        return notificar;
    }

    /**
     * Define el valor de la propiedad notificar.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotificar(String value) {
        this.notificar = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroDocumento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    /**
     * Define el valor de la propiedad numeroDocumento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroDocumento(String value) {
        this.numeroDocumento = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroIdentificacionDV.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroIdentificacionDV() {
        return numeroIdentificacionDV;
    }

    /**
     * Define el valor de la propiedad numeroIdentificacionDV.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroIdentificacionDV(String value) {
        this.numeroIdentificacionDV = value;
    }

    /**
     * Obtiene el valor de la propiedad responsabilidadesRut.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfObligaciones }
     *     
     */
    public ArrayOfObligaciones getResponsabilidadesRut() {
        return responsabilidadesRut;
    }

    /**
     * Define el valor de la propiedad responsabilidadesRut.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfObligaciones }
     *     
     */
    public void setResponsabilidadesRut(ArrayOfObligaciones value) {
        this.responsabilidadesRut = value;
    }

    /**
     * Obtiene el valor de la propiedad segundoNombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSegundoNombre() {
        return segundoNombre;
    }

    /**
     * Define el valor de la propiedad segundoNombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSegundoNombre(String value) {
        this.segundoNombre = value;
    }

    /**
     * Obtiene el valor de la propiedad telefax.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelefax() {
        return telefax;
    }

    /**
     * Define el valor de la propiedad telefax.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelefax(String value) {
        this.telefax = value;
    }

    /**
     * Obtiene el valor de la propiedad telefono.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Define el valor de la propiedad telefono.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelefono(String value) {
        this.telefono = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoIdentificacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoIdentificacion() {
        return tipoIdentificacion;
    }

    /**
     * Define el valor de la propiedad tipoIdentificacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoIdentificacion(String value) {
        this.tipoIdentificacion = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoPersona.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoPersona() {
        return tipoPersona;
    }

    /**
     * Define el valor de la propiedad tipoPersona.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoPersona(String value) {
        this.tipoPersona = value;
    }

}
