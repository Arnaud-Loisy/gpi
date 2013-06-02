/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gpi;

import java.util.ArrayList;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author darkey
 */
public class Ordinateur {

	private String nom;
	private String modele;
	private String fabriquant;
	private String numSerie;
	private Date dateInstall;
	private DefaultComboBoxModel Os;
	private ArrayList<Historique> historique;
	private String etat;

	/**
	 *
	 * @return l'historique d'un ordinateur
	 */
	public ArrayList<Historique> getHistorique() {
		return historique;
	}

	/**
	 *
	 * @param historique l'historique d'un ordianteur
	 */
	public void setHistorique(ArrayList<Historique> historique) {
		this.historique = historique;
	}

	/**
	 * Constructeur d'ordinateur à partir de son nom, modele, frabiquant, numero
	 * de serie
	 *
	 * @param nom
	 * @param modele
	 * @param fabriquant
	 * @param numSerie
	 */
	public Ordinateur(String nom, String modele, String fabriquant, String numSerie) {
		this.nom = nom;
		this.modele = modele;
		this.fabriquant = fabriquant;
		this.numSerie = numSerie;
	}

	/**
	 *
	 * @return le nom d'hote d'un ordinateur
	 */
	public String getNom() {
		return nom;
	}

	/**
	 *
	 * @return le numero de serie d'un ordinateur
	 */
	public String getNumSerie() {
		return numSerie;
	}

	/**
	 * definit le numero de serie d'un ordinateur
	 *
	 * @param numSerie
	 */
	public void setNumSerie(String numSerie) {
		this.numSerie = numSerie;
	}

	/**
	 *
	 * @return le systeme d'exploitation d'un ordinateur
	 */
	public DefaultComboBoxModel getOs() {
		return Os;
	}

	/**
	 * definit le système d'exploitation d'un ordinateur
	 *
	 * @param Os
	 */
	public void setOs(DefaultComboBoxModel Os) {
		this.Os = Os;
	}

	/**
	 * definit l'état d'un ordinateur
	 *
	 * @param Os
	 */
	public void setEtat(String etat) {
		this.etat = etat;
	}

	/**
	 * definit le nom d'hote d'un ordinateur
	 *
	 * @param nom
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 *
	 * @return le modèle d'un ordinateur
	 */
	public String getModele() {
		return modele;
	}

	/**
	 * Définit le modele d'un ordinateur
	 *
	 * @param modele
	 */
	public void setModele(String modele) {
		this.modele = modele;
	}

	/**
	 *
	 * @return le frabriquant d'un ordinateur
	 */
	public String getFabriquant() {
		return fabriquant;
	}

	/**
	 * definit le fabriquant d'un ordinateur
	 *
	 * @param fabriquant
	 */
	public void setFabriquant(String fabriquant) {
		this.fabriquant = fabriquant;
	}

	/**
	 *
	 * @return la date d'installation d'un ordinateur
	 */
	public Date getDateInstall() {
		return dateInstall;
	}

	/**
	 * definit la date d'installation d'un ordinateur
	 *
	 * @param dateInstall
	 */
	public void setDateInstall(Date dateInstall) {
		this.dateInstall = dateInstall;
	}

	/**
	 * methode permettant d'ajouter un systeme d'exploitation à un ordinateur
	 *
	 * @param op
	 */
	public void ajouterOS(OS op) {
		Os.addElement(op);
	}

	@Override
	public String toString() {
		return this.nom;
	}
}
