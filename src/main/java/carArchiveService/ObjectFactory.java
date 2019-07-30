
package carArchiveService;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the carArchiveService package. 
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

    private final static QName _GetByCarnumber_QNAME = new QName("http://car.service.oa.htsoft.com/", "getByCarnumber");
    private final static QName _GetCarArchiveByEquips_QNAME = new QName("http://car.service.oa.htsoft.com/", "getCarArchiveByEquips");
    private final static QName _ListPageAllResponse_QNAME = new QName("http://car.service.oa.htsoft.com/", "listPageAllResponse");
    private final static QName _ListPageAll_QNAME = new QName("http://car.service.oa.htsoft.com/", "listPageAll");
    private final static QName _ListAllResponse_QNAME = new QName("http://car.service.oa.htsoft.com/", "listAllResponse");
    private final static QName _ListAll_QNAME = new QName("http://car.service.oa.htsoft.com/", "listAll");
    private final static QName _GetCarArchiveByEquipsResponse_QNAME = new QName("http://car.service.oa.htsoft.com/", "getCarArchiveByEquipsResponse");
    private final static QName _GetByCarnumberResponse_QNAME = new QName("http://car.service.oa.htsoft.com/", "getByCarnumberResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: carArchiveService
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ListPageAllResponse }
     * 
     */
    public ListPageAllResponse createListPageAllResponse() {
        return new ListPageAllResponse();
    }

    /**
     * Create an instance of {@link GetByCarnumber }
     * 
     */
    public GetByCarnumber createGetByCarnumber() {
        return new GetByCarnumber();
    }

    /**
     * Create an instance of {@link GetCarArchiveByEquips }
     * 
     */
    public GetCarArchiveByEquips createGetCarArchiveByEquips() {
        return new GetCarArchiveByEquips();
    }

    /**
     * Create an instance of {@link ListAllResponse }
     * 
     */
    public ListAllResponse createListAllResponse() {
        return new ListAllResponse();
    }

    /**
     * Create an instance of {@link ListPageAll }
     * 
     */
    public ListPageAll createListPageAll() {
        return new ListPageAll();
    }

    /**
     * Create an instance of {@link ListAll }
     * 
     */
    public ListAll createListAll() {
        return new ListAll();
    }

    /**
     * Create an instance of {@link GetCarArchiveByEquipsResponse }
     * 
     */
    public GetCarArchiveByEquipsResponse createGetCarArchiveByEquipsResponse() {
        return new GetCarArchiveByEquipsResponse();
    }

    /**
     * Create an instance of {@link GetByCarnumberResponse }
     * 
     */
    public GetByCarnumberResponse createGetByCarnumberResponse() {
        return new GetByCarnumberResponse();
    }

    /**
     * Create an instance of {@link CarArchive }
     * 
     */
    public CarArchive createCarArchive() {
        return new CarArchive();
    }

    /**
     * Create an instance of {@link BaseModel }
     * 
     */
    public BaseModel createBaseModel() {
        return new BaseModel();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetByCarnumber }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://car.service.oa.htsoft.com/", name = "getByCarnumber")
    public JAXBElement<GetByCarnumber> createGetByCarnumber(GetByCarnumber value) {
        return new JAXBElement<GetByCarnumber>(_GetByCarnumber_QNAME, GetByCarnumber.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCarArchiveByEquips }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://car.service.oa.htsoft.com/", name = "getCarArchiveByEquips")
    public JAXBElement<GetCarArchiveByEquips> createGetCarArchiveByEquips(GetCarArchiveByEquips value) {
        return new JAXBElement<GetCarArchiveByEquips>(_GetCarArchiveByEquips_QNAME, GetCarArchiveByEquips.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListPageAllResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://car.service.oa.htsoft.com/", name = "listPageAllResponse")
    public JAXBElement<ListPageAllResponse> createListPageAllResponse(ListPageAllResponse value) {
        return new JAXBElement<ListPageAllResponse>(_ListPageAllResponse_QNAME, ListPageAllResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListPageAll }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://car.service.oa.htsoft.com/", name = "listPageAll")
    public JAXBElement<ListPageAll> createListPageAll(ListPageAll value) {
        return new JAXBElement<ListPageAll>(_ListPageAll_QNAME, ListPageAll.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListAllResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://car.service.oa.htsoft.com/", name = "listAllResponse")
    public JAXBElement<ListAllResponse> createListAllResponse(ListAllResponse value) {
        return new JAXBElement<ListAllResponse>(_ListAllResponse_QNAME, ListAllResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListAll }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://car.service.oa.htsoft.com/", name = "listAll")
    public JAXBElement<ListAll> createListAll(ListAll value) {
        return new JAXBElement<ListAll>(_ListAll_QNAME, ListAll.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCarArchiveByEquipsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://car.service.oa.htsoft.com/", name = "getCarArchiveByEquipsResponse")
    public JAXBElement<GetCarArchiveByEquipsResponse> createGetCarArchiveByEquipsResponse(GetCarArchiveByEquipsResponse value) {
        return new JAXBElement<GetCarArchiveByEquipsResponse>(_GetCarArchiveByEquipsResponse_QNAME, GetCarArchiveByEquipsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetByCarnumberResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://car.service.oa.htsoft.com/", name = "getByCarnumberResponse")
    public JAXBElement<GetByCarnumberResponse> createGetByCarnumberResponse(GetByCarnumberResponse value) {
        return new JAXBElement<GetByCarnumberResponse>(_GetByCarnumberResponse_QNAME, GetByCarnumberResponse.class, null, value);
    }

}
