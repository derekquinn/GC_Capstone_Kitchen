<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="style.css">
<title> MyKitchen | Registration</title>
</head>
<body>
	<div class="background" id="wood"><br><br>
		<div class="font1">REGISTER</div>
			<form class="user-form" action="/user-registration-result" onsubmit="return validateForm()" method="post"><br>	
			<table style="width:100%;margin:5%">
				<tr>
					<td><label>First Name </label>
					<input type="text" id="firstname" name="firstname"
						placeholder="Steve" pattern="[A-Z][a-z]*" required /></td>
				</tr>
				<tr>	
					<td><label>Last Name</label>
					<input type="text" id="lastname" name="lastname"
						placeholder="Jobs" pattern="[A-Z][a-z]*" required /></td>
				</tr>
				<tr>
					<td><label>Username</label>
					<input id="username" name="username"
						placeholder="chirpus@grandcircus.co" required></td>
				</tr>
				<tr>
					<td><label>Password</label>
					<input type="password" id="password" name="password"
						placeholder="make it secure!" required></td>
				</tr>
				<tr>	
					<td><label>Confirm Password</label>
					<input type="password" id="password2"
						name="confirm-password" required></td>
				</tr>	
			</table>
			<button class="font2" id="submit" type="submit">Submit</button>
		</form>
		<div class="home">Return <a href="/">home</a>.</div>
	</div>
</body>
</html>