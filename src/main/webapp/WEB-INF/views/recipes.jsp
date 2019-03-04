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
		<div class="font1">RECIPES</div>
		<form>
			<div class="search">
				<input name="search" /><br>			
				<div class="btn-search">
					<button>Search</button>
				</div>
			</div>
		</form>
		<div class="shop-itemsboard">		
					<c:forEach var="hit" items="${ hits }"> 
						<div style="float:left;width:20%">
							<img class="zoom" src="${ hit.recipe.image }">
							<p><a href="${ hit.recipe.url }">${ hit.recipe.label }</a>
							<input class="heart" type="radio" name="uri" value="${ hit.recipe.uri }"/></p>
						</div>
					</c:forEach>			
					<button class="submit" type="submit">Submit</button>
					<a class="favorites" href="/favorites">favorites</a>
		</div>
		<div class="home">Return <a href="/">home</a>.</div>
	</div>
</body>
</html>