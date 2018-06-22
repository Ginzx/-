/**
* All rights Reserved, Designed By www.ncetc.chinasofti.com
* @Title: OrderDaoImpl.java
* @Package com.slsd.dao.impl
* @Description: TODO(用一句话描述该文件做什么)
* @author: hasee
* @date: 2018年6月22日 下午3:46:36
* @version V1.0
* @Copyright: 2018 www.ncetc.chinasofti.com Inc. All rights reserved.
*/

package com.slsd.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.slsd.dao.OrderDao;
import com.slsd.entity.Flower;
import com.slsd.entity.Order;

/**
* @ClassName: OrderDaoImpl
* @Description:TODO(这里用一句话描述这个类的作用)
* @author: hasee
* @date: 2018年6月22日 下午3:46:36
*
* @Copyright: 2018 www.ncetc.chinasofti.com Inc. All rights reserved.
*/
@Repository
public class OrderDaoImpl extends SqlSessionDaoSupport implements OrderDao {
	@Autowired
	@Qualifier("sqlSessionFactory")
	public int addOrder(Order order) {
		SqlSession sqlSession = this.getSqlSession();
		int row = sqlSession.insert("add", order);
		return row;
	}

	public int delOrder(int orderid) {
		SqlSession sqlSession = this.getSqlSession();
		int row = sqlSession.delete("delete", orderid);
		return row;
	}

	public List<Order> findAllorder() {
		SqlSession sqlSession = this.getSqlSession();
		List<Order> olist = sqlSession.selectList("findAll");
		return olist;
	}

	public Order findByOrderid(int orderid) {
		SqlSession sqlSession = this.getSqlSession();
		Order order=sqlSession.selectOne("findbyid", orderid);
		return order;
	}

}
