package fr.dawan.webRadio.controllers;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;

import fr.dawan.webRadio.beans.Lecteur;
import fr.dawan.webRadio.beans.Morceau;
import javazoom.jl.player.advanced.AdvancedPlayer;

public class LecteurHandler {

	public static boolean add(Morceau morceau, Lecteur lecteur) {
		return lecteur.getMorceaux().add(morceau);
	}

	public static boolean remove(Morceau morceau, Lecteur lecteur) {
		return lecteur.getMorceaux().remove(morceau);
	}

	public static boolean play(Lecteur lecteur) throws Exception {
		boolean isPlaying = false;
		if (!lecteur.getMorceaux().isEmpty()) {
			Morceau morceau = lecteur.getMorceaux().iterator().next();
			BufferedInputStream in = new BufferedInputStream(new FileInputStream(new File(morceau.getChemin())));
			lecteur.setPlayer(new AdvancedPlayer(in));
			lecteur.getPlayer().play();
			isPlaying = true;
			in.close();
		}
		return isPlaying;
	}

	public static void stop(Lecteur lecteur) {
		
		lecteur.getPlayer().stop();
	}
}
