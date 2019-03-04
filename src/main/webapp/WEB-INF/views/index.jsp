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
		<title> ${ profile.firstname }'s Kitchen </title>
		</c:when>
		<c:otherwise>
		<title> My Kitchen </title>
		</c:otherwise>
	</c:choose>
</head>
<body>
	<div class="background" id="wood">
		<div class="overlay">
			<h2 id="greeting">Hello ${ profile.firstname }<br> Welcome to the Kitchen! <%@include file="partials/header.jsp" %></h2>
			<h1 id="home-recipes"><a href="/recipes">Recipes</a></h1>
	  		<h1 id="home-favorites"><a href="/favorites">Favorites</a></h1>
		</div>
	</div>
</body>
</html>