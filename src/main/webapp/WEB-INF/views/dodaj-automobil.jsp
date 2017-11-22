<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf" %>

<%@ page session="false" %>
<html>
	<head>
		<title>Dodaj automobil</title>

		<jsp:include page="header.jsp" />
	</head>
	<body>
		<jsp:include page="navigation.jsp" />

		<div class="container p20">		
			<sf:form class="form-horizontal" modelAttribute="noviAutomobil" action="dodaj-automobil">
				<c:if test="${hasErrors}">
					<div class="alert alert-danger">
						<sf:errors path="*"></sf:errors>
					</div>
				</c:if>
				
				<sf:hidden path="id"></sf:hidden>
			
				<div class="form-group">
					<label for="inputProizvodjac" class="col-sm-2 control-label">Proizvođač</label>
					<div class="col-sm-10">
						<sf:input type="text" class="form-control" path="proizvodjac"
							placeholder="Proizvođač"></sf:input>
					</div>
				</div>
				<div class="form-group">
					<label for="inputModel" class="col-sm-2 control-label">Model</label>
					<div class="col-sm-10">
						<sf:input type="text" class="form-control" path="model"
							placeholder="Model"></sf:input>
					</div>
				</div>
				<div class="form-group">
					<label for="inputGodinaProizvodnje" class="col-sm-2 control-label">Godina proizvodnje</label>
					<div class="col-sm-10">
						<sf:input type="text" class="form-control" path="godinaProizvodnje"
							placeholder="Godina proizvodnje"></sf:input>
					</div>
				</div>
				<div class="form-group">
					<div class="col-sm-offset-2 col-sm-10">
						<div class="checkbox">
							<label> <sf:checkbox path="prviVlasnik" /> Prvi vlasnik
							</label>
						</div>
					</div>
				</div>
				<div class="form-group">
					<div class="col-sm-offset-2 col-sm-10">
						<button type="submit" class="btn btn-default">Dodaj automobil</button>
					</div>
				</div>
			</sf:form>
		</div>
		
		<script>
			$(document).ready(function() {
				$("#oglasi").addClass("active");
			});
		</script>
	</body>
</html>
