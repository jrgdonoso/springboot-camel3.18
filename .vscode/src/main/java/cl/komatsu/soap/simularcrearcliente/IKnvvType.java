
package cl.komatsu.soap.simularcrearcliente;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para i_knvvType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="i_knvvType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="VKBUR"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VKGRP"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDGRP"&gt;
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
@XmlType(name = "i_knvvType", propOrder = {
    "vkbur",
    "vkgrp",
    "kdgrp"
})
public class IKnvvType {

    @XmlElement(name = "VKBUR", required = true)
    protected String vkbur;
    @XmlElement(name = "VKGRP", required = true)
    protected String vkgrp;
    @XmlElement(name = "KDGRP", required = true)
    protected String kdgrp;

    /**
     * Obtiene el valor de la propiedad vkbur.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVKBUR() {
        return vkbur;
    }

    /**
     * Define el valor de la propiedad vkbur.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVKBUR(String value) {
        this.vkbur = value;
    }

    /**
     * Obtiene el valor de la propiedad vkgrp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVKGRP() {
        return vkgrp;
    }

    /**
     * Define el valor de la propiedad vkgrp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVKGRP(String value) {
        this.vkgrp = value;
    }

    /**
     * Obtiene el valor de la propiedad kdgrp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDGRP() {
        return kdgrp;
    }

    /**
     * Define el valor de la propiedad kdgrp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDGRP(String value) {
        this.kdgrp = value;
    }

}
