
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
 * <p>MeterValue complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡtimestamp���Ե�ֵ��
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
     * ����timestamp���Ե�ֵ��
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
     * <p>anonymous complex type�� Java �ࡣ
     * 
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
         * ��ȡvalue���Ե�ֵ��
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
         * ����value���Ե�ֵ��
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
         * ��ȡcontext���Ե�ֵ��
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
         * ����context���Ե�ֵ��
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
         * ��ȡformat���Ե�ֵ��
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
         * ����format���Ե�ֵ��
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
         * ��ȡmeasurand���Ե�ֵ��
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
         * ����measurand���Ե�ֵ��
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
         * ��ȡlocation���Ե�ֵ��
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
         * ����location���Ե�ֵ��
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
         * ��ȡunit���Ե�ֵ��
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
         * ����unit���Ե�ֵ��
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
