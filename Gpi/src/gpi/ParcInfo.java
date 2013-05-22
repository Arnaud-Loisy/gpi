/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gpi;

import java.io.Serializable;
import javax.swing.DefaultListModel;

/**
 *
 * @author darkey
 */
public class ParcInfo implements Serializable{
    
    private DefaultListModel batiment;
    private static final long serialVersionUID = 00001L;

    public DefaultListModel getBatiment() {
        return batiment;
    }

    public void setBatiment(DefaultListModel batiment) {
        this.batiment = batiment;
    }
    
    
    
    
}
