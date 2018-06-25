package com.slsd.service.impl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
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
@Service("userService")
public class UserServiceImpl implements UserService {

	@Autowired
	@Qualifier("userDao")
	private UserDao userDao;
	
	public boolean login(User user) {
		return userDao.login(user)!=0?true:false;
	}

	public boolean addUser(User user) {
		return userDao.addUser(user);
	}

	public boolean editUser(User user) {
		return userDao.editUser(user);
	}

	public boolean editUserPhoto(User user) {
		return userDao.editUserPhoto(user);
	}

	public boolean delUser(User user) {
		return userDao.delUser(user);
	}

	public List<User> getAll() {
		return userDao.getAll();
	}

	public User getByname() {
		return userDao.getByname();
	}

}
