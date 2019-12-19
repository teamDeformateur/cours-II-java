package edu.formation.bases;

/**
 * Exemples d'utilisation d'opérateurs.
 * +=, -=, *=, ++, --
 * @author seme
 *
 */
public class MainOperateurs {

  /**
   * Méthode principale.
   * @param args
   */
  public static void main(String[] args) {
    int i = 0;
    i += 1;
    // i == 1
    i -= 12;
    // i == -11
    i *= 2;
    // i == -22
    i++;
    // i == -21
    i--;
    // i == -22
    ++i;
    // i == -21
    System.out.println(i);
  }

}
