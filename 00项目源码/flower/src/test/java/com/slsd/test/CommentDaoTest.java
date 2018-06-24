package com.slsd.test;

import static org.junit.Assert.*;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.slsd.entity.Comment;
import com.slsd.service.CommentService;


@RunWith(SpringJUnit4ClassRunner.class) // 表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = { "classpath:spring/root-context.xml" })
public class CommentDaoTest {

	@Resource
	private CommentService commentService = null;
	
	@Test
	public void testFindall() {
		List<Comment> ulist = commentService.findall();
		for (Comment u : ulist) {
			System.out.println(u);
		}
	}

	@Test
	public void testFindbyflower() {
		List<Comment> clist= commentService.findbyflower(2);
		for (Comment c : clist) {
			System.out.println(c);
		}
	}

	@Test
	public void testAdd() {
		Comment c = new Comment(6,3,"sixsixsix","wqm");
		boolean flag = commentService.add(c);
		System.out.println(flag);
	}

	@Test
	public void testEdit() {
		Comment c = new Comment();
		c.setComment("hahah");
		c.setCid(6);
		boolean flag = commentService.edit(c);
		System.out.println(flag);
	}

	@Test
	public void testDel() {
		boolean flag = commentService.del(6);
		System.out.println(flag);
	}

}
