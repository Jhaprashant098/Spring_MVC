<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>my name is prashant</h1>
	<h1>this is help page</h1>


	<h1>hello my name is ${name}</h1>
	<h1>id is ${id}</h1>
	<h1>date and time ${time}</h1>

	<hr>
	<c:forEach var="item" items="${l }">
		<h1>
			<%-- <c:out value="${item}" /> --%>
			 <h1>list is = ${item}</h1>
		</h1>
	</c:forEach>
	
	<%-- <%
		String name = (String) request.getAttribute("name");
		Integer id = (Integer) request.getAttribute("id");
		LocalDateTime time = (LocalDateTime) request.getAttribute("time");
	%> --%>

	<%-- <h1>name is =<%=name%></h1>
	<h1>id is =<%=id%></h1>
<h1>time is	=<%=time %></h1>
 --%>
</body>
</html>