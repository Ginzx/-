package com.slsd.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/login")
public class LoginController {

	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public String login(HttpServletRequest request, Model model) {
		String name=request.getParameter("name");
		String pwd=request.getParameter("pwd");
		return null;
		
	}
}
