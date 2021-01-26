
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
 *         &lt;element name="CargarCertificadoResult" type="{http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response}LoadCertificateResponse" minOccurs="0"/&gt;
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
    "cargarCertificadoResult"
})
@XmlRootElement(name = "CargarCertificadoResponse", namespace = "http://tempuri.org/")
public class CargarCertificadoResponse {

    @XmlElement(name = "CargarCertificadoResult", namespace = "http://tempuri.org/", nillable = true)
    protected LoadCertificateResponse cargarCertificadoResult;

    /**
     * Obtiene el valor de la propiedad cargarCertificadoResult.
     * 
     * @return
     *     possible object is
     *     {@link LoadCertificateResponse }
     *     
     */
    public LoadCertificateResponse getCargarCertificadoResult() {
        return cargarCertificadoResult;
    }

    /**
     * Define el valor de la propiedad cargarCertificadoResult.
     * 
     * @param value
     *     allowed object is
     *     {@link LoadCertificateResponse }
     *     
     */
    public void setCargarCertificadoResult(LoadCertificateResponse value) {
        this.cargarCertificadoResult = value;
    }

}
