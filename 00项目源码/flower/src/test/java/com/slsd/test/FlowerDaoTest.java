package com.slsd.test;


import static org.junit.Assert.*;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.slsd.entity.Flower;
import com.slsd.service.FlowerService;

@RunWith(SpringJUnit4ClassRunner.class) // 表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = { "classpath:spring/root-context.xml" })
public class FlowerDaoTest {

	@Resource
	private FlowerService flowerService = null;
	
	@Test
	public void testFindAll() {
		List<Flower> ulist = flowerService.findAll();
		for (Flower u : ulist) {
			System.out.println(u);
		}
	}

	@Test
	public void testFindbyid() {
		Flower f = flowerService.findbyid(1);
		System.out.println(f);
	}

	@Test
	public void testAddFlower() {
		Flower f = new Flower(5,"植物花卉05",17.00,"普通商品",2,null);
		boolean flag = flowerService.addFlower(f);
		System.out.println(flag);
	}

	@Test
	public void testEditFlower() {
		Flower f = new Flower();
		f.setID(5);
		f.setPrice(66.66);
		boolean flag = flowerService.editFlower(f);
		System.out.println(flag);
	}

	@Test
	public void testDelFlower() {
		boolean flag = flowerService.delFlower(5);
		System.out.println(flag);
	}

}
