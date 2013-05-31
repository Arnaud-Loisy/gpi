/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gpi;

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
		
		Batiment batiment1 = new Batiment("U4");
		Batiment batiment2 = new Batiment("U3");
		
		Salle salle1 = new Salle("212");
		Salle salle2 = new Salle("210");
		Salle salle3 = new Salle("209");
		Salle salle4 = new Salle("208");
		Salle salle5 = new Salle("207");
		Salle salle6 = new Salle("206");
		
		Ordinateur ordi1 = new Ordinateur("Mercure");
		Ordinateur ordi2 = new Ordinateur("Venus");
		Ordinateur ordi3 = new Ordinateur("Saturne");
		Ordinateur ordi4 = new Ordinateur("Pluton");
		Ordinateur ordi5 = new Ordinateur("Mars");
		
		salle1.affecterOrdinateur(ordi1);
		salle2.affecterOrdinateur(ordi2);
		salle3.affecterOrdinateur(ordi3);
		salle3.affecterOrdinateur(ordi4);
		salle4.affecterOrdinateur(ordi5);
		
		parcInfo.ajouterNouveauBatiment(batiment1);
		parcInfo.ajouterNouveauBatiment(batiment2);
		
		parcInfo.ajouterNouvelleSalle(batiment1, salle1);
		parcInfo.ajouterNouvelleSalle(batiment1, salle2);
		parcInfo.ajouterNouvelleSalle(batiment1, salle3);
		parcInfo.ajouterNouvelleSalle(batiment2, salle4);
		parcInfo.ajouterNouvelleSalle(batiment2, salle5);
		parcInfo.ajouterNouvelleSalle(batiment2, salle6);
		
		
        MainWindow fenetre_principale = new MainWindow(parcInfo);
        fenetre_principale.setVisible(true);
    }
}