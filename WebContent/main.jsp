<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<div align="center">
<a href="add.jsp">添加航线</a>
<table >
<tr>
<td>航线名称</td>
<td>起飞城市</td>
<td>到达城市</td>
<td>起飞日期</td>
<td>起飞时间</td>
<td>操作</td>
</tr>

<c:forEach items="${list}" var="e">
<tr>
<td>${e.hname}</td>
<td>${e.qcity}</td>
<td>${e.dcity}</td>
<td>${e.hdate}</td>
<td>${e.hsdate}</td>
<td>
<a href="upd.sm?hid=${e.hid}">修改</a>
</td>
</tr>
</c:forEach>
</table>
</div>
</body>
</html>