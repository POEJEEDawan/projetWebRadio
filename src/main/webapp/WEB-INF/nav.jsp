<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>



<section id="nav">
<div class="row">
<div class="col-12 col-md-2">
		<div class="navbar navbar-inverse navbar-fixed-top">
			<div class="navbar-inner">
				<div class="media">
					<img
						src="http://rdironworks.com/wp-content/uploads/2017/12/dummy-200x200.png"
						alt="..." class="img-thumbnail">
				</div>
			</div>
		</div>
	</div>

	<div class="col-12 col-md-10">

		<nav class="navbar navbar-expand-lg navbar-light bg-light">

			<div class="collapse navbar-collapse" id="navbarTogglerDemo02">
				<ul class="navbar-nav mr-auto mt-2 mt-lg-0">
					<li class="nav-item active"><a class="nav-link" href="index.jsp">Home
					</a></li>
					<li class="nav-item"><a class="nav-link" href="artiste">Artiste</a></li>
					<li class="nav-item"><a class="nav-link" href="upload">Upload</a></li>
				    <li class="nav-item"><a class="nav-link" href="inscription">Inscription</a></li>
				</ul>
				 
				<form class="form-inline my-2 my-lg-0">
					<input class="form-control mr-sm-1" type="search" 
						placeholder="recherche artiste">
					<button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
			
				</form>
			     
			      <i class="fa fa-user" aria-hidden="true" align="center"><c:if test="${ !empty sessionScope.nom }">
                  <p> ${sessionScope.nom } ! connecté </p>
                  <a class="nav-link" href="deconnexion ">Déconnexion</a>
                  </c:if>
                  <c:if test="${ empty sessionScope.nom }">
                  <a class="nav-link" href="connexion ">Connexion</a>
                  </c:if>
                  </i>
			 
			</div>
		</nav>
</div>
	</div>
	</section>