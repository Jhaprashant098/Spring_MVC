<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home page</title>
</head>
<body>
	<h1>this is home page</h1>
	<h1>called by home ctl</h1>
	<h1>url/home</h1>
	<%
String name=(String)request.getAttribute("name");
Integer id=(Integer)request.getAttribute("id");
List<String> f=(List<String>) request.getAttribute("f");
%>
	<h1>
		name is =<%=name %></h1>
	<h1>
		id is =
		<%=id %></h1>

	<%
for(String ob :f ){
	%>

<h1><%=ob %></h1>
<%
} %>
</body>
</html>