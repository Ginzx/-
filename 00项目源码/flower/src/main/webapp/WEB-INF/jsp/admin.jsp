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
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
<meta name="format-detection" content="telephone=no">
<base href="<%=basePath%>">
<title>Bootstrap左右结构响应式后台管理模板</title>
<script src="js/jquery.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<script>
	$(function() {
		$(".meun-item").click(function() {
			$(".meun-item").removeClass("meun-item-active");
			$(this).addClass("meun-item-active");
			var itmeObj = $(".meun-item").find("img");
			itmeObj.each(function() {
				var items = $(this).attr("src");
				items = items.replace("_grey.png", ".png");
				items = items.replace(".png", "_grey.png")
				$(this).attr("src", items);
			});
			var attrObj = $(this).find("img").attr("src");
			;
			attrObj = attrObj.replace("_grey.png", ".png");
			$(this).find("img").attr("src", attrObj);
		});
		$("#topAD").click(function() {
			$("#topA").toggleClass(" glyphicon-triangle-right");
			$("#topA").toggleClass(" glyphicon-triangle-bottom");
		});
		$("#topBD").click(function() {
			$("#topB").toggleClass(" glyphicon-triangle-right");
			$("#topB").toggleClass(" glyphicon-triangle-bottom");
		});
		$("#topCD").click(function() {
			$("#topC").toggleClass(" glyphicon-triangle-right");
			$("#topC").toggleClass(" glyphicon-triangle-bottom");
		});
		$(".toggle-btn").click(function() {
			$("#leftMeun").toggleClass("show");
			$("#rightContent").toggleClass("pd0px");
		})
	})
</script>
<link href="css/bootstrap.min.css" rel="stylesheet">
<link rel="stylesheet" type="text/css" href="css/common.css" />
<link rel="stylesheet" type="text/css" href="css/slide.css" />
<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css" />
<link rel="stylesheet" type="text/css" href="css/flat-ui.min.css" />
<link rel="stylesheet" type="text/css" href="css/jquery.nouislider.css">
</head>

<body>
	<div id="wrap">
		<!-- 左侧菜单栏目块 -->
		<div class="leftMeun" id="leftMeun">
			<div id="logoDiv">
				<p id="logoP">
					<img id="logo" alt="左右结构项目" src="images/logo.png"><span>花语后台管理系统</span>
				</p>
			</div>
			<div id="personInfor">
				<p id="userName">邹博</p>
				<p>
					<a href="#">退出登录</a>
				</p>
			</div>
			<div class="meun-title">查询功能</div>
			<div class="meun-item meun-item-active" href="#sour"
				aria-controls="sour" role="tab" data-toggle="tab">
				<img src="images/icon_source.png">订单查询
			</div>
			<div class="meun-item" href="#char" aria-controls="char" role="tab"
				data-toggle="tab">
				<img src="images/icon_chara_grey.png">用户查询
			</div>
			<div class="meun-item" href="#user" aria-controls="user" role="tab"
				data-toggle="tab">
				<img src="images/icon_user_grey.png">商品查询
			</div>
		</div>
		<!-- 右侧具体内容栏目 -->
		<div id="rightContent">
			<a class="toggle-btn" id="nimei"> <i
				class="glyphicon glyphicon-align-justify"></i>
			</a>
			<!-- Tab panes -->
			<div class="tab-content">
				<!-- 订单管理模块 -->
				<div role="tabpanel" class="tab-pane" id="sour">
					<div class="data-div">
						<!--
                            订单查询中间内容
                            -->
						<table class="table table-striped">
							<thead>
								<tr>
									<th>订单编号</th>
									<th>图片</th>
									<th>订单详情</th>
									<th>总价格</th>
									<th>买家</th>
								</tr>
							</thead>
							<tbody>
								<c:forEach var="orders" items="${orders }">
									<tr>
										<td>${orders.orderid}</td>
										<td><img src="${orders.pictre}" width="100px"
											height="100px"></td>
										<td>${orders.flower}共${orders.number}个</td>

										<td>${orders.price}</td>
										<td>${orders.username}</td>
									</tr>
								</c:forEach>
							</tbody>
						</table>
					</div>
				</div>
				<!-- 用户查询模块 -->
				<div role="tabpanel" class="tab-pane" id="userid">
					<table class="table table-striped">
						<thead>
							<tr>
								<th>用户名称</th>
								<th>用户姓名</th>
								<th>用户性别</th>
								<th>联系方式</th>
								<th>用户地址</th>
								<th>用户介绍</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach var="user" items="${users }">
								<tr>
									<td>${user.username}</td>
									<td>${user.name}</td>
									<td>${user.sex}</td>
									<td>${user.phone}</td>
									<td>${user.address}</td>
									<td>${user.introduction}</td>
								</tr>
							</c:forEach>

						</tbody>
					</table>



				</div>
				<!--商品管理模块-->
				<div role="tabpanel" class="tab-pane  active" id="flower">
					<div class="check-div form-inline">
						<div class="col-xs-3">
							<button class="btn btn-yellow btn-xs" data-toggle="modal"
								data-target="#addUser">添加商品</button>
						</div>
					</div>

					<table class="table table-striped">
						<thead>
							<tr>
								<th>植物编号</th>
								<th>植物名字</th>
								<th>植物照片</th>
								<th>价格</th>
								<th>植物类型</th>
								<th>操作</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach var="flower" items="${flowers }">
								<form action="editflower" method="post">
									<tr>
										<td>${flower.ID}</td>
										<td>${flower.name}</td>
										<td><img src="${flower.picture}" width="100px"
											name="picture" height="100px"></td>
										<td>${flower.price}</td>
										<td>${flower.type}</td>
										<td>
											<button class="btn btn-primary btn-lg" data-toggle="modal"
												data-target="#myModal">修改</button> <!-- 模态框（Modal） -->
											<div class="modal fade" id="${flower.ID}" tabindex="-1"
												role="dialog" aria-labelledby="myModalLabel"
												aria-hidden="true">
												<div class="modal-dialog">
													<div class="modal-content">
														<div class="modal-header">
															<button type="button" class="close" data-dismiss="modal"
																aria-hidden="true">&times;</button>
															<h4 class="modal-title" id="myModalLabel">修改商品</h4>
														</div>
														<div class="modal-body">
															<table width="380px" height="400px" border="0">
																<tr>
																	<td>植物编号：</td>
																	<td><input type="text" name="ID"></td>
																</tr>
																<tr>
																	<td>植物名字：</td>
																	<td><input type="text" name="fname"></td>
																</tr>
																<tr>
																	<td>植物价格：</td>
																	<td><input type="text" name="price"></td>
																</tr>
																<tr>
																	<td>植物类型：</td>
																	<td><input type="text" name="type"></td>
																</tr>

															</table>

														</div>
														<div class="modal-footer">
															<button type="button" class="btn btn-default"
																data-dismiss="modal">关闭</button>
															<button type="submit" class="btn btn-primary">提交更改</button>
														</div>
													</div>
													<!-- /.modal-content -->
												</div>
												<!-- /.modal -->
											</div><a href="deltflower">
											<button class="btn btn-danger btn-xs" data-toggle="modal"
												data-target="#deleteChar"
												style="width: 70px; height: 45px; font-size: 16px; margin-left: 20px;">删除</button>
										</a>
										</td>
									</tr>
								</form>
							</c:forEach>
						</tbody>
					</table>

					<!--弹出添加商品窗口-->
					<div class="modal fade " id="addUser" role="dialog"
						aria-labelledby="gridSystemModalLabel">
						<div class="modal-dialog" role="document">
							<div class="modal-content">
								<div class="modal-header">
									<button type="button" class="close" data-dismiss="modal"
										aria-label="Close">
										<span aria-hidden="true">&times;</span>
									</button>
									<h4 class="modal-title" id="gridSystemModalLabel">添加商品</h4>
								</div>
								<div class="modal-body">
									<div class="container-fluid">
										<form class="form-horizontal">
											<div class="form-group ">
												<label for="sName" class="col-xs-3 control-label">植物编号：</label>
												<div class="col-xs-8 ">
													<input type="email" class="form-control input-sm duiqi"
														id="sName" placeholder="">
												</div>
											</div>
											<div class="form-group">
												<label for="sLink" class="col-xs-3 control-label">植物姓名：</label>
												<div class="col-xs-8 ">
													<input type="" class="form-control input-sm duiqi"
														id="sLink" placeholder="">
												</div>
											</div>
											<div class="form-group">
												<label for="sOrd" class="col-xs-3 control-label">植物照片：</label>
												<div class="col-xs-8">
													<input type="" class="form-control input-sm duiqi"
														id="sOrd" placeholder=""><input type="submit"
														value="上传图片" style="margin-left: 180px; margin-top: 10px;">
												</div>
											</div>
											<div class="form-group">
												<label for="sKnot" class="col-xs-3 control-label">价格：</label>
												<div class="col-xs-8">
													<input type="" class="form-control input-sm duiqi"
														id="sKnot" placeholder="">
												</div>
											</div>
											<div class="form-group">
												<label for="sKnot" class="col-xs-3 control-label">植物类型：</label>
												<div class="col-xs-8">
													<input type="" class="form-control input-sm duiqi"
														id="sKnot" placeholder="">
												</div>

											</div>
										</form>
									</div>
								</div>
								<div class="modal-footer">
									<button type="button" class="btn btn-xs btn-white"
										data-dismiss="modal">取 消</button>
									<button type="button" class="btn btn-xs btn-green">保 存</button>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<script src="js/jquery.nouislider.js"></script>

	<!-- this page specific inline scripts -->
	<script>
		//min/max slider
		function huadong(my, unit, def, max) {
			$(my).noUiSlider(
					{
						range : [ 0, max ],
						start : [ def ],
						handles : 1,
						connect : 'upper',
						slide : function() {
							var val = Math.floor($(this).val());
							$(this).find(".noUi-handle").text(val + unit);
							console.log($(this).find(".noUi-handle").parent()
									.parent().html());
						},
						set : function() {
							var val = Math.floor($(this).val());
							$(this).find(".noUi-handle").text(val + unit);
						}
					});
			$(my).val(def, true);
		}
		huadong('.slider-minmax1', "分钟", "5", 30);
		huadong('.slider-minmax2', "分钟", "6", 15);
		huadong('.slider-minmax3', "分钟", "10", 60);
		huadong('.slider-minmax4', "次", "2", 10);
		huadong('.slider-minmax5', "天", "3", 7);
		huadong('.slider-minmax6', "天", "8", 10);
	</script>
</body>

</html>