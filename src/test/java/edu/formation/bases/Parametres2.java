package edu.formation.bases;

public class Parametres2 {

  public static void main(String[] args) {
    // déclarations
    int a;
    int b;
    // affectations
    a = 1;
    b = 2;
    // affiche a+b
    affiche(a, b);

  }

  /**
   * Affiche la somme de deux entiers passés en paramètres
   */
  public static void affiche(int a, int b) {
    int c = a + b;
    System.out.println(c);
  }

}
