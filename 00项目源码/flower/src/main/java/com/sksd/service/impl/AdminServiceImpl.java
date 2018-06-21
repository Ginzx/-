package com.sksd.service.impl;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.slsd.dao.Admindao;
import com.slsd.entity.Admin;
import com.slsd.service.AdminService;

@Service("AdminService")
public class AdminServiceImpl implements AdminService {

	@Resource
	private Admindao Admindao;

	public int login(Admin admin) {
		return Admindao.login(admin);
	}

}
