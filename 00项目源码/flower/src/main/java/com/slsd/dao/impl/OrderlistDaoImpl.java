/**
* All rights Reserved, Designed By www.ncetc.chinasofti.com
* @Title: OrderlistDaoImpl.java
* @Package com.slsd.dao.impl
* @Description: TODO(用一句话描述该文件做什么)
* @author: hasee
* @date: 2018年6月22日 下午4:40:23
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

import com.slsd.dao.OrderlistDao;
import com.slsd.entity.Order;
import com.slsd.entity.Orderlist;

/**
 * @ClassName: OrderlistDaoImpl
 * @Description:TODO(订单清单实现)
 * @author: cz
 * @date: 2018年6月22日 下午4:40:23
 *
 * @Copyright: 2018 www.ncetc.chinasofti.com Inc. All rights reserved.
 */
@Repository
public class OrderlistDaoImpl extends SqlSessionDaoSupport implements OrderlistDao {
	@Autowired
	@Qualifier("sqlSessionFactory")
	public int addOrderlist(Orderlist orderlist) {
		SqlSession sqlSession = this.getSqlSession();
		int row = sqlSession.insert("add", orderlist);
		return row;
	}

	public int delOrderlist(int listid) {
		SqlSession sqlSession = this.getSqlSession();
		int row = sqlSession.delete("delete", listid);
		return row;
	}

	public List<Orderlist> findAllorderlist() {
		SqlSession sqlSession = this.getSqlSession();
		List<Orderlist> llist = sqlSession.selectList("findAll");
		return llist;
	}

	public Orderlist findByListid(int listid) {
		SqlSession sqlSession = this.getSqlSession();
		Orderlist orderlist = sqlSession.selectOne("findbyid", listid);
		return orderlist;
	}

}
