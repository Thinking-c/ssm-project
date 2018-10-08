
package ocpp.cp._2012._06;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>UpdateType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="UpdateType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Differential"/&gt;
 *     &lt;enumeration value="Full"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "UpdateType")
@XmlEnum
public enum UpdateType {

    @XmlEnumValue("Differential")
    DIFFERENTIAL("Differential"),
    @XmlEnumValue("Full")
    FULL("Full");
    private final String value;

    UpdateType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UpdateType fromValue(String v) {
        for (UpdateType c: UpdateType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
