/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gpi;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jeremy
 */
public class Sauvegarde {
        /**
         * Classe permettant de sauvegarder le parc informatique via la serialization
         * @param parcInfo le parc informatique à sauvegarder
         * @param nomFichier le fichier dans lequel sera sauvegardé le parc informatique
         */
	public static void sauvegarder(ParcInfo parcInfo, String nomFichier) {
		FileOutputStream fluxFichier = null;
		try {
			fluxFichier = new FileOutputStream(nomFichier);

			// création d'un "flux objet" avec le flux fichier
			ObjectOutputStream fluxObjet = new ObjectOutputStream(fluxFichier);

			// sérialisation : écriture de l'objet dans le flux de sortie
			fluxObjet.writeObject(parcInfo);

			// on vide le tampon
			fluxObjet.flush();
			fluxObjet.close();
			fluxFichier.close();

		} catch (FileNotFoundException ex) {
			Logger.getLogger(Sauvegarde.class.getName()).log(Level.SEVERE, null, ex);
		} catch (IOException ex) {
			Logger.getLogger(Sauvegarde.class.getName()).log(Level.SEVERE, null, ex);
		} finally {
			try {
				fluxFichier.close();
			} catch (IOException ex) {
				Logger.getLogger(Sauvegarde.class.getName()).log(Level.SEVERE, null, ex);
			}
		}
	}
        /**
         * Charge un parc informatique précédemment sauvegardé dans un fichier
         * @param nomFichier le nom du fichier de sauvegarde à charger
         * @return parcInfo le parc informatique chargé depuis le fichier de sauvegarde
         */
	public static ParcInfo charger(String nomFichier) {
		FileInputStream fluxFichier = null;
		ParcInfo parcInfo = null;
		try {
			// création d'un "flux fichier"
			fluxFichier = new FileInputStream(nomFichier);
			
			// création d'un "flux objet" avec le flux fichier
			ObjectInputStream fluxObjet = new ObjectInputStream(fluxFichier);
			
			// désérialisation : lecture de l'objet depuis le flux d'entrée
			parcInfo = (ParcInfo) fluxObjet.readObject();	
			fluxObjet.close();
			fluxFichier.close();		
		} catch (FileNotFoundException ex) {
			Logger.getLogger(Sauvegarde.class.getName()).log(Level.SEVERE, null, ex);
		} catch (IOException ex) {
			Logger.getLogger(Sauvegarde.class.getName()).log(Level.SEVERE, null, ex);
		} catch (ClassNotFoundException ex) {
			Logger.getLogger(Sauvegarde.class.getName()).log(Level.SEVERE, null, ex);
		} finally {
			try {
				fluxFichier.close();
			} catch (IOException ex) {
				Logger.getLogger(Sauvegarde.class.getName()).log(Level.SEVERE, null, ex);
			}
		}
		
		return parcInfo;
	}
}
