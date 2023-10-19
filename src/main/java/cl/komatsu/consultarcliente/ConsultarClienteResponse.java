
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
 *         &lt;element name="GT_RETURNS" type="{http://consultarcliente.komatsu.cl}gt_returnType"/&gt;
 *         &lt;element name="E_KNA1" type="{http://consultarcliente.komatsu.cl}e_knaType"/&gt;
 *         &lt;element name="GT_ADRS12" type="{http://consultarcliente.komatsu.cl}gt_adr12Type"/&gt;
 *         &lt;element name="GT_ADRS6" type="{http://consultarcliente.komatsu.cl}gt_adr6Type"/&gt;
 *         &lt;element name="GT_KNVVS" type="{http://consultarcliente.komatsu.cl}gt_knvvs"/&gt;
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
    "ekna1",
    "gtadrs12",
    "gtadrs6",
    "gtknvvs"
})
@XmlRootElement(name = "ConsultarClienteResponse")
public class ConsultarClienteResponse {

    @XmlElement(name = "GT_RETURNS", required = true)
    protected GtReturnType gtreturns;
    @XmlElement(name = "E_KNA1", required = true)
    protected EKnaType ekna1;
    @XmlElement(name = "GT_ADRS12", required = true)
    protected GtAdr12Type gtadrs12;
    @XmlElement(name = "GT_ADRS6", required = true)
    protected GtAdr6Type gtadrs6;
    @XmlElement(name = "GT_KNVVS", required = true)
    protected GtKnvvs gtknvvs;

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
     * Obtiene el valor de la propiedad ekna1.
     * 
     * @return
     *     possible object is
     *     {@link EKnaType }
     *     
     */
    public EKnaType getEKNA1() {
        return ekna1;
    }

    /**
     * Define el valor de la propiedad ekna1.
     * 
     * @param value
     *     allowed object is
     *     {@link EKnaType }
     *     
     */
    public void setEKNA1(EKnaType value) {
        this.ekna1 = value;
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

    /**
     * Obtiene el valor de la propiedad gtknvvs.
     * 
     * @return
     *     possible object is
     *     {@link GtKnvvs }
     *     
     */
    public GtKnvvs getGTKNVVS() {
        return gtknvvs;
    }

    /**
     * Define el valor de la propiedad gtknvvs.
     * 
     * @param value
     *     allowed object is
     *     {@link GtKnvvs }
     *     
     */
    public void setGTKNVVS(GtKnvvs value) {
        this.gtknvvs = value;
    }

}
