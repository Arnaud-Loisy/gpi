/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gpi;

import java.util.Date;

/**
 *
 * @author Arnaud Loisy
 */
public class Historique {
    /**
     * 
     * @param action une chaine contenant le type d'action à tracer dans l'historique
     * @param date la date de l'action effectuée
     */
    public Historique(String action, Date date) {
        this.action = action;
        this.date = date;
    }
    
    private String action;
    private Date date;
/**
 * 
 * @return la type d'une action 
 */
    public String getAction() {
        return action;
    }
/**
 * parametre le type d'une action
 * @param Action 
 */
    public void setAction(String Action) {
        this.action = Action;
    }
    /**
     * 
     * @return la date d'une action
     */
    public Date getDate() {
        return date;
    }
    /**
     * paramettre la date d'une action
     * @param date 
     */
    public void setDate(Date date) {
        this.date = date;
    }
    
    
    
}
