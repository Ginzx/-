package com.slsd.dao;

import com.slsd.entity.Admin;

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
	
}
