
package org.jco.jaxws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para DocumentoReferenciado complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DocumentoReferenciado"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codigoEstatusDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codigoInterno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cufeDocReferenciado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="descripcion" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/&gt;
 *         &lt;element name="extras" type="{http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object}ArrayOfExtensible" minOccurs="0"/&gt;
 *         &lt;element name="fecha" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fechaFinValidez" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fechaInicioValidez" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="numeroDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tipoCUFE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tipoDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tipoDocumentoCodigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentoReferenciado", propOrder = {
    "codigoEstatusDocumento",
    "codigoInterno",
    "cufeDocReferenciado",
    "descripcion",
    "extras",
    "fecha",
    "fechaFinValidez",
    "fechaInicioValidez",
    "numeroDocumento",
    "tipoCUFE",
    "tipoDocumento",
    "tipoDocumentoCodigo"
})
public class DocumentoReferenciado {

    @XmlElement(nillable = true)
    protected String codigoEstatusDocumento;
    @XmlElement(nillable = true)
    protected String codigoInterno;
    @XmlElement(nillable = true)
    protected String cufeDocReferenciado;
    @XmlElement(nillable = true)
    protected ArrayOfstring descripcion;
    @XmlElement(nillable = true)
    protected ArrayOfExtensible extras;
    @XmlElement(nillable = true)
    protected String fecha;
    @XmlElement(nillable = true)
    protected String fechaFinValidez;
    @XmlElement(nillable = true)
    protected String fechaInicioValidez;
    @XmlElement(nillable = true)
    protected String numeroDocumento;
    @XmlElement(nillable = true)
    protected String tipoCUFE;
    @XmlElement(nillable = true)
    protected String tipoDocumento;
    @XmlElement(nillable = true)
    protected String tipoDocumentoCodigo;

    /**
     * Obtiene el valor de la propiedad codigoEstatusDocumento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoEstatusDocumento() {
        return codigoEstatusDocumento;
    }

    /**
     * Define el valor de la propiedad codigoEstatusDocumento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoEstatusDocumento(String value) {
        this.codigoEstatusDocumento = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoInterno.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoInterno() {
        return codigoInterno;
    }

    /**
     * Define el valor de la propiedad codigoInterno.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoInterno(String value) {
        this.codigoInterno = value;
    }

    /**
     * Obtiene el valor de la propiedad cufeDocReferenciado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCufeDocReferenciado() {
        return cufeDocReferenciado;
    }

    /**
     * Define el valor de la propiedad cufeDocReferenciado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCufeDocReferenciado(String value) {
        this.cufeDocReferenciado = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcion.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfstring }
     *     
     */
    public ArrayOfstring getDescripcion() {
        return descripcion;
    }

    /**
     * Define el valor de la propiedad descripcion.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfstring }
     *     
     */
    public void setDescripcion(ArrayOfstring value) {
        this.descripcion = value;
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
     * Obtiene el valor de la propiedad fecha.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * Define el valor de la propiedad fecha.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFecha(String value) {
        this.fecha = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaFinValidez.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaFinValidez() {
        return fechaFinValidez;
    }

    /**
     * Define el valor de la propiedad fechaFinValidez.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaFinValidez(String value) {
        this.fechaFinValidez = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaInicioValidez.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaInicioValidez() {
        return fechaInicioValidez;
    }

    /**
     * Define el valor de la propiedad fechaInicioValidez.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaInicioValidez(String value) {
        this.fechaInicioValidez = value;
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
     * Obtiene el valor de la propiedad tipoCUFE.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoCUFE() {
        return tipoCUFE;
    }

    /**
     * Define el valor de la propiedad tipoCUFE.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoCUFE(String value) {
        this.tipoCUFE = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoDocumento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoDocumento() {
        return tipoDocumento;
    }

    /**
     * Define el valor de la propiedad tipoDocumento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoDocumento(String value) {
        this.tipoDocumento = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoDocumentoCodigo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoDocumentoCodigo() {
        return tipoDocumentoCodigo;
    }

    /**
     * Define el valor de la propiedad tipoDocumentoCodigo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoDocumentoCodigo(String value) {
        this.tipoDocumentoCodigo = value;
    }

}
