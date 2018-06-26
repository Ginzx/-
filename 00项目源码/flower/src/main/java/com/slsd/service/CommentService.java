package com.slsd.service;

import java.util.List;

import com.slsd.entity.Comment;

/**
 * @ClassName: AdminService
 * @Description:TODO(注册方法注入)
 * @author: 王启明
 * @date: 2018年6月21日 下午2:52:42
 *
 */
public interface CommentService {

	public List<Comment> findall();

	public List<Comment> findbyflower(int commentid);

	public boolean add(Comment comment);

	public boolean edit(Comment comment);

	public boolean del(int id);
}
