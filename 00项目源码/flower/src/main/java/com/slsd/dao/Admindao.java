package com.slsd.dao;

import java.util.List;

import com.slsd.entity.Admin;
import com.slsd.entity.AdminOrder;

/**
* @ClassName: Admindao
* @Description:TODO(管理员登录)
* @author: 王启明
* @date: 2018年6月21日 下午2:20:58
*
*/
public interface Admindao {

	/**
	* @Title: login
	* @Description:登录
	* @param: @param admin
	* @param: @return
	* @return: int
	* @throws
	*/
	public int login(Admin admin);
	
	/**
	* @Title: findorder
	* @Description: 管理员查询所有订单
	* @param: @return
	* @return:  List<AdminOrder>
	* @throws
	*/
	public  List<AdminOrder> findorder();
	
}
