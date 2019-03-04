<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
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
	<form>
		<input name="search" />
		<button>Search</button>
	</form>
	<form method="post">
	<div>
		<table>	
			<tr><th>Label</th></tr>
			
			<c:forEach var="hit" items="${ hits }"> 
			
				<tr><td><a href="${ hit.recipe.url }">${ hit.recipe.label }</a></td><td><img src="${ hit.recipe.image }" width="20%"></td>
					<td>	
					<input type="radio" name="uri" value="${ hit.recipe.uri }"/>		
					</td>
				</tr>
			
			</c:forEach>
			
		</table>
	</div>
	<button type="submit">submit</button>
	</form>
	<a href="/">Go Home</a>
</body>
</html>