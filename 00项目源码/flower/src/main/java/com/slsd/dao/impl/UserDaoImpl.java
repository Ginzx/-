package com.slsd.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.slsd.dao.UserDao;
import com.slsd.entity.User;

/**
* @ClassName: UserDaoImpl
* @Description:TODO(用户接口实现)
* @author: 邹博
* @date: 2018年6月22日 上午10:09:04
*
* @Copyright: 2018 www.ncetc.chinasofti.com Inc. All rights reserved.
*/
@Repository
public class UserDaoImpl  extends SqlSessionDaoSupport implements UserDao {

	
	@Autowired
	@Qualifier("sqlSessionFactory")
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		super.setSqlSessionFactory(sqlSessionFactory);
	}

	public int login(User user) {
		SqlSession sqlSession = this.getSqlSession();
		int num = sqlSession.selectOne("Login", user);
		return num;
	}

	public boolean addUser(User user) {
		SqlSession sqlSession = this.getSqlSession();
		int row = sqlSession.insert("addUser", user);
		return row!=0 ? true:false;
	}

	public boolean editUser(User user) {
		SqlSession sqlSession = this.getSqlSession();
		int row = sqlSession.update("editUser", user);
		return row!=0 ? true:false;
	}

	public boolean editUserPhoto(User user) {
		SqlSession sqlSession = this.getSqlSession();
		int row = sqlSession.update("editUserPhoto", user);
		return row!=0 ? true:false;
	}

	public boolean delUser(User user) {
		SqlSession sqlSession = this.getSqlSession();
		int row = sqlSession.delete("delUser", user);
		return row!=0 ? true:false;
	}

	public List<User> getAll() {
		SqlSession sqlSession = this.getSqlSession();
		List<User> ulist = sqlSession.selectList("getAll");
		return ulist;
	}

}
