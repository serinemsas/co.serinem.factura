
package org.jco.jaxws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Anticipos complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Anticipos"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="extras" type="{http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object}ArrayOfExtensible" minOccurs="0"/&gt;
 *         &lt;element name="fechaDeRecibido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fechadePago" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="horaDePago" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="instrucciones" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="montoPagado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Anticipos", propOrder = {
    "extras",
    "fechaDeRecibido",
    "fechadePago",
    "horaDePago",
    "id",
    "instrucciones",
    "montoPagado"
})
public class Anticipos {

    @XmlElement(nillable = true)
    protected ArrayOfExtensible extras;
    @XmlElement(nillable = true)
    protected String fechaDeRecibido;
    @XmlElement(nillable = true)
    protected String fechadePago;
    @XmlElement(nillable = true)
    protected String horaDePago;
    @XmlElement(nillable = true)
    protected String id;
    @XmlElement(nillable = true)
    protected String instrucciones;
    @XmlElement(nillable = true)
    protected String montoPagado;

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
     * Obtiene el valor de la propiedad fechaDeRecibido.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaDeRecibido() {
        return fechaDeRecibido;
    }

    /**
     * Define el valor de la propiedad fechaDeRecibido.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaDeRecibido(String value) {
        this.fechaDeRecibido = value;
    }

    /**
     * Obtiene el valor de la propiedad fechadePago.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechadePago() {
        return fechadePago;
    }

    /**
     * Define el valor de la propiedad fechadePago.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechadePago(String value) {
        this.fechadePago = value;
    }

    /**
     * Obtiene el valor de la propiedad horaDePago.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHoraDePago() {
        return horaDePago;
    }

    /**
     * Define el valor de la propiedad horaDePago.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHoraDePago(String value) {
        this.horaDePago = value;
    }

    /**
     * Obtiene el valor de la propiedad id.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Obtiene el valor de la propiedad instrucciones.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstrucciones() {
        return instrucciones;
    }

    /**
     * Define el valor de la propiedad instrucciones.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstrucciones(String value) {
        this.instrucciones = value;
    }

    /**
     * Obtiene el valor de la propiedad montoPagado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMontoPagado() {
        return montoPagado;
    }

    /**
     * Define el valor de la propiedad montoPagado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMontoPagado(String value) {
        this.montoPagado = value;
    }

}
