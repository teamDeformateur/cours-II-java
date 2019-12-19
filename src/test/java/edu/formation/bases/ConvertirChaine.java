package edu.formation.bases;
/**
 * Conversion de chaînes de caractères.
 * @author seme
 *
 */
public class ConvertirChaine {

  /**
   * Conversion d'une chaîne en minuscule.
   * @param ch1 Chaîne à convertir
   * @return La chaîne en minuscule
   */
  public static String convertirMinuscule(String ch1) {
    char caractere;
    int indice;
    String resultat;

    resultat = ch1;
    indice = 0;
    while (indice < resultat.length()) {
      caractere = resultat.charAt(indice);
      if (caractere >= 'A' && caractere <= 'Z') {
        caractere = (char) (caractere + ('a' - 'A'));
        // première méthode
        char[] tmp = resultat.toCharArray();
        tmp[indice] = caractere;
        resultat = String.valueOf(tmp);
      }
      indice = indice + 1;
    }
    return resultat;
  }

  /**
   * Méthode principale de test
   * @param args
   */
  public static void main(String[] args) {
    String ch1;
    String ch2;
    ch1 = "DuPoNd";
    ch2 = ConvertirChaine.convertirMinuscule(ch1);

    System.out.println(ch2);
  }

}
