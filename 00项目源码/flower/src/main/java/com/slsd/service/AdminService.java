package com.slsd.service;

import java.util.List;

import com.slsd.entity.Admin;
import com.slsd.entity.AdminOrder;

/**
* @ClassName: AdminService
* @Description:TODO(注册方法注入)
* @author: 王启明
* @date: 2018年6月21日 下午2:52:42
*
*/
public interface AdminService {

	public int login(Admin admin);
	
	public List<AdminOrder> findorder();
}
