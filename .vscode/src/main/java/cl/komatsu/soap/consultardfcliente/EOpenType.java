
package cl.komatsu.soap.consultardfcliente;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para e_openType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="e_openType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SPECIALS"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *               &lt;totalDigits value="17"/&gt;
 *               &lt;fractionDigits value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ORDER"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *               &lt;totalDigits value="21"/&gt;
 *               &lt;fractionDigits value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ORDEN_SECURE"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *               &lt;totalDigits value="21"/&gt;
 *               &lt;fractionDigits value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ITEMS"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *               &lt;totalDigits value="17"/&gt;
 *               &lt;fractionDigits value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="INVOICE_SECURE"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *               &lt;totalDigits value="21"/&gt;
 *               &lt;fractionDigits value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="INVOICE"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *               &lt;totalDigits value="21"/&gt;
 *               &lt;fractionDigits value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DELIVERY_SECURE"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *               &lt;totalDigits value="21"/&gt;
 *               &lt;fractionDigits value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DELIVERY"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *               &lt;totalDigits value="21"/&gt;
 *               &lt;fractionDigits value="2"/&gt;
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
@XmlType(name = "e_openType", propOrder = {
    "specials",
    "order",
    "ordensecure",
    "items",
    "invoicesecure",
    "invoice",
    "deliverysecure",
    "delivery"
})
public class EOpenType {

    @XmlElement(name = "SPECIALS", required = true)
    protected BigDecimal specials;
    @XmlElement(name = "ORDER", required = true)
    protected BigDecimal order;
    @XmlElement(name = "ORDEN_SECURE", required = true)
    protected BigDecimal ordensecure;
    @XmlElement(name = "ITEMS", required = true)
    protected BigDecimal items;
    @XmlElement(name = "INVOICE_SECURE", required = true)
    protected BigDecimal invoicesecure;
    @XmlElement(name = "INVOICE", required = true)
    protected BigDecimal invoice;
    @XmlElement(name = "DELIVERY_SECURE", required = true)
    protected BigDecimal deliverysecure;
    @XmlElement(name = "DELIVERY", required = true)
    protected BigDecimal delivery;

    /**
     * Obtiene el valor de la propiedad specials.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSPECIALS() {
        return specials;
    }

    /**
     * Define el valor de la propiedad specials.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSPECIALS(BigDecimal value) {
        this.specials = value;
    }

    /**
     * Obtiene el valor de la propiedad order.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getORDER() {
        return order;
    }

    /**
     * Define el valor de la propiedad order.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setORDER(BigDecimal value) {
        this.order = value;
    }

    /**
     * Obtiene el valor de la propiedad ordensecure.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getORDENSECURE() {
        return ordensecure;
    }

    /**
     * Define el valor de la propiedad ordensecure.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setORDENSECURE(BigDecimal value) {
        this.ordensecure = value;
    }

    /**
     * Obtiene el valor de la propiedad items.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getITEMS() {
        return items;
    }

    /**
     * Define el valor de la propiedad items.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setITEMS(BigDecimal value) {
        this.items = value;
    }

    /**
     * Obtiene el valor de la propiedad invoicesecure.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getINVOICESECURE() {
        return invoicesecure;
    }

    /**
     * Define el valor de la propiedad invoicesecure.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setINVOICESECURE(BigDecimal value) {
        this.invoicesecure = value;
    }

    /**
     * Obtiene el valor de la propiedad invoice.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getINVOICE() {
        return invoice;
    }

    /**
     * Define el valor de la propiedad invoice.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setINVOICE(BigDecimal value) {
        this.invoice = value;
    }

    /**
     * Obtiene el valor de la propiedad deliverysecure.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDELIVERYSECURE() {
        return deliverysecure;
    }

    /**
     * Define el valor de la propiedad deliverysecure.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDELIVERYSECURE(BigDecimal value) {
        this.deliverysecure = value;
    }

    /**
     * Obtiene el valor de la propiedad delivery.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDELIVERY() {
        return delivery;
    }

    /**
     * Define el valor de la propiedad delivery.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDELIVERY(BigDecimal value) {
        this.delivery = value;
    }

}
