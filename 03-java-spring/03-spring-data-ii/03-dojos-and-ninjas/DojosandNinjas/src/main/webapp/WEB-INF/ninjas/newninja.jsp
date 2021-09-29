<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New Ninja</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<link rel="stylesheet" type="text/css" href="/css/style.css">
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>

</head>
<body>
<header>
<a href="/">Dashboard</a>
<a href="/dojos/new">Enter a new Dojo</a>
</header>
<div class="new">
<h2>New Ninja</h2>
<form:form action="/ninjas/createNinja" method="post" modelAttribute="ninja">
	<form:label path="dojo">Select Dojo:</form:label>
	<form:select path="dojo">
	<c:forEach items="${dojo}" var="dojo">
		<option value="${dojo.id}">${dojo.name}</option>
		</c:forEach>
	</form:select>
	<div class="form-group">
	<form:label path="firstName">First Name:</form:label>
	<form:errors path="firstName"/>
	<form:input type="text" path="firstName"/>
	</div>
	<div class="form-group">
	<form:label path="lastName">Last Name:</form:label>
	<form:errors pathr="lastName"/>
	<form:input type="text" path="lastName"/>
	</div>
	<div class="form-group">
	<form:label path="age">Age:</form:label>
	<form:errors path="age"/>
	<form:input type="number" path="age"/>
	</div>
	
	<button type=Submit class="btn-primary">Create</button>
	
</form:form>
</div>
</body>
</html>