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
		
        MainWindow fenetre_principale = new MainWindow(parcInfo);
        fenetre_principale.setVisible(true);
    }
}