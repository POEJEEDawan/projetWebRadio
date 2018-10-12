<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<jsp:include page="header.jsp" />

<!-- Contact -->
<section id="contact">
	<div class="container">
		<div class="row">
			<div class="col-lg-12 text-center">
				<h2 class="section-heading text-uppercase">Upload</h2>
				<h3 class="section-subheading text-muted">Postez votre morceau</h3>
			</div>
		</div>
		
		<div class="row">
			<div class="col-lg-12">
				<form id="contactForm" name="sentMessage" novalidate="novalidate" method="post" action ="upload">
					<div class="row">
						<div class="col-md-6">
							<div class="form-group">
								<input class="form-control" id="nameArtist" type="text" name ="nomArtiste"
									placeholder="Your Artist name *" required="required"
									data-validation-required-message="Please enter your Artistname.">
								<p class="help-block text-danger"></p>
							</div>
							<div class="form-group">
								<input class="form-control" id="morceau" type="morceau" name="morceau"
									placeholder="Your track *" required="required"
									data-validation-required-message="Send your track ">
								<p class="help-block text-danger"></p>
							</div>
							
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<textarea class="form-control" id="message" name="message"
									placeholder="Your Message *" required="required"
									data-validation-required-message="Please enter a message."></textarea>
								<p class="help-block text-danger"></p>
							</div>
						</div>
						<div class="clearfix"></div>
						<div class="col-lg-12 text-center">
							<div id="success"></div>
							<button id="sendMessageButton"
								class="btn btn-primary btn-xl text-uppercase" type="submit">
								<input type="file" name="nom" />
							</button>
						</div>
					</div>
				</form>
			</div>
		</div>
	</div>
</section>

<jsp:include page="footer.jsp" />