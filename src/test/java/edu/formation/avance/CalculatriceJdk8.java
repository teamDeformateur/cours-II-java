package edu.formation.avance;

public class CalculatriceJdk8 {
  
  interface Operation{
    int calculer(int a, int b);
  }
  
  public static void main(String[] args) {
    Operation ajouter = (x, y) -> x + y;
    Operation multiplier = (x, y) -> x * y;
    
    System.out.println(ajouter.calculer(1,2));
    System.out.println(multiplier.calculer(1,2));

  }

}
