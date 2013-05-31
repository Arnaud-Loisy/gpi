/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gpi;

import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author darkey
 */
public class Salle {

	private String nom;
	private DefaultComboBoxModel ordinateurs;

	public Salle(String nom) {
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

	@Override
	public String toString() {
		return this.nom;
	}
}
