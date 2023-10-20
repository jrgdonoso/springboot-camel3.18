
package cl.komatsu.soap.simularcrearcliente;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para gt_adr6Type complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="gt_adr6Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GT_ADR6" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="SMTP_ADDR"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="241"/&gt;
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
@XmlType(name = "gt_adr6Type", propOrder = {
    "gtadr6"
})
public class GtAdr6Type {

    @XmlElement(name = "GT_ADR6")
    protected List<GtAdr6Type.GTADR6> gtadr6;

    /**
     * Gets the value of the gtadr6 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gtadr6 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGTADR6().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GtAdr6Type.GTADR6 }
     * 
     * 
     */
    public List<GtAdr6Type.GTADR6> getGTADR6() {
        if (gtadr6 == null) {
            gtadr6 = new ArrayList<GtAdr6Type.GTADR6>();
        }
        return this.gtadr6;
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
     *         &lt;element name="SMTP_ADDR"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="241"/&gt;
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
        "smtpaddr"
    })
    public static class GTADR6 {

        @XmlElement(name = "SMTP_ADDR", required = true)
        protected String smtpaddr;

        /**
         * Obtiene el valor de la propiedad smtpaddr.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSMTPADDR() {
            return smtpaddr;
        }

        /**
         * Define el valor de la propiedad smtpaddr.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSMTPADDR(String value) {
            this.smtpaddr = value;
        }

    }

}
