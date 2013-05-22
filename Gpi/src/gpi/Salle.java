/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gpi;

import java.util.ArrayList;
import javax.swing.DefaultListModel;

/**
 *
 * @author darkey
 */
public class Salle {
    private String Nom;
    private ArrayList <Ordinateur> ordis;
    private DefaultListModel ordinateurs;

    public DefaultListModel getOrdinateurs() {
        return ordinateurs;
    }

    public void setOrdinateurs(DefaultListModel ordinateurs) {
        this.ordinateurs = ordinateurs;
    }
    
    

    public String getNom() {
        return Nom;
    }

    public void setNom(String Nom) {
        this.Nom = Nom;
    }
    
    public void affecterOrdinateur()
    {
        
    }
    
    
}
