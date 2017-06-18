<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>

	SessionID:<%= session.getId() %><!-- 获取sessionid -->
	<br><br>
	IsNew:<%=session.isNew() %><!-- 是否为新的 -->
	<br><br>
	MaxInactiveInterval:<%= session.getMaxInactiveInterval() %><!-- 保存时间 -->
	<br><br>
	CreateTime:<%= session.getCreationTime() %><!-- 创建时间 -->
	<br><br>
	LastAccessTime:<%= session.getLastAccessedTime() %><!-- 上次访问时间 -->
	<br><br>
	
	Bye:<%= session.getAttribute("username") %>
	<br><br>
	
	<a href="login.jsp">重新登陆</a>
	
	<%
		session.invalidate();//sessionid删除
	%>

</body>
</html>