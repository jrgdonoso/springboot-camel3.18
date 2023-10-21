package cl.komatsu.rutas;

import org.apache.camel.CamelContext;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.cxf.CxfEndpoint;
import org.apache.camel.component.cxf.DataFormat;
//import org.apache.camel.component.cxf.common.DataFormat;
//import org.apache.camel.component.cxf.jaxws.CxfEndpoint;
import org.apache.cxf.Bus;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import cl.komatsu.config.EnviromentVar;

@Component
public class RutaSoapConsultaClienteCrmKch extends RouteBuilder {

    private EnviromentVar miEnviromentVar;
    private CamelContext miCamelContext;
    private Bus miBus;

    Logger LOGGER = LoggerFactory.getLogger(RutaSoapCrearClienteCrmKch.class);


    @Autowired
    public RutaSoapConsultaClienteCrmKch(EnviromentVar enviromentVar, CamelContext camelContext, Bus bus) {
        this.miEnviromentVar = enviromentVar;
        this.miCamelContext = camelContext;
        this.miBus = bus;

    }

    @Bean
    public CxfEndpoint consultarClienteEndpoint() throws ClassNotFoundException {

        CxfEndpoint cxfEndpoint = new CxfEndpoint();
        cxfEndpoint.setAddress(this.miEnviromentVar.getENDPOINTSOAPCONSULTARCLIENTE());
        cxfEndpoint.setServiceClass("cl.komatsu.consultarcliente.ConsultarClientePortType");
        cxfEndpoint.setDataFormat(DataFormat.PAYLOAD);

        return cxfEndpoint;
    }

    @Override
    public void configure() throws Exception {
       
                from("cxf:bean:consultarClienteEndpoint?dataFormat=PAYLOAD")
                .routeId("consulta-cliente")
                .to("direct-vm:consultaClienteCrm");

    }

}
