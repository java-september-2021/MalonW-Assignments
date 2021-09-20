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
<<<<<<< HEAD
<script type="text/javascript" src="js/app.js"></script>

</head>
<body>
<jsp:useBean id="date" class="java.util.Date"/>
<h1><fmt:formatDate value="${date}" type="date" pattern="E, the dd of MMM, YYYY"/></h1>
=======
<script type="text/javascript" src="js/alerts.js">
dateTime();
</script>

</head>
<body>

 <jsp:useBean id="date" class="java.util.Date"/>
<h1><fmt:formatDate value="${date}" type="date" pattern="E, MMM-dd-yyyy"/></h1>
>>>>>>> e66920ff0a1ce0394049bcc3b1af6761c3bab279


<p><a href="/">Go Back</a></p>
</body>
</html>