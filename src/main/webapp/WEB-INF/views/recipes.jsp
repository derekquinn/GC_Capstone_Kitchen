<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Recipes | MyKitchen</title>
</head>
<body>
	<form>
		<input name="search" />
		<button>Search</button>
	</form>
	<div>
		<table>	
			<tr><th>Label</th></tr>
			<c:forEach var="hit" items="${ hits }"> 
				<tr><td>${ hit.recipe.label }</td><td><img src="${ hit.recipe.image }" width="20%"></td><td></td>
					<td>		
						<form action="/favorite" method="post">
							<button type="submit" name="favorite" value="${ hit.recipe }">FAVORITE</button>
						</form>		
					</td>
				</tr>
			</c:forEach>
		</table>
	</div>
	<a href="/">Go Home</a>
</body>
</html>