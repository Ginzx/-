package com.slsd.entity;

import java.util.Date;

/**
 * @ClassName: Order
 * @Description:TODO(订单实体类)
 * @author: hasee
 * @date: 2018年6月21日 下午1:49:11
 *
 * @Copyright: 2018 www.ncetc.chinasofti.com Inc. All rights reserved.
 */
public class Order {

	private String username;// 用户名
	private int orderID;// 订单号
	private Date time;// 订单时间
	private int listID;// 订单清单号
	private double price;// 订单总价

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

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public int getListID() {
		return listID;
	}

	public void setListID(int listID) {
		this.listID = listID;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Order [username=" + username + ", orderID=" + orderID + ", time=" + time + ", listID=" + listID
				+ ", price=" + price + "]";
	}

	public Order(String username, int orderID, Date time, int listID, double price) {
		super();
		this.username = username;
		this.orderID = orderID;
		this.time = time;
		this.listID = listID;
		this.price = price;
	}

	public Order() {
		super();
	}

}
