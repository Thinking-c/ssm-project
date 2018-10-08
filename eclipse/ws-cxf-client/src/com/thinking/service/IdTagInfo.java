
package com.thinking.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>IdTagInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="IdTagInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="status" type="{http://service.thinking.com/}AuthorizationStatus" minOccurs="0"/&gt;
 *         &lt;element name="expiryDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="parentIdTag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IdTagInfo", propOrder = {
    "status",
    "expiryDate",
    "parentIdTag"
})
public class IdTagInfo {

    @XmlSchemaType(name = "string")
    protected AuthorizationStatus status;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expiryDate;
    protected String parentIdTag;

    /**
     * 获取status属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AuthorizationStatus }
     *     
     */
    public AuthorizationStatus getStatus() {
        return status;
    }

    /**
     * 设置status属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AuthorizationStatus }
     *     
     */
    public void setStatus(AuthorizationStatus value) {
        this.status = value;
    }

    /**
     * 获取expiryDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpiryDate() {
        return expiryDate;
    }

    /**
     * 设置expiryDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpiryDate(XMLGregorianCalendar value) {
        this.expiryDate = value;
    }

    /**
     * 获取parentIdTag属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentIdTag() {
        return parentIdTag;
    }

    /**
     * 设置parentIdTag属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentIdTag(String value) {
        this.parentIdTag = value;
    }

}
