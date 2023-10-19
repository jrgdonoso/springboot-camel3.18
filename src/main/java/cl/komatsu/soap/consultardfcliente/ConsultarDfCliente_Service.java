package cl.komatsu.soap.consultardfcliente;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.5.2
 * 2023-10-19T09:50:38.032-03:00
 * Generated source version: 3.5.2
 *
 */
@WebServiceClient(name = "ConsultarDfCliente",
                  wsdlLocation = "file:/C:/komatsu-proyectos/FUSE-Migraciones/02-%20Integraciones%20CRM/KCC-Migracion-Integraciones-Fuse-CRM-Cliente/src/main/resources/static/wsdl/consultar_df_clicrm.wsdl",
                  targetNamespace = "http://consultardfcliente.soap.komatsu.cl")
public class ConsultarDfCliente_Service extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://consultardfcliente.soap.komatsu.cl", "ConsultarDfCliente");
    public final static QName ConsultarDfClienteSoapEndpoint = new QName("http://consultardfcliente.soap.komatsu.cl", "ConsultarDfClienteSoapEndpoint");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/komatsu-proyectos/FUSE-Migraciones/02-%20Integraciones%20CRM/KCC-Migracion-Integraciones-Fuse-CRM-Cliente/src/main/resources/static/wsdl/consultar_df_clicrm.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(ConsultarDfCliente_Service.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "file:/C:/komatsu-proyectos/FUSE-Migraciones/02-%20Integraciones%20CRM/KCC-Migracion-Integraciones-Fuse-CRM-Cliente/src/main/resources/static/wsdl/consultar_df_clicrm.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public ConsultarDfCliente_Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public ConsultarDfCliente_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ConsultarDfCliente_Service() {
        super(WSDL_LOCATION, SERVICE);
    }

    public ConsultarDfCliente_Service(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public ConsultarDfCliente_Service(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public ConsultarDfCliente_Service(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns ConsultarDfClientePortType
     */
    @WebEndpoint(name = "ConsultarDfClienteSoapEndpoint")
    public ConsultarDfClientePortType getConsultarDfClienteSoapEndpoint() {
        return super.getPort(ConsultarDfClienteSoapEndpoint, ConsultarDfClientePortType.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ConsultarDfClientePortType
     */
    @WebEndpoint(name = "ConsultarDfClienteSoapEndpoint")
    public ConsultarDfClientePortType getConsultarDfClienteSoapEndpoint(WebServiceFeature... features) {
        return super.getPort(ConsultarDfClienteSoapEndpoint, ConsultarDfClientePortType.class, features);
    }

}
