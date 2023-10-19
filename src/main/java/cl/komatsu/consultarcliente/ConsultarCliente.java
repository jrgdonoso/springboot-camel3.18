
package cl.komatsu.consultarcliente;

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
 *         &lt;element name="I_BUKRS"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
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
    "ibukrs"
})
@XmlRootElement(name = "ConsultarCliente")
public class ConsultarCliente {

    @XmlElement(name = "I_KUNNR", required = true)
    protected String ikunnr;
    @XmlElement(name = "I_BUKRS", required = true)
    protected String ibukrs;

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

}
