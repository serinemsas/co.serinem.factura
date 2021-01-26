
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
 *         &lt;element name="FoliosRestantesResult" type="{http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response}FoliosRemainingResponse" minOccurs="0"/&gt;
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
    "foliosRestantesResult"
})
@XmlRootElement(name = "FoliosRestantesResponse", namespace = "http://tempuri.org/")
public class FoliosRestantesResponse {

    @XmlElement(name = "FoliosRestantesResult", namespace = "http://tempuri.org/", nillable = true)
    protected FoliosRemainingResponse foliosRestantesResult;

    /**
     * Obtiene el valor de la propiedad foliosRestantesResult.
     * 
     * @return
     *     possible object is
     *     {@link FoliosRemainingResponse }
     *     
     */
    public FoliosRemainingResponse getFoliosRestantesResult() {
        return foliosRestantesResult;
    }

    /**
     * Define el valor de la propiedad foliosRestantesResult.
     * 
     * @param value
     *     allowed object is
     *     {@link FoliosRemainingResponse }
     *     
     */
    public void setFoliosRestantesResult(FoliosRemainingResponse value) {
        this.foliosRestantesResult = value;
    }

}
