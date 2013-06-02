/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gpi;

import java.io.Serializable;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author Arnaud Loisy
 */
public class Batiment implements Serializable{

	private static final long serialVersionUID = 11L;
	private String nom;
	private DefaultComboBoxModel<Salle> salles;
        
        /**
         * 
         * @param nom 
         */
	public Batiment(String nom) {
		this.salles = new DefaultComboBoxModel();
		this.nom = nom;
	}

	@Override
	public String toString() {
		return this.nom;
	}
        /**
         * definit le dnom d'un batiment
         * @param nom 
         */
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public String getNom() {
		return this.nom;
	}
	
        /**
         * 
         * @return renvoi la liste des salles d'un batiment 
         */
	public DefaultComboBoxModel getSalles() {
		return this.salles;
	}
        
        /**
         * ajoute une nouvelle salle à la liste de salles
         * @param salle 
         */
	public void ajouterNouvelleSalle(Salle salle) {
		this.salles.addElement(salle);
	}
	/**
         * verifie si une salle est présente dans un batiment
         * @param salle la salle verifiée.
         * @return true si la salle est contenue dans le batiment,
         * @return false sinon
         */
	public boolean contientSalle(Salle salle) {
		if (this.salles.getIndexOf(salle) < 0)
			return false;
		
		return true;
	}
}
