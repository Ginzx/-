package com.slsd.dao;

import java.util.List;

import com.slsd.entity.Orderlist;

/**
 * 
* @ClassName: Orderlist
* @Description:TODO(清单接口)
* @author: 陈先总
* @date: 2018年6月24日 下午2:32:13
*
* @Copyright: 2018 www.ncetc.chinasofti.com Inc. All rights reserved.
 */
public interface OrderlistDao {

	/**
	 * 
	* @Title: addOrderlist
	* @Description: TODO(添加清单)
	* @param: @param orderlist
	* @param: @return
	* @return: boolean
	* @throws
	 */
	public boolean addOrderlist(Orderlist orderlist);
	/**
	 * 
	* @Title: delOrderlistBylid
	* @Description: TODO(根据清单自身编号删除，删除某一清单)
	* @param: @param lid
	* @param: @return
	* @return: boolean
	* @throws
	 */
	public boolean delOrderlistBylid(int lid);
	
	/**
	 * 
	* @Title: delOrderlistBylistID
	* @Description: TODO(根据清单所属订单编号删除，删除某一订单上所有的清单)
	* @param: @param listID
	* @param: @return
	* @return: boolean
	* @throws
	 */
	public boolean delOrderlistBylistID(int listID);
	
	/**
	 * 
	* @Title: findAllOrderlist
	* @Description: TODO(获得所有的清单)
	* @param: @return
	* @return: List<Orderlist>
	* @throws
	 */
	public List<Orderlist> findAllOrderlist(); 
	
	/**
	 * 
	* @Title: findOrderlistByLid
	* @Description: TODO(根据清单编号查找)
	* @param: @param lid
	* @param: @return
	* @return: Orderlist
	* @throws
	 */
	public Orderlist findOrderlistByLid(int lid);
	
	/**
	 * 
	* @Title: findOrderlistByListID
	* @Description: TODO(查找某一订单上的所有清单)
	* @param: @param listID
	* @param: @return
	* @return: List<Orderlist>
	* @throws
	 */
	public List<Orderlist> findOrderlistByListID(int listID);
	
	/**
	 * 
	* @Title: editOrderlist
	* @Description: TODO(修改清单：花的数量，总价钱)
	* @param: @param orderlist
	* @param: @return
	* @return: boolean
	* @throws
	 */
	public boolean editOrderlist(Orderlist orderlist);
}
