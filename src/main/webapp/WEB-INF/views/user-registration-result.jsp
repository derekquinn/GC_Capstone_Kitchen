<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="style.css">
<title>MyKitchen | Thank You</title>
</head>
<body>
	<div class="background" id="wood">
		<%@include file="partials/header.jsp" %>
		<div class="thanks">
			<h1>Thanks.</h1>	
			<p>${user.firstname}, you are registered.</p>
			<p>Return <a href="/">home</a>.</p>
		</div>
	</div>
</body>
</html>