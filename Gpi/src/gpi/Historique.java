/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gpi;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author darkey
 */
public class Historique implements Serializable {

    public Historique(String Action, Date date) {
        this.Action = Action;
        this.date = date;
    }
    private String Action;
    private Date date;

    public String getAction() {
        return Action;
    }

    public void setAction(String Action) {
        this.Action = Action;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
