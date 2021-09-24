<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>  
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Language</title>
<link rel="stylesheet" type="text/css" href="/css/style.css">
</head>
<body>
<header>
<a href="/{id}/delete">Delete</a>
<a href="/">Dashboard</a>
</header>
<h1>Edit a Language</h1>
<form:form method ="POST" action="/${language.id}/edit" modelAttribute="language">
	<form:label path="languageName">Language Name:</form:label>
	<form:errors path = "languageName"/>
	<form:input type ="text" path="languageName"/>
	<form:label path = "creatorName">Creator Name:</form:label>
	<form:errors path = "creatorName"/>
	<form:input type="text" pathr="creatorName"/>
	<form:label path = "version">Version</form:label>
	<form:errors path = "version"/>
	<form:input type="text" path ="version"/>
	<p><button>Edit Language</button></p>
	</form:form>
</body>
</html>