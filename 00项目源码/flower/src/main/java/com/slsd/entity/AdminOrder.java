package com.slsd.entity;

/**
 * @ClassName: AdminOrder
 * @Description:管理员查询到的订单实体
 * @author: 王启明
 * @date: 2018年6月27日 下午3:15:04
 *
 */
public class AdminOrder {

	private int orderid;//订单号
	private int number;//数量
	private double price;//价格
	private String username;//用户姓名
	private String pictre;//图片
	private String flower;//商品

	public int getOrderid() {
		return orderid;
	}

	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPictre() {
		return pictre;
	}

	public void setPictre(String pictre) {
		this.pictre = pictre;
	}

	public String getFlower() {
		return flower;
	}

	public void setFlower(String flower) {
		this.flower = flower;
	}

	@Override
	public String toString() {
		return "AdminOrder [orderid=" + orderid + ", number=" + number + ", price=" + price + ", username=" + username
				+ ", pictre=" + pictre + ", flower=" + flower + "]";
	}

	public AdminOrder(int orderid, int number, double price, String username, String pictre, String flower) {
		super();
		this.orderid = orderid;
		this.number = number;
		this.price = price;
		this.username = username;
		this.pictre = pictre;
		this.flower = flower;
	}

	public AdminOrder() {
		super();
	}

}
