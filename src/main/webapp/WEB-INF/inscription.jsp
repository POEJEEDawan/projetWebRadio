<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<jsp:include page="header.jsp" />


<section id="contact">
	<div class="container">
		<div class="row">
			<div class="col-lg-12 text-center">
				<h2 class="section-heading text-uppercase">Inscription</h2>
				<h3 class="section-subheading text-muted">Lorem ipsum dolor sit
					amet consectetur.</h3>
			</div>
		</div>
		<div class="row">
			<div class="col-lg-12">
				<form id="contactForm" name="sentMessage" novalidate="novalidate"
					method="post" action="">
					<div class="row">
						<div class="col-md-6">
							<div class="form-group">
								<input class="form-control" id="nom" type="text" name="nom"
									placeholder="Your Name *" required="required"
									data-validation-required-message="Please enter your Artistname.">
								<p class="help-block text-danger"></p>
							</div>

							<div class="form-group">
								<input class="form-control" id="email" type="text" name ="email"
									placeholder="Your Email *" required="required"
									data-validation-required-message="Please enter your email address.">
								<p class="help-block text-danger"></p>
							</div>

							<div class="form-group">
								<input class="form-control" id="password" type="password" name="password"
									placeholder="Your password*" required="required"
									data-validation-required-message="Please enter your password.">
								<p class="help-block text-danger"></p>
							</div>
						    
						    <div class="form-group">
						    <input type="submit" name="envoyer" value="valider" class="btn-submit">
							</div>
					<%
	String message = (String) request.getAttribute("message");
    

    String errors = (String) request.getAttribute("errors");
%>
   
	<%if(errors != null){   %>
	   <p class= "alert alert danger"> 
	     <%= errors %> </p>         
<%  } %>  

<%
	if (message != null) {
%>
<p class="text-sucess">
	<%=message%></p>
<%
	}
%>
      
						</div>
					</div>
				</form>
			</div>
		</div>
	</div>
</section>

<jsp:include page="footer.jsp" />