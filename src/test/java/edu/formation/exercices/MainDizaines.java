package edu.formation.exercices;

/**
 * Utilisation d'un if imbriqué dans un for.
 * @author seme
 *
 */
public class MainDizaines {
  /**
   * Méthode principale.
   * Affiche tous les nombres pairs de 0 à 1000.
   * @param args
   */
  public static void main(String[] args) {
    int i = 100;
    while(i >= 0) {
      System.out.print(i + ", ");
      i-=10;
    }
  }
}
