
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
 *         &lt;element name="certificado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "certificado",
    "password"
})
@XmlRootElement(name = "CargarCertificado", namespace = "http://tempuri.org/")
public class CargarCertificado {

    @XmlElement(namespace = "http://tempuri.org/", nillable = true)
    protected String tokenEmpresa;
    @XmlElement(namespace = "http://tempuri.org/", nillable = true)
    protected String tokenPassword;
    @XmlElement(namespace = "http://tempuri.org/", nillable = true)
    protected String certificado;
    @XmlElement(namespace = "http://tempuri.org/", nillable = true)
    protected String password;

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
     * Obtiene el valor de la propiedad certificado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertificado() {
        return certificado;
    }

    /**
     * Define el valor de la propiedad certificado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCertificado(String value) {
        this.certificado = value;
    }

    /**
     * Obtiene el valor de la propiedad password.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Define el valor de la propiedad password.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

}
