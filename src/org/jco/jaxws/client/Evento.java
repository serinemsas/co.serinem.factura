
package org.jco.jaxws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Evento complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Evento"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ambienteDIAN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="comentario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cufe" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="descripcionEvento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="emisorNumeroDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="emisorNumeroDocumentoDV" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="emisorRazonSocial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="emisorTipoIdentificacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="extras" type="{http://schemas.datacontract.org/2004/07/ServiceSoap.Models.Response}ArrayOfExtrasEvento" minOccurs="0"/&gt;
 *         &lt;element name="fechaEmision" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fechaRecepcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="hash" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="idPerfilDIAN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mensaje" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nombreArchivoXML" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nota" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="numeroDelEvento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="receptorNumeroDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="receptorNumeroDocumentoDV" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="receptorRazonSocial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="receptorTipoIdentificacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="resultado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tipoCufe" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tipoEvento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="versionUBL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="xml" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Evento", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.Models.Response", propOrder = {
    "ambienteDIAN",
    "codigo",
    "comentario",
    "cufe",
    "descripcionEvento",
    "emisorNumeroDocumento",
    "emisorNumeroDocumentoDV",
    "emisorRazonSocial",
    "emisorTipoIdentificacion",
    "extras",
    "fechaEmision",
    "fechaRecepcion",
    "hash",
    "idPerfilDIAN",
    "mensaje",
    "nombreArchivoXML",
    "nota",
    "numeroDelEvento",
    "receptorNumeroDocumento",
    "receptorNumeroDocumentoDV",
    "receptorRazonSocial",
    "receptorTipoIdentificacion",
    "resultado",
    "tipoCufe",
    "tipoEvento",
    "versionUBL",
    "xml"
})
public class Evento {

    @XmlElement(nillable = true)
    protected String ambienteDIAN;
    @XmlElement(nillable = true)
    protected String codigo;
    @XmlElement(nillable = true)
    protected String comentario;
    @XmlElement(nillable = true)
    protected String cufe;
    @XmlElement(nillable = true)
    protected String descripcionEvento;
    @XmlElement(nillable = true)
    protected String emisorNumeroDocumento;
    @XmlElement(nillable = true)
    protected String emisorNumeroDocumentoDV;
    @XmlElement(nillable = true)
    protected String emisorRazonSocial;
    @XmlElement(nillable = true)
    protected String emisorTipoIdentificacion;
    @XmlElement(nillable = true)
    protected ArrayOfExtrasEvento extras;
    @XmlElement(nillable = true)
    protected String fechaEmision;
    @XmlElement(nillable = true)
    protected String fechaRecepcion;
    @XmlElement(nillable = true)
    protected String hash;
    @XmlElement(nillable = true)
    protected String idPerfilDIAN;
    @XmlElement(nillable = true)
    protected String mensaje;
    @XmlElement(nillable = true)
    protected String nombreArchivoXML;
    @XmlElement(nillable = true)
    protected String nota;
    @XmlElement(nillable = true)
    protected String numeroDelEvento;
    @XmlElement(nillable = true)
    protected String receptorNumeroDocumento;
    @XmlElement(nillable = true)
    protected String receptorNumeroDocumentoDV;
    @XmlElement(nillable = true)
    protected String receptorRazonSocial;
    @XmlElement(nillable = true)
    protected String receptorTipoIdentificacion;
    @XmlElement(nillable = true)
    protected String resultado;
    @XmlElement(nillable = true)
    protected String tipoCufe;
    @XmlElement(nillable = true)
    protected String tipoEvento;
    @XmlElement(nillable = true)
    protected String versionUBL;
    @XmlElement(nillable = true)
    protected String xml;

    /**
     * Obtiene el valor de la propiedad ambienteDIAN.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmbienteDIAN() {
        return ambienteDIAN;
    }

    /**
     * Define el valor de la propiedad ambienteDIAN.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmbienteDIAN(String value) {
        this.ambienteDIAN = value;
    }

    /**
     * Obtiene el valor de la propiedad codigo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * Define el valor de la propiedad codigo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigo(String value) {
        this.codigo = value;
    }

    /**
     * Obtiene el valor de la propiedad comentario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComentario() {
        return comentario;
    }

    /**
     * Define el valor de la propiedad comentario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComentario(String value) {
        this.comentario = value;
    }

    /**
     * Obtiene el valor de la propiedad cufe.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCufe() {
        return cufe;
    }

    /**
     * Define el valor de la propiedad cufe.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCufe(String value) {
        this.cufe = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcionEvento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcionEvento() {
        return descripcionEvento;
    }

    /**
     * Define el valor de la propiedad descripcionEvento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcionEvento(String value) {
        this.descripcionEvento = value;
    }

    /**
     * Obtiene el valor de la propiedad emisorNumeroDocumento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmisorNumeroDocumento() {
        return emisorNumeroDocumento;
    }

    /**
     * Define el valor de la propiedad emisorNumeroDocumento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmisorNumeroDocumento(String value) {
        this.emisorNumeroDocumento = value;
    }

    /**
     * Obtiene el valor de la propiedad emisorNumeroDocumentoDV.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmisorNumeroDocumentoDV() {
        return emisorNumeroDocumentoDV;
    }

    /**
     * Define el valor de la propiedad emisorNumeroDocumentoDV.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmisorNumeroDocumentoDV(String value) {
        this.emisorNumeroDocumentoDV = value;
    }

    /**
     * Obtiene el valor de la propiedad emisorRazonSocial.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmisorRazonSocial() {
        return emisorRazonSocial;
    }

    /**
     * Define el valor de la propiedad emisorRazonSocial.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmisorRazonSocial(String value) {
        this.emisorRazonSocial = value;
    }

    /**
     * Obtiene el valor de la propiedad emisorTipoIdentificacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmisorTipoIdentificacion() {
        return emisorTipoIdentificacion;
    }

    /**
     * Define el valor de la propiedad emisorTipoIdentificacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmisorTipoIdentificacion(String value) {
        this.emisorTipoIdentificacion = value;
    }

    /**
     * Obtiene el valor de la propiedad extras.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfExtrasEvento }
     *     
     */
    public ArrayOfExtrasEvento getExtras() {
        return extras;
    }

    /**
     * Define el valor de la propiedad extras.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfExtrasEvento }
     *     
     */
    public void setExtras(ArrayOfExtrasEvento value) {
        this.extras = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaEmision.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaEmision() {
        return fechaEmision;
    }

    /**
     * Define el valor de la propiedad fechaEmision.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaEmision(String value) {
        this.fechaEmision = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaRecepcion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaRecepcion() {
        return fechaRecepcion;
    }

    /**
     * Define el valor de la propiedad fechaRecepcion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaRecepcion(String value) {
        this.fechaRecepcion = value;
    }

    /**
     * Obtiene el valor de la propiedad hash.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHash() {
        return hash;
    }

    /**
     * Define el valor de la propiedad hash.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHash(String value) {
        this.hash = value;
    }

    /**
     * Obtiene el valor de la propiedad idPerfilDIAN.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdPerfilDIAN() {
        return idPerfilDIAN;
    }

    /**
     * Define el valor de la propiedad idPerfilDIAN.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdPerfilDIAN(String value) {
        this.idPerfilDIAN = value;
    }

    /**
     * Obtiene el valor de la propiedad mensaje.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMensaje() {
        return mensaje;
    }

    /**
     * Define el valor de la propiedad mensaje.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMensaje(String value) {
        this.mensaje = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreArchivoXML.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreArchivoXML() {
        return nombreArchivoXML;
    }

    /**
     * Define el valor de la propiedad nombreArchivoXML.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreArchivoXML(String value) {
        this.nombreArchivoXML = value;
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
     * Obtiene el valor de la propiedad numeroDelEvento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroDelEvento() {
        return numeroDelEvento;
    }

    /**
     * Define el valor de la propiedad numeroDelEvento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroDelEvento(String value) {
        this.numeroDelEvento = value;
    }

    /**
     * Obtiene el valor de la propiedad receptorNumeroDocumento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceptorNumeroDocumento() {
        return receptorNumeroDocumento;
    }

    /**
     * Define el valor de la propiedad receptorNumeroDocumento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceptorNumeroDocumento(String value) {
        this.receptorNumeroDocumento = value;
    }

    /**
     * Obtiene el valor de la propiedad receptorNumeroDocumentoDV.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceptorNumeroDocumentoDV() {
        return receptorNumeroDocumentoDV;
    }

    /**
     * Define el valor de la propiedad receptorNumeroDocumentoDV.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceptorNumeroDocumentoDV(String value) {
        this.receptorNumeroDocumentoDV = value;
    }

    /**
     * Obtiene el valor de la propiedad receptorRazonSocial.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceptorRazonSocial() {
        return receptorRazonSocial;
    }

    /**
     * Define el valor de la propiedad receptorRazonSocial.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceptorRazonSocial(String value) {
        this.receptorRazonSocial = value;
    }

    /**
     * Obtiene el valor de la propiedad receptorTipoIdentificacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceptorTipoIdentificacion() {
        return receptorTipoIdentificacion;
    }

    /**
     * Define el valor de la propiedad receptorTipoIdentificacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceptorTipoIdentificacion(String value) {
        this.receptorTipoIdentificacion = value;
    }

    /**
     * Obtiene el valor de la propiedad resultado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultado() {
        return resultado;
    }

    /**
     * Define el valor de la propiedad resultado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResultado(String value) {
        this.resultado = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoCufe.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoCufe() {
        return tipoCufe;
    }

    /**
     * Define el valor de la propiedad tipoCufe.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoCufe(String value) {
        this.tipoCufe = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoEvento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoEvento() {
        return tipoEvento;
    }

    /**
     * Define el valor de la propiedad tipoEvento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoEvento(String value) {
        this.tipoEvento = value;
    }

    /**
     * Obtiene el valor de la propiedad versionUBL.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersionUBL() {
        return versionUBL;
    }

    /**
     * Define el valor de la propiedad versionUBL.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersionUBL(String value) {
        this.versionUBL = value;
    }

    /**
     * Obtiene el valor de la propiedad xml.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXml() {
        return xml;
    }

    /**
     * Define el valor de la propiedad xml.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXml(String value) {
        this.xml = value;
    }

}
