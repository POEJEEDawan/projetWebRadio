package fr.dawan.webRadio.beans;

import java.util.HashSet;
import java.util.Set;

import javazoom.jl.player.advanced.AdvancedPlayer;

/**
 * Permet de gérer le lecteur radio
 * @author Admin stagiaire
 *
 */
public class Lecteur {

	private Set<Morceau> morceaux = new HashSet<>();
	private AdvancedPlayer player;
	
	public Set<Morceau> getMorceaux() {
		return morceaux;
	}
	public void setMorceaux(Set<Morceau> morceaux) {
		this.morceaux = morceaux;
	}
	public AdvancedPlayer getPlayer() {
		return player;
	}
	public void setPlayer(AdvancedPlayer player) {
		this.player = player;
	}
	
	
}
