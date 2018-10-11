package projetWebRadio;

import org.junit.Test;

import fr.dawan.webRadio.controllers.LecteurHandler;
import fr.dawan.webRadio.model.Lecteur;
import fr.dawan.webRadio.model.Morceau;
import junit.framework.TestCase;

public class TestLecteur extends TestCase{

	@Test
	public void testAddAndRemove() {
		Lecteur lecteur = new Lecteur();
		Morceau morceau = new Morceau();
		morceau.setNom("Africa by Toto");
		assertEquals(true, LecteurHandler.add(morceau, lecteur));
		assertEquals(true, LecteurHandler.remove(morceau, lecteur));
	}

	@Test
	public void testPlay() {
		Lecteur lecteur = new Lecteur();
		
		try {
			assertEquals(true, LecteurHandler.play(lecteur, "Lone Temples"));
		} catch (Exception e) {
			fail("Le fichier n'a pas pu être ouvert ou n'existe pas");
		}
	}
}
