
package cl.komatsu.soap.simularcrearcliente;

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
 *         &lt;element name="I_KNA1" type="{http://simularcrearcliente.soap.komatsu.cl}i_kna1Type"/&gt;
 *         &lt;element name="I_KNVV" type="{http://simularcrearcliente.soap.komatsu.cl}i_knvvType"/&gt;
 *         &lt;element name="I_BUKRS"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="I_AKONT"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="I_ZUAWA"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="I_FDGRV"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="I_ZTERM"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="I_BZIRK"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="6"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="I_WAERS"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="I_VSBED"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="I_KTGRD"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="GT_ADRS12" type="{http://simularcrearcliente.soap.komatsu.cl}gt_adr12Type"/&gt;
 *         &lt;element name="GT_ADRS6" type="{http://simularcrearcliente.soap.komatsu.cl}gt_adr6Type"/&gt;
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
    "ikna1",
    "iknvv",
    "ibukrs",
    "iakont",
    "izuawa",
    "ifdgrv",
    "izterm",
    "ibzirk",
    "iwaers",
    "ivsbed",
    "iktgrd",
    "gtadrs12",
    "gtadrs6"
})
@XmlRootElement(name = "SimularCrearCliente")
public class SimularCrearCliente {

    @XmlElement(name = "I_KNA1", required = true)
    protected IKna1Type ikna1;
    @XmlElement(name = "I_KNVV", required = true)
    protected IKnvvType iknvv;
    @XmlElement(name = "I_BUKRS", required = true)
    protected String ibukrs;
    @XmlElement(name = "I_AKONT", required = true)
    protected String iakont;
    @XmlElement(name = "I_ZUAWA", required = true)
    protected String izuawa;
    @XmlElement(name = "I_FDGRV", required = true)
    protected String ifdgrv;
    @XmlElement(name = "I_ZTERM", required = true)
    protected String izterm;
    @XmlElement(name = "I_BZIRK", required = true)
    protected String ibzirk;
    @XmlElement(name = "I_WAERS", required = true)
    protected String iwaers;
    @XmlElement(name = "I_VSBED", required = true)
    protected String ivsbed;
    @XmlElement(name = "I_KTGRD", required = true)
    protected String iktgrd;
    @XmlElement(name = "GT_ADRS12", required = true)
    protected GtAdr12Type gtadrs12;
    @XmlElement(name = "GT_ADRS6", required = true)
    protected GtAdr6Type gtadrs6;

    /**
     * Obtiene el valor de la propiedad ikna1.
     * 
     * @return
     *     possible object is
     *     {@link IKna1Type }
     *     
     */
    public IKna1Type getIKNA1() {
        return ikna1;
    }

    /**
     * Define el valor de la propiedad ikna1.
     * 
     * @param value
     *     allowed object is
     *     {@link IKna1Type }
     *     
     */
    public void setIKNA1(IKna1Type value) {
        this.ikna1 = value;
    }

    /**
     * Obtiene el valor de la propiedad iknvv.
     * 
     * @return
     *     possible object is
     *     {@link IKnvvType }
     *     
     */
    public IKnvvType getIKNVV() {
        return iknvv;
    }

    /**
     * Define el valor de la propiedad iknvv.
     * 
     * @param value
     *     allowed object is
     *     {@link IKnvvType }
     *     
     */
    public void setIKNVV(IKnvvType value) {
        this.iknvv = value;
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
     * Obtiene el valor de la propiedad iakont.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIAKONT() {
        return iakont;
    }

    /**
     * Define el valor de la propiedad iakont.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIAKONT(String value) {
        this.iakont = value;
    }

    /**
     * Obtiene el valor de la propiedad izuawa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIZUAWA() {
        return izuawa;
    }

    /**
     * Define el valor de la propiedad izuawa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIZUAWA(String value) {
        this.izuawa = value;
    }

    /**
     * Obtiene el valor de la propiedad ifdgrv.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIFDGRV() {
        return ifdgrv;
    }

    /**
     * Define el valor de la propiedad ifdgrv.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIFDGRV(String value) {
        this.ifdgrv = value;
    }

    /**
     * Obtiene el valor de la propiedad izterm.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIZTERM() {
        return izterm;
    }

    /**
     * Define el valor de la propiedad izterm.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIZTERM(String value) {
        this.izterm = value;
    }

    /**
     * Obtiene el valor de la propiedad ibzirk.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIBZIRK() {
        return ibzirk;
    }

    /**
     * Define el valor de la propiedad ibzirk.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIBZIRK(String value) {
        this.ibzirk = value;
    }

    /**
     * Obtiene el valor de la propiedad iwaers.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIWAERS() {
        return iwaers;
    }

    /**
     * Define el valor de la propiedad iwaers.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIWAERS(String value) {
        this.iwaers = value;
    }

    /**
     * Obtiene el valor de la propiedad ivsbed.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIVSBED() {
        return ivsbed;
    }

    /**
     * Define el valor de la propiedad ivsbed.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIVSBED(String value) {
        this.ivsbed = value;
    }

    /**
     * Obtiene el valor de la propiedad iktgrd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIKTGRD() {
        return iktgrd;
    }

    /**
     * Define el valor de la propiedad iktgrd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIKTGRD(String value) {
        this.iktgrd = value;
    }

    /**
     * Obtiene el valor de la propiedad gtadrs12.
     * 
     * @return
     *     possible object is
     *     {@link GtAdr12Type }
     *     
     */
    public GtAdr12Type getGTADRS12() {
        return gtadrs12;
    }

    /**
     * Define el valor de la propiedad gtadrs12.
     * 
     * @param value
     *     allowed object is
     *     {@link GtAdr12Type }
     *     
     */
    public void setGTADRS12(GtAdr12Type value) {
        this.gtadrs12 = value;
    }

    /**
     * Obtiene el valor de la propiedad gtadrs6.
     * 
     * @return
     *     possible object is
     *     {@link GtAdr6Type }
     *     
     */
    public GtAdr6Type getGTADRS6() {
        return gtadrs6;
    }

    /**
     * Define el valor de la propiedad gtadrs6.
     * 
     * @param value
     *     allowed object is
     *     {@link GtAdr6Type }
     *     
     */
    public void setGTADRS6(GtAdr6Type value) {
        this.gtadrs6 = value;
    }

}
