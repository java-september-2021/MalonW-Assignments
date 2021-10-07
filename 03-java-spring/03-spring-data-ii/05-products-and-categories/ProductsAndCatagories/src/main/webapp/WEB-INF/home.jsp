<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>  

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<link rel="stylesheet" type="text/css" href="/css/style.css">
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>

</head>
<body>
<header>
<h4><a href ="/categories/addCat">Add New Category</a></h4>
<h4><a href ="/products/addProd">Add New Product</a></h4>
<h4><a href="/logout">Logout</a></h4>
</header>
<hr>
<div class="container">

<hr>
<div class="row">
<div class="col">
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
		<td>
		<c:choose>
		<c:when test="${prod.userFavorite.contains(user)}">
			<a href="/unfavorite/${prod.id}">UnFavorite</a>
		</c:when>
			<c:otherwise>
				<a href="/favorite/${prod.id}">Favorite</a>
			</c:otherwise>
		</c:choose>
		</td>
	</tr>
	</c:forEach>
</tbody>
	

</table>
</div>
</div>
<div class="col">
<h2>Category List</h2>
<hr>
<ul>
	<c:forEach items="${category}" var="cat">
	<li><a href="/categories/details/${cat.id}"><c:out value="${cat.name}" /></a></li>	
	</c:forEach>
</ul>
</div>
</div>
</body>
</html>