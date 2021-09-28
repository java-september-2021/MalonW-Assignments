<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Dojo Page</title>
<link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
<div class="show">
<table>
	<thead>
		<tr>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Age</th>
		</tr>
	</thead>
	<tbody>
	<c:if test="${dojo_id == dojo.id }"> 
		<c:forEach items="${ninjas }" var="ninja">
		<tr>
			<td><c:out value="${ninja.firstName }"/></td>
			<td><c:out value="${ninja.lastName }"/></td>
			<td><c:out value="${ninja.age }"/></td>
		</tr>
		</c:forEach>
	</c:if>
	</tbody>				
</table>
</div>
</body>
</html>