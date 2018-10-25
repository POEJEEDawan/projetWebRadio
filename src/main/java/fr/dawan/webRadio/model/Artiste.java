package fr.dawan.webRadio.model;

import java.util.ArrayList;

<<<<<<< HEAD
public class Artiste extends DbObject {
=======
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
>>>>>>> branch 'master' of https://github.com/ProjetWebRadio/projetWebRadio

<<<<<<< HEAD
=======
@Entity
@Table(name = "artiste")
public class Artiste extends DbObject {
	
	
	private static final long serialVersionUID = 2338701149980285052L;

	@Column(length = 50, nullable = false)
>>>>>>> branch 'master' of https://github.com/ProjetWebRadio/projetWebRadio
	private String nom;

	
	@OneToMany(cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH }, fetch = FetchType.LAZY)
	private ArrayList<Morceau> morceau;

	public Artiste(String nom) {
		this.nom = nom;
	}

	public Artiste() {

	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public ArrayList<Morceau> getMorceau() {
		return morceau;
	}

	public void setMorceau(ArrayList<Morceau> morceau) {
		this.morceau = morceau;
	}

}
