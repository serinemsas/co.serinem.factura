
package org.jco.jaxws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para EventoResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="EventoResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codigo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="consecutivoDocumentoEvento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cufe" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fechaRespuesta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="hash" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mensaje" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "EventoResponse", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", propOrder = {
    "codigo",
    "consecutivoDocumentoEvento",
    "cufe",
    "fechaRespuesta",
    "hash",
    "mensaje",
    "resultado",
    "tipoCufe",
    "xml"
})
public class EventoResponse {

    protected Integer codigo;
    @XmlElement(nillable = true)
    protected String consecutivoDocumentoEvento;
    @XmlElement(nillable = true)
    protected String cufe;
    @XmlElement(nillable = true)
    protected String fechaRespuesta;
    @XmlElement(nillable = true)
    protected String hash;
    @XmlElement(nillable = true)
    protected String mensaje;
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
     * Obtiene el valor de la propiedad consecutivoDocumentoEvento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsecutivoDocumentoEvento() {
        return consecutivoDocumentoEvento;
    }

    /**
     * Define el valor de la propiedad consecutivoDocumentoEvento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsecutivoDocumentoEvento(String value) {
        this.consecutivoDocumentoEvento = value;
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
