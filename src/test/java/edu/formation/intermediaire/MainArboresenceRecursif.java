/**
 *
 */
package edu.formation.intermediaire;

import java.io.File;

/**
 * @author Seme
 *
 */
public class MainArboresenceRecursif {

  public static void afficherContenu(File dossierParent, String indentation) {
    // on récupère la liste des élements
    String[] listeDesElements = dossierParent.list();
    // Si la liste n'est pas null
    if (listeDesElements != null) {
      // on parcourt tous les éléments
      for (int i = 0; i < listeDesElements.length; ++i) {
        // création du fichier
        File fichier = new File(dossierParent, listeDesElements[i]);
        // Si le fichier existe
        if (fichier.exists()) {
          // si c'est un répertoire
          if (fichier.isDirectory()) {
            System.out.println(indentation + "Dir  : " + fichier.getName());
            System.out.println(indentation + "|");
            afficherContenu(fichier, indentation + "+----");
          } else if (fichier.isFile()) {
            System.out.println(indentation + "File : " + fichier.getName());
          }
        }
      }
    }
  }

  /**
   * @param args
   * @throws Exception
   */
  public static void main(String[] args) {
    // c:\\ sous win
    String racine = "/home/seme/Downloads";
    File rep = new File(racine);
    if (rep.exists()) {
      afficherContenu(rep, "");
    }
  }

}
