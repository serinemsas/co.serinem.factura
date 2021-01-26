
package org.jco.jaxws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para FacturaImpuestos complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="FacturaImpuestos"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="baseImponibleTOTALImp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codigoTOTALImp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="controlInterno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="extras" type="{http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object}ArrayOfExtensible" minOccurs="0"/&gt;
 *         &lt;element name="porcentajeTOTALImp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="unidadMedida" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="unidadMedidaTributo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="valorTOTALImp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="valorTributoUnidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FacturaImpuestos", propOrder = {
    "baseImponibleTOTALImp",
    "codigoTOTALImp",
    "controlInterno",
    "extras",
    "porcentajeTOTALImp",
    "unidadMedida",
    "unidadMedidaTributo",
    "valorTOTALImp",
    "valorTributoUnidad"
})
public class FacturaImpuestos {

    @XmlElement(nillable = true)
    protected String baseImponibleTOTALImp;
    @XmlElement(nillable = true)
    protected String codigoTOTALImp;
    @XmlElement(nillable = true)
    protected String controlInterno;
    @XmlElement(nillable = true)
    protected ArrayOfExtensible extras;
    @XmlElement(nillable = true)
    protected String porcentajeTOTALImp;
    @XmlElement(nillable = true)
    protected String unidadMedida;
    @XmlElement(nillable = true)
    protected String unidadMedidaTributo;
    @XmlElement(nillable = true)
    protected String valorTOTALImp;
    @XmlElement(nillable = true)
    protected String valorTributoUnidad;

    /**
     * Obtiene el valor de la propiedad baseImponibleTOTALImp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseImponibleTOTALImp() {
        return baseImponibleTOTALImp;
    }

    /**
     * Define el valor de la propiedad baseImponibleTOTALImp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseImponibleTOTALImp(String value) {
        this.baseImponibleTOTALImp = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoTOTALImp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoTOTALImp() {
        return codigoTOTALImp;
    }

    /**
     * Define el valor de la propiedad codigoTOTALImp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoTOTALImp(String value) {
        this.codigoTOTALImp = value;
    }

    /**
     * Obtiene el valor de la propiedad controlInterno.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getControlInterno() {
        return controlInterno;
    }

    /**
     * Define el valor de la propiedad controlInterno.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setControlInterno(String value) {
        this.controlInterno = value;
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
     * Obtiene el valor de la propiedad porcentajeTOTALImp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPorcentajeTOTALImp() {
        return porcentajeTOTALImp;
    }

    /**
     * Define el valor de la propiedad porcentajeTOTALImp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPorcentajeTOTALImp(String value) {
        this.porcentajeTOTALImp = value;
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

    /**
     * Obtiene el valor de la propiedad unidadMedidaTributo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnidadMedidaTributo() {
        return unidadMedidaTributo;
    }

    /**
     * Define el valor de la propiedad unidadMedidaTributo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnidadMedidaTributo(String value) {
        this.unidadMedidaTributo = value;
    }

    /**
     * Obtiene el valor de la propiedad valorTOTALImp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValorTOTALImp() {
        return valorTOTALImp;
    }

    /**
     * Define el valor de la propiedad valorTOTALImp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValorTOTALImp(String value) {
        this.valorTOTALImp = value;
    }

    /**
     * Obtiene el valor de la propiedad valorTributoUnidad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValorTributoUnidad() {
        return valorTributoUnidad;
    }

    /**
     * Define el valor de la propiedad valorTributoUnidad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValorTributoUnidad(String value) {
        this.valorTributoUnidad = value;
    }

}
