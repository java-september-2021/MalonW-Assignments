<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Song Details</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<link rel="stylesheet" type="text/css" href="/css/style.css">
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>

</head>
<body>
<header><a href="/songList">Dashboard</a></header>
<hr>
<h4>Song Name: <c:out value="${song.songName}"/></h4>
<h4>Artist: <c:out value="${song.artistName}"/></h4>
<h4>Rating: <c:out value="${song.rating}"/></h4>
<hr>
<p>
	<form action ="/delete/${song.id}" method="post">
	<input type="hidden" name="_method" value="delete">
	<input type="submit" value="Delete" class="delete">
	</form></p>
</body>
</html>