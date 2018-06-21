/**
* All rights Reserved, Designed By www.ncetc.chinasofti.com
* @Title: Orderlist.java
* @Package com.slsd.entity
* @Description: TODO(用一句话描述该文件做什么)
* @author: hasee
* @date: 2018年6月21日 下午1:48:45
* @version V1.0
* @Copyright: 2018 www.ncetc.chinasofti.com Inc. All rights reserved.
*/

package com.slsd.entity;

import java.util.Date;

/**
* @ClassName: Orderlist
* @Description:TODO(订单详情实体类)
* @author: cz
* @date: 2018年6月21日 下午1:48:45
*
* @Copyright: 2018 www.ncetc.chinasofti.com Inc. All rights reserved.
*/

public class Orderlist {
	private int listID;//清单编号
	private int lid;//编号
	private int number;//数量
	private String flower;//花
	private double price;//价格
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
	public Orderlist(int listID, int lid, int number, String flower, double price) {
		super();
		this.listID = listID;
		this.lid = lid;
		this.number = number;
		this.flower = flower;
		this.price = price;
	}
	public Orderlist() {
		super();
	}
	@Override
	public String toString() {
		return "Orderlist [listID=" + listID + ", lid=" + lid + ", number=" + number + ", flower=" + flower + ", price="
				+ price + "]";
	}
	
	
}
