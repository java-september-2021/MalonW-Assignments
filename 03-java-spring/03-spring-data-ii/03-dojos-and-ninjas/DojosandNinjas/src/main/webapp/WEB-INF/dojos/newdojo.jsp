<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New Dojo</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<link rel="stylesheet" type="text/css" href="/css/style.css">
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
<div class="new">
<a href="/">Dashboard</a>
<a href="/ninjas/new">Register a new Ninja</a>

<h2>New Dojo</h2>

<form:form action="/dojos/createDojo" method="post" modelAttribute="dojo">
	<div class="form-group">
	<form:label path="name">Name:</form:label>
	<form:errors path="name"/>
	<form:input type="text" path="name"/>
	
	<button type="submit" class="btn-primary">Create</button>
	</div>
</form:form>
</div>
<div class="show">
<table class="table">
	<tr class="table-info">
		<th>Locations</th>
		<th>Actions</th>
	</tr>
		<c:forEach items="${dojos}" var="dojo">
	<tr>
		<td><c:out value="${dojo.name}"/></td>
		<td><a href="/dojos/show/${dojo.id}">See Students</a></td>
	</tr>
		</c:forEach>
</table>	
</div>
</body>
</html>