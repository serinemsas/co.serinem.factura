
package org.jco.jaxws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Entrega complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Entrega"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="datosTransportistas" type="{http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object}DatosDelTransportista" minOccurs="0"/&gt;
 *         &lt;element name="direccionDespacho" type="{http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object}Direccion" minOccurs="0"/&gt;
 *         &lt;element name="direccionEntrega" type="{http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object}Direccion" minOccurs="0"/&gt;
 *         &lt;element name="extras" type="{http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object}ArrayOfExtensible" minOccurs="0"/&gt;
 *         &lt;element name="fechaEfectivaSalida" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fechaEstimada" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fechaReal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fechaSolicitada" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="identificacionTransporte" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="matriculaTransporte" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Entrega", propOrder = {
    "datosTransportistas",
    "direccionDespacho",
    "direccionEntrega",
    "extras",
    "fechaEfectivaSalida",
    "fechaEstimada",
    "fechaReal",
    "fechaSolicitada",
    "identificacionTransporte",
    "matriculaTransporte"
})
public class Entrega {

    @XmlElement(nillable = true)
    protected DatosDelTransportista datosTransportistas;
    @XmlElement(nillable = true)
    protected Direccion direccionDespacho;
    @XmlElement(nillable = true)
    protected Direccion direccionEntrega;
    @XmlElement(nillable = true)
    protected ArrayOfExtensible extras;
    @XmlElement(nillable = true)
    protected String fechaEfectivaSalida;
    @XmlElement(nillable = true)
    protected String fechaEstimada;
    @XmlElement(nillable = true)
    protected String fechaReal;
    @XmlElement(nillable = true)
    protected String fechaSolicitada;
    @XmlElement(nillable = true)
    protected String identificacionTransporte;
    @XmlElement(nillable = true)
    protected String matriculaTransporte;

    /**
     * Obtiene el valor de la propiedad datosTransportistas.
     * 
     * @return
     *     possible object is
     *     {@link DatosDelTransportista }
     *     
     */
    public DatosDelTransportista getDatosTransportistas() {
        return datosTransportistas;
    }

    /**
     * Define el valor de la propiedad datosTransportistas.
     * 
     * @param value
     *     allowed object is
     *     {@link DatosDelTransportista }
     *     
     */
    public void setDatosTransportistas(DatosDelTransportista value) {
        this.datosTransportistas = value;
    }

    /**
     * Obtiene el valor de la propiedad direccionDespacho.
     * 
     * @return
     *     possible object is
     *     {@link Direccion }
     *     
     */
    public Direccion getDireccionDespacho() {
        return direccionDespacho;
    }

    /**
     * Define el valor de la propiedad direccionDespacho.
     * 
     * @param value
     *     allowed object is
     *     {@link Direccion }
     *     
     */
    public void setDireccionDespacho(Direccion value) {
        this.direccionDespacho = value;
    }

    /**
     * Obtiene el valor de la propiedad direccionEntrega.
     * 
     * @return
     *     possible object is
     *     {@link Direccion }
     *     
     */
    public Direccion getDireccionEntrega() {
        return direccionEntrega;
    }

    /**
     * Define el valor de la propiedad direccionEntrega.
     * 
     * @param value
     *     allowed object is
     *     {@link Direccion }
     *     
     */
    public void setDireccionEntrega(Direccion value) {
        this.direccionEntrega = value;
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
     * Obtiene el valor de la propiedad fechaEfectivaSalida.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaEfectivaSalida() {
        return fechaEfectivaSalida;
    }

    /**
     * Define el valor de la propiedad fechaEfectivaSalida.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaEfectivaSalida(String value) {
        this.fechaEfectivaSalida = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaEstimada.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaEstimada() {
        return fechaEstimada;
    }

    /**
     * Define el valor de la propiedad fechaEstimada.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaEstimada(String value) {
        this.fechaEstimada = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaReal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaReal() {
        return fechaReal;
    }

    /**
     * Define el valor de la propiedad fechaReal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaReal(String value) {
        this.fechaReal = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaSolicitada.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaSolicitada() {
        return fechaSolicitada;
    }

    /**
     * Define el valor de la propiedad fechaSolicitada.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaSolicitada(String value) {
        this.fechaSolicitada = value;
    }

    /**
     * Obtiene el valor de la propiedad identificacionTransporte.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificacionTransporte() {
        return identificacionTransporte;
    }

    /**
     * Define el valor de la propiedad identificacionTransporte.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificacionTransporte(String value) {
        this.identificacionTransporte = value;
    }

    /**
     * Obtiene el valor de la propiedad matriculaTransporte.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatriculaTransporte() {
        return matriculaTransporte;
    }

    /**
     * Define el valor de la propiedad matriculaTransporte.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatriculaTransporte(String value) {
        this.matriculaTransporte = value;
    }

}
