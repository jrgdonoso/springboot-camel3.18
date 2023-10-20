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
public class RutaSoapSimulaCrearClienteCrmKch extends RouteBuilder {

    private EnviromentVar miEnviromentVar;
    private CamelContext miCamelContext;
    private Bus miBus;

    Logger LOGGER = LoggerFactory.getLogger(RutaSoapConsultaClienteCrmKch.class);


    @Autowired
    public RutaSoapSimulaCrearClienteCrmKch(EnviromentVar enviromentVar, CamelContext camelContext, Bus bus) {
        this.miEnviromentVar = enviromentVar;
        this.miCamelContext = camelContext;
        this.miBus = bus;

    }

    @Bean
    public CxfEndpoint simularCrearClienteEndpoint() throws ClassNotFoundException {

        CxfEndpoint cxfEndpoint = new CxfEndpoint();
        cxfEndpoint.setAddress(this.miEnviromentVar.getENDPOINTSOAPSIMULARCRREARCLIENTE());
        cxfEndpoint.setServiceClass("cl.komatsu.soap.simularcrearcliente.SimularCrearClientePortType");
        cxfEndpoint.setDataFormat(DataFormat.PAYLOAD);

        return cxfEndpoint;
    }

    @Override
    public void configure() throws Exception {
       
                from("cxf:bean:simularCrearClienteEndpoint?dataFormat=PAYLOAD")
                .routeId("simular-crear-cliente")
                .to("direct-vm:simularCrearClienteCrm");

    }

}
