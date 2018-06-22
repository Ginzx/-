package com.slsd.test;

import static org.junit.Assert.*;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.slsd.entity.User;
import com.slsd.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class) // 表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = { "classpath:spring/root-context.xml" })
public class UserDaoTest {

	@Resource
	private UserService userService = null;
	
	@Test
	public void testLogin() {
		fail("Not yet implemented");
	}

	@Test
	public void testAddUser() {
		User teacher = new User("zs", "1212","温州","12346","男","wqm",null,"nb");
		boolean flag = userService.addUser(teacher);
		System.out.println(flag);
	}

	@Test
	public void testEditUser() {
		fail("Not yet implemented");
	}

	@Test
	public void testEditUserPhoto() {
		fail("Not yet implemented");
	}

	@Test
	public void testDelUser() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetAll() {
		fail("Not yet implemented");
	}

}
