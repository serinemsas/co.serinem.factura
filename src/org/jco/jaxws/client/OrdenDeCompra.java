
package org.jco.jaxws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para OrdenDeCompra complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="OrdenDeCompra"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codigoCliente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="documentoReferencia" type="{http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object}DocumentoReferenciado" minOccurs="0"/&gt;
 *         &lt;element name="extras" type="{http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object}ArrayOfExtensible" minOccurs="0"/&gt;
 *         &lt;element name="fecha" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="numeroOrden" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="numeroPedido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tipoCUFE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tipoOrden" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="uuid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrdenDeCompra", propOrder = {
    "codigoCliente",
    "documentoReferencia",
    "extras",
    "fecha",
    "numeroOrden",
    "numeroPedido",
    "tipoCUFE",
    "tipoOrden",
    "uuid"
})
public class OrdenDeCompra {

    @XmlElement(nillable = true)
    protected String codigoCliente;
    @XmlElement(nillable = true)
    protected DocumentoReferenciado documentoReferencia;
    @XmlElement(nillable = true)
    protected ArrayOfExtensible extras;
    @XmlElement(nillable = true)
    protected String fecha;
    @XmlElement(nillable = true)
    protected String numeroOrden;
    @XmlElement(nillable = true)
    protected String numeroPedido;
    @XmlElement(nillable = true)
    protected String tipoCUFE;
    @XmlElement(nillable = true)
    protected String tipoOrden;
    @XmlElement(nillable = true)
    protected String uuid;

    /**
     * Obtiene el valor de la propiedad codigoCliente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoCliente() {
        return codigoCliente;
    }

    /**
     * Define el valor de la propiedad codigoCliente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoCliente(String value) {
        this.codigoCliente = value;
    }

    /**
     * Obtiene el valor de la propiedad documentoReferencia.
     * 
     * @return
     *     possible object is
     *     {@link DocumentoReferenciado }
     *     
     */
    public DocumentoReferenciado getDocumentoReferencia() {
        return documentoReferencia;
    }

    /**
     * Define el valor de la propiedad documentoReferencia.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentoReferenciado }
     *     
     */
    public void setDocumentoReferencia(DocumentoReferenciado value) {
        this.documentoReferencia = value;
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
     * Obtiene el valor de la propiedad numeroOrden.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroOrden() {
        return numeroOrden;
    }

    /**
     * Define el valor de la propiedad numeroOrden.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroOrden(String value) {
        this.numeroOrden = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroPedido.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroPedido() {
        return numeroPedido;
    }

    /**
     * Define el valor de la propiedad numeroPedido.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroPedido(String value) {
        this.numeroPedido = value;
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
     * Obtiene el valor de la propiedad tipoOrden.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoOrden() {
        return tipoOrden;
    }

    /**
     * Define el valor de la propiedad tipoOrden.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoOrden(String value) {
        this.tipoOrden = value;
    }

    /**
     * Obtiene el valor de la propiedad uuid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * Define el valor de la propiedad uuid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUuid(String value) {
        this.uuid = value;
    }

}
