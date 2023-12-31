package cl.komatsu.soap.crearcliente;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.5.2
 * 2023-10-20T12:55:38.500-03:00
 * Generated source version: 3.5.2
 *
 */
@WebServiceClient(name = "CrearCliente",
                  wsdlLocation = "file:/C:/komatsu-proyectos/FUSE-Migraciones/02-%20Integraciones%20CRM/KCC-Migracion-Integraciones-Fuse-CRM-Cliente/src/main/resources/static/wsdl/crear_clientecrm.wsdl",
                  targetNamespace = "http://crearcliente.soap.komatsu.cl")
public class CrearCliente_Service extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://crearcliente.soap.komatsu.cl", "CrearCliente");
    public final static QName CrearClienteSoapEndpoint = new QName("http://crearcliente.soap.komatsu.cl", "CrearClienteSoapEndpoint");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/komatsu-proyectos/FUSE-Migraciones/02-%20Integraciones%20CRM/KCC-Migracion-Integraciones-Fuse-CRM-Cliente/src/main/resources/static/wsdl/crear_clientecrm.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(CrearCliente_Service.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "file:/C:/komatsu-proyectos/FUSE-Migraciones/02-%20Integraciones%20CRM/KCC-Migracion-Integraciones-Fuse-CRM-Cliente/src/main/resources/static/wsdl/crear_clientecrm.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public CrearCliente_Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public CrearCliente_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CrearCliente_Service() {
        super(WSDL_LOCATION, SERVICE);
    }

    public CrearCliente_Service(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public CrearCliente_Service(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public CrearCliente_Service(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns CrearClientePortType
     */
    @WebEndpoint(name = "CrearClienteSoapEndpoint")
    public CrearClientePortType getCrearClienteSoapEndpoint() {
        return super.getPort(CrearClienteSoapEndpoint, CrearClientePortType.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CrearClientePortType
     */
    @WebEndpoint(name = "CrearClienteSoapEndpoint")
    public CrearClientePortType getCrearClienteSoapEndpoint(WebServiceFeature... features) {
        return super.getPort(CrearClienteSoapEndpoint, CrearClientePortType.class, features);
    }

}
