
package com.thinking.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>AuthorizeResponse complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="AuthorizeResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AuthorizeResponse" type="{http://service.thinking.com/}IdTagInfo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuthorizeResponse", propOrder = {
    "authorizeResponse"
})
public class AuthorizeResponse {

    @XmlElement(name = "AuthorizeResponse")
    protected IdTagInfo authorizeResponse;

    /**
     * 获取authorizeResponse属性的值。
     * 
     * @return
     *     possible object is
     *     {@link IdTagInfo }
     *     
     */
    public IdTagInfo getAuthorizeResponse() {
        return authorizeResponse;
    }

    /**
     * 设置authorizeResponse属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link IdTagInfo }
     *     
     */
    public void setAuthorizeResponse(IdTagInfo value) {
        this.authorizeResponse = value;
    }

}
