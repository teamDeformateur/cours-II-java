package edu.formation.polymorphisme;
public class DateHistorique extends Date {
	
	private String description;

	public DateHistorique(int vAnnee, int vMois, int vJour, String vDescription) {
		super(vAnnee, vMois, vJour);
		//this.description = new String(vDescription);
		this.description = vDescription;
	}
	
	public void methodePropreADateHistorique(){
	    System.out.println("!!!");
	}
	
	public void afficherDate(){
		super.afficherDate();
		System.out.println("Description historique : "+this.description);
	}

}
