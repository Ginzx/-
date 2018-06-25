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
<title>Insert title here</title>
</head>
<body>
<form action="addflower" method="post">
	name:<input id="name" type="text"><br>
	price:<input id="price" type="text"><br>
	type:<input id="type" type="text"><br>
	commentid:<input id="commentID" type="text"><br>
	picture:<input id="picture" type="text">
	<input type="submit" vlaue="1">
	
</form>
</body>
</html>