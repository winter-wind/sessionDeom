<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
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

	<%
		Object username = session.getAttribute("username");
		if(username == null){
			username = "";
		}//这是个判断语句，如果不写username第一次会是一个null
	%>

	<form action="hello.jsp" method="post">
	<!-- action=<%= response.encodeURL("hello.jsp")%> url重写-->
		username:<input type="text" name="username" 
				value="<%= username %>" />
						<!-- 只写这一条语句username的值第一次会是null所以上面要写一个判断语句 -->
			 	 <input type="submit" value="submit"/>
	</form>

</body>
</html>