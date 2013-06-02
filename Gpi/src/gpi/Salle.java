/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gpi;

import java.io.Serializable;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author Arnaud
 */
public class Salle implements Serializable {
        
	private static final long serialVersionUID = 16L;
	private String nom;
	private DefaultComboBoxModel ordinateurs;
	/**
         * Constructeur sans parametres
         */
	public Salle(){
		this.ordinateurs = new DefaultComboBoxModel();
	}
           /**
            * Constructeur à partir d'un nom de salle
            * @param nom le nom de la salle à instancier 
            */
	public Salle(String nom) {
		this.ordinateurs = new DefaultComboBoxModel();
		this.nom = nom;
	}
        /**
         * 
         * @return ordinateurs la liste d'ordinateurs d'une salle 
         */
	public DefaultComboBoxModel getOrdinateurs() {
		return ordinateurs;
	}
        /**
         * définit la liste d'ordinateur d'une salle
         * @param ordinateurs la liste d'ordinateurs à assigner à la salle
         */
	public void setOrdinateurs(DefaultComboBoxModel ordinateurs) {
		this.ordinateurs = ordinateurs;
	}
        /**
         * 
         * @return nom le nom de la salle
         */
	public String getNom() {
		return nom;
	}
        /**
         * modifie le nom d'une salle
         * @param nom le nouveau nom de la salle
         */
	public void setNom(String nom) {
		this.nom = nom;
	}
        /**
         * ajoute un ordinateur à la liste d'ordinateur d'une salle
         * @param ordinateur l'ordinateur à ajouter 
         */
	public void affecterOrdinateur(Ordinateur ordinateur) {
		this.ordinateurs.addElement(ordinateur);
	}
        /**
         * Surcharge de la méthode toString pour renvoyer que le nom de la salle
         * @return nom le nom de la salle 
         */
	@Override
	public String toString() {
		return this.nom;
	}
}
