package edu.formation.bases;

public class MainPrimitives {

  public static void main(String[] args) {
    /*
     * Déterminer quels types utiliser pour les valeurs suivantes : 
     * - f 
     * - 3 
     * - 128 
     * - PI avec 16 décimales 
     * - true 
     * - le nombre d'octets dans 1Tio 
     * Déclarer et initialiser les variables qui contiendront les valeurs.
     * Afficher chacune de ces valeurs.
     */
    char f = 'f';
    byte trois = 3;
    short cvh = 128;
    float pi = 3.141_592_653_589_7932f;
    boolean bool = true;
    // 1 kio = 1024 o
    // 1 Mio = 1024 *1024 o
    // 1Gio = 1024 * 1024 * 1024 o
    // 1Tio = 1024 * 1024 * 1024 * 1024 o
    long tera = 1_099_511_627_776L;

    System.out.println(f);
    System.out.println(trois);
    System.out.println(cvh);
    System.out.println(pi);
    System.out.println(bool);
    System.out.println(tera);

  }

}
