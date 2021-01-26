
package org.jco.jaxws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Extras complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Extras"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="controlInterno1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="controlInterno2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pdf" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="valor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "Extras", propOrder = {
    "controlInterno1",
    "controlInterno2",
    "nombre",
    "pdf",
    "valor",
    "xml"
})
public class Extras {

    @XmlElement(nillable = true)
    protected String controlInterno1;
    @XmlElement(nillable = true)
    protected String controlInterno2;
    @XmlElement(nillable = true)
    protected String nombre;
    @XmlElement(nillable = true)
    protected String pdf;
    @XmlElement(nillable = true)
    protected String valor;
    @XmlElement(nillable = true)
    protected String xml;

    /**
     * Obtiene el valor de la propiedad controlInterno1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getControlInterno1() {
        return controlInterno1;
    }

    /**
     * Define el valor de la propiedad controlInterno1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setControlInterno1(String value) {
        this.controlInterno1 = value;
    }

    /**
     * Obtiene el valor de la propiedad controlInterno2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getControlInterno2() {
        return controlInterno2;
    }

    /**
     * Define el valor de la propiedad controlInterno2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setControlInterno2(String value) {
        this.controlInterno2 = value;
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
     * Obtiene el valor de la propiedad pdf.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPdf() {
        return pdf;
    }

    /**
     * Define el valor de la propiedad pdf.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPdf(String value) {
        this.pdf = value;
    }

    /**
     * Obtiene el valor de la propiedad valor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValor() {
        return valor;
    }

    /**
     * Define el valor de la propiedad valor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValor(String value) {
        this.valor = value;
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
