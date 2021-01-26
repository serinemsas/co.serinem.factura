
package org.jco.jaxws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para FacturaGeneral complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="FacturaGeneral"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="anticipos" type="{http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object}ArrayOfAnticipos" minOccurs="0"/&gt;
 *         &lt;element name="autorizado" type="{http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object}Autorizado" minOccurs="0"/&gt;
 *         &lt;element name="cantidadDecimales" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cargosDescuentos" type="{http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object}ArrayOfCargosDescuentos" minOccurs="0"/&gt;
 *         &lt;element name="cliente" type="{http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object}Cliente" minOccurs="0"/&gt;
 *         &lt;element name="condicionPago" type="{http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object}ArrayOfCondicionDePago" minOccurs="0"/&gt;
 *         &lt;element name="consecutivoDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="detalleDeFactura" type="{http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object}ArrayOfFacturaDetalle" minOccurs="0"/&gt;
 *         &lt;element name="documentosReferenciados" type="{http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object}ArrayOfDocumentoReferenciado" minOccurs="0"/&gt;
 *         &lt;element name="entregaMercancia" type="{http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object}Entrega" minOccurs="0"/&gt;
 *         &lt;element name="extras" type="{http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object}ArrayOfExtras" minOccurs="0"/&gt;
 *         &lt;element name="fechaEmision" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fechaFinPeriodoFacturacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fechaInicioPeriodoFacturacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fechaPagoImpuestos" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fechaVencimiento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="impuestosGenerales" type="{http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object}ArrayOfFacturaImpuestos" minOccurs="0"/&gt;
 *         &lt;element name="impuestosTotales" type="{http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object}ArrayOfImpuestosTotales" minOccurs="0"/&gt;
 *         &lt;element name="informacionAdicional" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/&gt;
 *         &lt;element name="mediosDePago" type="{http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object}ArrayOfMediosDePago" minOccurs="0"/&gt;
 *         &lt;element name="moneda" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ordenDeCompra" type="{http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object}ArrayOfOrdenDeCompra" minOccurs="0"/&gt;
 *         &lt;element name="propina" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="rangoNumeracion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="redondeoAplicado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tasaDeCambio" type="{http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object}TasaDeCambio" minOccurs="0"/&gt;
 *         &lt;element name="tasaDeCambioAlternativa" type="{http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object}TasaDeCambioAlternativa" minOccurs="0"/&gt;
 *         &lt;element name="terminosEntrega" type="{http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object}TerminosDeEntrega" minOccurs="0"/&gt;
 *         &lt;element name="tipoDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tipoOperacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="totalAnticipos" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="totalBaseImponible" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="totalBrutoConImpuesto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="totalCargosAplicados" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="totalDescuentos" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="totalMonto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="totalProductos" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="totalSinImpuestos" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FacturaGeneral", propOrder = {
    "anticipos",
    "autorizado",
    "cantidadDecimales",
    "cargosDescuentos",
    "cliente",
    "condicionPago",
    "consecutivoDocumento",
    "detalleDeFactura",
    "documentosReferenciados",
    "entregaMercancia",
    "extras",
    "fechaEmision",
    "fechaFinPeriodoFacturacion",
    "fechaInicioPeriodoFacturacion",
    "fechaPagoImpuestos",
    "fechaVencimiento",
    "impuestosGenerales",
    "impuestosTotales",
    "informacionAdicional",
    "mediosDePago",
    "moneda",
    "ordenDeCompra",
    "propina",
    "rangoNumeracion",
    "redondeoAplicado",
    "tasaDeCambio",
    "tasaDeCambioAlternativa",
    "terminosEntrega",
    "tipoDocumento",
    "tipoOperacion",
    "totalAnticipos",
    "totalBaseImponible",
    "totalBrutoConImpuesto",
    "totalCargosAplicados",
    "totalDescuentos",
    "totalMonto",
    "totalProductos",
    "totalSinImpuestos"
})
public class FacturaGeneral {

    @XmlElement(nillable = true)
    protected ArrayOfAnticipos anticipos;
    @XmlElement(nillable = true)
    protected Autorizado autorizado;
    @XmlElement(nillable = true)
    protected String cantidadDecimales;
    @XmlElement(nillable = true)
    protected ArrayOfCargosDescuentos cargosDescuentos;
    @XmlElement(nillable = true)
    protected Cliente cliente;
    @XmlElement(nillable = true)
    protected ArrayOfCondicionDePago condicionPago;
    @XmlElement(nillable = true)
    protected String consecutivoDocumento;
    @XmlElement(nillable = true)
    protected ArrayOfFacturaDetalle detalleDeFactura;
    @XmlElement(nillable = true)
    protected ArrayOfDocumentoReferenciado documentosReferenciados;
    @XmlElement(nillable = true)
    protected Entrega entregaMercancia;
    @XmlElement(nillable = true)
    protected ArrayOfExtras extras;
    @XmlElement(nillable = true)
    protected String fechaEmision;
    @XmlElement(nillable = true)
    protected String fechaFinPeriodoFacturacion;
    @XmlElement(nillable = true)
    protected String fechaInicioPeriodoFacturacion;
    @XmlElement(nillable = true)
    protected String fechaPagoImpuestos;
    @XmlElement(nillable = true)
    protected String fechaVencimiento;
    @XmlElement(nillable = true)
    protected ArrayOfFacturaImpuestos impuestosGenerales;
    @XmlElement(nillable = true)
    protected ArrayOfImpuestosTotales impuestosTotales;
    @XmlElement(nillable = true)
    protected ArrayOfstring informacionAdicional;
    @XmlElement(nillable = true)
    protected ArrayOfMediosDePago mediosDePago;
    @XmlElement(nillable = true)
    protected String moneda;
    @XmlElement(nillable = true)
    protected ArrayOfOrdenDeCompra ordenDeCompra;
    @XmlElement(nillable = true)
    protected String propina;
    @XmlElement(nillable = true)
    protected String rangoNumeracion;
    @XmlElement(nillable = true)
    protected String redondeoAplicado;
    @XmlElement(nillable = true)
    protected TasaDeCambio tasaDeCambio;
    @XmlElement(nillable = true)
    protected TasaDeCambioAlternativa tasaDeCambioAlternativa;
    @XmlElement(nillable = true)
    protected TerminosDeEntrega terminosEntrega;
    @XmlElement(nillable = true)
    protected String tipoDocumento;
    @XmlElement(nillable = true)
    protected String tipoOperacion;
    @XmlElement(nillable = true)
    protected String totalAnticipos;
    @XmlElement(nillable = true)
    protected String totalBaseImponible;
    @XmlElement(nillable = true)
    protected String totalBrutoConImpuesto;
    @XmlElement(nillable = true)
    protected String totalCargosAplicados;
    @XmlElement(nillable = true)
    protected String totalDescuentos;
    @XmlElement(nillable = true)
    protected String totalMonto;
    @XmlElement(nillable = true)
    protected String totalProductos;
    @XmlElement(nillable = true)
    protected String totalSinImpuestos;

    /**
     * Obtiene el valor de la propiedad anticipos.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAnticipos }
     *     
     */
    public ArrayOfAnticipos getAnticipos() {
        return anticipos;
    }

    /**
     * Define el valor de la propiedad anticipos.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAnticipos }
     *     
     */
    public void setAnticipos(ArrayOfAnticipos value) {
        this.anticipos = value;
    }

    /**
     * Obtiene el valor de la propiedad autorizado.
     * 
     * @return
     *     possible object is
     *     {@link Autorizado }
     *     
     */
    public Autorizado getAutorizado() {
        return autorizado;
    }

    /**
     * Define el valor de la propiedad autorizado.
     * 
     * @param value
     *     allowed object is
     *     {@link Autorizado }
     *     
     */
    public void setAutorizado(Autorizado value) {
        this.autorizado = value;
    }

    /**
     * Obtiene el valor de la propiedad cantidadDecimales.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCantidadDecimales() {
        return cantidadDecimales;
    }

    /**
     * Define el valor de la propiedad cantidadDecimales.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCantidadDecimales(String value) {
        this.cantidadDecimales = value;
    }

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
     * Obtiene el valor de la propiedad cliente.
     * 
     * @return
     *     possible object is
     *     {@link Cliente }
     *     
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * Define el valor de la propiedad cliente.
     * 
     * @param value
     *     allowed object is
     *     {@link Cliente }
     *     
     */
    public void setCliente(Cliente value) {
        this.cliente = value;
    }

    /**
     * Obtiene el valor de la propiedad condicionPago.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCondicionDePago }
     *     
     */
    public ArrayOfCondicionDePago getCondicionPago() {
        return condicionPago;
    }

    /**
     * Define el valor de la propiedad condicionPago.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCondicionDePago }
     *     
     */
    public void setCondicionPago(ArrayOfCondicionDePago value) {
        this.condicionPago = value;
    }

    /**
     * Obtiene el valor de la propiedad consecutivoDocumento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsecutivoDocumento() {
        return consecutivoDocumento;
    }

    /**
     * Define el valor de la propiedad consecutivoDocumento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsecutivoDocumento(String value) {
        this.consecutivoDocumento = value;
    }

    /**
     * Obtiene el valor de la propiedad detalleDeFactura.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFacturaDetalle }
     *     
     */
    public ArrayOfFacturaDetalle getDetalleDeFactura() {
        return detalleDeFactura;
    }

    /**
     * Define el valor de la propiedad detalleDeFactura.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFacturaDetalle }
     *     
     */
    public void setDetalleDeFactura(ArrayOfFacturaDetalle value) {
        this.detalleDeFactura = value;
    }

    /**
     * Obtiene el valor de la propiedad documentosReferenciados.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDocumentoReferenciado }
     *     
     */
    public ArrayOfDocumentoReferenciado getDocumentosReferenciados() {
        return documentosReferenciados;
    }

    /**
     * Define el valor de la propiedad documentosReferenciados.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDocumentoReferenciado }
     *     
     */
    public void setDocumentosReferenciados(ArrayOfDocumentoReferenciado value) {
        this.documentosReferenciados = value;
    }

    /**
     * Obtiene el valor de la propiedad entregaMercancia.
     * 
     * @return
     *     possible object is
     *     {@link Entrega }
     *     
     */
    public Entrega getEntregaMercancia() {
        return entregaMercancia;
    }

    /**
     * Define el valor de la propiedad entregaMercancia.
     * 
     * @param value
     *     allowed object is
     *     {@link Entrega }
     *     
     */
    public void setEntregaMercancia(Entrega value) {
        this.entregaMercancia = value;
    }

    /**
     * Obtiene el valor de la propiedad extras.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfExtras }
     *     
     */
    public ArrayOfExtras getExtras() {
        return extras;
    }

    /**
     * Define el valor de la propiedad extras.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfExtras }
     *     
     */
    public void setExtras(ArrayOfExtras value) {
        this.extras = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaEmision.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaEmision() {
        return fechaEmision;
    }

    /**
     * Define el valor de la propiedad fechaEmision.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaEmision(String value) {
        this.fechaEmision = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaFinPeriodoFacturacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaFinPeriodoFacturacion() {
        return fechaFinPeriodoFacturacion;
    }

    /**
     * Define el valor de la propiedad fechaFinPeriodoFacturacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaFinPeriodoFacturacion(String value) {
        this.fechaFinPeriodoFacturacion = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaInicioPeriodoFacturacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaInicioPeriodoFacturacion() {
        return fechaInicioPeriodoFacturacion;
    }

    /**
     * Define el valor de la propiedad fechaInicioPeriodoFacturacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaInicioPeriodoFacturacion(String value) {
        this.fechaInicioPeriodoFacturacion = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaPagoImpuestos.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaPagoImpuestos() {
        return fechaPagoImpuestos;
    }

    /**
     * Define el valor de la propiedad fechaPagoImpuestos.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaPagoImpuestos(String value) {
        this.fechaPagoImpuestos = value;
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
     * Obtiene el valor de la propiedad impuestosGenerales.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFacturaImpuestos }
     *     
     */
    public ArrayOfFacturaImpuestos getImpuestosGenerales() {
        return impuestosGenerales;
    }

    /**
     * Define el valor de la propiedad impuestosGenerales.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFacturaImpuestos }
     *     
     */
    public void setImpuestosGenerales(ArrayOfFacturaImpuestos value) {
        this.impuestosGenerales = value;
    }

    /**
     * Obtiene el valor de la propiedad impuestosTotales.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfImpuestosTotales }
     *     
     */
    public ArrayOfImpuestosTotales getImpuestosTotales() {
        return impuestosTotales;
    }

    /**
     * Define el valor de la propiedad impuestosTotales.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfImpuestosTotales }
     *     
     */
    public void setImpuestosTotales(ArrayOfImpuestosTotales value) {
        this.impuestosTotales = value;
    }

    /**
     * Obtiene el valor de la propiedad informacionAdicional.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfstring }
     *     
     */
    public ArrayOfstring getInformacionAdicional() {
        return informacionAdicional;
    }

    /**
     * Define el valor de la propiedad informacionAdicional.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfstring }
     *     
     */
    public void setInformacionAdicional(ArrayOfstring value) {
        this.informacionAdicional = value;
    }

    /**
     * Obtiene el valor de la propiedad mediosDePago.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMediosDePago }
     *     
     */
    public ArrayOfMediosDePago getMediosDePago() {
        return mediosDePago;
    }

    /**
     * Define el valor de la propiedad mediosDePago.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMediosDePago }
     *     
     */
    public void setMediosDePago(ArrayOfMediosDePago value) {
        this.mediosDePago = value;
    }

    /**
     * Obtiene el valor de la propiedad moneda.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMoneda() {
        return moneda;
    }

    /**
     * Define el valor de la propiedad moneda.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMoneda(String value) {
        this.moneda = value;
    }

    /**
     * Obtiene el valor de la propiedad ordenDeCompra.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOrdenDeCompra }
     *     
     */
    public ArrayOfOrdenDeCompra getOrdenDeCompra() {
        return ordenDeCompra;
    }

    /**
     * Define el valor de la propiedad ordenDeCompra.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOrdenDeCompra }
     *     
     */
    public void setOrdenDeCompra(ArrayOfOrdenDeCompra value) {
        this.ordenDeCompra = value;
    }

    /**
     * Obtiene el valor de la propiedad propina.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPropina() {
        return propina;
    }

    /**
     * Define el valor de la propiedad propina.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPropina(String value) {
        this.propina = value;
    }

    /**
     * Obtiene el valor de la propiedad rangoNumeracion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRangoNumeracion() {
        return rangoNumeracion;
    }

    /**
     * Define el valor de la propiedad rangoNumeracion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRangoNumeracion(String value) {
        this.rangoNumeracion = value;
    }

    /**
     * Obtiene el valor de la propiedad redondeoAplicado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRedondeoAplicado() {
        return redondeoAplicado;
    }

    /**
     * Define el valor de la propiedad redondeoAplicado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRedondeoAplicado(String value) {
        this.redondeoAplicado = value;
    }

    /**
     * Obtiene el valor de la propiedad tasaDeCambio.
     * 
     * @return
     *     possible object is
     *     {@link TasaDeCambio }
     *     
     */
    public TasaDeCambio getTasaDeCambio() {
        return tasaDeCambio;
    }

    /**
     * Define el valor de la propiedad tasaDeCambio.
     * 
     * @param value
     *     allowed object is
     *     {@link TasaDeCambio }
     *     
     */
    public void setTasaDeCambio(TasaDeCambio value) {
        this.tasaDeCambio = value;
    }

    /**
     * Obtiene el valor de la propiedad tasaDeCambioAlternativa.
     * 
     * @return
     *     possible object is
     *     {@link TasaDeCambioAlternativa }
     *     
     */
    public TasaDeCambioAlternativa getTasaDeCambioAlternativa() {
        return tasaDeCambioAlternativa;
    }

    /**
     * Define el valor de la propiedad tasaDeCambioAlternativa.
     * 
     * @param value
     *     allowed object is
     *     {@link TasaDeCambioAlternativa }
     *     
     */
    public void setTasaDeCambioAlternativa(TasaDeCambioAlternativa value) {
        this.tasaDeCambioAlternativa = value;
    }

    /**
     * Obtiene el valor de la propiedad terminosEntrega.
     * 
     * @return
     *     possible object is
     *     {@link TerminosDeEntrega }
     *     
     */
    public TerminosDeEntrega getTerminosEntrega() {
        return terminosEntrega;
    }

    /**
     * Define el valor de la propiedad terminosEntrega.
     * 
     * @param value
     *     allowed object is
     *     {@link TerminosDeEntrega }
     *     
     */
    public void setTerminosEntrega(TerminosDeEntrega value) {
        this.terminosEntrega = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoDocumento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoDocumento() {
        return tipoDocumento;
    }

    /**
     * Define el valor de la propiedad tipoDocumento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoDocumento(String value) {
        this.tipoDocumento = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoOperacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoOperacion() {
        return tipoOperacion;
    }

    /**
     * Define el valor de la propiedad tipoOperacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoOperacion(String value) {
        this.tipoOperacion = value;
    }

    /**
     * Obtiene el valor de la propiedad totalAnticipos.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalAnticipos() {
        return totalAnticipos;
    }

    /**
     * Define el valor de la propiedad totalAnticipos.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalAnticipos(String value) {
        this.totalAnticipos = value;
    }

    /**
     * Obtiene el valor de la propiedad totalBaseImponible.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalBaseImponible() {
        return totalBaseImponible;
    }

    /**
     * Define el valor de la propiedad totalBaseImponible.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalBaseImponible(String value) {
        this.totalBaseImponible = value;
    }

    /**
     * Obtiene el valor de la propiedad totalBrutoConImpuesto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalBrutoConImpuesto() {
        return totalBrutoConImpuesto;
    }

    /**
     * Define el valor de la propiedad totalBrutoConImpuesto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalBrutoConImpuesto(String value) {
        this.totalBrutoConImpuesto = value;
    }

    /**
     * Obtiene el valor de la propiedad totalCargosAplicados.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalCargosAplicados() {
        return totalCargosAplicados;
    }

    /**
     * Define el valor de la propiedad totalCargosAplicados.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalCargosAplicados(String value) {
        this.totalCargosAplicados = value;
    }

    /**
     * Obtiene el valor de la propiedad totalDescuentos.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalDescuentos() {
        return totalDescuentos;
    }

    /**
     * Define el valor de la propiedad totalDescuentos.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalDescuentos(String value) {
        this.totalDescuentos = value;
    }

    /**
     * Obtiene el valor de la propiedad totalMonto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalMonto() {
        return totalMonto;
    }

    /**
     * Define el valor de la propiedad totalMonto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalMonto(String value) {
        this.totalMonto = value;
    }

    /**
     * Obtiene el valor de la propiedad totalProductos.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalProductos() {
        return totalProductos;
    }

    /**
     * Define el valor de la propiedad totalProductos.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalProductos(String value) {
        this.totalProductos = value;
    }

    /**
     * Obtiene el valor de la propiedad totalSinImpuestos.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalSinImpuestos() {
        return totalSinImpuestos;
    }

    /**
     * Define el valor de la propiedad totalSinImpuestos.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalSinImpuestos(String value) {
        this.totalSinImpuestos = value;
    }

}
