<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>  

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New Category</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<link rel="stylesheet" type="text/css" href="/css/style.css">
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>

</head>
<body>
<header><a href ="/products/newProd">Add New Product</a></header>
<hr>
<div class="container">
	<h1>New Category</h1>
<form:form class="form-group" action="/categories/create" method="post">
	<div class="form-control">
	<form:label path="productName">Name:</form:label>
	<form:errors path="produtName"/>
	<form:input path="productName" type="text"/>
	</div>
	<button class ="btn btn-primary" type="submit">Create</button>
</form:form>
</div>
<hr>
<div class="categoryList">
<h2>Category List</h2>
<hr>
<ul>
	<c:forEach items="${categories}" var="cat">
	<li><c:out ${cat.name} /></li>	
	</c:forEach>
</ul>
<</div>
</body>
</html>