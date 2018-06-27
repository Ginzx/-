package com.slsd.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.slsd.dao.OrderlistDao;
import com.slsd.entity.Orderlist;
import com.slsd.service.OrderlistService;

/**
* @ClassName: OrderlistServiceImpl
* @Description:TODO(订单清单功能实现)
* @author: 陈先总
* @date: 2018年6月24日 上午9:08:37
*
* @Copyright: 2018 www.ncetc.chinasofti.com Inc. All rights reserved.
*/
@Service("orderlistService")
public class OrderlistServiceImpl implements OrderlistService {

	@Autowired
	@Qualifier("orderlistDao")
	private OrderlistDao orderlistDao;

	
	public boolean addOrderlist(Orderlist orderlist) {
		// TODO Auto-generated method stub
		return orderlistDao.addOrderlist(orderlist);
	}

	public boolean delOrderlistBylid(int lid) {
		// TODO Auto-generated method stub
		return orderlistDao.delOrderlistBylid(lid);
	}

	public boolean delOrderlistBylistID(int listID) {
		// TODO Auto-generated method stub
		return orderlistDao.delOrderlistBylistID(listID);
	}

	public List<Orderlist> findAllOrderlist() {
		// TODO Auto-generated method stub
		return orderlistDao.findAllOrderlist();
	}

	public Orderlist findOrderlistByLid(int lid) {
		// TODO Auto-generated method stub
		return orderlistDao.findOrderlistByLid(lid);
	}

	public List<Orderlist> findOrderlistByListID(int listID) {
		// TODO Auto-generated method stub
		return orderlistDao.findOrderlistByListID(listID);
	}

	public boolean editOrderlist(Orderlist orderlist) {
		// TODO Auto-generated method stub
		return orderlistDao.editOrderlist(orderlist);
	}

}
