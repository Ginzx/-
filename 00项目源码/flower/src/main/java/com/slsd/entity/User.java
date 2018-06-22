package com.slsd.entity;

/**
 * @Classsername: User
 * @Description:TODO(用户实体类)
 * @author: cz
 * @date: 2018年6月21日 下午1:40:21
 *
 * @Copyright: 2018 www.ncetc.chinasofti.com Inc. All rights reserved.
 */
public class User {

	private String username;// 用户名
	private String userpwd;// 密码
	private String address;// 地址
	private String phone;// 电话
	private String sex;// 性别
	private String name;// 用户姓名
	private String photo;// 头像
	private String introduction;// 个人简介

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUserpwd() {
		return userpwd;
	}

	public void setUserpwd(String userpwd) {
		this.userpwd = userpwd;
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

	public String getIntroduction() {
		return introduction;
	}

	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}
	

	
	public User(String username, String userpwd) {
		super();
		this.username = username;
		this.userpwd = userpwd;
	}

	public User(String username, String userpwd, String address, String phone, String sex, String name, String photo,
			String introduction) {
		super();
		this.username = username;
		this.userpwd = userpwd;
		this.address = address;
		this.phone = phone;
		this.sex = sex;
		this.name = name;
		this.photo = photo;
		this.introduction = introduction;
	}

	public User() {
		super();
	}

	@Override
	public String toString() {
		return "User [username=" + username + ", userpwd=" + userpwd + ", address=" + address + ", phone=" + phone
				+ ", sex=" + sex + ", name=" + name + ", photo=" + photo + ", introduction=" + introduction + "]";
	}

	
}
