/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gpi;

import java.io.Serializable;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author darkey
 */
public class ParcInfo implements Serializable {

	private static final long serialVersionUID = 00001L;
	private DefaultComboBoxModel<Batiment> batiments;
	public DefaultComboBoxModel<Salle> salles;

	public ParcInfo() {
		this.batiments = new DefaultComboBoxModel();
		this.salles = new DefaultComboBoxModel();
	}

	public ParcInfo(DefaultComboBoxModel batiments) {
		this.batiments = batiments;
	}

	public DefaultComboBoxModel getBatiments() {
		return batiments;
	}

	public void ajouterNouveauBatiment(Batiment batiment) {
		this.batiments.addElement(batiment);
	}

	public void supprimerBatiment(Batiment batiment) {
		this.batiments.removeElement(batiment);
	}

	public void supprimerBatiment(int index) {
		this.batiments.removeElementAt(index);
	}

	public DefaultComboBoxModel getSalles() {
		return salles;
	}

	public void ajouterNouvelleSalle(Batiment batiment, Salle salle) {
		int index = this.batiments.getIndexOf(batiment);

		((Batiment) this.batiments.getElementAt(index)).ajouterNouvelleSalle(salle);
		this.salles.addElement(salle);
	}

	public void ajouterNouvelleSalle(Salle salle) {
		this.salles.addElement(salle);
	}

	public void supprimerSalle(Salle salle) {
		this.salles.removeElement(salle);
	}

	public void supprimerSalle(int index) {
		this.salles.removeElementAt(index);
	}

	public void ajouterNouvelOrdinateur(Ordinateur ordinateur) {
		this.salles.getElementAt(0).affecterOrdinateur(ordinateur);
	}
}
