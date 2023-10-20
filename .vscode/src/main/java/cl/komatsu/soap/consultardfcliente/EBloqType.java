
package cl.komatsu.soap.consultardfcliente;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para e_bloqType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="e_bloqType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SOPVTA"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PEDIDO"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FACTURA"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ENTREGA"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
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
@XmlType(name = "e_bloqType", propOrder = {
    "sopvta",
    "pedido",
    "factura",
    "entrega"
})
public class EBloqType {

    @XmlElement(name = "SOPVTA", required = true)
    protected String sopvta;
    @XmlElement(name = "PEDIDO", required = true)
    protected String pedido;
    @XmlElement(name = "FACTURA", required = true)
    protected String factura;
    @XmlElement(name = "ENTREGA", required = true)
    protected String entrega;

    /**
     * Obtiene el valor de la propiedad sopvta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOPVTA() {
        return sopvta;
    }

    /**
     * Define el valor de la propiedad sopvta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOPVTA(String value) {
        this.sopvta = value;
    }

    /**
     * Obtiene el valor de la propiedad pedido.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPEDIDO() {
        return pedido;
    }

    /**
     * Define el valor de la propiedad pedido.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPEDIDO(String value) {
        this.pedido = value;
    }

    /**
     * Obtiene el valor de la propiedad factura.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFACTURA() {
        return factura;
    }

    /**
     * Define el valor de la propiedad factura.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFACTURA(String value) {
        this.factura = value;
    }

    /**
     * Obtiene el valor de la propiedad entrega.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getENTREGA() {
        return entrega;
    }

    /**
     * Define el valor de la propiedad entrega.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setENTREGA(String value) {
        this.entrega = value;
    }

}
