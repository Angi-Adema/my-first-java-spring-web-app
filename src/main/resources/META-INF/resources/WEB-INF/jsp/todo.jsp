<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<html>
<head>
<link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet">
<link href="webjars/bootstrap-datepicker/1.9.0/css/bootstrap-datepicker.standalone.min.css" rel="stylesheet">
<title>Add TODOs Page</title>

</head>
<body>
	<div class="container">
		<h1>Enter TODO Details</h1>
		<!-- We need to use a form to capture the detail of the TODO to be entered in here. -->
		<!-- We tie in Spring Form Library and tie the form here in this Bean to the form details in the POST request seen in the TodoController.java. Ensure name of "todo" matches in both places. -->
		<form:form method="post" modelAttribute="todo">

			<!-- We group all the lines related to a single element in a fieldset. Can add margin since this is HTML -->
			<fieldset class="mb-3">
				<form:label path="description">Description</form:label>
				<form:input type="text" path="description" required="required" />
				<!-- Handle any errors from validation. -->
				<form:errors path="description" cssClass="text-warning" />
			</fieldset>

			<!-- When using the form library, we change name="description" to path="description" -->
			<!-- Description: <form:input type="text" path="description" required="required"/> Get rid of this altogether when we reformat with the form label for description above. -->

			<fieldset class="mb-3">
				<!-- Here we are mapping the targetDate field to the form. -->
				<form:label path="targetDate">Target Date</form:label>
				<form:input type="text" path="targetDate" required="required" />
				<!-- Handle any errors from validation. -->
				<form:errors path="targetDate" cssClass="text-warning" />
			</fieldset>

			<!-- Create variables for done and id. -->
			<form:input type="hidden" path="id" />

			<form:input type="hidden" path="done" />

			<input type="submit" class="btn btn-success" />

		</form:form>
	</div>
	<script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
	<script src="webjars/jquery/3.6.0/jquery.min.js"></script>
	<script src="webjars/bootstrap-datepicker/1.9.0/js/bootstrap-datepicker.min.js"></script>

	<!-- Have the datepicker pop up so the user can select a date. -->
	<script type="text/javascript">
		$('#targetDate').datepicker({
			format : 'mm-dd-yyyy'
		});
	</script>
</body>
</html>

<!-- Brought in by expanding Maven dependencies, choosing bootstrap-datepicker-1.9.0.jar, expand resources and copy qualified name from the js file. Deleted everything prior to webjars. -->
<!-- webjars/bootstrap-datepicker/1.9.0/js/bootstrap-datepicker.min.js   (Inser this into script tac at the bottom of the page. -->
<!-- Brought in by expanding Maven dependencies, choosing bootstrap-datepicker-1.9.0.jar, expand resources and copy qualified name from the css file. Deleted everything prior to webjars. -->
<!-- bootstrap-datepicker/1.9.0/css/bootstrap-datepicker.standalone.min.css  (Insert into a link tag at the top of the page.) -->