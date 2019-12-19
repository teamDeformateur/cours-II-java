/**
 *
 */
package edu.formation.intermediaire;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import edu.formation.exception.BananeException;
import edu.formation.exception.NotAnIntegerResultException;

/**
 * Gestion personnalisée d'exceptions avec lecture du paramètre DEBUG à partir d'un fichier.
 * @author Seme
 *
 */
public class MainSaisieException {

  public static int calcul(int a, int b) throws BananeException, NotAnIntegerResultException {
    // si le dénominateur est égale à 1
    if (b == 1) {
      // diviser ne sert à rien ! => on lève une exception métier
      throw new BananeException("Eh banane ! Diviser par 1 ne sert à rien.");
    }
    int c = a / b;
    // si le résultat de la division euclidienne est différent de zéro
    if (a % b != 0) {
      // le résultat de la division n'est pas un entier
      throw new NotAnIntegerResultException("Le résultat n'est pas un entier !");
    }
    return c;
  }

  /**
   * @param args
   * @throws Exception
   */
  public static void main(String[] args) {
    // le booléen debug qui passe à vrai si l'argument DEBUG
    // a été passé en paramètre du main (du programme principal)
    boolean debug = false;
    String ligne;
    // tests de robustesse
    File f1 = new File("src/main/resources/fichier1.txt");
    try {
      BufferedReader br = new BufferedReader(new FileReader(f1));
      while ((ligne = br.readLine()) != null) {
        String[] paramValeur = ligne.split("=");
        if (paramValeur[0].equals("Debug") && paramValeur[1].equals("True")) {
          debug = true;
        }
      }
      br.close();
    } catch (FileNotFoundException e1) {
      e1.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
    int resultat = 0;
    boolean erreur = true;
    boolean saisieIncorrecte = false;
    // Scanner clavier = new Scanner(System.in);
    Scanner clavier = null;
    do {
      try {
        // on instancie à chaque fois le scanner
        clavier = new Scanner(System.in);
        // on initialise les deux booléens
        // pour l'instant, la saisie est correcte
        saisieIncorrecte = false;
        // il n'y a pas eu d'erreur
        erreur = false;
        System.out.print("Donner a:");
        int a = clavier.nextInt();
        System.out.print("Donner b:");
        int b = clavier.nextInt();
        // on lance le calcul
        resultat = calcul(a, b);
      } catch (ArithmeticException arE) {
        // si division par zéro, il y a eu une erreur
        erreur = true;
        System.out.println("Division par zéro ! Veuillez saisir une nouvelle fois.");
      } catch (BananeException e) {
        // Si on divise par 1
        // Si je suis en mode DEBUG
        if (debug) {
          // J'affiche la pile d'exécution
          e.printStackTrace();
          // sinon
        } else {
          // J'affiche juste le message
          System.out.println(e.getMessage());
        }
        erreur = true;
      } catch (InputMismatchException inpE) {
        // la saisie est incorrecte
        saisieIncorrecte = true;

        System.out.println("Saisie incorrecte. Veuillez saisier un entier.");
      } catch (NotAnIntegerResultException e) {
        // si le résultat de la division n'est pas un entier
        System.out.println(e.getMessage());
        erreur = true;
      } finally {
        // on vide le scanner
        clavier.reset();
        System.out.println("J'ai réinitialisé le scanner.");
      }
      // tant qu'il y a des erreurs
    } while (erreur || saisieIncorrecte);
    // on ferme le scanner
    clavier.close();
    System.out.println("Resultat=" + resultat);
  }

}
