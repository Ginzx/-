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

/**
* @ClassName: RegisterController
* @Description:注册相关功能
* @author: 王启明
* @date: 2018年6月26日 下午2:10:51
*
*/
@Controller
public class RegisterController {

	@Resource
	private UserService userService;

	/**
	* @Title: loginin
	* @Description: 跳转到出的页面
	* @param: @return
	* @return: String
	* @throws
	*/
	@RequestMapping(value = "/registerin", method = RequestMethod.GET)
	public String loginin() {
		return "register";
	}

	/**
	* @Title: addUser
	* @Description: 用户注册功能的实现
	* @param: @param request
	* @param: @param user
	* @param: @param pictureFile
	* @param: @return
	* @param: @throws Exception
	* @return: String
	* @throws
	*/
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String addUser(HttpServletRequest request, User user, MultipartFile pictureFile) throws Exception {

		// 每个用户赋予初始头像
		user.setPhoto("upload/touxiang/head.jpg");

		String username = request.getParameter("username");
		String pwd = request.getParameter("pwd");
		String pwd1 = request.getParameter("pwd1");
		String phone = request.getParameter("phone");

		user.setPhone(phone);
		user.setUsername(username);
		user.setUserpwd(pwd);
        
		//注册用户信息
		boolean flag = userService.addUser(user);
		if (flag) {
			return "login";
		} else {
			return "error";
		}
	}

}
