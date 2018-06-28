package com.slsd.service;

import java.util.List;

import com.slsd.entity.Order;
import com.slsd.entity.OrderOrderlist;

/**
 * 
* @ClassName: OrderService
* @Description:TODO(订单方法)
* @author: 陈先总
* @date: 2018年6月24日 下午4:32:43
*
* @Copyright: 2018 www.ncetc.chinasofti.com Inc. All rights reserved.
 */
public interface OrderService {
	
	public boolean addOrder(Order order);
	
	public boolean delOrder(int orderID); 
	
	public boolean editOrder(Order order);
	
	public List<Order> findAll();
	
	public List<Order> findByUsername(String username);
	
	public Order findByOrderid(int orderid);
	
	public List<OrderOrderlist> findOrderlistByUsername(String name);
}
