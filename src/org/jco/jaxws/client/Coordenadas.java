
package org.jco.jaxws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Coordenadas complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Coordenadas"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="gradosLatitud" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="gradosLongitud" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="minutosLatitud" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="minutosLongitud" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="orientacionLatitud" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="orientacionLongitud" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Coordenadas", propOrder = {
    "gradosLatitud",
    "gradosLongitud",
    "minutosLatitud",
    "minutosLongitud",
    "orientacionLatitud",
    "orientacionLongitud"
})
public class Coordenadas {

    @XmlElement(nillable = true)
    protected String gradosLatitud;
    @XmlElement(nillable = true)
    protected String gradosLongitud;
    @XmlElement(nillable = true)
    protected String minutosLatitud;
    @XmlElement(nillable = true)
    protected String minutosLongitud;
    @XmlElement(nillable = true)
    protected String orientacionLatitud;
    @XmlElement(nillable = true)
    protected String orientacionLongitud;

    /**
     * Obtiene el valor de la propiedad gradosLatitud.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGradosLatitud() {
        return gradosLatitud;
    }

    /**
     * Define el valor de la propiedad gradosLatitud.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGradosLatitud(String value) {
        this.gradosLatitud = value;
    }

    /**
     * Obtiene el valor de la propiedad gradosLongitud.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGradosLongitud() {
        return gradosLongitud;
    }

    /**
     * Define el valor de la propiedad gradosLongitud.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGradosLongitud(String value) {
        this.gradosLongitud = value;
    }

    /**
     * Obtiene el valor de la propiedad minutosLatitud.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinutosLatitud() {
        return minutosLatitud;
    }

    /**
     * Define el valor de la propiedad minutosLatitud.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinutosLatitud(String value) {
        this.minutosLatitud = value;
    }

    /**
     * Obtiene el valor de la propiedad minutosLongitud.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinutosLongitud() {
        return minutosLongitud;
    }

    /**
     * Define el valor de la propiedad minutosLongitud.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinutosLongitud(String value) {
        this.minutosLongitud = value;
    }

    /**
     * Obtiene el valor de la propiedad orientacionLatitud.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrientacionLatitud() {
        return orientacionLatitud;
    }

    /**
     * Define el valor de la propiedad orientacionLatitud.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrientacionLatitud(String value) {
        this.orientacionLatitud = value;
    }

    /**
     * Obtiene el valor de la propiedad orientacionLongitud.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrientacionLongitud() {
        return orientacionLongitud;
    }

    /**
     * Define el valor de la propiedad orientacionLongitud.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrientacionLongitud(String value) {
        this.orientacionLongitud = value;
    }

}
