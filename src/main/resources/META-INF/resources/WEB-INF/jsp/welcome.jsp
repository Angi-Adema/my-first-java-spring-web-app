<!-- Removed the heading part of this file and moved it to header.jspf and included a link here to that file fragment. -->
<%@ include file="common/header.jspf"%>
<!-- Link to access the navbar in the jspf file. -->
<%@ include file="common/navigation.jspf"%>

<div class="container">
	<h1>Welcome ${name}</h1>
	<!-- <hr> (Got rid of <hr> when added the bootstrap container div. -->
	<!-- <div>Your Name: ${name}</div>  Removed this since name is already listed above. -->
	<!--<div>Your Password: ${password}</div>  We decided not to include the password info on the welcome page-->

	<!-- Got rid of the div around this a tag as it is now managed by Spring and bootstrap. -->
	<a href="list-todos">Manage</a> your TODOs

</div>

<!-- Removed the footer portion of the HTML and provided the links here to access the jspf file. -->
<%@ include file="common/footer.jspf"%>
