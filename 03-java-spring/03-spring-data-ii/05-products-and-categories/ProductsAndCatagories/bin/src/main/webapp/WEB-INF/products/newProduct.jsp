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
<header><a href ="/categories/newCat">Add New Category</a></header>
<hr>
<div class="container">
	<h1>New Product</h1>
<form:form class="form-group" action="/products/create" method="post">
	<div class="form-control">
	<form:label path="productName">Name:</form:label>
	<form:errors path="produtName"/>
	<form:input path="productName" type="text"/>
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
	<c:forEach items="#{products}" var="prod">
	<tr class="table-info">
		<td><a href="/products/details/${prod.id}"><c:out ${prod.name}/></a></td>
		<td><c:out ${prod.description}/></td>
		<td><c:out ${prod.price} /></td>
	</tr>
	</c:forEach>
</tbody>
	

</table>
</div>
</body>
</html>