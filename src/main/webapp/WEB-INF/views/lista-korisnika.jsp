<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf" %>

<%@ page session="false" %>
<html>
	<head>
		<title>Lista korisnika</title>

		<jsp:include page="header.jsp" />
	</head>
	<body>
		<jsp:include page="navigation.jsp" />
		


		<div class="container p20">
				<form class="navbar-form" action="pretraga" style="text-align: center;">
				<div class="form-group">
					<input type="text" class="form-control" name="parametar" placeholder="Pretraga">
				</div>
				<button type="submit" class="btn btn-default">Pretraži</button>
			</form>
			<table class="table table-bordered">
				<thead>
					<tr>
						<th>#</th>
						<th>Ime</th>
						<th>Prezime</th>
						<th>Email</th>
						<th></th>
						<th></th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="korisnik" items="${listaKorisnika}" varStatus="brojac">
						<tr>
							<td>${brojac.count}</td>
							<td>${korisnik.ime}</td>
							<td>${korisnik.prezime}</td>
							<td>${korisnik.email}</td>
							<td><a href="izmena-korisnika?id=${korisnik.id}"><span class="glyphicon glyphicon-edit" aria-hidden="true"></span></a>
							<td><a href="obrisi-korisnika?id=${korisnik.id}"><span class="glyphicon glyphicon-remove" aria-hidden="true"></span></a>
						<tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</body>
</html>
