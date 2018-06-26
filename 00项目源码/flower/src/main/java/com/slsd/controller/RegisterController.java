package com.slsd.controller;

import java.io.File;  
import java.util.List;  
import java.util.UUID;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;  
import org.springframework.stereotype.Controller;  
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.multipart.MultipartFile;  
import com.slsd.entity.User;
import com.slsd.service.UserService;

@Controller
public class RegisterController {

	@Resource
	private UserService userService;

	@RequestMapping(value = "/register")
	public String addUser(HttpServletRequest request, User user, MultipartFile pictureFile) throws Exception {

        //把初始图片存储路径保存到数据库  
        user.setPhoto("upload/touxiang/0.jpg");
        
        String username=request.getParameter("username");
        String pwd=request.getParameter("pwd");
        String pwd1=request.getParameter("pwd1");
        String address=request.getParameter("address");
        
		return null;
	}
}
