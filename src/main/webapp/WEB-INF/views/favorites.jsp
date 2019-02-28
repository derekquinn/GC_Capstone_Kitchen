<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<%@include file="partials/header.jsp" %>
	<c:choose>
		<c:when test="${ not empty profile }">
		<title> ${ profile.firstname }'s Kitchen </title>
		</c:when>
		
		<c:otherwise>
		<title> My Kitchen </title>
		</c:otherwise>
	</c:choose>
</head>
<body>

	<form>

		<input name="search" />

		<button>Search</button>

	</form>
	<div>
	<table>
	
	
	<tr><th>Label</th></tr>
	<c:forEach var="favorite" items="${ favorites }"> 
	
	<tr><td><a href="${ favorite.url }">${ favorite.label }</a></td><td><img src="${ favorite.image }" width="20%"></td><td><button type="submit" name="favorite" value="${ favorite.label }">Favorite</button></td></tr>
		
		
		
		</c:forEach>
	</table>

	</div>

		<a href="/">Go Home</a>
</body>
</html>