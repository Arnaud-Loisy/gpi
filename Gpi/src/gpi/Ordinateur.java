/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gpi;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Arnaud
 */
public class Ordinateur implements Serializable {

    private static final long serialVersionUID = 14L;
    private String nom;
    private String modele;
    private String fabriquant;
    private String numSerie;
    private Date dateInstall;
    private Date dateAcquisition;
    private OS Os;
    private ArrayList<Historique> historique;
    private String etat;

    /**
     * Constructeur d'ordinateur à partir de son nom, modele, frabiquant, numero
     * de serie, systeme d'exploitation
     *
     * @param nom le nom d'hôte d'un ordinateur
     * @param modele le modèle d'un ordinateur
     * @param fabriquant le fabriquant d'un ordinateur
     * @param numSerie le numero de serie d'un ordinateur
     * @param os le systeme d'exploitation d'un ordinateur
     */
    public Ordinateur(String nom, String modele, String fabriquant, String numSerie, OS os) {
        this.nom = nom;
        this.modele = modele;
        this.fabriquant = fabriquant;
        this.numSerie = numSerie;
        this.Os = os;
        this.historique = new ArrayList<Historique>();
        this.dateInstall = null;
        this.dateAcquisition = null;
    }

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
     * @param numSerie le nouveau numero de serie d'un ordinateur
     */
    public void setNumSerie(String numSerie) {
        this.numSerie = numSerie;
    }

    /**
     *
     * @return Os le systeme d'exploitation d'un ordinateur
     */
    public OS getOs() {
        return this.Os;
    }

    /**
     * definit le système d'exploitation d'un ordinateur
     *
     * @param Os
     */
    public void setOs(OS Os) {
        this.Os = null;
        this.Os = Os;
    }

    /**
     * definit l'état d'un ordinateur
     *
     * @param etat le nouvel etat de l'odinateur
     */
    public void setEtat(String etat) {
        this.etat = etat;
    }

    /**
     * definit le nom d'hote d'un ordinateur
     *
     * @param nom le nouveau non d'hote d'un ordinateur
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     *
     * @return modele le modèle d'un ordinateur
     */
    public String getModele() {
        return modele;
    }

    /**
     * Définit le modele d'un ordinateur
     *
     * @param modele le nouveau modele d'un ordinateur
     */
    public void setModele(String modele) {
        this.modele = modele;
    }

    /**
     *
     * @return fabriquant le frabriquant d'un ordinateur
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
     * @return dateInstall la date d'installation d'un ordinateur
     */
    public Date getDateInstall() {
        return dateInstall;
    }

    /**
     * definit la date d'installation d'un ordinateur
     *
     * @param dateInstall la nouvelle date d'installation d'un ordinateur
     */
    public void setDateInstall(Date dateInstall) {
        this.dateInstall = dateInstall;
    }

    /**
     * definit la date d'installation d'un ordinateur
     *
     * @param dateAcquisition la date d'acquisition de l'ordinateur
     */
    public void setDateAcquisition(Date dateAcquisition) {
        this.dateAcquisition = dateAcquisition;
    }

    /**
     * renvoie la date d'acquisition d'un ordinateur
     *
     * @return dateAcquisition la date d'acquisition d'un ordinateur
     */
    public Date getDateAcquisition() {
        return dateAcquisition;
    }

    /**
     * methode permettant d'ajouter un systeme d'exploitation à un ordinateur
     *
     * @param op le système d'exploitation à ajouter
     */
    
    /*
     public void ajouterOS(OS op) {
     Os.addElement(op);
     }*/

    /**
     *
     * @return etat l'état d'un ordinateur
     */
    public String getEtat() {
        return this.etat;
    }

    /**
     * surcharge de la methode toString pour afficher le nom d'hôte uniquement
     *
     * @return nom le nom d'hôte de l'ordinateur
     */
    @Override
    public String toString() {
        return this.nom;
    }

    /**
     * ajoute à l'historique de l'ordinateur une action effectuée et sa date
     *
     * @param action la chaine décrivant l'action effectuée
     * @param date la date de l'action effectuée
     */
    public void ajouterOperationHistorique(String action, Date date) {
        Historique hist = new Historique(action, date);
        this.historique.add(hist);
    }
}
