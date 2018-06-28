package com.slsd.controller;

import java.io.IOException;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.slsd.entity.Admin;
import com.slsd.entity.AdminOrder;
import com.slsd.entity.Flower;
import com.slsd.entity.User;
import com.slsd.service.AdminService;
import com.slsd.service.FlowerService;
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

	@Resource
	private FlowerService flowerService;

	/**
	 * @Title: loginin @Description: 跳转到登录 @param: @return @return: String @throws
	 */
	@RequestMapping(value = "/loginin", method = RequestMethod.GET)
	public String loginin() {
		return "login";
	}

	@RequestMapping(value = "/forgetin", method = RequestMethod.GET)
	public String forgetin() {
		return "forget";
	}

	/**
	 * @Title: index @Description: 跳转到主页面 @param: @return @return: String @throws
	 */
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index() {
		return "index";
	}

	/**
	 * @Title: login @Description: 登录功能实现 @param: @param request @param: @param
	 *         model @param: @return @param: @throws IOException @return:
	 *         String @throws
	 */
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(HttpServletRequest request, Model model) throws IOException {
		String name = request.getParameter("name");
		String pwd = request.getParameter("pwd");

		Admin admin = new Admin();
		User user = new User();

		user.setUsername(name);
		user.setUserpwd(pwd);

		admin.setName(name);
		admin.setPwd(pwd);

		HttpSession session = request.getSession(true);
		// 验证是否是管理员账号
		int num = adminService.login(admin);
		// 验证是否是用户账号
		boolean flag = userService.login(user);
		if (num == 1) {
			// 查询所有订单信息
			List<AdminOrder> adminorders = adminService.findorder();
			// 查询所有用户信息
			List<User> users1 = userService.getAll();
			// 查询所有商品信息
			List<Flower> flowers = flowerService.findAll();

			session.setAttribute("orders", adminorders);
			session.setAttribute("flowers", flowers);
			session.setAttribute("users", users1);
			// 如果是管理员账号则进入管理员界面
			return "admin";
		} else if (flag) {
			// 如果是用户账号，先从数据库中便利出相关的用户信息
			User users = userService.getByname(user);
			// 将用户信息传递到接下来的页面
			session.setAttribute("user", users);
			return "index";
		} else {
			// 如果既不是管理员账号也不是用户账号则弹出提示框，同时返回登录界面.
			model.addAttribute("msg", "<script>alert('用户名或密码错误')</script>");
			return "login";
		}
	}

	@RequestMapping(value = "/forget", method = RequestMethod.POST)
	public String forget(HttpServletRequest request, Model model) throws IOException {

		String name = request.getParameter("name");
		String pwd = request.getParameter("pwd1");
		String pwd2 = request.getParameter("pwd2");
		String phone = request.getParameter("phone");

		User usertest = new User();
		usertest.setUsername(name);
		// 根据姓名从数据库中查找相应用户
		User user = userService.getByname(usertest);
		if (user.getPhone().equals(phone) && name != null) {
			if (pwd.equals(pwd2) && pwd != null && pwd2 != null) {
				user.setUserpwd(pwd);
				boolean flag = userService.editUser(user);
				model.addAttribute("msg", "<script>alert('修改密码成功')</script>");
				return "login";
			} else {
				model.addAttribute("msg", "<script>alert('两次输入的密码不同')</script>");
				return "forget";
			}
		} else {
			model.addAttribute("msg", "<script>alert('用户名与电话号码不匹配，请重新输入')</script>");
			return "forget";
		}
	}

}
