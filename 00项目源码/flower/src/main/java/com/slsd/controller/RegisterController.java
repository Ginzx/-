package com.slsd.controller;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.UUID;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.slsd.entity.User;
import com.slsd.service.UserService;

@Controller
public class RegisterController {

	@Resource
	private UserService userService;

	@RequestMapping(value = "/registerin", method = RequestMethod.GET)
	public String loginin() {
		return "register";
	}

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String addUser(HttpServletRequest request, User user, MultipartFile pictureFile) throws Exception {

		// 把初始图片存储路径保存到数据库
		user.setPhoto("upload/touxiang/0.jpg");

		String username = request.getParameter("username");
		String pwd = request.getParameter("pwd");
		String pwd1 = request.getParameter("pwd1");
		String phone = request.getParameter("phone");

		user.setPhone(phone);
		user.setUsername(username);
		user.setUserpwd(pwd);

		boolean flag = userService.addUser(user);
		System.out.println(flag);
		return "register";
	}

}
