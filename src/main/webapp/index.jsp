<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<jsp:include page="WEB-INF/header.jsp">
	<jsp:param value="Accueil" name="title" />
</jsp:include>
<!-- Main  -->
<section id="lecteur">
	<div class="container">
		<div class="row">
			<div class="col-lg-12 text-center">
<<<<<<< HEAD
				<div class="cover">
					<img
						src="http://rdironworks.com/wp-content/uploads/2017/12/dummy-200x200.png"
						alt="..." class="img-thumbnail">
=======
		
		 
			<div class="cover">
				<img
					src="http://rdironworks.com/wp-content/uploads/2017/12/dummy-200x200.png"
					alt="..." class="img-thumbnail">
			</div>
			
			<div class="lecteur">


				<audio controls>
					<source src="https://s3.eu-west-3.amazonaws.com/mp3webradio-benjixxx/Lone-Temples.mp3" type="audio/mp3">
				</audio>
				<div class="boutons">
					<div class="play"></div>
					<div class="pause"></div>
>>>>>>> branch 'master' of https://github.com/ProjetWebRadio/projetWebRadio
				</div>
				<div class="lecteur">
					<audio controls>
						<source src='<c:out value="${morceau }"/>' type="audio/mp3">
					</audio>
					<div class="boutons">
						<div class="play"></div>
						<div class="pause"></div>
					</div>
				</div>
				<hr>
			</div>
<<<<<<< HEAD
=======
		<hr>
</div>
>>>>>>> branch 'master' of https://github.com/ProjetWebRadio/projetWebRadio
		</div>
	</div>
</section>
<jsp:include page="WEB-INF/footer.jsp" />