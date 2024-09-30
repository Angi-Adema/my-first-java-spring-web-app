<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
<link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css"
	rel="stylesheet">
<title>Add TODOs Page</title>

</head>
<body>
	<div class="container">
		<h1>Enter TODO Details</h1>
		<!-- We need to use a form to capture the detail of the TODO to be entered in here. -->
		<form method="post">
			Description: <input type="text" name="description" required="required"/>
			<input type="submit" class="btn btn-success"/>
		</form>
	</div>
	<script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
	<script src="webjars/jquery/3.6.0/jquery.min.js"></script>
</body>
</html>