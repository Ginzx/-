package com.slsd.service;

import java.util.List;

import com.slsd.entity.Comment;

public interface CommentService {

	public List<Comment> findall();
	
	public List<Comment> findbyflower(int commentid);

	public boolean add(Comment comment);
	
	public boolean  edit(Comment comment);
	
	public boolean  del(int id);
}
