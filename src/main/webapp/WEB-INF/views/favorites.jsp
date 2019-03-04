<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
	<div>
		<table>	
			<tr><th>Label</th></tr>
			<c:forEach var="favorite" items="${ favorites }"> 	
				<tr><td><a href="${ favorite.recipe.url }">${ favorite.recipe.label }</a></td><td><img src="${ favorite.recipe.image }" width="20%"></td></tr>
			</c:forEach>
		</table>
	</div>
	<a href="/">Go Home</a> | 
	<a href="/recipes">Find Recipes</a>
</body>
</html>