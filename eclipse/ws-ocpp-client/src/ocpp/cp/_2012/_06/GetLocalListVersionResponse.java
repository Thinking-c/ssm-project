
package ocpp.cp._2012._06;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Defines the GetLocalListVersion.conf PDU
 * 
 * <p>GetLocalListVersionResponse complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="GetLocalListVersionResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="listVersion" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetLocalListVersionResponse", propOrder = {
    "listVersion"
})
public class GetLocalListVersionResponse {

    protected int listVersion;

    /**
     * ��ȡlistVersion���Ե�ֵ��
     * 
     */
    public int getListVersion() {
        return listVersion;
    }

    /**
     * ����listVersion���Ե�ֵ��
     * 
     */
    public void setListVersion(int value) {
        this.listVersion = value;
    }

}
