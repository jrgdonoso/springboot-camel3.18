package cl.komatsu.rutas;

import org.apache.camel.CamelContext;
import org.apache.camel.builder.RouteBuilder;
import org.apache.cxf.Bus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import cl.komatsu.config.EnviromentVar;

@Component
public class RutaSapCrearClienteCrmKch extends RouteBuilder {

    private EnviromentVar miEnviromentVar;
    private CamelContext miCamelContext;
    private Bus miBus;


    @Autowired
    public RutaSapCrearClienteCrmKch(EnviromentVar enviromentVar, CamelContext camelContext, Bus bus) {
        this.miEnviromentVar = enviromentVar;
        this.miCamelContext = camelContext;
        this.miBus = bus;

    }


    @Override
    public void configure() throws Exception {


        from("direct-vm:crearClienteCrm")
                .log("HEAD  => ${headers}")
                .log("BODY  => ${body}")
                .log("to execute funcion crear cliente from SAP");
              //  .to("execute srfc SAP")

    }

}
