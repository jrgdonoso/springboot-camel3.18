package cl.komatsu.config;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class EnviromentVar {

    private Integer APPPORT;
    private String ENDPOINTSOAPCONSULTARCLIENTE;
    private String ENDPOINTSOAPCONSULTARDFCLIENTE;
    private String ENDPOINTSOAPCREARCLIENTE;
    private String ENDPOINTSOAPSIMULARCRREARCLIENTE;

    Logger LOGGER = LoggerFactory.getLogger(EnviromentVar.class);

    /**
     * 
     */
    public EnviromentVar() {

        Map<String, String> variables = System.getenv();
        this.APPPORT = Integer.parseInt(variables.get("APPPORT"));
        this.ENDPOINTSOAPCONSULTARCLIENTE = variables.get("ENDPOINTSOAPCONSULTARCLIENTE");
        this.ENDPOINTSOAPCONSULTARDFCLIENTE = variables.get("ENDPOINTSOAPCONSULTARDFCLIENTE");
        this.ENDPOINTSOAPCREARCLIENTE = variables.get("ENDPOINTSOAPCREARCLIENTE");
        this.ENDPOINTSOAPSIMULARCRREARCLIENTE = variables.get("ENDPOINTSOAPSIMULARCRREARCLIENTE");


    }

    public Integer getAPPPORT() {
        return APPPORT;
    }

    public String getENDPOINTSOAPCONSULTARCLIENTE() {
        return ENDPOINTSOAPCONSULTARCLIENTE;
    }

    public String getENDPOINTSOAPCONSULTARDFCLIENTE() {
        return ENDPOINTSOAPCONSULTARDFCLIENTE;
    }

    public String getENDPOINTSOAPCREARCLIENTE() {
        return ENDPOINTSOAPCREARCLIENTE;
    }

    public String getENDPOINTSOAPSIMULARCRREARCLIENTE() {
        return ENDPOINTSOAPSIMULARCRREARCLIENTE;
    }


    
}
