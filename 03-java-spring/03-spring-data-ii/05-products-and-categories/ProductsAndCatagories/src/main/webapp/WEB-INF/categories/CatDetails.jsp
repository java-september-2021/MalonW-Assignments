<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>  

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Product Page</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<link rel="stylesheet" type="text/css" href="/css/style.css">
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>

</head>
<body>
<header>
	<h3><a href ="/catagories/addCat">Add New Category</a></h3>
	<h3><a href ="/products/addProd">Add New Product</a></h3>
</header>
	<hr>
<div class="container">

	<hr>
<div class="row">
	<div class="col">
		<h2><c:out ${category.name}/></h2>
		<h5>Products</h5>
			<ul>
				<c:forEach items="${products}" var="prod">
					<li><c:out ${prod.name} /></li>
				</c:forEach>
			</ul>
	</div>
	<div class="col">
		<form:form action="/categories/addCatToProd/{id}" method="post" ModelAttribute="categoru">
		<form:label path = "product"/>
		<form:select path="product">
			<c:forEach items="${notInProduct}" var="prod">
			<option value="${prod.id}">${prod.name}</option>
			</c:forEach>
		</form:select>
		<button class ="btn-primary" type="submit">Add</button>
		</form:form>
	</div>
	</div>
</div>

</body>
</html>