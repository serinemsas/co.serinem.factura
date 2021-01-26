
package org.jco.jaxws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para InformacionLegal complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="InformacionLegal"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codigoEstablecimiento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nombreRegistroRUT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="numeroIdentificacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="numeroIdentificacionDV" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="numeroMatriculaMercantil" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="prefijoFacturacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tipoIdentificacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InformacionLegal", propOrder = {
    "codigoEstablecimiento",
    "nombreRegistroRUT",
    "numeroIdentificacion",
    "numeroIdentificacionDV",
    "numeroMatriculaMercantil",
    "prefijoFacturacion",
    "tipoIdentificacion"
})
public class InformacionLegal {

    @XmlElement(nillable = true)
    protected String codigoEstablecimiento;
    @XmlElement(nillable = true)
    protected String nombreRegistroRUT;
    @XmlElement(nillable = true)
    protected String numeroIdentificacion;
    @XmlElement(nillable = true)
    protected String numeroIdentificacionDV;
    @XmlElement(nillable = true)
    protected String numeroMatriculaMercantil;
    @XmlElement(nillable = true)
    protected String prefijoFacturacion;
    @XmlElement(nillable = true)
    protected String tipoIdentificacion;

    /**
     * Obtiene el valor de la propiedad codigoEstablecimiento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoEstablecimiento() {
        return codigoEstablecimiento;
    }

    /**
     * Define el valor de la propiedad codigoEstablecimiento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoEstablecimiento(String value) {
        this.codigoEstablecimiento = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreRegistroRUT.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreRegistroRUT() {
        return nombreRegistroRUT;
    }

    /**
     * Define el valor de la propiedad nombreRegistroRUT.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreRegistroRUT(String value) {
        this.nombreRegistroRUT = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroIdentificacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    /**
     * Define el valor de la propiedad numeroIdentificacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroIdentificacion(String value) {
        this.numeroIdentificacion = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroIdentificacionDV.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroIdentificacionDV() {
        return numeroIdentificacionDV;
    }

    /**
     * Define el valor de la propiedad numeroIdentificacionDV.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroIdentificacionDV(String value) {
        this.numeroIdentificacionDV = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroMatriculaMercantil.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroMatriculaMercantil() {
        return numeroMatriculaMercantil;
    }

    /**
     * Define el valor de la propiedad numeroMatriculaMercantil.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroMatriculaMercantil(String value) {
        this.numeroMatriculaMercantil = value;
    }

    /**
     * Obtiene el valor de la propiedad prefijoFacturacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrefijoFacturacion() {
        return prefijoFacturacion;
    }

    /**
     * Define el valor de la propiedad prefijoFacturacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrefijoFacturacion(String value) {
        this.prefijoFacturacion = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoIdentificacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoIdentificacion() {
        return tipoIdentificacion;
    }

    /**
     * Define el valor de la propiedad tipoIdentificacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoIdentificacion(String value) {
        this.tipoIdentificacion = value;
    }

}
