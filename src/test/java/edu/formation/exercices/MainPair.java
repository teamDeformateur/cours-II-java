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
    boolean pair = true;
    for (int i = 0; i <= 1000; i++) {
      if (pair) {
        System.out.print(i + ",");
      }
      // utilisation d'un bascule qui sera vrai une fois sur deux
      pair = !pair;
    }
  }
}
