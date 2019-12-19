/**
 *
 */
package edu.formation.intermediaire;

import java.io.File;
import java.io.PrintStream;

/**
 * @author Seme
 *
 */
public class MainArborescenceSimple {

  /**
   * @param args
   * @throws Exception
   */
  public static void main(String[] args) {
    // Sortie standard
    PrintStream console = System.out;
    // Format de la chaîne d'affichage
    String fmt = "%1$-5s: %2$-30s ";
    // le répertoire racine que l'on veut explorer (c:/ sous Win)
    String racine = "/";
    // pointeur vers la racine
    File rep = new File(racine);
    // si le répertoire existe
    if (rep.exists()) {
      // je récupère la liste de ses élements
      String[] listeDesElements = rep.list();
      // pour chacun des éléments de la liste
      for (int i = 0; i < listeDesElements.length; ++i) {
        // pointeur vers l'élément i de la liste
        File fichier = new File(rep, listeDesElements[i]);
        // si le fichier existe
        if (fichier.exists()) {
          // si c'est un répertoire
          if (fichier.isDirectory()) {
            // J'affiche Dir et le nom du répertoire
            console.printf(fmt, "Dir", fichier.getName());
            // sinon si c'est un fichier
          } else if (fichier.isFile()) {
            // J'affiche le nom du fichier
            console.printf(fmt, "File", fichier.getName());
          }
          // Afficher la taille du fichier ou du répertoire
          console.printf("%s %s%s%n", "Taille : ", fichier.length() / 1024, "ko");
        } // fin si le fichier existe
      } // fin pour
    } // fin si racine existe
  }// fin de la méthode main
}// fin de la classe
