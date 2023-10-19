
package cl.komatsu.soap.consultardfcliente;

import java.math.BigDecimal;
import java.math.BigInteger;
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
 *         &lt;element name="GT_RETURNS" type="{http://consultardfcliente.soap.komatsu.cl}gt_returnType"/&gt;
 *         &lt;element name="E_OPEN" type="{http://consultardfcliente.soap.komatsu.cl}e_openType"/&gt;
 *         &lt;element name="E_KNKK" type="{http://consultardfcliente.soap.komatsu.cl}e_knkkType"/&gt;
 *         &lt;element name="E_BLOQ" type="{http://consultardfcliente.soap.komatsu.cl}e_bloqType"/&gt;
 *         &lt;element name="E_VIAS_PAGO"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="E_VAL_COMERCIAL"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *               &lt;totalDigits value="17"/&gt;
 *               &lt;fractionDigits value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="E_TXTBUSAB"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="30"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="E_SUM_OPENS"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *               &lt;totalDigits value="17"/&gt;
 *               &lt;fractionDigits value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="E_PERCENTAGE"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
 *               &lt;totalDigits value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="E_KNKLI"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="E_DELTA_TO_LIMIT"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *               &lt;totalDigits value="17"/&gt;
 *               &lt;fractionDigits value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="E_CREDITLIMIT"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *               &lt;totalDigits value="17"/&gt;
 *               &lt;fractionDigits value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="E_COND_PAGO"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="E_CMWAE"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="E_BUSAB"&gt;
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
    "gtreturns",
    "eopen",
    "eknkk",
    "ebloq",
    "eviaspago",
    "evalcomercial",
    "etxtbusab",
    "esumopens",
    "epercentage",
    "eknkli",
    "edeltatolimit",
    "ecreditlimit",
    "econdpago",
    "ecmwae",
    "ebusab"
})
@XmlRootElement(name = "ConsultarDfClienteResponse")
public class ConsultarDfClienteResponse {

    @XmlElement(name = "GT_RETURNS", required = true)
    protected GtReturnType gtreturns;
    @XmlElement(name = "E_OPEN", required = true)
    protected EOpenType eopen;
    @XmlElement(name = "E_KNKK", required = true)
    protected EKnkkType eknkk;
    @XmlElement(name = "E_BLOQ", required = true)
    protected EBloqType ebloq;
    @XmlElement(name = "E_VIAS_PAGO", required = true)
    protected String eviaspago;
    @XmlElement(name = "E_VAL_COMERCIAL", required = true)
    protected BigDecimal evalcomercial;
    @XmlElement(name = "E_TXTBUSAB", required = true)
    protected String etxtbusab;
    @XmlElement(name = "E_SUM_OPENS", required = true)
    protected BigDecimal esumopens;
    @XmlElement(name = "E_PERCENTAGE", required = true)
    protected BigInteger epercentage;
    @XmlElement(name = "E_KNKLI", required = true)
    protected String eknkli;
    @XmlElement(name = "E_DELTA_TO_LIMIT", required = true)
    protected BigDecimal edeltatolimit;
    @XmlElement(name = "E_CREDITLIMIT", required = true)
    protected BigDecimal ecreditlimit;
    @XmlElement(name = "E_COND_PAGO", required = true)
    protected String econdpago;
    @XmlElement(name = "E_CMWAE", required = true)
    protected String ecmwae;
    @XmlElement(name = "E_BUSAB", required = true)
    protected String ebusab;

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
     * Obtiene el valor de la propiedad eopen.
     * 
     * @return
     *     possible object is
     *     {@link EOpenType }
     *     
     */
    public EOpenType getEOPEN() {
        return eopen;
    }

    /**
     * Define el valor de la propiedad eopen.
     * 
     * @param value
     *     allowed object is
     *     {@link EOpenType }
     *     
     */
    public void setEOPEN(EOpenType value) {
        this.eopen = value;
    }

    /**
     * Obtiene el valor de la propiedad eknkk.
     * 
     * @return
     *     possible object is
     *     {@link EKnkkType }
     *     
     */
    public EKnkkType getEKNKK() {
        return eknkk;
    }

    /**
     * Define el valor de la propiedad eknkk.
     * 
     * @param value
     *     allowed object is
     *     {@link EKnkkType }
     *     
     */
    public void setEKNKK(EKnkkType value) {
        this.eknkk = value;
    }

    /**
     * Obtiene el valor de la propiedad ebloq.
     * 
     * @return
     *     possible object is
     *     {@link EBloqType }
     *     
     */
    public EBloqType getEBLOQ() {
        return ebloq;
    }

    /**
     * Define el valor de la propiedad ebloq.
     * 
     * @param value
     *     allowed object is
     *     {@link EBloqType }
     *     
     */
    public void setEBLOQ(EBloqType value) {
        this.ebloq = value;
    }

    /**
     * Obtiene el valor de la propiedad eviaspago.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEVIASPAGO() {
        return eviaspago;
    }

    /**
     * Define el valor de la propiedad eviaspago.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEVIASPAGO(String value) {
        this.eviaspago = value;
    }

    /**
     * Obtiene el valor de la propiedad evalcomercial.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEVALCOMERCIAL() {
        return evalcomercial;
    }

    /**
     * Define el valor de la propiedad evalcomercial.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEVALCOMERCIAL(BigDecimal value) {
        this.evalcomercial = value;
    }

    /**
     * Obtiene el valor de la propiedad etxtbusab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getETXTBUSAB() {
        return etxtbusab;
    }

    /**
     * Define el valor de la propiedad etxtbusab.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setETXTBUSAB(String value) {
        this.etxtbusab = value;
    }

    /**
     * Obtiene el valor de la propiedad esumopens.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getESUMOPENS() {
        return esumopens;
    }

    /**
     * Define el valor de la propiedad esumopens.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setESUMOPENS(BigDecimal value) {
        this.esumopens = value;
    }

    /**
     * Obtiene el valor de la propiedad epercentage.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEPERCENTAGE() {
        return epercentage;
    }

    /**
     * Define el valor de la propiedad epercentage.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEPERCENTAGE(BigInteger value) {
        this.epercentage = value;
    }

    /**
     * Obtiene el valor de la propiedad eknkli.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEKNKLI() {
        return eknkli;
    }

    /**
     * Define el valor de la propiedad eknkli.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEKNKLI(String value) {
        this.eknkli = value;
    }

    /**
     * Obtiene el valor de la propiedad edeltatolimit.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEDELTATOLIMIT() {
        return edeltatolimit;
    }

    /**
     * Define el valor de la propiedad edeltatolimit.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEDELTATOLIMIT(BigDecimal value) {
        this.edeltatolimit = value;
    }

    /**
     * Obtiene el valor de la propiedad ecreditlimit.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getECREDITLIMIT() {
        return ecreditlimit;
    }

    /**
     * Define el valor de la propiedad ecreditlimit.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setECREDITLIMIT(BigDecimal value) {
        this.ecreditlimit = value;
    }

    /**
     * Obtiene el valor de la propiedad econdpago.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getECONDPAGO() {
        return econdpago;
    }

    /**
     * Define el valor de la propiedad econdpago.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setECONDPAGO(String value) {
        this.econdpago = value;
    }

    /**
     * Obtiene el valor de la propiedad ecmwae.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getECMWAE() {
        return ecmwae;
    }

    /**
     * Define el valor de la propiedad ecmwae.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setECMWAE(String value) {
        this.ecmwae = value;
    }

    /**
     * Obtiene el valor de la propiedad ebusab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEBUSAB() {
        return ebusab;
    }

    /**
     * Define el valor de la propiedad ebusab.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEBUSAB(String value) {
        this.ebusab = value;
    }

}
