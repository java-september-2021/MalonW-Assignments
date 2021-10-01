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
<h1><c:out value="${song.songName}"/></h1>
<h4><c:out value="${song.artistName}"/></h4>
<h4><c:out value="${song.rating}"/></h4>
<p><a href="/delete/${song.id}">Delete</a></p>
</body>
</html>