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
	<h1>WTF!!!!</h1>
		<input name="search" />

		<button>Search</button>

	</form>
	<div>
	

	
	<table>
	
	
	<tr><th>Label</th></tr>

	
	<tr><td>${ recipe.label }</td><td><img src="${ recipe.image }" width="20%"></td><td><button type="submit" name="favorite" value="${ recipe.uri }">Favorite</button></td></tr>
		
		
		

	</table>

	</div>

		<a href="/">Go Home</a>


</body>
</html>