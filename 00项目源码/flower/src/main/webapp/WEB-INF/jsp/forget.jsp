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
<base href="<%=basePath%>">
<title>forget</title>
<link href="css/bootstrap.css" rel="stylesheet">
<link href="css/forget.css" rel="stylesheet" />
<link href="img/sign.png" rel="icon" />
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
				<li><a href="index.html">商城首页</a></li>
				<li><a href="allshop.html">所有商品</a></li>
				<li><a href="#">支付方式</a></li>
				<li><a href="#">关于花语</a></li>
			</ul>
		</div>
		<div class="center">
			<form action="forget" method="post">
				<table border="0" height="600px" width="500px" id="center-login">
					<tr height="60px">
						<td width="150px" align="center">用户名</td>
						<td align="center"><input type="text" placeholder="请输入用户名"
							name="name" style="width: 250px;"></td>
					</tr>
					<tr height="60px">
						<td width="150px" align="center">联系方式</td>
						<td align="center"><input type="text" placeholder="请输入联系方式"
							style="width: 250px;" name="phone"></td>
					</tr>
					<tr height="60px">
						<td width="150px" align="center">修改后的密码</td>
						<td align="center"><input type="password"
							placeholder="请输入修改后的密码" style="width: 250px;" name="pwd1"></td>
					</tr>
					<tr height="60px">
						<td width="150px" align="center">确认密码</td>
						<td align="center"><input type="text" placeholder="请再次输入密码"
							name="pwd2" style="width: 250px;"></td>
					</tr>
					<tr height="80px">
						<td></td>
						<td align="center"><input type="submit" value="确定"
							style="width: 100px; height: 40px;"></td>
					</tr>

					<tr>
						<td colspan="2" id="center-login-1">
							<div class="center-login-down">
								<p>
									用户注册/登录说明 <a href="loginin">返回</a>
								</p>
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
	${msg }
	</br>
	<script src="js/bootstrap.js"></script>
	<script src="js/jquery-2.1.1.min.js"></script>
</body>

</html>