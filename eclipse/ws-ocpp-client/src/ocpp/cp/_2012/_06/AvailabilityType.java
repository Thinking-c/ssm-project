
package ocpp.cp._2012._06;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>AvailabilityType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="AvailabilityType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Inoperative"/&gt;
 *     &lt;enumeration value="Operative"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AvailabilityType")
@XmlEnum
public enum AvailabilityType {

    @XmlEnumValue("Inoperative")
    INOPERATIVE("Inoperative"),
    @XmlEnumValue("Operative")
    OPERATIVE("Operative");
    private final String value;

    AvailabilityType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AvailabilityType fromValue(String v) {
        for (AvailabilityType c: AvailabilityType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
