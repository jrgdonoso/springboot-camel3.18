package cl.komatsu.rutas;

import org.apache.camel.CamelContext;
import org.apache.camel.builder.RouteBuilder;
import org.apache.cxf.Bus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import cl.komatsu.config.EnviromentVar;
import cl.komatsu.processor.ConsultaClienteCrmRequestProcessor;
import cl.komatsu.processor.ConsultaClienteCrmResponseProcessor;

@Component
public class RutaSapConsultaClienteCrmKch extends RouteBuilder {

    private EnviromentVar miEnviromentVar;
    private CamelContext miCamelContext;
    private Bus miBus;
    private ConsultaClienteCrmRequestProcessor consultaClienteCrmRequestProcessor;
    private ConsultaClienteCrmResponseProcessor consultaClienteCrmResponseProcessor;

    @Autowired
    public RutaSapConsultaClienteCrmKch(EnviromentVar enviromentVar, CamelContext camelContext, Bus bus,
            ConsultaClienteCrmRequestProcessor consultaClienteCrmRequestProcessor, ConsultaClienteCrmResponseProcessor consultaClienteCrmResponseProcessor) {
        this.miEnviromentVar = enviromentVar;
        this.miCamelContext = camelContext;
        this.miBus = bus;
        this.consultaClienteCrmRequestProcessor = consultaClienteCrmRequestProcessor;
        this.consultaClienteCrmResponseProcessor= consultaClienteCrmResponseProcessor;
    }

    @Override
    public void configure() throws Exception {

        from("direct-vm:consultaClienteCrm")
                .log("HEAD  => ${headers}")
                .log("BODY  => ${body}")
                .log("to execute funcion consultar cliente from SAP");
        // .to("execute srfc SAP")

    }

}
