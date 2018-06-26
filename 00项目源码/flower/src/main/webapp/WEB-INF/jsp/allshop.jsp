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
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge,charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>花语丨所有商品</title>
<link href="css/bootstrap.css" rel="stylesheet">
<link href="css/allshop.css" rel="stylesheet" />
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
				<li><a href="cart"><span
						class="glyphicon glyphicon-shopping-cart" aria-hidden="true"></span></a>
				</li>
			</ul>
		</div>
		<div class="s-top">
			<img src="img/sign.png"
				style="width: 90px; height: 90px; margin-left: 755px; margin-top: 55px;" />
			<ul>
				<li><a href="index">商城首页</a></li>
				<li><a href="allshop">所有商品</a></li>
				<li><a href="#">支付方式</a></li>
				<li><a href="#">关于花语</a></li>
			</ul>
		</div>
		<div class="center1">
			<img src="img/allshop.png" style="width: 1300px; height: 550px;" />
		</div>
		<div class="center">
			<table width="1000px" height="500px" border="0">
				<c:forEach var="fl" items="${allFlower }" step="1" end="8" begin="0" varStatus="fll">
					<c:if test="${fll.index %4==0}"><tr></c:if>
						<td width="250px" height="250px">
							<table style="text-align: center;" border="0" width="250px">
								<tr>
									<td><a href="shop?id=${fl.ID }"><img src="${fl.picture }"
											width="200px" height="200px" style="margin-left: 25px;" /></a></td>
								</tr>
								<tr>
									<td>
										<h4>${fl.name }</h4>
									</td>
								</tr>
								<tr>
									<td style="color: dimgray;">¥${fl.price }</td>
								</tr>
							</table>
						</td>
					<c:if test="${fll.index %4==3 }"></tr></c:if>
				</c:forEach>


			</table>
		</div>
		<div class="down">
			<img src="img/down.png" style="width: 1600px; height: 700px;" />
		</div>
	</div>
	<script src="js/jquery-2.1.1.min.js"></script>
	<script src="js/bootstrap.js"></script>
</body>

</html>