<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Dojo Page</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<link rel="stylesheet" type="text/css" href="/css/style.css">
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
<header>
<a href="/">Dashboard</a>
<a href="/dojos/new">Enter a New Dojo</a>
<a href="/ninjas/new">Enter a New Student</a>
</header>
<h1><c:out value="${dojo.name}"/></h1>
<hr>
<div class="show">
<table class = "table">
	<thead>
		<tr>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Age</th>
		</tr>
	</thead>
	<tbody >
	
		<c:forEach items="${dojo.ninjas}" var="ninja">
		<tr class="table-info">
			<td><c:out value="${ninja.firstName}"/></td>
			<td><c:out value="${ninja.lastName}"/></td>
			<td><c:out value="${ninja.age}"/></td>
		</tr>
		</c:forEach>
	
	</tbody>				
</table>
</div>
</body>
</html>