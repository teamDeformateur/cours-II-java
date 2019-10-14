package edu.formation.polymorphisme;

public class DateHistorique extends Date {

  private String description;

  /**
   * 
   * @param annee
   * @param mois
   * @param jour
   * @param newDescription
   */
  public DateHistorique(int annee, int mois, int jour, String newDescription) {
    super(annee, mois, jour);
    // this.description = new String(vDescription);
    this.description = newDescription;
  }

  public void methodePropreADateHistorique() {
    System.out.println("!!!");
  }

  public void afficherDate() {
    super.afficherDate();
    System.out.println("Description historique : " + this.description);
  }

}
