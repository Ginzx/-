package com.slsd.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.slsd.dao.OrderlistDao;
import com.slsd.entity.Orderlist;

/**
* @ClassName: OrderlistDaoImpl
* @Description:TODO(订单清单实现类)
* @author: 陈先总
* @date: 2018年6月24日 下午2:50:52
*
* @Copyright: 2018 www.ncetc.chinasofti.com Inc. All rights reserved.
*/

@Repository
public class OrderlistDaoImpl extends SqlSessionDaoSupport implements OrderlistDao {

	@Autowired
	@Qualifier("sqlSessionFactory")
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		super.setSqlSessionFactory(sqlSessionFactory);
	}

	
	public boolean addOrderlist(Orderlist orderlist) {
		SqlSession sqlSession = this.getSqlSession();
		int row = sqlSession.insert("addOrderlist", orderlist);
		return row!=0 ? true:false;
	}

	
	public boolean delOrderlistBylid(int lid) {
		SqlSession sqlSession = this.getSqlSession();
		int row = sqlSession.delete("delOrderlistBylid", lid);
		return row!=0 ? true:false;
	}


	public boolean delOrderlistBylistID(int listID) {
		SqlSession sqlSession = this.getSqlSession();
		int row = sqlSession.delete("delOrderlistBylistID", listID);
		return row!=0 ? true:false;
	}

	
	public List<Orderlist> findAllOrderlist() {
		SqlSession sqlSession = this.getSqlSession();
		List<Orderlist> olist = sqlSession.selectList("findAllOrderlist");
		return olist;
	}

	
	public Orderlist findOrderlistByLid(int lid) {
		SqlSession sqlSession = this.getSqlSession();
		Orderlist o = sqlSession.selectOne("findAllOrderlist",lid);
		return o;
	}

	
	public List<Orderlist> findOrderlistByListID(int listID) {
		SqlSession sqlSession = this.getSqlSession();
		List<Orderlist> olist = sqlSession.selectList("findAllOrderlist",listID);
		return olist;
	}


	public boolean editOrderlist(Orderlist orderlist) {
		SqlSession sqlSession = this.getSqlSession();
		int row  = sqlSession.selectOne("editOrderlist",orderlist);
		return row!=0 ? true:false;
	}

}
