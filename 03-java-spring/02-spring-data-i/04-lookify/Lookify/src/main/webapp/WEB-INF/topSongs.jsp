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
	<ul>
	<c:forEach items="${song}" var="song">
	
		<li><a href="/details"><c:out value="${song.songName}"/></a>
		<c:out value ="${song.rating}"/>
		</li>
	</c:forEach>
	</ul>
</div>


</body>
</html>