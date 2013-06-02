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
public class Salle implements Serializable {

	private static final long serialVersionUID = 16L;
	private String nom;
	private DefaultComboBoxModel ordinateurs;
	
	public Salle(){
		this.ordinateurs = new DefaultComboBoxModel();
	}

	public Salle(String nom) {
		this.ordinateurs = new DefaultComboBoxModel();
		this.nom = nom;
	}

	public DefaultComboBoxModel getOrdinateurs() {
		return ordinateurs;
	}

	public void setOrdinateurs(DefaultComboBoxModel ordinateurs) {
		this.ordinateurs = ordinateurs;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public void affecterOrdinateur(Ordinateur ordinateur) {
		this.ordinateurs.addElement(ordinateur);
	}

	/**
         * verifie si un ordinateur est présent dans une salle
         * @param salle la salle verifiée.
         * @return true si la salle est contenue dans le batiment,
         * @return false sinon
         */
	public boolean contientOrdinateur(Ordinateur ordinateur) {
		if (this.ordinateurs.getIndexOf(ordinateur) < 0)
			return false;
		
		return true;
	}
	
	@Override
	public String toString() {
		return this.nom;
	}
}
