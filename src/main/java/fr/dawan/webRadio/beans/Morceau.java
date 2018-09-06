package fr.dawan.webRadio.beans;

/**
 * Permet de gérer les informations relatifs aux morceaux qui seront lu par le lecteur
 * @author Admin stagiaire
 *
 */
public class Morceau {

	private long id;
	private String nom;
	private String couverture;
	private String chemin;
	private Genre genre;
	private long utilisateurId;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

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
