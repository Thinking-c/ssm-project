
package ocpp.cs._2012._06;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>StatusNotificationRequest complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="StatusNotificationRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="connectorId" type="{http://www.w3.org/2001/XMLSchema}int" form="qualified"/&gt;
 *         &lt;element name="status" type="{urn://Ocpp/Cs/2012/06/}ChargePointStatus" form="qualified"/&gt;
 *         &lt;element name="errorCode" type="{urn://Ocpp/Cs/2012/06/}ChargePointErrorCode" form="qualified"/&gt;
 *         &lt;element name="info" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/&gt;
 *         &lt;element name="timestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" form="qualified"/&gt;
 *         &lt;element name="vendorId" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/&gt;
 *         &lt;element name="vendorErrorCode" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusNotificationRequest", propOrder = {
    "connectorId",
    "status",
    "errorCode",
    "info",
    "timestamp",
    "vendorId",
    "vendorErrorCode"
})
public class StatusNotificationRequest {

    protected int connectorId;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ChargePointStatus status;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ChargePointErrorCode errorCode;
    @XmlElement(required = true)
    protected String info;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timestamp;
    @XmlElement(required = true)
    protected String vendorId;
    @XmlElement(required = true)
    protected String vendorErrorCode;

    /**
     * 获取connectorId属性的值。
     * 
     */
    public int getConnectorId() {
        return connectorId;
    }

    /**
     * 设置connectorId属性的值。
     * 
     */
    public void setConnectorId(int value) {
        this.connectorId = value;
    }

    /**
     * 获取status属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ChargePointStatus }
     *     
     */
    public ChargePointStatus getStatus() {
        return status;
    }

    /**
     * 设置status属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ChargePointStatus }
     *     
     */
    public void setStatus(ChargePointStatus value) {
        this.status = value;
    }

    /**
     * 获取errorCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ChargePointErrorCode }
     *     
     */
    public ChargePointErrorCode getErrorCode() {
        return errorCode;
    }

    /**
     * 设置errorCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ChargePointErrorCode }
     *     
     */
    public void setErrorCode(ChargePointErrorCode value) {
        this.errorCode = value;
    }

    /**
     * 获取info属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInfo() {
        return info;
    }

    /**
     * 设置info属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInfo(String value) {
        this.info = value;
    }

    /**
     * 获取timestamp属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimestamp() {
        return timestamp;
    }

    /**
     * 设置timestamp属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimestamp(XMLGregorianCalendar value) {
        this.timestamp = value;
    }

    /**
     * 获取vendorId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendorId() {
        return vendorId;
    }

    /**
     * 设置vendorId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendorId(String value) {
        this.vendorId = value;
    }

    /**
     * 获取vendorErrorCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendorErrorCode() {
        return vendorErrorCode;
    }

    /**
     * 设置vendorErrorCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendorErrorCode(String value) {
        this.vendorErrorCode = value;
    }

}
