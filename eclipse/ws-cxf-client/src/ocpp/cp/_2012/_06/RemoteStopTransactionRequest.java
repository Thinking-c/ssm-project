
package ocpp.cp._2012._06;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Defines the RemoteStopTransaction.req PDU
 * 
 * <p>RemoteStopTransactionRequest complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="RemoteStopTransactionRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="transactionId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RemoteStopTransactionRequest", propOrder = {
    "transactionId"
})
public class RemoteStopTransactionRequest {

    protected int transactionId;

    /**
     * 获取transactionId属性的值。
     * 
     */
    public int getTransactionId() {
        return transactionId;
    }

    /**
     * 设置transactionId属性的值。
     * 
     */
    public void setTransactionId(int value) {
        this.transactionId = value;
    }

}
