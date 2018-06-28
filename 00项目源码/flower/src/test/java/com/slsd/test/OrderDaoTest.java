package com.slsd.test;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.slsd.entity.Order;
import com.slsd.entity.OrderOrderlist;
import com.slsd.service.OrderService;

@RunWith(SpringJUnit4ClassRunner.class) // 表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = { "classpath:spring/root-context.xml" })
public class OrderDaoTest {

	@Resource
	private OrderService orderService = null;
	
	@Test
	public void testAddOrder() {
		Date d = new Date();
		Order o = new Order("yc",1,d,4,150.00);
		boolean flag = orderService.addOrder(o);
		System.out.println(flag);
	}

	@Test
	public void testDelOrder() {
		boolean flag = orderService.delOrder(4);
		System.out.println(flag);
	}

	@Test
	public void testEditOrder() {
		Date d = new Date();
		Order o = new Order("yc2",5,d,3,666.00);
		boolean flag = orderService.editOrder(o);
		System.out.println(flag);
	}

	@Test
	public void testFindAll() {
		List<Order> olist = orderService.findAll();
		for (Order u : olist) {
			System.out.println(u);
		}
	}

	@Test
	public void testFindByUsername() {
		List<Order> olist = orderService.findByUsername("wqm01");
		for (Order o : olist) {
			System.out.println(o);
		}
	}

	@Test
	public void testFindByOrderid() {
		Order o = orderService.findByOrderid(3);
			System.out.println(o);
	}

	@Test
	public void testFindByUsername2() {
		List<OrderOrderlist> olist = orderService.findOrderlistByUsername("wqm01");
		for (OrderOrderlist o : olist) {
			System.out.println(o);
		}
	}
}
