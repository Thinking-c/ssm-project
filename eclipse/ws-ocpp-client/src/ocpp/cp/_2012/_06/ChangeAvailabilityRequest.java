
package ocpp.cp._2012._06;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Defines the ChangeAvailability.req PDU
 * 
 * <p>ChangeAvailabilityRequest complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ChangeAvailabilityRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="connectorId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="type" type="{urn://Ocpp/Cp/2012/06/}AvailabilityType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChangeAvailabilityRequest", propOrder = {
    "connectorId",
    "type"
})
public class ChangeAvailabilityRequest {

    protected int connectorId;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected AvailabilityType type;

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
     * 获取type属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AvailabilityType }
     *     
     */
    public AvailabilityType getType() {
        return type;
    }

    /**
     * 设置type属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AvailabilityType }
     *     
     */
    public void setType(AvailabilityType value) {
        this.type = value;
    }

}
