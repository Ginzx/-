package com.slsd.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.slsd.service.FlowerService;

@Controller
public class FlowerController {

	@Resource
	private FlowerService flowerService;
	
	@RequestMapping(value = "/allshop", method = RequestMethod.GET)
	public String all(HttpServletRequest request, Model model) {
		return "allshop";
	}
}
