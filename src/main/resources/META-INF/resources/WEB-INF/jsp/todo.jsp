<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>


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
		<!-- We tie in Spring Form Library and tie the form here in this Bean to the form details in the POST request seen in the TodoController.java. Ensure name of "todo" matches in both places. -->
		<form:form method="post" modelAttribute="todo">
			<!-- When using the form library, we change name="description" to path="description" -->
			Description: <form:input type="text" path="description" required="required"/>
			<!-- Create variables for done and id. -->
			<form:input type="hidden" path="id"/>
			<form:input type="hidden" path="done"/>
			<input type="submit" class="btn btn-success"/>
		</form:form>
	</div>
	<script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
	<script src="webjars/jquery/3.6.0/jquery.min.js"></script>
</body>
</html>