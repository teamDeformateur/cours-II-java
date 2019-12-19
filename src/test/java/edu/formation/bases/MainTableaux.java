package edu.formation.bases;

/**
 * Exemple d'utilisation de tableaux.
 * 
 * @author seme
 *
 */
public class MainTableaux {

  /**
   * Méthode principale. Affiche le contenu d'un tableau de 10 entiers.
   * 
   * @param args
   */
  public static void main(String[] args) {
    // déclaration puis initialisation des élements du tableau d'entiers
    int[] tableau = {9, 7, 12, 15, 27, 43, 22, 69, 66, 0, 54};
    // parcourir les éléments du tableau
    for (int indice = 0; indice < tableau.length; indice++) {
      System.out.print(tableau[indice] + ", ");
    }
  }

}
