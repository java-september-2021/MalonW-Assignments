<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Times Visited</title>
<link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
<p> You have visited <a href = "/">This Site</a> <c:out value="${countToShow}"  /> times</p>
<a href="/">Test another Visit?</a>
</body>
</html>