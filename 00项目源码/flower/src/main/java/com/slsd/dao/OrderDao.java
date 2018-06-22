package com.slsd.dao;

import java.util.List;


import com.slsd.entity.Order;

/**
* @ClassName: OrderDao
* @Description:TODO(这里用一句话描述这个类的作用)
* @author: cz
* @date: 2018年6月22日 下午3:33:41
*
* @Copyright: 2018 www.ncetc.chinasofti.com Inc. All rights reserved.
*/

public interface OrderDao {
	
   /**
* @Title: addOrder
* @Description: TODO(添加订单)
* @param: @param order
* @param: @return
* @author: cz
* @return: int
* @throws
*/
public int addOrder(Order order);

/**
* @Title: delOrder
* @Description: TODO(删除订单)
* @param: @param orderid
* @author: cz
* @param: @return
* @return: int
* @throws
*/
    public int delOrder(int orderid);
/**
* @Title: findAlloder
* @Description: TODO(查找所有订单)
* @author: cz
* @param: @return
* @return: List<Order>
* @throws
*/
    public List<Order> findAllorder();

/**
* @Title: findByOrderid
* @Description: TODO(根据ID查找订单)
* @author: cz
* @param: @return
* @return: Order
* @throws
*/
     public Order findByOrderid(int orderid);
}
