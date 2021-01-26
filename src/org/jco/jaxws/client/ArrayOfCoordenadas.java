
package org.jco.jaxws.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfCoordenadas complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCoordenadas"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Coordenadas" type="{http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object}Coordenadas" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCoordenadas", propOrder = {
    "coordenadas"
})
public class ArrayOfCoordenadas {

    @XmlElement(name = "Coordenadas", nillable = true)
    protected List<Coordenadas> coordenadas;

    /**
     * Gets the value of the coordenadas property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the coordenadas property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCoordenadas().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Coordenadas }
     * 
     * 
     */
    public List<Coordenadas> getCoordenadas() {
        if (coordenadas == null) {
            coordenadas = new ArrayList<Coordenadas>();
        }
        return this.coordenadas;
    }

}
