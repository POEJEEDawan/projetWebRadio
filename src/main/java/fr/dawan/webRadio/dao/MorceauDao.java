package fr.dawan.webRadio.dao;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;

import fr.dawan.webRadio.model.Morceau;

public class MorceauDao extends GenericDao {

	public Morceau getByName(String nom, EntityManager em, boolean closeConnection) {
		TypedQuery<Morceau> query = em.createQuery("select entity from Morceau entity where nom=:nom", Morceau.class);
		query.setParameter("nom", nom);
		try {
			Morceau morceau = query.getSingleResult();
			return morceau;
		} catch (NoResultException e) {
			return null;
		}
	}
}
