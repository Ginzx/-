package com.slsd.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.slsd.entity.Admin;
import com.slsd.service.AdminService;

@Controller
@RequestMapping("/flower")
public class LoginController {
	
	@Resource
	private AdminService adminService;
	
	@RequestMapping(value = "/loginin", method = RequestMethod.GET)
	public String loginin(HttpServletRequest request, Model model) {
	
		return "login";
	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(HttpServletRequest request, Model model) {
		String name=request.getParameter("name");
		String pwd=request.getParameter("pwd");
		Admin admin=new Admin();
		admin.setName(name);
		admin.setPwd(pwd);
		int num = this.adminService.login(admin);
		System.out.println(num);
		return "index";
		
	}
}
