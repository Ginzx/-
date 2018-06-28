<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>花语丨注册</title>
<link href="css/bootstrap.css" rel="stylesheet">
<link href="css/register.css" rel="stylesheet" />
<script>
	function testuser() {
		var user = $("#name").val();
		if (user == null || user == "") {
			alert("用户名不能为空")
		}
	}

	function testPwd() {
		var pwd1 = $("#pwd").val();
		var pwd2 = $("#pwd1").val();
		if (pwd1 == null || pwd2 == "") {
			alert("密码不能为空");
		} else {
			if (pwd1 != pwd2) {
				alert("两次输入的密码不同")
			}
		}
	}
</Script>
</head>
<body>
	<div class="all">
		<div class="m-top">
			<ul>
				<li><span class="glyphicon glyphicon-time" aria-hidden="true"></span>在线时间
					8：00~21：30</li>
				<li>欢迎访问花语在线商城！</li>
			</ul>
			<ul id="m-top-1">
				<li><a href="#"><span class="glyphicon glyphicon-search"
						aria-hidden="true"></span></a></li>
				<li><a href="#"><span class="glyphicon glyphicon-user"
						aria-hidden="true"></span></a></li>
				<li><a href="#"><span
						class="glyphicon glyphicon-shopping-cart" aria-hidden="true"></span></a>
				</li>
			</ul>
		</div>
		<div class="s-top">
			<img src="img/sign.png"
				style="width: 90px; height: 90px; margin-left: 755px; margin-top: 55px;" />
			<ul>
				<li><a href="#">商城首页</a></li>
				<li><a href="#">所有商品</a></li>
				<li><a href="#">支付方式</a></li>
				<li><a href="#">关于花语</a></li>
			</ul>
		</div>
		<div class="center">
			<form action="register" method="post">
				<table border="0" height="600px" width="500px" id="center-login">
					<tr height="60px">
						<td width="100px" align="center">用户名</td>
						<td align="center"><input type="text" placeholder="请输入用户名"
							id="name" name="username" onblur="testUser()"
							style="width: 200px;"></td>
						<td><span id="show1"></span></td>
					</tr>
					<tr height="60px">
						<td width="100px" align="center">密&nbsp;&nbsp;&nbsp;&nbsp;码</td>
						<td align="center"><input type="password" placeholder="请输入密码"
							name="pwd" id="pwd" style="width: 200px;"></td>
						<td><span></span></td>
					</tr>
					<tr height="60px">
						<td width="100px" align="center">确认密码</td>
						<td align="center"><input type="password" name="pwd1"
							id="pwd1" onblur="testPwd()" placeholder="请再次输入密码"
							style="width: 200px;"></td>
						<td><span id="show2"></span></td>
					</tr>
					<tr height="60px">
						<td width="100px" align="center">联系方式</td>
						<td align="center"><input type="text" placeholder="请输入联系方式"
							name="phone" style="width: 200px;"></td>
					</tr>
					<tr height="80px">
						<td width="100px"></td>
						<td align="center"><input type="submit" value="注册"
							style="width: 50px; height: 30px;"></td>
						<td width="100px"></td>
					</tr>
					<tr>
						<td colspan="3" align ="center"><a href="loginin">返回</a></td>
					</tr>
					<tr>
					<td colspan="2" id="center-login-1">
						<div class="center-login-down">
							<p>用户注册/登录说明</p>
							<p>1、实际使用之前，需配置用户管理组件中的相关邮件。详情请参考教程：《用户管理中相关邮件的配置》</p>
							<p>2、新用户注册后的审核方式有三种：自动核准、邮件激活、需要管理员批准（即人工审核），详情可参考教程《如何设置用户注册后的审核方式》</p>
						</div>

					</td>
					</tr>
				</table>
			</form>
		</div>
		<div class="down">
			<img src="img/down.png" style="width: 1600px; height: 700px;" />
		</div>
	</div>
	<script src="js/bootstrap.js"></script>
	<script src="js/jquery-2.1.1.min.js"></script>
</body>

</html>