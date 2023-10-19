
package cl.komatsu.soap.consultardfcliente;

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
 *         &lt;element name="I_KUNNR"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="I_KKBER"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="I_BUKRS"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="I_SPART"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="I_VKORG"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="I_VTWEG"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
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
    "ikunnr",
    "ikkber",
    "ibukrs",
    "ispart",
    "ivkorg",
    "ivtweg"
})
@XmlRootElement(name = "ConsultarDfCliente")
public class ConsultarDfCliente {

    @XmlElement(name = "I_KUNNR", required = true)
    protected String ikunnr;
    @XmlElement(name = "I_KKBER", required = true)
    protected String ikkber;
    @XmlElement(name = "I_BUKRS", required = true)
    protected String ibukrs;
    @XmlElement(name = "I_SPART", required = true)
    protected String ispart;
    @XmlElement(name = "I_VKORG", required = true)
    protected String ivkorg;
    @XmlElement(name = "I_VTWEG", required = true)
    protected String ivtweg;

    /**
     * Obtiene el valor de la propiedad ikunnr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIKUNNR() {
        return ikunnr;
    }

    /**
     * Define el valor de la propiedad ikunnr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIKUNNR(String value) {
        this.ikunnr = value;
    }

    /**
     * Obtiene el valor de la propiedad ikkber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIKKBER() {
        return ikkber;
    }

    /**
     * Define el valor de la propiedad ikkber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIKKBER(String value) {
        this.ikkber = value;
    }

    /**
     * Obtiene el valor de la propiedad ibukrs.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIBUKRS() {
        return ibukrs;
    }

    /**
     * Define el valor de la propiedad ibukrs.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIBUKRS(String value) {
        this.ibukrs = value;
    }

    /**
     * Obtiene el valor de la propiedad ispart.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISPART() {
        return ispart;
    }

    /**
     * Define el valor de la propiedad ispart.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISPART(String value) {
        this.ispart = value;
    }

    /**
     * Obtiene el valor de la propiedad ivkorg.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIVKORG() {
        return ivkorg;
    }

    /**
     * Define el valor de la propiedad ivkorg.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIVKORG(String value) {
        this.ivkorg = value;
    }

    /**
     * Obtiene el valor de la propiedad ivtweg.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIVTWEG() {
        return ivtweg;
    }

    /**
     * Define el valor de la propiedad ivtweg.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIVTWEG(String value) {
        this.ivtweg = value;
    }

}
