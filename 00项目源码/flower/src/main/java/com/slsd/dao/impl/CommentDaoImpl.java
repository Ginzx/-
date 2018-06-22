package com.slsd.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.slsd.dao.CommentDao;
import com.slsd.entity.Comment;

/**
 * @ClassName: CommentDaoImpl
 * @Description:评论功能实现
 * @author: 王启明
 * @date: 2018年6月22日 上午11:02:34
 *
 */
@Repository("CommentDao")
public class CommentDaoImpl extends SqlSessionDaoSupport implements CommentDao {

	@Autowired
	@Qualifier("sqlSessionFactory")
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		super.setSqlSessionFactory(sqlSessionFactory);
	}

	public List<Comment> findall() {
		SqlSession sqlSession = this.getSqlSession();
		List<Comment> list =  sqlSession.selectList("findAll");
		return list;
	}

	public List<Comment> findbyflower(int commentid) {
		SqlSession sqlSession = this.getSqlSession();
		List<Comment> list =  sqlSession.selectList("findbyflower");
		return list;
	}

	public int add(Comment comment) {
		SqlSession sqlSession = this.getSqlSession();
		int num= sqlSession.insert("add");
		return num;
	}

	public int edit(Comment comment) {
		SqlSession sqlSession = this.getSqlSession();
		int num= sqlSession.update("edit");
		return num;
	}

	public int del(int id) {
		SqlSession sqlSession = this.getSqlSession();
		int num= sqlSession.delete("del");
		return num;
	}

}
