<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

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

<a href = "/recipes">Recipes</a>

</div>


</body>
</html>