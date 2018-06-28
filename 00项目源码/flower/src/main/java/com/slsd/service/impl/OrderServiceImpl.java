package com.slsd.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.slsd.dao.OrderDao;
import com.slsd.entity.Order;
import com.slsd.entity.OrderOrderlist;
import com.slsd.service.OrderService;

/**
* @ClassName: OrderServiceImpl
* @Description:TODO(订单功能实现)
* @author: 陈先总
* @date: 2018年6月24日 上午9:09:13
*
* @Copyright: 2018 www.ncetc.chinasofti.com Inc. All rights reserved.
*/
@Service("orderService")
public class OrderServiceImpl implements OrderService {

	@Autowired
	@Qualifier("orderDao")
	private OrderDao orderDao;
	
	public boolean addOrder(Order order) {
		// TODO Auto-generated method stub
		return orderDao.addOrder(order);
	}

	public boolean delOrder(int orderID) {
		// TODO Auto-generated method stub
		return orderDao.delOrder(orderID);
	}

	public boolean editOrder(Order order) {
		// TODO Auto-generated method stub
		return orderDao.editOrder(order);
	}

	public List<Order> findAll() {
		// TODO Auto-generated method stub
		return orderDao.findAll();
	}

	public List<Order> findByUsername(String username) {
		// TODO Auto-generated method stub
		return orderDao.findByUsername(username);
	}

	public Order findByOrderid(int orderid) {
		// TODO Auto-generated method stub
		return orderDao.findByOrderid(orderid);
	}

	public List<OrderOrderlist> findOrderlistByUsername(String name) {
		// TODO Auto-generated method stub
		return orderDao.findOrderlistByUsername(name);
	}

}
