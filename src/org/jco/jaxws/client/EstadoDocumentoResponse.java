
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
 *         &lt;element name="EstadoDocumentoResult" type="{http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response}DocumentStatusResponse" minOccurs="0"/&gt;
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
    "estadoDocumentoResult"
})
@XmlRootElement(name = "EstadoDocumentoResponse", namespace = "http://tempuri.org/")
public class EstadoDocumentoResponse {

    @XmlElement(name = "EstadoDocumentoResult", namespace = "http://tempuri.org/", nillable = true)
    protected DocumentStatusResponse estadoDocumentoResult;

    /**
     * Obtiene el valor de la propiedad estadoDocumentoResult.
     * 
     * @return
     *     possible object is
     *     {@link DocumentStatusResponse }
     *     
     */
    public DocumentStatusResponse getEstadoDocumentoResult() {
        return estadoDocumentoResult;
    }

    /**
     * Define el valor de la propiedad estadoDocumentoResult.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentStatusResponse }
     *     
     */
    public void setEstadoDocumentoResult(DocumentStatusResponse value) {
        this.estadoDocumentoResult = value;
    }

}
