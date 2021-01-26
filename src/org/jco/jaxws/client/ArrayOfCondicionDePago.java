
package org.jco.jaxws.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfCondicionDePago complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCondicionDePago"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CondicionDePago" type="{http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object}CondicionDePago" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCondicionDePago", propOrder = {
    "condicionDePago"
})
public class ArrayOfCondicionDePago {

    @XmlElement(name = "CondicionDePago", nillable = true)
    protected List<CondicionDePago> condicionDePago;

    /**
     * Gets the value of the condicionDePago property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the condicionDePago property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCondicionDePago().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CondicionDePago }
     * 
     * 
     */
    public List<CondicionDePago> getCondicionDePago() {
        if (condicionDePago == null) {
            condicionDePago = new ArrayList<CondicionDePago>();
        }
        return this.condicionDePago;
    }

}
