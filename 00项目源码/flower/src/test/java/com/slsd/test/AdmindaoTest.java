package com.slsd.test;

import static org.junit.Assert.*;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.slsd.dao.Admindao;
import com.slsd.entity.Admin;
import com.slsd.service.AdminService;

@RunWith(SpringJUnit4ClassRunner.class) // 表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = { "classpath:spring/root-context.xml" })
public class AdmindaoTest {

	@Resource
	private AdminService AdminService = null;
	
	@Test
	public void test01() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:spring/root-context.xml");
		Admindao adao = (Admindao) ctx.getBean("Admindao");
		System.out.println(adao.getClass());

	}
	
	@Test
	public void testLogin() {
		Admin  a = new Admin("admin","admin");
		int count = AdminService.login(a);
		System.out.println(count);
	}

}
