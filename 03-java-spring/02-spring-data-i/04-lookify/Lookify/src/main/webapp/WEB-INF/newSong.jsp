<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>  

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Song</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<link rel="stylesheet" type="text/css" href="/css/style.css">
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
<header><a href="/songList">Dashboard</a></header>
<h1>Add a Song</h1>
<form:form action="/create" method ="post" modelAttribute="song">
	<div class="form-group">
		<form:label path="songName">Title:</form:label>
		<form:errors path="songName"/>
		<form:input type="text" path="songName"/>
	</div>
	<div class="form-group">
		<form:label path="artistName">Artist:</form:label>
		<form:errors path="artistName"/>
		<form:input type="text" path="artistName"/>
	</div>
	<div class="form-group">
		<form:label path="rating">Rating (1-10):</form:label>
		<form:errors path="rating"/>
		<form:input type="number" path="rating"/>
	</div>
	<button class="btn-secondary">Add Song</button>
</form:form>
</body>
</html>