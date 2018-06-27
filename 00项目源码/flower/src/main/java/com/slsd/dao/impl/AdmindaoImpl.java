/**
* @Title: AdmindaoImpl.java
* @Package com.slsd.dao.impl
* @Description: TODO(用一句话描述该文件做什么)
* @author: Administrator
* @date: 2018年6月21日 下午2:32:04
* @version V1.0
* @Copyright: 2018 www.ncetc.chinasofti.com Inc. All rights reserved.
*/

package com.slsd.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.slsd.dao.Admindao;
import com.slsd.entity.Admin;
import com.slsd.entity.AdminOrder;

/**
* @ClassName: AdmindaoImpl
* @Description:TODO(管理员账号登录的实现)
* @author: Administrator
* @date: 2018年6月21日 下午2:32:04
*
*/
@Repository
public class AdmindaoImpl extends SqlSessionDaoSupport implements Admindao {

	@Autowired
	@Qualifier("sqlSessionFactory")
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		super.setSqlSessionFactory(sqlSessionFactory);
	}

	public int login(Admin admin) {
		SqlSession sqlSession = this.getSqlSession();
		int num = sqlSession.selectOne("login", admin);
		return num;
	}

	public List<AdminOrder> findorder() {
		SqlSession sqlSession = this.getSqlSession();
		List<AdminOrder> adminorder=sqlSession.selectList("findorder");
		return adminorder;
	}

}
