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
		
		parcInfo.salles.addElement(new Salle());
		parcInfo.salles.addElement(new Salle());
		parcInfo.salles.addElement(new Salle());
		((Salle)parcInfo.salles.get(0)).setNom("toto1");
		((Salle)parcInfo.salles.get(1)).setNom("toto2");
		((Salle)parcInfo.salles.get(2)).setNom("toto3");
		
        MainWindow fenetre_principale = new MainWindow(parcInfo);
        fenetre_principale.setVisible(true);
    }
}