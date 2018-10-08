
package ocpp.cs._2012._06;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>StartTransactionRequest complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="StartTransactionRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="connectorId" type="{http://www.w3.org/2001/XMLSchema}int" form="qualified"/&gt;
 *         &lt;element name="idTag" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/&gt;
 *         &lt;element name="timestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" form="qualified"/&gt;
 *         &lt;element name="meterStart" type="{http://www.w3.org/2001/XMLSchema}int" form="qualified"/&gt;
 *         &lt;element name="reservationId" type="{http://www.w3.org/2001/XMLSchema}int" form="qualified"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StartTransactionRequest", propOrder = {
    "connectorId",
    "idTag",
    "timestamp",
    "meterStart",
    "reservationId"
})
public class StartTransactionRequest {

    protected int connectorId;
    @XmlElement(required = true)
    protected String idTag;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timestamp;
    protected int meterStart;
    protected int reservationId;

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
     * 获取idTag属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdTag() {
        return idTag;
    }

    /**
     * 设置idTag属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdTag(String value) {
        this.idTag = value;
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
     * 获取meterStart属性的值。
     * 
     */
    public int getMeterStart() {
        return meterStart;
    }

    /**
     * 设置meterStart属性的值。
     * 
     */
    public void setMeterStart(int value) {
        this.meterStart = value;
    }

    /**
     * 获取reservationId属性的值。
     * 
     */
    public int getReservationId() {
        return reservationId;
    }

    /**
     * 设置reservationId属性的值。
     * 
     */
    public void setReservationId(int value) {
        this.reservationId = value;
    }

}
