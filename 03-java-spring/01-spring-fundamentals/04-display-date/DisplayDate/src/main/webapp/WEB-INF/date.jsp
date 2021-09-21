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
dateAlert();
</script>

</head>
<body>

 <jsp:useBean id="date" class="java.util.Date"/>
<h1><fmt:formatDate value="${date}" type="date" pattern="E, MMM-dd-yyyy"/></h1>


<p><a href="/">Go Back</a></p>
</body>
</html>