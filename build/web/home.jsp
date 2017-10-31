<%-- 
    Document   : home
    Created on : Sep 23, 2017, 7:05:07 PM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Display</title>
<style>
table#nat{
	width: 50%;
	background-color: #c48ec5;
}
</style>
</head>
<body>  
<% String name =  request.getParameter("fname");
	String Addr = request.getParameter("address");
	String age = request.getParameter("age");
	String Qual = request.getParameter("qual");
	String Persent = request.getParameter("tel");
	String Year = request.getParameter("province"); 
        String doc = request.getParameter("docterId");%>
<table id ="nat">
<tr>
	<td>Full Name</td>
	<td><%= name %></td>
</tr>
<tr>
	<td>Address</td>
	<td><%= Addr %></td>
</tr>
<tr>
	<td>Age</td>
	<td><%= age %></td>
</tr>
<tr>
	<td>Qualification</td>
	<td><%= Qual %></td>
</tr>
<tr>
	<td>Percentage</td>
	<td><%= Persent %></td>
</tr>
<tr>
	<td>Year of Passout</td>
	<td><%= Year %></td>
</tr>
<tr>
	<td>Year of Passout</td>
	<td><%= doc %></td>
</tr>
</table>
</body>
</html>
