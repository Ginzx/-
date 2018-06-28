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
<link href="css/shopcar.css" rel="stylesheet">

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
				<table class="table table-striped" border="0">
					<thead>
						<tr>
							<th width="90px">订单编号</th>
							<th>清单号</th>
							<th>图片</th>
							<th>商品名</th>
							<th>数量</th>
							<th>价格</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach var="ool" items="${oolist }">
							<tr>
								<td>${ool.orderID }</td>
								<td>${ool.listID }</td>
								<td><img src="${ool.src }" width="100px" height="80px"></td>
								<td>${ool.flower }</td>

								<td>${ool.number }</td>
								<td>${ool.price }</td>

							</tr>
						</c:forEach>

					</tbody>
				</table>
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