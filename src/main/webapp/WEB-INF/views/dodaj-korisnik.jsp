<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf" %>

<%@ page session="false" %>
<html>
	<head>
		<title>Dodaj korisnika</title>

		<jsp:include page="header.jsp" />
	</head>
	<body>
		<jsp:include page="navigation.jsp" />

		<div class="container p20">		
			<sf:form class="form-horizontal" modelAttribute="noviKorisnik" action="dodaj-korisnik">
				<c:if test="${hasErrors}">
					<div class="alert alert-danger">
						<sf:errors path="*"></sf:errors>
					</div>
				</c:if>
				
				<sf:hidden path="id"></sf:hidden>
			
				<div class="form-group">
					<label for="inputIme" class="col-sm-2 control-label">Ime</label>
					<div class="col-sm-10">
						<sf:input type="text" class="form-control" path="ime"
							placeholder="Ime"></sf:input>
					</div>
				</div>
				<div class="form-group">
					<label for="inputPrezime" class="col-sm-2 control-label">Prezime</label>
					<div class="col-sm-10">
						<sf:input type="text" class="form-control" path="prezime"
							placeholder="Prezime"></sf:input>
					</div>
				</div>
				<div class="form-group">
					<label for="inputEmail" class="col-sm-2 control-label">Email</label>
					<div class="col-sm-10">
						<sf:input type="text" class="form-control" path="email"
							placeholder="Email"></sf:input>
					</div>
				</div>
				<div class="form-group">
					<div class="col-sm-offset-2 col-sm-10">
						<button type="submit" class="btn btn-default">Dodaj korisnika</button>
					</div>
				</div>
			</sf:form>
		</div>
	</body>
</html>
