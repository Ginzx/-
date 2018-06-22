package com.slsd.service;

import java.util.List;

import com.slsd.entity.Order;
import com.slsd.entity.Orderlist;

/**
 * @ClassName: OrderService
 * @Description:TODO(订单)
 * @author: cz
 * @date: 2018年6月22日 下午4:02:41
 *
 */

public interface OrderlistService {

	public boolean addOrderlist(Orderlist orderlist);

	public boolean delOrderlist(int listid);

	public List<Orderlist> findAllorderlist();

	public Orderlist findByListid(int listid);
}
