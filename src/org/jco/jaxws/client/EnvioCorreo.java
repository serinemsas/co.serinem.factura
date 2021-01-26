
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
 *         &lt;element name="documento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="correo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="adjuntos" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "documento",
    "correo",
    "adjuntos"
})
@XmlRootElement(name = "EnvioCorreo", namespace = "http://tempuri.org/")
public class EnvioCorreo {

    @XmlElement(namespace = "http://tempuri.org/", nillable = true)
    protected String tokenEmpresa;
    @XmlElement(namespace = "http://tempuri.org/", nillable = true)
    protected String tokenPassword;
    @XmlElement(namespace = "http://tempuri.org/", nillable = true)
    protected String documento;
    @XmlElement(namespace = "http://tempuri.org/", nillable = true)
    protected String correo;
    @XmlElement(namespace = "http://tempuri.org/", nillable = true)
    protected String adjuntos;

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
     * Obtiene el valor de la propiedad documento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumento() {
        return documento;
    }

    /**
     * Define el valor de la propiedad documento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumento(String value) {
        this.documento = value;
    }

    /**
     * Obtiene el valor de la propiedad correo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * Define el valor de la propiedad correo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorreo(String value) {
        this.correo = value;
    }

    /**
     * Obtiene el valor de la propiedad adjuntos.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdjuntos() {
        return adjuntos;
    }

    /**
     * Define el valor de la propiedad adjuntos.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdjuntos(String value) {
        this.adjuntos = value;
    }

}
