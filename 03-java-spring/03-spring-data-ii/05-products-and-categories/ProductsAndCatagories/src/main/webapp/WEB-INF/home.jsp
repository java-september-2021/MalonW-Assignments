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
<h3><a href ="/catagories/addCat">Add New Category</a></h3>
<h3><a href ="/products/addProd">Add New Product</a></h3>
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
		<th>Favorite</th>
	</tr>
</thead>
<tbody>
	<c:forEach items="#{products}" var="prod">
	<tr class="table-info">
		<td><a href="/products/details/${prod.id}"><c:out ${prod.name}/></a></td>
		<td><c:out ${prod.description}/></td>
		<td><c:out ${prod.price} /></td>
		<td><c:choose>
		<c:when test="${prod.userFavorite.contains(user}">
		<a href="/favorite/${prod.id}">Favorite</a>
		</c:when>
		<c:otherwise>
		<a href="/unfavorite/${prod.id}">UnFavorite</a>
		</c:otherwise>
		</c:choose>
		Number of Favorites=<c:out value="${prod.userFavorite.size()}"/></td>		
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
	<c:forEach items="${categories}" var="cat">
	<li><c:out ${cat.name} /></li>	
	</c:forEach>
</ul>
</div>
</div>
</body>
</html>