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
<title>花语丨购物车页面</title>
<link href="css/bootstrap.css" rel="stylesheet">
<link href="css/allshop.css" rel="stylesheet" />

<meta name="viewport"
	content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<link rel="stylesheet" href="css/reset.css">
<link rel="stylesheet" href="css/carts.css">
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
				<li><a href="allshop">所有商品</a></li>
				<li><a href="#">支付方式</a></li>
				<li><a href="#">关于花语</a></li>
			</ul>
		</div>

		<div class="center">
			<script src="/demos/googlegg.js"></script>
			<section class="cartMain">
				<div class="cartMain_hd">
					<ul class="order_lists cartTop">
						<li class="list_chk">
							<!--所有商品全选--> <input type="checkbox" id="all" class="whole_check">
							<label for="all"></label> 全选
						</li>
						<li class="list_con">商品信息</li>
						<li class="list_info">商品参数</li>
						<li class="list_price">单价</li>
						<li class="list_amount">数量</li>
						<li class="list_sum">金额</li>
						<li class="list_op">操作</li>
					</ul>
				</div>

				<div class="cartBox">
					<div class="shop_info">

						<div class="shop_name">
							店铺：<a href="javascript:;">花语</a>
						</div>
					</div>
					<form action="addOrder" method="post">
						<div class="order_content">
							<c:forEach var="orderl" items="${ollist }">

								<ul class="order_lists">
									<li class="list_chk"><input type="checkbox"
										id="checkbox_'${ orderl.ID}'" class="son_check"
										name="checkall" value="${orderl.ID }"> <label
										for="checkbox_'${ orderl.ID}'"></label></li>
									<li class="list_con">
										<div class="list_img">
											<input type="hidden" name="picture_'${ orderl.ID}'"
												value="${orderl.picture }" /><a href="javascript:;"><img
												src="${orderl.picture }"></a>
										</div>
										<div class="list_text">
											<input type="hidden" name="flower_'${ orderl.ID}'"
												value="${orderl.flower }" /><a href="javascript:;">${orderl.flower }</a>
										</div>
									</li>
									<li class="list_info">
										<p>
											规格：<input type="hidden" name="type_'${ orderl.ID}'"
												value="${orderl.type }" />${orderl.type }</p>
										<p>ID：${orderl.ID }</p>
									</li>
									<li class="list_price">
										<p class="price">￥${orderl.price2 }</p>
									</li>
									<li class="list_amount">
										<div class="amount_box">
											<a href="javascript:;" class="reduce reSty">-</a> <input
												type="text" value="${orderl.number }"
												name="number_'${orderl.ID}'" class="sum"> <a
												href="javascript:;" class="plus">+</a>
										</div>
									</li>
									<li class="list_sum">
										<p class="sum_price">
											<input type="hidden" name="price_'${ orderl.ID}'"
												value="${orderl.price }" />￥${orderl.price }
										</p>
									</li>
									<li class="list_op">
										<p class="del">
											<a href="del?id=${orderl.ID }">移除商品</a>
										</p>
									</li>
								</ul>
							</c:forEach>

						</div>
				</div>




				<!--底部-->
				<div class="bar-wrapper">
					<div class="bar-right">
						<div class="piece">
							已选商品<strong class="piece_num">0</strong>件
						</div>
						<div class="totalMoney">
							共计: <strong class="total_text" >0.00</strong>
						</div>
						<div class="calBtn">
							<input type="submit" value="结算" style="width:80px; height:50px;">
						</div>
					</div>
				</div>
				</form>
			</section>
			<section class="model_bg"></section>
			<section class="my_model">
				<p class="title">
					删除宝贝<span class="closeModel">X</span>
				</p>
				<p>您确认要删除该宝贝吗？</p>
				<div class="opBtn">
					<a href="javascript:;" class="dialog-sure">确定</a><a
						href="javascript:;" class="dialog-close">关闭</a>
				</div>
			</section>

			<script src="js/jquery.min.js"></script>
			<script src="js/carts.js"></script>

		</div>

	</div>
	<script src="js/jquery-2.1.1.min.js"></script>
	<script src="js/bootstrap.js"></script>
</body>

</html>
