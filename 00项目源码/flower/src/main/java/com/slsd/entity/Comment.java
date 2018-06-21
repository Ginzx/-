/**
* All rights Reserved, Designed By www.ncetc.chinasofti.com
* @Title: Comment.java
* @Package com.slsd.entity
* @Description: TODO(用一句话描述该文件做什么)
* @author: hasee
* @date: 2018年6月21日 下午1:55:37
* @version V1.0
* @Copyright: 2018 www.ncetc.chinasofti.com Inc. All rights reserved.
*/

package com.slsd.entity;

/**
* @ClassName: Comment
* @Description:TODO(评论实体类)
* @author: hasee
* @date: 2018年6月21日 下午1:55:37
*
* @Copyright: 2018 www.ncetc.chinasofti.com Inc. All rights reserved.
*/

public class Comment {
	private int cid;//编号
	private int commentID;//评论编号
	private String comment;//评论内容
	private String user;//用户名
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public int getCommentID() {
		return commentID;
	}
	public void setCommentID(int commentID) {
		this.commentID = commentID;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public Comment(int cid, int commentID, String comment, String user) {
		super();
		this.cid = cid;
		this.commentID = commentID;
		this.comment = comment;
		this.user = user;
	}
	public Comment() {
		super();
	}
	@Override
	public String toString() {
		return "Comment [cid=" + cid + ", commentID=" + commentID + ", comment=" + comment + ", user=" + user + "]";
	}
	
}
