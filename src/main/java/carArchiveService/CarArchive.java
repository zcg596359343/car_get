
package carArchiveService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>carArchive complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="carArchive">
 *   &lt;complexContent>
 *     &lt;extension base="{http://car.service.oa.htsoft.com/}baseModel">
 *       &lt;sequence>
 *         &lt;element name="annualInspection" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="buyprice" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="buytime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="carmeter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="carnumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="costpertask" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="descs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="displacement" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="enginenumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="equips" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="framenumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fuel" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="fueleconomy" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="initmileage" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="insurance" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="memo1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="memo2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="memo3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mileage" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="modify" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="names" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="newCAi" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="newInsurance" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="oils" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="owner" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ownername" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="persons" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="registertime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="runstatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="speed" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="statusname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sum" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="tasknums" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="voltage" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="weight" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "carArchive", propOrder = {
    "annualInspection",
    "buyprice",
    "buytime",
    "carmeter",
    "carnumber",
    "costpertask",
    "descs",
    "displacement",
    "enginenumber",
    "equips",
    "framenumber",
    "fuel",
    "fueleconomy",
    "id",
    "initmileage",
    "insurance",
    "memo1",
    "memo2",
    "memo3",
    "mileage",
    "modify",
    "names",
    "newCAi",
    "newInsurance",
    "oils",
    "owner",
    "ownername",
    "persons",
    "registertime",
    "runstatus",
    "speed",
    "status",
    "statusname",
    "sum",
    "tasknums",
    "type",
    "voltage",
    "weight"
})
public class CarArchive
    extends BaseModel
{

    protected Double annualInspection;
    protected Double buyprice;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar buytime;
    protected String carmeter;
    protected String carnumber;
    protected Double costpertask;
    protected String descs;
    protected Double displacement;
    protected String enginenumber;
    protected String equips;
    protected String framenumber;
    protected Double fuel;
    protected Double fueleconomy;
    protected Long id;
    protected Double initmileage;
    protected Double insurance;
    protected String memo1;
    protected String memo2;
    protected String memo3;
    protected Double mileage;
    protected Double modify;
    protected String names;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar newCAi;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar newInsurance;
    protected Double oils;
    protected Long owner;
    protected String ownername;
    protected Integer persons;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar registertime;
    protected String runstatus;
    protected Double speed;
    protected Long status;
    protected String statusname;
    protected Double sum;
    protected Integer tasknums;
    protected String type;
    protected Double voltage;
    protected Double weight;

    /**
     * ��ȡannualInspection���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAnnualInspection() {
        return annualInspection;
    }

    /**
     * ����annualInspection���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAnnualInspection(Double value) {
        this.annualInspection = value;
    }

    /**
     * ��ȡbuyprice���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getBuyprice() {
        return buyprice;
    }

    /**
     * ����buyprice���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBuyprice(Double value) {
        this.buyprice = value;
    }

    /**
     * ��ȡbuytime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBuytime() {
        return buytime;
    }

    /**
     * ����buytime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBuytime(XMLGregorianCalendar value) {
        this.buytime = value;
    }

    /**
     * ��ȡcarmeter���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarmeter() {
        return carmeter;
    }

    /**
     * ����carmeter���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarmeter(String value) {
        this.carmeter = value;
    }

    /**
     * ��ȡcarnumber���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarnumber() {
        return carnumber;
    }

    /**
     * ����carnumber���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarnumber(String value) {
        this.carnumber = value;
    }

    /**
     * ��ȡcostpertask���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCostpertask() {
        return costpertask;
    }

    /**
     * ����costpertask���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCostpertask(Double value) {
        this.costpertask = value;
    }

    /**
     * ��ȡdescs���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescs() {
        return descs;
    }

    /**
     * ����descs���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescs(String value) {
        this.descs = value;
    }

    /**
     * ��ȡdisplacement���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDisplacement() {
        return displacement;
    }

    /**
     * ����displacement���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDisplacement(Double value) {
        this.displacement = value;
    }

    /**
     * ��ȡenginenumber���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnginenumber() {
        return enginenumber;
    }

    /**
     * ����enginenumber���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnginenumber(String value) {
        this.enginenumber = value;
    }

    /**
     * ��ȡequips���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEquips() {
        return equips;
    }

    /**
     * ����equips���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEquips(String value) {
        this.equips = value;
    }

    /**
     * ��ȡframenumber���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFramenumber() {
        return framenumber;
    }

    /**
     * ����framenumber���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFramenumber(String value) {
        this.framenumber = value;
    }

    /**
     * ��ȡfuel���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getFuel() {
        return fuel;
    }

    /**
     * ����fuel���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setFuel(Double value) {
        this.fuel = value;
    }

    /**
     * ��ȡfueleconomy���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getFueleconomy() {
        return fueleconomy;
    }

    /**
     * ����fueleconomy���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setFueleconomy(Double value) {
        this.fueleconomy = value;
    }

    /**
     * ��ȡid���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * ����id���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
    }

    /**
     * ��ȡinitmileage���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getInitmileage() {
        return initmileage;
    }

    /**
     * ����initmileage���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setInitmileage(Double value) {
        this.initmileage = value;
    }

    /**
     * ��ȡinsurance���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getInsurance() {
        return insurance;
    }

    /**
     * ����insurance���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setInsurance(Double value) {
        this.insurance = value;
    }

    /**
     * ��ȡmemo1���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemo1() {
        return memo1;
    }

    /**
     * ����memo1���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMemo1(String value) {
        this.memo1 = value;
    }

    /**
     * ��ȡmemo2���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemo2() {
        return memo2;
    }

    /**
     * ����memo2���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMemo2(String value) {
        this.memo2 = value;
    }

    /**
     * ��ȡmemo3���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemo3() {
        return memo3;
    }

    /**
     * ����memo3���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMemo3(String value) {
        this.memo3 = value;
    }

    /**
     * ��ȡmileage���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMileage() {
        return mileage;
    }

    /**
     * ����mileage���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMileage(Double value) {
        this.mileage = value;
    }

    /**
     * ��ȡmodify���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getModify() {
        return modify;
    }

    /**
     * ����modify���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setModify(Double value) {
        this.modify = value;
    }

    /**
     * ��ȡnames���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNames() {
        return names;
    }

    /**
     * ����names���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNames(String value) {
        this.names = value;
    }

    /**
     * ��ȡnewCAi���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNewCAi() {
        return newCAi;
    }

    /**
     * ����newCAi���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNewCAi(XMLGregorianCalendar value) {
        this.newCAi = value;
    }

    /**
     * ��ȡnewInsurance���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNewInsurance() {
        return newInsurance;
    }

    /**
     * ����newInsurance���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNewInsurance(XMLGregorianCalendar value) {
        this.newInsurance = value;
    }

    /**
     * ��ȡoils���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getOils() {
        return oils;
    }

    /**
     * ����oils���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setOils(Double value) {
        this.oils = value;
    }

    /**
     * ��ȡowner���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOwner() {
        return owner;
    }

    /**
     * ����owner���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOwner(Long value) {
        this.owner = value;
    }

    /**
     * ��ȡownername���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnername() {
        return ownername;
    }

    /**
     * ����ownername���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnername(String value) {
        this.ownername = value;
    }

    /**
     * ��ȡpersons���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPersons() {
        return persons;
    }

    /**
     * ����persons���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPersons(Integer value) {
        this.persons = value;
    }

    /**
     * ��ȡregistertime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRegistertime() {
        return registertime;
    }

    /**
     * ����registertime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRegistertime(XMLGregorianCalendar value) {
        this.registertime = value;
    }

    /**
     * ��ȡrunstatus���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRunstatus() {
        return runstatus;
    }

    /**
     * ����runstatus���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRunstatus(String value) {
        this.runstatus = value;
    }

    /**
     * ��ȡspeed���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSpeed() {
        return speed;
    }

    /**
     * ����speed���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSpeed(Double value) {
        this.speed = value;
    }

    /**
     * ��ȡstatus���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getStatus() {
        return status;
    }

    /**
     * ����status���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setStatus(Long value) {
        this.status = value;
    }

    /**
     * ��ȡstatusname���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusname() {
        return statusname;
    }

    /**
     * ����statusname���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusname(String value) {
        this.statusname = value;
    }

    /**
     * ��ȡsum���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSum() {
        return sum;
    }

    /**
     * ����sum���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSum(Double value) {
        this.sum = value;
    }

    /**
     * ��ȡtasknums���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTasknums() {
        return tasknums;
    }

    /**
     * ����tasknums���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTasknums(Integer value) {
        this.tasknums = value;
    }

    /**
     * ��ȡtype���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * ����type���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * ��ȡvoltage���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getVoltage() {
        return voltage;
    }

    /**
     * ����voltage���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setVoltage(Double value) {
        this.voltage = value;
    }

    /**
     * ��ȡweight���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getWeight() {
        return weight;
    }

    /**
     * ����weight���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setWeight(Double value) {
        this.weight = value;
    }

}
