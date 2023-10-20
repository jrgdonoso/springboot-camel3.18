
package cl.komatsu.soap.crearcliente;

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
 *         &lt;element name="GT_RETURNS" type="{http://crearcliente.soap.komatsu.cl}gt_returnType"/&gt;
 *         &lt;element name="E_KUNNR"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
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
    "gtreturns",
    "ekunnr"
})
@XmlRootElement(name = "CrearClienteResponse")
public class CrearClienteResponse {

    @XmlElement(name = "GT_RETURNS", required = true)
    protected GtReturnType gtreturns;
    @XmlElement(name = "E_KUNNR", required = true)
    protected String ekunnr;

    /**
     * Obtiene el valor de la propiedad gtreturns.
     * 
     * @return
     *     possible object is
     *     {@link GtReturnType }
     *     
     */
    public GtReturnType getGTRETURNS() {
        return gtreturns;
    }

    /**
     * Define el valor de la propiedad gtreturns.
     * 
     * @param value
     *     allowed object is
     *     {@link GtReturnType }
     *     
     */
    public void setGTRETURNS(GtReturnType value) {
        this.gtreturns = value;
    }

    /**
     * Obtiene el valor de la propiedad ekunnr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEKUNNR() {
        return ekunnr;
    }

    /**
     * Define el valor de la propiedad ekunnr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEKUNNR(String value) {
        this.ekunnr = value;
    }

}
