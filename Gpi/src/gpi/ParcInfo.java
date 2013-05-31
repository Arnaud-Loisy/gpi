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
	public DefaultComboBoxModel<Ordinateur> ordinateurs;
        
        /**
         * constructeur
         */
	public ParcInfo() {
		this.batiments = new DefaultComboBoxModel();
		this.salles = new DefaultComboBoxModel();
		this.ordinateurs = new DefaultComboBoxModel();
	}
        /**
         * Constructeur a partir de liste de batiments
         * @param batiments 
         */
	public ParcInfo(DefaultComboBoxModel batiments) {
		this.batiments = batiments;
	}
        
        /**
         * 
         * @return liste de batiments
         */
	public DefaultComboBoxModel getBatiments() {
		return batiments;
	}
        /**
         * aujoute un nuveau batiment aux batiments existants
         * @param batiment 
         */
	public void ajouterNouveauBatiment(Batiment batiment) {
		this.batiments.addElement(batiment);
	}
        /**
         * suppression d'un batiment de la liste 
         * @param batiment 
         */
	public void supprimerBatiment(Batiment batiment) {
		this.batiments.removeElement(batiment);
	}
        /**
         * supression d'un batiment de la liste à partir de sa position
         * @param index 
         */
	public void supprimerBatiment(int index) {
		this.batiments.removeElementAt(index);
	}
        
        /**
         * 
         * @return la liste des salles 
         */
	public DefaultComboBoxModel getSalles() {
		return salles;
	}
        /**
         * Ajoute une salle existante à un batiment
         * @param batiment
         * @param salle 
         */
	public void ajouterNouvelleSalle(Batiment batiment, Salle salle) {
		int index = this.batiments.getIndexOf(batiment);

		((Batiment) this.batiments.getElementAt(index)).ajouterNouvelleSalle(salle);
		this.salles.addElement(salle);
	}
        /**
         * Ajout d'une salle à la liste de salle existante
         * @param salle 
         */
	public void ajouterNouvelleSalle(Salle salle) {
		this.salles.addElement(salle);
	}
        
        /**
         * supression d'une salle de la liste
         * @param salle 
         */
	public void supprimerSalle(Salle salle) {
		this.salles.removeElement(salle);
	}
        /**
         * supprime une salle à partir de sa position dans la liste
         * @param index 
         */
	public void supprimerSalle(int index) {
		this.salles.removeElementAt(index);
	}
        /**
         * ajoute un nouvel ordinateur
         * @param ordinateur 
         */
	public void ajouterNouvelOrdinateur(Ordinateur ordinateur) {
		this.salles.getElementAt(0).affecterOrdinateur(ordinateur);
	}
}
