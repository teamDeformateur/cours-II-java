package edu.formation.exercices;

public class Factorielle {
  public static int factorielleIter(int valeur) {
    int res = 1;
    for (int i = 1; i <= valeur; i++) {
      res *= i;
    }
    return (res);
  }

  public static int factorielleRec(int valeur) {
    if (valeur == 0) {
      return 1;
    } else {
      return factorielleRec(valeur - 1) * valeur;
    }
    // 5! = 5*4!
    // 4! = 4*3*2*1
  }

  public static void main(String args[]) {
    // appeler la méthode factorielle(?)
    int res;
    // res = factorielleIter(......);
    // res = factorielleRec(......);
    int valeur = 5;
    // res = factorielleIter(valeur);
    res = factorielleRec(valeur);
    System.out.println(valeur + "! = " + res);
  }

}
