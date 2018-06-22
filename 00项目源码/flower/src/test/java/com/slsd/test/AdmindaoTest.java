package com.slsd.test;

import static org.junit.Assert.*;

import javax.annotation.Resource;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.slsd.dao.Admindao;
import com.slsd.entity.Admin;
import com.slsd.service.AdminService;

public class AdmindaoTest {

	@Resource
	private AdminService adminService = null;
	
	@Test
	public void test01() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:spring/root-context.xml");
		Admindao adao = (Admindao) ctx.getBean("Admindao");
		System.out.println(adao.getClass());

	}
	
	@Test
	public void testLogin() {
		Admin  a = new Admin("admin","admin");
		int count = adminService.login(a);
		System.out.println(count);
	}

}
