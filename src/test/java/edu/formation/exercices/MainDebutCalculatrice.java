package edu.formation.exercices;

import java.util.Scanner;

/**
 * Exemple de récupération de saisie utilisateur.
 * 
 * @author seme
 *
 */
public class MainDebutCalculatrice {
  /**
   * Méthode principale. Demande la saisie de deux entiers. Calcule leur somme, leur différence,
   * leur produit, leur division, le reste de la division.
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
    // Calcul et affichage des résultats en simultané
    System.out.println("Additionnés : " + (premier + deuxieme));
    System.out.println("Soustraits : " + (premier - deuxieme));
    System.out.println("Multipliés : " + (premier * deuxieme));
    System.out.println("Divisés : " + ((float) premier / deuxieme));
    System.out.println("Reste : " + (premier % deuxieme));
  }

}
