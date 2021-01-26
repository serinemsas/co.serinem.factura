
package org.jco.jaxws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para TasaDeCambioAlternativa complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TasaDeCambioAlternativa"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="baseMonedaDestino" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="baseMonedaOrigen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="extras" type="{http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object}ArrayOfExtensible" minOccurs="0"/&gt;
 *         &lt;element name="fechaDeTasaDeCambio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="indicadorDeTasa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="monedaDestino" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="monedaOrigen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="operadorCalculo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tasaDeCambio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TasaDeCambioAlternativa", propOrder = {
    "baseMonedaDestino",
    "baseMonedaOrigen",
    "extras",
    "fechaDeTasaDeCambio",
    "indicadorDeTasa",
    "monedaDestino",
    "monedaOrigen",
    "operadorCalculo",
    "tasaDeCambio"
})
public class TasaDeCambioAlternativa {

    @XmlElement(nillable = true)
    protected String baseMonedaDestino;
    @XmlElement(nillable = true)
    protected String baseMonedaOrigen;
    @XmlElement(nillable = true)
    protected ArrayOfExtensible extras;
    @XmlElement(nillable = true)
    protected String fechaDeTasaDeCambio;
    @XmlElement(nillable = true)
    protected String indicadorDeTasa;
    @XmlElement(nillable = true)
    protected String monedaDestino;
    @XmlElement(nillable = true)
    protected String monedaOrigen;
    @XmlElement(nillable = true)
    protected String operadorCalculo;
    @XmlElement(nillable = true)
    protected String tasaDeCambio;

    /**
     * Obtiene el valor de la propiedad baseMonedaDestino.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseMonedaDestino() {
        return baseMonedaDestino;
    }

    /**
     * Define el valor de la propiedad baseMonedaDestino.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseMonedaDestino(String value) {
        this.baseMonedaDestino = value;
    }

    /**
     * Obtiene el valor de la propiedad baseMonedaOrigen.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseMonedaOrigen() {
        return baseMonedaOrigen;
    }

    /**
     * Define el valor de la propiedad baseMonedaOrigen.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseMonedaOrigen(String value) {
        this.baseMonedaOrigen = value;
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
     * Obtiene el valor de la propiedad fechaDeTasaDeCambio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaDeTasaDeCambio() {
        return fechaDeTasaDeCambio;
    }

    /**
     * Define el valor de la propiedad fechaDeTasaDeCambio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaDeTasaDeCambio(String value) {
        this.fechaDeTasaDeCambio = value;
    }

    /**
     * Obtiene el valor de la propiedad indicadorDeTasa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndicadorDeTasa() {
        return indicadorDeTasa;
    }

    /**
     * Define el valor de la propiedad indicadorDeTasa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndicadorDeTasa(String value) {
        this.indicadorDeTasa = value;
    }

    /**
     * Obtiene el valor de la propiedad monedaDestino.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMonedaDestino() {
        return monedaDestino;
    }

    /**
     * Define el valor de la propiedad monedaDestino.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMonedaDestino(String value) {
        this.monedaDestino = value;
    }

    /**
     * Obtiene el valor de la propiedad monedaOrigen.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMonedaOrigen() {
        return monedaOrigen;
    }

    /**
     * Define el valor de la propiedad monedaOrigen.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMonedaOrigen(String value) {
        this.monedaOrigen = value;
    }

    /**
     * Obtiene el valor de la propiedad operadorCalculo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperadorCalculo() {
        return operadorCalculo;
    }

    /**
     * Define el valor de la propiedad operadorCalculo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperadorCalculo(String value) {
        this.operadorCalculo = value;
    }

    /**
     * Obtiene el valor de la propiedad tasaDeCambio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTasaDeCambio() {
        return tasaDeCambio;
    }

    /**
     * Define el valor de la propiedad tasaDeCambio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTasaDeCambio(String value) {
        this.tasaDeCambio = value;
    }

}
