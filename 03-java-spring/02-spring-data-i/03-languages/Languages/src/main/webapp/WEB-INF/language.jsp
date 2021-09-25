<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Language</title>
<link rel="stylesheet" type="text/css" href="/css/style.css">
</head>
<body>
<header><a href="/">Main Page</a></header>
<div class="show">
<h1><c:out value="${language.languageName}"/></h1>
<p>Creator Name: <c:out value= "${language.creatorName }" /></p>
<p>Version: <c:out value="${language.version }" /></p>
<p>
<a href ="/edit/${id}">Edit</a>
</p>
<p>
<a href="/delete/${id}">Delete</a>
</div>
</body>
</html>