<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="/style.css" />
<title>MyKitchen | Login</title>
</head>
<body>
	<div class="background" id="wood"><br><br>
		<div class="font1">Login</div>
		<form class="user-form" action="/user-login" method="post">
			<br><br><br>
			<p>
				<label class="font2" for="username">Email:</label><input name="username" value="${ param.email }" />
			</p>
			<p>
				<label class="font2" for="password">Password:</label><input type="password" name="password" />
			</p>
			<p>
				<button class="font2" id="submit" type="submit">Submit</button>
			</p>
		</form>	
		<div class="home">Return <a href="/">home</a>.</div>
	</div>
</body>
</html>