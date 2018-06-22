package com.slsd.dao;

import java.util.List;


import com.slsd.entity.Orderlist;

/**
* @ClassName: OrderlistDao
* @Description:TODO(这里用一句话描述这个类的作用)
* @author: cz
* @date: 2018年6月22日 下午4:32:59
*
* @Copyright: 2018 www.ncetc.chinasofti.com Inc. All rights reserved.
*/

public interface OrderlistDao {
	   /**
	* @Title: addOrderlist
	* @Description: TODO(添加订单清单)
	* @param: @param orderlist
	* @param: @return
	* @author: cz
	* @return: int
	* @throws
	*/
	public int addOrderlist(Orderlist orderlist);

	/**
	* @Title: delOrderlist
	* @Description: TODO(删除订单清单)
	* @param: @param listid
	* @author: cz
	* @param: @return
	* @return: int
	* @throws
	*/
	    public int delOrderlist(int listid);
	/**
	* @Title: findAlloderlist
	* @Description: TODO(查找所有订单清单)
	* @author: cz
	* @param: @return
	* @return: List<Orderlist>
	* @throws
	*/
	    public List<Orderlist> findAllorderlist();

	/**
	* @Title: findByListid
	* @Description: TODO(根据ID查找订单清单)
	* @author: cz
	* @param: @return
	* @return: Orderlist
	* @throws
	*/
	     public Orderlist findByListid(int listid);
}
