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
	<form action="/search" method="get" >
		<input type="text" name="artist" placeholder="Search"/>
		<button type="submit" class = "btn-secondary">Search</button>
	</form>
</header>
<div class="container">
<h1>All Songs</h1>
<hr>
	<table class="table">
		<thead>
			<tr>
				<th scope="col">Name</th>
				<th scope="col">Artist</th>
				<th scope="col">Rating</th>
				<th scope="col">Actions</th>
			</tr>
		</thead>
		<tbody class="table-info">
			<c:forEach items="${allsongs}" var="song">
			<tr>
				<td><a href="/details/${song.id}"><c:out value="${song.songName}"/></a></td>
				<td><c:out value ="${song.artistName}"/></td>
				<td><c:out value ="${song.rating}"/></td>
				<td>
				<form action="/delete/${song.id}" method="post">
				<input type="hidden" name="_method" value="delete">
			<input type="submit" value="Delete" class="delete"></form></td>
			</tr>
			</c:forEach>
		</tbody>
	</table>
</div>
</body>
</html>