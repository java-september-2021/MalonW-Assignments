<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<link rel="stylesheet" type="text/css" href="/css/style.css">
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>

</head>
<body>
<header>
<h5>
<a href="/new">Add New Song</a>
</h5>
<h5>
<a href="/topSongs">Top Songs</a>
</h5>
<h5>
<a href="/songList">Dashboard</a>
</h5>

<div class="form-group">
<form action="/search">
		<input type="text" placeholder="Search" name="artist">
		<button class="btn-warning" type="submit">Search</button>
		</form>
</div>
</header>
<hr>
<div class="row">

	<table class="table">
<thead>
	<tr>
		<th>Name</th>
		<th>Artist</th>
		<th>Rating</th>
		<th>Action</th>
	</tr>
</thead>
<tbody class="table-info">
	<c:forEach items="${song}" var="song">
	
	<tr>
		<td><a href="/details"><c:out value="${song.songName}"/></a></td>
		<td><c:out value ="${song.artistName}"/></td>
		<td><c:out value ="${song.rating}"/></td>
		<td><form action="/delete/${song.id}"  method="post">
			<input type="hidden" name="_method" value="delete">
			<input type="submit" value="Delete" class="delete"></form></td>
			<td> <a href="/delete/${song.id}">Delete1</a></td>
	</tr>
	</c:forEach>
</tbody>
</table>
</div>
</body>
</html>