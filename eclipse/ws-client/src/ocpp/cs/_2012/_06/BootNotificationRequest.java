
package ocpp.cs._2012._06;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>BootNotificationRequest complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="BootNotificationRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="chargePointVendor" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/&gt;
 *         &lt;element name="chargePointModel" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/&gt;
 *         &lt;element name="chargePointSerialNumber" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/&gt;
 *         &lt;element name="chargeBoxSerialNumber" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/&gt;
 *         &lt;element name="firmwareVersion" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/&gt;
 *         &lt;element name="iccid" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/&gt;
 *         &lt;element name="imsi" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/&gt;
 *         &lt;element name="meterType" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/&gt;
 *         &lt;element name="meterSerialNumber" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BootNotificationRequest", propOrder = {
    "chargePointVendor",
    "chargePointModel",
    "chargePointSerialNumber",
    "chargeBoxSerialNumber",
    "firmwareVersion",
    "iccid",
    "imsi",
    "meterType",
    "meterSerialNumber"
})
public class BootNotificationRequest {

    @XmlElement(required = true)
    protected String chargePointVendor;
    @XmlElement(required = true)
    protected String chargePointModel;
    @XmlElement(required = true)
    protected String chargePointSerialNumber;
    @XmlElement(required = true)
    protected String chargeBoxSerialNumber;
    @XmlElement(required = true)
    protected String firmwareVersion;
    @XmlElement(required = true)
    protected String iccid;
    @XmlElement(required = true)
    protected String imsi;
    @XmlElement(required = true)
    protected String meterType;
    @XmlElement(required = true)
    protected String meterSerialNumber;

    /**
     * 获取chargePointVendor属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChargePointVendor() {
        return chargePointVendor;
    }

    /**
     * 设置chargePointVendor属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChargePointVendor(String value) {
        this.chargePointVendor = value;
    }

    /**
     * 获取chargePointModel属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChargePointModel() {
        return chargePointModel;
    }

    /**
     * 设置chargePointModel属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChargePointModel(String value) {
        this.chargePointModel = value;
    }

    /**
     * 获取chargePointSerialNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChargePointSerialNumber() {
        return chargePointSerialNumber;
    }

    /**
     * 设置chargePointSerialNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChargePointSerialNumber(String value) {
        this.chargePointSerialNumber = value;
    }

    /**
     * 获取chargeBoxSerialNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChargeBoxSerialNumber() {
        return chargeBoxSerialNumber;
    }

    /**
     * 设置chargeBoxSerialNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChargeBoxSerialNumber(String value) {
        this.chargeBoxSerialNumber = value;
    }

    /**
     * 获取firmwareVersion属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirmwareVersion() {
        return firmwareVersion;
    }

    /**
     * 设置firmwareVersion属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirmwareVersion(String value) {
        this.firmwareVersion = value;
    }

    /**
     * 获取iccid属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIccid() {
        return iccid;
    }

    /**
     * 设置iccid属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIccid(String value) {
        this.iccid = value;
    }

    /**
     * 获取imsi属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImsi() {
        return imsi;
    }

    /**
     * 设置imsi属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImsi(String value) {
        this.imsi = value;
    }

    /**
     * 获取meterType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeterType() {
        return meterType;
    }

    /**
     * 设置meterType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeterType(String value) {
        this.meterType = value;
    }

    /**
     * 获取meterSerialNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeterSerialNumber() {
        return meterSerialNumber;
    }

    /**
     * 设置meterSerialNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeterSerialNumber(String value) {
        this.meterSerialNumber = value;
    }

}
