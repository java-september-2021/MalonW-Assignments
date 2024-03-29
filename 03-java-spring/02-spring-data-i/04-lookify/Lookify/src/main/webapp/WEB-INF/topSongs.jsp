<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>  

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Top Songs</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<link rel="stylesheet" type="text/css" href="/css/style.css">
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>

</head>
<body>
<header>
	<a href="new">Add New</a>
	<a href="/songList">Dashboard</a>
</header>
<div class="container">
<h1>Top Songs</h1>
<hr>
<table class="table">
		<thead>
			<tr>
				<th>Name</th>
				<th>Rating</th>
			</tr>
		</thead>
		<tbody>
				<c:forEach items="${song}" var="song">
			<tr class="table-info">
				<td><a href="/details/${song.id}"><c:out value="${song.songName}"/></a></td>
				<td><c:out value ="${song.rating}"/></td>
		</tr>
			</c:forEach>
		</tbody>
	</table>
</div>


</body>
</html>