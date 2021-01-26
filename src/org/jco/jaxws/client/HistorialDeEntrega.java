
package org.jco.jaxws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para HistorialDeEntrega complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="HistorialDeEntrega"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LeidoEmailIPAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LeidoEstatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LeidoFecha" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="canalDeEntrega" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="email" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/&gt;
 *         &lt;element name="entregaEstatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="entregaEstatusDescripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="entregaFecha" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fechaProgramada" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mensajePersonalizado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nitProveedorReceptor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="recepcionEmailComentario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="recepcionEmailEstatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="recepcionEmailFecha" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="recepcionEmailIPAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "HistorialDeEntrega", propOrder = {
    "leidoEmailIPAddress",
    "leidoEstatus",
    "leidoFecha",
    "canalDeEntrega",
    "email",
    "entregaEstatus",
    "entregaEstatusDescripcion",
    "entregaFecha",
    "fechaProgramada",
    "mensajePersonalizado",
    "nitProveedorReceptor",
    "recepcionEmailComentario",
    "recepcionEmailEstatus",
    "recepcionEmailFecha",
    "recepcionEmailIPAddress",
    "telefono"
})
public class HistorialDeEntrega {

    @XmlElement(name = "LeidoEmailIPAddress", nillable = true)
    protected String leidoEmailIPAddress;
    @XmlElement(name = "LeidoEstatus", nillable = true)
    protected String leidoEstatus;
    @XmlElement(name = "LeidoFecha", nillable = true)
    protected String leidoFecha;
    @XmlElement(nillable = true)
    protected String canalDeEntrega;
    @XmlElement(nillable = true)
    protected ArrayOfstring email;
    @XmlElement(nillable = true)
    protected String entregaEstatus;
    @XmlElement(nillable = true)
    protected String entregaEstatusDescripcion;
    @XmlElement(nillable = true)
    protected String entregaFecha;
    @XmlElement(nillable = true)
    protected String fechaProgramada;
    @XmlElement(nillable = true)
    protected String mensajePersonalizado;
    @XmlElement(nillable = true)
    protected String nitProveedorReceptor;
    @XmlElement(nillable = true)
    protected String recepcionEmailComentario;
    @XmlElement(nillable = true)
    protected String recepcionEmailEstatus;
    @XmlElement(nillable = true)
    protected String recepcionEmailFecha;
    @XmlElement(nillable = true)
    protected String recepcionEmailIPAddress;
    @XmlElement(nillable = true)
    protected String telefono;

    /**
     * Obtiene el valor de la propiedad leidoEmailIPAddress.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLeidoEmailIPAddress() {
        return leidoEmailIPAddress;
    }

    /**
     * Define el valor de la propiedad leidoEmailIPAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLeidoEmailIPAddress(String value) {
        this.leidoEmailIPAddress = value;
    }

    /**
     * Obtiene el valor de la propiedad leidoEstatus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLeidoEstatus() {
        return leidoEstatus;
    }

    /**
     * Define el valor de la propiedad leidoEstatus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLeidoEstatus(String value) {
        this.leidoEstatus = value;
    }

    /**
     * Obtiene el valor de la propiedad leidoFecha.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLeidoFecha() {
        return leidoFecha;
    }

    /**
     * Define el valor de la propiedad leidoFecha.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLeidoFecha(String value) {
        this.leidoFecha = value;
    }

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
     * Obtiene el valor de la propiedad entregaEstatus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntregaEstatus() {
        return entregaEstatus;
    }

    /**
     * Define el valor de la propiedad entregaEstatus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntregaEstatus(String value) {
        this.entregaEstatus = value;
    }

    /**
     * Obtiene el valor de la propiedad entregaEstatusDescripcion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntregaEstatusDescripcion() {
        return entregaEstatusDescripcion;
    }

    /**
     * Define el valor de la propiedad entregaEstatusDescripcion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntregaEstatusDescripcion(String value) {
        this.entregaEstatusDescripcion = value;
    }

    /**
     * Obtiene el valor de la propiedad entregaFecha.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntregaFecha() {
        return entregaFecha;
    }

    /**
     * Define el valor de la propiedad entregaFecha.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntregaFecha(String value) {
        this.entregaFecha = value;
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
     * Obtiene el valor de la propiedad recepcionEmailComentario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecepcionEmailComentario() {
        return recepcionEmailComentario;
    }

    /**
     * Define el valor de la propiedad recepcionEmailComentario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecepcionEmailComentario(String value) {
        this.recepcionEmailComentario = value;
    }

    /**
     * Obtiene el valor de la propiedad recepcionEmailEstatus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecepcionEmailEstatus() {
        return recepcionEmailEstatus;
    }

    /**
     * Define el valor de la propiedad recepcionEmailEstatus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecepcionEmailEstatus(String value) {
        this.recepcionEmailEstatus = value;
    }

    /**
     * Obtiene el valor de la propiedad recepcionEmailFecha.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecepcionEmailFecha() {
        return recepcionEmailFecha;
    }

    /**
     * Define el valor de la propiedad recepcionEmailFecha.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecepcionEmailFecha(String value) {
        this.recepcionEmailFecha = value;
    }

    /**
     * Obtiene el valor de la propiedad recepcionEmailIPAddress.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecepcionEmailIPAddress() {
        return recepcionEmailIPAddress;
    }

    /**
     * Define el valor de la propiedad recepcionEmailIPAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecepcionEmailIPAddress(String value) {
        this.recepcionEmailIPAddress = value;
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
