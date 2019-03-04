<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="style.css">
	<c:choose>
		<c:when test="${ not empty profile }">
		<title> Recipes | ${ profile.firstname }'s Kitchen </title>
		</c:when>
		<c:otherwise>
		<title> Recipes | My Kitchen </title>
		</c:otherwise>
	</c:choose>
</head>
<body>
	<div class="background" id="wood">
	<%@include file="partials/header.jsp" %>
		<div class="font1">FAVORITES</div>	
			<c:forEach var="hit" items="${ hits }"> 
				<div style="float:left;width:50%">
					<img class="zoom" src="${ hit.recipe.image }">
					<p><a href="${ hit.recipe.url }">${ hit.recipe.label }</a>

				</div>
			</c:forEach>			
		</div>
		<div class="home">Return <a href="/">home</a>.</div>
	</div>
</body>
</html>