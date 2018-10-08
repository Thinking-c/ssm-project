
package ocpp.cs._2012._06;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ChargePointStatus�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p>
 * <pre>
 * &lt;simpleType name="ChargePointStatus"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Available"/&gt;
 *     &lt;enumeration value="Occupied"/&gt;
 *     &lt;enumeration value="Faulted"/&gt;
 *     &lt;enumeration value="Unavailable"/&gt;
 *     &lt;enumeration value="Reserved"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ChargePointStatus")
@XmlEnum
public enum ChargePointStatus {

    @XmlEnumValue("Available")
    AVAILABLE("Available"),
    @XmlEnumValue("Occupied")
    OCCUPIED("Occupied"),
    @XmlEnumValue("Faulted")
    FAULTED("Faulted"),
    @XmlEnumValue("Unavailable")
    UNAVAILABLE("Unavailable"),
    @XmlEnumValue("Reserved")
    RESERVED("Reserved");
    private final String value;

    ChargePointStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ChargePointStatus fromValue(String v) {
        for (ChargePointStatus c: ChargePointStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}