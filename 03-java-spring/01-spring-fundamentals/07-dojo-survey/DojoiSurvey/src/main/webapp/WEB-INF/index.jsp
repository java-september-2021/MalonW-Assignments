<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Dojo Survey Index</title>
	<link rel="stylesheet" type="text/css" href="css/style.css">

</head>
<body>
<div class="menu">
<h1>Welcome</h1>
<form action="/result" method="post">
	<label>Your Name: <input type="text" name="name"></label>
	<br>
	<label>Dojo Location: <select name="dojo" >
			<option value = "oakland">Oakland</option>
			<option value= "San Jose">San Jose</option>
			<option value= "online">Online</option>
		</select>
	</label>
	<br>
	<label>Favorite Language: <select name = "language">
			<option value = "html">HTML</option>
			<option value= "python">Python</option>
			<option value = "java">JAVA</option>
		</select>
	</label>
	<br>
<label for="comment">Comments:(optional)</label>
<br>
<textArea name="comment"></textArea><br>
	<button>Submit</button>
</form>
</div>
</body>
</html>