
package com.thinking.ws.data_type;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * student complex type�� Java �ࡣ
 * 
 * <p>
 * ����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="student"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="price" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "student", propOrder = { "id", "name", "price" })
public class Student {

	protected int id;
	protected String name;
	protected float price;

	public Student() {
	}

	public Student(int id, String name, float price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

	/**
	 *
	 * 
	 */
	public int getId() {
		return id;
	}

	/**
	 * 
	 * 
	 */
	public void setId(int value) {
		this.id = value;
	}

	/**
	 *
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getName() {
		return name;
	}

	/**
	 * 
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setName(String value) {
		this.name = value;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float value) {
		this.price = value;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", price=" + price + "]";
	}

}
