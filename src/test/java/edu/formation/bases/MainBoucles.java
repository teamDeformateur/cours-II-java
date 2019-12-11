package edu.formation.bases;

import java.util.Scanner;

public class MainBoucles {

  public static void main(String[] args) {
    /*
     * Boucle while
     */
    // déclaration d'une variable i
    int i;
    // initialisation à 0
    i = 0;
    // tant que i est inférieur strictement à 10
    while (i < 10) {
      // affiche la valeur de i
      System.out.println("i = " + i);
      // incrémenter i
      i++;
    }


    /*
     * Boucle do while
     */
    i = 0;
    do {
      // exécuter des instructions
      System.out.println("i = " + i);
      i++;
    } while (i < 10);

    // Exemple de saisie d'un utilisateur
    Scanner monScanneur = new Scanner(System.in);
    int saisie;
    do {
      System.out.print("Saisir une valeur entre 1 et 7 : ");
      // intialisation de saisie
      saisie = monScanneur.nextInt();
    } // tant que la saisie est incorrecte
    while (saisie < 1 || saisie > 7);
    System.out.println("Suite du traitement...");


    /*
     * Boucle for
     */
    for (int j = 0; j < 10; j++) {
      System.out.println("j = " + j);
    }

  }

}
