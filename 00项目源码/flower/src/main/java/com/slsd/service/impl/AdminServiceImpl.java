package com.slsd.service.impl;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.slsd.dao.Admindao;
import com.slsd.entity.Admin;
import com.slsd.service.AdminService;

/**
* @ClassName: AdminServiceImpl
* @Description:TODO(管理员功能实现)
* @author: Administrator
* @date: 2018年6月21日 下午2:53:06
*
*/
@Service("AdminService")
public class AdminServiceImpl implements AdminService {

	@Autowired
	private Admindao Admindao;

	public int login(Admin admin) {
		return Admindao.login(admin);
	}

}
