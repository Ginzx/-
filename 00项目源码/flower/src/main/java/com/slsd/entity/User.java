package com.slsd.entity;

/**
* @ClassName: User
* @Description:TODO(用户实体类)
* @author: cz
* @date: 2018年6月21日 下午1:40:21
*
* @Copyright: 2018 www.ncetc.chinasofti.com Inc. All rights reserved.
*/
public class User {
	private String uname;//用户名
	private String upwd;//密码
	private String address;//地址
	private String phone;//电话
	private String sex;//性别
	private String name;//用户姓名
	private String photo;//头像
	private String instroduction;//个人简介
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUpwd() {
		return upwd;
	}
	public void setUpwd(String upwd) {
		this.upwd = upwd;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public String getInstroduction() {
		return instroduction;
	}
	public void setInstroduction(String instroduction) {
		this.instroduction = instroduction;
	}
	public User(String uname, String upwd, String address, String phone, String sex, String name, String photo,
			String instroduction) {
		super();
		this.uname = uname;
		this.upwd = upwd;
		this.address = address;
		this.phone = phone;
		this.sex = sex;
		this.name = name;
		this.photo = photo;
		this.instroduction = instroduction;
	}
	public User() {
		super();
	}
	@Override
	public String toString() {
		return "User [uname=" + uname + ", upwd=" + upwd + ", address=" + address + ", phone=" + phone + ", sex=" + sex
				+ ", name=" + name + ", photo=" + photo + ", instroduction=" + instroduction + "]";
	}

	
}
