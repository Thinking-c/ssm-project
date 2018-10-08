package com.thinking.demo3;

import javax.annotation.Resource;

/**
 * @Author:caoj
 * @Date:2018/08/20
 * @version:v1.0
 * @Description:
 */
public class ProductService {

	@Resource(name = "productDao")
	private ProductDao productDao;
	@Resource(name = "orderDao")
	private OrderDao orderDao;

	/*public void setProductDao(ProductDao productDao) {
		this.productDao = productDao;
	}*/

	/*public void setOrderDao(OrderDao orderDao) {
		this.orderDao = orderDao;
	}*/

	public void save() {
		productDao.save();
		orderDao.save();
		System.out.println("ProductService的save方法执行了...");
	}

}
