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
<div class="col-1 offset-2">
<a href="/new">Add New Song</a>
</div>
<div class="col-2">
<a href="/topSongs">Top Songs</a>
</div>
<div class="col-4 offset-3 form-group">
<form:form action="/search" method ="get">
<form:input type="text" path="search"/>
<form:label path="search"/>
<button class="btn-warning">Search</button>
</form:form>
</div>
</header>
<div class="row">
<h2>Songs By:<c:out value="${artistName}"/></h2>
	<table class="table">
<thead>
	<tr>
		<th>Name</th>
		<th>Rating</th>
		<th>Action</th>
	</tr>
</thead>
<tbody class="table-info">
	<c:forEach items="${song}" var="song">
	<tr>
		<td><a href="/details"><c:out value="${song.songName}"/></a></td>
		<td><c:out value ="${song.rating}"/></td>
		<td><form action="/delete/${song.id}"  method="post">
    						<input type="hidden" name="_method" value="delete">
    						<input type="submit" value="Delete" class="delete"></form></td>
	</tr>
	</c:forEach>
</tbody>
</table>
	
		
		</c:forEach>
	</ul>
</div>
</body>
</html>