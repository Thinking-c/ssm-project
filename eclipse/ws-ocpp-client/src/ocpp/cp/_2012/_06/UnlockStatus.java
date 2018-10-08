
package ocpp.cp._2012._06;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>UnlockStatus的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="UnlockStatus"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Accepted"/&gt;
 *     &lt;enumeration value="Rejected"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "UnlockStatus")
@XmlEnum
public enum UnlockStatus {

    @XmlEnumValue("Accepted")
    ACCEPTED("Accepted"),
    @XmlEnumValue("Rejected")
    REJECTED("Rejected");
    private final String value;

    UnlockStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UnlockStatus fromValue(String v) {
        for (UnlockStatus c: UnlockStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
