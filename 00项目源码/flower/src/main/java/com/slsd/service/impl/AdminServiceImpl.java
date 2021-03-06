package com.slsd.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import com.slsd.dao.Admindao;
import com.slsd.entity.Admin;
import com.slsd.entity.AdminOrder;
import com.slsd.service.AdminService;

/**
* @ClassName: AdminServiceImpl
* @Description:TODO(管理员功能实现)
* @author: 王启明
* @date: 2018年6月21日 下午2:53:06
*
*/
@Service("AdminService")
public class AdminServiceImpl implements AdminService {

	@Autowired
	@Qualifier("admindao")
	private Admindao admindao;

	public int login(Admin admin) {
		return admindao.login(admin);
	}

	public List<AdminOrder> findorder() {
		return admindao.findorder();
	}

}
