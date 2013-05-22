/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gpi;

import javax.swing.DefaultListModel;

/**
 *
 * @author darkey
 */
public class Batiment {
    private String Nom;
    private DefaultListModel salles;
	
    public void afficherSalles(){
        
    }
    
	public DefaultListModel getListeSalles() {
		return this.salles;
	}
    public void ajouterSalle(Salle salle){
		this.salles.addElement(salle);
    }
    
}
