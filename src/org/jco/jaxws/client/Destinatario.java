
package org.jco.jaxws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Destinatario complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Destinatario"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="canalDeEntrega" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="email" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/&gt;
 *         &lt;element name="extras" type="{http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object}ArrayOfExtensible" minOccurs="0"/&gt;
 *         &lt;element name="fechaProgramada" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mensajePersonalizado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nitProveedorReceptor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="telefono" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Destinatario", propOrder = {
    "canalDeEntrega",
    "email",
    "extras",
    "fechaProgramada",
    "mensajePersonalizado",
    "nitProveedorReceptor",
    "telefono"
})
public class Destinatario {

    @XmlElement(nillable = true)
    protected String canalDeEntrega;
    @XmlElement(nillable = true)
    protected ArrayOfstring email;
    @XmlElement(nillable = true)
    protected ArrayOfExtensible extras;
    @XmlElement(nillable = true)
    protected String fechaProgramada;
    @XmlElement(nillable = true)
    protected String mensajePersonalizado;
    @XmlElement(nillable = true)
    protected String nitProveedorReceptor;
    @XmlElement(nillable = true)
    protected String telefono;

    /**
     * Obtiene el valor de la propiedad canalDeEntrega.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCanalDeEntrega() {
        return canalDeEntrega;
    }

    /**
     * Define el valor de la propiedad canalDeEntrega.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCanalDeEntrega(String value) {
        this.canalDeEntrega = value;
    }

    /**
     * Obtiene el valor de la propiedad email.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfstring }
     *     
     */
    public ArrayOfstring getEmail() {
        return email;
    }

    /**
     * Define el valor de la propiedad email.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfstring }
     *     
     */
    public void setEmail(ArrayOfstring value) {
        this.email = value;
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
     * Obtiene el valor de la propiedad fechaProgramada.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaProgramada() {
        return fechaProgramada;
    }

    /**
     * Define el valor de la propiedad fechaProgramada.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaProgramada(String value) {
        this.fechaProgramada = value;
    }

    /**
     * Obtiene el valor de la propiedad mensajePersonalizado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMensajePersonalizado() {
        return mensajePersonalizado;
    }

    /**
     * Define el valor de la propiedad mensajePersonalizado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMensajePersonalizado(String value) {
        this.mensajePersonalizado = value;
    }

    /**
     * Obtiene el valor de la propiedad nitProveedorReceptor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNitProveedorReceptor() {
        return nitProveedorReceptor;
    }

    /**
     * Define el valor de la propiedad nitProveedorReceptor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNitProveedorReceptor(String value) {
        this.nitProveedorReceptor = value;
    }

    /**
     * Obtiene el valor de la propiedad telefono.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Define el valor de la propiedad telefono.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelefono(String value) {
        this.telefono = value;
    }

}
