package fr.dawan.webRadio.utils;

import java.sql.SQLException;

import javax.persistence.EntityManager;

import fr.dawan.webRadio.dao.GenericDao;
import fr.dawan.webRadio.model.Morceau;

public class TestUtils {

	public static void test() throws SQLException {
		GenericDao dao = new GenericDao();
	    EntityManager em = PersistenceUnitFactory.createEntityManager("projetWebRadio");
		Morceau morceau = new Morceau();
	    morceau.setNom("la vida loca");
	    morceau.setChemin("c:/envs");
	    dao.saveOrUpdate(morceau, em, false);
	    
	}
}
