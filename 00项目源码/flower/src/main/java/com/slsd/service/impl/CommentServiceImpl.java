package com.slsd.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.slsd.dao.CommentDao;
import com.slsd.entity.Comment;
import com.slsd.service.CommentService;

/**
* @ClassName: CommentServiceImpl
* @Description:TODO(这里用一句话描述这个类的作用)
* @author: 王启明
* @date: 2018年6月24日 下午4:58:26
*
*/
@Service("CommentService")
public class CommentServiceImpl implements CommentService {

	@Autowired
	@Qualifier("commentDao")
	private CommentDao commentDao;

	public List<Comment> findall() {
		return commentDao.findall();
	}

	public List<Comment> findbyflower(int commentid) {
		return commentDao.findbyflower(commentid);
	}

	public boolean add(Comment comment) {
		return (commentDao.add(comment) > 0) ? true : false;
	}

	public boolean edit(Comment comment) {
		return (commentDao.edit(comment) > 0) ? true : false;
	}

	public boolean del(int id) {
		return (commentDao.del(id) > 0) ? true : false;
	}
	
	
}
