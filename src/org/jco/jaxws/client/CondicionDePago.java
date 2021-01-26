
package org.jco.jaxws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para CondicionDePago complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CondicionDePago"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codigoEvento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="comentario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="duracionPeriodo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="duracionPeriodoMedida" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="extras" type="{http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object}ArrayOfExtensible" minOccurs="0"/&gt;
 *         &lt;element name="fechaVencimiento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="identificador" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="medioPagoAsociado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="monto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="montoMulta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="montoPenalidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="periodoDesde" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="periodoHasta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="porcentajeDescuento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="porcentajePago" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="referenciaAnticipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CondicionDePago", propOrder = {
    "codigoEvento",
    "comentario",
    "duracionPeriodo",
    "duracionPeriodoMedida",
    "extras",
    "fechaVencimiento",
    "identificador",
    "medioPagoAsociado",
    "monto",
    "montoMulta",
    "montoPenalidad",
    "periodoDesde",
    "periodoHasta",
    "porcentajeDescuento",
    "porcentajePago",
    "referenciaAnticipo"
})
public class CondicionDePago {

    @XmlElement(nillable = true)
    protected String codigoEvento;
    @XmlElement(nillable = true)
    protected String comentario;
    @XmlElement(nillable = true)
    protected String duracionPeriodo;
    @XmlElement(nillable = true)
    protected String duracionPeriodoMedida;
    @XmlElement(nillable = true)
    protected ArrayOfExtensible extras;
    @XmlElement(nillable = true)
    protected String fechaVencimiento;
    @XmlElement(nillable = true)
    protected String identificador;
    @XmlElement(nillable = true)
    protected String medioPagoAsociado;
    @XmlElement(nillable = true)
    protected String monto;
    @XmlElement(nillable = true)
    protected String montoMulta;
    @XmlElement(nillable = true)
    protected String montoPenalidad;
    @XmlElement(nillable = true)
    protected String periodoDesde;
    @XmlElement(nillable = true)
    protected String periodoHasta;
    @XmlElement(nillable = true)
    protected String porcentajeDescuento;
    @XmlElement(nillable = true)
    protected String porcentajePago;
    @XmlElement(nillable = true)
    protected String referenciaAnticipo;

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
     * Obtiene el valor de la propiedad duracionPeriodo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDuracionPeriodo() {
        return duracionPeriodo;
    }

    /**
     * Define el valor de la propiedad duracionPeriodo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDuracionPeriodo(String value) {
        this.duracionPeriodo = value;
    }

    /**
     * Obtiene el valor de la propiedad duracionPeriodoMedida.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDuracionPeriodoMedida() {
        return duracionPeriodoMedida;
    }

    /**
     * Define el valor de la propiedad duracionPeriodoMedida.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDuracionPeriodoMedida(String value) {
        this.duracionPeriodoMedida = value;
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
     * Obtiene el valor de la propiedad fechaVencimiento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    /**
     * Define el valor de la propiedad fechaVencimiento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaVencimiento(String value) {
        this.fechaVencimiento = value;
    }

    /**
     * Obtiene el valor de la propiedad identificador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificador() {
        return identificador;
    }

    /**
     * Define el valor de la propiedad identificador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificador(String value) {
        this.identificador = value;
    }

    /**
     * Obtiene el valor de la propiedad medioPagoAsociado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMedioPagoAsociado() {
        return medioPagoAsociado;
    }

    /**
     * Define el valor de la propiedad medioPagoAsociado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMedioPagoAsociado(String value) {
        this.medioPagoAsociado = value;
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
     * Obtiene el valor de la propiedad montoMulta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMontoMulta() {
        return montoMulta;
    }

    /**
     * Define el valor de la propiedad montoMulta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMontoMulta(String value) {
        this.montoMulta = value;
    }

    /**
     * Obtiene el valor de la propiedad montoPenalidad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMontoPenalidad() {
        return montoPenalidad;
    }

    /**
     * Define el valor de la propiedad montoPenalidad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMontoPenalidad(String value) {
        this.montoPenalidad = value;
    }

    /**
     * Obtiene el valor de la propiedad periodoDesde.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPeriodoDesde() {
        return periodoDesde;
    }

    /**
     * Define el valor de la propiedad periodoDesde.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPeriodoDesde(String value) {
        this.periodoDesde = value;
    }

    /**
     * Obtiene el valor de la propiedad periodoHasta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPeriodoHasta() {
        return periodoHasta;
    }

    /**
     * Define el valor de la propiedad periodoHasta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPeriodoHasta(String value) {
        this.periodoHasta = value;
    }

    /**
     * Obtiene el valor de la propiedad porcentajeDescuento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    /**
     * Define el valor de la propiedad porcentajeDescuento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPorcentajeDescuento(String value) {
        this.porcentajeDescuento = value;
    }

    /**
     * Obtiene el valor de la propiedad porcentajePago.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPorcentajePago() {
        return porcentajePago;
    }

    /**
     * Define el valor de la propiedad porcentajePago.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPorcentajePago(String value) {
        this.porcentajePago = value;
    }

    /**
     * Obtiene el valor de la propiedad referenciaAnticipo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenciaAnticipo() {
        return referenciaAnticipo;
    }

    /**
     * Define el valor de la propiedad referenciaAnticipo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenciaAnticipo(String value) {
        this.referenciaAnticipo = value;
    }

}
