package com.slsd.entity;

/**
 * @ClassName: Admin
 * @Description:TODO(管理员实体类)
 * @author: cz
 * @date: 2018年6月21日 下午1:38:55
 *
 * @Copyright: 2018 www.ncetc.chinasofti.com Inc. All rights reserved.
 */
public class Admin {

	private String name;// 管理员账号
	private String pwd;// 管理员密码

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public Admin(String name, String pwd) {
		super();
		this.name = name;
		this.pwd = pwd;
	}

	public Admin() {
		super();
	}

	@Override
	public String toString() {
		return "Admin [name=" + name + ", pwd=" + pwd + "]";
	}

}
