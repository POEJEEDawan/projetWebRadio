package fr.dawan.webRadio.utils;

import java.sql.SQLException;

import javax.persistence.EntityManager;

import fr.dawan.webRadio.controllers.ConnexionBucket;
import fr.dawan.webRadio.controllers.LecteurHandler;
import fr.dawan.webRadio.dao.GenericDao;
import fr.dawan.webRadio.dao.MorceauDao;
import fr.dawan.webRadio.model.Lecteur;
import fr.dawan.webRadio.model.Morceau;

public class TestUtils {

	public static void test() throws Exception {
//		GenericDao dao = new GenericDao();
		MorceauDao mDao = new MorceauDao();
	    EntityManager em = PersistenceUnitFactory.createEntityManager();
		Morceau morceau = mDao.getByName("Lone Temples", em, false);
		LecteurHandler.play(new Lecteur(), morceau.getChemin());
//	    morceau.setNom("Lone Temples");
//	    morceau.setChemin("Lone-Temples.mp3");
//	    dao.saveOrUpdate(morceau, em, false);
	    
	}
}
