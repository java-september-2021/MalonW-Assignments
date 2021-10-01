<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lookify! Song List</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<link rel="stylesheet" type="text/css" href="/css/style.css">
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>

</head>
<body>
<header>
<a href="new">Add New</a>
<a href="/topSongs">Top Songs</a>
<form:form action="/search" method="post" >
<form:input type="text" path="artistName"/>
<button type="submit" class = "btn-secondary">Search</button>
</form:form>
</header>
<div class="container">
<table class="table">
<thead>
	<tr>
		<th>Name</th>
		<th>Rating</th>
		<th>Actions</th>
	</tr>
</thead>
<tbody class="table-info">
	<c:forEach items="${song}" var="song">
	<tr>
		<td><a href="/details"><c:out value="${song.songName}"/></a></td>
		<td><c:out value ="${song.rating}"/></td>
		<td><a href="/delete/${song.id}">Delete</a></td>
	</tr>
	</c:forEach>
</tbody>
</table>
</div>
</body>
</html>