package com.slsd.controller;

import java.io.IOException;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.slsd.entity.Admin;
import com.slsd.entity.User;
import com.slsd.service.AdminService;
import com.slsd.service.UserService;

/**
* @ClassName: LoginController
* @Description:登录界面相关功能
* @author: 王启明
* @date: 2018年6月26日 下午2:12:17
*
*/
@Controller
public class LoginController {

	@Resource
	private AdminService adminService;
	
	@Resource
	private UserService userService;

	/**
	* @Title: loginin
	* @Description: 跳转到登录
	* @param: @return
	* @return: String
	* @throws
	*/
	@RequestMapping(value = "/loginin", method = RequestMethod.GET)
	public String loginin() {
		return "login";
	}
	
	/**
	* @Title: index
	* @Description: 跳转到主页面
	* @param: @return
	* @return: String
	* @throws
	*/
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index() {
		return "index";
	}

	/**
	* @Title: login
	* @Description: 登录功能实现
	* @param: @param request
	* @param: @param model
	* @param: @return
	* @param: @throws IOException
	* @return: String
	* @throws
	*/
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(HttpServletRequest request,Model model) throws IOException {
		String name = request.getParameter("name");
		String pwd = request.getParameter("pwd");
		
        Admin admin = new Admin();
		User user=new User();
		
		user.setUsername(name);
		user.setUserpwd(pwd);
		
		admin.setName(name);
		admin.setPwd(pwd);
		
		HttpSession session = request.getSession(true);
		//验证是否是管理员账号
		int num = adminService.login(admin);
		//验证是否是用户账号
		boolean flag = userService.login(user);
		if (num == 1) {
			//如果是管理员账号则进入管理员界面
			return "index";
		} else if(flag) {
			//如果是用户账号，先从数据库中便利出相关的用户信息
			User users=userService.getByname(user);
			//将用户信息传递到接下来的页面
			session.setAttribute("user", users);
			System.out.println(users);
		   return "information";
		}else {
			//如果既不是管理员账号也不是用户账号则弹出提示框，同时返回登录界面.
			model.addAttribute("msg", "<script>alert('用户名或密码错误')</script>");  
			return "login";
		}
	}
}
