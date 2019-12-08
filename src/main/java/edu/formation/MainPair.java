package edu.formation;

/**
 * Affiche les nombre pairs
 * @author seme
 *
 */
public class MainPair {
  /**
   * Méthode principale
   * @param args
   */
  public static void main(String[] args) {
    boolean pair = true;
    for (int i = 0; i < 500; i++) {
      if (pair) {
        System.out.print(i + ",");
      }
      pair = !pair;
    }
  }
}
