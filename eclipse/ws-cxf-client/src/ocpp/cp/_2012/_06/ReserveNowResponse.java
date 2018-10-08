
package ocpp.cp._2012._06;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Defines the ReserveNow.conf PDU
 * 
 * <p>ReserveNowResponse complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ReserveNowResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="status" type="{urn://Ocpp/Cp/2012/06/}ReservationStatus"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReserveNowResponse", propOrder = {
    "status"
})
public class ReserveNowResponse {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ReservationStatus status;

    /**
     * 获取status属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ReservationStatus }
     *     
     */
    public ReservationStatus getStatus() {
        return status;
    }

    /**
     * 设置status属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ReservationStatus }
     *     
     */
    public void setStatus(ReservationStatus value) {
        this.status = value;
    }

}
