
package ocpp.cp._2012._06;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Defines the RemoteStartTransaction.req PDU
 * 
 * <p>RemoteStartTransactionRequest complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="RemoteStartTransactionRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="idTag" type="{urn://Ocpp/Cp/2012/06/}IdToken"/&gt;
 *         &lt;element name="connectorId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RemoteStartTransactionRequest", propOrder = {
    "idTag",
    "connectorId"
})
public class RemoteStartTransactionRequest {

    @XmlElement(required = true)
    protected String idTag;
    protected Integer connectorId;

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
     * 获取connectorId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getConnectorId() {
        return connectorId;
    }

    /**
     * 设置connectorId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setConnectorId(Integer value) {
        this.connectorId = value;
    }

}
