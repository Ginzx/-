package com.slsd.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;

import com.slsd.service.FlowerService;
import com.slsd.service.OrderService;
import com.slsd.service.OrderlistService;
import com.slsd.service.UserService;

@Controller
public class AdminController {

	@Resource
	private OrderService orderService;
	
	@Resource
	private OrderlistService orderlistService;
	
	@Resource
	private FlowerService flowerService;
	
	@Resource 
	private UserService userService;
	
	
	
	
	
}
