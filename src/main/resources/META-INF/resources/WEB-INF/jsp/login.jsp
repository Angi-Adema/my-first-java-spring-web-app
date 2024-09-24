<html>
	<head>
		<title> Login </title>
	</head>
	<body>
		<!--Welcome to the login page ${name}!-->
		Welcome to the login page!   <!--Prevents the name and password info being passed along with the URL & sends as form data no longer shows in the header of the browser. Change from GET request to POST request-->
		<form method="post">
			Name: <input type="text" name="name">
			Password: <input type="password" name="password">
			<input type="submit">
		
		</form>
		
	</body>
</html>