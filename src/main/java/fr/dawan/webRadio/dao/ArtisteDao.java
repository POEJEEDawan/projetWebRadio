package fr.dawan.webRadio.dao;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import fr.dawan.webRadio.model.Artiste;


public class ArtisteDao extends GenericDao {

	public Artiste getByArtistName(String nom, EntityManager em, boolean closeConnection) {
		TypedQuery<Artiste> query = em.createQuery("select entity from Artiste entity where nom=:nom", Artiste.class);
		query.setParameter("nom", nom);
		Artiste artiste = query.getSingleResult();
		return artiste;
	}

}
