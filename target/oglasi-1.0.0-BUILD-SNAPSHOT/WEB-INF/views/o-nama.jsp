<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf" %>

<%@ page session="false" %>
<html>
	<head>
		<title>O nama</title>

		<jsp:include page="header.jsp" />
	</head>
	<body>
		<jsp:include page="navigation.jsp" />

		<div class="container p20">
			<div class="panel panel-default">
				<div class="panel-heading">O nama</div>
				<div class="panel-body">
					<p class="text-justify">
						Cilj kursa je razvoj web aplikacije koja predstavlja katalog oglasa za prodaju polovnih automobila.
						Nakon završenog kursa student bi trebalo da ovlada najznačajnijim konceptima razvoja kompleksnih Java web 
						aplikacija sa kojima bi se upoznao tokom izrade projekta u obliku realne Spring MVC web aplikacije.
					</p>
				</div>
			</div>
		</div>
		
		<script>
			$(document).ready(function() {
				$("#oNama").addClass("active");
			});
		</script>
	</body>
</html>
