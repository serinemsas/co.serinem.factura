
package org.jco.jaxws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para DatosDelTransportista complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DatosDelTransportista"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="detallesTributarios" type="{http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object}ArrayOfTributos" minOccurs="0"/&gt;
 *         &lt;element name="direccionResponsableEntrega" type="{http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object}Direccion" minOccurs="0"/&gt;
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="extras" type="{http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object}ArrayOfExtensible" minOccurs="0"/&gt;
 *         &lt;element name="indicadordeAtencion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="indicadordeCuidado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nombreContacto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nombreResponsableEntrega" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nota" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="numeroIdentificacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="numeroIdentificacionDV" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="numeroMatriculaMercantil" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="prefijoFacturacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="responsabilidadesRut" type="{http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object}ArrayOfObligaciones" minOccurs="0"/&gt;
 *         &lt;element name="telefax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="telefono" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tipoIdentificacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="transportadorDireccion" type="{http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object}Direccion" minOccurs="0"/&gt;
 *         &lt;element name="transportadorNombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="transportadorNumeroDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="transportadorNumeroDocumentoDV" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="transportadorTipoIdentificacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DatosDelTransportista", propOrder = {
    "detallesTributarios",
    "direccionResponsableEntrega",
    "email",
    "extras",
    "indicadordeAtencion",
    "indicadordeCuidado",
    "nombreContacto",
    "nombreResponsableEntrega",
    "nota",
    "numeroIdentificacion",
    "numeroIdentificacionDV",
    "numeroMatriculaMercantil",
    "prefijoFacturacion",
    "responsabilidadesRut",
    "telefax",
    "telefono",
    "tipoIdentificacion",
    "transportadorDireccion",
    "transportadorNombre",
    "transportadorNumeroDocumento",
    "transportadorNumeroDocumentoDV",
    "transportadorTipoIdentificacion"
})
public class DatosDelTransportista {

    @XmlElement(nillable = true)
    protected ArrayOfTributos detallesTributarios;
    @XmlElement(nillable = true)
    protected Direccion direccionResponsableEntrega;
    @XmlElement(nillable = true)
    protected String email;
    @XmlElement(nillable = true)
    protected ArrayOfExtensible extras;
    @XmlElement(nillable = true)
    protected String indicadordeAtencion;
    @XmlElement(nillable = true)
    protected String indicadordeCuidado;
    @XmlElement(nillable = true)
    protected String nombreContacto;
    @XmlElement(nillable = true)
    protected String nombreResponsableEntrega;
    @XmlElement(nillable = true)
    protected String nota;
    @XmlElement(nillable = true)
    protected String numeroIdentificacion;
    @XmlElement(nillable = true)
    protected String numeroIdentificacionDV;
    @XmlElement(nillable = true)
    protected String numeroMatriculaMercantil;
    @XmlElement(nillable = true)
    protected String prefijoFacturacion;
    @XmlElement(nillable = true)
    protected ArrayOfObligaciones responsabilidadesRut;
    @XmlElement(nillable = true)
    protected String telefax;
    @XmlElement(nillable = true)
    protected String telefono;
    @XmlElement(nillable = true)
    protected String tipoIdentificacion;
    @XmlElement(nillable = true)
    protected Direccion transportadorDireccion;
    @XmlElement(nillable = true)
    protected String transportadorNombre;
    @XmlElement(nillable = true)
    protected String transportadorNumeroDocumento;
    @XmlElement(nillable = true)
    protected String transportadorNumeroDocumentoDV;
    @XmlElement(nillable = true)
    protected String transportadorTipoIdentificacion;

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
     * Obtiene el valor de la propiedad direccionResponsableEntrega.
     * 
     * @return
     *     possible object is
     *     {@link Direccion }
     *     
     */
    public Direccion getDireccionResponsableEntrega() {
        return direccionResponsableEntrega;
    }

    /**
     * Define el valor de la propiedad direccionResponsableEntrega.
     * 
     * @param value
     *     allowed object is
     *     {@link Direccion }
     *     
     */
    public void setDireccionResponsableEntrega(Direccion value) {
        this.direccionResponsableEntrega = value;
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
     * Obtiene el valor de la propiedad indicadordeAtencion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndicadordeAtencion() {
        return indicadordeAtencion;
    }

    /**
     * Define el valor de la propiedad indicadordeAtencion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndicadordeAtencion(String value) {
        this.indicadordeAtencion = value;
    }

    /**
     * Obtiene el valor de la propiedad indicadordeCuidado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndicadordeCuidado() {
        return indicadordeCuidado;
    }

    /**
     * Define el valor de la propiedad indicadordeCuidado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndicadordeCuidado(String value) {
        this.indicadordeCuidado = value;
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
     * Obtiene el valor de la propiedad nombreResponsableEntrega.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreResponsableEntrega() {
        return nombreResponsableEntrega;
    }

    /**
     * Define el valor de la propiedad nombreResponsableEntrega.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreResponsableEntrega(String value) {
        this.nombreResponsableEntrega = value;
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
     * Obtiene el valor de la propiedad numeroIdentificacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    /**
     * Define el valor de la propiedad numeroIdentificacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroIdentificacion(String value) {
        this.numeroIdentificacion = value;
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
     * Obtiene el valor de la propiedad numeroMatriculaMercantil.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroMatriculaMercantil() {
        return numeroMatriculaMercantil;
    }

    /**
     * Define el valor de la propiedad numeroMatriculaMercantil.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroMatriculaMercantil(String value) {
        this.numeroMatriculaMercantil = value;
    }

    /**
     * Obtiene el valor de la propiedad prefijoFacturacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrefijoFacturacion() {
        return prefijoFacturacion;
    }

    /**
     * Define el valor de la propiedad prefijoFacturacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrefijoFacturacion(String value) {
        this.prefijoFacturacion = value;
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
     * Obtiene el valor de la propiedad transportadorDireccion.
     * 
     * @return
     *     possible object is
     *     {@link Direccion }
     *     
     */
    public Direccion getTransportadorDireccion() {
        return transportadorDireccion;
    }

    /**
     * Define el valor de la propiedad transportadorDireccion.
     * 
     * @param value
     *     allowed object is
     *     {@link Direccion }
     *     
     */
    public void setTransportadorDireccion(Direccion value) {
        this.transportadorDireccion = value;
    }

    /**
     * Obtiene el valor de la propiedad transportadorNombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransportadorNombre() {
        return transportadorNombre;
    }

    /**
     * Define el valor de la propiedad transportadorNombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransportadorNombre(String value) {
        this.transportadorNombre = value;
    }

    /**
     * Obtiene el valor de la propiedad transportadorNumeroDocumento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransportadorNumeroDocumento() {
        return transportadorNumeroDocumento;
    }

    /**
     * Define el valor de la propiedad transportadorNumeroDocumento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransportadorNumeroDocumento(String value) {
        this.transportadorNumeroDocumento = value;
    }

    /**
     * Obtiene el valor de la propiedad transportadorNumeroDocumentoDV.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransportadorNumeroDocumentoDV() {
        return transportadorNumeroDocumentoDV;
    }

    /**
     * Define el valor de la propiedad transportadorNumeroDocumentoDV.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransportadorNumeroDocumentoDV(String value) {
        this.transportadorNumeroDocumentoDV = value;
    }

    /**
     * Obtiene el valor de la propiedad transportadorTipoIdentificacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransportadorTipoIdentificacion() {
        return transportadorTipoIdentificacion;
    }

    /**
     * Define el valor de la propiedad transportadorTipoIdentificacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransportadorTipoIdentificacion(String value) {
        this.transportadorTipoIdentificacion = value;
    }

}
