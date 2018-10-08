
package com.thinking.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * order complex type�� Java �ࡣ
 * 
 * <p>
 * ����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="order"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="price" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "order", propOrder = { "id", "name", "price" })
public class Order {

	protected int id;
	protected String name;
	protected double price;

	/**
	 * ��ȡid���Ե�ֵ��
	 * 
	 */
	public int getId() {
		return id;
	}

	/**
	 * ����id���Ե�ֵ��
	 * 
	 */
	public void setId(int value) {
		this.id = value;
	}

	/**
	 * ��ȡname���Ե�ֵ��
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getName() {
		return name;
	}

	/**
	 * ����name���Ե�ֵ��
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setName(String value) {
		this.name = value;
	}

	/**
	 * ��ȡprice���Ե�ֵ��
	 * 
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * ����price���Ե�ֵ��
	 * 
	 */
	public void setPrice(double value) {
		this.price = value;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", name=" + name + ", price=" + price + "]";
	}

}
