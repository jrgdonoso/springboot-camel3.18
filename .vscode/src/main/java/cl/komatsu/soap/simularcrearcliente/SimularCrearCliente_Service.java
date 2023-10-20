package cl.komatsu.soap.simularcrearcliente;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.5.2
 * 2023-10-20T12:55:39.043-03:00
 * Generated source version: 3.5.2
 *
 */
@WebServiceClient(name = "SimularCrearCliente",
                  wsdlLocation = "file:/C:/komatsu-proyectos/FUSE-Migraciones/02-%20Integraciones%20CRM/KCC-Migracion-Integraciones-Fuse-CRM-Cliente/src/main/resources/static/wsdl/simular_crear_clientecrm.wsdl",
                  targetNamespace = "http://simularcrearcliente.soap.komatsu.cl")
public class SimularCrearCliente_Service extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://simularcrearcliente.soap.komatsu.cl", "SimularCrearCliente");
    public final static QName SimularCrearClienteSoapEndpoint = new QName("http://simularcrearcliente.soap.komatsu.cl", "SimularCrearClienteSoapEndpoint");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/komatsu-proyectos/FUSE-Migraciones/02-%20Integraciones%20CRM/KCC-Migracion-Integraciones-Fuse-CRM-Cliente/src/main/resources/static/wsdl/simular_crear_clientecrm.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(SimularCrearCliente_Service.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "file:/C:/komatsu-proyectos/FUSE-Migraciones/02-%20Integraciones%20CRM/KCC-Migracion-Integraciones-Fuse-CRM-Cliente/src/main/resources/static/wsdl/simular_crear_clientecrm.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public SimularCrearCliente_Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public SimularCrearCliente_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SimularCrearCliente_Service() {
        super(WSDL_LOCATION, SERVICE);
    }

    public SimularCrearCliente_Service(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public SimularCrearCliente_Service(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public SimularCrearCliente_Service(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns SimularCrearClientePortType
     */
    @WebEndpoint(name = "SimularCrearClienteSoapEndpoint")
    public SimularCrearClientePortType getSimularCrearClienteSoapEndpoint() {
        return super.getPort(SimularCrearClienteSoapEndpoint, SimularCrearClientePortType.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SimularCrearClientePortType
     */
    @WebEndpoint(name = "SimularCrearClienteSoapEndpoint")
    public SimularCrearClientePortType getSimularCrearClienteSoapEndpoint(WebServiceFeature... features) {
        return super.getPort(SimularCrearClienteSoapEndpoint, SimularCrearClientePortType.class, features);
    }

}
