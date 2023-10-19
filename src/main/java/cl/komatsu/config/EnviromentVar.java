package cl.komatsu.config;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class EnviromentVar {

    private Integer APPPORT;
   

    Logger LOGGER = LoggerFactory.getLogger(EnviromentVar.class);


    /**
     * 
     */
    public EnviromentVar() {

        Map<String, String> variables = System.getenv();
        //this.APPPORT = Integer.parseInt(variables.get("APPPORT"));
        this.APPPORT = 8080;
        
    }
    public Integer getAPPPORT() {
        return APPPORT;
    }

}
