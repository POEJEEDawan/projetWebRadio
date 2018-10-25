package fr.dawan.webRadio.servlets;

import java.io.IOException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.dawan.webRadio.dao.GenericDao;
import fr.dawan.webRadio.model.Morceau;
import fr.dawan.webRadio.utils.PersistenceUnitFactory;
import fr.dawan.webRadio.utils.PropertiesManager;

/**
 * Servlet implementation class ListeMorceauxServlet
 */
@WebServlet("/liste")
public class ListeMorceauxServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListeMorceauxServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
			
		EntityManager em = PersistenceUnitFactory.createEntityManager();
		GenericDao dao = new GenericDao();
		List<Morceau> morceaux = dao.findAll(Morceau.class, em, false);
		
		request.setAttribute("morceaux", morceaux);
		
		request.getRequestDispatcher("/WEB-INF/listemorceaux.jsp").forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
