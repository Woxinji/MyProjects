<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<script type="text/javascript" src="js/jquery-1.8.3.js"></script>
<script type="text/javascript">
	$(function() {
	alert("swwwwwwwww");
		$("tr:even").css("background-color", "lightblue");
		$("tr:eq(0)").css("background-color", "lightgreen");
	});
</script>
</head>

<body>
	<form method="get" action="${pageContext.request.contextPath }/f.html">
		<h1>常见问题检索</h1>
		请输入查询的关键字：<input type="text" name="title"> <input
			type="submit" value="查询"> <a
			href="${pageContext.request.contextPath }/add.html">添加常见问题</a>
	</form>
	<c:if test="${empty fList }">
		<center>
			<h1>抱歉${title }</h1>
		</center>
	</c:if>
	<c:if test="${not empty fList }">
		<table cellpadding="0" cellspacing="0" border="1">
			<tr width=400px>
				<th width="10%">编号</th>
				<th width="20%">标题</th>
				<th width="10%">分类</th>
				<th width="10%">创建时间</th>
			</tr>



			<c:forEach var="f" items="${fList}">
				<tr>
					<td>${f.id }</td>
					<td>${f.title }</td>
					<td>${f.cname }</td>
					<td><fmt:formatDate value="${f.createdate }"
							pattern="yyyy-MM-dd" /></td>
				</tr>
			</c:forEach>
			</c:if>

		</table>
</body>
</html>