package edu.formation.exercices;

import java.util.Scanner;

/**
 * Exemple d'utilisation de blocs conditionnels.
 * 
 * @author seme
 *
 */
public class MainConditions {

  /**
   * Méthode principale. Demande la saisie de deux entiers, puis annonce si leur produit est négatif
   * ou positif.
   * 
   * @param args
   */
  public static void main(String[] args) {
    // déclaration de deux variables qui récupèreront la saisie
    int premier, deuxieme;
    Scanner in = new Scanner(System.in);
    System.out.print("Saisie du premier entier :");
    premier = in.nextInt();
    System.out.print("Saisie du deuxième entier :");
    deuxieme = in.nextInt();
    // si les deux entiers sont positifs ou négatifs
    if ((premier > 0 && deuxieme > 0) || (premier < 0 && deuxieme < 0))
      // positif
      System.out.println("Le produit de " + premier + " et " + deuxieme + " est positif.");
    else
      System.out.println("Le produit de " + premier + " et " + deuxieme + " est négatif.");
  }

}
