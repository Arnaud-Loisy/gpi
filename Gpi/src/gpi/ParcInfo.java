/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gpi;

import java.io.Serializable;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author Arnaud
 */
public class ParcInfo implements Serializable {

	private static final long serialVersionUID = 15L;
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
	 *
	 * @param batiments la liste de batiments du parc info
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
	 * aujoute un nouveau batiment aux batiments existants
	 *
	 * @param batiment le batiment à ajouter
	 */
	public void ajouterNouveauBatiment(Batiment batiment) {
		this.batiments.addElement(batiment);
	}

	/**
	 * suppression d'un batiment de la liste
	 *
	 * @param batiment le batiment à supprimer
	 */
	public void supprimerBatiment(Batiment batiment) {
		this.batiments.removeElement(batiment);
	}

	/**
	 * supression d'un batiment de la liste à partir de sa position
	 *
	 * @param index l'indice du batiment à supprimer
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
	 *
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
	 *
	 * @param salle la salle à ajouter
	 */
	public void ajouterNouvelleSalle(Salle salle) {
		this.salles.addElement(salle);
	}

	/**
	 * supression d'une salle de la liste
	 *
	 * @param salle la salle à supprimer
	 */
	public void supprimerSalle(Salle salle) {
		this.salles.removeElement(salle);
	}

	/**
	 * supprime une salle à partir de sa position dans la liste
	 *
	 * @param index l'indice de la salle à supprimer
	 */
	public void supprimerSalle(int index) {
		this.salles.removeElementAt(index);
	}

	/**
	 * ajoute un nouvel ordinateur
	 *
	 * @param ordinateur l'ordinateur à ajouter
	 */
	public void ajouterNouvelOrdinateur(Ordinateur ordinateur) {
		this.ordinateurs.addElement(ordinateur);
	}

	/**
	 * ajoute un nouvel ordinateur
	 *
	 * @param ordinateur l'ordinateur à ajouter
	 * @param salle la salle dans laquelle ajouter le nouvel ordinateur
	 */
	public void ajouterNouvelOrdinateur(Ordinateur ordinateur, Salle salle) {
		int index = this.salles.getIndexOf(salle);

		Date date = new Date();

		if (ordinateur.getEtat() == "Stock") {
			ordinateur.setDateAcquisition(date);
		} else {
			ordinateur.setDateAcquisition(date);
			ordinateur.setDateInstall(date);
		}

		ordinateur.ajouterOperationHistorique("Installation initiale", date);

		((Salle) this.salles.getElementAt(index)).affecterOrdinateur(ordinateur);
		this.ordinateurs.addElement(ordinateur);
	}

	/**
	 * renvoi le nombre d'ordinateur du parc informatique dans l'état passé en
	 * paramètre
	 *
	 * @param etat l'état dont on veut le nombre d'ordinateur
	 * @return somme le nombre d'ordinateur dans l'état voulu
	 */
	public int nbOrdinateurs(String etat) {
		int somme = 0;
		for (int i = 0; i < this.ordinateurs.getSize(); i++) {
			if (this.ordinateurs.getElementAt(i).getEtat() == etat) {
				somme += 1;
			}
		}

		return somme;
	}

	/**
	 * renvoie le nombre d'ordinateurs du parc informatique
	 *
	 * @return ordinateurs.getSize() le nombre d'ordinateurs du parc
	 * informatique
	 */
	public int nbOrdinateurs() {
		return this.ordinateurs.getSize();
	}

	/**
	 * renvoie le nombre de salles du parc informatique
	 *
	 * @return salles.getSize() le nombre de salles du parc informatique
	 */
	public int nbSalles() {
		return this.salles.getSize();
	}

	/**
	 * renvoie le nombre de batiments du parc informatique
	 *
	 * @return batiments.getSize() le nombre de batiments du parc informatique
	 */
	public int nbBatiments() {
		int size = this.batiments.getSize();
		return size;
	}

	/**
	 *
	 * @return ordinateurs la liste d'ordinateurs du parc informatique
	 */
	public DefaultComboBoxModel getOrdinateurs() {
		return this.ordinateurs;
	}
}
