package com.slsd.entity;

import java.util.Date;
/**
 * 
* @ClassName: OrderOrderlist
* @Description:TODO(便捷使用查询的)
* @author: 邹博
* @date: 2018年6月28日 下午4:03:26
*
* @Copyright: 2018 www.ncetc.chinasofti.com Inc. All rights reserved.
 */
public class OrderOrderlist {

	private String username;// 用户名
	private int orderID;// 订单
	private int listID;// 清单编号
	private int lid;// 编号
	private int number;// 数量
	private String flower;// 花
	private double price;// 价格
	private String src;
	public String getSrc() {
		return src;
	}
	public void setSrc(String src) {
		this.src = src;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getOrderID() {
		return orderID;
	}
	public void setOrderID(int orderID) {
		this.orderID = orderID;
	}
	
	public int getListID() {
		return listID;
	}
	public void setListID(int listID) {
		this.listID = listID;
	}
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getFlower() {
		return flower;
	}
	public void setFlower(String flower) {
		this.flower = flower;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public OrderOrderlist(String username, int orderID, int listID, int lid, int number, String flower, double price,
			String src) {
		super();
		this.username = username;
		this.orderID = orderID;
		this.listID = listID;
		this.lid = lid;
		this.number = number;
		this.flower = flower;
		this.price = price;
		this.src = src;
	}
	public OrderOrderlist() {
		super();
	}
	@Override
	public String toString() {
		return "OrderOrderlist [username=" + username + ", orderID=" + orderID + ", listID=" + listID + ", lid=" + lid
				+ ", number=" + number + ", flower=" + flower + ", price=" + price + ", src=" + src + "]";
	}
	

}
