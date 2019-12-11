package edu.formation.bases;

import java.util.Scanner;

/**
 * Exemple d'utilisation d'un switch. Donne à partir d'un chiffre, le numéro de la semaine
 * correspondant.
 * 
 * @author seme
 *
 */
public class MainSwitch {

  /**
   * Méthode principale
   * @param args
   */
  public static void main(String[] args) {
    
    System.out
        .print("Donner un nombre et je vous donnerai le jour de la semaine correspondant ! :");

    Scanner clavier = new Scanner(System.in);
    int nb = clavier.nextInt();

    switch (nb) {
      case 1:
        System.out.println("Lundi");
        break;
      case 2:
        System.out.println("Mardi");
        break;
      case 3:
        System.out.println("Mercredi");
        break;
      case 4:
        System.out.println("Jeudi");
        break;
      case 5:
        System.out.println("Vendredi");
        break;
      case 6:
        System.out.println("Samedi");
        break;
      case 7:
        System.out.println("Dimanche");
        break;
      default:
        System.out.println("Les jours de la semaine vont de 1 à 7 !");
        break;

    }
    clavier.close();
  }

}
