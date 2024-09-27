<html>
<head>
<title>Welcome Page</title>
</head>
<body>
	<div class="container">
		<h1>Welcome ${name}</h1>
		<!-- <hr> (Got rid of <hr> when added the bootstrap container div. -->
		<div>Your Name: ${name}</div>
		<!--<div>Your Password: ${password}</div>  We decided not to include the password info on the welcome page-->
		
		<!-- Got rid of the div around this a tag as it is now managed by Spring and bootstrap. -->
		<a href="list-todos">Manage</a> your todos

	</div>
</body>
</html>