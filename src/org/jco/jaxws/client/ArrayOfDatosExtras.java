
package org.jco.jaxws.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfDatosExtras complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDatosExtras"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DatosExtras" type="{http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object}DatosExtras" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDatosExtras", propOrder = {
    "datosExtras"
})
public class ArrayOfDatosExtras {

    @XmlElement(name = "DatosExtras", nillable = true)
    protected List<DatosExtras> datosExtras;

    /**
     * Gets the value of the datosExtras property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the datosExtras property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDatosExtras().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DatosExtras }
     * 
     * 
     */
    public List<DatosExtras> getDatosExtras() {
        if (datosExtras == null) {
            datosExtras = new ArrayList<DatosExtras>();
        }
        return this.datosExtras;
    }

}
