package com.slsd.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.slsd.service.UserService;

/**
* @ClassName: UserManagerController
* @Description:个人信息管理相关功能
* @author: Administrator
* @date: 2018年6月26日 下午2:25:33
*
*/
@Controller
public class UserManagerController {

	@Resource
	private UserService userService;
	
	@RequestMapping(value="userin")
	public String userin() {
		return "information";
		
	}
	
	
}
