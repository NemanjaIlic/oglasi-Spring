<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf" %>

<%@ page session="false" %>
<html>
	<head>
		<title>Lista automobila</title>

		<jsp:include page="header.jsp" />
	</head>
	<body>
		<jsp:include page="navigation.jsp" />

		<div class="container p20">
			<table class="table table-bordered">
				<thead>
					<tr>
						<th>#</th>
						<th>Proizvođač</th>
						<th>Model</th>
						<th>Godina proizvodnje</th>
						<th></th>
						<th></th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="automobil" items="${listaAutomobila}" varStatus="brojac">
						<tr>
							<td>${brojac.count}</td>
							<td>${automobil.proizvodjac}</td>
							<td>${automobil.model}</td>
							<td>${automobil.godinaProizvodnje}</td>
							<td><a href="izmena-automobila?id=${automobil.id}"><span class="glyphicon glyphicon-edit" aria-hidden="true"></span></a>
							<td><a href="obrisi-automobil?id=${automobil.id}"><span class="glyphicon glyphicon-remove" aria-hidden="true"></span></a>
						<tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	
		<script>
			$(document).ready(function() {
				$("#oglasi").addClass("active");
			});
		</script>
	</body>
</html>
