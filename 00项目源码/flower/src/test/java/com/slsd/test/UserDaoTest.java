package com.slsd.test;

import java.util.List;

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
		User t = new User("zs", "1212");
		boolean flag = userService.login(t);
		System.out.println(flag);
	}

	@Test
	public void testAddUser() {
		User teacher = new User("zs", "1212","温州","12346","男","wqm",null,"nbnb");
		boolean flag = userService.addUser(teacher);
		System.out.println(flag);
	}

	@Test
	public void testEditUser() {
		User t = new User("zs", "12123");
		boolean flag = userService.editUser(t);
		System.out.println(flag);
	}


	@Test
	public void testDelUser() {
		User u = new User();
		u.setUsername("zs");
		boolean flag = userService.delUser(u);
		System.out.println(flag);
	}

	@Test
	public void testGetAll() {
		List<User> ulist = userService.getAll();
		for (User u : ulist) {
			System.out.println(u);
		}
	}
	

}
