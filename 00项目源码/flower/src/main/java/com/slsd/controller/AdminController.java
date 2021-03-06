package com.slsd.controller;

import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.UUID;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.commons.io.FilenameUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.slsd.entity.AdminOrder;
import com.slsd.entity.Flower;
import com.slsd.entity.User;
import com.slsd.service.AdminService;
import com.slsd.service.FlowerService;
import com.slsd.service.UserService;

/**
 * @ClassName: AdminController
 * @Description:管理员功能的实现
 * @author: 王启明
 * @date: 2018年6月28日 下午3:10:26
 *
 */
@Controller
public class AdminController {

	@Resource
	private FlowerService flowerService;

	@Resource
	private UserService userService;

	@Resource
	private AdminService adminService;

	/**
	 * @Title: edit @Description: 修改商品信息 @param: @param
	 *         request @param: @return @return: String @throws
	 */
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
		return "admin";
	}

	/**
	 * @Title: addFlower @Description: 添加商品信息 @param: @param request @param: @param
	 *         pictureFile @param: @return @param: @throws Exception @return:
	 *         String @throws
	 */
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
		return "admin";
	}

	/**
	 * @Title: del @Description: 删除商品功能 @param: @param request @param: @param
	 *         id @param: @return @param: @throws IOException @return:
	 *         String @throws
	 */
	@RequestMapping(value = "/delflower", method = RequestMethod.GET)
	public String del(HttpServletRequest request, @RequestParam("id") String id) throws IOException {
		request.setCharacterEncoding("UTF-8");
		HttpSession session = request.getSession(true);

		int id1 = Integer.parseInt(id);
		boolean flag = flowerService.delFlower(id1);

		List<AdminOrder> adminorders = adminService.findorder();
		// 查询所有用户信息
		List<User> users1 = userService.getAll();
		// 查询所有商品信息
		List<Flower> flowers = flowerService.findAll();

		session.setAttribute("orders", adminorders);
		session.setAttribute("flowers", flowers);
		session.setAttribute("users", users1);

		return "admin";
	}

}
