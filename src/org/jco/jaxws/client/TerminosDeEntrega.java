
package org.jco.jaxws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para TerminosDeEntrega complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TerminosDeEntrega"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cargosDescuentos" type="{http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object}ArrayOfCargosDescuentos" minOccurs="0"/&gt;
 *         &lt;element name="codigoCondicionEntrega" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="costoTransporte" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="direccionEntrega" type="{http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object}Direccion" minOccurs="0"/&gt;
 *         &lt;element name="extras" type="{http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object}ArrayOfExtensible" minOccurs="0"/&gt;
 *         &lt;element name="identificacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="monto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="responsableEntrega" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TerminosDeEntrega", propOrder = {
    "cargosDescuentos",
    "codigoCondicionEntrega",
    "costoTransporte",
    "direccionEntrega",
    "extras",
    "identificacion",
    "monto",
    "responsableEntrega"
})
public class TerminosDeEntrega {

    @XmlElement(nillable = true)
    protected ArrayOfCargosDescuentos cargosDescuentos;
    @XmlElement(nillable = true)
    protected String codigoCondicionEntrega;
    @XmlElement(nillable = true)
    protected String costoTransporte;
    @XmlElement(nillable = true)
    protected Direccion direccionEntrega;
    @XmlElement(nillable = true)
    protected ArrayOfExtensible extras;
    @XmlElement(nillable = true)
    protected String identificacion;
    @XmlElement(nillable = true)
    protected String monto;
    @XmlElement(nillable = true)
    protected String responsableEntrega;

    /**
     * Obtiene el valor de la propiedad cargosDescuentos.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCargosDescuentos }
     *     
     */
    public ArrayOfCargosDescuentos getCargosDescuentos() {
        return cargosDescuentos;
    }

    /**
     * Define el valor de la propiedad cargosDescuentos.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCargosDescuentos }
     *     
     */
    public void setCargosDescuentos(ArrayOfCargosDescuentos value) {
        this.cargosDescuentos = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoCondicionEntrega.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoCondicionEntrega() {
        return codigoCondicionEntrega;
    }

    /**
     * Define el valor de la propiedad codigoCondicionEntrega.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoCondicionEntrega(String value) {
        this.codigoCondicionEntrega = value;
    }

    /**
     * Obtiene el valor de la propiedad costoTransporte.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCostoTransporte() {
        return costoTransporte;
    }

    /**
     * Define el valor de la propiedad costoTransporte.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCostoTransporte(String value) {
        this.costoTransporte = value;
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
     * Obtiene el valor de la propiedad identificacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificacion() {
        return identificacion;
    }

    /**
     * Define el valor de la propiedad identificacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificacion(String value) {
        this.identificacion = value;
    }

    /**
     * Obtiene el valor de la propiedad monto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMonto() {
        return monto;
    }

    /**
     * Define el valor de la propiedad monto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMonto(String value) {
        this.monto = value;
    }

    /**
     * Obtiene el valor de la propiedad responsableEntrega.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponsableEntrega() {
        return responsableEntrega;
    }

    /**
     * Define el valor de la propiedad responsableEntrega.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponsableEntrega(String value) {
        this.responsableEntrega = value;
    }

}
