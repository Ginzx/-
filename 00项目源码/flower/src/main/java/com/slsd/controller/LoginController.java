package com.slsd.controller;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.slsd.entity.Admin;
import com.slsd.service.AdminService;

@Controller
public class LoginController {
	
	@Resource
	private AdminService adminService;
	
	@RequestMapping(value = "/loginin", method = RequestMethod.GET)
	public String loginin() {
		return "login";
	}
	
	@RequestMapping(value="/login",method = RequestMethod.POST)
	public String login() {
		return "index";
		
	}
}
