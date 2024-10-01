<!-- Removed the heading part of this file and moved it to header.jspf and included a link here to that file fragment. -->
<%@ include file="common/header.jspf" %>

<!-- We can remove the "/META-INF/resources" from the pasted jars -->
<!-- webjars/bootstrap/5.1.3/css/bootstrap.min.css (pasted this above in href) -->
<!-- webjars/bootstrap/5.1.3/js/bootstrap.min.js (moved down below just like for JavaScript script tags) -->
<!-- webjars/jquery/3.6.0/jquery.min.js (moved down below just like for JavaScript script tags) -->

<!-- Since we moved out all the bootstrap code for the navigation bar, we have to make a link to the jspf file. -->
<%@ include file="common/navigation.jspf" %>
<!-- With bootstrap it is recommended to put all the content of the body in a div tag with a class called "container" -->
<div class="container">
	<!-- <div>Welcome ${name}</div> (added prior to creating bootstrap container) -->
	<!-- <hr> (added prior to creating bootstrap container) -->
	<h1>Your TODOs:</h1>
	<!-- Bootstrap also has classes for other things like 'table'! -->
	<table class="table">
		<thead>
			<tr>
				<!-- <th>id</th> -->
				<th>Description</th>
				<th>Target Date</th>
				<th>Is Done?</th>
				<th></th>
				<th></th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${todos}" var="todo">
				<tr>
					<!-- <td>${todo.id}</td> -->
					<td>${todo.description}</td>
					<td>${todo.targetDate}</td>
					<td>${todo.done}</td>
					<!-- How do we tell the controller that this is the TODO we want to delete? We make use of query parameter. Have controller handle the delete. -->
					<td><a href="delete-todo?id=${todo.id}" class="btn btn-warning">Delete</a></td>
					<td><a href="update-todo?id=${todo.id}" class="btn btn-success">Update</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<a href="add-todo" class="btn btn-success">Add TODO</a>
</div>

<!-- Removed the footer as it was moved out to the footer.jspf fragment file and the link provided here to access it. -->
<%@ include file="common/footer.jspf" %>


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