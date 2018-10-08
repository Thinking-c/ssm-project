
package ocpp.cp._2012._06;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Defines the CancelReservation.req PDU
 * 
 * <p>CancelReservationRequest complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="CancelReservationRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
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
@XmlType(name = "CancelReservationRequest", propOrder = {
    "reservationId"
})
public class CancelReservationRequest {

    protected int reservationId;

    /**
     * ��ȡreservationId���Ե�ֵ��
     * 
     */
    public int getReservationId() {
        return reservationId;
    }

    /**
     * ����reservationId���Ե�ֵ��
     * 
     */
    public void setReservationId(int value) {
        this.reservationId = value;
    }

}
