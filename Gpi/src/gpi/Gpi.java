/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gpi;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author jeremy
 */
public class Gpi {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		// TODO code application logic here
		ParcInfo parcInfo = new ParcInfo();

		Batiment batiment0 = new Batiment("Entrepot");
		Batiment batiment1 = new Batiment("U4");
		Batiment batiment2 = new Batiment("U3");

		Salle salle0 = new Salle("Stock");
		Salle salle1 = new Salle("212");
		Salle salle2 = new Salle("210");
		Salle salle3 = new Salle("209");
		Salle salle4 = new Salle("208");
		Salle salle5 = new Salle("207");
		Salle salle6 = new Salle("206");

		OS os1 = new OS("Sans OS", "1");
		OS os2 = new OS("Windows XP", "1");
		OS os3 = new OS("Windows 7", "1");
		OS os4 = new OS("Windows 8", "1");
		OS os5 = new OS("Mac Os", "1");

		Ordinateur ordi1 = new Ordinateur("Mercure", "E6500", "Dell", "1234567", os1);
		ordi1.setEtat("Stock");
		Ordinateur ordi2 = new Ordinateur("Venus", "E6400", "Dell", "122424", os2);
		ordi2.setEtat("En Panne");
		Ordinateur ordi3 = new Ordinateur("Saturne", "E6300", "Dell", "125643654", os3);
		ordi3.setEtat("En Panne");
		Ordinateur ordi4 = new Ordinateur("Mars", "E6200", "Dell", "1265467899", os4);
		ordi4.setEtat("Installé");
		Ordinateur ordi5 = new Ordinateur("Pluton", "Zenbook", "Asus", "12965467", os5);
		ordi5.setEtat("Installé");

		parcInfo.ajouterNouveauBatiment(batiment0);
		parcInfo.ajouterNouveauBatiment(batiment1);
		parcInfo.ajouterNouveauBatiment(batiment2);

		parcInfo.ajouterNouvelleSalle(batiment0, salle0);
		parcInfo.ajouterNouvelleSalle(batiment1, salle1);
		parcInfo.ajouterNouvelleSalle(batiment1, salle2);
		parcInfo.ajouterNouvelleSalle(batiment1, salle3);
		parcInfo.ajouterNouvelleSalle(batiment2, salle4);
		parcInfo.ajouterNouvelleSalle(batiment2, salle5);
		parcInfo.ajouterNouvelleSalle(batiment2, salle6);

		parcInfo.ajouterNouvelOrdinateur(ordi1, salle0);
		parcInfo.ajouterNouvelOrdinateur(ordi2, salle2);
		parcInfo.ajouterNouvelOrdinateur(ordi3, salle3);
		parcInfo.ajouterNouvelOrdinateur(ordi4, salle3);
		parcInfo.ajouterNouvelOrdinateur(ordi5, salle5);

		//ParcInfo parcInfo = Sauvegarde.charger("parcInfo.serial");

		try {
			javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
			Logger.getLogger(Gpi.class.getName()).log(Level.SEVERE, null, ex);
		}
		MainWindow fenetre_principale = new MainWindow(parcInfo);
		fenetre_principale.setVisible(true);
	}
}