package com.slsd.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.slsd.entity.Flower;
import com.slsd.service.FlowerService;

@Controller
public class FlowerController {

	@Resource
	private FlowerService flowerService;
	
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
	
}
