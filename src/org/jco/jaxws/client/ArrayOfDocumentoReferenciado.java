
package org.jco.jaxws.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfDocumentoReferenciado complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDocumentoReferenciado"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DocumentoReferenciado" type="{http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object}DocumentoReferenciado" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDocumentoReferenciado", propOrder = {
    "documentoReferenciado"
})
public class ArrayOfDocumentoReferenciado {

    @XmlElement(name = "DocumentoReferenciado", nillable = true)
    protected List<DocumentoReferenciado> documentoReferenciado;

    /**
     * Gets the value of the documentoReferenciado property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the documentoReferenciado property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocumentoReferenciado().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentoReferenciado }
     * 
     * 
     */
    public List<DocumentoReferenciado> getDocumentoReferenciado() {
        if (documentoReferenciado == null) {
            documentoReferenciado = new ArrayList<DocumentoReferenciado>();
        }
        return this.documentoReferenciado;
    }

}
