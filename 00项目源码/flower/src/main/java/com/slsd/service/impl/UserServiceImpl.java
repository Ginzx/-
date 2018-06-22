/**
* All rights Reserved, Designed By www.ncetc.chinasofti.com
* @Title: UserServiceImpl.java
* @Package com.slsd.service.impl
* @Description: TODO(用一句话描述该文件做什么)
* @author: Administrator
* @date: 2018年6月22日 上午10:26:11
* @version V1.0
* @Copyright: 2018 www.ncetc.chinasofti.com Inc. All rights reserved.
*/
package com.slsd.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.slsd.dao.UserDao;
import com.slsd.entity.User;
import com.slsd.service.UserService;

/**
* @ClassName: UserServiceImpl
* @Description:TODO(用户功能实现)
* @author: 邹博
* @date: 2018年6月22日 上午10:26:11
*
* @Copyright: 2018 www.ncetc.chinasofti.com Inc. All rights reserved.
*/
@Service("UserService")
public class UserServiceImpl implements UserService {

	@Resource
	private UserDao userDao;
	
	/**
	* <p>Title: login</p>
	* <p>Description: </p>
	* @param user
	* @return
	* @see com.slsd.service.UserService#login(com.slsd.entity.User)
	*/
	public boolean login(User user) {
		// TODO Auto-generated method stub
		return userDao.login(user);
	}

	/**
	* <p>Title: addUser</p>
	* <p>Description: </p>
	* @param user
	* @return
	* @see com.slsd.service.UserService#addUser(com.slsd.entity.User)
	*/
	public boolean addUser(User user) {
		// TODO Auto-generated method stub
		return userDao.addUser(user);
	}

	/**
	* <p>Title: editUser</p>
	* <p>Description: </p>
	* @param user
	* @return
	* @see com.slsd.service.UserService#editUser(com.slsd.entity.User)
	*/
	public boolean editUser(User user) {
		// TODO Auto-generated method stub
		return userDao.editUser(user);
	}

	/**
	* <p>Title: editUserPhoto</p>
	* <p>Description: </p>
	* @param user
	* @return
	* @see com.slsd.service.UserService#editUserPhoto(com.slsd.entity.User)
	*/
	public boolean editUserPhoto(User user) {
		// TODO Auto-generated method stub
		return userDao.editUserPhoto(user);
	}

	/**
	* <p>Title: delUser</p>
	* <p>Description: </p>
	* @param user
	* @return
	* @see com.slsd.service.UserService#delUser(com.slsd.entity.User)
	*/
	public boolean delUser(User user) {
		// TODO Auto-generated method stub
		return userDao.delUser(user);
	}

	/**
	* <p>Title: getAll</p>
	* <p>Description: </p>
	* @return
	* @see com.slsd.service.UserService#getAll()
	*/
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return userDao.getAll();
	}

}
