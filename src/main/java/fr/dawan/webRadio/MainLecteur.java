package fr.dawan.webRadio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MainLecteur {

	public static void main(String[] args) {
//		Lecteur lecteur = new Lecteur();
//		Morceau morceau = new Morceau();
//		morceau.setNom("Pick Six");
//		morceau.setChemin("c:/envs/Gila- Pick Six.mp3");
//		LecteurHandler.add(morceau, lecteur);
//		try {
//			LecteurHandler.play(lecteur);
//		} catch (Exception e) {
//			System.out.println("Impossible de lire le fichier");
//			e.printStackTrace();
//		}

		Statement setupStatement;
		
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String jdbcUrl = "jdbc:mysql://webradiodb.ct5yhwodybmy.eu-west-3.rds.amazonaws.com:3306/"
				+ "dbwebradio?user=benjixxx&password=b271905l";
		try {
			Connection con = DriverManager.getConnection(jdbcUrl);
		    String createTable = "CREATE TABLE morceaux ("
		    		+ "id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,"
		    		+ "nom VARCHAR(50) NOT NULL,"
		    		+ "couverture VARCHAR(50),"
		    		+ "chemin VARCHAR(50) UNIQUE NOT NULL,"
		    		+ "genre VARCHAR(30),"
		    		+ "id_utilisateur INT)";
//		    String insertRow1 = "INSERT INTO morceaux(nom, couverture, chemin, genre) VALUES('la vida loca', '', 'la_vida_loca', 'RNB') ";
//		    setupStatement = con.createStatement();
//		    setupStatement.addBatch(createTable);
//		    setupStatement.addBatch(insertRow1);
//		    setupStatement.executeBatch();
		} catch (SQLException e) {
			System.out.println("Impossible de se connecter");
			e.printStackTrace();
		}
		   
		
		
	}

}
