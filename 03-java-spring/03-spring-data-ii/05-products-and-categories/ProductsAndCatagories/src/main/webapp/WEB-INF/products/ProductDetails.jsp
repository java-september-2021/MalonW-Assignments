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
		<h2><c:out ${product.name}/></h2>
		
		<h5>Categories</h5>
			<ul>
				<c:forEach items="${categories}" var="cat">
					<li><a href="/categories/details/${cat.id}"><c:out ${cat.name} /></a></li>
				</c:forEach>
			</ul>
		<h5>Favorited By:</h5>
		<hr>
		<ul>
			<c:forEach items="${products.favorites}" var="user">
				<li> ${user.firstName} ${user.lastName}
			</c:forEach>
		</ul>	
	</div>
	<div class="col">
		<form:form action="/products/addprodCat/{id}" method="post" ModelAttribute="categoru">
		<form:label path = "product"/>
		<form:select path="product">
			<c:forEach items="${notInCat}" var="cat">
			<option value="${cat.id}">${cat.category}</option>
			</c:forEach>
		</form:select>
		<button class ="btn-primary" type="submit">Add</button>
		</form:form>
	</div>
	</div>
</div>

</body>
</html>