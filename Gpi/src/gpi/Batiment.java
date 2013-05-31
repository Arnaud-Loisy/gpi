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
public class Batiment {

	private String nom;
	private DefaultComboBoxModel<Salle> salles;

	public Batiment(String nom) {
		this.salles = new DefaultComboBoxModel();
		this.nom = nom;
	}

	@Override
	public String toString() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public DefaultComboBoxModel getSalles() {
		return this.salles;
	}

	public DefaultComboBoxModel getListeSalles() {
		return this.salles;
	}

	public void ajouterNouvelleSalle(Salle salle) {
		this.salles.addElement(salle);
	}
	
	public boolean contientSalle(Salle salle) {
		if (this.salles.getIndexOf(salle) < 0)
			return false;
		
		return true;
	}
}
