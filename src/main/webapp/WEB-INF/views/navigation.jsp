<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:if test="${pageContext.request.userPrincipal.name != null}">
   <h2>Welcome : ${pageContext.request.userPrincipal.name}
          | <a href="j_spring_security_logout">Logout</a>
   </h2>
</c:if>

<nav class="navbar navbar-default">
	<div class="container-fluid">
		<!-- Brand and toggle get grouped for better mobile display -->
		<div class="navbar-header">
			<button type="button" class="navbar-toggle collapsed"
				data-toggle="collapse" data-target="#bs-example-navbar-collapse-1"
				aria-expanded="false">
				<span class="sr-only">Toggle navigation</span> <span
					class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>
			<a class="navbar-brand" href="#">Polovni automobili</a>
		</div>

		<div class="collapse navbar-collapse"
			id="bs-example-navbar-collapse-1">
			<ul class="nav navbar-nav">
				<li id="naslovnaStrana"><a href="naslovna-strana">Naslovna strana</a></li>
				<li id="oNama"><a href="o-nama">O nama</a></li>
				<li id="oglasi" class="dropdown"><a href="#" class="dropdown-toggle"
					data-toggle="dropdown" role="button" aria-haspopup="true"
					aria-expanded="false">Oglasi <span class="caret"></span></a>
					<ul class="dropdown-menu">
						<li><a href="dodaj-automobil">Dodaj automobil</a></li>
						<li role="separator" class="divider"></li>
						<li><a href="lista-automobila">Lista automobila</a></li>
					</ul></li>
				<li id="lista-korisnika"><a href="lista-korisnika">Lista Korisnika</a></li>
				<li id="registracija"><a href="dodaj-korisnik">Registruj se</a></li>
				
			</ul>
			<form class="navbar-form navbar-left pull-right">
				<div class="form-group">
					<input type="text" class="form-control" placeholder="Pretraga">
				</div>
				<button type="submit" class="btn btn-default">Pretraži</button>
			</form>
		</div>
	</div>
</nav>