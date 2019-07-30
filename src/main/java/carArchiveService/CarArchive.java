
package carArchiveService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>carArchive complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
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
     * 获取annualInspection属性的值。
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
     * 设置annualInspection属性的值。
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
     * 获取buyprice属性的值。
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
     * 设置buyprice属性的值。
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
     * 获取buytime属性的值。
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
     * 设置buytime属性的值。
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
     * 获取carmeter属性的值。
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
     * 设置carmeter属性的值。
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
     * 获取carnumber属性的值。
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
     * 设置carnumber属性的值。
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
     * 获取costpertask属性的值。
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
     * 设置costpertask属性的值。
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
     * 获取descs属性的值。
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
     * 设置descs属性的值。
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
     * 获取displacement属性的值。
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
     * 设置displacement属性的值。
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
     * 获取enginenumber属性的值。
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
     * 设置enginenumber属性的值。
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
     * 获取equips属性的值。
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
     * 设置equips属性的值。
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
     * 获取framenumber属性的值。
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
     * 设置framenumber属性的值。
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
     * 获取fuel属性的值。
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
     * 设置fuel属性的值。
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
     * 获取fueleconomy属性的值。
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
     * 设置fueleconomy属性的值。
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
     * 获取id属性的值。
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
     * 设置id属性的值。
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
     * 获取initmileage属性的值。
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
     * 设置initmileage属性的值。
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
     * 获取insurance属性的值。
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
     * 设置insurance属性的值。
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
     * 获取memo1属性的值。
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
     * 设置memo1属性的值。
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
     * 获取memo2属性的值。
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
     * 设置memo2属性的值。
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
     * 获取memo3属性的值。
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
     * 设置memo3属性的值。
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
     * 获取mileage属性的值。
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
     * 设置mileage属性的值。
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
     * 获取modify属性的值。
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
     * 设置modify属性的值。
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
     * 获取names属性的值。
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
     * 设置names属性的值。
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
     * 获取newCAi属性的值。
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
     * 设置newCAi属性的值。
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
     * 获取newInsurance属性的值。
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
     * 设置newInsurance属性的值。
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
     * 获取oils属性的值。
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
     * 设置oils属性的值。
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
     * 获取owner属性的值。
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
     * 设置owner属性的值。
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
     * 获取ownername属性的值。
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
     * 设置ownername属性的值。
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
     * 获取persons属性的值。
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
     * 设置persons属性的值。
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
     * 获取registertime属性的值。
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
     * 设置registertime属性的值。
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
     * 获取runstatus属性的值。
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
     * 设置runstatus属性的值。
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
     * 获取speed属性的值。
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
     * 设置speed属性的值。
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
     * 获取status属性的值。
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
     * 设置status属性的值。
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
     * 获取statusname属性的值。
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
     * 设置statusname属性的值。
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
     * 获取sum属性的值。
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
     * 设置sum属性的值。
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
     * 获取tasknums属性的值。
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
     * 设置tasknums属性的值。
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
     * 获取type属性的值。
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
     * 设置type属性的值。
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
     * 获取voltage属性的值。
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
     * 设置voltage属性的值。
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
     * 获取weight属性的值。
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
     * 设置weight属性的值。
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
