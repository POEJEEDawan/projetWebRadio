package fr.dawan.webRadio.servlets;

import java.io.IOException;

import javax.persistence.EntityManager;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.dawan.webRadio.dao.MorceauDao;
import fr.dawan.webRadio.model.Morceau;
import fr.dawan.webRadio.utils.PersistenceUnitFactory;
import fr.dawan.webRadio.utils.PropertiesManager;

/**
 * Servlet implementation class IndexServlet
 */

@WebServlet("/index")
public class IndexServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public IndexServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String nom = request.getParameter("nom");
		if (nom != null && nom != "") {
			String url = "";
			MorceauDao mDao = new MorceauDao();
			PropertiesManager pm = new PropertiesManager();
			EntityManager em = PersistenceUnitFactory.createEntityManager();
			Morceau morceau = mDao.getByName(nom, em, false);
			if (morceau != null) {
				url = pm.getBucketUrl() + morceau.getChemin();
				request.setAttribute("morceau", url);
			}
		}

		request.getRequestDispatcher("/index.jsp").forward(request, response);

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
