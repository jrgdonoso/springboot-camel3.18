package cl.komatsu.processor;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.slf4j.Logger;
import org.fusesource.camel.component.sap.SapSynchronousRfcDestinationEndpoint;
import org.fusesource.camel.component.sap.model.rfc.Structure;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import cl.komatsu.config.EnviromentVar;
import cl.komatsu.consultarcliente.ConsultarCliente;

@Component
public class ConsultaClienteCrmRequestProcessor implements Processor {

	// private static final Logger LOGER =
	// Logger.getLogger(ConsultaClienteCrmRequestProcessor.class);

	Logger LOGGER = LoggerFactory.getLogger(ConsultaClienteCrmRequestProcessor.class);
	private static final String SAP_ENDPOINT_NAME = "sap-srfc-destination:komatsuDest:ZSDR012_CONSULTAR_CLICRM";

	@Override
	public void process(Exchange exchange) throws Exception {

		ConsultarCliente consultarClienteRequest = exchange.getIn().getBody(ConsultarCliente.class);

		LOGGER.info("ConsultarClienteCrmRequestProcessor " + consultarClienteRequest);

		SapSynchronousRfcDestinationEndpoint endpoint = exchange.getContext().getEndpoint(SAP_ENDPOINT_NAME,
				SapSynchronousRfcDestinationEndpoint.class);

		Structure request = endpoint.createRequest();

		request.put("I_BUKRS", consultarClienteRequest.getIBUKRS());
		request.put("I_KUNNR", consultarClienteRequest.getIKUNNR());

		exchange.getIn().setBody(request);
	}
}
