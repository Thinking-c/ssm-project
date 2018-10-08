
package ocpp.cs._2012._06;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>BootNotificationResponse complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="BootNotificationResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="status" type="{urn://Ocpp/Cs/2012/06/}RegistrationStatus" form="qualified"/&gt;
 *         &lt;element name="currentTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" form="qualified"/&gt;
 *         &lt;element name="heartbeatInterval" type="{http://www.w3.org/2001/XMLSchema}int" form="qualified"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BootNotificationResponse", propOrder = {
    "status",
    "currentTime",
    "heartbeatInterval"
})
public class BootNotificationResponse {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected RegistrationStatus status;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar currentTime;
    protected int heartbeatInterval;

    /**
     * 获取status属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RegistrationStatus }
     *     
     */
    public RegistrationStatus getStatus() {
        return status;
    }

    /**
     * 设置status属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RegistrationStatus }
     *     
     */
    public void setStatus(RegistrationStatus value) {
        this.status = value;
    }

    /**
     * 获取currentTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCurrentTime() {
        return currentTime;
    }

    /**
     * 设置currentTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCurrentTime(XMLGregorianCalendar value) {
        this.currentTime = value;
    }

    /**
     * 获取heartbeatInterval属性的值。
     * 
     */
    public int getHeartbeatInterval() {
        return heartbeatInterval;
    }

    /**
     * 设置heartbeatInterval属性的值。
     * 
     */
    public void setHeartbeatInterval(int value) {
        this.heartbeatInterval = value;
    }

}
