<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
<<<<<<< HEAD
    pageEncoding="ISO-8859-1" import="java.util.Date" import="java.time"%>
=======
    pageEncoding="ISO-8859-1" import="java.util.Date"%>
>>>>>>> e66920ff0a1ce0394049bcc3b1af6761c3bab279
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
=======
<script type="text/javascript" src="js/alerts.js">
timeAlert();
</script>
>>>>>>> e66920ff0a1ce0394049bcc3b1af6761c3bab279

</head>
<body>
<jsp:useBean id="date" class="java.util.Date"/>
<<<<<<< HEAD
<p>	<fmt:formatDate value="${date}" type="date" pattern="HH:mm:ss"/>
=======
<h2>	<fmt:formatDate value="${date}" type="date" pattern="HH:mm a"/></h2>

<p><a href="/">Go Back</a></p>
>>>>>>> e66920ff0a1ce0394049bcc3b1af6761c3bab279

</body>
</html>