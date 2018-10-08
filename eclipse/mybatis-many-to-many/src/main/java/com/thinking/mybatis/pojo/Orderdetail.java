package com.thinking.mybatis.pojo;

/**
 * @Author:caoj
 * @Date:2018/09/20
 * @version:v1.0
 * @Description:
 */
public class Orderdetail {

	private int id;
	private int ordersId;
	private int itemsId;
	private int itemsNum;

	// 明细对应的商品信息
	private Items items;
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getOrdersId() {
		return ordersId;
	}

	public void setOrdersId(int ordersId) {
		this.ordersId = ordersId;
	}

	public int getItemsId() {
		return itemsId;
	}

	public void setItemsId(int itemsId) {
		this.itemsId = itemsId;
	}

	public int getItemsNum() {
		return itemsNum;
	}

	public void setItemsNum(int itemsNum) {
		this.itemsNum = itemsNum;
	}

	public Items getItems() {
		return items;
	}

	public void setItems(Items items) {
		this.items = items;
	}

	@Override
	public String toString() {
		return "Orderdetail [id=" + id + ", ordersId=" + ordersId + ", itemsId=" + itemsId + ", itemsNum=" + itemsNum
				+ "]";
	}

}
