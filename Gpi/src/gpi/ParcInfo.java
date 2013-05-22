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
public class ParcInfo implements Serializable {

	private static final long serialVersionUID = 00001L;
	private DefaultListModel batiments;
	
	public DefaultListModel salles;

	public ParcInfo() {
		this.batiments = new DefaultListModel();
		this.salles = new DefaultListModel();
	}

	public ParcInfo(DefaultListModel batiments) {
		this.batiments = batiments;
	}

	public DefaultListModel getBatiments() {
		return batiments;
	}

	public void ajouterNouvelleSalle(Batiment batiment, Salle salle) {
		int index = this.batiments.indexOf(batiment);
		
		((Batiment)this.batiments.getElementAt(index)).ajouterSalle(salle);
	}
}
