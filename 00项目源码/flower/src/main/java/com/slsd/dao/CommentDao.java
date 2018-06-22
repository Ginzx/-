package com.slsd.dao;

import java.util.List;

import com.slsd.entity.Comment;

/**
* @ClassName: CommentDao
* @Description:评论功能
* @author: 王启明
* @date: 2018年6月22日 上午10:57:44
*
*/
public interface CommentDao {

	/**
	* @Title: findall
	* @Description: 管理员查看所有评论信息
	* @param: @return
	* @return: List<Comment>
	* @throws
	*/
	public List<Comment> findall();
	
	/**
	* @Title: findbyflower
	* @Description: 查看某种商品评论信息
	* @param: @return
	* @return: Comment
	* @throws
	*/
	public List<Comment> findbyflower();
	
	

	/**
	* @Title: add
	* @Description: 用户发表评论
	* @param: @param comment
	* @param: @return
	* @return: int
	* @throws
	*/
	public int add(Comment comment);
	
	/**
	* @Title: edit
	* @Description: 用户修改评论
	* @param: @param comment
	* @param: @return
	* @return: int
	* @throws
	*/
	public int edit(Comment comment);
	
	/**
	* @Title: del
	* @Description: 用户删除评论
	* @param: @param id
	* @param: @return
	* @return: int
	* @throws
	*/
	public int del(int id);
}
