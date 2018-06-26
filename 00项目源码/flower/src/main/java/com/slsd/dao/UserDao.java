package com.slsd.dao;

import java.util.List;

import com.slsd.entity.User;

/**
* @ClassName: UserDao
* @Description:TODO(用户接口)
* @author: 邹博
* @date: 2018年6月21日 下午3:58:05
*
* @Copyright: 2018 www.ncetc.chinasofti.com Inc. All rights reserved.
*/
public interface UserDao {

	/**
	 * 
	* @Title: login
	* @Description: TODO(用户登录方法)
	* @param: @param user
	* @param: @return
	* @return: boolean
	* @throws
	 */
	public int login(User user);
	
	/**
	 * 
	* @Title: addUser
	* @Description: TODO(用户注册)
	* @param: @param user
	* @param: @return
	* @return: boolean
	* @throws
	 */
	public boolean addUser(User user);
	
	/**
	 * 
	* @Title: editUser
	* @Description: TODO(修改用户信息:忘记密码)
	* @param: @param user
	* @param: @return
	* @return: boolean
	* @throws
	 */
	public boolean editUser(User user);
	
	/**
	 * 
	* @Title: editUserPhoto
	* @Description: TODO(修改用户头像)
	* @param: @param user
	* @param: @return
	* @return: boolean
	* @throws
	 */
	public boolean editUserPhoto(User user);
	
	/**
	 * 
	* @Title: delUser
	* @Description: TODO(删除用户)
	* @param: @param user
	* @param: @return
	* @return: boolean
	* @throws
	 */
	public boolean delUser(User user);
	
	/**
	 * 
	* @Title: getAll
	* @Description: TODO(查找所有用户信息)
	* @param: @return
	* @return: List<User>
	* @throws
	 */
	public List<User> getAll();
	
	/**
	* @Title: getByname
	* @Description: 根据姓名查找用户
	* @param: @return
	* @return: User
	* @throws
	*/
	public User getByname(User user);
}
