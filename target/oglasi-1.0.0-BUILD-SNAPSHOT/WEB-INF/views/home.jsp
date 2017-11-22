<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf" %>

<%@ page session="false" %>
<html>
	<head>
		<title>Naslovna strana</title>
		
		<jsp:include page="header.jsp" />
	</head>
	<body>
		<jsp:include page="navigation.jsp" />

		<div class="container p20">
			<div class="jumbotron">				
				<div class="text-center">
					<h1>POLOVNI AUTOMOBILI</h1>
				
					<img alt="Polovni automobili" src="resources/img/mazda3.png" width="400" />
				</div>
				<p class="text-justify">
					Cilj kursa je razvoj web aplikacije koja predstavlja katalog oglasa za prodaju polovnih automobila.
					Nakon završenog kursa student bi trebalo da ovlada najznačajnijim konceptima razvoja kompleksnih Java web 
					aplikacija sa kojima bi se upoznao tokom izrade projekta u obliku realne Spring MVC web aplikacije.
				</p>
				<div>
					<p class="pull-right"><a class="btn btn-primary btn-lg" href="o-nama" role="button">Saznajte više</a></p>
					<p class="clearfix"></p>
				</div>
			</div>
		</div>
		
		<script>
			$(document).ready(function() {
				$("#naslovnaStrana").addClass("active");
			});
		</script>
	</body>
</html>
