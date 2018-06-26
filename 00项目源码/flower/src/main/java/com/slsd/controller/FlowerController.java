package com.slsd.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.swing.plaf.synth.SynthSpinnerUI;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.slsd.entity.Flower;
import com.slsd.entity.Orderlist;
import com.slsd.service.FlowerService;

@Controller
public class FlowerController {

	@Resource
	private FlowerService flowerService;
	
	List<Orderlist> olist = new ArrayList<Orderlist>();
	
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
		
		String name = request.getParameter("flower");
		System.out.println(name);
		int num = Integer.parseInt(request.getParameter("number"));
		System.out.println(num);
		Double pic = Double.parseDouble(request.getParameter("price"))*num;
		System.out.println(pic);
		
		Orderlist ol = new Orderlist();
		ol.setFlower(name);
		ol.setNumber(num);
		ol.setPrice(pic);
		
		
		olist.add(ol);
		
		HttpSession session = request.getSession(true);
		session.setAttribute("ollist",olist);
		
		return "allshop";
	}
}
