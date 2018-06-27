package com.slsd.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.slsd.entity.Comment;
import com.slsd.entity.Flower;
import com.slsd.entity.Order;
import com.slsd.entity.Orderlist;
import com.slsd.entity.OrderlistFlower;
import com.slsd.entity.User;
import com.slsd.service.CommentService;
import com.slsd.service.FlowerService;
import com.slsd.service.OrderService;
import com.slsd.service.OrderlistService;

@Controller
public class FlowerController {

	@Resource
	private FlowerService flowerService;
	
	@Resource
	private OrderService oService;
	
	@Resource
	private OrderlistService orlService;
	
	@Resource
	private CommentService comService;
	
	List<OrderlistFlower> olist = new ArrayList<OrderlistFlower>();
	
	
	@RequestMapping(value = "/cart", method = RequestMethod.GET)
	public String cart(HttpServletRequest request, Model model) {
		
		return "shoppingC";
	}
	

	
	
	@RequestMapping(value = "/allshop", method = RequestMethod.GET)
	public String all(HttpServletRequest request, Model model) {
		List<Flower> flist = flowerService.findAll();
		model.addAttribute("allFlower", flist);
		return "allshop";
	}
	
	@RequestMapping(value = "/shop", method = RequestMethod.GET)
	public String one(@RequestParam("id") String id, Model model) {
		int ID = Integer.parseInt(id);
		Flower f = flowerService.findbyid(ID);
		model.addAttribute("flower", f);
		List<Flower> flist1 = flowerService.findAll();
		model.addAttribute("allFlower1", flist1);
		List<Comment> clist = comService.findbyflower(f.getCommentID());
		model.addAttribute("clist", clist);
		return "shop";
	}
	
	@RequestMapping(value = "/addComment", method = RequestMethod.POST)
	public String  addComment(@RequestParam("cid") String cid,HttpServletRequest request, Model model) {
		int cID = Integer.parseInt(cid);
		
		User users = (User) request.getSession().getAttribute("user");
		
		Comment ct = new Comment();
		String content = request.getParameter("content");
		ct.setComment(content);
		ct.setCommentID(cID);;
		ct.setUser(users.getUsername());
		comService.add(ct);
		 model.addAttribute("ct", "<script>alert('评论发表成功')</script>");  
		return "allshop";
	}
	
	@RequestMapping(value = "/addflower", method = RequestMethod.POST)
	public String  addFlower(Flower f, Map<String, Object> model) {
		boolean flag = flowerService.addFlower(f);
		if(flag) {
			return "index";
		}else {
			return "allshop";
		}
		
	}
	
	@RequestMapping(value = "/addCart", method = RequestMethod.POST)
	public String addCart(HttpServletRequest request, Model model) throws IOException {
		
		int flag=0;
		String name = request.getParameter("flower");
		String type = request.getParameter("type");
		String src = request.getParameter("picture");
		int num = Integer.parseInt(request.getParameter("number"));
		int id = Integer.parseInt(request.getParameter("ID"));
		Double pic = Double.parseDouble(request.getParameter("price"));
		Double money = pic*num;
		
		OrderlistFlower olf = new OrderlistFlower();
		olf.setFlower(name);
		olf.setNumber(num);
		olf.setPrice(money);
		olf.setPrice2(pic);
		olf.setID(id);
		olf.setPicture(src);
		olf.setType(type);
		
		for (OrderlistFlower oF : olist) {
			if(name.equals(oF.getFlower()) ) {
				 flag = 1;
				 model.addAttribute("err2", "<script>alert('购物车中已有此商品')</script>");  
			}
		}
		
		if(flag==0) {
			olist.add(olf);
			model.addAttribute("suc", "<script>alert('添加成功')</script>");  
		}
		
		HttpSession session = request.getSession(true);
		session.setAttribute("ollist",olist);
		
		List<Flower> flist = flowerService.findAll();
		model.addAttribute("allFlower", flist);
		
		return "allshop";
	}
	
	@RequestMapping(value = "/del", method = RequestMethod.GET)
	public String del(@RequestParam("id") String id, Model model) {
		int ID = Integer.parseInt(id);
		for(int i =0;i<olist.size();i++) {
			if(olist.get(i).getID()==ID) {
				olist.remove(i);
			}
		}
		return "shoppingC";
	}
	
	@RequestMapping(value = "/addOrder", method = RequestMethod.POST)
	public String  addOrder(HttpServletRequest request, Model model) {
		String[] a = request.getParameterValues("checkall");
		
		List<Order> orlist= oService.findAll();
		
		int lidinc = orlist.get(orlist.size()-1).getListID()+1;
		
		User users = (User) request.getSession().getAttribute("user");
		
		Double sum = 0.0;
		
		Date d = new Date();
		Order o = new Order();
		o.setListID(lidinc++);
		o.setTime(d);
		o.setUsername(users.getUsername());
		
		
		for(int i = 1;i<=10;i++) {
			for (int j=0;j<a.length;j++) {
				int s1 = Integer.parseInt(a[j]);
				
				if(i==s1) {
					int num = Integer.parseInt(request.getParameter("number_'"+s1+"'"));
					Flower f = flowerService.findbyid(i);
					Orderlist ol = new Orderlist();
					ol.setFlower(f.getName());
					ol.setListID(o.getListID());
					ol.setNumber(num);
					ol.setPrice(num*f.getPrice());
					orlService.addOrderlist(ol);
					sum+=ol.getPrice();
					for(int n =0;n<olist.size();n++) {
						if(olist.get(n).getID()==i) {
							olist.remove(n);
						}
					}
				}
			}
		}
		
		o.setPrice(sum);
		oService.addOrder(o);
		
		return "index";
	}
}
