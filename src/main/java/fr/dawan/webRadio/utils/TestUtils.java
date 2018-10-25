package fr.dawan.webRadio.utils;

import java.sql.SQLException;

import javax.persistence.EntityManager;

import fr.dawan.webRadio.controllers.ConnexionBucket;
import fr.dawan.webRadio.controllers.LecteurHandler;
import fr.dawan.webRadio.dao.ArtisteDao;
import fr.dawan.webRadio.dao.GenericDao;
import fr.dawan.webRadio.dao.MorceauDao;
import fr.dawan.webRadio.model.Artiste;
import fr.dawan.webRadio.model.Lecteur;
import fr.dawan.webRadio.model.Morceau;
import fr.dawan.webRadio.model.Utilisateur;

public class TestUtils {

	public static void test() throws Exception {
//		GenericDao dao = new GenericDao();
		MorceauDao mDao = new MorceauDao();
		EntityManager em = PersistenceUnitFactory.createEntityManager("projetWebRadio");
		Morceau morceau = mDao.getByName("Lone Temples", em, false);
		LecteurHandler.play(new Lecteur(), morceau.getChemin());
//	    morceau.setNom("Lone Temples");
//	    morceau.setChemin("Lone-Temples.mp3");
//	    dao.saveOrUpdate(morceau, em, false);

	}

	public static void test1() throws Exception {

//		ArtisteDao aDao = new ArtisteDao();
//		EntityManager em = PersistenceUnitFactory.createEntityManager("projetWebRadio");
//		Artiste artiste = aDao.getByArtistName("benjixx", em, false);

		Utilisateur utilisateur = new Utilisateur();
		
//		 utilisateur.setNom(request.getParameter("nom"));
//		 utilisateur.setEmail(request.getParameter("email"));
//		 
//		 GenericDao dao = new GenericDao();
//		 EntityManager em = PersistenceUnitFactory.createEntityManager("projet");
//		 dao.saveOrUpdate(utilisateur, em, false);
		 
		
		
	}
}
