
package org.jco.jaxws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para MediosDePago complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="MediosDePago"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codigoBanco" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codigoCanalPago" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codigoReferencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="extras" type="{http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object}ArrayOfExtensible" minOccurs="0"/&gt;
 *         &lt;element name="fechaDeVencimiento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="medioPago" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="metodoDePago" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nombreBanco" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="numeroDeReferencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="numeroDias" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="numeroTransferencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MediosDePago", propOrder = {
    "codigoBanco",
    "codigoCanalPago",
    "codigoReferencia",
    "extras",
    "fechaDeVencimiento",
    "medioPago",
    "metodoDePago",
    "nombreBanco",
    "numeroDeReferencia",
    "numeroDias",
    "numeroTransferencia"
})
public class MediosDePago {

    @XmlElement(nillable = true)
    protected String codigoBanco;
    @XmlElement(nillable = true)
    protected String codigoCanalPago;
    @XmlElement(nillable = true)
    protected String codigoReferencia;
    @XmlElement(nillable = true)
    protected ArrayOfExtensible extras;
    @XmlElement(nillable = true)
    protected String fechaDeVencimiento;
    @XmlElement(nillable = true)
    protected String medioPago;
    @XmlElement(nillable = true)
    protected String metodoDePago;
    @XmlElement(nillable = true)
    protected String nombreBanco;
    @XmlElement(nillable = true)
    protected String numeroDeReferencia;
    @XmlElement(nillable = true)
    protected String numeroDias;
    @XmlElement(nillable = true)
    protected String numeroTransferencia;

    /**
     * Obtiene el valor de la propiedad codigoBanco.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoBanco() {
        return codigoBanco;
    }

    /**
     * Define el valor de la propiedad codigoBanco.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoBanco(String value) {
        this.codigoBanco = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoCanalPago.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoCanalPago() {
        return codigoCanalPago;
    }

    /**
     * Define el valor de la propiedad codigoCanalPago.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoCanalPago(String value) {
        this.codigoCanalPago = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoReferencia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoReferencia() {
        return codigoReferencia;
    }

    /**
     * Define el valor de la propiedad codigoReferencia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoReferencia(String value) {
        this.codigoReferencia = value;
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
     * Obtiene el valor de la propiedad fechaDeVencimiento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaDeVencimiento() {
        return fechaDeVencimiento;
    }

    /**
     * Define el valor de la propiedad fechaDeVencimiento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaDeVencimiento(String value) {
        this.fechaDeVencimiento = value;
    }

    /**
     * Obtiene el valor de la propiedad medioPago.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMedioPago() {
        return medioPago;
    }

    /**
     * Define el valor de la propiedad medioPago.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMedioPago(String value) {
        this.medioPago = value;
    }

    /**
     * Obtiene el valor de la propiedad metodoDePago.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMetodoDePago() {
        return metodoDePago;
    }

    /**
     * Define el valor de la propiedad metodoDePago.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMetodoDePago(String value) {
        this.metodoDePago = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreBanco.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreBanco() {
        return nombreBanco;
    }

    /**
     * Define el valor de la propiedad nombreBanco.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreBanco(String value) {
        this.nombreBanco = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroDeReferencia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroDeReferencia() {
        return numeroDeReferencia;
    }

    /**
     * Define el valor de la propiedad numeroDeReferencia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroDeReferencia(String value) {
        this.numeroDeReferencia = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroDias.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroDias() {
        return numeroDias;
    }

    /**
     * Define el valor de la propiedad numeroDias.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroDias(String value) {
        this.numeroDias = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroTransferencia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroTransferencia() {
        return numeroTransferencia;
    }

    /**
     * Define el valor de la propiedad numeroTransferencia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroTransferencia(String value) {
        this.numeroTransferencia = value;
    }

}
