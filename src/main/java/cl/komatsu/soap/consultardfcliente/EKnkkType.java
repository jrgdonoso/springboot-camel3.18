
package cl.komatsu.soap.consultardfcliente;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para e_knkkType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="e_knkkType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="XCHNG"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UEDAT"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SSOBL"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *               &lt;totalDigits value="17"/&gt;
 *               &lt;fractionDigits value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SKFOR"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *               &lt;totalDigits value="17"/&gt;
 *               &lt;fractionDigits value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SBGRP"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SAUFT"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *               &lt;totalDigits value="17"/&gt;
 *               &lt;fractionDigits value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KNKLI"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KLIMK"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *               &lt;totalDigits value="17"/&gt;
 *               &lt;fractionDigits value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DBRTG"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CTLPC"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CRBLB"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CASHD"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CASHC"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CASHA"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *               &lt;totalDigits value="15"/&gt;
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
@XmlType(name = "e_knkkType", propOrder = {
    "xchng",
    "uedat",
    "ssobl",
    "skfor",
    "sbgrp",
    "sauft",
    "knkli",
    "klimk",
    "dbrtg",
    "ctlpc",
    "crblb",
    "cashd",
    "cashc",
    "casha"
})
public class EKnkkType {

    @XmlElement(name = "XCHNG", required = true)
    protected String xchng;
    @XmlElement(name = "UEDAT", required = true)
    protected String uedat;
    @XmlElement(name = "SSOBL", required = true)
    protected BigDecimal ssobl;
    @XmlElement(name = "SKFOR", required = true)
    protected BigDecimal skfor;
    @XmlElement(name = "SBGRP", required = true)
    protected String sbgrp;
    @XmlElement(name = "SAUFT", required = true)
    protected BigDecimal sauft;
    @XmlElement(name = "KNKLI", required = true)
    protected String knkli;
    @XmlElement(name = "KLIMK", required = true)
    protected BigDecimal klimk;
    @XmlElement(name = "DBRTG", required = true)
    protected String dbrtg;
    @XmlElement(name = "CTLPC", required = true)
    protected String ctlpc;
    @XmlElement(name = "CRBLB", required = true)
    protected String crblb;
    @XmlElement(name = "CASHD", required = true)
    protected String cashd;
    @XmlElement(name = "CASHC", required = true)
    protected String cashc;
    @XmlElement(name = "CASHA", required = true)
    protected BigDecimal casha;

    /**
     * Obtiene el valor de la propiedad xchng.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXCHNG() {
        return xchng;
    }

    /**
     * Define el valor de la propiedad xchng.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXCHNG(String value) {
        this.xchng = value;
    }

    /**
     * Obtiene el valor de la propiedad uedat.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUEDAT() {
        return uedat;
    }

    /**
     * Define el valor de la propiedad uedat.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUEDAT(String value) {
        this.uedat = value;
    }

    /**
     * Obtiene el valor de la propiedad ssobl.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSSOBL() {
        return ssobl;
    }

    /**
     * Define el valor de la propiedad ssobl.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSSOBL(BigDecimal value) {
        this.ssobl = value;
    }

    /**
     * Obtiene el valor de la propiedad skfor.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSKFOR() {
        return skfor;
    }

    /**
     * Define el valor de la propiedad skfor.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSKFOR(BigDecimal value) {
        this.skfor = value;
    }

    /**
     * Obtiene el valor de la propiedad sbgrp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSBGRP() {
        return sbgrp;
    }

    /**
     * Define el valor de la propiedad sbgrp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSBGRP(String value) {
        this.sbgrp = value;
    }

    /**
     * Obtiene el valor de la propiedad sauft.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSAUFT() {
        return sauft;
    }

    /**
     * Define el valor de la propiedad sauft.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSAUFT(BigDecimal value) {
        this.sauft = value;
    }

    /**
     * Obtiene el valor de la propiedad knkli.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKNKLI() {
        return knkli;
    }

    /**
     * Define el valor de la propiedad knkli.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKNKLI(String value) {
        this.knkli = value;
    }

    /**
     * Obtiene el valor de la propiedad klimk.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getKLIMK() {
        return klimk;
    }

    /**
     * Define el valor de la propiedad klimk.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setKLIMK(BigDecimal value) {
        this.klimk = value;
    }

    /**
     * Obtiene el valor de la propiedad dbrtg.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDBRTG() {
        return dbrtg;
    }

    /**
     * Define el valor de la propiedad dbrtg.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDBRTG(String value) {
        this.dbrtg = value;
    }

    /**
     * Obtiene el valor de la propiedad ctlpc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCTLPC() {
        return ctlpc;
    }

    /**
     * Define el valor de la propiedad ctlpc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCTLPC(String value) {
        this.ctlpc = value;
    }

    /**
     * Obtiene el valor de la propiedad crblb.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCRBLB() {
        return crblb;
    }

    /**
     * Define el valor de la propiedad crblb.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCRBLB(String value) {
        this.crblb = value;
    }

    /**
     * Obtiene el valor de la propiedad cashd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCASHD() {
        return cashd;
    }

    /**
     * Define el valor de la propiedad cashd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCASHD(String value) {
        this.cashd = value;
    }

    /**
     * Obtiene el valor de la propiedad cashc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCASHC() {
        return cashc;
    }

    /**
     * Define el valor de la propiedad cashc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCASHC(String value) {
        this.cashc = value;
    }

    /**
     * Obtiene el valor de la propiedad casha.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCASHA() {
        return casha;
    }

    /**
     * Define el valor de la propiedad casha.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCASHA(BigDecimal value) {
        this.casha = value;
    }

}
