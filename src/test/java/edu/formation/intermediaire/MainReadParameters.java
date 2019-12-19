/**
 *
 */
package edu.formation.intermediaire;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * Lire des paramètres à partir d'un fichier puis les retranscrire dans un autre. 
 * Résultats attendus :
 * 
 * Paramètre : <nom du paramètre>
 * Valeur : <valeur du paramètre>
 * 
 * etc.
 * 
 * @author Seme
 *
 */
public class MainReadParameters {

  /**
   * @param args
   * @throws Exception
   */
  public static void main(String[] args) {
    try {
      File f1 = new File("src/main/resources/fichier1.txt");
      BufferedReader br = new BufferedReader(new FileReader(f1));
      File f2 = new File("src/main/resources/fichier2.txt");
      BufferedWriter bw = new BufferedWriter(new FileWriter(f2));
      String ligne;
      while ((ligne = br.readLine()) != null) {
        String[] paramValeur = ligne.split("=");
        // que contient paramValeur[0] ? Le nom du premier paramètre
        // que contient paramValeur[1] ? La valeur de mon paramètre
        String resultat = "Paramètre : " + paramValeur[0];
        String resultat2 = "Valeur    : " + paramValeur[1];
        bw.write(resultat);
        bw.newLine();
        bw.write(resultat2);
        bw.newLine();
        bw.newLine();
      }
      br.close();
      bw.close();
    } catch (Exception e) {
      System.out.print(e.getMessage());
    }
  }// fin de la méthode main
}// fin de la classe
