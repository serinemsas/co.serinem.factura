
package org.jco.jaxws.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfLineaInformacionAdicional complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfLineaInformacionAdicional"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LineaInformacionAdicional" type="{http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object}LineaInformacionAdicional" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfLineaInformacionAdicional", propOrder = {
    "lineaInformacionAdicional"
})
public class ArrayOfLineaInformacionAdicional {

    @XmlElement(name = "LineaInformacionAdicional", nillable = true)
    protected List<LineaInformacionAdicional> lineaInformacionAdicional;

    /**
     * Gets the value of the lineaInformacionAdicional property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lineaInformacionAdicional property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLineaInformacionAdicional().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LineaInformacionAdicional }
     * 
     * 
     */
    public List<LineaInformacionAdicional> getLineaInformacionAdicional() {
        if (lineaInformacionAdicional == null) {
            lineaInformacionAdicional = new ArrayList<LineaInformacionAdicional>();
        }
        return this.lineaInformacionAdicional;
    }

}
