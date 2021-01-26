
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
 *         &lt;element name="GenerarContenedorResult" type="{http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response}ContenedorResponse" minOccurs="0"/&gt;
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
    "generarContenedorResult"
})
@XmlRootElement(name = "GenerarContenedorResponse", namespace = "http://tempuri.org/")
public class GenerarContenedorResponse {

    @XmlElement(name = "GenerarContenedorResult", namespace = "http://tempuri.org/", nillable = true)
    protected ContenedorResponse generarContenedorResult;

    /**
     * Obtiene el valor de la propiedad generarContenedorResult.
     * 
     * @return
     *     possible object is
     *     {@link ContenedorResponse }
     *     
     */
    public ContenedorResponse getGenerarContenedorResult() {
        return generarContenedorResult;
    }

    /**
     * Define el valor de la propiedad generarContenedorResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ContenedorResponse }
     *     
     */
    public void setGenerarContenedorResult(ContenedorResponse value) {
        this.generarContenedorResult = value;
    }

}
