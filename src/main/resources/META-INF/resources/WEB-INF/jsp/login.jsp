<html>
<head>
<title>Login Page</title>
</head>
<body>
	<!--Welcome to the login page ${name}!-->
	<!--Prevents the name and password info being passed along with the URL & sends as form data no longer shows in the header of the browser. Change from GET request to POST request-->
	<div class="container">
		<h1>Login</h1>
		<pre>${errorMessage}</pre>
		<form method="post">
			Name: <input type="text" name="name"> Password: <input
				type="password" name="password"> <input type="submit">

		</form>
	</div>
</body>
</html>