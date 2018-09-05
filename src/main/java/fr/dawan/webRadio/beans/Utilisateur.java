package fr.dawan.webRadio.beans;

public class Utilisateur {
	private long id;
	private String nom;
	private String prenom;
	private String email;
	private String username;
	private String password;
	private String region;
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
		//TODO écrire une regex valide
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
