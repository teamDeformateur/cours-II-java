package edu.formation.exercices;

import java.util.Scanner;

/**
 * @author Seme
 *
 */
public class MainGuirlande {

  /**
   * @param args
   */
  public static void main(String[] args) {
    // 1 VARIABLES
    // 2 guirlande EST_DU_TYPE LISTE
    int[] guirlande;
    // 3 taille_guirlande EST_DU_TYPE NOMBRE
    int tailleGuirlande;
    // 4 i EST_DU_TYPE NOMBRE
    int i;
    // 5 tour EST_DU_TYPE NOMBRE
    int tour;
    // 6 compteur EST_DU_TYPE NOMBRE
    int compteur;
    // 7 iteration_compteur EST_DU_TYPE NOMBRE
    int iterationCompteur;

    // 9 taille_guirlande PREND_LA_VALEUR -1
    tailleGuirlande = -1;
    // 10 i PREND_LA_VALEUR 0
    i = tour = compteur = iterationCompteur = 0;
    // 11 tour PREND_LA_VALEUR 0
    // 12 compteur PREND_LA_VALEUR 0

    // 13 TANT_QUE (taille_guirlande<=0) FAIRE
    while (tailleGuirlande < 5) {
      // 14 DEBUT_TANT_QUE
      // 15 LIRE taille_guirlande
      Scanner lecteur = new Scanner(System.in);
      System.out.println("Veuillez saisir la taille de la guirlande : ");
      // je lis l'entier au clavier
      tailleGuirlande = lecteur.nextInt();
      // 16 SI (taille_guirlande<=0) ALORS
      if (tailleGuirlande < 5) {
        // 17 DEBUT_SI
        // 18 AFFICHER "La taille de la guirlande doit etre d'au moins
        // 1"
        System.err.println("La taille de la guirlande doit être d'au moins 5");
        // 19 FIN_SI
      }
      // 20 FIN_TANT_QUE
    }

    // allocation de l'espace mémoire pour la guirlande
    guirlande = new int[tailleGuirlande];

    // 25 POUR tour ALLANT_DE 0 A 100
    for (tour = 0; tour <= 100; ++tour) {
      // 26 DEBUT_POUR
      // 27 guirlande[compteur] PREND_LA_VALEUR 1
      guirlande[compteur] = 1;
      // 28 POUR i ALLANT_DE 0 A taille_guirlande-1
      for (i = 0; i <= tailleGuirlande - 1; ++i) {
        // 29 DEBUT_POUR
        System.out.print(guirlande[i]);
        // 30 AFFICHER guirlande[i]
        // 31 FIN_POUR
      }
      // 32 AFFICHER " "
      System.out.println();
      // 33 guirlande[compteur] PREND_LA_VALEUR 0
      guirlande[compteur] = 0;
      // 34 SI (compteur==taille_guirlande-1) ALORS
      if (compteur == tailleGuirlande - 1) {
        iterationCompteur = -1;
        // 35 DEBUT_SI
        // 36 iteration_compteur PREND_LA_VALEUR -1
        // 37 FIN_SI
      }
      // 38 SI (compteur==0) ALORS
      if (compteur == 0) {
        // 39 DEBUT_SI
        iterationCompteur = 1;
        // 40 iteration_compteur PREND_LA_VALEUR 1
        // 41 FIN_SI
      }
      compteur = compteur + iterationCompteur;
      // 42 compteur PREND_LA_VALEUR compteur+iteration_compteur
      // 43 FIN_POUR
    }
    // 44 FIN_ALGORITHME
  }

}
