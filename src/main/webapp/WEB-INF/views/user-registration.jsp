<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="/style.css" />
<title> MyKitchen | Registration</title>
</head>
<body>
<p>${ message }</p>


	<form action="/user-registration-result" method="post">
		<br>

		<H3>Personal Data</H3>
		<br>
		<table>

			<tr>
				<td><label>First Name </label></td>
				<td><input type="text" id="firstname" name="firstname"
					placeholder="Steve" pattern="[A-Z][a-z]*" required /></td>
				<td><label>Last Name</label></td>
				<td><input type="text" id="lastname" name="lastname"
					placeholder="Jobs" pattern="[A-Z][a-z]*" required /></td>

			</tr>

			<tr>
				<td><label>Username</label></td>
				<td><input id="username" name="username"
					placeholder="chirpus@grandcircus.co" required></td>

			</tr>
			<tr>
				<td><label>Password</label></td>
				<td><input type="password" id="password" name="password"
					placeholder="make it secure!" required></td>
				<td><label>Confirm Password</label></td>
				<td><input type="password" id="password2"
					name="confirm-password" required></td>
			</tr>



		</table>

		<button type="submit">Submit</button>

	</form>



</body>
</html>