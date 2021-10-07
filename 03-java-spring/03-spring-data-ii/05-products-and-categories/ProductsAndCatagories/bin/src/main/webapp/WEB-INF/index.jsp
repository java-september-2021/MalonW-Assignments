<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Reg/Login</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<link rel="stylesheet" type="text/css" href="/css/style.css">
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>

</head>
<body>
<div class="container">
<h1>User Registration</h1>
	<div class="col">
		<form:form action="/user/new" method="post" modelAttribute="user">
			<div class="form-group row">
				<form:label path="firstName">First Name:</form:label>
				<form:errors path="FirstName"/>
				<form:input path="firstName" class="form-control"/>
			</div>
			<div class="form-group row">
				<form:label path="lastName">Last Name:</form:label>
				<form:errors path="lastName"/>
				<form:input path="lastName" class="form-control"/>
			</div>
			<button class="btn-primary"type="submit">Submit</button>
		</form:form>
	</div> 
	
	<div class="col">
		<form action="login" method="post">
			<label for="userToLogin">Please Select User</label>
			<select name="userToLogin">
				<c:forEach items="${allUsers}" var="user">
					<option value="${user.id}">${user.firstName}</option>
				</c:forEach>
			</select>
			<button class="btn-primary" type="submit">Login</button>
		</form>
	</div>
</div>
</body>
</html>