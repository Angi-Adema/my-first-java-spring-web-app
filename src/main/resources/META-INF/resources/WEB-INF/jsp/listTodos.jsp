<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
<link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css"
	rel="stylesheet">
<title>TODOs List Page</title>

<!-- We can remove the "/META-INF/resources" from the pasted jars -->
<!-- webjars/bootstrap/5.1.3/css/bootstrap.min.css (pasted this above in href) -->
<!-- webjars/bootstrap/5.1.3/js/bootstrap.min.js (moved down below just like for JavaScript script tags) -->
<!-- webjars/jquery/3.6.0/jquery.min.js (moved down below just like for JavaScript script tags) -->

</head>
<body>
	<!-- With bootstrap it is recommended to put all the content of the body in a div tag with a class called "container" -->
	<div class="container">
		<!-- <div>Welcome ${name}</div> (added prior to creating bootstrap container) -->
		<!-- <hr> (added prior to creating bootstrap container) -->
		<h1>Your TODOs:</h1>
		<!-- Bootstrap also has classes for other things like 'table'! -->
		<table class="table">
			<thead>
				<tr>
					<th>id</th>
					<th>Description</th>
					<th>Target Date</th>
					<th>Is Done?</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${todos}" var="todo">
					<tr>
						<td>${todo.id}</td>
						<td>${todo.description}</td>
						<td>${todo.targetDate}</td>
						<td>${todo.done}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
	<script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
	<script src="webjars/jquery/3.6.0/jquery.min.js"></script>

</body>
</html>