/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gpi;

import java.io.Serializable;

/**
 *
 * @author Arnaud
 */
public class OS implements Serializable {
	
	private static final long serialVersionUID = 13L;
    private String Nom;
    private String Version;
	
	public OS(String nom, String version) {
		this.Nom = nom;
		this.Version = version;
	}
    
    /**
     * 
     * @return Nom le nom d'un système d'exploitation
     */
    public String getNom() {
        return Nom;
    }
    /**
     * définit le nom d'un systeme d'exploitation
     * @param Nom le nouveau nom du systeme d'exploitation 
     */
    public void setNom(String Nom) {
        this.Nom = Nom;
    }
    
    /**
     * 
     * @return Version la version d'un système d'exploitation 
     */
    public String getVersion() {
        return Version;
    }

    /**
     * definit la version d'un système d'exploitation
     * @param Version la nouvelle version du systeme d'exploitation
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }
	/**
         * Surcharge de la méthode toString pour renvoyer que le nom du système d'exploitation
         * @return Nom le nom du système d'exploitation
         */
	public String toString() {
		return this.Nom;
	}
    
}
