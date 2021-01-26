
package org.jco.jaxws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Direccion complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Direccion"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="aCuidadoDe" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="aLaAtencionDe" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="bloque" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="buzon" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="calle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="calleAdicional" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ciudad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codigoDepartamento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="correccionHusoHorario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="departamento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="departamentoOrg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="direccion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="distrito" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="extras" type="{http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object}ArrayOfExtensible" minOccurs="0"/&gt;
 *         &lt;element name="habitacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lenguaje" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="localizacion" type="{http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object}ArrayOfCoordenadas" minOccurs="0"/&gt;
 *         &lt;element name="municipio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nombreEdificio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="numeroEdificio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="numeroParcela" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pais" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="piso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="region" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="subDivision" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ubicacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="zonaPostal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Direccion", propOrder = {
    "aCuidadoDe",
    "aLaAtencionDe",
    "bloque",
    "buzon",
    "calle",
    "calleAdicional",
    "ciudad",
    "codigoDepartamento",
    "correccionHusoHorario",
    "departamento",
    "departamentoOrg",
    "direccion",
    "distrito",
    "extras",
    "habitacion",
    "lenguaje",
    "localizacion",
    "municipio",
    "nombreEdificio",
    "numeroEdificio",
    "numeroParcela",
    "pais",
    "piso",
    "region",
    "subDivision",
    "ubicacion",
    "zonaPostal"
})
public class Direccion {

    @XmlElement(nillable = true)
    protected String aCuidadoDe;
    @XmlElement(nillable = true)
    protected String aLaAtencionDe;
    @XmlElement(nillable = true)
    protected String bloque;
    @XmlElement(nillable = true)
    protected String buzon;
    @XmlElement(nillable = true)
    protected String calle;
    @XmlElement(nillable = true)
    protected String calleAdicional;
    @XmlElement(nillable = true)
    protected String ciudad;
    @XmlElement(nillable = true)
    protected String codigoDepartamento;
    @XmlElement(nillable = true)
    protected String correccionHusoHorario;
    @XmlElement(nillable = true)
    protected String departamento;
    @XmlElement(nillable = true)
    protected String departamentoOrg;
    @XmlElement(nillable = true)
    protected String direccion;
    @XmlElement(nillable = true)
    protected String distrito;
    @XmlElement(nillable = true)
    protected ArrayOfExtensible extras;
    @XmlElement(nillable = true)
    protected String habitacion;
    @XmlElement(nillable = true)
    protected String lenguaje;
    @XmlElement(nillable = true)
    protected ArrayOfCoordenadas localizacion;
    @XmlElement(nillable = true)
    protected String municipio;
    @XmlElement(nillable = true)
    protected String nombreEdificio;
    @XmlElement(nillable = true)
    protected String numeroEdificio;
    @XmlElement(nillable = true)
    protected String numeroParcela;
    @XmlElement(nillable = true)
    protected String pais;
    @XmlElement(nillable = true)
    protected String piso;
    @XmlElement(nillable = true)
    protected String region;
    @XmlElement(nillable = true)
    protected String subDivision;
    @XmlElement(nillable = true)
    protected String ubicacion;
    @XmlElement(nillable = true)
    protected String zonaPostal;

    /**
     * Obtiene el valor de la propiedad aCuidadoDe.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACuidadoDe() {
        return aCuidadoDe;
    }

    /**
     * Define el valor de la propiedad aCuidadoDe.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACuidadoDe(String value) {
        this.aCuidadoDe = value;
    }

    /**
     * Obtiene el valor de la propiedad aLaAtencionDe.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getALaAtencionDe() {
        return aLaAtencionDe;
    }

    /**
     * Define el valor de la propiedad aLaAtencionDe.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setALaAtencionDe(String value) {
        this.aLaAtencionDe = value;
    }

    /**
     * Obtiene el valor de la propiedad bloque.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBloque() {
        return bloque;
    }

    /**
     * Define el valor de la propiedad bloque.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBloque(String value) {
        this.bloque = value;
    }

    /**
     * Obtiene el valor de la propiedad buzon.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuzon() {
        return buzon;
    }

    /**
     * Define el valor de la propiedad buzon.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuzon(String value) {
        this.buzon = value;
    }

    /**
     * Obtiene el valor de la propiedad calle.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalle() {
        return calle;
    }

    /**
     * Define el valor de la propiedad calle.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalle(String value) {
        this.calle = value;
    }

    /**
     * Obtiene el valor de la propiedad calleAdicional.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalleAdicional() {
        return calleAdicional;
    }

    /**
     * Define el valor de la propiedad calleAdicional.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalleAdicional(String value) {
        this.calleAdicional = value;
    }

    /**
     * Obtiene el valor de la propiedad ciudad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCiudad() {
        return ciudad;
    }

    /**
     * Define el valor de la propiedad ciudad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCiudad(String value) {
        this.ciudad = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoDepartamento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoDepartamento() {
        return codigoDepartamento;
    }

    /**
     * Define el valor de la propiedad codigoDepartamento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoDepartamento(String value) {
        this.codigoDepartamento = value;
    }

    /**
     * Obtiene el valor de la propiedad correccionHusoHorario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorreccionHusoHorario() {
        return correccionHusoHorario;
    }

    /**
     * Define el valor de la propiedad correccionHusoHorario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorreccionHusoHorario(String value) {
        this.correccionHusoHorario = value;
    }

    /**
     * Obtiene el valor de la propiedad departamento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartamento() {
        return departamento;
    }

    /**
     * Define el valor de la propiedad departamento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartamento(String value) {
        this.departamento = value;
    }

    /**
     * Obtiene el valor de la propiedad departamentoOrg.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartamentoOrg() {
        return departamentoOrg;
    }

    /**
     * Define el valor de la propiedad departamentoOrg.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartamentoOrg(String value) {
        this.departamentoOrg = value;
    }

    /**
     * Obtiene el valor de la propiedad direccion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Define el valor de la propiedad direccion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDireccion(String value) {
        this.direccion = value;
    }

    /**
     * Obtiene el valor de la propiedad distrito.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistrito() {
        return distrito;
    }

    /**
     * Define el valor de la propiedad distrito.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistrito(String value) {
        this.distrito = value;
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
     * Obtiene el valor de la propiedad habitacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHabitacion() {
        return habitacion;
    }

    /**
     * Define el valor de la propiedad habitacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHabitacion(String value) {
        this.habitacion = value;
    }

    /**
     * Obtiene el valor de la propiedad lenguaje.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLenguaje() {
        return lenguaje;
    }

    /**
     * Define el valor de la propiedad lenguaje.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLenguaje(String value) {
        this.lenguaje = value;
    }

    /**
     * Obtiene el valor de la propiedad localizacion.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCoordenadas }
     *     
     */
    public ArrayOfCoordenadas getLocalizacion() {
        return localizacion;
    }

    /**
     * Define el valor de la propiedad localizacion.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCoordenadas }
     *     
     */
    public void setLocalizacion(ArrayOfCoordenadas value) {
        this.localizacion = value;
    }

    /**
     * Obtiene el valor de la propiedad municipio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMunicipio() {
        return municipio;
    }

    /**
     * Define el valor de la propiedad municipio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMunicipio(String value) {
        this.municipio = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreEdificio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreEdificio() {
        return nombreEdificio;
    }

    /**
     * Define el valor de la propiedad nombreEdificio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreEdificio(String value) {
        this.nombreEdificio = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroEdificio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroEdificio() {
        return numeroEdificio;
    }

    /**
     * Define el valor de la propiedad numeroEdificio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroEdificio(String value) {
        this.numeroEdificio = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroParcela.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroParcela() {
        return numeroParcela;
    }

    /**
     * Define el valor de la propiedad numeroParcela.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroParcela(String value) {
        this.numeroParcela = value;
    }

    /**
     * Obtiene el valor de la propiedad pais.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPais() {
        return pais;
    }

    /**
     * Define el valor de la propiedad pais.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPais(String value) {
        this.pais = value;
    }

    /**
     * Obtiene el valor de la propiedad piso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPiso() {
        return piso;
    }

    /**
     * Define el valor de la propiedad piso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPiso(String value) {
        this.piso = value;
    }

    /**
     * Obtiene el valor de la propiedad region.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegion() {
        return region;
    }

    /**
     * Define el valor de la propiedad region.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegion(String value) {
        this.region = value;
    }

    /**
     * Obtiene el valor de la propiedad subDivision.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubDivision() {
        return subDivision;
    }

    /**
     * Define el valor de la propiedad subDivision.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubDivision(String value) {
        this.subDivision = value;
    }

    /**
     * Obtiene el valor de la propiedad ubicacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUbicacion() {
        return ubicacion;
    }

    /**
     * Define el valor de la propiedad ubicacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUbicacion(String value) {
        this.ubicacion = value;
    }

    /**
     * Obtiene el valor de la propiedad zonaPostal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZonaPostal() {
        return zonaPostal;
    }

    /**
     * Define el valor de la propiedad zonaPostal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZonaPostal(String value) {
        this.zonaPostal = value;
    }

}
