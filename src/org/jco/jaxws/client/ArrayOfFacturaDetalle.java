
package org.jco.jaxws.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfFacturaDetalle complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfFacturaDetalle"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FacturaDetalle" type="{http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object}FacturaDetalle" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfFacturaDetalle", propOrder = {
    "facturaDetalle"
})
public class ArrayOfFacturaDetalle {

    @XmlElement(name = "FacturaDetalle", nillable = true)
    protected List<FacturaDetalle> facturaDetalle;

    /**
     * Gets the value of the facturaDetalle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the facturaDetalle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFacturaDetalle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FacturaDetalle }
     * 
     * 
     */
    public List<FacturaDetalle> getFacturaDetalle() {
        if (facturaDetalle == null) {
            facturaDetalle = new ArrayList<FacturaDetalle>();
        }
        return this.facturaDetalle;
    }

}
