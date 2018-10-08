
package ocpp.cp._2012._06;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

/**
 * Defines the RemoteStartTransaction.conf PDU
 * 
 * <p>
 * RemoteStartTransactionResponse complex type�� Java �ࡣ
 * 
 * <p>
 * ����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="RemoteStartTransactionResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="status" type="{urn://Ocpp/Cp/2012/06/}RemoteStartStopStatus"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RemoteStartTransactionResponse", propOrder = { "status" })
public class RemoteStartTransactionResponse {

	@XmlElement(required = true)
	@XmlSchemaType(name = "string")
	protected RemoteStartStopStatus status;

	/**
	 * ��ȡstatus���Ե�ֵ��
	 * 
	 * @return possible object is {@link RemoteStartStopStatus }
	 * 
	 */
	public RemoteStartStopStatus getStatus() {
		return status;
	}

	/**
	 * ����status���Ե�ֵ��
	 * 
	 * @param value allowed object is {@link RemoteStartStopStatus }
	 * 
	 */
	public void setStatus(RemoteStartStopStatus value) {
		this.status = value;
	}

	@Override
	public String toString() {
		return "RemoteStartTransactionResponse [status=" + status + "]";
	}

}
