
package cl.komatsu.soap.simularcrearcliente;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para gt_adr12Type complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="gt_adr12Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GT_ADR12" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="URI_ADDR"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="2048"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="URI_TYPE"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="3"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "gt_adr12Type", propOrder = {
    "gtadr12"
})
public class GtAdr12Type {

    @XmlElement(name = "GT_ADR12")
    protected List<GtAdr12Type.GTADR12> gtadr12;

    /**
     * Gets the value of the gtadr12 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gtadr12 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGTADR12().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GtAdr12Type.GTADR12 }
     * 
     * 
     */
    public List<GtAdr12Type.GTADR12> getGTADR12() {
        if (gtadr12 == null) {
            gtadr12 = new ArrayList<GtAdr12Type.GTADR12>();
        }
        return this.gtadr12;
    }


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
     *         &lt;element name="URI_ADDR"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="2048"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="URI_TYPE"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="3"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
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
        "uriaddr",
        "uritype"
    })
    public static class GTADR12 {

        @XmlElement(name = "URI_ADDR", required = true)
        protected String uriaddr;
        @XmlElement(name = "URI_TYPE", required = true)
        protected String uritype;

        /**
         * Obtiene el valor de la propiedad uriaddr.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getURIADDR() {
            return uriaddr;
        }

        /**
         * Define el valor de la propiedad uriaddr.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setURIADDR(String value) {
            this.uriaddr = value;
        }

        /**
         * Obtiene el valor de la propiedad uritype.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getURITYPE() {
            return uritype;
        }

        /**
         * Define el valor de la propiedad uritype.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setURITYPE(String value) {
            this.uritype = value;
        }

    }

}
