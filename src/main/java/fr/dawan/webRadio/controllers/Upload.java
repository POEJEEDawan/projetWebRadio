package fr.dawan.webRadio.controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.dawan.webRadio.model.Utilisateur;

/**
 * Servlet implementation class Upload
 */
@WebServlet("/upload")
public class Upload extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Upload() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.getRequestDispatcher("WEB-INF/upload.jsp").forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String file = request.getParameter("file");
		String nom = request.getParameter("nomArtiste");
		String titreMorceau = request.getParameter("morceau");
		String message = null;
		String errors = null;

		
		if (titreMorceau.isEmpty()) {
			errors = "Le morceau est obligatoire";
		}else if (nom.isEmpty()) {
			errors ="Votre nom d'artiste est obligatoire";
		}else if (file.isEmpty()) {
			errors ="Envoi obligatoire";
		}else {
			message = "Merci de votre confiance";
		}	
		
		
		
	}
}