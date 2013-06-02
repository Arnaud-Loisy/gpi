/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gpi;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Arnaud
 */
public class Historique implements Serializable {
        
	private static final long serialVersionUID = 12L;
    public Historique(String Action, Date date) {
        this.Action = Action;
        this.date = date;
    }
    
    private String Action;
    private Date date;
    /**
     * renvoie le descriptif d'un evènement dans l'historique d'un ordinateur
     * @return Action la chaine décrivant l'action effectuée 
     */
    public String getAction() {
        return Action;
    }
    /**
     * définit l'action effectuée d'un evènement sur un ordinateur
     * @param Action la chaine décrivant l'action effectuée 
     */
    public void setAction(String Action) {
        this.Action = Action;
    }
    /**
     * renvoie la date d'un evènement dans l'historique d'un ordinateur
     * @return date la date d'une action effectuée
     */
    public Date getDate() {
        return date;
    }
    /**
     * définit la date d'un evènement dans l'historique d'un ordinateur
     * @param date la date d'une action effectuée
     */
    public void setDate(Date date) {
        this.date = date;
    }
}
