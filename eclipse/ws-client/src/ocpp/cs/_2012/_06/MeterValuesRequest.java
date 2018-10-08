
package ocpp.cs._2012._06;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>MeterValuesRequest complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="MeterValuesRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="connectorId" type="{http://www.w3.org/2001/XMLSchema}int" form="qualified"/&gt;
 *         &lt;element name="transactionId" type="{http://www.w3.org/2001/XMLSchema}int" form="qualified"/&gt;
 *         &lt;element name="values" type="{urn://Ocpp/Cs/2012/06/}MeterValue" maxOccurs="unbounded" form="qualified"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeterValuesRequest", propOrder = {
    "connectorId",
    "transactionId",
    "values"
})
public class MeterValuesRequest {

    protected int connectorId;
    protected int transactionId;
    @XmlElement(required = true)
    protected List<MeterValue> values;

    /**
     * ��ȡconnectorId���Ե�ֵ��
     * 
     */
    public int getConnectorId() {
        return connectorId;
    }

    /**
     * ����connectorId���Ե�ֵ��
     * 
     */
    public void setConnectorId(int value) {
        this.connectorId = value;
    }

    /**
     * ��ȡtransactionId���Ե�ֵ��
     * 
     */
    public int getTransactionId() {
        return transactionId;
    }

    /**
     * ����transactionId���Ե�ֵ��
     * 
     */
    public void setTransactionId(int value) {
        this.transactionId = value;
    }

    /**
     * Gets the value of the values property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the values property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValues().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MeterValue }
     * 
     * 
     */
    public List<MeterValue> getValues() {
        if (values == null) {
            values = new ArrayList<MeterValue>();
        }
        return this.values;
    }

}
