package com.slsd.controller;

import java.io.File;
import java.util.List;
import java.util.UUID;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.commons.io.FilenameUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import com.slsd.entity.AdminOrder;
import com.slsd.entity.Flower;
import com.slsd.entity.User;
import com.slsd.service.AdminService;
import com.slsd.service.FlowerService;
import com.slsd.service.UserService;

@Controller
public class AdminController {

	@Resource
	private FlowerService flowerService;

	@Resource
	private UserService userService;

	@Resource
	private AdminService adminService;

	@RequestMapping(value = "/editflower", method = RequestMethod.POST)
	public String edit(HttpServletRequest request) {

		HttpSession session = request.getSession(true);

		// 获取商品编号
		int id = Integer.parseInt(request.getParameter("flowerid"));
		// 从数据库里调用相应的商品信息
		Flower flower = flowerService.findbyid(id);
		String name = request.getParameter("fname");
		double price = Double.valueOf(request.getParameter("price")).doubleValue();
		String type = request.getParameter("type");
		flower.setName(name);
		flower.setPrice(price);
		flower.setType(type);
		boolean flag = flowerService.editFlower(flower);

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
	}

	@RequestMapping(value = "/addflower", method = RequestMethod.POST)
	public String addFlower(HttpServletRequest request, MultipartFile pictureFile) throws Exception {
		request.setCharacterEncoding("UTF-8");
		HttpSession session = request.getSession(true);
		Flower fl = new Flower();

		String name1 = UUID.randomUUID().toString().replaceAll("-", "");
		// 获取文件的扩展名
		String ext = FilenameUtils.getExtension(pictureFile.getOriginalFilename());
		// 设置图片上传路径
		String url = request.getSession().getServletContext().getRealPath("/img");
		// 以绝对路径保存重名命后的图片
		pictureFile.transferTo(new File(url + "/" + name1 + "." + ext));
		// 把图片存储路径保存到数据库

		String name = request.getParameter("fname1");
		double price = Double.valueOf(request.getParameter("price1")).doubleValue();
		String type = request.getParameter("type1");

		fl.setName(name);
		fl.setPicture("img/" + name1 + "." + ext);
		fl.setPrice(price);
		fl.setType(type);

		boolean flag = flowerService.addFlower(fl);

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
	}
	
	@RequestMapping(value = "/delflower", method = RequestMethod.POST)
	public String del(HttpServletRequest request) {
		
		return "admin";
	}
	
}
