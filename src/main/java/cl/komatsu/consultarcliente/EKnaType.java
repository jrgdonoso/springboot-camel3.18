
package cl.komatsu.consultarcliente;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para e_knaType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="e_knaType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="KUNNR"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="NAME1"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="35"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SORTL"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="NAME3"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="35"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="STRAS"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="35"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ORT01"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="35"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ORT02"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="35"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LAND1"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="REGIO"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TELF1"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="16"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BRSCH"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LZONE"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KTOKD"&gt;
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
@XmlType(name = "e_knaType", propOrder = {
    "kunnr",
    "name1",
    "sortl",
    "name3",
    "stras",
    "ort01",
    "ort02",
    "land1",
    "regio",
    "telf1",
    "brsch",
    "lzone",
    "ktokd"
})
public class EKnaType {

    @XmlElement(name = "KUNNR", required = true)
    protected String kunnr;
    @XmlElement(name = "NAME1", required = true)
    protected String name1;
    @XmlElement(name = "SORTL", required = true)
    protected String sortl;
    @XmlElement(name = "NAME3", required = true)
    protected String name3;
    @XmlElement(name = "STRAS", required = true)
    protected String stras;
    @XmlElement(name = "ORT01", required = true)
    protected String ort01;
    @XmlElement(name = "ORT02", required = true)
    protected String ort02;
    @XmlElement(name = "LAND1", required = true)
    protected String land1;
    @XmlElement(name = "REGIO", required = true)
    protected String regio;
    @XmlElement(name = "TELF1", required = true)
    protected String telf1;
    @XmlElement(name = "BRSCH", required = true)
    protected String brsch;
    @XmlElement(name = "LZONE", required = true)
    protected String lzone;
    @XmlElement(name = "KTOKD", required = true)
    protected String ktokd;

    /**
     * Obtiene el valor de la propiedad kunnr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKUNNR() {
        return kunnr;
    }

    /**
     * Define el valor de la propiedad kunnr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKUNNR(String value) {
        this.kunnr = value;
    }

    /**
     * Obtiene el valor de la propiedad name1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNAME1() {
        return name1;
    }

    /**
     * Define el valor de la propiedad name1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNAME1(String value) {
        this.name1 = value;
    }

    /**
     * Obtiene el valor de la propiedad sortl.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSORTL() {
        return sortl;
    }

    /**
     * Define el valor de la propiedad sortl.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSORTL(String value) {
        this.sortl = value;
    }

    /**
     * Obtiene el valor de la propiedad name3.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNAME3() {
        return name3;
    }

    /**
     * Define el valor de la propiedad name3.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNAME3(String value) {
        this.name3 = value;
    }

    /**
     * Obtiene el valor de la propiedad stras.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTRAS() {
        return stras;
    }

    /**
     * Define el valor de la propiedad stras.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTRAS(String value) {
        this.stras = value;
    }

    /**
     * Obtiene el valor de la propiedad ort01.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getORT01() {
        return ort01;
    }

    /**
     * Define el valor de la propiedad ort01.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setORT01(String value) {
        this.ort01 = value;
    }

    /**
     * Obtiene el valor de la propiedad ort02.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getORT02() {
        return ort02;
    }

    /**
     * Define el valor de la propiedad ort02.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setORT02(String value) {
        this.ort02 = value;
    }

    /**
     * Obtiene el valor de la propiedad land1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLAND1() {
        return land1;
    }

    /**
     * Define el valor de la propiedad land1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLAND1(String value) {
        this.land1 = value;
    }

    /**
     * Obtiene el valor de la propiedad regio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREGIO() {
        return regio;
    }

    /**
     * Define el valor de la propiedad regio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREGIO(String value) {
        this.regio = value;
    }

    /**
     * Obtiene el valor de la propiedad telf1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTELF1() {
        return telf1;
    }

    /**
     * Define el valor de la propiedad telf1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTELF1(String value) {
        this.telf1 = value;
    }

    /**
     * Obtiene el valor de la propiedad brsch.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBRSCH() {
        return brsch;
    }

    /**
     * Define el valor de la propiedad brsch.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBRSCH(String value) {
        this.brsch = value;
    }

    /**
     * Obtiene el valor de la propiedad lzone.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLZONE() {
        return lzone;
    }

    /**
     * Define el valor de la propiedad lzone.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLZONE(String value) {
        this.lzone = value;
    }

    /**
     * Obtiene el valor de la propiedad ktokd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKTOKD() {
        return ktokd;
    }

    /**
     * Define el valor de la propiedad ktokd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKTOKD(String value) {
        this.ktokd = value;
    }

}
