package fr.dawan.webRadio.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Permet de gérer les informations relatifs aux morceaux qui seront lu par le lecteur
 * @author Admin stagiaire
 *
 */

@Entity
@Table(name="morceau")
public class Morceau extends DbObject {
	private static final long serialVersionUID = 3429597890704290352L;
	
	@Column(length=50, nullable=false)
	private String nom;
	@Column(length=50)
	private String couverture;
	@Column(nullable=false)
	private String chemin;
	@Column
	private Genre genre;
	@Column
	private long utilisateurId;

	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getCouverture() {
		return couverture;
	}

	public void setCouverture(String couverture) {
		this.couverture = couverture;
	}

	public String getChemin() {
		return chemin;
	}

	public void setChemin(String chemin) {
		this.chemin = chemin;
	}

	public Genre getGenre() {
		return genre;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}

	public long getUtilisateurId() {
		return utilisateurId;
	}

	public void setUtilisateurId(long utilisateurId) {
		this.utilisateurId = utilisateurId;
	}

	public enum Genre {
		HIPHOP, RAP, RNB, ELECTRO, POP
	}
}
