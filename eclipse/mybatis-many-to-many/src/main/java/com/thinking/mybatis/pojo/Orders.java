package com.thinking.mybatis.pojo;

import java.util.Date;
import java.util.List;

/**
 * @Author:caoj
 * @Date:2018/09/20
 * @version:v1.0
 * @Description:
 */
public class Orders {

	private int id;
	private int userId;
	private String number;
	private Date createTime;
	private String note;
	// 订单明细
	private List<Orderdetail> orderdetails;

	public List<Orderdetail> getOrderdetails() {
		return orderdetails;
	}

	public void setOrderdetails(List<Orderdetail> orderdetails) {
		this.orderdetails = orderdetails;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

}
