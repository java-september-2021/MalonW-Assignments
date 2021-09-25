<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Languages</title>
<link rel="stylesheet" type="text/css" href="/css/style.css">
</head>
<body>
<div class="main">
<table>
	<thead>
		<tr>
			<th>Name</th>
			<th>Creator</th>
			<th>Version</th>
			<th>Action</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${languages }" var = "language">
			<tr>
				<td><a href="/show/${language.id}"><c:out value="${language.languageName }"/></a></td>
				<td><c:out value="${language.creatorName }"/></td>
				<td><c:out value="${language.version }"/></td>
				<td>	<form action="/delete/${language.id}"  method="post">
    						<input type="hidden" name="_method" value="delete">
    						<input type="submit" value="Delete" class="delete">
						</form> | <a href="/edit/${language.id}">Edit</a></td>
			</tr>
		</c:forEach>
	</tbody>	
	
</table>
</div>
<p>
<a href="/new">Enter a New Language</a>
<p>
</body>
</html>