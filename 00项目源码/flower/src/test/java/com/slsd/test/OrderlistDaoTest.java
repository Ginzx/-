package com.slsd.test;

import static org.junit.Assert.*;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.slsd.entity.Orderlist;
import com.slsd.service.OrderlistService;


@RunWith(SpringJUnit4ClassRunner.class) // 表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = { "classpath:spring/root-context.xml" })
public class OrderlistDaoTest {

	@Resource
	private OrderlistService orderlistService = null;
	
	@Test
	public void testAddOrderlist() {
		Orderlist o = new Orderlist(5,2,3,"植物花卉01",30.00);
		boolean flag = orderlistService.addOrderlist(o);
		System.out.println(flag);
	}

	@Test
	public void testDelOrderlistBylid() {
		boolean flag = orderlistService.delOrderlistBylid(6);
		System.out.println(flag);
	}

	@Test
	public void testDelOrderlistBylistID() {
		boolean flag = orderlistService.delOrderlistBylistID(3);
		System.out.println(flag);
	}

	@Test
	public void testFindAllOrderlist() {
		List<Orderlist> olist = orderlistService.findAllOrderlist();
		for (Orderlist u : olist) {
			System.out.println(u);
		}
	}

	@Test
	public void testFindOrderlistByLid() {
		Orderlist o=orderlistService.findOrderlistByLid(2);
		System.out.println(o);
	}

	@Test
	public void testFindOrderlistByListID() {
		List<Orderlist> olist = orderlistService.findOrderlistByListID(1);
		for (Orderlist u : olist) {
			System.out.println(u);
		}
	}
	
	@Test
	public void testEditOrderlist() {
		Orderlist o = new Orderlist(2,4,3,"植物花卉01",30.00);
		boolean flag = orderlistService.editOrderlist(o);
		System.out.println(flag);
	}

}
