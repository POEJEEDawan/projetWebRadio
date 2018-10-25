package fr.dawan.webRadio.servlet;

import java.io.IOException;

import javax.persistence.EntityManager;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import fr.dawan.webRadio.dao.GenericDao;
import fr.dawan.webRadio.model.Utilisateur;
import fr.dawan.webRadio.utils.PersistenceUnitFactory;

/**
 * Servlet implementation class Inscription
 */
@WebServlet("/inscription")
public class InscriptionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public InscriptionServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

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

		// --------------Gérer Session--------------//
//		HttpSession session = request.getSession();
//
//		session.setAttribute("nom", nom);
//     

		// --------------Gestion cookie---------------//
		Cookie cookie = new Cookie("nom", nom);
		Cookie cookie2 = new Cookie("password", motDePasse);

		cookie.setMaxAge(60 * 60 * 24 * 30 * 12);
		cookie2.setMaxAge(60 * 60 * 24 * 30 * 12);

		response.addCookie(cookie);
		response.addCookie(cookie2);

		request.getRequestDispatcher("WEB-INF/inscription.jsp").forward(request, response);

		// --------Enregistrer un utilisateur dans la base de données----------//
		utilisateur.setNom(nom);
		utilisateur.setEmail(email);
		utilisateur.setPassword(motDePasse);

		GenericDao dao = new GenericDao();
		EntityManager em = PersistenceUnitFactory.createEntityManager("projet");
		dao.saveOrUpdate(utilisateur, em, false);

	}
}
