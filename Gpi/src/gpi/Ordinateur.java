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
	private ArrayList<ArrayList<String>> historique;
	private DefaultComboBoxModel Os;

	public Ordinateur(String nom) {
		this.nom = nom;
	}

	public String getNom() {
		return nom;
	}

	public String getNumSerie() {
		return numSerie;
	}

	public void setNumSerie(String numSerie) {
		this.numSerie = numSerie;
	}

	public DefaultComboBoxModel getOs() {
		return Os;
	}

	public void setOs(DefaultComboBoxModel Os) {
		this.Os = Os;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getModele() {
		return modele;
	}

	public void setModele(String modele) {
		this.modele = modele;
	}

	public String getFabriquant() {
		return fabriquant;
	}

	public void setFabriquant(String fabriquant) {
		this.fabriquant = fabriquant;
	}

	public Date getDateInstall() {
		return dateInstall;
	}

	public void setDateInstall(Date dateInstall) {
		this.dateInstall = dateInstall;
	}

	public ArrayList<ArrayList<String>> getHistorique() {
		return historique;
	}

	public void setHistorique(ArrayList<ArrayList<String>> historique) {
		this.historique = historique;
	}

	public void ajouterOS(OS op) {
		Os.addElement(op);
	}
}
