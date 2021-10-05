<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>
<div class = "container">

<h1>New User</h1>
	<div class ="col">
		<div>
			<form:form action="/user/new" method="post" modelAttribute="user">
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
				        <form:textarea path="lastName"  class="form-control"/>
				    </p>
				 </div>
			    <input type="submit" value="Submit"/>
			</form:form>  
		</div> 
				 
				     
		<div>
		<h2>Login</h2>
		<hr>
		<form action = "/login" method = "POST">
		<label for="userToLogin">Please select:</label>
		<select name="userToLogin">
		<c:forEach items="${allUser}" var="user">
			<option value = "${user.id}">${user.firstName}</option>
		</c:forEach>
		</select>
			
			
	 <input type="submit" value="Loggin"/>
		</form>
		</div>  
	</div>
</div>
</body>
</html>
	
        