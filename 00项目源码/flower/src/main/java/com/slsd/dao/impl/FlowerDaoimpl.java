package com.slsd.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.slsd.dao.FlowerDao;
import com.slsd.entity.Flower;

/**
 * @ClassName: FlowerDaoimpl
 * @Description:TODO(商品的方法实现)
 * @author: Administrator
 * @date: 2018年6月21日 下午3:58:02
 *
 */
@Repository("FlowerDao")
public class FlowerDaoimpl extends SqlSessionDaoSupport implements FlowerDao {

	@Autowired
	@Qualifier("sqlSessionFactory")
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		super.setSqlSessionFactory(sqlSessionFactory);
	}

	public List<Flower> findAll() {
		SqlSession sqlSession = this.getSqlSession();
		List<Flower> tlist = sqlSession.selectList("findAll");
		return tlist;
	}

	public Flower findbyid(int id) {
		SqlSession sqlSession = this.getSqlSession();
		Flower flower=sqlSession.selectOne("findbyid", id);
		return flower;
	}

	public int addFlower(Flower flower) {
		SqlSession sqlSession = this.getSqlSession();
		int row = sqlSession.insert("add", flower);
		return row;
	}

	public int editFlower(Flower flower) {
		SqlSession sqlSession = this.getSqlSession();
		int row = sqlSession.update("edit", flower);
		return row;
	}

	public int delFlower(int id) {
		SqlSession sqlSession = this.getSqlSession();
		int row = sqlSession.delete("delete", id);
		return row;
	}

}
