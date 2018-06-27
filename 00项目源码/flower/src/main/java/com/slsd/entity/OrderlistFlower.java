package com.slsd.entity;

public class OrderlistFlower {

	private int number;// 数量
	private String flower;// 花
	private double price;// 价格
	private String picture;// 图片
	private int ID;// 商品编号
	private String name;// 名称
	private double price2;// 价格
	private String type;// 种类
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
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
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
	public double getPrice2() {
		return price2;
	}
	public void setPrice2(double price2) {
		this.price2 = price2;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public OrderlistFlower(int number, String flower, double price, String picture, int iD, String name, double price2,
			String type) {
		super();
		this.number = number;
		this.flower = flower;
		this.price = price;
		this.picture = picture;
		ID = iD;
		this.name = name;
		this.price2 = price2;
		this.type = type;
	}
	public OrderlistFlower() {
		super();
	}
	@Override
	public String toString() {
		return "OrderlistFlower [number=" + number + ", flower=" + flower + ", price=" + price + ", picture=" + picture
				+ ", ID=" + ID + ", name=" + name + ", price2=" + price2 + ", type=" + type + "]";
	}
	
	
}
