package edu.formation.exercices;

/**
 * Utilisation d'un if imbriqué dans un for.
 * @author seme
 *
 */
public class MainPair {
  /**
   * Méthode principale.
   * Affiche tous les nombres pairs de 0 à 1000.
   * @param args
   */
  public static void main(String[] args) {
    // boucle 
    for (int i = 0; i <= 1000; i++) {
      // si i est pair (le reste de la division par 2 est égal à 0)
      if (i % 2 == 0) {
        // j'affiche i
        System.out.print(i + ",");
      }
    }
  }
}
