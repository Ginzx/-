package com.slsd.controller;

import java.io.IOException;
import java.util.ArrayList;
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

import com.slsd.entity.Flower;
import com.slsd.entity.OrderlistFlower;
import com.slsd.service.FlowerService;

@Controller
public class FlowerController {

	@Resource
	private FlowerService flowerService;
	
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
		return "shop";
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
		String a = request.getParameter("checkall");
		System.out.println(a);
		return "index";
	}
}
