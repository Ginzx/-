package com.slsd.service;

import java.util.List;

import com.slsd.entity.Order;

/**
 * 
* @ClassName: OrderService
* @Description:TODO(这里用一句话描述这个类的作用)
* @author: Administrator
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
}
