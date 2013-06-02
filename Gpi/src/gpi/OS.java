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
     * @return le nom d'un système d'exploitation
     */
    public String getNom() {
        return Nom;
    }
    /**
     * définit le nom d'un systeme d'exploitation
     * @param Nom 
     */
    public void setNom(String Nom) {
        this.Nom = Nom;
    }
    
    /**
     * 
     * @return la version d'un système d'exploitation 
     */
    public String getVersion() {
        return Version;
    }

    /**
     * definit la version d'un système d'exploitation
     * @param Version 
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }
	
	public String toString() {
		return this.Nom;
	}
    
}
