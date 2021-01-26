
package org.jco.jaxws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ImpuestosTotales complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ImpuestosTotales"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codigoTOTALImp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="extras" type="{http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object}ArrayOfExtensible" minOccurs="0"/&gt;
 *         &lt;element name="montoTotal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImpuestosTotales", propOrder = {
    "codigoTOTALImp",
    "extras",
    "montoTotal"
})
public class ImpuestosTotales {

    @XmlElement(nillable = true)
    protected String codigoTOTALImp;
    @XmlElement(nillable = true)
    protected ArrayOfExtensible extras;
    @XmlElement(nillable = true)
    protected String montoTotal;

    /**
     * Obtiene el valor de la propiedad codigoTOTALImp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoTOTALImp() {
        return codigoTOTALImp;
    }

    /**
     * Define el valor de la propiedad codigoTOTALImp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoTOTALImp(String value) {
        this.codigoTOTALImp = value;
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
     * Obtiene el valor de la propiedad montoTotal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMontoTotal() {
        return montoTotal;
    }

    /**
     * Define el valor de la propiedad montoTotal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMontoTotal(String value) {
        this.montoTotal = value;
    }

}
