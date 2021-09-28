<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New Dojo</title>
<link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
<div class="new">
<h2>New Dojo</h2>
<form:form action="/dojos/createDojo" method="post" modelAttribute="ninja">
	<form:label path="name">Name:</form:label>
	<form:errors path="name"/>
	<form:input type="text" path="name"/>
	
	<button type="submit">Create</button>
</form:form>
</div>
</body>
</html>