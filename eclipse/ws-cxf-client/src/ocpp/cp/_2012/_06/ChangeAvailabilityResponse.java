
package ocpp.cp._2012._06;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Defines the ChangeAvailability.conf PDU
 * 
 * <p>ChangeAvailabilityResponse complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ChangeAvailabilityResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="status" type="{urn://Ocpp/Cp/2012/06/}AvailabilityStatus"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChangeAvailabilityResponse", propOrder = {
    "status"
})
public class ChangeAvailabilityResponse {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected AvailabilityStatus status;

    /**
     * 获取status属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AvailabilityStatus }
     *     
     */
    public AvailabilityStatus getStatus() {
        return status;
    }

    /**
     * 设置status属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AvailabilityStatus }
     *     
     */
    public void setStatus(AvailabilityStatus value) {
        this.status = value;
    }

}
