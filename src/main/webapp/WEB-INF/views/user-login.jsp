<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>MyKitchen | Login</title>


</head>


<body>

	<h1>Login</h1>

	<p class="message">${ message }</p>
  <div class="form-group">
	<form action="/user-login" method="post">
		<p>
			<label for="username">Email:</label> <input class="form-control" id="username"
				name="username" value="${ param.email }" />
		</p>
		<p>
			<label for="password">Password:</label> <input class="form-control" id="password"
				type="password" name="password" />
		</p>
		<p>
			<button>Submit</button>
		</p>
	</form>
	
	<a href="/">Go Home</a>
	</div>
	

</body>
</html>