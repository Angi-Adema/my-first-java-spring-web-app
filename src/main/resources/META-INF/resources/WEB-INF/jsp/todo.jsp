<!-- Removed the heading part of this file and moved it to header.jspf and included a link here to that file fragment. -->
<%@ include file="common/header.jspf" %>
<!-- Link to access the navbar in the jspf file. -->
<%@ include file="common/navigation.jspf" %>

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

	<!-- We don't want this copied in every file so we put this part of the footer back here in this file. Also included the reference tag to the jspf file. -->
	<%@ include file="common/footer.jspf"%>
	
	<script type="text/javascript">
		$('#targetDate').datepicker({
			format : 'mm-dd-yyyy'
		});
	</script>


<!-- Brought in by expanding Maven dependencies, choosing bootstrap-datepicker-1.9.0.jar, expand resources and copy qualified name from the js file. Deleted everything prior to webjars. -->
<!-- webjars/bootstrap-datepicker/1.9.0/js/bootstrap-datepicker.min.js   (Inser this into script tac at the bottom of the page. -->
<!-- Brought in by expanding Maven dependencies, choosing bootstrap-datepicker-1.9.0.jar, expand resources and copy qualified name from the css file. Deleted everything prior to webjars. -->
<!-- bootstrap-datepicker/1.9.0/css/bootstrap-datepicker.standalone.min.css  (Insert into a link tag at the top of the page.) -->

<!-- Moved the navigation out of here to put into the jsp fragment navigation.jspf -->
	<!-- <nav class="navbar navbar-expand-md navbar-light bg-light mb-3 p-1"> -->
		<!--<a class="navbar-brand m-1" href="https://courses.in28minutes.com">in28Minutes</a>-->
		<!--<div class="collapse navbar-collapse">-->
			<!--<ul class="navbar-nav">-->
				<!--<li class="nav-item"><a class="nav-link" href="/">Home</a></li>-->
				<!--<li class="nav-item"><a class="nav-link" href="/list-todos">Todos</a></li>-->
			<!--</ul>-->
		<!--</div>-->
		<!--<ul class="navbar-nav">-->
			<!--<li class="nav-item"><a class="nav-link" href="/logout">Logout</a></li>-->
		<!--</ul>-->
	<!--</nav>-->