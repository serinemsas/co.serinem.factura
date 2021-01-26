
package org.jco.jaxws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para DocumentResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DocumentResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codigo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="consecutivoDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cufe" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="esValidoDian" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="fechaAceptacionDIAN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fechaRespuesta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="hash" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mensaje" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mensajesValidacion" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/&gt;
 *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="qr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="reglasNotificacionDIAN" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/&gt;
 *         &lt;element name="reglasValidacionDIAN" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/&gt;
 *         &lt;element name="resultado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tipoCufe" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "DocumentResponse", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", propOrder = {
    "codigo",
    "consecutivoDocumento",
    "cufe",
    "esValidoDian",
    "fechaAceptacionDIAN",
    "fechaRespuesta",
    "hash",
    "mensaje",
    "mensajesValidacion",
    "nombre",
    "qr",
    "reglasNotificacionDIAN",
    "reglasValidacionDIAN",
    "resultado",
    "tipoCufe",
    "xml"
})
public class DocumentResponse {

    protected Integer codigo;
    @XmlElement(nillable = true)
    protected String consecutivoDocumento;
    @XmlElement(nillable = true)
    protected String cufe;
    protected Boolean esValidoDian;
    @XmlElement(nillable = true)
    protected String fechaAceptacionDIAN;
    @XmlElement(nillable = true)
    protected String fechaRespuesta;
    @XmlElement(nillable = true)
    protected String hash;
    @XmlElement(nillable = true)
    protected String mensaje;
    @XmlElement(nillable = true)
    protected ArrayOfstring mensajesValidacion;
    @XmlElement(nillable = true)
    protected String nombre;
    @XmlElement(nillable = true)
    protected String qr;
    @XmlElement(nillable = true)
    protected ArrayOfstring reglasNotificacionDIAN;
    @XmlElement(nillable = true)
    protected ArrayOfstring reglasValidacionDIAN;
    @XmlElement(nillable = true)
    protected String resultado;
    @XmlElement(nillable = true)
    protected String tipoCufe;
    @XmlElement(nillable = true)
    protected String xml;

    /**
     * Obtiene el valor de la propiedad codigo.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodigo() {
        return codigo;
    }

    /**
     * Define el valor de la propiedad codigo.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodigo(Integer value) {
        this.codigo = value;
    }

    /**
     * Obtiene el valor de la propiedad consecutivoDocumento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsecutivoDocumento() {
        return consecutivoDocumento;
    }

    /**
     * Define el valor de la propiedad consecutivoDocumento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsecutivoDocumento(String value) {
        this.consecutivoDocumento = value;
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
     * Obtiene el valor de la propiedad esValidoDian.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEsValidoDian() {
        return esValidoDian;
    }

    /**
     * Define el valor de la propiedad esValidoDian.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEsValidoDian(Boolean value) {
        this.esValidoDian = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaAceptacionDIAN.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaAceptacionDIAN() {
        return fechaAceptacionDIAN;
    }

    /**
     * Define el valor de la propiedad fechaAceptacionDIAN.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaAceptacionDIAN(String value) {
        this.fechaAceptacionDIAN = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaRespuesta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaRespuesta() {
        return fechaRespuesta;
    }

    /**
     * Define el valor de la propiedad fechaRespuesta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaRespuesta(String value) {
        this.fechaRespuesta = value;
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
     * Obtiene el valor de la propiedad mensajesValidacion.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfstring }
     *     
     */
    public ArrayOfstring getMensajesValidacion() {
        return mensajesValidacion;
    }

    /**
     * Define el valor de la propiedad mensajesValidacion.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfstring }
     *     
     */
    public void setMensajesValidacion(ArrayOfstring value) {
        this.mensajesValidacion = value;
    }

    /**
     * Obtiene el valor de la propiedad nombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Define el valor de la propiedad nombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombre(String value) {
        this.nombre = value;
    }

    /**
     * Obtiene el valor de la propiedad qr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQr() {
        return qr;
    }

    /**
     * Define el valor de la propiedad qr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQr(String value) {
        this.qr = value;
    }

    /**
     * Obtiene el valor de la propiedad reglasNotificacionDIAN.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfstring }
     *     
     */
    public ArrayOfstring getReglasNotificacionDIAN() {
        return reglasNotificacionDIAN;
    }

    /**
     * Define el valor de la propiedad reglasNotificacionDIAN.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfstring }
     *     
     */
    public void setReglasNotificacionDIAN(ArrayOfstring value) {
        this.reglasNotificacionDIAN = value;
    }

    /**
     * Obtiene el valor de la propiedad reglasValidacionDIAN.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfstring }
     *     
     */
    public ArrayOfstring getReglasValidacionDIAN() {
        return reglasValidacionDIAN;
    }

    /**
     * Define el valor de la propiedad reglasValidacionDIAN.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfstring }
     *     
     */
    public void setReglasValidacionDIAN(ArrayOfstring value) {
        this.reglasValidacionDIAN = value;
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
