package com.slsd.service;

import java.util.List;

import com.slsd.entity.User;

/**
 * @ClassName: UserService
 * @Description:TODO(用户)  @author: 邹博
 * @date: 2018年6月22日 上午10:23:58
 *
 * @Copyright: 2018 www.ncetc.chinasofti.com Inc. All rights reserved.
 */
public interface UserService {

	public boolean login(User user);

	public boolean addUser(User user);

	public boolean editUser(User user);

	public boolean editUserPhoto(User user);

	public boolean delUser(User user);

	public List<User> getAll();

	public User getByname(User user);

}
