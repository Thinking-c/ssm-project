
package com.thinking.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>AuthorizeResponse complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡauthorizeResponse���Ե�ֵ��
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
     * ����authorizeResponse���Ե�ֵ��
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
