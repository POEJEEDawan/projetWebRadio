package fr.dawan.webRadio.servlet;

import java.io.IOException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.dawan.webRadio.dao.GenericDao;
import fr.dawan.webRadio.model.Artiste;
import fr.dawan.webRadio.utils.PersistenceUnitFactory;

/**
 * Servlet implementation class ListeArtisteServlet
 */
@WebServlet("/artistes")
public class ListeArtisteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ListeArtisteServlet() {
		super();

	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		EntityManager em = PersistenceUnitFactory.createEntityManager("projetWebRadio");
		GenericDao dao = new GenericDao();
		List<Artiste> artiste = dao.findAll(Artiste.class, em, false);

		request.setAttribute("artiste", artiste);

//		request.getRequestDispatcher("/WEB-INF/listemorceaux.jsp").forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
