<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.Date"%>
    <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Date</title>
<link rel="stylesheet" type="text/css" href="css/style.css">
<script type="text/javascript" src="js/alerts.js">
timeAlert();
</script>

</head>
<body>
<jsp:useBean id="date" class="java.util.Date"/>
<h2>	<fmt:formatDate value="${date}" type="date" pattern="HH:mm a"/></h2>

<p><a href="/">Go Back</a></p>

</body>
</html>