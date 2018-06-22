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

import com.slsd.dao.OrderlistDao;
import com.slsd.entity.Order;
import com.slsd.entity.Orderlist;
import com.slsd.service.OrderlistService;

/**
 * @ClassName: OrderServiceImpl
 * @Description:TODO(这里用一句话描述这个类的作用)
 * @author: hasee
 * @date: 2018年6月22日 下午4:06:08
 *
 * @Copyright: 2018 www.ncetc.chinasofti.com Inc. All rights reserved.
 */
@Service("OrderlistService")
public class OrderlistServiceImpl implements OrderlistService {
	@Autowired
	@Qualifier("orderlistDao")
	private OrderlistDao OrderlistDao;

	public boolean addOrderlist(Orderlist orderlist) {
		return (OrderlistDao.addOrderlist(orderlist) > 0) ? true : false;
	}

	public boolean delOrderlist(int listid) {
		return (OrderlistDao.delOrderlist(listid) > 0) ? true : false;
	}

	public List<Orderlist> findAllorderlist() {
		return OrderlistDao.findAllorderlist();
	}

	public Orderlist findByListid(int listid) {
		return OrderlistDao.findByListid(listid);
	}

}
