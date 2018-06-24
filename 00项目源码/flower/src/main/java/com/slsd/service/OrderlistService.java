package com.slsd.service;

import java.util.List;

import com.slsd.dao.OrderlistDao;
import com.slsd.entity.Orderlist;

/**
 * 
* @ClassName: OrderlistService
* @Description:TODO(这里用一句话描述这个类的作用)
* @author: Administrator
* @date: 2018年6月24日 下午3:09:37
*
* @Copyright: 2018 www.ncetc.chinasofti.com Inc. All rights reserved.
 */
public interface OrderlistService {

	public boolean addOrderlist(Orderlist orderlist);
	
	public boolean delOrderlistBylid(int lid);
	
	public boolean delOrderlistBylistID(int listID);
	
	public List<Orderlist> findAllOrderlist(); 
	
	public Orderlist findOrderlistByLid(int lid);
	
	public List<Orderlist> findOrderlistByListID(int listID);
	
	public boolean editOrderlist(Orderlist orderlist);
}
