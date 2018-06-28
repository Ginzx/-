package com.slsd.controller;

import java.io.File;
import java.util.List;
import java.util.UUID;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.commons.io.FilenameUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import com.slsd.entity.Flower;
import com.slsd.entity.OrderOrderlist;
import com.slsd.entity.User;
import com.slsd.service.FlowerService;
import com.slsd.service.OrderService;
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
	
	@Resource
	private OrderService oService;
	
	@Resource
	private FlowerService fService;

	/**
	 * @Title: userin @Description: 跳转到个人信息界面 @param: @return @return:
	 *         String @throws
	 */
	@RequestMapping(value = "userin", method = RequestMethod.GET)
	public String userin() {
		return "information";
	}

	/**
	 * @Title: addUser @Description: 修改用户信息 @param: @param request @param: @param
	 *         pictureFile @param: @return @param: @throws Exception @return:
	 *         String @throws
	 */
	@RequestMapping(value = "/editUser")
	public String addUser(HttpServletRequest request, MultipartFile pictureFile) throws Exception {
		request.setCharacterEncoding("UTF-8");
		HttpSession session = request.getSession(true);
		User users = (User) request.getSession().getAttribute("user");
		// 获取文件名
		String name1 = UUID.randomUUID().toString().replaceAll("-", "");
		// 获取文件的扩展名
		String ext = FilenameUtils.getExtension(pictureFile.getOriginalFilename());
		// 设置图片上传路径
		String url = request.getSession().getServletContext().getRealPath("/upload/touxiang");
		// 以绝对路径保存重名命后的图片
		pictureFile.transferTo(new File(url + "/" + name1 + "." + ext));
		// 把图片存储路径保存到数据库

		users.setPhoto("upload/touxiang/" + name1 + "." + ext);

		// 从表单中获取其他的值
		String name = request.getParameter("name");
		String phone = request.getParameter("phone");
		String address = request.getParameter("address");
		String introduction = request.getParameter("introduction");
		String sex = request.getParameter("sex");

		// 赋值
		users.setAddress(address);
		users.setIntroduction(introduction);
		users.setPhone(phone);
		users.setName(name);
		users.setSex(sex);

		boolean flag = userService.editUser(users);

		session.setAttribute("user", users);
		// 重定向到查询所有用户的Controller，测试图片显示
		return "information";

	}
	
	@RequestMapping(value = "shopcar", method = RequestMethod.GET)
	public String orderlistin(HttpServletRequest request,Model model) {
		
		User users = (User) request.getSession().getAttribute("user");
		List<OrderOrderlist> oolist = oService.findOrderlistByUsername(users.getUsername());
		List<Flower> flist = fService.findAll();
		for(int j = 0 ;j<oolist.size();j++) {
			for(int i = 0 ; i<flist.size();i++) {
				if(flist.get(i).getName().equals(oolist.get(j).getFlower())) {
					oolist.get(j).setSrc(flist.get(i).getPicture());
				}
			}
		}
		
		model.addAttribute("oolist", oolist);
		return "shopcar";
	}

}
