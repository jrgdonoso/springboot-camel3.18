
package cl.komatsu.soap.consultardfcliente;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the cl.komatsu.soap.consultardfcliente package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: cl.komatsu.soap.consultardfcliente
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GtReturnType }
     * 
     */
    public GtReturnType createGtReturnType() {
        return new GtReturnType();
    }

    /**
     * Create an instance of {@link ConsultarDfCliente }
     * 
     */
    public ConsultarDfCliente createConsultarDfCliente() {
        return new ConsultarDfCliente();
    }

    /**
     * Create an instance of {@link ConsultarDfClienteResponse }
     * 
     */
    public ConsultarDfClienteResponse createConsultarDfClienteResponse() {
        return new ConsultarDfClienteResponse();
    }

    /**
     * Create an instance of {@link EOpenType }
     * 
     */
    public EOpenType createEOpenType() {
        return new EOpenType();
    }

    /**
     * Create an instance of {@link EKnkkType }
     * 
     */
    public EKnkkType createEKnkkType() {
        return new EKnkkType();
    }

    /**
     * Create an instance of {@link EBloqType }
     * 
     */
    public EBloqType createEBloqType() {
        return new EBloqType();
    }

    /**
     * Create an instance of {@link GtReturnType.GTRETURN }
     * 
     */
    public GtReturnType.GTRETURN createGtReturnTypeGTRETURN() {
        return new GtReturnType.GTRETURN();
    }

}
