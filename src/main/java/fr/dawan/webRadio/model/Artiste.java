package fr.dawan.webRadio.model;

import java.util.ArrayList;

public class Artiste extends DbObject{

	
	private String nom;
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

