/**
* All rights Reserved, Designed By www.ncetc.chinasofti.com
* @Title: OrderServiceImpl.java
* @Package com.slsd.service.impl
* @Description: TODO(用一句话描述该文件做什么)
* @author: hasee
* @date: 2018年6月22日 下午4:06:08
* @version V1.0
* @Copyright: 2018 www.ncetc.chinasofti.com Inc. All rights reserved.
*/

package com.slsd.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.slsd.dao.OrderDao;
import com.slsd.entity.Order;
import com.slsd.service.OrderService;

/**
 * @ClassName: OrderServiceImpl
 * @Description:TODO(这里用一句话描述这个类的作用)
 * @author: hasee
 * @date: 2018年6月22日 下午4:06:08
 *
 * @Copyright: 2018 www.ncetc.chinasofti.com Inc. All rights reserved.
 */
@Service("OrderService")
public class OrderServiceImpl implements OrderService {
	
	@Autowired
	@Qualifier("orderDao")
	private OrderDao OrderDao;

	public boolean addOrder(Order order) {
		return (OrderDao.addOrder(order) > 0) ? true : false;
	}

	public boolean delOrder(int orderid) {
		return (OrderDao.delOrder(orderid) > 0) ? true : false;
	}

	public List<Order> findAllorder() {
		return OrderDao.findAllorder();
	}

	public Order findByOrderid(int orderid) {
		return OrderDao.findByOrderid(orderid);
	}

}
