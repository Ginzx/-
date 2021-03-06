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
<link href="css/bootstrap.css" rel="stylesheet">
<link href="css/introduce.css" rel="stylesheet" />
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
				<li><a href="userin"><span class="glyphicon glyphicon-user"
						aria-hidden="true"></span></a></li>
				<li><a href="cart"><span
						class="glyphicon glyphicon-shopping-cart" aria-hidden="true"></span></a>
				</li>
				<li><a href="loginin"><span class="glyphicon glyphicon-off"
						aria-hidden="true"></span></a></li>
			</ul>
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
			<img src="img/introduce.jpg" style="width: 1600px; height: 500px;"
				align="center" />
		</div>
		<div class="center">
			<div class="left-1">
				<img src="img/p4.png" style="width: 850px; height: 100px;" /> <span
					style="font-family: 微软雅黑;"> <span style="color: #808080;">
						<span style="font-size: 18px;">
							&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;从店铺装修到花卉设计，这里到处都飘散着柔情而文艺的气息。以粉色、紫色系为主打，配上各种清秀的小花，精致地包装让你捧着它都会立刻成为街上的焦点，连许多演艺
							界的明星都是它的常客。 </span>
				</span>
				</span>
				<p></p>
				<span style="font-family: 微软雅黑;"> <span
					style="color: #808080;"> <span style="font-size: 18px;">
							&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;店里的每朵花都有故事，镇店之作“莫奈花园”的故事被广为流传后，“艺术家系列永生花像”、故事订花等不少作品都总是售罄或限量，一花一故事传递着人与人之间最温情的大城小爱。
					</span>
				</span>
				</span>
				<p></p>
				<span style="font-family: 微软雅黑;"> <span
					style="color: #808080;"> <span style="font-size: 18px;">
							&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;店铺里到处都是盛开的玫瑰，它们都是店主从南美厄瓜多尔、法国高加索以及叙利亚三大世界顶级玫瑰产地挑选出来的。花艺家们将“爱”融于全部的细节之中。在你填写资料时，花店会提醒你收花人信息不可更改，并生成一个由送花人和收花人共有的唯一码。一朵玫瑰能承载多少情感？“一生只送一人”的勇气，如果你有，就向TA证明。
					</span>
				</span>
				</span>
				<p></p>
				<span style="font-family: 微软雅黑;"> <span
					style="color: #808080;"> <span style="font-size: 18px;">
							&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;这是一家开在德国缪诗肖像摄影馆里的欧式花店。一进门那精致古典的欧式布置让人仿佛走进油画里一般。名字的来源非常有爱，“全矣”是女主人女儿的名字，承载的不仅是对女儿的爱意，也是对生活的美好寄寓。真心实意的花束，只为客人收到那一刻的欢喜：你若欢喜，我便全矣。
					</span>
				</span>
				</span>
				<p></p>

				<div class="right-1">
					<img src="img/p5.png" style="width: 270px; height: 570px;" />
				</div>
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