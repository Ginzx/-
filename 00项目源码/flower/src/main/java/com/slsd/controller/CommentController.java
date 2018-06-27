package com.slsd.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;

import com.slsd.service.CommentService;

@Controller
public class CommentController {

	@Resource
	private CommentService commentService;
	
	
}
