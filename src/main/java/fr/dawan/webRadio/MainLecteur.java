package fr.dawan.webRadio;

import java.sql.SQLException;

import fr.dawan.webRadio.utils.TestUtils;

public class MainLecteur {

	public static void main(String[] args) {
		try {
			TestUtils.test();
		} catch (SQLException e) {
			System.out.println("Impossible de se connecter");
			e.printStackTrace();
		}

	}

}
