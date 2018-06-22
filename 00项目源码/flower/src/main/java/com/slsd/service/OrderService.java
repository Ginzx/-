package com.slsd.service;

import java.util.List;

import com.slsd.entity.Order;

/**
 * @ClassName: OrderService
 * @Description:TODO(订单)
 * @author: cz
 * @date: 2018年6月22日 下午4:02:41
 *
 */

public interface OrderService {

	public boolean addOrder(Order order);

	public boolean delOrder(int orderid);

	public List<Order> findAllorder();

	public Order findByOrderid(int orderid);
}
