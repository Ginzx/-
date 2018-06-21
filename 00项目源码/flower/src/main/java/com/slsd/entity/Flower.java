/**
* All rights Reserved, Designed By www.ncetc.chinasofti.com
* @Title: Flower.java
* @Package com.slsd.entity
* @Description: TODO(用一句话描述该文件做什么)
* @author: hasee
* @date: 2018年6月21日 下午1:52:46
* @version V1.0
* @Copyright: 2018 www.ncetc.chinasofti.com Inc. All rights reserved.
*/

package com.slsd.entity;

/**
 * @ClassName: Flower
 * @Description:TODO(商品实体类)
 * @author: cz
 * @date: 2018年6月21日 下午1:52:46
 *
 * @Copyright: 2018 www.ncetc.chinasofti.com Inc. All rights reserved.
 */

public class Flower {

	private int ID;// 商品编号
	private String name;// 名称
	private double price;// 价格
	private String type;// 种类
	private int commentID;// 评论编号
	private String picture;// 图片

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getCommentID() {
		return commentID;
	}

	public void setCommentID(int commentID) {
		this.commentID = commentID;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public Flower(int iD, String name, double price, String type, int commentID, String picture) {
		super();
		ID = iD;
		this.name = name;
		this.price = price;
		this.type = type;
		this.commentID = commentID;
		this.picture = picture;
	}

	public Flower() {
		super();
	}

	@Override
	public String toString() {
		return "Flower [ID=" + ID + ", name=" + name + ", price=" + price + ", type=" + type + ", commentID="
				+ commentID + ", picture=" + picture + "]";
	}

}
