package com.slsd.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.slsd.dao.OrderDao;
import com.slsd.entity.Order;

@Repository
public class OrderDaoImpl extends SqlSessionDaoSupport implements OrderDao {

	@Autowired
	@Qualifier("sqlSessionFactory")
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		super.setSqlSessionFactory(sqlSessionFactory);
	}
	
	public boolean addOrder(Order order) {
		SqlSession sqlSession = this.getSqlSession();
		int row = sqlSession.insert("addOrder", order);
		return row!=0 ? true:false;
	}

	public boolean delOrder(int orderID) {
		SqlSession sqlSession = this.getSqlSession();
		int row = sqlSession.delete("delOrder", orderID);
		return row!=0 ? true:false;
	}

	public boolean editOrder(Order order) {
		SqlSession sqlSession = this.getSqlSession();
		int row  = sqlSession.selectOne("editOrder",order);
		return row!=0 ? true:false;
	}

	public List<Order> findAll() {
		SqlSession sqlSession = this.getSqlSession();
		List<Order> olist = sqlSession.selectList("findAll");
		return olist;
	}

	public List<Order> findByUsername(String username) {
		SqlSession sqlSession = this.getSqlSession();
		List<Order> olist = sqlSession.selectList("findByUsername",username);
		return olist;
	}

	public Order findByOrderid(int orderid) {
		SqlSession sqlSession = this.getSqlSession();
		Order o = sqlSession.selectOne("findByOrderid",orderid);
		return o;
	}

}
