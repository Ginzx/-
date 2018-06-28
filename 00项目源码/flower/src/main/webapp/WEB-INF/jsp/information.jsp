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
<base href="<%=basePath%>">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>花语丨个人信息</title>
<link href="css/bootstrap.css" rel="stylesheet">
<link href="css/information.css" rel="stylesheet">
<script>
	$(":radio[name='sex'][value='" + ${user.sex} + "']").prop("checked", "checked");
</script>
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
				<li><a href="userin"><span class="glyphicon glyphicon-user"
						aria-hidden="true"></span></a></li>
				<li><a href="cart"><span
						class="glyphicon glyphicon-shopping-cart" aria-hidden="true"></span></a>
				</li>
				<li><a href="loginin"><span class="glyphicon glyphicon-off"
						aria-hidden="true"></span></a></li>
			</ul>
		</div>
		<div class="s-top">
			<img src="img/sign.png"
				style="width: 90px; height: 90px; margin-left: 755px; margin-top: 55px;" />
			<ul>
				<li><a href="index">商城首页</a></li>
				<li><a href="allshop">所有商品</a></li>
				<li><a href="forpay">支付方式</a></li>
				<li><a href="intro">关于花语</a></li>
			</ul>
		</div>
		<div class="center">
			<ul>
				<li><a href="userin">
						<p>
							<span class="glyphicon glyphicon-user" id="center-1"></span>个人信息
						</p>
				</a></li>
				<li><a href="shopcar">
						<p>
							<span class="glyphicon glyphicon-shopping-cart" id="center-2"></span>订单详情
						</p>
				</a></li>
			</ul>
			<div class="center-1">
				<form action="editUser" method="post" enctype="multipart/form-data">
					<table border="0" width="900px" height="s00px"
						style="margin-left: 100px; margin-top: 50px; font-size: 16px;">
						<tr height="80px">
							<td width="200px">姓名</td>
							<td><input type="text" name="name" value="${user.name}"
								style="width: 500px; height: 35px; margin-left: 50px;"></td>
						</tr>
						<tr height="80px">
							<td>性别</td>

							<td><input type="radio" name="sex" value="男"
								style="margin-left: 100px;"
								<c:if test="${user.sex eq '男'}"> checked="checked"</c:if> />男 <input
								type="radio" name="sex" style="margin-left: 100px;" value="女"
								<c:if test="${user.sex eq '女'}"> checked="checked"</c:if> />女</td>
						</tr>
						<tr height="100px">
							<td>头像</td>
							<td><img src="${user.photo}" width="80px" height="80px"
								style="margin-left: 220px; margin-top: 10px;"> <input
								type="file" name="pictureFile" value="上传图片"
								style="margin-left: 170px; margin-bottom: 20px; width: 250px;" /></td>
						</tr>
						<tr height="80px">
							<td>联系方式</td>
							<td><input type="text" name="phone" value="${user.phone }"
								style="width: 500px; height: 35px; margin-left: 50px;"></td>
						</tr>
						<tr height="80px">
							<td>家庭地址</td>
							<td><input type="text" name="address"
								value="${user.address}"
								style="width: 500px; height: 35px; margin-left: 50px;"></td>
						</tr>
						<tr>
							<td>个人简介</td>
							<td><textarea rows="5" cols="70" name="introduction"
									style="margin-left: 50px;">${user.introduction }</textarea></td>
						</tr>
						<tr>
							<td></td>
							<td><input type="submit" value="保存修改"
								style="margin-left: 500px; margin-top: 30px;"></td>
						</tr>
					</table>
				</form>
			</div>
		</div>
		<div class="down">
			<img src="img/down.png" style="width: 1600px; height: 700px;" />
		</div>
	</div>
	<script src="js/jquery-2.1.1.min.js"></script>
	<script src="js/bootstrap.js"></script>
</body>

</html>