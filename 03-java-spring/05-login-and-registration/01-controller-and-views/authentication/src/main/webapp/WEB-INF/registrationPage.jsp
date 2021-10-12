<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>    
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Registration/Login Page</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css" integrity="sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU" crossorigin="anonymous">
<link rel="stylesheet" type="text/css" href="/css/style.css">
<meta charset="ISO-8859-1">
</head>
<body>
<div class="container">
    <h1>Register!</h1>
    
    <p><form:errors path="user.*"/></p>
    <div class="form-group">
	    <form:form method="POST" action="/registration" modelAttribute="user">
 		<div class = "form-group row">		
			<p>
		        <form:label path="firstName">First Name</form:label>
		        <form:errors path="firstName"/>
		        <form:input path="firstName" class="form-control"/>
		    </p>
		 </div>
		 <div class = "form-group row">
		    <p>
		        <form:label path="lastName">Last Name</form:label>
		        <form:errors path="lastName"/>
		        <form:input path="lastName"  class="form-control"/>
		    </p>
		 </div>
	    	<div class = "form-group row">
	        <p>
	            <form:label path="email">Email:</form:label>
	            <form:errors path="email"/>
	            <form:input class="form-control" type="email" path="email"/>
	        </p>
	        </div>
	        <div class = "form-group row">
	        <p>
	            <form:label path="password">Password:</form:label>
	            <form:errors path="password"/>
	            <form:password class="form-control" path="password"/>
	        </p>
	        </div>
	        <div class = "form-group row">
	        <p>
	            <form:label path="passwordConfirmation">Password Confirmation:</form:label>
	            <form:errors path="passwordConfirmation"/>
	            <form:password class="form-control" path="passwordConfirmation"/>
	        </p>
	        <input class="btn-secondary" type="submit" value="Register!"/>
	    	</div>
   	</form:form>
    </div>
    <div class="column">
    	<h1>Login</h1>
	<p>${loginError}</p>
	<div class="form-group">
	<form method="post" action="/login" >
		<p>
			<label for="email">Email</label>
			<input type="text" id="email" name="emal"/>
		</p>	
		<p>
			<label for="password">Password</label>
			<input type="password" id="password" name="password" />
		</p>
		<input type="submit" value="Login!" class="btn-secondary" />
	</form>
	</div>
</div>
</div>
</body>
</html>
