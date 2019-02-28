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

	<c:forEach var="recipe" items="${ recipes }">

		<div>

			<h3>${recipes.label}</h3>
			<p>
				<img src="${ recipes.image }">
			</p>


		</div>

	</c:forEach>

</body>
</html>