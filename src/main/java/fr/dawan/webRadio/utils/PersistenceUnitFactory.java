package fr.dawan.webRadio.utils;

import java.io.IOException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class PersistenceUnitFactory {
	

	public static EntityManager createEntityManager() throws IOException {
		PropertiesManager pm = new PropertiesManager();
		EntityManagerFactory emf = Persistence.createEntityManagerFactory(pm.getPersistenceUnitName());
		EntityManager em = emf.createEntityManager();
		return em;
	}
}
  








