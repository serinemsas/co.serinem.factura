
package org.jco.jaxws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para DocumentStatusResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DocumentStatusResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="aceptacionFisica" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="acuseComentario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="acuseEstatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="acuseResponsable" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="acuseRespuesta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ambiente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cadenaCodigoQR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cadenaCufe" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codigo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="consecutivo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cufe" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="descripcionDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="descripcionEstatusDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="entregaMetodoDIAN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="esValidoDIAN" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="estatusDocumento" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="eventos" type="{http://schemas.datacontract.org/2004/07/ServiceSoap.Models.Response}ArrayOfEvento" minOccurs="0"/&gt;
 *         &lt;element name="fechaAceptacionDIAN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fechaDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="historialDeEntregas" type="{http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object}ArrayOfHistorialDeEntrega" minOccurs="0"/&gt;
 *         &lt;element name="mensaje" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mensajeDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="poseeAdjuntos" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="poseeRepresentacionGrafica" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="reglasValidacionDIAN" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/&gt;
 *         &lt;element name="resultado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tipoCufe" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tipoDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="trackID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentStatusResponse", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", propOrder = {
    "aceptacionFisica",
    "acuseComentario",
    "acuseEstatus",
    "acuseResponsable",
    "acuseRespuesta",
    "ambiente",
    "cadenaCodigoQR",
    "cadenaCufe",
    "codigo",
    "consecutivo",
    "cufe",
    "descripcionDocumento",
    "descripcionEstatusDocumento",
    "entregaMetodoDIAN",
    "esValidoDIAN",
    "estatusDocumento",
    "eventos",
    "fechaAceptacionDIAN",
    "fechaDocumento",
    "historialDeEntregas",
    "mensaje",
    "mensajeDocumento",
    "poseeAdjuntos",
    "poseeRepresentacionGrafica",
    "reglasValidacionDIAN",
    "resultado",
    "tipoCufe",
    "tipoDocumento",
    "trackID"
})
public class DocumentStatusResponse {

    protected Boolean aceptacionFisica;
    @XmlElement(nillable = true)
    protected String acuseComentario;
    @XmlElement(nillable = true)
    protected String acuseEstatus;
    @XmlElement(nillable = true)
    protected String acuseResponsable;
    @XmlElement(nillable = true)
    protected String acuseRespuesta;
    @XmlElement(nillable = true)
    protected String ambiente;
    @XmlElement(nillable = true)
    protected String cadenaCodigoQR;
    @XmlElement(nillable = true)
    protected String cadenaCufe;
    protected Integer codigo;
    @XmlElement(nillable = true)
    protected String consecutivo;
    @XmlElement(nillable = true)
    protected String cufe;
    @XmlElement(nillable = true)
    protected String descripcionDocumento;
    @XmlElement(nillable = true)
    protected String descripcionEstatusDocumento;
    @XmlElement(nillable = true)
    protected String entregaMetodoDIAN;
    protected Boolean esValidoDIAN;
    protected Integer estatusDocumento;
    @XmlElement(nillable = true)
    protected ArrayOfEvento eventos;
    @XmlElement(nillable = true)
    protected String fechaAceptacionDIAN;
    @XmlElement(nillable = true)
    protected String fechaDocumento;
    @XmlElement(nillable = true)
    protected ArrayOfHistorialDeEntrega historialDeEntregas;
    @XmlElement(nillable = true)
    protected String mensaje;
    @XmlElement(nillable = true)
    protected String mensajeDocumento;
    protected Boolean poseeAdjuntos;
    protected Boolean poseeRepresentacionGrafica;
    @XmlElement(nillable = true)
    protected ArrayOfstring reglasValidacionDIAN;
    @XmlElement(nillable = true)
    protected String resultado;
    @XmlElement(nillable = true)
    protected String tipoCufe;
    @XmlElement(nillable = true)
    protected String tipoDocumento;
    @XmlElement(nillable = true)
    protected String trackID;

    /**
     * Obtiene el valor de la propiedad aceptacionFisica.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAceptacionFisica() {
        return aceptacionFisica;
    }

    /**
     * Define el valor de la propiedad aceptacionFisica.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAceptacionFisica(Boolean value) {
        this.aceptacionFisica = value;
    }

    /**
     * Obtiene el valor de la propiedad acuseComentario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcuseComentario() {
        return acuseComentario;
    }

    /**
     * Define el valor de la propiedad acuseComentario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcuseComentario(String value) {
        this.acuseComentario = value;
    }

    /**
     * Obtiene el valor de la propiedad acuseEstatus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcuseEstatus() {
        return acuseEstatus;
    }

    /**
     * Define el valor de la propiedad acuseEstatus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcuseEstatus(String value) {
        this.acuseEstatus = value;
    }

    /**
     * Obtiene el valor de la propiedad acuseResponsable.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcuseResponsable() {
        return acuseResponsable;
    }

    /**
     * Define el valor de la propiedad acuseResponsable.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcuseResponsable(String value) {
        this.acuseResponsable = value;
    }

    /**
     * Obtiene el valor de la propiedad acuseRespuesta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcuseRespuesta() {
        return acuseRespuesta;
    }

    /**
     * Define el valor de la propiedad acuseRespuesta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcuseRespuesta(String value) {
        this.acuseRespuesta = value;
    }

    /**
     * Obtiene el valor de la propiedad ambiente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmbiente() {
        return ambiente;
    }

    /**
     * Define el valor de la propiedad ambiente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmbiente(String value) {
        this.ambiente = value;
    }

    /**
     * Obtiene el valor de la propiedad cadenaCodigoQR.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCadenaCodigoQR() {
        return cadenaCodigoQR;
    }

    /**
     * Define el valor de la propiedad cadenaCodigoQR.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCadenaCodigoQR(String value) {
        this.cadenaCodigoQR = value;
    }

    /**
     * Obtiene el valor de la propiedad cadenaCufe.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCadenaCufe() {
        return cadenaCufe;
    }

    /**
     * Define el valor de la propiedad cadenaCufe.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCadenaCufe(String value) {
        this.cadenaCufe = value;
    }

    /**
     * Obtiene el valor de la propiedad codigo.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodigo() {
        return codigo;
    }

    /**
     * Define el valor de la propiedad codigo.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodigo(Integer value) {
        this.codigo = value;
    }

    /**
     * Obtiene el valor de la propiedad consecutivo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsecutivo() {
        return consecutivo;
    }

    /**
     * Define el valor de la propiedad consecutivo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsecutivo(String value) {
        this.consecutivo = value;
    }

    /**
     * Obtiene el valor de la propiedad cufe.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCufe() {
        return cufe;
    }

    /**
     * Define el valor de la propiedad cufe.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCufe(String value) {
        this.cufe = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcionDocumento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcionDocumento() {
        return descripcionDocumento;
    }

    /**
     * Define el valor de la propiedad descripcionDocumento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcionDocumento(String value) {
        this.descripcionDocumento = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcionEstatusDocumento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcionEstatusDocumento() {
        return descripcionEstatusDocumento;
    }

    /**
     * Define el valor de la propiedad descripcionEstatusDocumento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcionEstatusDocumento(String value) {
        this.descripcionEstatusDocumento = value;
    }

    /**
     * Obtiene el valor de la propiedad entregaMetodoDIAN.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntregaMetodoDIAN() {
        return entregaMetodoDIAN;
    }

    /**
     * Define el valor de la propiedad entregaMetodoDIAN.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntregaMetodoDIAN(String value) {
        this.entregaMetodoDIAN = value;
    }

    /**
     * Obtiene el valor de la propiedad esValidoDIAN.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEsValidoDIAN() {
        return esValidoDIAN;
    }

    /**
     * Define el valor de la propiedad esValidoDIAN.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEsValidoDIAN(Boolean value) {
        this.esValidoDIAN = value;
    }

    /**
     * Obtiene el valor de la propiedad estatusDocumento.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEstatusDocumento() {
        return estatusDocumento;
    }

    /**
     * Define el valor de la propiedad estatusDocumento.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEstatusDocumento(Integer value) {
        this.estatusDocumento = value;
    }

    /**
     * Obtiene el valor de la propiedad eventos.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfEvento }
     *     
     */
    public ArrayOfEvento getEventos() {
        return eventos;
    }

    /**
     * Define el valor de la propiedad eventos.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfEvento }
     *     
     */
    public void setEventos(ArrayOfEvento value) {
        this.eventos = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaAceptacionDIAN.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaAceptacionDIAN() {
        return fechaAceptacionDIAN;
    }

    /**
     * Define el valor de la propiedad fechaAceptacionDIAN.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaAceptacionDIAN(String value) {
        this.fechaAceptacionDIAN = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaDocumento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaDocumento() {
        return fechaDocumento;
    }

    /**
     * Define el valor de la propiedad fechaDocumento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaDocumento(String value) {
        this.fechaDocumento = value;
    }

    /**
     * Obtiene el valor de la propiedad historialDeEntregas.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfHistorialDeEntrega }
     *     
     */
    public ArrayOfHistorialDeEntrega getHistorialDeEntregas() {
        return historialDeEntregas;
    }

    /**
     * Define el valor de la propiedad historialDeEntregas.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfHistorialDeEntrega }
     *     
     */
    public void setHistorialDeEntregas(ArrayOfHistorialDeEntrega value) {
        this.historialDeEntregas = value;
    }

    /**
     * Obtiene el valor de la propiedad mensaje.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMensaje() {
        return mensaje;
    }

    /**
     * Define el valor de la propiedad mensaje.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMensaje(String value) {
        this.mensaje = value;
    }

    /**
     * Obtiene el valor de la propiedad mensajeDocumento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMensajeDocumento() {
        return mensajeDocumento;
    }

    /**
     * Define el valor de la propiedad mensajeDocumento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMensajeDocumento(String value) {
        this.mensajeDocumento = value;
    }

    /**
     * Obtiene el valor de la propiedad poseeAdjuntos.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPoseeAdjuntos() {
        return poseeAdjuntos;
    }

    /**
     * Define el valor de la propiedad poseeAdjuntos.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPoseeAdjuntos(Boolean value) {
        this.poseeAdjuntos = value;
    }

    /**
     * Obtiene el valor de la propiedad poseeRepresentacionGrafica.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPoseeRepresentacionGrafica() {
        return poseeRepresentacionGrafica;
    }

    /**
     * Define el valor de la propiedad poseeRepresentacionGrafica.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPoseeRepresentacionGrafica(Boolean value) {
        this.poseeRepresentacionGrafica = value;
    }

    /**
     * Obtiene el valor de la propiedad reglasValidacionDIAN.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfstring }
     *     
     */
    public ArrayOfstring getReglasValidacionDIAN() {
        return reglasValidacionDIAN;
    }

    /**
     * Define el valor de la propiedad reglasValidacionDIAN.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfstring }
     *     
     */
    public void setReglasValidacionDIAN(ArrayOfstring value) {
        this.reglasValidacionDIAN = value;
    }

    /**
     * Obtiene el valor de la propiedad resultado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultado() {
        return resultado;
    }

    /**
     * Define el valor de la propiedad resultado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResultado(String value) {
        this.resultado = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoCufe.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoCufe() {
        return tipoCufe;
    }

    /**
     * Define el valor de la propiedad tipoCufe.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoCufe(String value) {
        this.tipoCufe = value;
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
     * Obtiene el valor de la propiedad trackID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrackID() {
        return trackID;
    }

    /**
     * Define el valor de la propiedad trackID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrackID(String value) {
        this.trackID = value;
    }

}
