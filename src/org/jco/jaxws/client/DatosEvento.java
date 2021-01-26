
package org.jco.jaxws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para DatosEvento complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DatosEvento"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codigoEvento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codigoInterno1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codigoInterno2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="comentario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="documento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="extras" type="{http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object}ArrayOfDatosExtras" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DatosEvento", propOrder = {
    "codigoEvento",
    "codigoInterno1",
    "codigoInterno2",
    "comentario",
    "documento",
    "extras"
})
public class DatosEvento {

    @XmlElement(nillable = true)
    protected String codigoEvento;
    @XmlElement(nillable = true)
    protected String codigoInterno1;
    @XmlElement(nillable = true)
    protected String codigoInterno2;
    @XmlElement(nillable = true)
    protected String comentario;
    @XmlElement(nillable = true)
    protected String documento;
    @XmlElement(nillable = true)
    protected ArrayOfDatosExtras extras;

    /**
     * Obtiene el valor de la propiedad codigoEvento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoEvento() {
        return codigoEvento;
    }

    /**
     * Define el valor de la propiedad codigoEvento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoEvento(String value) {
        this.codigoEvento = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoInterno1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoInterno1() {
        return codigoInterno1;
    }

    /**
     * Define el valor de la propiedad codigoInterno1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoInterno1(String value) {
        this.codigoInterno1 = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoInterno2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoInterno2() {
        return codigoInterno2;
    }

    /**
     * Define el valor de la propiedad codigoInterno2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoInterno2(String value) {
        this.codigoInterno2 = value;
    }

    /**
     * Obtiene el valor de la propiedad comentario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComentario() {
        return comentario;
    }

    /**
     * Define el valor de la propiedad comentario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComentario(String value) {
        this.comentario = value;
    }

    /**
     * Obtiene el valor de la propiedad documento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumento() {
        return documento;
    }

    /**
     * Define el valor de la propiedad documento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumento(String value) {
        this.documento = value;
    }

    /**
     * Obtiene el valor de la propiedad extras.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDatosExtras }
     *     
     */
    public ArrayOfDatosExtras getExtras() {
        return extras;
    }

    /**
     * Define el valor de la propiedad extras.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDatosExtras }
     *     
     */
    public void setExtras(ArrayOfDatosExtras value) {
        this.extras = value;
    }

}
