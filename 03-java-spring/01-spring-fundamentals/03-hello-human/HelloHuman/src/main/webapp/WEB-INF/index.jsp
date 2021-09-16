<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang ="en">
<head>

<meta charset="UTF-8">
<title>USER</title>

</head>
<body>
    <h1>User Info</h1>

	<!--  Displays key value pairs from back end -->
    <p>First Name:<c:out value="${first}"/></p>
	<p>Last Name:<c:out value="${last}"/></p>
	<p>Email: <c:out value="${email}"/></p>
	<p>Age: <c:out value="${age }"/></p>




</body>
</html>