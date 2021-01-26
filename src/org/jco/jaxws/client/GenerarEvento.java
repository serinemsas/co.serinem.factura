
package org.jco.jaxws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tokenEmpresa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tokenPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="datosEvento" type="{http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object}DatosEvento" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "tokenEmpresa",
    "tokenPassword",
    "datosEvento"
})
@XmlRootElement(name = "GenerarEvento", namespace = "http://tempuri.org/")
public class GenerarEvento {

    @XmlElement(namespace = "http://tempuri.org/", nillable = true)
    protected String tokenEmpresa;
    @XmlElement(namespace = "http://tempuri.org/", nillable = true)
    protected String tokenPassword;
    @XmlElement(namespace = "http://tempuri.org/", nillable = true)
    protected DatosEvento datosEvento;

    /**
     * Obtiene el valor de la propiedad tokenEmpresa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTokenEmpresa() {
        return tokenEmpresa;
    }

    /**
     * Define el valor de la propiedad tokenEmpresa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTokenEmpresa(String value) {
        this.tokenEmpresa = value;
    }

    /**
     * Obtiene el valor de la propiedad tokenPassword.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTokenPassword() {
        return tokenPassword;
    }

    /**
     * Define el valor de la propiedad tokenPassword.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTokenPassword(String value) {
        this.tokenPassword = value;
    }

    /**
     * Obtiene el valor de la propiedad datosEvento.
     * 
     * @return
     *     possible object is
     *     {@link DatosEvento }
     *     
     */
    public DatosEvento getDatosEvento() {
        return datosEvento;
    }

    /**
     * Define el valor de la propiedad datosEvento.
     * 
     * @param value
     *     allowed object is
     *     {@link DatosEvento }
     *     
     */
    public void setDatosEvento(DatosEvento value) {
        this.datosEvento = value;
    }

}
