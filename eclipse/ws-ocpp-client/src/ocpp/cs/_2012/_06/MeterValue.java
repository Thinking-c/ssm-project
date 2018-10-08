
package ocpp.cs._2012._06;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>MeterValue complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="MeterValue"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="timestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" form="qualified"/&gt;
 *         &lt;element name="value" maxOccurs="unbounded" form="qualified"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                 &lt;attribute name="context" type="{urn://Ocpp/Cs/2012/06/}ReadingContext" /&gt;
 *                 &lt;attribute name="format" type="{urn://Ocpp/Cs/2012/06/}ValueFormat" /&gt;
 *                 &lt;attribute name="measurand" type="{urn://Ocpp/Cs/2012/06/}Measurand" /&gt;
 *                 &lt;attribute name="location" type="{urn://Ocpp/Cs/2012/06/}Location" /&gt;
 *                 &lt;attribute name="unit" type="{urn://Ocpp/Cs/2012/06/}UnitOfMeasure" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeterValue", propOrder = {
    "timestamp",
    "value"
})
public class MeterValue {

    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timestamp;
    @XmlElement(required = true)
    protected List<MeterValue.Value> value;

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
     * Gets the value of the value property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the value property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MeterValue.Value }
     * 
     * 
     */
    public List<MeterValue.Value> getValue() {
        if (value == null) {
            value = new ArrayList<MeterValue.Value>();
        }
        return this.value;
    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *       &lt;attribute name="context" type="{urn://Ocpp/Cs/2012/06/}ReadingContext" /&gt;
     *       &lt;attribute name="format" type="{urn://Ocpp/Cs/2012/06/}ValueFormat" /&gt;
     *       &lt;attribute name="measurand" type="{urn://Ocpp/Cs/2012/06/}Measurand" /&gt;
     *       &lt;attribute name="location" type="{urn://Ocpp/Cs/2012/06/}Location" /&gt;
     *       &lt;attribute name="unit" type="{urn://Ocpp/Cs/2012/06/}UnitOfMeasure" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/simpleContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class Value {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "context")
        protected ReadingContext context;
        @XmlAttribute(name = "format")
        protected ValueFormat format;
        @XmlAttribute(name = "measurand")
        protected Measurand measurand;
        @XmlAttribute(name = "location")
        protected Location location;
        @XmlAttribute(name = "unit")
        protected UnitOfMeasure unit;

        /**
         * 获取value属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * 设置value属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * 获取context属性的值。
         * 
         * @return
         *     possible object is
         *     {@link ReadingContext }
         *     
         */
        public ReadingContext getContext() {
            return context;
        }

        /**
         * 设置context属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link ReadingContext }
         *     
         */
        public void setContext(ReadingContext value) {
            this.context = value;
        }

        /**
         * 获取format属性的值。
         * 
         * @return
         *     possible object is
         *     {@link ValueFormat }
         *     
         */
        public ValueFormat getFormat() {
            return format;
        }

        /**
         * 设置format属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link ValueFormat }
         *     
         */
        public void setFormat(ValueFormat value) {
            this.format = value;
        }

        /**
         * 获取measurand属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Measurand }
         *     
         */
        public Measurand getMeasurand() {
            return measurand;
        }

        /**
         * 设置measurand属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Measurand }
         *     
         */
        public void setMeasurand(Measurand value) {
            this.measurand = value;
        }

        /**
         * 获取location属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Location }
         *     
         */
        public Location getLocation() {
            return location;
        }

        /**
         * 设置location属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Location }
         *     
         */
        public void setLocation(Location value) {
            this.location = value;
        }

        /**
         * 获取unit属性的值。
         * 
         * @return
         *     possible object is
         *     {@link UnitOfMeasure }
         *     
         */
        public UnitOfMeasure getUnit() {
            return unit;
        }

        /**
         * 设置unit属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link UnitOfMeasure }
         *     
         */
        public void setUnit(UnitOfMeasure value) {
            this.unit = value;
        }

    }

}
