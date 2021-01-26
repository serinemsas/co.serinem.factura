
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
 *         &lt;element name="DescargarEventoXMLResult" type="{http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response}DescargarEventoResponse" minOccurs="0"/&gt;
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
    "descargarEventoXMLResult"
})
@XmlRootElement(name = "DescargarEventoXMLResponse", namespace = "http://tempuri.org/")
public class DescargarEventoXMLResponse {

    @XmlElement(name = "DescargarEventoXMLResult", namespace = "http://tempuri.org/", nillable = true)
    protected DescargarEventoResponse descargarEventoXMLResult;

    /**
     * Obtiene el valor de la propiedad descargarEventoXMLResult.
     * 
     * @return
     *     possible object is
     *     {@link DescargarEventoResponse }
     *     
     */
    public DescargarEventoResponse getDescargarEventoXMLResult() {
        return descargarEventoXMLResult;
    }

    /**
     * Define el valor de la propiedad descargarEventoXMLResult.
     * 
     * @param value
     *     allowed object is
     *     {@link DescargarEventoResponse }
     *     
     */
    public void setDescargarEventoXMLResult(DescargarEventoResponse value) {
        this.descargarEventoXMLResult = value;
    }

}
