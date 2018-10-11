package fr.dawan.webRadio.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Permet de gérer les informations des utilisateurs de l'application
 * 
 * @author Admin stagiaire
 *
 */
@Entity
@Table(name="utilisateur")
public class Utilisateur extends DbObject {

	@Column(nullable=false, length=50)
	private String nom;
	@Column(nullable=false, length=50)
	private String prenom;
	@Column(nullable=false, length=50)
	private String email;
	@Column(nullable=false, length=20)
	private String username;
	@Column(nullable=false, length=20)
	private String password;
	@Column(length=50)
	private String region;
	@Column
	private String bibliographie;

	public Utilisateur() {
	}

	public Utilisateur(String nom, String prenom, String email, String username, String region, String bibliographie) {
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.username = username;
		this.region = region;
		this.bibliographie = bibliographie;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		// TODO écrire une regex valide
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getBibliographie() {
		return bibliographie;
	}

	public void setBibliographie(String bibliographie) {
		this.bibliographie = bibliographie;
	}
}
