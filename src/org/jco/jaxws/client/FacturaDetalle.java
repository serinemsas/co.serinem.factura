
package org.jco.jaxws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para FacturaDetalle complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="FacturaDetalle"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cantidadPorEmpaque" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cantidadReal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cantidadRealUnidadMedida" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cantidadUnidades" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cargosDescuentos" type="{http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object}ArrayOfCargosDescuentos" minOccurs="0"/&gt;
 *         &lt;element name="codigoFabricante" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codigoIdentificadorPais" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codigoProducto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codigoTipoPrecio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="descripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="descripcionTecnica" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="documentosReferenciados" type="{http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object}ArrayOfDocumentoReferenciado" minOccurs="0"/&gt;
 *         &lt;element name="estandarCodigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="estandarCodigoID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="estandarCodigoIdentificador" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="estandarCodigoNombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="estandarCodigoProducto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="estandarOrganizacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="estandarSubCodigoProducto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="extras" type="{http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object}ArrayOfExtensible" minOccurs="0"/&gt;
 *         &lt;element name="impuestosDetalles" type="{http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object}ArrayOfFacturaImpuestos" minOccurs="0"/&gt;
 *         &lt;element name="impuestosTotales" type="{http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object}ArrayOfImpuestosTotales" minOccurs="0"/&gt;
 *         &lt;element name="informacionAdicional" type="{http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object}ArrayOfLineaInformacionAdicional" minOccurs="0"/&gt;
 *         &lt;element name="mandatorioNumeroIdentificacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mandatorioNumeroIdentificacionDV" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mandatorioTipoIdentificacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="marca" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="modelo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="muestraGratis" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nombreFabricante" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nota" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="precioReferencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="precioTotal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="precioTotalSinImpuestos" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="precioVentaUnitario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="secuencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="seriales" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="subCodigoFabricante" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="subCodigoProducto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tipoAIU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="unidadMedida" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FacturaDetalle", propOrder = {
    "cantidadPorEmpaque",
    "cantidadReal",
    "cantidadRealUnidadMedida",
    "cantidadUnidades",
    "cargosDescuentos",
    "codigoFabricante",
    "codigoIdentificadorPais",
    "codigoProducto",
    "codigoTipoPrecio",
    "descripcion",
    "descripcionTecnica",
    "documentosReferenciados",
    "estandarCodigo",
    "estandarCodigoID",
    "estandarCodigoIdentificador",
    "estandarCodigoNombre",
    "estandarCodigoProducto",
    "estandarOrganizacion",
    "estandarSubCodigoProducto",
    "extras",
    "impuestosDetalles",
    "impuestosTotales",
    "informacionAdicional",
    "mandatorioNumeroIdentificacion",
    "mandatorioNumeroIdentificacionDV",
    "mandatorioTipoIdentificacion",
    "marca",
    "modelo",
    "muestraGratis",
    "nombreFabricante",
    "nota",
    "precioReferencia",
    "precioTotal",
    "precioTotalSinImpuestos",
    "precioVentaUnitario",
    "secuencia",
    "seriales",
    "subCodigoFabricante",
    "subCodigoProducto",
    "tipoAIU",
    "unidadMedida"
})
public class FacturaDetalle {

    @XmlElement(nillable = true)
    protected String cantidadPorEmpaque;
    @XmlElement(nillable = true)
    protected String cantidadReal;
    @XmlElement(nillable = true)
    protected String cantidadRealUnidadMedida;
    @XmlElement(nillable = true)
    protected String cantidadUnidades;
    @XmlElement(nillable = true)
    protected ArrayOfCargosDescuentos cargosDescuentos;
    @XmlElement(nillable = true)
    protected String codigoFabricante;
    @XmlElement(nillable = true)
    protected String codigoIdentificadorPais;
    @XmlElement(nillable = true)
    protected String codigoProducto;
    @XmlElement(nillable = true)
    protected String codigoTipoPrecio;
    @XmlElement(nillable = true)
    protected String descripcion;
    @XmlElement(nillable = true)
    protected String descripcionTecnica;
    @XmlElement(nillable = true)
    protected ArrayOfDocumentoReferenciado documentosReferenciados;
    @XmlElement(nillable = true)
    protected String estandarCodigo;
    @XmlElement(nillable = true)
    protected String estandarCodigoID;
    @XmlElement(nillable = true)
    protected String estandarCodigoIdentificador;
    @XmlElement(nillable = true)
    protected String estandarCodigoNombre;
    @XmlElement(nillable = true)
    protected String estandarCodigoProducto;
    @XmlElement(nillable = true)
    protected String estandarOrganizacion;
    @XmlElement(nillable = true)
    protected String estandarSubCodigoProducto;
    @XmlElement(nillable = true)
    protected ArrayOfExtensible extras;
    @XmlElement(nillable = true)
    protected ArrayOfFacturaImpuestos impuestosDetalles;
    @XmlElement(nillable = true)
    protected ArrayOfImpuestosTotales impuestosTotales;
    @XmlElement(nillable = true)
    protected ArrayOfLineaInformacionAdicional informacionAdicional;
    @XmlElement(nillable = true)
    protected String mandatorioNumeroIdentificacion;
    @XmlElement(nillable = true)
    protected String mandatorioNumeroIdentificacionDV;
    @XmlElement(nillable = true)
    protected String mandatorioTipoIdentificacion;
    @XmlElement(nillable = true)
    protected String marca;
    @XmlElement(nillable = true)
    protected String modelo;
    @XmlElement(nillable = true)
    protected String muestraGratis;
    @XmlElement(nillable = true)
    protected String nombreFabricante;
    @XmlElement(nillable = true)
    protected String nota;
    @XmlElement(nillable = true)
    protected String precioReferencia;
    @XmlElement(nillable = true)
    protected String precioTotal;
    @XmlElement(nillable = true)
    protected String precioTotalSinImpuestos;
    @XmlElement(nillable = true)
    protected String precioVentaUnitario;
    @XmlElement(nillable = true)
    protected String secuencia;
    @XmlElement(nillable = true)
    protected String seriales;
    @XmlElement(nillable = true)
    protected String subCodigoFabricante;
    @XmlElement(nillable = true)
    protected String subCodigoProducto;
    @XmlElement(nillable = true)
    protected String tipoAIU;
    @XmlElement(nillable = true)
    protected String unidadMedida;

    /**
     * Obtiene el valor de la propiedad cantidadPorEmpaque.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCantidadPorEmpaque() {
        return cantidadPorEmpaque;
    }

    /**
     * Define el valor de la propiedad cantidadPorEmpaque.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCantidadPorEmpaque(String value) {
        this.cantidadPorEmpaque = value;
    }

    /**
     * Obtiene el valor de la propiedad cantidadReal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCantidadReal() {
        return cantidadReal;
    }

    /**
     * Define el valor de la propiedad cantidadReal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCantidadReal(String value) {
        this.cantidadReal = value;
    }

    /**
     * Obtiene el valor de la propiedad cantidadRealUnidadMedida.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCantidadRealUnidadMedida() {
        return cantidadRealUnidadMedida;
    }

    /**
     * Define el valor de la propiedad cantidadRealUnidadMedida.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCantidadRealUnidadMedida(String value) {
        this.cantidadRealUnidadMedida = value;
    }

    /**
     * Obtiene el valor de la propiedad cantidadUnidades.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCantidadUnidades() {
        return cantidadUnidades;
    }

    /**
     * Define el valor de la propiedad cantidadUnidades.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCantidadUnidades(String value) {
        this.cantidadUnidades = value;
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
     * Obtiene el valor de la propiedad codigoFabricante.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoFabricante() {
        return codigoFabricante;
    }

    /**
     * Define el valor de la propiedad codigoFabricante.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoFabricante(String value) {
        this.codigoFabricante = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoIdentificadorPais.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoIdentificadorPais() {
        return codigoIdentificadorPais;
    }

    /**
     * Define el valor de la propiedad codigoIdentificadorPais.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoIdentificadorPais(String value) {
        this.codigoIdentificadorPais = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoProducto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoProducto() {
        return codigoProducto;
    }

    /**
     * Define el valor de la propiedad codigoProducto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoProducto(String value) {
        this.codigoProducto = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoTipoPrecio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoTipoPrecio() {
        return codigoTipoPrecio;
    }

    /**
     * Define el valor de la propiedad codigoTipoPrecio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoTipoPrecio(String value) {
        this.codigoTipoPrecio = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Define el valor de la propiedad descripcion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcion(String value) {
        this.descripcion = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcionTecnica.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcionTecnica() {
        return descripcionTecnica;
    }

    /**
     * Define el valor de la propiedad descripcionTecnica.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcionTecnica(String value) {
        this.descripcionTecnica = value;
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
     * Obtiene el valor de la propiedad estandarCodigo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstandarCodigo() {
        return estandarCodigo;
    }

    /**
     * Define el valor de la propiedad estandarCodigo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstandarCodigo(String value) {
        this.estandarCodigo = value;
    }

    /**
     * Obtiene el valor de la propiedad estandarCodigoID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstandarCodigoID() {
        return estandarCodigoID;
    }

    /**
     * Define el valor de la propiedad estandarCodigoID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstandarCodigoID(String value) {
        this.estandarCodigoID = value;
    }

    /**
     * Obtiene el valor de la propiedad estandarCodigoIdentificador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstandarCodigoIdentificador() {
        return estandarCodigoIdentificador;
    }

    /**
     * Define el valor de la propiedad estandarCodigoIdentificador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstandarCodigoIdentificador(String value) {
        this.estandarCodigoIdentificador = value;
    }

    /**
     * Obtiene el valor de la propiedad estandarCodigoNombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstandarCodigoNombre() {
        return estandarCodigoNombre;
    }

    /**
     * Define el valor de la propiedad estandarCodigoNombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstandarCodigoNombre(String value) {
        this.estandarCodigoNombre = value;
    }

    /**
     * Obtiene el valor de la propiedad estandarCodigoProducto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstandarCodigoProducto() {
        return estandarCodigoProducto;
    }

    /**
     * Define el valor de la propiedad estandarCodigoProducto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstandarCodigoProducto(String value) {
        this.estandarCodigoProducto = value;
    }

    /**
     * Obtiene el valor de la propiedad estandarOrganizacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstandarOrganizacion() {
        return estandarOrganizacion;
    }

    /**
     * Define el valor de la propiedad estandarOrganizacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstandarOrganizacion(String value) {
        this.estandarOrganizacion = value;
    }

    /**
     * Obtiene el valor de la propiedad estandarSubCodigoProducto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstandarSubCodigoProducto() {
        return estandarSubCodigoProducto;
    }

    /**
     * Define el valor de la propiedad estandarSubCodigoProducto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstandarSubCodigoProducto(String value) {
        this.estandarSubCodigoProducto = value;
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
     * Obtiene el valor de la propiedad impuestosDetalles.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFacturaImpuestos }
     *     
     */
    public ArrayOfFacturaImpuestos getImpuestosDetalles() {
        return impuestosDetalles;
    }

    /**
     * Define el valor de la propiedad impuestosDetalles.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFacturaImpuestos }
     *     
     */
    public void setImpuestosDetalles(ArrayOfFacturaImpuestos value) {
        this.impuestosDetalles = value;
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
     *     {@link ArrayOfLineaInformacionAdicional }
     *     
     */
    public ArrayOfLineaInformacionAdicional getInformacionAdicional() {
        return informacionAdicional;
    }

    /**
     * Define el valor de la propiedad informacionAdicional.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfLineaInformacionAdicional }
     *     
     */
    public void setInformacionAdicional(ArrayOfLineaInformacionAdicional value) {
        this.informacionAdicional = value;
    }

    /**
     * Obtiene el valor de la propiedad mandatorioNumeroIdentificacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMandatorioNumeroIdentificacion() {
        return mandatorioNumeroIdentificacion;
    }

    /**
     * Define el valor de la propiedad mandatorioNumeroIdentificacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMandatorioNumeroIdentificacion(String value) {
        this.mandatorioNumeroIdentificacion = value;
    }

    /**
     * Obtiene el valor de la propiedad mandatorioNumeroIdentificacionDV.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMandatorioNumeroIdentificacionDV() {
        return mandatorioNumeroIdentificacionDV;
    }

    /**
     * Define el valor de la propiedad mandatorioNumeroIdentificacionDV.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMandatorioNumeroIdentificacionDV(String value) {
        this.mandatorioNumeroIdentificacionDV = value;
    }

    /**
     * Obtiene el valor de la propiedad mandatorioTipoIdentificacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMandatorioTipoIdentificacion() {
        return mandatorioTipoIdentificacion;
    }

    /**
     * Define el valor de la propiedad mandatorioTipoIdentificacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMandatorioTipoIdentificacion(String value) {
        this.mandatorioTipoIdentificacion = value;
    }

    /**
     * Obtiene el valor de la propiedad marca.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Define el valor de la propiedad marca.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarca(String value) {
        this.marca = value;
    }

    /**
     * Obtiene el valor de la propiedad modelo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * Define el valor de la propiedad modelo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModelo(String value) {
        this.modelo = value;
    }

    /**
     * Obtiene el valor de la propiedad muestraGratis.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMuestraGratis() {
        return muestraGratis;
    }

    /**
     * Define el valor de la propiedad muestraGratis.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMuestraGratis(String value) {
        this.muestraGratis = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreFabricante.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreFabricante() {
        return nombreFabricante;
    }

    /**
     * Define el valor de la propiedad nombreFabricante.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreFabricante(String value) {
        this.nombreFabricante = value;
    }

    /**
     * Obtiene el valor de la propiedad nota.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNota() {
        return nota;
    }

    /**
     * Define el valor de la propiedad nota.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNota(String value) {
        this.nota = value;
    }

    /**
     * Obtiene el valor de la propiedad precioReferencia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrecioReferencia() {
        return precioReferencia;
    }

    /**
     * Define el valor de la propiedad precioReferencia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrecioReferencia(String value) {
        this.precioReferencia = value;
    }

    /**
     * Obtiene el valor de la propiedad precioTotal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrecioTotal() {
        return precioTotal;
    }

    /**
     * Define el valor de la propiedad precioTotal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrecioTotal(String value) {
        this.precioTotal = value;
    }

    /**
     * Obtiene el valor de la propiedad precioTotalSinImpuestos.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrecioTotalSinImpuestos() {
        return precioTotalSinImpuestos;
    }

    /**
     * Define el valor de la propiedad precioTotalSinImpuestos.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrecioTotalSinImpuestos(String value) {
        this.precioTotalSinImpuestos = value;
    }

    /**
     * Obtiene el valor de la propiedad precioVentaUnitario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrecioVentaUnitario() {
        return precioVentaUnitario;
    }

    /**
     * Define el valor de la propiedad precioVentaUnitario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrecioVentaUnitario(String value) {
        this.precioVentaUnitario = value;
    }

    /**
     * Obtiene el valor de la propiedad secuencia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecuencia() {
        return secuencia;
    }

    /**
     * Define el valor de la propiedad secuencia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecuencia(String value) {
        this.secuencia = value;
    }

    /**
     * Obtiene el valor de la propiedad seriales.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeriales() {
        return seriales;
    }

    /**
     * Define el valor de la propiedad seriales.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeriales(String value) {
        this.seriales = value;
    }

    /**
     * Obtiene el valor de la propiedad subCodigoFabricante.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubCodigoFabricante() {
        return subCodigoFabricante;
    }

    /**
     * Define el valor de la propiedad subCodigoFabricante.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubCodigoFabricante(String value) {
        this.subCodigoFabricante = value;
    }

    /**
     * Obtiene el valor de la propiedad subCodigoProducto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubCodigoProducto() {
        return subCodigoProducto;
    }

    /**
     * Define el valor de la propiedad subCodigoProducto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubCodigoProducto(String value) {
        this.subCodigoProducto = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoAIU.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoAIU() {
        return tipoAIU;
    }

    /**
     * Define el valor de la propiedad tipoAIU.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoAIU(String value) {
        this.tipoAIU = value;
    }

    /**
     * Obtiene el valor de la propiedad unidadMedida.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnidadMedida() {
        return unidadMedida;
    }

    /**
     * Define el valor de la propiedad unidadMedida.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnidadMedida(String value) {
        this.unidadMedida = value;
    }

}
