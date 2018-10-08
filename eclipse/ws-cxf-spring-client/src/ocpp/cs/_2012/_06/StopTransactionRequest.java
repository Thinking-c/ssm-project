
package ocpp.cs._2012._06;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>StopTransactionRequest complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="StopTransactionRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="transactionId" type="{http://www.w3.org/2001/XMLSchema}int" form="qualified"/&gt;
 *         &lt;element name="idTag" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/&gt;
 *         &lt;element name="timestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" form="qualified"/&gt;
 *         &lt;element name="meterStop" type="{http://www.w3.org/2001/XMLSchema}int" form="qualified"/&gt;
 *         &lt;element name="transactionData" type="{urn://Ocpp/Cs/2012/06/}TransactionData" maxOccurs="unbounded" form="qualified"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StopTransactionRequest", propOrder = {
    "transactionId",
    "idTag",
    "timestamp",
    "meterStop",
    "transactionData"
})
public class StopTransactionRequest {

    protected int transactionId;
    @XmlElement(required = true)
    protected String idTag;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timestamp;
    protected int meterStop;
    @XmlElement(required = true)
    protected List<TransactionData> transactionData;

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
     * 获取meterStop属性的值。
     * 
     */
    public int getMeterStop() {
        return meterStop;
    }

    /**
     * 设置meterStop属性的值。
     * 
     */
    public void setMeterStop(int value) {
        this.meterStop = value;
    }

    /**
     * Gets the value of the transactionData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transactionData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransactionData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransactionData }
     * 
     * 
     */
    public List<TransactionData> getTransactionData() {
        if (transactionData == null) {
            transactionData = new ArrayList<TransactionData>();
        }
        return this.transactionData;
    }

}
