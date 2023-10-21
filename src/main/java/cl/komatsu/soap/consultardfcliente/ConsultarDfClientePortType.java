package cl.komatsu.soap.consultardfcliente;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.5.2
 * 2023-10-20T12:55:37.580-03:00
 * Generated source version: 3.5.2
 *
 */
@WebService(targetNamespace = "http://consultardfcliente.soap.komatsu.cl", name = "ConsultarDfClientePortType")
@XmlSeeAlso({ObjectFactory.class})
public interface ConsultarDfClientePortType {

    @WebMethod(operationName = "ConsultarDfCliente", action = "urn:ConsultarDfCliente")
    @Action(input = "urn:ConsultarDfCliente", output = "urn:ConsultarDfClienteResponse")
    @RequestWrapper(localName = "ConsultarDfCliente", targetNamespace = "http://consultardfcliente.soap.komatsu.cl", className = "cl.komatsu.soap.consultardfcliente.ConsultarDfCliente")
    @ResponseWrapper(localName = "ConsultarDfClienteResponse", targetNamespace = "http://consultardfcliente.soap.komatsu.cl", className = "cl.komatsu.soap.consultardfcliente.ConsultarDfClienteResponse")
    public void consultarDfCliente(

        @WebParam(name = "I_KUNNR", targetNamespace = "http://consultardfcliente.soap.komatsu.cl")
        java.lang.String iKUNNR,
        @WebParam(name = "I_KKBER", targetNamespace = "http://consultardfcliente.soap.komatsu.cl")
        java.lang.String iKKBER,
        @WebParam(name = "I_BUKRS", targetNamespace = "http://consultardfcliente.soap.komatsu.cl")
        java.lang.String iBUKRS,
        @WebParam(name = "I_SPART", targetNamespace = "http://consultardfcliente.soap.komatsu.cl")
        java.lang.String iSPART,
        @WebParam(name = "I_VKORG", targetNamespace = "http://consultardfcliente.soap.komatsu.cl")
        java.lang.String iVKORG,
        @WebParam(name = "I_VTWEG", targetNamespace = "http://consultardfcliente.soap.komatsu.cl")
        java.lang.String iVTWEG,
        @WebParam(mode = WebParam.Mode.OUT, name = "GT_RETURNS", targetNamespace = "http://consultardfcliente.soap.komatsu.cl")
        javax.xml.ws.Holder<GtReturnType> gtRETURNS,
        @WebParam(mode = WebParam.Mode.OUT, name = "E_OPEN", targetNamespace = "http://consultardfcliente.soap.komatsu.cl")
        javax.xml.ws.Holder<EOpenType> eOPEN,
        @WebParam(mode = WebParam.Mode.OUT, name = "E_KNKK", targetNamespace = "http://consultardfcliente.soap.komatsu.cl")
        javax.xml.ws.Holder<EKnkkType> eKNKK,
        @WebParam(mode = WebParam.Mode.OUT, name = "E_BLOQ", targetNamespace = "http://consultardfcliente.soap.komatsu.cl")
        javax.xml.ws.Holder<EBloqType> eBLOQ,
        @WebParam(mode = WebParam.Mode.OUT, name = "E_VIAS_PAGO", targetNamespace = "http://consultardfcliente.soap.komatsu.cl")
        javax.xml.ws.Holder<java.lang.String> eVIASPAGO,
        @WebParam(mode = WebParam.Mode.OUT, name = "E_VAL_COMERCIAL", targetNamespace = "http://consultardfcliente.soap.komatsu.cl")
        javax.xml.ws.Holder<java.math.BigDecimal> eVALCOMERCIAL,
        @WebParam(mode = WebParam.Mode.OUT, name = "E_TXTBUSAB", targetNamespace = "http://consultardfcliente.soap.komatsu.cl")
        javax.xml.ws.Holder<java.lang.String> eTXTBUSAB,
        @WebParam(mode = WebParam.Mode.OUT, name = "E_SUM_OPENS", targetNamespace = "http://consultardfcliente.soap.komatsu.cl")
        javax.xml.ws.Holder<java.math.BigDecimal> eSUMOPENS,
        @WebParam(mode = WebParam.Mode.OUT, name = "E_PERCENTAGE", targetNamespace = "http://consultardfcliente.soap.komatsu.cl")
        javax.xml.ws.Holder<java.math.BigInteger> ePERCENTAGE,
        @WebParam(mode = WebParam.Mode.OUT, name = "E_KNKLI", targetNamespace = "http://consultardfcliente.soap.komatsu.cl")
        javax.xml.ws.Holder<java.lang.String> eKNKLI,
        @WebParam(mode = WebParam.Mode.OUT, name = "E_DELTA_TO_LIMIT", targetNamespace = "http://consultardfcliente.soap.komatsu.cl")
        javax.xml.ws.Holder<java.math.BigDecimal> eDELTATOLIMIT,
        @WebParam(mode = WebParam.Mode.OUT, name = "E_CREDITLIMIT", targetNamespace = "http://consultardfcliente.soap.komatsu.cl")
        javax.xml.ws.Holder<java.math.BigDecimal> eCREDITLIMIT,
        @WebParam(mode = WebParam.Mode.OUT, name = "E_COND_PAGO", targetNamespace = "http://consultardfcliente.soap.komatsu.cl")
        javax.xml.ws.Holder<java.lang.String> eCONDPAGO,
        @WebParam(mode = WebParam.Mode.OUT, name = "E_CMWAE", targetNamespace = "http://consultardfcliente.soap.komatsu.cl")
        javax.xml.ws.Holder<java.lang.String> eCMWAE,
        @WebParam(mode = WebParam.Mode.OUT, name = "E_BUSAB", targetNamespace = "http://consultardfcliente.soap.komatsu.cl")
        javax.xml.ws.Holder<java.lang.String> eBUSAB
    );
}
