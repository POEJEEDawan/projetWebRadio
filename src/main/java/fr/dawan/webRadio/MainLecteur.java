package fr.dawan.webRadio;

import fr.dawan.webRadio.beans.Lecteur;
import fr.dawan.webRadio.beans.Morceau;
import fr.dawan.webRadio.controllers.LecteurHandler;

public class MainLecteur {

	public static void main(String[] args) {
		Lecteur lecteur = new Lecteur();
		Morceau morceau = new Morceau();
		morceau.setNom("Pick Six");
		morceau.setChemin("c:/envs/Gila- Pick Six.mp3");
		LecteurHandler.add(morceau, lecteur);
		try {
			LecteurHandler.play(lecteur);
		} catch (Exception e) {
			System.out.println("Impossible de lire le fichier");
		}
	}

}
