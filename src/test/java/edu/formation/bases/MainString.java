package edu.formation.bases;

/**
 * Exemple d'utilisation de la classe String.
 * 
 * @author seme
 *
 */
public class MainString {
  /**
   * Méthode principale. Transforme la chaîne en tableau de caractères puis affiche le contenu du
   * tableau.
   * 
   * @param args
   */
  public static void main(String[] args) {
    // déclare ta variable 'chaine' de type String
    String chaine;
    // je mets la valeur "bienvenue" dans la variable
    chaine = "bienvenue";
    System.out.println(chaine);
    // déclaration de la variable 'chaineTableau' de type tableau de caractères
    char[] chaineTableau;
    // transformation de la String en tableau de caractères
    chaineTableau = chaine.toCharArray();
    // afficher caractère par caractère
    for (int i = 0; i < chaineTableau.length; i++) {
      // on récupère le caractère
      char caractere = chaineTableau[i];
      // on l'affiche
      System.out.print(caractere + ", ");
    }
  }

}
