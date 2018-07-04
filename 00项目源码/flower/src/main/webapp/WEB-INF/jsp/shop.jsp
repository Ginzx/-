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
<title>花语丨所有商品</title>
<link rel="stylesheet" type="text/css" href="css/magnifier.css">
<script src="js/jquery-2.1.1.min.js"></script>
<link rel="stylesheet" href="css/shoppingCart.css" type="text/css">
<script src="js/bootstrap.js"></script>
<link href="css/bootstrap.css" rel="stylesheet">
<link href="css/shop.css" rel="stylesheet" />
<script type="text/javascript">
			$(function() {

				var magnifierConfig = {
					magnifier: "#magnifier1", //最外层的大容器
					width: 500, //承载容器宽
					height: 500, //承载容器高
					moveWidth: null, //如果设置了移动盒子的宽度，则不计算缩放比例
					zoom: 5 //缩放比例
				};

				var _magnifier = magnifier(magnifierConfig);

				/*magnifier的内置函数调用*/
				/*
					//设置magnifier函数的index属性
					_magnifier.setIndex(1);

					//重新载入主图,根据magnifier函数的index属性
					_magnifier.eqImg();
				*/
				$(document).ready(function() {
					//加的效果
					$(".add").click(function() {
						var n = $(this).prev().val();
						var num = parseInt(n) + 1;
						if(num == 0) {
							return;
						}
						$(this).prev().val(num);
					});
					//减的效果
					$(".jian").click(function() {
						var n = $(this).next().val();
						var num = parseInt(n) - 1;
						if(num == 0) {
							return
						}
						$(this).next().val(num);
					});
				})
				
			});
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
			<div class="center-top">
				<div class="center-top-1">
					<a href="#">首页</a>&nbsp;&nbsp;&nbsp;&nbsp;/ <a href="#">所有商品</a>&nbsp;&nbsp;&nbsp;&nbsp;/
					${flower.name }
				</div>
			</div>
			<div class="center-mid">
				<div class="center-mid-right">
					<div class="magnifier" id="magnifier1">
						<div class="magnifier-container">
							<div class="images-cover"></div>
							<!--当前图片显示容器-->
							<div class="move-view"></div>
							<!--跟随鼠标移动的盒子-->
						</div>
						<div class="magnifier-assembly">
							<div class="magnifier-btn">
								<span class="magnifier-btn-left">&lt;</span> <span
									class="magnifier-btn-right">&gt;</span>
							</div>
							<!--按钮组-->
							<div class="magnifier-line">
								<ul class="clearfix animation03">
									<li>
										<div class="small-img">
											<img src="${flower.picture }" />
										</div>
									</li>
								</ul>
							</div>
							<!--缩略图-->
						</div>
						<div class="magnifier-view"></div>
						<!--经过放大的图片显示容器-->
					</div>
				</div>
				<div class="center-mid-left">
					<table border="0" width="300px" height="300px"
						id="center-mid-left-1">
						<form action="addCart" method="post">
							<tr>
								<td>
									<h3>
										<span><input type="hidden" name="flower"
											value="${flower.name }" />${flower.name }</span> <input
											type="hidden" name="picture" value="${flower.picture }" />
									</h3>
								</td>
							</tr>
							<tr>
								<td>单价:<span id="center-mid-left-3"><input
										type="hidden" name="price" value="${flower.price }" />¥${flower.price }</span></td>
							</tr>
							<tr>
								<td>
									<div id="center-mid-left-4" name="lid">
										<input type="hidden" name="ID" value="${flower.ID }" />商品编号${flower.ID }
									</div>

								</td>
							</tr>
							<tr>
								<td>分类：<span id="center-mid-left-2"><input
										type="hidden" name="type" value="${flower.type }" />${flower.type }</span></td>
							</tr>
							<tr>
								<td><input type="submit" value="加入购物车"
									style="background: whitesmoke; width: 120px; height: 40px; margin-left: 15px;">
									<div class="gw_num">
										<em class="jian">-</em> <input type="text" value="1"
											class="num" name="number" /> <em class="add">+</em>
									</div></td>
							</tr>
						</form>
					</table>
				</div>
				<div class="center-mid-left2">
					<div class="center-mid-left2-1">
						<table class="table table-striped" id="center-mid-left2-a">
							<thead>
								<tr>
									<th id="center-mid-left2-b">金牌店铺，值得信赖</th>
								</tr>
							</thead>
							<tbody>
								<tr>
									<td><strong>&nbsp;&nbsp;&nbsp;&nbsp;花语HUAYU</strong></td>
								</tr>
								<tr>
									<td>&nbsp;&nbsp;&nbsp;&nbsp;信誉：★★★★★</td>
								</tr>
								<tr>
									<td>&nbsp;&nbsp;&nbsp;&nbsp;服务：4.9</td>
								</tr>
								<tr>
									<td>&nbsp;&nbsp;&nbsp;&nbsp;物流：4.9</td>
								</tr>
								<tr>
									<td>&nbsp;&nbsp;&nbsp;&nbsp;描述：4.9</td>
								</tr>
							</tbody>
						</table>
					</div>
					<div class="center-mid-left2-2">
						<table border="0" width="340px" height="600px">
							<tr>
								<td colspan="2">相关推荐 HOT SALE</td>
							</tr>
							<c:forEach var="fl1" items="${allFlower1 }" step="1" end="8"
								begin="0" varStatus="fll1">
								<c:if test="${fll1.index %2==0 }">
									<tr>
								</c:if>
								<td><a href="shop?id=${fl1.ID }"><img
										src="${fl1.picture }" width="100px" height="100px"
										style="margin-left: 35px;"></a>
									<p align="center">${fl1.name }</p></td>
								<c:if test="${fll1.index %2==1 }">
									</tr>
								</c:if>
							</c:forEach>


						</table>
					</div>
				</div>
				<div class="center-mid-down">
					<table width="750px" height="280px" 
						style="margin-left: 40px; margin-top: 15px;">
						<tr>
							<td><h4>用户评论</h4></td>
						</tr>
						<c:forEach var="ct" items="${clist }">
							<tr style="border-bottom:solid 1px #333333;">
								<td>${ct.comment }</td>
								<td >${ct.user }</td>
							</tr>
						</c:forEach>


						<tr>
							<td><button class="btn btn-primary btn-lg"
									data-toggle="modal" data-target="#myModal">发布评论</button> <!-- 模态框（Modal） -->
								<form action="addComment?cid=${flower.ID }" method="post"
									id="addC">
									<div class="modal fade" id="myModal" tabindex="-1"
										role="dialog" aria-labelledby="myModalLabel"
										aria-hidden="true">
										<div class="modal-dialog">
											<div class="modal-content">
												<div class="modal-header">
													<input type="hidden" name="cidt" value="${flower.ID }" />
													<button type="button" class="close" data-dismiss="modal"
														aria-hidden="true">&times;</button>
													<h4 class="modal-title" id="myModalLabel">请发布你的评论</h4>
												</div>
												<div class="modal-body">
													<textarea rows="5" cols="80" name="content"></textarea>
												</div>
												<div class="modal-footer">
													<button type="button" class="btn btn-default"
														data-dismiss="modal">关闭</button>
													<button type="submit" class="btn btn-primary"
														value="submit" form="addC">提交更改</button>
												</div>
											</div>
											<!-- /.modal-content -->
										</div>
										<!-- /.modal -->
									</div></td>
						</tr>
						</form>
					</table>
				</div>
			</div>
		</div>
		<div class="down">
			<img src="img/down.png" style="width: 1600px; height: 700px;" />
		</div>
		<div>${err2 }</div>


	</div>

	<div class="J-global-toolbar">
		<div class="toolbar-wrap J-wrap">
			<div class="toolbar">
				<div class="toolbar-panels J-panel">
					<div style="visibility: hidden;"
						class="J-content toolbar-panel tbar-panel-cart toolbar-animate-out">
						<h3 class="tbar-panel-header J-panel-header">
							<a href="" class="title"><i></i><em class="title">购物车</em></a>
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

	<script type="text/javascript" src="js/magnifier.js"></script>
	<script src="js/jquery-2.1.1.min.js"></script>
	<script src="js/bootstrap.js"></script>
</body>

</html>