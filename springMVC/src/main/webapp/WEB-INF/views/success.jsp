<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>success</title>
</head>
<body>
<%-- <h1>your email is ${email}</h1>
<h1>password is ${pwd}</h1> --%>
<h1 class="text-center">${ Header}</h1>
	<p class="text-center">${desc }</p>
	
	<hr>
<h1>your email is ${userData.email}</h1>
<h1>password is ${userData.pwd}</h1> 

</body>
</html>