package com.slsd.dao;

import java.util.List;

import com.slsd.entity.Order;

/**
 * 
* @ClassName: OrderDao
* @Description:TODO(订单)
* @author:陈先总
* @date: 2018年6月24日 下午3:57:21
*
* @Copyright: 2018 www.ncetc.chinasofti.com Inc. All rights reserved.
 */
public interface OrderDao {

	/**
	 * 
	* @Title: addOrder
	* @Description: TODO(添加订单)
	* @param: @param order
	* @param: @return
	* @return: boolean
	* @throws
	 */
	public boolean addOrder(Order order);
	
	/**
	 * 
	* @Title: delOrder
	* @Description: TODO(删除订单)
	* @param: @param orderID
	* @param: @return
	* @return: boolean
	* @throws
	 */
	public boolean delOrder(int orderID); 
	
	/**
	 * 
	* @Title: editOrder
	* @Description: TODO(修改订单,价钱)
	* @param: @param order
	* @param: @return
	* @return: boolean
	* @throws
	 */
	public boolean editOrder(Order order);
	
	/**
	 * 
	* @Title: findAll
	* @Description: TODO(获得所有订单)
	* @param: @return
	* @return: List<Order>
	* @throws
	 */
	public List<Order> findAll();
	
	/**
	 * 
	* @Title: findByUsername
	* @Description: TODO(获得某人所有的订单)
	* @param: @param username
	* @param: @return
	* @return: List<Order>
	* @throws
	 */
	public List<Order> findByUsername(String username);
	
	/**
	 * 
	* @Title: findByOrderid
	* @Description: TODO(根据订单id查找)
	* @param: @param orderid
	* @param: @return
	* @return: Order
	* @throws
	 */
	public Order findByOrderid(int orderid);
}

