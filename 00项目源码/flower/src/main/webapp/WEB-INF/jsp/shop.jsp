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
							<td >
								<h3><span ><input type="hidden" name="flower" value="${flower.name }"/>${flower.name }</span>
									<input type="hidden" name="picture" value="${flower.picture }"/>
								</h3>
							</td>
						</tr>
						<tr>
							<td>单价:<span id="center-mid-left-3"  ><input type="hidden" name="price" value="${flower.price }"/>¥${flower.price }</span></td>
						</tr>
						<tr>
							<td>
								<div id="center-mid-left-4" name="lid" ><input type="hidden" name="ID" value="${flower.ID }"/>商品编号${flower.ID }</div>

							</td>
						</tr>
						<tr>
							<td>分类：<span id="center-mid-left-2" ><input type="hidden" name="type" value="${flower.type }"/>${flower.type }</span></td>
						</tr>
						<tr>
							<td><input type="submit" value="加入购物车" 
								style="background: whitesmoke; width: 120px; height: 40px; margin-left: 15px;">
								<div class="gw_num">
									<em class="jian">-</em> <input type="text" value="1"
										class="num" name="number"  /> <em class="add">+</em>
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
							<c:forEach var="fl1" items="${allFlower1 }" step="1" end="8" begin="0" varStatus="fll1">
								<c:if test="${fll1.index %2==0 }"><tr></c:if>
									<td>
										<a href="shop?id=${fl1.ID }"><img src="${fl1.picture }"
										width="100px" height="100px" style="margin-left: 35px;"></a>
									</td>
								<c:if test="${fll1.index %2==1 }"></tr></c:if>
							</c:forEach>
							
							
						</table>
					</div>
				</div>
				<div class="center-mid-down">
					<table width="750px" height="280px" border="0"
						style="margin-left: 40px; margin-top: 15px;">
						<tr>
							<td><h4>用户评论</h4></td>
						</tr>
						<c:forEach var="ct" items="${clist }">
							<tr>
								<td>${ct.comment }</td>
								<td>${ct.user }</td>
							</tr>
						</c:forEach>
						<form action="addComment?cid=${flower.commentID }" method="post">
						<tr>
							<td>
							<input type="hidden" name="cidt" value="${flower.ID }"/>
							<textarea rows="5" cols="120" name="content"></textarea></td>
						</tr>
						<tr>
							<td><input type="submit" value="提交评论"
								style="margin-left: 600px; width: 100px; height: 40px;"></td>
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
		
		<div>${suc }</div>
	</div>
	<script type="text/javascript" src="js/magnifier.js"></script>
	<script src="js/jquery-2.1.1.min.js"></script>
	<script src="js/bootstrap.js"></script>
</body>

</html>