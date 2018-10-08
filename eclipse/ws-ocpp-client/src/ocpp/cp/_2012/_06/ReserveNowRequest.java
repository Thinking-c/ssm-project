
package ocpp.cp._2012._06;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Defines the ReserveNow.req PDU
 * 
 * <p>ReserveNowRequest complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ReserveNowRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="connectorId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="expiryDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="idTag" type="{urn://Ocpp/Cp/2012/06/}IdToken"/&gt;
 *         &lt;element name="parentIdTag" type="{urn://Ocpp/Cp/2012/06/}IdToken" minOccurs="0"/&gt;
 *         &lt;element name="reservationId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReserveNowRequest", propOrder = {
    "connectorId",
    "expiryDate",
    "idTag",
    "parentIdTag",
    "reservationId"
})
public class ReserveNowRequest {

    protected int connectorId;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expiryDate;
    @XmlElement(required = true)
    protected String idTag;
    protected String parentIdTag;
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
     * 获取expiryDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpiryDate() {
        return expiryDate;
    }

    /**
     * 设置expiryDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpiryDate(XMLGregorianCalendar value) {
        this.expiryDate = value;
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
     * 获取parentIdTag属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentIdTag() {
        return parentIdTag;
    }

    /**
     * 设置parentIdTag属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentIdTag(String value) {
        this.parentIdTag = value;
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
