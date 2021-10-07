<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>  

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New Product</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<link rel="stylesheet" type="text/css" href="/css/style.css">
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>

</head>
<body>
<header><h4><a href ="/categories/addCat">Add New Category</a></h4>
<h4><a href="/home">Home</a></h4>
<h4><a href="/logout">Logout</a></h4>	
</header>
<hr>
<div class="container">
	<h1>New Product</h1>
<form:form action="/products/create" method="post" modelAttribute="product" >
	<div class="form-group">
	<form:label path="name" >Name:</form:label>
	<form:errors path="name" />
	<form:input path="name" type="text"/>
	</div>
	<div class="form-group">
	<form:label path="description" >Description:</form:label>
	<form:errors path="description" />
	<form:input path="description" type="textbox"/>
	</div>
	<div class="form-group">
	<form:label path="price" >Price $:</form:label>
	<form:errors path="price" />
	<form:input path="price" type="number"/>
	</div>
	
	
	<button class ="btn btn-primary" type="submit">Create</button>
</form:form>
</div>
<hr>
<div class="ProductList">
<h2>Product List</h2>
<table class="table">
<thead>
	<tr>
		<th>Product Name</th>
		<th>Description</th>
		<th>Price (US $)</th>
	</tr>
</thead>
<tbody>
	<c:forEach items="${products}" var="prod">
	<tr class="table-info">
		<td><a href="/products/details/${prod.id}"><c:out value="${prod.name}" /></a></td>
		<td><c:out value="${prod.description}" /></td>
		<td><c:out value="${prod.price}" /></td>
	</tr>
	</c:forEach>
</tbody>
	

</table>
</div>
</body>
</html>