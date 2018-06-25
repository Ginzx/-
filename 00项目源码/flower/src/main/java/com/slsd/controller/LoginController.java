package com.slsd.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.slsd.entity.Admin;
import com.slsd.entity.User;
import com.slsd.service.AdminService;
import com.slsd.service.UserService;

@Controller
public class LoginController {

	@Resource
	private AdminService adminService;
	
	@Resource
	private UserService userService;

	@RequestMapping(value = "/loginin", method = RequestMethod.GET)
	public String loginin() {
		return "login";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(HttpServletRequest request,Model model) {
		String name = request.getParameter("name");
		String pwd = request.getParameter("pwd");
        Admin admin = new Admin();
		User user=new User();
		user.setName(name);
		user.setUserpwd(pwd);
		admin.setName(name);
		admin.setPwd(pwd);
		int num = adminService.login(admin);
		boolean flag = userService.login(user);
		if (num == 1) {
			return "index";
		} else {
			return "error";
		}

	}
}
