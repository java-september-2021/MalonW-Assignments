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
	<h4><a href ="/catagories/addCat">Add New Category</a></h4>
	<h4><a href ="/products/addProd">Add New Product</a></h4>
	<h4><a href="/home">Home</a></h4>
	<h4><a href="/logout">Logout</a></h4>
</header>
	<hr>
<div class="container">

	<hr>
<div class="row">
	<div class="col">
		<h2><c:out value="${product.name}" /></h2>
		
		<h5>Categories</h5>
			<ul>
				<c:forEach items="${product.categories}" var="cat">
					<li><a href="/categories/details/${cat.id}"><c:out value="${cat.name}" /></a></li>
				</c:forEach>
			</ul>
		<h5>Favorite By:</h5>
		<hr>
		<ul>
			<c:forEach items="${product.userFavorite}" var="user">
				<li><c:out value="${user.firstName} ${user.lastName}" />
			</c:forEach>
		</ul>	
	</div>
	<div class="col">
		<form:form action="/products/addcatProd/{id}" method="post" modelAttribute="product">
		<form:label path = "categories">Add Category to Product</form:label>
		<form:select path="categories">
			<c:forEach items="${notInCat}" var="cat">
			<option value="${cat.id}">${cat.name}</option>
			</c:forEach>
		</form:select>
		<button class ="btn-primary" type="submit">Add</button>
		</form:form>
	</div>
	</div>
</div>

</body>
</html>