<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New Ninja</title>
<link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
<div class="new">
<h2>New Ninja</h2>
<form:form action="/ninjas/createNinja" method="post" modelAttribute="ninja">
	<form:label path="dojo">Select Dojo:</form:label>
	<form:select path="dojo">
		<form:option value="${dojo}">
			<c:out value="${dojo.name }"/>
		</form:option>
	</form:select>
	
	<form:label path="firstName">First Name:</form:label>
	<form:errors path="firstName"/>
	<form:input type="text" path="firstName"/>
	
	<form:label path="lastName">Last Name:</form:label>
	<form:errors pathr="lastName"/>
	<form:input type="text" path="lastName"/>

	<form:label path="age">Age:</form:label>
	<form:errors path="age"/>
	<form:input type="number" path="age"/>
	
	<button type=Submit>Create</button>
	
</form:form>
</div>
</body>
</html>