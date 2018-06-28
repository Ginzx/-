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
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>花语丨首页</title>
<link href="css/bootstrap.css" rel="stylesheet">
<link href="css/index.css" rel="stylesheet">
<script src="js/jquery-2.1.1.min.js"></script>
<link rel="stylesheet" href="css/shoppingCart.css" type="text/css">
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
			<div id="myCarousel" class="carousel slide">
				<!-- 轮播（Carousel）指标 -->
				<ol class="carousel-indicators">
					<li data-target="#myCarousel" data-slide-to="0" class="active"></li>
					<li data-target="#myCarousel" data-slide-to="1"></li>
					<li data-target="#myCarousel" data-slide-to="2"></li>
				</ol>
				<!-- 轮播（Carousel）项目 -->
				<div class="carousel-inner">
					<div class="item active">
						<img src="img/lunbo1..png" alt="First slide"
							style="height: 500px;">
					</div>
					<div class="item">
						<img src="img/lunbo2..png" alt="Second slide"
							style="height: 500px;">
					</div>
					<div class="item">
						<img src="img/lunbo3..png" alt="Third slide"
							style="height: 500px;">
					</div>
				</div>
				<!-- 轮播（Carousel）导航 -->
				<a class="left carousel-control" href="#myCarousel" role="button"
					data-slide="prev"> <span
					class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
					<span class="sr-only">Previous</span>
				</a> <a class="right carousel-control" href="#myCarousel" role="button"
					data-slide="next"> <span
					class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
					<span class="sr-only">Next</span>
				</a>
			</div>
			<div class="center2">
				<img src="img/center2.png"
					style="width: 1200px; height: 360px; margin-left: 200px;" />
			</div>
			<div class="center3">
				<img src="img/center3.png"
					style="width: 1200px; height: 410px; margin-left: 200px;" />
			</div>
			<div class="center4">
				<div class="center4-1">
					<img src="img/center4.png" style="width: 800px; height: 480px;" />
				</div>
				<div class="center4-2">
					<table width="600px" height="400px" border="0" id="center4-table">
						<tr height="150px">
							<td><img src="img/sign.png"
								style="width: 90px; height: 90px; margin-left: 255px;"></td>
						</tr>
						<tr>
							<td>
								<div class="center4-table1">
									&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;一花一世界，一朵盛开的话，是一株怒放的生命。花开无度，花落无声，暑往寒来，草木知秋，面对人世的悲欢，花无言，花尽知。
									就像人心永远不会永远不会满足于温室。同那“野火烧不尽”的小草一样，花，本属于大地，花也本应该盛开于大地。哪怕在风中凋零，
									哪怕在瞬息间寂灭，至少，曾经来过，至少，曾经活过真实的自我。</div>
							</td>
						</tr>
					</table>
				</div>
			</div>
			<div class="center5">
				<img src="img/center5.png"
					style="width: 1200px; height: 620px; margin-left: 200px;" />
			</div>
			<div class="down">
				<img src="img/down.png" style="width: 1600px; height: 700px;" />
			</div>
			<div>${suc2 }</div>
		</div>
	</div>
	</div>
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