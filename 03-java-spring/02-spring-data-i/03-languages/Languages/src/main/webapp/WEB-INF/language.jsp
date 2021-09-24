<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title><c:out "${language.id }/></title>
<link rel="stylesheet" type="text/css" href="/css/style.css">
</head>
<body>
<header><a href="/">Dashboard</a></header>
<div class="show">
<label name="languageName">Language Name: <c:out "${language.languageName }"/></label>
<label name = "creatorName">Creator Name: <c:out "${language.creatorName }/></label>
<label name = "version">Version: <c:out "${language.version }/></label>

<p>
<a href ="/{id}/edit">Edit</a>
</p>
<p>
<a href="/{id}/delete">Delete</a>
</div>
</body>
</html>