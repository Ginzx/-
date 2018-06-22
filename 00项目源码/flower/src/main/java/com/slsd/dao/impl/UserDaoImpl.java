/**
* All rights Reserved, Designed By www.ncetc.chinasofti.com
* @Title: UserDaoImpl.java
* @Package com.slsd.dao.impl
* @Description: TODO(用一句话描述该文件做什么)
* @author: Administrator
* @date: 2018年6月22日 上午10:09:04
* @version V1.0
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

import com.slsd.dao.UserDao;
import com.slsd.entity.Flower;
import com.slsd.entity.User;

/**
* @ClassName: UserDaoImpl
* @Description:TODO(用户接口实现)
* @author: 邹博
* @date: 2018年6月22日 上午10:09:04
*
* @Copyright: 2018 www.ncetc.chinasofti.com Inc. All rights reserved.
*/
@Repository("UserDao")
public class UserDaoImpl  extends SqlSessionDaoSupport implements UserDao {

	
	@Autowired
	@Qualifier("sqlSessionFactory")
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		super.setSqlSessionFactory(sqlSessionFactory);
	}

	/**
	* <p>Title: login</p>
	* <p>Description: </p>
	* @param user
	* @return
	* @see com.slsd.dao.UserDao#login(com.slsd.entity.User)
	*/
	public boolean login(User user) {
		SqlSession sqlSession = this.getSqlSession();
		int num = sqlSession.selectOne("Login", user);
		return num!=0?true:false;
	}

	/**
	* <p>Title: addUser</p>
	* <p>Description: </p>
	* @param user
	* @return
	* @see com.slsd.dao.UserDao#addUser(com.slsd.entity.User)
	*/
	public boolean addUser(User user) {
		SqlSession sqlSession = this.getSqlSession();
		int row = sqlSession.insert("addUser", user);
		return row!=0 ? true:false;
	}

	/**
	* <p>Title: editUser</p>
	* <p>Description: </p>
	* @param user
	* @return
	* @see com.slsd.dao.UserDao#editUser(com.slsd.entity.User)
	*/
	public boolean editUser(User user) {
		SqlSession sqlSession = this.getSqlSession();
		int row = sqlSession.update("editUser", user);
		return row!=0 ? true:false;
	}

	/**
	* <p>Title: editUserPhoto</p>
	* <p>Description: </p>
	* @param user
	* @return
	* @see com.slsd.dao.UserDao#editUserPhoto(com.slsd.entity.User)
	*/
	public boolean editUserPhoto(User user) {
		SqlSession sqlSession = this.getSqlSession();
		int row = sqlSession.update("editUserPhoto", user);
		return row!=0 ? true:false;
	}

	/**
	* <p>Title: delUser</p>
	* <p>Description: </p>
	* @param user
	* @return
	* @see com.slsd.dao.UserDao#delUser(com.slsd.entity.User)
	*/
	public boolean delUser(User user) {
		SqlSession sqlSession = this.getSqlSession();
		int row = sqlSession.delete("delete", user);
		return row!=0 ? true:false;
	}

	/**
	* <p>Title: getAll</p>
	* <p>Description: </p>
	* @return
	* @see com.slsd.dao.UserDao#getAll()
	*/
	public List<User> getAll() {
		SqlSession sqlSession = this.getSqlSession();
		List<User> ulist = sqlSession.selectList("getAll");
		return ulist;
	}

}
