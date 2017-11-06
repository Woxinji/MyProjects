<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'faqadd.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

</head>

<body>
	<form action="${pageContext.request.contextPath }/addC.html">
		<center>
			<h1>常见问题检索</h1>
		</center>
		<center>
			<div>
					<span>供应商：</span>
			<select name="id">
				<c:if test="${cList != null }">
				   <option value="0">--请选择--</option>
				   <c:forEach var="c" items="${cList}">
				   		<option <c:if test="${c.id == id }">selected="selected"</c:if>
				   		value="${c.id}">${c.cname}</option>
				   </c:forEach>
				</c:if>
       		</select>
			</div>
			<div>
				<label for="title">标题：</label> <input type="text"
					name="title" id="title" value=""> <font
					color="red"></font>
			</div>
			<div>
				<label for="content">内容：</label> <input type="text"
					name="content" id="content" value=""> <font
					color="red"></font>
			</div>
		</center>
		<center>
			<input type="submit" value="保存"/>
			<input type="reset" value="重置"/>
			<input type="button" value="放弃" onclick="javascript:history.back();"/>
			
		</center>
	</form>
</body>
</html>
