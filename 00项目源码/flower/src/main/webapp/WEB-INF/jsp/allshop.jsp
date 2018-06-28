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
<link rel="stylesheet" href="css/shoppingCart.css" type="text/css">
<script src="js/bootstrap.js"></script>
<script src="js/jquery-2.1.1.min.js"></script>
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
		<div class="center1">
			<img src="img/allshop.png" style="width: 1300px; height: 550px;" />
		</div>
		<div class="center">
			<table width="1000px" height="500px" border="0">
				<c:forEach var="fl" items="${allFlower }" step="1" end="8" begin="0"
					varStatus="fll">
					<c:if test="${fll.index %4==0}">
						<tr>
					</c:if>
					<td width="250px" height="250px">
						<table style="text-align: center;" border="0" width="250px">
							<tr>
								<td><a href="shop?id=${fl.ID }"><img
										src="${fl.picture }" width="200px" height="200px"
										style="margin-left: 25px;" /></a></td>
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
					<c:if test="${fll.index %4==3 }">
						</tr>
					</c:if>
				</c:forEach>


			</table>
		</div>
		<div class="down">
			<img src="img/down.png" style="width: 1600px; height: 700px;" />
		</div>

	</div>
	<div class="J-global-toolbar">
		<div class="toolbar-wrap J-wrap">
			<div class="toolbar">
				<div class="toolbar-panels J-panel">
					<div style="visibility: hidden;"
						class="J-content toolbar-panel tbar-panel-cart toolbar-animate-out">
						<h3 class="tbar-panel-header J-panel-header">
							<a href="" class="title"><i></i><em class="title">购物车</em></a> <span
								class="close-panel J-close"></span>
						</h3>
						<div class="tbar-panel-main">
							<div class="tbar-panel-content J-panel-content">

								<div id="J-cart-render">
									<div class="tbar-cart-list">
										<c:forEach var="ol2" items="${ollist }">
											<div class="tbar-cart-item">

												<div class="jtc-item-goods">
													<span class="p-img"><a href="#" target="_blank"><img
															src="${ol2.picture }" height="50" width="50" /></a></span>
													<div class="p-name">
														<a href="#">${ol2.flower }</a>
													</div>
													<div class="p-price">
														<strong>${ol2.price }</strong>&nbsp;
														&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;数量：${ol2.number }
													</div>
													<a href="del2?id=${ol2.ID }" class="p-del J-del">删除</a>
												</div>
											</div>
										</c:forEach>

									</div>
								</div>
							</div>
						</div>
						<div class="tbar-panel-footer J-panel-footer">
							<div class="tbar-checkout">

								<a class="jtc-btn J-btn" href="cart">去购物车结算</a>
							</div>
						</div>
					</div>




				</div>

				<div class="toolbar-header"></div>

				<div class="toolbar-tabs J-tab">
					<div class="toolbar-tab tbar-tab-cart">
						<i class="tab-ico"></i> <em class="tab-text ">购物车</em> <span
							class="tab-sub J-count ">${len }</span>
					</div>


				</div>

				<div class="toolbar-footer">
					<div class="toolbar-tab tbar-tab-top">
						<a href="#"> <i class="tab-ico  "></i> <em
							class="footer-tab-text">顶部</em>
						</a>
					</div>
				</div>

				<div class="toolbar-mini"></div>

			</div>

			<div id="J-toolbar-load-hook"></div>

		</div>
	</div>
	<script type="text/javascript" src='js/nav.js'></script>
	<script src="js/jquery-2.1.1.min.js"></script>
	<script src="js/bootstrap.js"></script>
</body>

</html>