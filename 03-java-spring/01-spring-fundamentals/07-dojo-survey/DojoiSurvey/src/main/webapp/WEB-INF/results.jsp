<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Dojo Survey Results</title>
	<link rel="stylesheet" type="text/css" href="css/style.css">
	

</head>
<body>
<div class="menu">
<h2>Submitted Info:</h2>
<label>Name: <c:out value = "${name }" /></label>
<label>Dojo Location: <c:out value = "${dojo}" /></label>
<label>Favorite Language: <c:out value = "${language}" /></label>
<label>Comment: <c:out value ="${comment}" /></label>
</div>
</body>
</html>