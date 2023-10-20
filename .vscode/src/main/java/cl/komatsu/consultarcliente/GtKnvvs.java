
package cl.komatsu.consultarcliente;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para gt_knvvs complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="gt_knvvs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GT_KNVV" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="VKORG"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="4"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="VTWEG"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="2"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="SPART"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="2"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="KDGRP"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="2"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="VKBUR"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="4"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="KKBER"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="4"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="VKGRP"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="3"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="ZTERM"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="4"/&gt;
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
@XmlType(name = "gt_knvvs", propOrder = {
    "gtknvv"
})
public class GtKnvvs {

    @XmlElement(name = "GT_KNVV")
    protected List<GtKnvvs.GTKNVV> gtknvv;

    /**
     * Gets the value of the gtknvv property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gtknvv property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGTKNVV().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GtKnvvs.GTKNVV }
     * 
     * 
     */
    public List<GtKnvvs.GTKNVV> getGTKNVV() {
        if (gtknvv == null) {
            gtknvv = new ArrayList<GtKnvvs.GTKNVV>();
        }
        return this.gtknvv;
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
     *         &lt;element name="VKORG"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="4"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="VTWEG"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="2"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="SPART"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="2"/&gt;
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
     *         &lt;element name="VKBUR"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="4"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="KKBER"&gt;
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
     *         &lt;element name="ZTERM"&gt;
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
        "vkorg",
        "vtweg",
        "spart",
        "kdgrp",
        "vkbur",
        "kkber",
        "vkgrp",
        "zterm"
    })
    public static class GTKNVV {

        @XmlElement(name = "VKORG", required = true)
        protected String vkorg;
        @XmlElement(name = "VTWEG", required = true)
        protected String vtweg;
        @XmlElement(name = "SPART", required = true)
        protected String spart;
        @XmlElement(name = "KDGRP", required = true)
        protected String kdgrp;
        @XmlElement(name = "VKBUR", required = true)
        protected String vkbur;
        @XmlElement(name = "KKBER", required = true)
        protected String kkber;
        @XmlElement(name = "VKGRP", required = true)
        protected String vkgrp;
        @XmlElement(name = "ZTERM", required = true)
        protected String zterm;

        /**
         * Obtiene el valor de la propiedad vkorg.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVKORG() {
            return vkorg;
        }

        /**
         * Define el valor de la propiedad vkorg.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVKORG(String value) {
            this.vkorg = value;
        }

        /**
         * Obtiene el valor de la propiedad vtweg.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVTWEG() {
            return vtweg;
        }

        /**
         * Define el valor de la propiedad vtweg.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVTWEG(String value) {
            this.vtweg = value;
        }

        /**
         * Obtiene el valor de la propiedad spart.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSPART() {
            return spart;
        }

        /**
         * Define el valor de la propiedad spart.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSPART(String value) {
            this.spart = value;
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
         * Obtiene el valor de la propiedad kkber.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getKKBER() {
            return kkber;
        }

        /**
         * Define el valor de la propiedad kkber.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setKKBER(String value) {
            this.kkber = value;
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
         * Obtiene el valor de la propiedad zterm.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getZTERM() {
            return zterm;
        }

        /**
         * Define el valor de la propiedad zterm.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setZTERM(String value) {
            this.zterm = value;
        }

    }

}
