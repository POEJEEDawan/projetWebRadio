package fr.dawan.webRadio.controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.dawan.webRadio.model.Utilisateur;

/**
 * Servlet implementation class Inscription
 */
@WebServlet("/inscription")
public class Inscription extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Inscription() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		request.getRequestDispatcher("WEB-INF/inscription.jsp").forward(request, response);

	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Utilisateur utilisateur = new Utilisateur(request.getParameter("nom"));
		request.setAttribute("utilisateur", utilisateur);

		String nom = request.getParameter("nom");
		String email = request.getParameter("email");
		String motDePasse = request.getParameter("password");
		String message = null;
		String errors = null;

		if (nom.isEmpty()) {
			errors = "Le nom est obligatoire";
		} else if (email.isEmpty()) {
			errors = "Votre email est obligatoire";
		} else if (motDePasse.isEmpty()) {
			errors = "Le mot de passe est obligatoire";
		} else {
			message = "Félicitation" + " " + nom + " vous êtes inscrit";
		}
		request.setAttribute("errors", errors);
		request.setAttribute("message", message);
		doGet(request, response);
	}
}
