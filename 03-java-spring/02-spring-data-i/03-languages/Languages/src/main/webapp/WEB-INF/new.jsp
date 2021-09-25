<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Enter a New Language</title>
<link rel="stylesheet" type="text/css" href="/css/style.css">
</head>
<body>
<header><a href="/">Main Page</a></header>
<div class="create">
<h3>Enter a New Language</h3>
<form:form action="create" method="POST" modelAttribute="language">
	<form:label path="languageName">Language Name:</form:label>
	<form:errors path="languageName"/>
	<form:input type="text" path="languageName"/>
	<br>
	<form:label path="creatorName">Language Creator:</form:label>
	<form:errors path="creatorName"/>
	<form:input type="text" path="creatorName"/>
	<br>
	<form:label path="version">Version:</form:label>
	<form:errors path="version"/>
	<form:input type="text" path="version"/>
	<br>
	<p><button>Submit</button></p>
</form:form>
</div>
</body>
</html>