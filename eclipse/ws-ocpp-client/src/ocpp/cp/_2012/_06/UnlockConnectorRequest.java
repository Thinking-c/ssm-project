
package ocpp.cp._2012._06;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Defines the UnlockConnector.req PDU
 * 
 * <p>UnlockConnectorRequest complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="UnlockConnectorRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="connectorId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnlockConnectorRequest", propOrder = {
    "connectorId"
})
public class UnlockConnectorRequest {

    protected int connectorId;

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

}
