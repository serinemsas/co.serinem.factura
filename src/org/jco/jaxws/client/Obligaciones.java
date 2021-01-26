
package org.jco.jaxws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Obligaciones complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Obligaciones"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="extras" type="{http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object}ArrayOfExtensible" minOccurs="0"/&gt;
 *         &lt;element name="obligaciones" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="regimen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Obligaciones", propOrder = {
    "extras",
    "obligaciones",
    "regimen"
})
public class Obligaciones {

    @XmlElement(nillable = true)
    protected ArrayOfExtensible extras;
    @XmlElement(nillable = true)
    protected String obligaciones;
    @XmlElement(nillable = true)
    protected String regimen;

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
     * Obtiene el valor de la propiedad obligaciones.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObligaciones() {
        return obligaciones;
    }

    /**
     * Define el valor de la propiedad obligaciones.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObligaciones(String value) {
        this.obligaciones = value;
    }

    /**
     * Obtiene el valor de la propiedad regimen.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegimen() {
        return regimen;
    }

    /**
     * Define el valor de la propiedad regimen.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegimen(String value) {
        this.regimen = value;
    }

}
