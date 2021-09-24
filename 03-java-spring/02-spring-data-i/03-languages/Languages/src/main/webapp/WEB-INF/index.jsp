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
				<td><a href="/show/{id}"><c:out value="${languages.languageName }"/></a></td>
				<td><c:out value="${languages.creatorName }"/></td>
				<td><c:out value="${languages.version }"/></td>
				<td><a href="/{id}/delete/">Delete</a>|<a href="/{id}/edit">Edit</a></td>
			</tr>
		</c:forEach>
	</tbody>	
	
</table>
<h1>New Language</h1>
<form:form action="/create" method="POST" modelAttribute="language">
	<form:label path="languageName">Language Name:<form:errors path="languageName"/><form:input type="text"name="languageName"/></form:label>
	<form:label path="creatorName">Language Creator:<form:errors path="creatorName"/><form:input type="text" name="creatorName"/></form:label>
	<form:label path="version">Version:<form:errors path="version"/><form:input type="text" name="version"/></form:label>
<form:input type="submit" value="Submit"/>
</form:form>
</body>
</html>